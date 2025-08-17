package com.bazaarvoice.bvandroidsdk;

import java.util.List;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class SecondaryRatingsAverages {

    @InterfaceC15617c("AverageRating")
    private Float averageOverallRating;

    @InterfaceC15617c("DisplayType")
    private String displayType;

    /* renamed from: id, reason: collision with root package name */
    @InterfaceC15617c("Id")
    private String f63027id;

    @InterfaceC15617c("Label")
    private String label;

    @InterfaceC15617c("MaxLabel")
    private String maxLabel;

    @InterfaceC15617c("MinLabel")
    private String minLabel;

    @InterfaceC15617c("ValueLabel")
    private List<String> valueLabel;

    @InterfaceC15617c("ValueRange")
    private Integer valueRange;

    public Float getAverageOverallRating() {
        return this.averageOverallRating;
    }

    public String getDisplayType() {
        return this.displayType;
    }

    public String getId() {
        return this.f63027id;
    }

    public String getLabel() {
        return this.label;
    }

    public String getMaxLabel() {
        return this.maxLabel;
    }

    public String getMinLabel() {
        return this.minLabel;
    }

    public List<String> getValueLabel() {
        return this.valueLabel;
    }

    public Integer getValueRange() {
        return this.valueRange;
    }
}
