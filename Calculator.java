/**
	Класс реализует калькулятор
	*/

public class Calculator{
	
	/**
	Результат вычисления
	*/
	
	private int resurt;
	
	/**
	Суммируем аргументы
	@param params Аргументы суммирования.
	*/
	
	public void add(int ... params){
		for(Integer param : params){
			this.resurt += param;
		}
	}
	
	/**
		Получить реализультат.
		@return результат вычисления
	*/
	public int getResult(){
		return this.resurt;
	}
	/**
		Очистить результат вычисления
	*/
	
	public void cleanResult(){
	
		this.resurt = 0;
	
	}
}