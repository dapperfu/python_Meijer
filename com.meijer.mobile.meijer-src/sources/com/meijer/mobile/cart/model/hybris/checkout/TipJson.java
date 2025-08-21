package com.meijer.mobile.cart.model.hybris.checkout;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/checkout/TipJson;", "", "", "percent", "", "value", "<init>", "(ZD)V", "copy", "(ZD)Lcom/meijer/mobile/cart/model/hybris/checkout/TipJson;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "D", "()D", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TipJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean percent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final double value;

    public final TipJson copy(@g(name = "percent") boolean percent, @g(name = "value") double value) {
        return new TipJson(percent, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipJson)) {
            return false;
        }
        TipJson tipJson = (TipJson) other;
        return this.percent == tipJson.percent && Double.compare(this.value, tipJson.value) == 0;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.percent) * 31) + Double.hashCode(this.value);
    }

    public String toString() {
        return "TipJson(percent=" + this.percent + ", value=" + this.value + ')';
    }

    /* renamed from: a, reason: from getter */
    public final boolean getPercent() {
        return this.percent;
    }

    /* renamed from: b, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    public TipJson(@g(name = "percent") boolean z10, @g(name = "value") double d10) {
        this.percent = z10;
        this.value = d10;
    }
}
