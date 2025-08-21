package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ<\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/AndroidPickupLocationFilter;", "", "proximityToSite", "", "intervalSeconds", "", "priority", "", "smallestDisplacement", "(ILjava/lang/Float;Ljava/lang/String;Ljava/lang/Float;)V", "getIntervalSeconds", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getPriority", "()Ljava/lang/String;", "getProximityToSite", "()I", "getSmallestDisplacement", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/Float;Ljava/lang/String;Ljava/lang/Float;)Lcom/radiusnetworks/flybuy/api/model/AndroidPickupLocationFilter;", "equals", "", "other", "hashCode", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AndroidPickupLocationFilter {

    @InterfaceC16127c("interval_seconds")
    private final Float intervalSeconds;

    @InterfaceC16127c("priority")
    private final String priority;

    @InterfaceC16127c("proximity_to_site")
    private final int proximityToSite;

    @InterfaceC16127c("smallest_displacement")
    private final Float smallestDisplacement;

    public AndroidPickupLocationFilter() {
        this(0, null, null, null, 15, null);
    }

    public static /* synthetic */ AndroidPickupLocationFilter copy$default(AndroidPickupLocationFilter androidPickupLocationFilter, int i10, Float f10, String str, Float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = androidPickupLocationFilter.proximityToSite;
        }
        if ((i11 & 2) != 0) {
            f10 = androidPickupLocationFilter.intervalSeconds;
        }
        if ((i11 & 4) != 0) {
            str = androidPickupLocationFilter.priority;
        }
        if ((i11 & 8) != 0) {
            f11 = androidPickupLocationFilter.smallestDisplacement;
        }
        return androidPickupLocationFilter.copy(i10, f10, str, f11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getProximityToSite() {
        return this.proximityToSite;
    }

    /* renamed from: component2, reason: from getter */
    public final Float getIntervalSeconds() {
        return this.intervalSeconds;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPriority() {
        return this.priority;
    }

    /* renamed from: component4, reason: from getter */
    public final Float getSmallestDisplacement() {
        return this.smallestDisplacement;
    }

    public final AndroidPickupLocationFilter copy(int proximityToSite, Float intervalSeconds, String priority, Float smallestDisplacement) {
        return new AndroidPickupLocationFilter(proximityToSite, intervalSeconds, priority, smallestDisplacement);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidPickupLocationFilter)) {
            return false;
        }
        AndroidPickupLocationFilter androidPickupLocationFilter = (AndroidPickupLocationFilter) other;
        return this.proximityToSite == androidPickupLocationFilter.proximityToSite && Intrinsics.e(this.intervalSeconds, androidPickupLocationFilter.intervalSeconds) && Intrinsics.e(this.priority, androidPickupLocationFilter.priority) && Intrinsics.e(this.smallestDisplacement, androidPickupLocationFilter.smallestDisplacement);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.proximityToSite) * 31;
        Float f10 = this.intervalSeconds;
        int iHashCode2 = (iHashCode + (f10 == null ? 0 : f10.hashCode())) * 31;
        String str = this.priority;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Float f11 = this.smallestDisplacement;
        return iHashCode3 + (f11 != null ? f11.hashCode() : 0);
    }

    public String toString() {
        return "AndroidPickupLocationFilter(proximityToSite=" + this.proximityToSite + ", intervalSeconds=" + this.intervalSeconds + ", priority=" + this.priority + ", smallestDisplacement=" + this.smallestDisplacement + ')';
    }

    public AndroidPickupLocationFilter(int i10, Float f10, String str, Float f11) {
        this.proximityToSite = i10;
        this.intervalSeconds = f10;
        this.priority = str;
        this.smallestDisplacement = f11;
    }

    public final Float getIntervalSeconds() {
        return this.intervalSeconds;
    }

    public final String getPriority() {
        return this.priority;
    }

    public final int getProximityToSite() {
        return this.proximityToSite;
    }

    public final Float getSmallestDisplacement() {
        return this.smallestDisplacement;
    }

    public /* synthetic */ AndroidPickupLocationFilter(int i10, Float f10, String str, Float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? -1 : i10, (i11 & 2) != 0 ? null : f10, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : f11);
    }
}
