package com.ucreativa.vacunacion.repositories;

import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Persona;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

public class FileRepository implements Repository {

    private List<BitacoraVacunas> db;

    public FileRepository() {
        this.db = new ArrayList<>();
    }

    ;

    @Override
    public void save(Persona persona, String marca, Date fecha) {
        this.db.add(new BitacoraVacunas(persona, marca, fecha));

    }

    @Override
    public List<String> get() throws IOException {
        FileWriter archivoDatos = new FileWriter("C:/Users/jacuna.CMC/Desktop/U/3bimestre/datos/datos.txt");
        SimpleDateFormat format = new SimpleDateFormat("DD-MM-YYYY");

        for (BitacoraVacunas x : db) {
            archivoDatos.write(x.getPersona().getNombre() + " " + x.getMarca() + " " + format.format(x.getFecha()));

        }
    archivoDatos.close();
        return null;
    }
}
