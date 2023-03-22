import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso Js");
        curso1.setDescricao("Descrição do curso Js");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Descrição do curso java");

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Daniel:" + devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        System.out.println("-----------");
        System.out.println("Conteúdos Inscritos Daniel" + devDaniel.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Daniel" + devDaniel.getConteudosConcluidos());
        System.out.println("XP: " + devDaniel.calcularTotalXp());
        System.out.println("-----------");

        Dev devPedro = new Dev();
        devPedro.setNome("Pedro");
        devPedro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Pedro:" + devPedro .getConteudosInscritos());
        devPedro.progredir();
        devPedro.progredir();
        devPedro.progredir();
        System.out.println("-----------");
        System.out.println("Conteúdos Inscritos Pedro" + devPedro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Pedro" + devPedro.getConteudosConcluidos());
        System.out.println("XP: " + devPedro.calcularTotalXp());
        System.out.println("-----------");
    }

}