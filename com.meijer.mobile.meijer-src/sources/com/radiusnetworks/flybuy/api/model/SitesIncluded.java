package com.radiusnetworks.flybuy.api.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/SitesIncluded;", "", "pickupConfigs", "", "Lcom/radiusnetworks/flybuy/api/model/PickupConfig;", "(Ljava/util/List;)V", "getPickupConfigs", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SitesIncluded {

    @InterfaceC16127c("pickup_configs")
    private final List<PickupConfig> pickupConfigs;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SitesIncluded copy$default(SitesIncluded sitesIncluded, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = sitesIncluded.pickupConfigs;
        }
        return sitesIncluded.copy(list);
    }

    public final List<PickupConfig> component1() {
        return this.pickupConfigs;
    }

    public final SitesIncluded copy(List<PickupConfig> pickupConfigs) {
        return new SitesIncluded(pickupConfigs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SitesIncluded) && Intrinsics.e(this.pickupConfigs, ((SitesIncluded) other).pickupConfigs);
    }

    public int hashCode() {
        List<PickupConfig> list = this.pickupConfigs;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "SitesIncluded(pickupConfigs=" + this.pickupConfigs + ')';
    }

    public final List<PickupConfig> getPickupConfigs() {
        return this.pickupConfigs;
    }

    public SitesIncluded(List<PickupConfig> list) {
        this.pickupConfigs = list;
    }
}
