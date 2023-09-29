package pt.c08componentes.s01chartseq.Lab4.Tarefa01.chart;

public class BarChart {
   private boolean filled;
   private char character;
   
   public BarChart(boolean filled, char character) {
      this.filled = filled;
      this.character = character;
   }

   public void plot(int value) {
      for (int v = 1; v < value; v++)
         System.out.print((filled) ? character : ' ');
      System.out.println(character);
   }
}
