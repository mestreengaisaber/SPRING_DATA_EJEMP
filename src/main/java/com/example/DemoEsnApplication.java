package com.example;

//import configuracion.Persona;
//import configuracion.PersonaRepository;
//import configuracion.SpringConfiguracion;
import entidades.Persona;
import repositorios.PersonaRepository;
import configuracion.SpringConfiguracion;
import java.util.List;
//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoEsnApplication {

	public static void main(String[] args) {

              AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(SpringConfiguracion.class);
              //Persona p = new Persona("0001A","Persona3Insertada","Apellido3");
              PersonaRepository pRepositorio= contexto.getBean(PersonaRepository.class);
              //pRepositorio.save(p);
              List <Persona> personas =pRepositorio.findAll();
              if (!personas.isEmpty()){
                   for(Persona persona:personas){
                  System.out.println("Datos bd:  nombre: "+persona.getNombre()+" apellido:"+persona.getApellidos()+" dni: "+persona.getDni());
              }
              }else{
                  System.out.println("del repositorio no hay datos ");
              }
             
              
	}
        
        
}

