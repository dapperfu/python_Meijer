package gk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014j\u0002\b\u000ej\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u0010j\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lgk/h;", "", "", "brand", "codeName", "codeNum", "", "validCvvLength", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "e", "c", "l", "d", "I", "o", "()I", "f", "g", "h", "i", "j", "k", "m", "n", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final h f133750e = new h("Visa", 0, "Visa", "visa", "001", 0, 8, null);

    /* renamed from: f, reason: collision with root package name */
    public static final h f133751f = new h("Mastercard", 1, "Mastercard", "master", "002", 0, 8, null);

    /* renamed from: g, reason: collision with root package name */
    public static final h f133752g = new h("AmericanExpress", 2, "American Express", "amex", "003", 4);

    /* renamed from: h, reason: collision with root package name */
    public static final h f133753h = new h("Discover", 3, "Discover", "discover", "004", 0, 8, null);

    /* renamed from: i, reason: collision with root package name */
    public static final h f133754i = new h("DinersClub", 4, "Diner's Club", "diners", "005", 0, 8, null);

    /* renamed from: j, reason: collision with root package name */
    public static final h f133755j = new h("MeijerCreditCard", 5, "Meijer Credit Card", "meijerCreditCard", "006", 0, 8, null);

    /* renamed from: k, reason: collision with root package name */
    public static final h f133756k = new h("MeijerMasterCard", 6, "Meijer Master Card", "meijerMasterCard", "024", 0, 8, null);

    /* renamed from: l, reason: collision with root package name */
    public static final h f133757l = new h("Maestro", 7, "Meijer Credit Card", "maestro", "024", 0, 8, null);

    /* renamed from: m, reason: collision with root package name */
    public static final h f133758m = new h("EBT", 8, "EBT ", "ebt", "", 0, 8, null);

    /* renamed from: n, reason: collision with root package name */
    public static final h f133759n = new h("Switch", 9, "Switch", "switch", "???", 0, 8, null);

    /* renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ h[] f133760o;

    /* renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f133761p;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String brand;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String codeName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String codeNum;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int validCvvLength;

    private h(String str, int i10, String str2, String str3, String str4, int i11) {
        this.brand = str2;
        this.codeName = str3;
        this.codeNum = str4;
        this.validCvvLength = i11;
    }

    public static EnumEntries<h> m() {
        return f133761p;
    }

    static {
        h[] hVarArrA = a();
        f133760o = hVarArrA;
        f133761p = EnumEntriesKt.a(hVarArrA);
    }

    private static final /* synthetic */ h[] a() {
        return new h[]{f133750e, f133751f, f133752g, f133753h, f133754i, f133755j, f133756k, f133757l, f133758m, f133759n};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f133760o.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* renamed from: e, reason: from getter */
    public final String getCodeName() {
        return this.codeName;
    }

    /* renamed from: l, reason: from getter */
    public final String getCodeNum() {
        return this.codeNum;
    }

    /* renamed from: o, reason: from getter */
    public final int getValidCvvLength() {
        return this.validCvvLength;
    }

    /* synthetic */ h(String str, int i10, String str2, String str3, String str4, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i10, str2, str3, str4, (i12 & 8) != 0 ? 3 : i11);
    }
}
