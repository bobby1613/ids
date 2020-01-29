package ids.project.v1;

public abstract class Category {

	private String nameCategory; //IMPOSTA LUNGHEZZA MASSIMA E UNIVOCITA
	private String genericInfo; //IMPOSTA LUNGHEZZA MASSIMA
	
	public Category(String nameCategory, String infoConstructor) {
		
		this.nameCategory = nameCategory;
		this.genericInfo = infoConstructor;
		
	}

	/**
	 * @return the nameCategory
	 */
	public String getNameCategory() {
		
		return this.nameCategory;
	}

	/**
	 * @return the genericInfo
	 */
	public String getGenericInfo() {
		
		return this.genericInfo;
	}

	@Override
	public String toString() {
		
		return "Category [nameCategory=" + nameCategory + ", genericInfo=" + genericInfo + "]";
	}
	
	
	
	
}