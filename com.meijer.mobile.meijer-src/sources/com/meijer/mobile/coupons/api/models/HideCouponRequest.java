package com.meijer.mobile.coupons.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/HideCouponRequest;", "", "", "meijerOfferId", "", "hidden", "<init>", "(Ljava/lang/String;Z)V", "copy", "(Ljava/lang/String;Z)Lcom/meijer/mobile/coupons/api/models/HideCouponRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class HideCouponRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String meijerOfferId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hidden;

    public final HideCouponRequest copy(@g(name = "meijerOfferId") String meijerOfferId, @g(name = "hidden") boolean hidden) {
        Intrinsics.j(meijerOfferId, "meijerOfferId");
        return new HideCouponRequest(meijerOfferId, hidden);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HideCouponRequest)) {
            return false;
        }
        HideCouponRequest hideCouponRequest = (HideCouponRequest) other;
        return Intrinsics.e(this.meijerOfferId, hideCouponRequest.meijerOfferId) && this.hidden == hideCouponRequest.hidden;
    }

    public int hashCode() {
        return (this.meijerOfferId.hashCode() * 31) + Boolean.hashCode(this.hidden);
    }

    public String toString() {
        return "HideCouponRequest(meijerOfferId=" + this.meijerOfferId + ", hidden=" + this.hidden + ')';
    }

    public HideCouponRequest(@g(name = "meijerOfferId") String meijerOfferId, @g(name = "hidden") boolean z10) {
        Intrinsics.j(meijerOfferId, "meijerOfferId");
        this.meijerOfferId = meijerOfferId;
        this.hidden = z10;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getHidden() {
        return this.hidden;
    }

    /* renamed from: b, reason: from getter */
    public final String getMeijerOfferId() {
        return this.meijerOfferId;
    }
}
