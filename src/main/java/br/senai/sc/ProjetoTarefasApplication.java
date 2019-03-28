package br.senai.sc;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.senai.sc.domain.Tarefa;
import br.senai.sc.enums.EstadoTarefa;
import br.senai.sc.repositories.TarefaRepository;


@SpringBootApplication
public class ProjetoTarefasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoTarefasApplication.class, args);
	}

	@Autowired
	private TarefaRepository Repotarefa;
	
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Tarefa tar1 = new Tarefa(null, "Planejamento do evento", sdf.parse("20/03/2018 22:00"),EstadoTarefa.CONCLUIDA);
		Tarefa tar2 = new Tarefa(null, "Locação do Espaço", sdf.parse("04/04/2018 15:00"),EstadoTarefa.PENDENTE);
		Tarefa tar3 = new Tarefa(null, "Convite aos Palestrantes", sdf.parse("01/04/2018 23:00"),EstadoTarefa.PENDENTE);
		Tarefa tar4 = new Tarefa(null, "Abertura das Inscrições", sdf.parse("25/03/2018 08:00"),EstadoTarefa.CONCLUIDA);
		Tarefa tar5 = new Tarefa(null, "Realização do Evento", sdf.parse("20/04/2018 19:00"),EstadoTarefa.PENDENTE);
		
		Repotarefa.save(tar1);
		Repotarefa.save(tar2);
		Repotarefa.save(tar3);
		Repotarefa.save(tar4);
		Repotarefa.save(tar5);
		
		
								
		
	}
}
