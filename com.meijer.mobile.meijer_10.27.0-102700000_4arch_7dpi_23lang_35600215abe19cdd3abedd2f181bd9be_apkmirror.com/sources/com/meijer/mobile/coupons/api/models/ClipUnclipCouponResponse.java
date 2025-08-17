package com.meijer.mobile.coupons.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "", "", "code", "", "result", "<init>", "(ILjava/lang/String;)V", "copy", "(ILjava/lang/String;)Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ClipUnclipCouponResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String result;

    /* JADX WARN: Multi-variable type inference failed */
    public ClipUnclipCouponResponse() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public final ClipUnclipCouponResponse copy(@g(name = "code") int code, @g(name = "result") String result) {
        return new ClipUnclipCouponResponse(code, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClipUnclipCouponResponse)) {
            return false;
        }
        ClipUnclipCouponResponse clipUnclipCouponResponse = (ClipUnclipCouponResponse) other;
        return this.code == clipUnclipCouponResponse.code && Intrinsics.e(this.result, clipUnclipCouponResponse.result);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        String str = this.result;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ClipUnclipCouponResponse(code=" + this.code + ", result=" + this.result + ')';
    }

    public ClipUnclipCouponResponse(@g(name = "code") int i10, @g(name = "result") String str) {
        this.code = i10;
        this.result = str;
    }

    /* renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: b, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    public /* synthetic */ ClipUnclipCouponResponse(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? null : str);
    }
}
