package pt.c08componentes.s01chartseq.Lab4.Tarefa01;

import pt.c08componentes.s01chartseq.Lab4.Tarefa01.sequence.SecondDegree;
import pt.c08componentes.s01chartseq.Lab4.Tarefa01.chart.BarChart;


public class AppSecondDegree {
   public static void main(String args[]) {
      BarChart bc = new BarChart(false, '#');
      
      SecondDegree qe = new SecondDegree(3, 2);
      qe.connect(bc);
      
      qe.present();
   }
}
