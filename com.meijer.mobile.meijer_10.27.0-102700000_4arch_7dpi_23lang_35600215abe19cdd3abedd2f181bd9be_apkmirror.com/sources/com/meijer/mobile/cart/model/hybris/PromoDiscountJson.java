package com.meijer.mobile.cart.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ2\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/PromoDiscountJson;", "", "", "promoDesc", "promoNum", "", "rewardAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;D)V", "copy", "(Ljava/lang/String;Ljava/lang/String;D)Lcom/meijer/mobile/cart/model/hybris/PromoDiscountJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "D", "()D", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PromoDiscountJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoDesc;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoNum;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double rewardAmount;

    public PromoDiscountJson() {
        this(null, null, 0.0d, 7, null);
    }

    public final PromoDiscountJson copy(@g(name = "promoDesc") String promoDesc, @g(name = "promoNum") String promoNum, @g(name = "rewardAmount") double rewardAmount) {
        return new PromoDiscountJson(promoDesc, promoNum, rewardAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoDiscountJson)) {
            return false;
        }
        PromoDiscountJson promoDiscountJson = (PromoDiscountJson) other;
        return Intrinsics.e(this.promoDesc, promoDiscountJson.promoDesc) && Intrinsics.e(this.promoNum, promoDiscountJson.promoNum) && Double.compare(this.rewardAmount, promoDiscountJson.rewardAmount) == 0;
    }

    public int hashCode() {
        String str = this.promoDesc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.promoNum;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Double.hashCode(this.rewardAmount);
    }

    public String toString() {
        return "PromoDiscountJson(promoDesc=" + this.promoDesc + ", promoNum=" + this.promoNum + ", rewardAmount=" + this.rewardAmount + ')';
    }

    public PromoDiscountJson(@g(name = "promoDesc") String str, @g(name = "promoNum") String str2, @g(name = "rewardAmount") double d10) {
        this.promoDesc = str;
        this.promoNum = str2;
        this.rewardAmount = d10;
    }

    /* renamed from: a, reason: from getter */
    public final String getPromoDesc() {
        return this.promoDesc;
    }

    /* renamed from: b, reason: from getter */
    public final String getPromoNum() {
        return this.promoNum;
    }

    /* renamed from: c, reason: from getter */
    public final double getRewardAmount() {
        return this.rewardAmount;
    }

    public /* synthetic */ PromoDiscountJson(String str, String str2, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? 0.0d : d10);
    }
}
