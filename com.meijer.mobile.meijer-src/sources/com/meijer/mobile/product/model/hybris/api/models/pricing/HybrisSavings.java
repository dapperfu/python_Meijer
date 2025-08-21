package com.meijer.mobile.product.model.hybris.api.models.pricing;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;", "", "", "currencyIso", "", "value", "<init>", "(Ljava/lang/String;D)V", "copy", "(Ljava/lang/String;D)Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisSavings;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "D", "()D", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HybrisSavings {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currencyIso;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double value;

    public HybrisSavings() {
        this(null, 0.0d, 3, null);
    }

    public final HybrisSavings copy(@g(name = "currencyIso") String currencyIso, @g(name = "value") double value) {
        Intrinsics.j(currencyIso, "currencyIso");
        return new HybrisSavings(currencyIso, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisSavings)) {
            return false;
        }
        HybrisSavings hybrisSavings = (HybrisSavings) other;
        return Intrinsics.e(this.currencyIso, hybrisSavings.currencyIso) && Double.compare(this.value, hybrisSavings.value) == 0;
    }

    public int hashCode() {
        return (this.currencyIso.hashCode() * 31) + Double.hashCode(this.value);
    }

    public String toString() {
        return "HybrisSavings(currencyIso=" + this.currencyIso + ", value=" + this.value + ')';
    }

    public HybrisSavings(@g(name = "currencyIso") String currencyIso, @g(name = "value") double d10) {
        Intrinsics.j(currencyIso, "currencyIso");
        this.currencyIso = currencyIso;
        this.value = d10;
    }

    /* renamed from: a, reason: from getter */
    public final String getCurrencyIso() {
        return this.currencyIso;
    }

    /* renamed from: b, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    public /* synthetic */ HybrisSavings(String str, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "USD" : str, (i10 & 2) != 0 ? 0.0d : d10);
    }
}
