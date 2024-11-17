package com.example.a3ms.service;

import com.example.a3ms.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.a3ms.repository.ReservationRepository;
import com.example.a3ms.exception.ReservationNotFoundException;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    private final Queue<Reservation> reservationQueue = new LinkedList<>();

    // Adiciona uma nova reserva à fila
    public void addReservationToQueue(Reservation reservation) {
        reservationQueue.offer(reservation);
    }

    // Retorna a próxima reserva na fila
    public Reservation nextReservationInQueue() {
        return reservationQueue.poll();
    }

    // Retorna todas as reservas
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    // Busca uma reserva por ID
    public Reservation findById(Long id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new ReservationNotFoundException(id));
    }

    // Salva uma nova reserva
    public Reservation save(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    // Atualiza uma reserva existente
    public Reservation updateReservation(Long id, Reservation updatedReservation) {
        return reservationRepository.findById(id).map(reservation -> {
            reservation.setBook(updatedReservation.getBook());
            reservation.setUser(updatedReservation.getUser());
            reservation.setWithdrawDate(updatedReservation.getWithdrawDate());
            reservation.setDevolutionDate(updatedReservation.getDevolutionDate());
            return reservationRepository.save(reservation);
        }).orElseThrow(() -> new ReservationNotFoundException(id));
    }

    // Deleta uma reserva por ID
    public void deleteById(Long id) {
        if (!reservationRepository.existsById(id)) {
            throw new ReservationNotFoundException(id);
        }
        reservationRepository.deleteById(id);
    }
}

