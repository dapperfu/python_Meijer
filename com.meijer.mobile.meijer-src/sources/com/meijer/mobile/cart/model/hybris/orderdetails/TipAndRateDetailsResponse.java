package com.meijer.mobile.cart.model.hybris.orderdetails;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipAndRateDetailsResponse;", "", "", "tippablePartner", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipDetailsResponse;", "tipDetails", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/RateDetailsResponse;", "rateDetails", "<init>", "(ZLcom/meijer/mobile/cart/model/hybris/orderdetails/TipDetailsResponse;Lcom/meijer/mobile/cart/model/hybris/orderdetails/RateDetailsResponse;)V", "copy", "(ZLcom/meijer/mobile/cart/model/hybris/orderdetails/TipDetailsResponse;Lcom/meijer/mobile/cart/model/hybris/orderdetails/RateDetailsResponse;)Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipAndRateDetailsResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipDetailsResponse;", "()Lcom/meijer/mobile/cart/model/hybris/orderdetails/TipDetailsResponse;", "Lcom/meijer/mobile/cart/model/hybris/orderdetails/RateDetailsResponse;", "()Lcom/meijer/mobile/cart/model/hybris/orderdetails/RateDetailsResponse;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TipAndRateDetailsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean tippablePartner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TipDetailsResponse tipDetails;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final RateDetailsResponse rateDetails;

    public TipAndRateDetailsResponse() {
        this(false, null, null, 7, null);
    }

    public final TipAndRateDetailsResponse copy(@g(name = "tippablePartner") boolean tippablePartner, @g(name = "tip") TipDetailsResponse tipDetails, @g(name = "rate") RateDetailsResponse rateDetails) {
        Intrinsics.j(tipDetails, "tipDetails");
        Intrinsics.j(rateDetails, "rateDetails");
        return new TipAndRateDetailsResponse(tippablePartner, tipDetails, rateDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipAndRateDetailsResponse)) {
            return false;
        }
        TipAndRateDetailsResponse tipAndRateDetailsResponse = (TipAndRateDetailsResponse) other;
        return this.tippablePartner == tipAndRateDetailsResponse.tippablePartner && Intrinsics.e(this.tipDetails, tipAndRateDetailsResponse.tipDetails) && Intrinsics.e(this.rateDetails, tipAndRateDetailsResponse.rateDetails);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.tippablePartner) * 31) + this.tipDetails.hashCode()) * 31) + this.rateDetails.hashCode();
    }

    public String toString() {
        return "TipAndRateDetailsResponse(tippablePartner=" + this.tippablePartner + ", tipDetails=" + this.tipDetails + ", rateDetails=" + this.rateDetails + ')';
    }

    public TipAndRateDetailsResponse(@g(name = "tippablePartner") boolean z10, @g(name = "tip") TipDetailsResponse tipDetails, @g(name = "rate") RateDetailsResponse rateDetails) {
        Intrinsics.j(tipDetails, "tipDetails");
        Intrinsics.j(rateDetails, "rateDetails");
        this.tippablePartner = z10;
        this.tipDetails = tipDetails;
        this.rateDetails = rateDetails;
    }

    /* renamed from: a, reason: from getter */
    public final RateDetailsResponse getRateDetails() {
        return this.rateDetails;
    }

    /* renamed from: b, reason: from getter */
    public final TipDetailsResponse getTipDetails() {
        return this.tipDetails;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getTippablePartner() {
        return this.tippablePartner;
    }

    public /* synthetic */ TipAndRateDetailsResponse(boolean z10, TipDetailsResponse tipDetailsResponse, RateDetailsResponse rateDetailsResponse, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? new TipDetailsResponse(null, false, false, null, null, null, null, 0.0d, null, 511, null) : tipDetailsResponse, (i10 & 4) != 0 ? new RateDetailsResponse(false, 0, null, 7, null) : rateDetailsResponse);
    }
}
