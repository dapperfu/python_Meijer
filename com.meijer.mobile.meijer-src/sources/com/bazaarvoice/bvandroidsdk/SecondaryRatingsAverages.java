package com.bazaarvoice.bvandroidsdk;

import java.util.List;
import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class SecondaryRatingsAverages {

    @InterfaceC16127c("AverageRating")
    private Float averageOverallRating;

    @InterfaceC16127c("DisplayType")
    private String displayType;

    /* renamed from: id, reason: collision with root package name */
    @InterfaceC16127c("Id")
    private String f63866id;

    @InterfaceC16127c("Label")
    private String label;

    @InterfaceC16127c("MaxLabel")
    private String maxLabel;

    @InterfaceC16127c("MinLabel")
    private String minLabel;

    @InterfaceC16127c("ValueLabel")
    private List<String> valueLabel;

    @InterfaceC16127c("ValueRange")
    private Integer valueRange;

    public Float getAverageOverallRating() {
        return this.averageOverallRating;
    }

    public String getDisplayType() {
        return this.displayType;
    }

    public String getId() {
        return this.f63866id;
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
