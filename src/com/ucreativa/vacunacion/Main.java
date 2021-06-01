package com.ucreativa.vacunacion;

import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.amigo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Familiar mama = new Familiar("marta","1234",42,false,"mama");

        Familiar hermano = new Familiar("jonathan","345",23,false,"hermano");

        amigo compaTrabajo = new amigo("josue","956",26,true,"amigo",
                "JosueGaitan");


       List<BitacoraVacunas> bitacora = new ArrayList<>();
       bitacora.add(new BitacoraVacunas(mama,"pfizer",new Date()));
       bitacora.add(new BitacoraVacunas(hermano,"patito",new Date()));
       bitacora.add(new BitacoraVacunas(compaTrabajo,"patito2",new Date()));

    }

}
