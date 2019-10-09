package com.ddugky.mprmis.repository.project;

import java.util.List;

import com.ddugky.mprmis.model.projectSetup.ProjectDetails;
import com.ddugky.mprmis.model.user.UserMaster;

public interface ProjectDetailsDao {
	public List<ProjectDetails> getAssignProjectList(UserMaster userMaster);
	public List<ProjectDetails> getAllProjects();
	public List<ProjectDetails> getAllProjectsCreatedBy(UserMaster userMaster);
	public List<ProjectDetails> getAllProjectsForPIA(UserMaster userMaster);
	public List<ProjectDetails> getAllProjectsForCTSA(UserMaster userMaster);
	public List<ProjectDetails> getAllProjectsCreatedByAssignTo(UserMaster userMaster);
}
