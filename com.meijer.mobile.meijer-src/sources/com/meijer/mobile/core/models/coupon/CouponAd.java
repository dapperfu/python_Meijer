package com.meijer.mobile.core.models.coupon;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJL\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u0019R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u0019R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001e\u0010\u0019R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u001f\u0010\u0019R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001d\u0010\r\"\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lcom/meijer/mobile/core/models/coupon/CouponAd;", "", "", "title", "imageURL", "bundleTag", "analyticTag", "imageDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/core/models/coupon/CouponAd;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "setTitle", "(Ljava/lang/String;)V", "b", "d", "setImageURL", "c", "setBundleTag", "setAnalyticTag", "setImageDescription", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CouponAd {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String imageURL;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String bundleTag;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String analyticTag;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String imageDescription;

    public CouponAd() {
        this(null, null, null, null, null, 31, null);
    }

    public final CouponAd copy(@g(name = "title") String title, @g(name = "imageUrl") String imageURL, @g(name = "bundleTag") String bundleTag, @g(name = "analyticTag") String analyticTag, @g(name = "imageDescription") String imageDescription) {
        return new CouponAd(title, imageURL, bundleTag, analyticTag, imageDescription);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponAd)) {
            return false;
        }
        CouponAd couponAd = (CouponAd) other;
        return Intrinsics.e(this.title, couponAd.title) && Intrinsics.e(this.imageURL, couponAd.imageURL) && Intrinsics.e(this.bundleTag, couponAd.bundleTag) && Intrinsics.e(this.analyticTag, couponAd.analyticTag) && Intrinsics.e(this.imageDescription, couponAd.imageDescription);
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageURL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bundleTag;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.analyticTag;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imageDescription;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "CouponAd(title=" + this.title + ", imageURL=" + this.imageURL + ", bundleTag=" + this.bundleTag + ", analyticTag=" + this.analyticTag + ", imageDescription=" + this.imageDescription + ')';
    }

    public CouponAd(@g(name = "title") String str, @g(name = "imageUrl") String str2, @g(name = "bundleTag") String str3, @g(name = "analyticTag") String str4, @g(name = "imageDescription") String str5) {
        this.title = str;
        this.imageURL = str2;
        this.bundleTag = str3;
        this.analyticTag = str4;
        this.imageDescription = str5;
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticTag() {
        return this.analyticTag;
    }

    /* renamed from: b, reason: from getter */
    public final String getBundleTag() {
        return this.bundleTag;
    }

    /* renamed from: c, reason: from getter */
    public final String getImageDescription() {
        return this.imageDescription;
    }

    /* renamed from: d, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ CouponAd(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }
}
