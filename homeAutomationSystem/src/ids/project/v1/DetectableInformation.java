package ids.project.v1;
/**
 * La classe DetectableInformation suddivide il tipo di informazione rilevata da una determinata categoria di sensori in due tipi:
 * grandezza fisica a sensore semplice on/off (aperto chiuso). Essi sono identificati dagli attributi booleani phisicalDimension e onOff i quali 
 * non posssono valere entrambi true contemporaneamente.
 * 
 * @author bobby
 *
 */

public class DetectableInformation {
	
		private String name;
		private boolean physicalDimension;
		private boolean onOff;
		private boolean dimensional;
		private String symbol;
		private double minValue;
		private double maxValue;
		
		public static final String PERCENT="'%";
		
		/**
		 * Costruttore di un oggetto DetectableInformation che prende come parametri nome e il booleano physicalDimension
		 * @param name
		 * @param physicalDimension se quest'ultimo vale "true", onOff vale "false" e viceversa
		 */
		public DetectableInformation(String name, boolean physicalDimension) {	
			
			this.name = name;
			this.physicalDimension = physicalDimension;
				if (physicalDimension == true) 
					this.onOff = false;
				else if(physicalDimension == false)
					this.onOff = true;
			this.dimensional = false;
			this.symbol = null;
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
			this.name = name;
		}
		
		/**
		 * 
		 * @return physicalDimension
		 */
		public boolean isPhysicalDimensionType() {
			return physicalDimension;
		}
		
		public void setMinValue(float minValue) {//altrimenti impostare eccezione?
			if (this.physicalDimension)
				this.minValue=minValue;
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
		public void setDimensional(boolean dimensional) { //verificare che sia grandezza fisica prima???
			if (dimensional == false)
				this.symbol = PERCENT;
		}
		
		/**
		 * 
		 * @param symbol
		 */
		public void setSymbol(String symbol) {  //verificare che sia grandezza fisica prima???
			
			if (this.dimensional == true)
				this.symbol = symbol;
			else
				System.out.println("Non e' possibile assegnare simbolo a una grandezza adimensionale"); //eccezione
		}
		
		/**
		 * 
		 * @return
		 */
		public String getSymbol() {
			return this.symbol;
		}
		
		
		//public boolean valuesComplete() {
		//	if ((this.physicalDimension) && (this.minValue != ));
		//}
		/**
		 * Verifica che l'oggetto DetectableInformation sia stato costruito e/o settato completamente
		 * @return
		 */
		public boolean informationComplete() {
			
			boolean xorType = ((this.physicalDimension && !this.onOff) || (!this.physicalDimension && this.onOff));
			
			if (this.name == null)
				return false;
			
			if (!xorType)
				return false;
			
			return true;
			

		}

		@Override
		public String toString() {
			return "DetectableInformation [name=" + name + ", physicalDimension=" + physicalDimension + ", onOff="
					+ onOff + ", dimensional=" + dimensional + ", symbol=" + symbol + "]";
		}
		
		
		
		

		

		
		


		
}
