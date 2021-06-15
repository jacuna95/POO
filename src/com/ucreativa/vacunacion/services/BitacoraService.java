package com.ucreativa.vacunacion.services;

import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.entities.amigo;
import com.ucreativa.vacunacion.repositories.Repository;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class BitacoraService {

    private Repository repository;

    public BitacoraService(Repository repository) {
        this.repository = repository;
    }

    public void save(String nombre, String cedula, String txtEdad,
                     boolean txtRiesgo, boolean txtIsAmigo,
                     String relacion, String facebook, String parentesco,
                     String marca) {
        int edad = Integer.parseInt(txtEdad);
       /* boolean riesgo = txtRiesgo.equals("S");
        boolean isAmigo = txtIsAmigo.equals("S");*/
        Persona persona;

        if (txtIsAmigo) {
            persona = new amigo(nombre, cedula, edad, txtRiesgo, relacion, facebook);
        } else {
            persona = new Familiar(nombre, cedula, edad, txtRiesgo, parentesco);
        }
        this.repository.save(persona, marca, new Date());
    }

    public List<String> get() throws IOException {

        return this.repository.get();
    }
}
