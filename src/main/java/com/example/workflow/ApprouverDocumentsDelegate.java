package com.example.workflow;

import lombok.extern.log4j.Log4j2;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;

@Log4j2
public class ApprouverDocumentsDelegate implements TaskListener {
	@Override
	public void notify(DelegateTask delegateTask) {
		String date = (String)delegateTask.getVariable("date");
		log.info("############ Dossier approuvé le :"+date);

	}
}
