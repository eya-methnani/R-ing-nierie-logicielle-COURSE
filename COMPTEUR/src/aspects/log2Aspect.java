package aspects;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import metier.Compteur;


@Aspect
public class log2Aspect {
	private Logger logger = Logger.getLogger(this.getClass().getName());
	
	@Pointcut("call (* incrementer(..)) && target(c)")
			
	public void logIncrementation(Compteur c) { }
			
	@Before("logIncrementation(c)")
			
	public void avant(Compteur c) {		
		logger.info("Avant incrementation"+c.toString());
		}
			
	@After("logIncrementation(c)")
			
	public void après(Compteur c) {
		logger.info("Après incrementation"+c.toString());
		
	}	
	
	
	
	@Pointcut("call (* decrementer(..))&& target(c)")
	
	public void logdecrementation(Compteur c) { }
			
	@Before("logdecrementation(c)")
			
	public void avant1(Compteur c) {		
		logger.info("Avant decrementation"+c.toString());
		}
			
	@After("logdecrementation(c)")
			
	public void après1(Compteur c) {
		logger.info("Après decrementation"+c.toString());
			
		
	}

}
