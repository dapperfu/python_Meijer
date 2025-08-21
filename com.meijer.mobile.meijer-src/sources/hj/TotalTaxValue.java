package hj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lhj/q;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "Lnk/b;", "value", "currencyIso", "<init>", "(Ljava/lang/String;Lnk/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCode", "b", "Lnk/b;", "getValue", "()Lnk/b;", "c", "getCurrencyIso", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hj.q, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class TotalTaxValue {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.b value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String currencyIso;

    public TotalTaxValue() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TotalTaxValue)) {
            return false;
        }
        TotalTaxValue totalTaxValue = (TotalTaxValue) other;
        return Intrinsics.e(this.code, totalTaxValue.code) && Intrinsics.e(this.value, totalTaxValue.value) && Intrinsics.e(this.currencyIso, totalTaxValue.currencyIso);
    }

    public TotalTaxValue(String code, nk.b value, String currencyIso) {
        Intrinsics.j(code, "code");
        Intrinsics.j(value, "value");
        Intrinsics.j(currencyIso, "currencyIso");
        this.code = code;
        this.value = value;
        this.currencyIso = currencyIso;
    }

    public int hashCode() {
        return (((this.code.hashCode() * 31) + this.value.hashCode()) * 31) + this.currencyIso.hashCode();
    }

    public String toString() {
        return "TotalTaxValue(code=" + this.code + ", value=" + this.value + ", currencyIso=" + this.currencyIso + ')';
    }

    public /* synthetic */ TotalTaxValue(String str, nk.b bVar, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "-1" : str, (i10 & 2) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar, (i10 & 4) != 0 ? "" : str2);
    }
}
