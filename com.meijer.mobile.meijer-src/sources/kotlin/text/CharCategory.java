package kotlin.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b,\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/¨\u00060"}, d2 = {"Lkotlin/text/CharCategory;", "", "", "value", "", "code", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "a", "I", "getValue", "()I", "b", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "c", "Companion", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CharCategory {

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ CharCategory[] f148243H;

    /* renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f148244I;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String code;

    /* renamed from: d, reason: collision with root package name */
    public static final CharCategory f148246d = new CharCategory("UNASSIGNED", 0, 0, "Cn");

    /* renamed from: e, reason: collision with root package name */
    public static final CharCategory f148247e = new CharCategory("UPPERCASE_LETTER", 1, 1, "Lu");

    /* renamed from: f, reason: collision with root package name */
    public static final CharCategory f148248f = new CharCategory("LOWERCASE_LETTER", 2, 2, "Ll");

    /* renamed from: g, reason: collision with root package name */
    public static final CharCategory f148249g = new CharCategory("TITLECASE_LETTER", 3, 3, "Lt");

    /* renamed from: h, reason: collision with root package name */
    public static final CharCategory f148250h = new CharCategory("MODIFIER_LETTER", 4, 4, "Lm");

    /* renamed from: i, reason: collision with root package name */
    public static final CharCategory f148251i = new CharCategory("OTHER_LETTER", 5, 5, "Lo");

    /* renamed from: j, reason: collision with root package name */
    public static final CharCategory f148252j = new CharCategory("NON_SPACING_MARK", 6, 6, "Mn");

    /* renamed from: k, reason: collision with root package name */
    public static final CharCategory f148253k = new CharCategory("ENCLOSING_MARK", 7, 7, "Me");

    /* renamed from: l, reason: collision with root package name */
    public static final CharCategory f148254l = new CharCategory("COMBINING_SPACING_MARK", 8, 8, "Mc");

    /* renamed from: m, reason: collision with root package name */
    public static final CharCategory f148255m = new CharCategory("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd");

    /* renamed from: n, reason: collision with root package name */
    public static final CharCategory f148256n = new CharCategory("LETTER_NUMBER", 10, 10, "Nl");

    /* renamed from: o, reason: collision with root package name */
    public static final CharCategory f148257o = new CharCategory("OTHER_NUMBER", 11, 11, "No");

    /* renamed from: p, reason: collision with root package name */
    public static final CharCategory f148258p = new CharCategory("SPACE_SEPARATOR", 12, 12, "Zs");

    /* renamed from: q, reason: collision with root package name */
    public static final CharCategory f148259q = new CharCategory("LINE_SEPARATOR", 13, 13, "Zl");

    /* renamed from: r, reason: collision with root package name */
    public static final CharCategory f148260r = new CharCategory("PARAGRAPH_SEPARATOR", 14, 14, "Zp");

    /* renamed from: s, reason: collision with root package name */
    public static final CharCategory f148261s = new CharCategory("CONTROL", 15, 15, "Cc");

    /* renamed from: t, reason: collision with root package name */
    public static final CharCategory f148262t = new CharCategory("FORMAT", 16, 16, "Cf");

    /* renamed from: u, reason: collision with root package name */
    public static final CharCategory f148263u = new CharCategory("PRIVATE_USE", 17, 18, "Co");

    /* renamed from: v, reason: collision with root package name */
    public static final CharCategory f148264v = new CharCategory("SURROGATE", 18, 19, "Cs");

    /* renamed from: w, reason: collision with root package name */
    public static final CharCategory f148265w = new CharCategory("DASH_PUNCTUATION", 19, 20, "Pd");

    /* renamed from: x, reason: collision with root package name */
    public static final CharCategory f148266x = new CharCategory("START_PUNCTUATION", 20, 21, "Ps");

    /* renamed from: y, reason: collision with root package name */
    public static final CharCategory f148267y = new CharCategory("END_PUNCTUATION", 21, 22, "Pe");

    /* renamed from: z, reason: collision with root package name */
    public static final CharCategory f148268z = new CharCategory("CONNECTOR_PUNCTUATION", 22, 23, "Pc");

    /* renamed from: A, reason: collision with root package name */
    public static final CharCategory f148236A = new CharCategory("OTHER_PUNCTUATION", 23, 24, "Po");

    /* renamed from: B, reason: collision with root package name */
    public static final CharCategory f148237B = new CharCategory("MATH_SYMBOL", 24, 25, "Sm");

    /* renamed from: C, reason: collision with root package name */
    public static final CharCategory f148238C = new CharCategory("CURRENCY_SYMBOL", 25, 26, "Sc");

    /* renamed from: D, reason: collision with root package name */
    public static final CharCategory f148239D = new CharCategory("MODIFIER_SYMBOL", 26, 27, "Sk");

    /* renamed from: E, reason: collision with root package name */
    public static final CharCategory f148240E = new CharCategory("OTHER_SYMBOL", 27, 28, "So");

    /* renamed from: F, reason: collision with root package name */
    public static final CharCategory f148241F = new CharCategory("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi");

    /* renamed from: G, reason: collision with root package name */
    public static final CharCategory f148242G = new CharCategory("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf");

    private static final /* synthetic */ CharCategory[] a() {
        return new CharCategory[]{f148246d, f148247e, f148248f, f148249g, f148250h, f148251i, f148252j, f148253k, f148254l, f148255m, f148256n, f148257o, f148258p, f148259q, f148260r, f148261s, f148262t, f148263u, f148264v, f148265w, f148266x, f148267y, f148268z, f148236A, f148237B, f148238C, f148239D, f148240E, f148241F, f148242G};
    }

    static {
        CharCategory[] charCategoryArrA = a();
        f148243H = charCategoryArrA;
        f148244I = EnumEntriesKt.a(charCategoryArrA);
        INSTANCE = new Companion(null);
    }

    public static CharCategory valueOf(String str) {
        return (CharCategory) Enum.valueOf(CharCategory.class, str);
    }

    public static CharCategory[] values() {
        return (CharCategory[]) f148243H.clone();
    }

    private CharCategory(String str, int i10, int i11, String str2) {
        this.value = i11;
        this.code = str2;
    }
}
