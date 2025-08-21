package com.meijer.mobile.cart.model.hybris.promos;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/promos/HybrisPromoCodeResponse;", "", "", "Lcom/meijer/mobile/cart/model/hybris/promos/HybrisPromoCoupon;", "coupons", "", "promoCodeResponseCode", "", "promoCodeResponseMessage", "<init>", "(Ljava/util/List;ILjava/lang/String;)V", "copy", "(Ljava/util/List;ILjava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/promos/HybrisPromoCodeResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "I", "c", "Ljava/lang/String;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HybrisPromoCodeResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisPromoCoupon> coupons;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int promoCodeResponseCode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoCodeResponseMessage;

    public HybrisPromoCodeResponse() {
        this(null, 0, null, 7, null);
    }

    public final HybrisPromoCodeResponse copy(@g(name = "coupons") List<HybrisPromoCoupon> coupons, @g(name = "promoCodeResponseCode") int promoCodeResponseCode, @g(name = "promoCodeResponseMessage") String promoCodeResponseMessage) {
        Intrinsics.j(coupons, "coupons");
        return new HybrisPromoCodeResponse(coupons, promoCodeResponseCode, promoCodeResponseMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisPromoCodeResponse)) {
            return false;
        }
        HybrisPromoCodeResponse hybrisPromoCodeResponse = (HybrisPromoCodeResponse) other;
        return Intrinsics.e(this.coupons, hybrisPromoCodeResponse.coupons) && this.promoCodeResponseCode == hybrisPromoCodeResponse.promoCodeResponseCode && Intrinsics.e(this.promoCodeResponseMessage, hybrisPromoCodeResponse.promoCodeResponseMessage);
    }

    public int hashCode() {
        int iHashCode = ((this.coupons.hashCode() * 31) + Integer.hashCode(this.promoCodeResponseCode)) * 31;
        String str = this.promoCodeResponseMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "HybrisPromoCodeResponse(coupons=" + this.coupons + ", promoCodeResponseCode=" + this.promoCodeResponseCode + ", promoCodeResponseMessage=" + this.promoCodeResponseMessage + ')';
    }

    public HybrisPromoCodeResponse(@g(name = "coupons") List<HybrisPromoCoupon> coupons, @g(name = "promoCodeResponseCode") int i10, @g(name = "promoCodeResponseMessage") String str) {
        Intrinsics.j(coupons, "coupons");
        this.coupons = coupons;
        this.promoCodeResponseCode = i10;
        this.promoCodeResponseMessage = str;
    }

    public final List<HybrisPromoCoupon> a() {
        return this.coupons;
    }

    /* renamed from: b, reason: from getter */
    public final int getPromoCodeResponseCode() {
        return this.promoCodeResponseCode;
    }

    /* renamed from: c, reason: from getter */
    public final String getPromoCodeResponseMessage() {
        return this.promoCodeResponseMessage;
    }

    public /* synthetic */ HybrisPromoCodeResponse(List list, int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.m() : list, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? null : str);
    }
}
