package pt.c08componentes.s01chartseq.Lab4.Tarefa01.sequence;

import pt.c08componentes.s01chartseq.Lab4.Tarefa01.chart.BarChart;

public class QuadraticEquationGraph {
   private int a, b, c;
   private BarChart output;

   public QuadraticEquationGraph(int a, int b, int c) {
      this.a = c;
      this.b = b;
      this.c = c;
      this.output = null;
   }
    
   public void connect(BarChart output) {
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
