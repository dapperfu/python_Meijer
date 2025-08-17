package com.meijer.mobile.cart.model.hybris.orderdetails;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orderdetails/RateDetailsResponse;", "", "", "rated", "", "rating", "", "date", "<init>", "(ZILjava/lang/String;)V", "copy", "(ZILjava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/orderdetails/RateDetailsResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "I", "c", "Ljava/lang/String;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RateDetailsResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean rated;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int rating;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String date;

    public RateDetailsResponse() {
        this(false, 0, null, 7, null);
    }

    public final RateDetailsResponse copy(@g(name = "rated") boolean rated, @g(name = "rating") int rating, @g(name = "date") String date) {
        return new RateDetailsResponse(rated, rating, date);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RateDetailsResponse)) {
            return false;
        }
        RateDetailsResponse rateDetailsResponse = (RateDetailsResponse) other;
        return this.rated == rateDetailsResponse.rated && this.rating == rateDetailsResponse.rating && Intrinsics.e(this.date, rateDetailsResponse.date);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.rated) * 31) + Integer.hashCode(this.rating)) * 31;
        String str = this.date;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RateDetailsResponse(rated=" + this.rated + ", rating=" + this.rating + ", date=" + this.date + ')';
    }

    public RateDetailsResponse(@g(name = "rated") boolean z10, @g(name = "rating") int i10, @g(name = "date") String str) {
        this.rated = z10;
        this.rating = i10;
        this.date = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getRated() {
        return this.rated;
    }

    /* renamed from: c, reason: from getter */
    public final int getRating() {
        return this.rating;
    }

    public /* synthetic */ RateDetailsResponse(boolean z10, int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? null : str);
    }
}
