package money;

public interface Expression {
	Expression times(int muliplier);
	Expression plus(Expression addend);
	Money reduce(Bank bank, String to);
}
