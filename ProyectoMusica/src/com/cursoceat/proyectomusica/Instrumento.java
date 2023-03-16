package com.cursoceat.proyectomusica;
import java.util.Arrays;
import com.cursoceat.proyectomusica.Notas;
	public abstract class Instrumento {
		protected Notas[] melodia; //tabla que lamacena las notas a interpretar
		public Instrumento () {
			melodia = new Notas [0];//creamos la tabla
		}
		//usa el algoritmo de insercion no ordenada
		public void add(Notas n) {
			melodia = Arrays.copyOf(melodia,melodia.length +1);//redimensionamos
			melodia[melodia.length -1]=n;
			
		}
		abstract void interpretar ();//a implementar en dcada subclase


	}

