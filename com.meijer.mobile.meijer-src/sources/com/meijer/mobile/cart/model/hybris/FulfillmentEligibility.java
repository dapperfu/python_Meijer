package com.meijer.mobile.cart.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJF\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/FulfillmentEligibility;", "", "", "fulfillmentEligibility", "partnerEligibility", "", "alcoholEligible", "storeId", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)Lcom/meijer/mobile/cart/model/hybris/FulfillmentEligibility;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "d", "e", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class FulfillmentEligibility {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentEligibility;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerEligibility;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean alcoholEligible;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String storeId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSelected;

    public FulfillmentEligibility() {
        this(null, null, false, null, false, 31, null);
    }

    public final FulfillmentEligibility copy(@g(name = "fulfillmentEligibility") String fulfillmentEligibility, @g(name = "partnerEligibility") String partnerEligibility, @g(name = "alcoholEligible") boolean alcoholEligible, @g(name = "storeId") String storeId, @g(name = "selected") boolean isSelected) {
        Intrinsics.j(storeId, "storeId");
        return new FulfillmentEligibility(fulfillmentEligibility, partnerEligibility, alcoholEligible, storeId, isSelected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentEligibility)) {
            return false;
        }
        FulfillmentEligibility fulfillmentEligibility = (FulfillmentEligibility) other;
        return Intrinsics.e(this.fulfillmentEligibility, fulfillmentEligibility.fulfillmentEligibility) && Intrinsics.e(this.partnerEligibility, fulfillmentEligibility.partnerEligibility) && this.alcoholEligible == fulfillmentEligibility.alcoholEligible && Intrinsics.e(this.storeId, fulfillmentEligibility.storeId) && this.isSelected == fulfillmentEligibility.isSelected;
    }

    public int hashCode() {
        String str = this.fulfillmentEligibility;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.partnerEligibility;
        return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.alcoholEligible)) * 31) + this.storeId.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    public String toString() {
        return "FulfillmentEligibility(fulfillmentEligibility=" + this.fulfillmentEligibility + ", partnerEligibility=" + this.partnerEligibility + ", alcoholEligible=" + this.alcoholEligible + ", storeId=" + this.storeId + ", isSelected=" + this.isSelected + ')';
    }

    public FulfillmentEligibility(@g(name = "fulfillmentEligibility") String str, @g(name = "partnerEligibility") String str2, @g(name = "alcoholEligible") boolean z10, @g(name = "storeId") String storeId, @g(name = "selected") boolean z11) {
        Intrinsics.j(storeId, "storeId");
        this.fulfillmentEligibility = str;
        this.partnerEligibility = str2;
        this.alcoholEligible = z10;
        this.storeId = storeId;
        this.isSelected = z11;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getAlcoholEligible() {
        return this.alcoholEligible;
    }

    /* renamed from: b, reason: from getter */
    public final String getFulfillmentEligibility() {
        return this.fulfillmentEligibility;
    }

    /* renamed from: c, reason: from getter */
    public final String getPartnerEligibility() {
        return this.partnerEligibility;
    }

    /* renamed from: d, reason: from getter */
    public final String getStoreId() {
        return this.storeId;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public /* synthetic */ FulfillmentEligibility(String str, String str2, boolean z10, String str3, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? false : z11);
    }
}
