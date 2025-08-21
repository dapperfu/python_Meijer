package hj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lhj/m;", "", "", "averagePoundEach", "currencyIso", "formattedValue", "priceType", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAveragePoundEach", "b", "getCurrencyIso", "c", "d", "getPriceType", "e", "D", "getValue", "()D", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hj.m, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class TipAmount {

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

    public TipAmount() {
        this(null, null, null, null, 0.0d, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TipAmount)) {
            return false;
        }
        TipAmount tipAmount = (TipAmount) other;
        return Intrinsics.e(this.averagePoundEach, tipAmount.averagePoundEach) && Intrinsics.e(this.currencyIso, tipAmount.currencyIso) && Intrinsics.e(this.formattedValue, tipAmount.formattedValue) && Intrinsics.e(this.priceType, tipAmount.priceType) && Double.compare(this.value, tipAmount.value) == 0;
    }

    public TipAmount(String averagePoundEach, String currencyIso, String formattedValue, String priceType, double d10) {
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
    public final String getFormattedValue() {
        return this.formattedValue;
    }

    public int hashCode() {
        return (((((((this.averagePoundEach.hashCode() * 31) + this.currencyIso.hashCode()) * 31) + this.formattedValue.hashCode()) * 31) + this.priceType.hashCode()) * 31) + Double.hashCode(this.value);
    }

    public String toString() {
        return "TipAmount(averagePoundEach=" + this.averagePoundEach + ", currencyIso=" + this.currencyIso + ", formattedValue=" + this.formattedValue + ", priceType=" + this.priceType + ", value=" + this.value + ')';
    }

    public /* synthetic */ TipAmount(String str, String str2, String str3, String str4, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4, (i10 & 16) != 0 ? 0.0d : d10);
    }
}
