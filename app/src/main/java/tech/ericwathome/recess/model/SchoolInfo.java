package tech.ericwathome.recess.model;

import androidx.annotation.NonNull;

import java.util.Objects;

public class SchoolInfo {
    private String schoolName;
    private String schoolImg;

    public SchoolInfo() {
    }

    public SchoolInfo(String schoolName, String schoolImg) {
        this.schoolName = schoolName;
        this.schoolImg = schoolImg;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolImg() {
        return schoolImg;
    }

    public void setSchoolImg(String schoolImg) {
        this.schoolImg = schoolImg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SchoolInfo)) return false;
        SchoolInfo that = (SchoolInfo) o;
        return Objects.equals(getSchoolName(), that.getSchoolName()) && Objects.equals(getSchoolImg(), that.getSchoolImg());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSchoolName(), getSchoolImg());
    }

    @NonNull
    @Override
    public String toString() {
        return "SchoolInfo{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolImg='" + schoolImg + '\'' +
                '}';
    }
}
