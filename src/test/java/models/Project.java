package models;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Builder
@Data
public class Project {
    private String name;
    private String announcement;
    private String type;
    private boolean access;
    private boolean deleted;
    private int id;
    @SerializedName(value = "show_announcement")
    private boolean isShowAnnouncement;
    @SerializedName(value = "suite_mode")
    private int TypeOfProject;
}
