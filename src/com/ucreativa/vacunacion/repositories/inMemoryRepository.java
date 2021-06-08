package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Persona;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class inMemoryRepository {

    List<BitacoraVacunas> db;

    {
        this.db = new ArrayList<>();
    }

    public void save(Persona persona, String marca, Date fecha) {
        this.db.add(new BitacoraVacunas(persona, marca, fecha));
    }

    public List<String> get() {
        List<String> Lines = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("DD-MM-YYYY");

        for (BitacoraVacunas item : db) {
            Lines.add(item.getPersona().getNombre() + " " + item.getMarca() + " "
                    + format.format(item.getFecha()));


        }
        return Lines;

    }
}