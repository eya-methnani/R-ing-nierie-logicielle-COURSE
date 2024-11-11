package aspects;

import java.util.logging.Logger;

public aspect log3 {
	private Logger logger = Logger.getLogger(this.getClass().getName());
    pointcut logOperation() : execution (void metier.Compteur.incrementer(int));
    Object around() : logOperation() {
        logger.info("=> Entrée dans la méthode incrementer");
        Object ret = proceed();
        logger.info("<= Sortie de la méthode incrementer");
        return ret;
    }


}
