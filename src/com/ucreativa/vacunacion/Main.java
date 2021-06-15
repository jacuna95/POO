package com.ucreativa.vacunacion;


import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.services.BitacoraService;
import com.ucreativa.vacunacion.ui.FrontEnd;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        FrontEnd uiFe = new FrontEnd("Sistema de Vacunación");
        uiFe.build();
    }


}
