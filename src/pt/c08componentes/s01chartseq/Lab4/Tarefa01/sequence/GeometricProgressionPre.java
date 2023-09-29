package pt.c08componentes.s01chartseq.Lab4.Tarefa01.sequence;

import pt.c08componentes.s01chartseq.Lab4.Tarefa01.chart.BarChart;

public class GeometricProgressionPre {
   private int initial,
               ratio,
               n;
   private BarChart output;

   public GeometricProgressionPre(int initial, int ratio, int n, BarChart output) {
      this.initial = initial;
      this.ratio = ratio;
      this.n = n;
      this.output = output;
   }

   public void present() {
      if (output != null) {
         int value = initial;
         for (int s = 1; s <= n; s++) {
            output.plot(value);
            value *= ratio;
         }
      }
   }
}
