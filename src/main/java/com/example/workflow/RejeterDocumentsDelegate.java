package com.example.workflow;

import lombok.extern.log4j.Log4j2;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.Random;

@Log4j2
public class RejeterDocumentsDelegate implements JavaDelegate {
	@Override
	public void execute(DelegateExecution delegateExecution) throws Exception {

		String motif = (String)delegateExecution.getVariable("motif");
		log.info("############ Dossier rejeté pour motif :"+motif);

	}
}
