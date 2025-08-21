package Op;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import xg.C18179a;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0019\u0010!\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b\u0016\u0010\u000f¨\u0006\""}, d2 = {"LOp/o;", "", "", "format", "", "formatName", "displayValue", "rawValue", "normalizedValue", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lxg/a;", "barcode", "(Lxg/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getFormat", "b", "Ljava/lang/String;", "c", "getDisplayValue", "d", "getRawValue", "e", "f", "barcodeString", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Op.o, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ScannedBarcode {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int format;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String formatName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String displayValue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rawValue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String normalizedValue;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String barcodeString;

    public ScannedBarcode(int i10, String formatName, String str, String str2, String normalizedValue) {
        Intrinsics.j(formatName, "formatName");
        Intrinsics.j(normalizedValue, "normalizedValue");
        this.format = i10;
        this.formatName = formatName;
        this.displayValue = str;
        this.rawValue = str2;
        this.normalizedValue = normalizedValue;
        normalizedValue = StringsKt.s0(normalizedValue) ? null : normalizedValue;
        if (normalizedValue != null) {
            str = normalizedValue;
        } else if (str == null) {
            str = str2;
        }
        this.barcodeString = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScannedBarcode)) {
            return false;
        }
        ScannedBarcode scannedBarcode = (ScannedBarcode) other;
        return this.format == scannedBarcode.format && Intrinsics.e(this.formatName, scannedBarcode.formatName) && Intrinsics.e(this.displayValue, scannedBarcode.displayValue) && Intrinsics.e(this.rawValue, scannedBarcode.rawValue) && Intrinsics.e(this.normalizedValue, scannedBarcode.normalizedValue);
    }

    /* renamed from: a, reason: from getter */
    public final String getBarcodeString() {
        return this.barcodeString;
    }

    /* renamed from: b, reason: from getter */
    public final String getFormatName() {
        return this.formatName;
    }

    /* renamed from: c, reason: from getter */
    public final String getNormalizedValue() {
        return this.normalizedValue;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.format) * 31) + this.formatName.hashCode()) * 31;
        String str = this.displayValue;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rawValue;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.normalizedValue.hashCode();
    }

    public String toString() {
        return "ScannedBarcode(format=" + this.format + ", formatName=" + this.formatName + ", displayValue=" + this.displayValue + ", rawValue=" + this.rawValue + ", normalizedValue=" + this.normalizedValue + ')';
    }

    public /* synthetic */ ScannedBarcode(int i10, String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? c.b(i10) : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScannedBarcode(C18179a barcode) {
        this(barcode.c(), null, barcode.b(), barcode.d(), Mp.e.a(barcode), 2, null);
        Intrinsics.j(barcode, "barcode");
    }
}
