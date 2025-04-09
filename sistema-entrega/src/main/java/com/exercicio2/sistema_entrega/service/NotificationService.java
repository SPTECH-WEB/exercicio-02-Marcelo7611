package com.exercicio2.sistema_entrega.service;

import com.exercicio2.sistema_entrega.observer.Notificador;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private List<Notificador> notificadores = new ArrayList<>();

    public void adicionarNotificador(Notificador notificador) {
        notificadores.add(notificador);
    }}