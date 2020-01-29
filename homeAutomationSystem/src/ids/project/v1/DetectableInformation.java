package ids.project.v1;
/**
 * La classe DetectableInformation suddivide il tipo di informazione rilevata da una determinata categoria di sensori in due tipi:
 * grandezza fisica a sensore semplice on/off (aperto chiuso). Essi sono identificati dagli attributi booleani phisicalDimension e onOff i quali 
 * non posssono valere entrambi true contemporaneamente.
 * @author bobby
 *
 */

public class DetectableInformation {
	
		private String name;
		private boolean physicalDimension;
		private boolean onOff;
		private boolean dimensional;
		private String symbol;
		
		public static final String PERCENT="'%";
		
		/**
		 * Costruttore di default
		 */
		public DetectableInformation() {
			super();
		}
		
		/**
		 * Costruttore di un oggetto DetectableInformation che prende come parametri nome e tipo informazione
		 * @param name
		 * @param physicalDimension se quest'ultimo vale "true", onOff vale "false" e viceversa
		 */
		public DetectableInformation(String name, boolean physicalDimension) {	
			this.name=name;
				this.physicalDimension=physicalDimension;
				if (physicalDimension==true) 
					this.onOff=false;
				else if(physicalDimension==false)
					this.onOff=true;
			this.dimensional=false;
			this.symbol=null;
		}
		
		/**
		 * 
		 * @return name
		 */
		public String getName() {
			return this.name;
		}
		
		/**
		 * N.B. verifica lunghezza stringa
		 * @param name
		 */
		public void setName(String name) {
			this.name=name;
		}
		
		/**
		 * 
		 * @return physicalDimension
		 */
		public boolean isPhysicalDimensionType() {
			return physicalDimension;
		}
		
		/**
		 * 
		 * @return onOff
		 */
		public boolean isOnOffType() {
			return onOff;
		}
		
		/**
		 * 
		 * @return dimensional
		 */
		public boolean isDimensional() {
			return dimensional;
		}
		
		/**
		 * 
		 * @param dimensional
		 */
		public void setDimensional(boolean dimensional) { //verificare che sia grandezzafisica prima???
			if (dimensional==false)
				this.symbol=PERCENT;
		}
		
		/**
		 * 
		 * @param symbol
		 */
		public void setSymbol(String symbol) { //verificare che sia grandezzafisica prima???
			if (this.dimensional==true)
				this.symbol=symbol;
			else
				System.out.println("non possibile assegnare simbolo a grandezza adimensionale"); //eccezione
		}
		
		/**
		 * 
		 * @return
		 */
		public String getSymbol() {
			return this.symbol;
		}

		@Override
		public String toString() {
			return "DetectableInformation [name=" + name + ", physicalDimension=" + physicalDimension + ", onOff="
					+ onOff + ", dimensional=" + dimensional + ", symbol=" + symbol + "]";
		}
		
		
		
		

		

		
		


		
}
