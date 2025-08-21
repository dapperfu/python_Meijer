package com.bazaarvoice.bvandroidsdk;

import java.util.List;
import og.InterfaceC16127c;

/* loaded from: classes4.dex */
public class SecondaryDistributionElement {

    /* renamed from: id, reason: collision with root package name */
    @InterfaceC16127c("Id")
    private String f63864id;

    @InterfaceC16127c("Label")
    private String label;

    @InterfaceC16127c("Values")
    private List<SecondaryDistributionValue> values;

    public String getId() {
        return this.f63864id;
    }

    public String getLabel() {
        return this.label;
    }

    public List<SecondaryDistributionValue> getValues() {
        return this.values;
    }
}
