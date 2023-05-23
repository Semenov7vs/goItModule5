package org.example;

class TheLongestProject{
    private int id;
    private int monthCount;

    public TheLongestProject(int id, int monthCount) {
        this.id = id;
        this.monthCount = monthCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMonthCount() {
        return monthCount;
    }

    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }
}
