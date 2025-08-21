package com.google.android.gms.internal.pal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'd' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class Z1 {

    /* renamed from: b, reason: collision with root package name */
    public static final Z1 f83824b;

    /* renamed from: c, reason: collision with root package name */
    public static final Z1 f83825c;

    /* renamed from: d, reason: collision with root package name */
    public static final Z1 f83826d;

    /* renamed from: e, reason: collision with root package name */
    public static final Z1 f83827e;

    /* renamed from: f, reason: collision with root package name */
    public static final Z1 f83828f;

    /* renamed from: g, reason: collision with root package name */
    public static final Z1 f83829g;

    /* renamed from: h, reason: collision with root package name */
    public static final Z1 f83830h;

    /* renamed from: i, reason: collision with root package name */
    public static final Z1 f83831i;

    /* renamed from: j, reason: collision with root package name */
    public static final Z1 f83832j;

    /* renamed from: k, reason: collision with root package name */
    public static final Z1 f83833k;

    /* renamed from: l, reason: collision with root package name */
    public static final Z1 f83834l;

    /* renamed from: m, reason: collision with root package name */
    public static final Z1 f83835m;

    /* renamed from: n, reason: collision with root package name */
    public static final Z1 f83836n;

    /* renamed from: o, reason: collision with root package name */
    public static final Z1 f83837o;

    /* renamed from: p, reason: collision with root package name */
    public static final Z1 f83838p;

    /* renamed from: q, reason: collision with root package name */
    public static final Z1 f83839q;

    /* renamed from: r, reason: collision with root package name */
    public static final Z1 f83840r;

    /* renamed from: s, reason: collision with root package name */
    public static final Z1 f83841s;

    /* renamed from: t, reason: collision with root package name */
    private static final /* synthetic */ Z1[] f83842t;

    /* renamed from: a, reason: collision with root package name */
    private final EnumC10715a2 f83843a;

    public final EnumC10715a2 a() {
        return this.f83843a;
    }

    static {
        Z1 z12 = new Z1("DOUBLE", 0, EnumC10715a2.DOUBLE, 1);
        f83824b = z12;
        Z1 z13 = new Z1("FLOAT", 1, EnumC10715a2.FLOAT, 5);
        f83825c = z13;
        EnumC10715a2 enumC10715a2 = EnumC10715a2.LONG;
        Z1 z14 = new Z1("INT64", 2, enumC10715a2, 0);
        f83826d = z14;
        Z1 z15 = new Z1("UINT64", 3, enumC10715a2, 0);
        f83827e = z15;
        EnumC10715a2 enumC10715a22 = EnumC10715a2.INT;
        Z1 z16 = new Z1("INT32", 4, enumC10715a22, 0);
        f83828f = z16;
        Z1 z17 = new Z1("FIXED64", 5, enumC10715a2, 1);
        f83829g = z17;
        Z1 z18 = new Z1("FIXED32", 6, enumC10715a22, 5);
        f83830h = z18;
        Z1 z19 = new Z1("BOOL", 7, EnumC10715a2.BOOLEAN, 0);
        f83831i = z19;
        Z1 z110 = new Z1("STRING", 8, EnumC10715a2.STRING, 2);
        f83832j = z110;
        EnumC10715a2 enumC10715a23 = EnumC10715a2.MESSAGE;
        Z1 z111 = new Z1("GROUP", 9, enumC10715a23, 3);
        f83833k = z111;
        Z1 z112 = new Z1("MESSAGE", 10, enumC10715a23, 2);
        f83834l = z112;
        Z1 z113 = new Z1("BYTES", 11, EnumC10715a2.BYTE_STRING, 2);
        f83835m = z113;
        Z1 z114 = new Z1("UINT32", 12, enumC10715a22, 0);
        f83836n = z114;
        Z1 z115 = new Z1("ENUM", 13, EnumC10715a2.ENUM, 0);
        f83837o = z115;
        Z1 z116 = new Z1("SFIXED32", 14, enumC10715a22, 5);
        f83838p = z116;
        Z1 z117 = new Z1("SFIXED64", 15, enumC10715a2, 1);
        f83839q = z117;
        Z1 z118 = new Z1("SINT32", 16, enumC10715a22, 0);
        f83840r = z118;
        Z1 z119 = new Z1("SINT64", 17, enumC10715a2, 0);
        f83841s = z119;
        f83842t = new Z1[]{z12, z13, z14, z15, z16, z17, z18, z19, z110, z111, z112, z113, z114, z115, z116, z117, z118, z119};
    }

    public static Z1[] values() {
        return (Z1[]) f83842t.clone();
    }

    private Z1(String str, int i10, EnumC10715a2 enumC10715a2, int i11) {
        this.f83843a = enumC10715a2;
    }
}
