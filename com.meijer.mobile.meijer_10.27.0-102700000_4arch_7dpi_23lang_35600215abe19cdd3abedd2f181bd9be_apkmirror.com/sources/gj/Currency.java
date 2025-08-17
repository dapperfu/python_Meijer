package gj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\b\u0002\u0010\u0007\u001a\u00060\u0004j\u0002`\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001e\u0010\u0007\u001a\u00060\u0004j\u0002`\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\f¨\u0006\u001e"}, d2 = {"Lgj/a;", "", "", "active", "", "symbol", "Lcom/meijer/mobile/address/model/common/IsoCode;", "isoCode", "name", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getActive", "()Z", "b", "Ljava/lang/String;", "getSymbol", "c", "getIsoCode", "d", "getName", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gj.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class Currency {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean active;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String symbol;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isoCode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    public Currency() {
        this(false, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Currency)) {
            return false;
        }
        Currency currency = (Currency) other;
        return this.active == currency.active && Intrinsics.e(this.symbol, currency.symbol) && Intrinsics.e(this.isoCode, currency.isoCode) && Intrinsics.e(this.name, currency.name);
    }

    public Currency(boolean z10, String symbol, String isoCode, String str) {
        Intrinsics.j(symbol, "symbol");
        Intrinsics.j(isoCode, "isoCode");
        this.active = z10;
        this.symbol = symbol;
        this.isoCode = isoCode;
        this.name = str;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.active) * 31) + this.symbol.hashCode()) * 31) + this.isoCode.hashCode()) * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Currency(active=" + this.active + ", symbol=" + this.symbol + ", isoCode=" + this.isoCode + ", name=" + this.name + ')';
    }

    public /* synthetic */ Currency(boolean z10, String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? null : str3);
    }
}
