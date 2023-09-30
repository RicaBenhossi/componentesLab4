package pt.c08componentes.s01chartseq.Lab4.Tarefa01.sequence;

import pt.c08componentes.s01chartseq.Lab4.Tarefa01.chart.BarChart;

public class SecondDegree {
   private int x, independente;
   private BarChart output;

   public SecondDegree(int x, int independente) {
      this.x = x;
      this.independente = independente;
      this.output = null;
   }
    
   public void connect(BarChart output) {
      this.output = output;
   }

   public void present() {
      if (output != null) {
         int y = (int) Math.pow((double) x, 2.0) + independente;
         if (y < x) {
            for (int s = y; s <= x; s++) {
               output.plot(s);
            }
            for (int i = x; i >= y; i--) {
               output.plot(i);
            }
         }
         else
         {
            for (int s = y; s >= x; s--) {
               output.plot(s);
            }
            for (int i = x +1; i <= y; i++) {
               output.plot(i);
            }
         }
      }
   }
}
