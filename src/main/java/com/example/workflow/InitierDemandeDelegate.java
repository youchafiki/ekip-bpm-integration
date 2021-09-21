package com.example.workflow;

import lombok.extern.log4j.Log4j2;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.UUID;

@Log4j2
public class InitierDemandeDelegate implements JavaDelegate {
	@Override
	public void execute(DelegateExecution delegateExecution) {

		log.info("######## tache auto");
		UUID uuid = UUID.randomUUID();
		delegateExecution.setVariable("numeroDemande",uuid.toString());
	}
}
