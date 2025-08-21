package com.google.crypto.tink.shaded.protobuf;

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
/* loaded from: classes8.dex */
public final class A {

    /* renamed from: d, reason: collision with root package name */
    public static final A f89081d;

    /* renamed from: e, reason: collision with root package name */
    public static final A f89082e;

    /* renamed from: f, reason: collision with root package name */
    public static final A f89083f;

    /* renamed from: g, reason: collision with root package name */
    public static final A f89084g;

    /* renamed from: h, reason: collision with root package name */
    public static final A f89085h;

    /* renamed from: i, reason: collision with root package name */
    public static final A f89086i;

    /* renamed from: j, reason: collision with root package name */
    public static final A f89087j;

    /* renamed from: k, reason: collision with root package name */
    public static final A f89088k;

    /* renamed from: l, reason: collision with root package name */
    public static final A f89089l;

    /* renamed from: m, reason: collision with root package name */
    public static final A f89090m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ A[] f89091n;

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f89092a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f89093b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f89094c;

    static {
        A a10 = new A("VOID", 0, Void.class, Void.class, null);
        f89081d = a10;
        Class cls = Integer.TYPE;
        A a11 = new A("INT", 1, cls, Integer.class, 0);
        f89082e = a11;
        A a12 = new A("LONG", 2, Long.TYPE, Long.class, 0L);
        f89083f = a12;
        A a13 = new A("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f89084g = a13;
        A a14 = new A("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f89085h = a14;
        A a15 = new A("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f89086i = a15;
        A a16 = new A("STRING", 6, String.class, String.class, "");
        f89087j = a16;
        A a17 = new A("BYTE_STRING", 7, AbstractC11437h.class, AbstractC11437h.class, AbstractC11437h.f89182b);
        f89088k = a17;
        A a18 = new A("ENUM", 8, cls, Integer.class, null);
        f89089l = a18;
        A a19 = new A("MESSAGE", 9, Object.class, Object.class, null);
        f89090m = a19;
        f89091n = new A[]{a10, a11, a12, a13, a14, a15, a16, a17, a18, a19};
    }

    public static A valueOf(String str) {
        return (A) Enum.valueOf(A.class, str);
    }

    public static A[] values() {
        return (A[]) f89091n.clone();
    }

    public Class<?> a() {
        return this.f89093b;
    }

    private A(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f89092a = cls;
        this.f89093b = cls2;
        this.f89094c = obj;
    }
}
