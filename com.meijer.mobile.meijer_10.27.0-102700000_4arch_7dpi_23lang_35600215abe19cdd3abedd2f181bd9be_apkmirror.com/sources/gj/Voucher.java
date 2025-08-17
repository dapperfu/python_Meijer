package gj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010\u0015R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010\u0015R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b3\u0010!\u001a\u0004\b4\u0010\u0015R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b5\u0010!\u001a\u0004\b6\u0010\u0015R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b7\u0010!\u001a\u0004\b8\u0010\u0015¨\u00069"}, d2 = {"Lgj/r;", "", "Lmk/b;", "appliedValue", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "Lgj/a;", "currency", "description", "", "freeShipping", "name", "", "value", "valueFormatted", "valueString", "voucherCode", "<init>", "(Lmk/b;Ljava/lang/String;Lgj/a;Ljava/lang/String;ZLjava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmk/b;", "getAppliedValue", "()Lmk/b;", "b", "Ljava/lang/String;", "getCode", "c", "Lgj/a;", "getCurrency", "()Lgj/a;", "d", "getDescription", "e", "Z", "getFreeShipping", "()Z", "f", "getName", "g", "D", "getValue", "()D", "h", "getValueFormatted", "i", "getValueString", "j", "getVoucherCode", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gj.r, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class Voucher {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final mk.b appliedValue;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Currency currency;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean freeShipping;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final double value;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String valueFormatted;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String valueString;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String voucherCode;

    public Voucher() {
        this(null, null, null, null, false, null, 0.0d, null, null, null, 1023, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Voucher)) {
            return false;
        }
        Voucher voucher = (Voucher) other;
        return Intrinsics.e(this.appliedValue, voucher.appliedValue) && Intrinsics.e(this.code, voucher.code) && Intrinsics.e(this.currency, voucher.currency) && Intrinsics.e(this.description, voucher.description) && this.freeShipping == voucher.freeShipping && Intrinsics.e(this.name, voucher.name) && Double.compare(this.value, voucher.value) == 0 && Intrinsics.e(this.valueFormatted, voucher.valueFormatted) && Intrinsics.e(this.valueString, voucher.valueString) && Intrinsics.e(this.voucherCode, voucher.voucherCode);
    }

    public Voucher(mk.b appliedValue, String code, Currency currency, String str, boolean z10, String str2, double d10, String str3, String str4, String str5) {
        Intrinsics.j(appliedValue, "appliedValue");
        Intrinsics.j(code, "code");
        Intrinsics.j(currency, "currency");
        this.appliedValue = appliedValue;
        this.code = code;
        this.currency = currency;
        this.description = str;
        this.freeShipping = z10;
        this.name = str2;
        this.value = d10;
        this.valueFormatted = str3;
        this.valueString = str4;
        this.voucherCode = str5;
    }

    public int hashCode() {
        int iHashCode = ((((this.appliedValue.hashCode() * 31) + this.code.hashCode()) * 31) + this.currency.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.freeShipping)) * 31;
        String str2 = this.name;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Double.hashCode(this.value)) * 31;
        String str3 = this.valueFormatted;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.valueString;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.voucherCode;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "Voucher(appliedValue=" + this.appliedValue + ", code=" + this.code + ", currency=" + this.currency + ", description=" + this.description + ", freeShipping=" + this.freeShipping + ", name=" + this.name + ", value=" + this.value + ", valueFormatted=" + this.valueFormatted + ", valueString=" + this.valueString + ", voucherCode=" + this.voucherCode + ')';
    }

    public /* synthetic */ Voucher(mk.b bVar, String str, Currency currency, String str2, boolean z10, String str3, double d10, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? Co.l.f(null, null, 0.0d, null, 0.0d, null, 63, null) : bVar, (i10 & 2) != 0 ? "-1" : str, (i10 & 4) != 0 ? new Currency(false, null, null, null, 15, null) : currency, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? 0.0d : d10, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? null : str6);
    }
}
