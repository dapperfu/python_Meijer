package com.bazaarvoice.bvandroidsdk;

import java.util.List;
import mg.InterfaceC15617c;

/* loaded from: classes4.dex */
public class DistributionElement {

    /* renamed from: id, reason: collision with root package name */
    @InterfaceC15617c("Id")
    private String f63010id;

    @InterfaceC15617c("Label")
    private String label;

    @InterfaceC15617c("Values")
    private List<DistributionValue> values;

    public String getId() {
        return this.f63010id;
    }

    public String getLabel() {
        return this.label;
    }

    public List<DistributionValue> getValues() {
        return this.values;
    }
}
