package entities;

import models.Project;

import java.util.Objects;


public class ProjectsEntities {
    public final static Project firstTypeProject = Project.builder()
            .name("Test Project Name 1")
            .announcement("This is a description of the Test project 1.")
            .isShowAnnouncement(false)
            .type("1")
            .build();

    public final static Project secondTypeProject = Project.builder()
            .name("Test Project Name 2")
            .announcement("This is a description of the Test project 2.")
            .isShowAnnouncement(true)
            .type("2")
            .build();

    public final static Project thirdTypeProject = Project.builder()
            .name("Test Project Name 3")
            .announcement("This is a description of the Test project 3.")
            .isShowAnnouncement(true)
            .type("3")
            .build();

    public final static Project testProjectForSmokeTest = Project.builder()
            .name("Test Project for Smoke")
            .announcement("Some description")
            .isShowAnnouncement(false)
            .type("1")
            .build();

    public final static Project testProjectForApi = Project.builder()
            .name("Project For Api Nikita")
            .announcement("Some info")
            .isShowAnnouncement(true)
            .TypeOfProject(1)
            .build();

    public static Project getProject(String projectName) {
        if (Objects.equals(secondTypeProject.getName(), projectName)) {
            return secondTypeProject;
        } else if (Objects.equals(firstTypeProject.getName(), projectName)) {
            return firstTypeProject;
        } else if (Objects.equals(thirdTypeProject.getName(), projectName)) {
            return thirdTypeProject;
        } else if (Objects.equals(testProjectForSmokeTest.getName(), projectName)) {
            return testProjectForSmokeTest;
        } else {
            return null;
        }
    }
}
