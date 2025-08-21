package fj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0013\u0010\f¨\u0006\u001d"}, d2 = {"Lfj/t;", "", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "partnerStoreId", "", "storeId", "estimatedTimeToDeliver", "serviceTier", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getPartnerStoreId", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "c", "I", "getEstimatedTimeToDeliver", "d", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fj.t, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class PartnerStoreLocation {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer partnerStoreId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int estimatedTimeToDeliver;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String serviceTier;

    public PartnerStoreLocation(Integer num, String storeId, int i10, String str) {
        Intrinsics.j(storeId, "storeId");
        this.partnerStoreId = num;
        this.storeId = storeId;
        this.estimatedTimeToDeliver = i10;
        this.serviceTier = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartnerStoreLocation)) {
            return false;
        }
        PartnerStoreLocation partnerStoreLocation = (PartnerStoreLocation) other;
        return Intrinsics.e(this.partnerStoreId, partnerStoreLocation.partnerStoreId) && Intrinsics.e(this.storeId, partnerStoreLocation.storeId) && this.estimatedTimeToDeliver == partnerStoreLocation.estimatedTimeToDeliver && Intrinsics.e(this.serviceTier, partnerStoreLocation.serviceTier);
    }

    /* renamed from: a, reason: from getter */
    public final String getServiceTier() {
        return this.serviceTier;
    }

    /* renamed from: b, reason: from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    public int hashCode() {
        Integer num = this.partnerStoreId;
        int iHashCode = (((((num == null ? 0 : num.hashCode()) * 31) + this.storeId.hashCode()) * 31) + Integer.hashCode(this.estimatedTimeToDeliver)) * 31;
        String str = this.serviceTier;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PartnerStoreLocation(partnerStoreId=" + this.partnerStoreId + ", storeId=" + this.storeId + ", estimatedTimeToDeliver=" + this.estimatedTimeToDeliver + ", serviceTier=" + this.serviceTier + ')';
    }

    public /* synthetic */ PartnerStoreLocation(Integer num, String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, i10, (i11 & 8) != 0 ? null : str2);
    }
}
