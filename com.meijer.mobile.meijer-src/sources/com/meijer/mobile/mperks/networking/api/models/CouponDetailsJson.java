package com.meijer.mobile.mperks.networking.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ6\u0010\n\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0015\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/mperks/networking/api/models/CouponDetailsJson;", "", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "couponId", "", "clipSource", "clipLabel", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/mperks/networking/api/models/CouponDetailsJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "c", "()J", "b", "Ljava/lang/String;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CouponDetailsJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long couponId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clipSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clipLabel;

    public CouponDetailsJson() {
        this(0L, null, null, 7, null);
    }

    public final CouponDetailsJson copy(@g(name = "couponId") long couponId, @g(name = "clipSource") String clipSource, @g(name = "clipLabel") String clipLabel) {
        return new CouponDetailsJson(couponId, clipSource, clipLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponDetailsJson)) {
            return false;
        }
        CouponDetailsJson couponDetailsJson = (CouponDetailsJson) other;
        return this.couponId == couponDetailsJson.couponId && Intrinsics.e(this.clipSource, couponDetailsJson.clipSource) && Intrinsics.e(this.clipLabel, couponDetailsJson.clipLabel);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.couponId) * 31;
        String str = this.clipSource;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.clipLabel;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CouponDetailsJson(couponId=" + this.couponId + ", clipSource=" + this.clipSource + ", clipLabel=" + this.clipLabel + ')';
    }

    public CouponDetailsJson(@g(name = "couponId") long j10, @g(name = "clipSource") String str, @g(name = "clipLabel") String str2) {
        this.couponId = j10;
        this.clipSource = str;
        this.clipLabel = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getClipLabel() {
        return this.clipLabel;
    }

    /* renamed from: b, reason: from getter */
    public final String getClipSource() {
        return this.clipSource;
    }

    /* renamed from: c, reason: from getter */
    public final long getCouponId() {
        return this.couponId;
    }

    public /* synthetic */ CouponDetailsJson(long j10, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2);
    }
}
