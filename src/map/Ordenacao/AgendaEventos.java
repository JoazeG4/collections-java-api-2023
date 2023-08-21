package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private final Map<LocalDate, Eventos> agendaEventosMap = new HashMap<>();

    public AgendaEventos() {
    }

    public void adicionarEventos(LocalDate data, String nome, String atracao){
        agendaEventosMap.put(data, new Eventos(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate now = LocalDate.now();
        Map<LocalDate, Eventos> eventosTreeMap = new TreeMap<>(agendaEventosMap);
        for (Map.Entry<LocalDate, Eventos> entry : eventosTreeMap.entrySet()){
            if(entry.getKey().equals(now) || entry.getKey().isAfter(now)){
                System.out.println("O proximo evento: " + entry.getValue() + " acontecerá na data: " + entry.getKey());
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEventos(LocalDate.of(2023, 8, 19), "Evento1", "Atração1");
        agendaEventos.adicionarEventos(LocalDate.of(2023, Month.NOVEMBER, 1), "Evento2", "Atração2");
        agendaEventos.adicionarEventos(LocalDate.of(2023, 10, 15), "Evento3", "Atração3");
        agendaEventos.adicionarEventos(LocalDate.of(2023, Month.SEPTEMBER, 25), "Evento4", "Atração4");
        agendaEventos.adicionarEventos(LocalDate.of(2023, Month.AUGUST, 21), "Evento5", "Atração5");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();
    }
}
