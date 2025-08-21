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
public final class Y0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Y0 f85329d;

    /* renamed from: e, reason: collision with root package name */
    public static final Y0 f85330e;

    /* renamed from: f, reason: collision with root package name */
    public static final Y0 f85331f;

    /* renamed from: g, reason: collision with root package name */
    public static final Y0 f85332g;

    /* renamed from: h, reason: collision with root package name */
    public static final Y0 f85333h;

    /* renamed from: i, reason: collision with root package name */
    public static final Y0 f85334i;

    /* renamed from: j, reason: collision with root package name */
    public static final Y0 f85335j;

    /* renamed from: k, reason: collision with root package name */
    public static final Y0 f85336k;

    /* renamed from: l, reason: collision with root package name */
    public static final Y0 f85337l;

    /* renamed from: m, reason: collision with root package name */
    public static final Y0 f85338m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ Y0[] f85339n;

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f85340a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f85341b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f85342c;

    static {
        Y0 y02 = new Y0("VOID", 0, Void.class, Void.class, null);
        f85329d = y02;
        Class cls = Integer.TYPE;
        Y0 y03 = new Y0("INT", 1, cls, Integer.class, 0);
        f85330e = y03;
        Y0 y04 = new Y0("LONG", 2, Long.TYPE, Long.class, 0L);
        f85331f = y04;
        Y0 y05 = new Y0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f85332g = y05;
        Y0 y06 = new Y0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f85333h = y06;
        Y0 y07 = new Y0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f85334i = y07;
        Y0 y08 = new Y0("STRING", 6, String.class, String.class, "");
        f85335j = y08;
        Y0 y09 = new Y0("BYTE_STRING", 7, AbstractC11161h0.class, AbstractC11161h0.class, AbstractC11161h0.f85385b);
        f85336k = y09;
        Y0 y010 = new Y0("ENUM", 8, cls, Integer.class, null);
        f85337l = y010;
        Y0 y011 = new Y0("MESSAGE", 9, Object.class, Object.class, null);
        f85338m = y011;
        f85339n = new Y0[]{y02, y03, y04, y05, y06, y07, y08, y09, y010, y011};
    }

    public static Y0[] values() {
        return (Y0[]) f85339n.clone();
    }

    public final Class<?> a() {
        return this.f85341b;
    }

    private Y0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f85340a = cls;
        this.f85341b = cls2;
        this.f85342c = obj;
    }
}
