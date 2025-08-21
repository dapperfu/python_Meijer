package com.meijer.mobile.coupons.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponRequest;", "", "", "meijerOfferId", "", "storeId", "", "cartIsActive", "<init>", "(JIZ)V", "copy", "(JIZ)Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "b", "()J", "I", "c", "Z", "()Z", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ClipUnclipCouponRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long meijerOfferId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean cartIsActive;

    public ClipUnclipCouponRequest(@g(name = "meijerOfferId") long j10, @g(name = "storeId") int i10, @g(name = "cartIsActive") boolean z10) {
        this.meijerOfferId = j10;
        this.storeId = i10;
        this.cartIsActive = z10;
    }

    public final ClipUnclipCouponRequest copy(@g(name = "meijerOfferId") long meijerOfferId, @g(name = "storeId") int storeId, @g(name = "cartIsActive") boolean cartIsActive) {
        return new ClipUnclipCouponRequest(meijerOfferId, storeId, cartIsActive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClipUnclipCouponRequest)) {
            return false;
        }
        ClipUnclipCouponRequest clipUnclipCouponRequest = (ClipUnclipCouponRequest) other;
        return this.meijerOfferId == clipUnclipCouponRequest.meijerOfferId && this.storeId == clipUnclipCouponRequest.storeId && this.cartIsActive == clipUnclipCouponRequest.cartIsActive;
    }

    public int hashCode() {
        return (((Long.hashCode(this.meijerOfferId) * 31) + Integer.hashCode(this.storeId)) * 31) + Boolean.hashCode(this.cartIsActive);
    }

    public String toString() {
        return "ClipUnclipCouponRequest(meijerOfferId=" + this.meijerOfferId + ", storeId=" + this.storeId + ", cartIsActive=" + this.cartIsActive + ')';
    }

    /* renamed from: a, reason: from getter */
    public final boolean getCartIsActive() {
        return this.cartIsActive;
    }

    /* renamed from: b, reason: from getter */
    public final long getMeijerOfferId() {
        return this.meijerOfferId;
    }

    /* renamed from: c, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    public /* synthetic */ ClipUnclipCouponRequest(long j10, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10, (i11 & 4) != 0 ? true : z10);
    }
}
