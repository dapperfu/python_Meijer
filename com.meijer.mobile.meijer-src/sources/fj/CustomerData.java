package fj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lfj/g;", "", "", "Lcom/meijer/mobile/core/model/common/Guid;", "customerId", "maskedMperksRewardsId", "Lfj/r;", "membership", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lfj/r;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCustomerId", "b", "c", "Lfj/r;", "getMembership", "()Lfj/r;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fj.g, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class CustomerData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String maskedMperksRewardsId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Membership membership;

    public CustomerData() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerData)) {
            return false;
        }
        CustomerData customerData = (CustomerData) other;
        return Intrinsics.e(this.customerId, customerData.customerId) && Intrinsics.e(this.maskedMperksRewardsId, customerData.maskedMperksRewardsId) && Intrinsics.e(this.membership, customerData.membership);
    }

    public CustomerData(String customerId, String maskedMperksRewardsId, Membership membership) {
        Intrinsics.j(customerId, "customerId");
        Intrinsics.j(maskedMperksRewardsId, "maskedMperksRewardsId");
        this.customerId = customerId;
        this.maskedMperksRewardsId = maskedMperksRewardsId;
        this.membership = membership;
    }

    /* renamed from: a, reason: from getter */
    public final String getMaskedMperksRewardsId() {
        return this.maskedMperksRewardsId;
    }

    public int hashCode() {
        int iHashCode = ((this.customerId.hashCode() * 31) + this.maskedMperksRewardsId.hashCode()) * 31;
        Membership membership = this.membership;
        return iHashCode + (membership == null ? 0 : membership.hashCode());
    }

    public String toString() {
        return "CustomerData(customerId=" + this.customerId + ", maskedMperksRewardsId=" + this.maskedMperksRewardsId + ", membership=" + this.membership + ')';
    }

    public /* synthetic */ CustomerData(String str, String str2, Membership membership, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "(***) ***-****" : str2, (i10 & 4) != 0 ? null : membership);
    }
}
