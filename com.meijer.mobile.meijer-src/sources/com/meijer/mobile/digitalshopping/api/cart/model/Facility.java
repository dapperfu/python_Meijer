package com.meijer.mobile.digitalshopping.api.cart.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/cart/model/Facility;", "", "", "facilityId", "", "estimatedDriveTime", "serviceTier", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "copy", "(Ljava/lang/String;ILjava/lang/String;)Lcom/meijer/mobile/digitalshopping/api/cart/model/Facility;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Facility {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String facilityId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int estimatedDriveTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String serviceTier;

    public Facility() {
        this(null, 0, null, 7, null);
    }

    public final Facility copy(@g(name = "facilityId") String facilityId, @g(name = "estimatedDriveTime") int estimatedDriveTime, @g(name = "serviceTier") String serviceTier) {
        Intrinsics.j(facilityId, "facilityId");
        Intrinsics.j(serviceTier, "serviceTier");
        return new Facility(facilityId, estimatedDriveTime, serviceTier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Facility)) {
            return false;
        }
        Facility facility = (Facility) other;
        return Intrinsics.e(this.facilityId, facility.facilityId) && this.estimatedDriveTime == facility.estimatedDriveTime && Intrinsics.e(this.serviceTier, facility.serviceTier);
    }

    public int hashCode() {
        return (((this.facilityId.hashCode() * 31) + Integer.hashCode(this.estimatedDriveTime)) * 31) + this.serviceTier.hashCode();
    }

    public String toString() {
        return "Facility(facilityId=" + this.facilityId + ", estimatedDriveTime=" + this.estimatedDriveTime + ", serviceTier=" + this.serviceTier + ')';
    }

    public Facility(@g(name = "facilityId") String facilityId, @g(name = "estimatedDriveTime") int i10, @g(name = "serviceTier") String serviceTier) {
        Intrinsics.j(facilityId, "facilityId");
        Intrinsics.j(serviceTier, "serviceTier");
        this.facilityId = facilityId;
        this.estimatedDriveTime = i10;
        this.serviceTier = serviceTier;
    }

    /* renamed from: a, reason: from getter */
    public final int getEstimatedDriveTime() {
        return this.estimatedDriveTime;
    }

    /* renamed from: b, reason: from getter */
    public final String getFacilityId() {
        return this.facilityId;
    }

    /* renamed from: c, reason: from getter */
    public final String getServiceTier() {
        return this.serviceTier;
    }

    public /* synthetic */ Facility(String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? "" : str2);
    }
}
