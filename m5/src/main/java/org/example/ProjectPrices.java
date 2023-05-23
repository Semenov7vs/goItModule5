package org.example;

class ProjectPrices{
    private int projectId;
    private int projectCost;

    public ProjectPrices(int projectId, int projectCost) {
        this.projectId = projectId;
        this.projectCost = projectCost;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getProjectCost() {
        return projectCost;
    }

    public void setProjectCost(int projectCost) {
        this.projectCost = projectCost;
    }
}