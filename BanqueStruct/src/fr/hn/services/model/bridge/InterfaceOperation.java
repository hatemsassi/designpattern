package fr.hn.services.model.bridge;

import java.math.BigDecimal;

public interface InterfaceOperation {

	BigDecimal calculSolde(BigDecimal montantOperation, TypeOperation typeOperation);

}
