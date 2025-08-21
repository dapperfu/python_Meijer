package com.meijer.mobile.cart.model.hybris.orders;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\f\b\u0003\u0010\u0007\u001a\u00060\u0004j\u0002`\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ>\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\f\b\u0003\u0010\u0007\u001a\u00060\u0004j\u0002`\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u001e\u0010\u0007\u001a\u00060\u0004j\u0002`\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0018\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/orders/HybrisCurrency;", "", "", "active", "", "symbol", "Lcom/meijer/mobile/address/model/common/IsoCode;", "isoCode", "name", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/orders/HybrisCurrency;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "d", "c", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HybrisCurrency {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean active;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String symbol;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isoCode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    public HybrisCurrency() {
        this(false, null, null, null, 15, null);
    }

    public final HybrisCurrency copy(@g(name = "active") boolean active, @g(name = "symbol") String symbol, @g(name = "isocode") String isoCode, @g(name = "name") String name) {
        Intrinsics.j(symbol, "symbol");
        Intrinsics.j(isoCode, "isoCode");
        return new HybrisCurrency(active, symbol, isoCode, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisCurrency)) {
            return false;
        }
        HybrisCurrency hybrisCurrency = (HybrisCurrency) other;
        return this.active == hybrisCurrency.active && Intrinsics.e(this.symbol, hybrisCurrency.symbol) && Intrinsics.e(this.isoCode, hybrisCurrency.isoCode) && Intrinsics.e(this.name, hybrisCurrency.name);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.active) * 31) + this.symbol.hashCode()) * 31) + this.isoCode.hashCode()) * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "HybrisCurrency(active=" + this.active + ", symbol=" + this.symbol + ", isoCode=" + this.isoCode + ", name=" + this.name + ')';
    }

    public HybrisCurrency(@g(name = "active") boolean z10, @g(name = "symbol") String symbol, @g(name = "isocode") String isoCode, @g(name = "name") String str) {
        Intrinsics.j(symbol, "symbol");
        Intrinsics.j(isoCode, "isoCode");
        this.active = z10;
        this.symbol = symbol;
        this.isoCode = isoCode;
        this.name = str;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getActive() {
        return this.active;
    }

    /* renamed from: b, reason: from getter */
    public String getIsoCode() {
        return this.isoCode;
    }

    /* renamed from: c, reason: from getter */
    public String getName() {
        return this.name;
    }

    /* renamed from: d, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public /* synthetic */ HybrisCurrency(boolean z10, String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? "" : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? null : str3);
    }
}
