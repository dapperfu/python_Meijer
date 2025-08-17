package com.google.protobuf;

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
/* loaded from: classes7.dex */
public final class A {

    /* renamed from: d, reason: collision with root package name */
    public static final A f90399d;

    /* renamed from: e, reason: collision with root package name */
    public static final A f90400e;

    /* renamed from: f, reason: collision with root package name */
    public static final A f90401f;

    /* renamed from: g, reason: collision with root package name */
    public static final A f90402g;

    /* renamed from: h, reason: collision with root package name */
    public static final A f90403h;

    /* renamed from: i, reason: collision with root package name */
    public static final A f90404i;

    /* renamed from: j, reason: collision with root package name */
    public static final A f90405j;

    /* renamed from: k, reason: collision with root package name */
    public static final A f90406k;

    /* renamed from: l, reason: collision with root package name */
    public static final A f90407l;

    /* renamed from: m, reason: collision with root package name */
    public static final A f90408m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ A[] f90409n;

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f90410a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f90411b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f90412c;

    static {
        A a10 = new A("VOID", 0, Void.class, Void.class, null);
        f90399d = a10;
        Class cls = Integer.TYPE;
        A a11 = new A("INT", 1, cls, Integer.class, 0);
        f90400e = a11;
        A a12 = new A("LONG", 2, Long.TYPE, Long.class, 0L);
        f90401f = a12;
        A a13 = new A("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f90402g = a13;
        A a14 = new A("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f90403h = a14;
        A a15 = new A("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f90404i = a15;
        A a16 = new A("STRING", 6, String.class, String.class, "");
        f90405j = a16;
        A a17 = new A("BYTE_STRING", 7, AbstractC11521g.class, AbstractC11521g.class, AbstractC11521g.f90504b);
        f90406k = a17;
        A a18 = new A("ENUM", 8, cls, Integer.class, null);
        f90407l = a18;
        A a19 = new A("MESSAGE", 9, Object.class, Object.class, null);
        f90408m = a19;
        f90409n = new A[]{a10, a11, a12, a13, a14, a15, a16, a17, a18, a19};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f90409n.clone();
    }

    public Class<?> a() {
        return this.f90411b;
    }

    private A(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f90410a = cls;
        this.f90411b = cls2;
        this.f90412c = obj;
    }
}
