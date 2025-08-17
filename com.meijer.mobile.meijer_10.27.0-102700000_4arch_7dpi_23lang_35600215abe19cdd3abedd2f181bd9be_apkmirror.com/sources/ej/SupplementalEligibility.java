package ej;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u001a"}, d2 = {"Lej/E;", "", "Lej/t;", "storeLocation", "", "isAlcoholDeliveryEnabled", "", "partnerEligibility", "<init>", "(Lej/t;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lej/t;", "b", "()Lej/t;", "Z", "c", "()Z", "Ljava/lang/String;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ej.E, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class SupplementalEligibility {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PartnerStoreLocation storeLocation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isAlcoholDeliveryEnabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerEligibility;

    public SupplementalEligibility() {
        this(null, false, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupplementalEligibility)) {
            return false;
        }
        SupplementalEligibility supplementalEligibility = (SupplementalEligibility) other;
        return Intrinsics.e(this.storeLocation, supplementalEligibility.storeLocation) && this.isAlcoholDeliveryEnabled == supplementalEligibility.isAlcoholDeliveryEnabled && Intrinsics.e(this.partnerEligibility, supplementalEligibility.partnerEligibility);
    }

    public SupplementalEligibility(PartnerStoreLocation partnerStoreLocation, boolean z10, String str) {
        this.storeLocation = partnerStoreLocation;
        this.isAlcoholDeliveryEnabled = z10;
        this.partnerEligibility = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getPartnerEligibility() {
        return this.partnerEligibility;
    }

    /* renamed from: b, reason: from getter */
    public final PartnerStoreLocation getStoreLocation() {
        return this.storeLocation;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsAlcoholDeliveryEnabled() {
        return this.isAlcoholDeliveryEnabled;
    }

    public int hashCode() {
        PartnerStoreLocation partnerStoreLocation = this.storeLocation;
        int iHashCode = (((partnerStoreLocation == null ? 0 : partnerStoreLocation.hashCode()) * 31) + Boolean.hashCode(this.isAlcoholDeliveryEnabled)) * 31;
        String str = this.partnerEligibility;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "SupplementalEligibility(storeLocation=" + this.storeLocation + ", isAlcoholDeliveryEnabled=" + this.isAlcoholDeliveryEnabled + ", partnerEligibility=" + this.partnerEligibility + ')';
    }

    public /* synthetic */ SupplementalEligibility(PartnerStoreLocation partnerStoreLocation, boolean z10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : partnerStoreLocation, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : str);
    }
}
