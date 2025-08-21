package com.google.android.gms.internal.vision;

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
public class w2 {

    /* renamed from: c, reason: collision with root package name */
    public static final w2 f85499c;

    /* renamed from: d, reason: collision with root package name */
    public static final w2 f85500d;

    /* renamed from: e, reason: collision with root package name */
    public static final w2 f85501e;

    /* renamed from: f, reason: collision with root package name */
    public static final w2 f85502f;

    /* renamed from: g, reason: collision with root package name */
    public static final w2 f85503g;

    /* renamed from: h, reason: collision with root package name */
    public static final w2 f85504h;

    /* renamed from: i, reason: collision with root package name */
    public static final w2 f85505i;

    /* renamed from: j, reason: collision with root package name */
    public static final w2 f85506j;

    /* renamed from: k, reason: collision with root package name */
    public static final w2 f85507k;

    /* renamed from: l, reason: collision with root package name */
    public static final w2 f85508l;

    /* renamed from: m, reason: collision with root package name */
    public static final w2 f85509m;

    /* renamed from: n, reason: collision with root package name */
    public static final w2 f85510n;

    /* renamed from: o, reason: collision with root package name */
    public static final w2 f85511o;

    /* renamed from: p, reason: collision with root package name */
    public static final w2 f85512p;

    /* renamed from: q, reason: collision with root package name */
    public static final w2 f85513q;

    /* renamed from: r, reason: collision with root package name */
    public static final w2 f85514r;

    /* renamed from: s, reason: collision with root package name */
    public static final w2 f85515s;

    /* renamed from: t, reason: collision with root package name */
    public static final w2 f85516t;

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ w2[] f85517u;

    /* renamed from: a, reason: collision with root package name */
    private final z2 f85518a;

    /* renamed from: b, reason: collision with root package name */
    private final int f85519b;

    private w2(String str, int i10, z2 z2Var, int i11) {
        this.f85518a = z2Var;
        this.f85519b = i11;
    }

    static {
        w2 w2Var = new w2("DOUBLE", 0, z2.DOUBLE, 1);
        f85499c = w2Var;
        w2 w2Var2 = new w2("FLOAT", 1, z2.FLOAT, 5);
        f85500d = w2Var2;
        z2 z2Var = z2.LONG;
        final int i10 = 2;
        w2 w2Var3 = new w2("INT64", 2, z2Var, 0);
        f85501e = w2Var3;
        final int i11 = 3;
        w2 w2Var4 = new w2("UINT64", 3, z2Var, 0);
        f85502f = w2Var4;
        z2 z2Var2 = z2.INT;
        w2 w2Var5 = new w2("INT32", 4, z2Var2, 0);
        f85503g = w2Var5;
        w2 w2Var6 = new w2("FIXED64", 5, z2Var, 1);
        f85504h = w2Var6;
        w2 w2Var7 = new w2("FIXED32", 6, z2Var2, 5);
        f85505i = w2Var7;
        w2 w2Var8 = new w2("BOOL", 7, z2.BOOLEAN, 0);
        f85506j = w2Var8;
        final z2 z2Var3 = z2.STRING;
        final String str = "STRING";
        final int i12 = 8;
        w2 w2Var9 = new w2(str, i12, z2Var3, i10) { // from class: com.google.android.gms.internal.vision.v2
            {
                int i13 = 2;
                int i14 = 8;
            }
        };
        f85507k = w2Var9;
        final z2 z2Var4 = z2.MESSAGE;
        final String str2 = "GROUP";
        final int i13 = 9;
        w2 w2Var10 = new w2(str2, i13, z2Var4, i11) { // from class: com.google.android.gms.internal.vision.y2
            {
                int i14 = 3;
                int i15 = 9;
            }
        };
        f85508l = w2Var10;
        final String str3 = "MESSAGE";
        final int i14 = 10;
        final int i15 = 2;
        w2 w2Var11 = new w2(str3, i14, z2Var4, i15) { // from class: com.google.android.gms.internal.vision.x2
            {
                int i16 = 2;
                int i17 = 10;
            }
        };
        f85509m = w2Var11;
        final z2 z2Var5 = z2.BYTE_STRING;
        final String str4 = "BYTES";
        final int i16 = 11;
        w2 w2Var12 = new w2(str4, i16, z2Var5, i15) { // from class: com.google.android.gms.internal.vision.A2
            {
                int i17 = 2;
                int i18 = 11;
            }
        };
        f85510n = w2Var12;
        w2 w2Var13 = new w2("UINT32", 12, z2Var2, 0);
        f85511o = w2Var13;
        w2 w2Var14 = new w2("ENUM", 13, z2.ENUM, 0);
        f85512p = w2Var14;
        w2 w2Var15 = new w2("SFIXED32", 14, z2Var2, 5);
        f85513q = w2Var15;
        w2 w2Var16 = new w2("SFIXED64", 15, z2Var, 1);
        f85514r = w2Var16;
        w2 w2Var17 = new w2("SINT32", 16, z2Var2, 0);
        f85515s = w2Var17;
        w2 w2Var18 = new w2("SINT64", 17, z2Var, 0);
        f85516t = w2Var18;
        f85517u = new w2[]{w2Var, w2Var2, w2Var3, w2Var4, w2Var5, w2Var6, w2Var7, w2Var8, w2Var9, w2Var10, w2Var11, w2Var12, w2Var13, w2Var14, w2Var15, w2Var16, w2Var17, w2Var18};
    }

    public static w2[] values() {
        return (w2[]) f85517u.clone();
    }

    public final z2 a() {
        return this.f85518a;
    }
}
