package com.meijer.mobile.coupons.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0004\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJf\u0010\u000f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\n\u001a\u00020\u00042\b\b\u0003\u0010\u000b\u001a\u00020\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b!\u0010 \"\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b\u0019\u0010\u0012R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001e\u001a\u0004\b&\u0010 \"\u0004\b'\u0010#R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b(\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\b$\u0010\u0012¨\u0006)"}, d2 = {"Lcom/meijer/mobile/coupons/api/models/CouponJson;", "", "Lcom/meijer/mobile/coupons/api/models/OfferJson;", "offer", "", "isSuggested", "isHidden", "", "couponInclusionGroupTag", "couponExpirationGroupTag", "isClipped", "isSpecialOffer", "redemptionDate", "<init>", "(Lcom/meijer/mobile/coupons/api/models/OfferJson;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V", "copy", "(Lcom/meijer/mobile/coupons/api/models/OfferJson;ZZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)Lcom/meijer/mobile/coupons/api/models/CouponJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/coupons/api/models/OfferJson;", "c", "()Lcom/meijer/mobile/coupons/api/models/OfferJson;", "b", "Z", "h", "()Z", "f", "setHidden", "(Z)V", "d", "Ljava/lang/String;", "e", "setClipped", "g", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CouponJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final OfferJson offer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSuggested;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isHidden;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String couponInclusionGroupTag;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String couponExpirationGroupTag;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isClipped;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSpecialOffer;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String redemptionDate;

    public CouponJson(@g(name = "offer") OfferJson offer, @g(name = "isSuggested") boolean z10, @g(name = "isHidden") boolean z11, @g(name = "couponInclusionGroupTag") String str, @g(name = "couponExpirationGroupTag") String str2, @g(name = "isClipped") boolean z12, @g(name = "isSpecialOffer") boolean z13, @g(name = "redemptionDate") String str3) {
        Intrinsics.j(offer, "offer");
        this.offer = offer;
        this.isSuggested = z10;
        this.isHidden = z11;
        this.couponInclusionGroupTag = str;
        this.couponExpirationGroupTag = str2;
        this.isClipped = z12;
        this.isSpecialOffer = z13;
        this.redemptionDate = str3;
    }

    public final CouponJson copy(@g(name = "offer") OfferJson offer, @g(name = "isSuggested") boolean isSuggested, @g(name = "isHidden") boolean isHidden, @g(name = "couponInclusionGroupTag") String couponInclusionGroupTag, @g(name = "couponExpirationGroupTag") String couponExpirationGroupTag, @g(name = "isClipped") boolean isClipped, @g(name = "isSpecialOffer") boolean isSpecialOffer, @g(name = "redemptionDate") String redemptionDate) {
        Intrinsics.j(offer, "offer");
        return new CouponJson(offer, isSuggested, isHidden, couponInclusionGroupTag, couponExpirationGroupTag, isClipped, isSpecialOffer, redemptionDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponJson)) {
            return false;
        }
        CouponJson couponJson = (CouponJson) other;
        return Intrinsics.e(this.offer, couponJson.offer) && this.isSuggested == couponJson.isSuggested && this.isHidden == couponJson.isHidden && Intrinsics.e(this.couponInclusionGroupTag, couponJson.couponInclusionGroupTag) && Intrinsics.e(this.couponExpirationGroupTag, couponJson.couponExpirationGroupTag) && this.isClipped == couponJson.isClipped && this.isSpecialOffer == couponJson.isSpecialOffer && Intrinsics.e(this.redemptionDate, couponJson.redemptionDate);
    }

    public int hashCode() {
        int iHashCode = ((((this.offer.hashCode() * 31) + Boolean.hashCode(this.isSuggested)) * 31) + Boolean.hashCode(this.isHidden)) * 31;
        String str = this.couponInclusionGroupTag;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.couponExpirationGroupTag;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isClipped)) * 31) + Boolean.hashCode(this.isSpecialOffer)) * 31;
        String str3 = this.redemptionDate;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "CouponJson(offer=" + this.offer + ", isSuggested=" + this.isSuggested + ", isHidden=" + this.isHidden + ", couponInclusionGroupTag=" + this.couponInclusionGroupTag + ", couponExpirationGroupTag=" + this.couponExpirationGroupTag + ", isClipped=" + this.isClipped + ", isSpecialOffer=" + this.isSpecialOffer + ", redemptionDate=" + this.redemptionDate + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getCouponExpirationGroupTag() {
        return this.couponExpirationGroupTag;
    }

    /* renamed from: b, reason: from getter */
    public final String getCouponInclusionGroupTag() {
        return this.couponInclusionGroupTag;
    }

    /* renamed from: c, reason: from getter */
    public final OfferJson getOffer() {
        return this.offer;
    }

    /* renamed from: d, reason: from getter */
    public final String getRedemptionDate() {
        return this.redemptionDate;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsClipped() {
        return this.isClipped;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsSpecialOffer() {
        return this.isSpecialOffer;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getIsSuggested() {
        return this.isSuggested;
    }

    public /* synthetic */ CouponJson(OfferJson offerJson, boolean z10, boolean z11, String str, String str2, boolean z12, boolean z13, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(offerJson, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? false : z12, (i10 & 64) != 0 ? false : z13, (i10 & 128) != 0 ? null : str3);
    }
}
