package com.meijer.mobile.cart.model.hybris.orderdetails;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJB\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTipAmount;", "", "", "averagePoundEach", "currencyIso", "formattedValue", "priceType", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)Lcom/meijer/mobile/cart/model/hybris/orderdetails/HybrisTipAmount;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "D", "()D", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HybrisTipAmount {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String averagePoundEach;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currencyIso;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String formattedValue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String priceType;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double value;

    public HybrisTipAmount() {
        this(null, null, null, null, 0.0d, 31, null);
    }

    public final HybrisTipAmount copy(@g(name = "averagePoundEach") String averagePoundEach, @g(name = "currencyIso") String currencyIso, @g(name = "formattedValue") String formattedValue, @g(name = "priceType") String priceType, @g(name = "value") double value) {
        Intrinsics.j(averagePoundEach, "averagePoundEach");
        Intrinsics.j(currencyIso, "currencyIso");
        Intrinsics.j(formattedValue, "formattedValue");
        Intrinsics.j(priceType, "priceType");
        return new HybrisTipAmount(averagePoundEach, currencyIso, formattedValue, priceType, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisTipAmount)) {
            return false;
        }
        HybrisTipAmount hybrisTipAmount = (HybrisTipAmount) other;
        return Intrinsics.e(this.averagePoundEach, hybrisTipAmount.averagePoundEach) && Intrinsics.e(this.currencyIso, hybrisTipAmount.currencyIso) && Intrinsics.e(this.formattedValue, hybrisTipAmount.formattedValue) && Intrinsics.e(this.priceType, hybrisTipAmount.priceType) && Double.compare(this.value, hybrisTipAmount.value) == 0;
    }

    public int hashCode() {
        return (((((((this.averagePoundEach.hashCode() * 31) + this.currencyIso.hashCode()) * 31) + this.formattedValue.hashCode()) * 31) + this.priceType.hashCode()) * 31) + Double.hashCode(this.value);
    }

    public String toString() {
        return "HybrisTipAmount(averagePoundEach=" + this.averagePoundEach + ", currencyIso=" + this.currencyIso + ", formattedValue=" + this.formattedValue + ", priceType=" + this.priceType + ", value=" + this.value + ')';
    }

    public HybrisTipAmount(@g(name = "averagePoundEach") String averagePoundEach, @g(name = "currencyIso") String currencyIso, @g(name = "formattedValue") String formattedValue, @g(name = "priceType") String priceType, @g(name = "value") double d10) {
        Intrinsics.j(averagePoundEach, "averagePoundEach");
        Intrinsics.j(currencyIso, "currencyIso");
        Intrinsics.j(formattedValue, "formattedValue");
        Intrinsics.j(priceType, "priceType");
        this.averagePoundEach = averagePoundEach;
        this.currencyIso = currencyIso;
        this.formattedValue = formattedValue;
        this.priceType = priceType;
        this.value = d10;
    }

    /* renamed from: a, reason: from getter */
    public final String getAveragePoundEach() {
        return this.averagePoundEach;
    }

    /* renamed from: b, reason: from getter */
    public final String getCurrencyIso() {
        return this.currencyIso;
    }

    /* renamed from: c, reason: from getter */
    public final String getFormattedValue() {
        return this.formattedValue;
    }

    /* renamed from: d, reason: from getter */
    public final String getPriceType() {
        return this.priceType;
    }

    /* renamed from: e, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    public /* synthetic */ HybrisTipAmount(String str, String str2, String str3, String str4, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? 0.0d : d10);
    }
}
