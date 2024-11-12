import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Damião");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("-- Pós incrição - Damião --");
        System.out.println("Conteudos Inscritos " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("-- Pós conclusão - Damião --");
        System.out.println("Conteudos Inscritos " + dev1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());


        Dev dev2 = new Dev();
        dev1.setNome("Tarcísio");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("-- Pós incrição - Tarcísio --");
        System.out.println("Conteudos Inscritos " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-- Pós conclusão - Tarcísio --");
        System.out.println("Conteudos Inscritos " + dev2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}