package com.cursoceat.proyectomusica;
import com.cursoceat.proyectomusica.Notas;
import com.cursoceat.proyectomusica.Piano;
import com.cursoceat.proyectomusica.Instrumento;
public class Controlador {

	public static void main(String[] args) {
	Notas cancion[]= {Notas.DO,Notas.RE,Notas.MI,Notas.FA,Notas.SOL,Notas.LA,Notas.SI};
	Piano p = new Piano();
	for (Notas notas : cancion) {
		p.add(notas);
	}
		
		p.interpretar();	
		
		
			}

		}

	


