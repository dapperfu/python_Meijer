package ej;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u0015\u0010\u000eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000e¨\u0006\""}, d2 = {"Lej/c;", "", "Lej/t;", "storeLocation", "", "isAlcoholDeliveryEnabled", "", "partnerEligibility", "", "Lej/E;", "supplementalEligibility", "<init>", "(Lej/t;ZLjava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lej/t;", "c", "()Lej/t;", "b", "Z", "e", "()Z", "Ljava/lang/String;", "d", "Ljava/util/List;", "()Ljava/util/List;", "serviceTier", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ej.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class AvailablePartnerStoreLocations {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PartnerStoreLocation storeLocation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAlcoholDeliveryEnabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerEligibility;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<SupplementalEligibility> supplementalEligibility;

    public AvailablePartnerStoreLocations() {
        this(null, false, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailablePartnerStoreLocations)) {
            return false;
        }
        AvailablePartnerStoreLocations availablePartnerStoreLocations = (AvailablePartnerStoreLocations) other;
        return Intrinsics.e(this.storeLocation, availablePartnerStoreLocations.storeLocation) && this.isAlcoholDeliveryEnabled == availablePartnerStoreLocations.isAlcoholDeliveryEnabled && Intrinsics.e(this.partnerEligibility, availablePartnerStoreLocations.partnerEligibility) && Intrinsics.e(this.supplementalEligibility, availablePartnerStoreLocations.supplementalEligibility);
    }

    public AvailablePartnerStoreLocations(PartnerStoreLocation partnerStoreLocation, boolean z10, String str, List<SupplementalEligibility> supplementalEligibility) {
        Intrinsics.j(supplementalEligibility, "supplementalEligibility");
        this.storeLocation = partnerStoreLocation;
        this.isAlcoholDeliveryEnabled = z10;
        this.partnerEligibility = str;
        this.supplementalEligibility = supplementalEligibility;
    }

    /* renamed from: a, reason: from getter */
    public final String getPartnerEligibility() {
        return this.partnerEligibility;
    }

    public final String b() {
        PartnerStoreLocation partnerStoreLocation = this.storeLocation;
        if (partnerStoreLocation != null) {
            return partnerStoreLocation.getServiceTier();
        }
        return null;
    }

    /* renamed from: c, reason: from getter */
    public final PartnerStoreLocation getStoreLocation() {
        return this.storeLocation;
    }

    public final List<SupplementalEligibility> d() {
        return this.supplementalEligibility;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsAlcoholDeliveryEnabled() {
        return this.isAlcoholDeliveryEnabled;
    }

    public int hashCode() {
        PartnerStoreLocation partnerStoreLocation = this.storeLocation;
        int iHashCode = (((partnerStoreLocation == null ? 0 : partnerStoreLocation.hashCode()) * 31) + Boolean.hashCode(this.isAlcoholDeliveryEnabled)) * 31;
        String str = this.partnerEligibility;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.supplementalEligibility.hashCode();
    }

    public String toString() {
        return "AvailablePartnerStoreLocations(storeLocation=" + this.storeLocation + ", isAlcoholDeliveryEnabled=" + this.isAlcoholDeliveryEnabled + ", partnerEligibility=" + this.partnerEligibility + ", supplementalEligibility=" + this.supplementalEligibility + ')';
    }

    public /* synthetic */ AvailablePartnerStoreLocations(PartnerStoreLocation partnerStoreLocation, boolean z10, String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : partnerStoreLocation, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? CollectionsKt.m() : list);
    }
}
