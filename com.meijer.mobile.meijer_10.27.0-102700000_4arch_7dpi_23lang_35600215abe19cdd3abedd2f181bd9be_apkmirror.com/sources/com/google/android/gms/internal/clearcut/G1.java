package com.google.android.gms.internal.clearcut;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public class G1 {

    /* renamed from: c, reason: collision with root package name */
    public static final G1 f81113c;

    /* renamed from: d, reason: collision with root package name */
    public static final G1 f81114d;

    /* renamed from: e, reason: collision with root package name */
    public static final G1 f81115e;

    /* renamed from: f, reason: collision with root package name */
    public static final G1 f81116f;

    /* renamed from: g, reason: collision with root package name */
    public static final G1 f81117g;

    /* renamed from: h, reason: collision with root package name */
    public static final G1 f81118h;

    /* renamed from: i, reason: collision with root package name */
    public static final G1 f81119i;

    /* renamed from: j, reason: collision with root package name */
    public static final G1 f81120j;

    /* renamed from: k, reason: collision with root package name */
    public static final G1 f81121k;

    /* renamed from: l, reason: collision with root package name */
    public static final G1 f81122l;

    /* renamed from: m, reason: collision with root package name */
    public static final G1 f81123m;

    /* renamed from: n, reason: collision with root package name */
    public static final G1 f81124n;

    /* renamed from: o, reason: collision with root package name */
    public static final G1 f81125o;

    /* renamed from: p, reason: collision with root package name */
    public static final G1 f81126p;

    /* renamed from: q, reason: collision with root package name */
    public static final G1 f81127q;

    /* renamed from: r, reason: collision with root package name */
    public static final G1 f81128r;

    /* renamed from: s, reason: collision with root package name */
    public static final G1 f81129s;

    /* renamed from: t, reason: collision with root package name */
    public static final G1 f81130t;

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ G1[] f81131u;

    /* renamed from: a, reason: collision with root package name */
    private final L1 f81132a;

    /* renamed from: b, reason: collision with root package name */
    private final int f81133b;

    static {
        G1 g12 = new G1("DOUBLE", 0, L1.DOUBLE, 1);
        f81113c = g12;
        G1 g13 = new G1("FLOAT", 1, L1.FLOAT, 5);
        f81114d = g13;
        L1 l12 = L1.LONG;
        final int i10 = 2;
        G1 g14 = new G1("INT64", 2, l12, 0);
        f81115e = g14;
        final int i11 = 3;
        G1 g15 = new G1("UINT64", 3, l12, 0);
        f81116f = g15;
        L1 l13 = L1.INT;
        G1 g16 = new G1("INT32", 4, l13, 0);
        f81117g = g16;
        G1 g17 = new G1("FIXED64", 5, l12, 1);
        f81118h = g17;
        G1 g18 = new G1("FIXED32", 6, l13, 5);
        f81119i = g18;
        G1 g19 = new G1("BOOL", 7, L1.BOOLEAN, 0);
        f81120j = g19;
        final L1 l14 = L1.STRING;
        final String str = "STRING";
        final int i12 = 8;
        G1 g110 = new G1(str, i12, l14, i10) { // from class: com.google.android.gms.internal.clearcut.H1
            {
                int i13 = 2;
                int i14 = 8;
            }
        };
        f81121k = g110;
        final L1 l15 = L1.MESSAGE;
        final String str2 = "GROUP";
        final int i13 = 9;
        G1 g111 = new G1(str2, i13, l15, i11) { // from class: com.google.android.gms.internal.clearcut.I1
            {
                int i14 = 3;
                int i15 = 9;
            }
        };
        f81122l = g111;
        final String str3 = "MESSAGE";
        final int i14 = 10;
        final int i15 = 2;
        G1 g112 = new G1(str3, i14, l15, i15) { // from class: com.google.android.gms.internal.clearcut.J1
            {
                int i16 = 2;
                int i17 = 10;
            }
        };
        f81123m = g112;
        final L1 l16 = L1.BYTE_STRING;
        final String str4 = "BYTES";
        final int i16 = 11;
        G1 g113 = new G1(str4, i16, l16, i15) { // from class: com.google.android.gms.internal.clearcut.K1
            {
                int i17 = 2;
                int i18 = 11;
            }
        };
        f81124n = g113;
        G1 g114 = new G1("UINT32", 12, l13, 0);
        f81125o = g114;
        G1 g115 = new G1("ENUM", 13, L1.ENUM, 0);
        f81126p = g115;
        G1 g116 = new G1("SFIXED32", 14, l13, 5);
        f81127q = g116;
        G1 g117 = new G1("SFIXED64", 15, l12, 1);
        f81128r = g117;
        G1 g118 = new G1("SINT32", 16, l13, 0);
        f81129s = g118;
        G1 g119 = new G1("SINT64", 17, l12, 0);
        f81130t = g119;
        f81131u = new G1[]{g12, g13, g14, g15, g16, g17, g18, g19, g110, g111, g112, g113, g114, g115, g116, g117, g118, g119};
    }

    private G1(String str, int i10, L1 l12, int i11) {
        this.f81132a = l12;
        this.f81133b = i11;
    }

    public static G1[] values() {
        return (G1[]) f81131u.clone();
    }

    public final L1 a() {
        return this.f81132a;
    }
}
