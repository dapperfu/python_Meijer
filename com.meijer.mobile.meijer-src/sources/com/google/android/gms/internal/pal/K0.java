package com.google.android.gms.internal.pal;

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
public final class K0 {

    /* renamed from: d, reason: collision with root package name */
    public static final K0 f83532d;

    /* renamed from: e, reason: collision with root package name */
    public static final K0 f83533e;

    /* renamed from: f, reason: collision with root package name */
    public static final K0 f83534f;

    /* renamed from: g, reason: collision with root package name */
    public static final K0 f83535g;

    /* renamed from: h, reason: collision with root package name */
    public static final K0 f83536h;

    /* renamed from: i, reason: collision with root package name */
    public static final K0 f83537i;

    /* renamed from: j, reason: collision with root package name */
    public static final K0 f83538j;

    /* renamed from: k, reason: collision with root package name */
    public static final K0 f83539k;

    /* renamed from: l, reason: collision with root package name */
    public static final K0 f83540l;

    /* renamed from: m, reason: collision with root package name */
    public static final K0 f83541m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ K0[] f83542n;

    /* renamed from: a, reason: collision with root package name */
    private final Class f83543a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f83544b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f83545c;

    public final Class a() {
        return this.f83544b;
    }

    static {
        K0 k02 = new K0("VOID", 0, Void.class, Void.class, null);
        f83532d = k02;
        Class cls = Integer.TYPE;
        K0 k03 = new K0("INT", 1, cls, Integer.class, 0);
        f83533e = k03;
        K0 k04 = new K0("LONG", 2, Long.TYPE, Long.class, 0L);
        f83534f = k04;
        K0 k05 = new K0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f83535g = k05;
        K0 k06 = new K0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f83536h = k06;
        K0 k07 = new K0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f83537i = k07;
        K0 k08 = new K0("STRING", 6, String.class, String.class, "");
        f83538j = k08;
        K0 k09 = new K0("BYTE_STRING", 7, AbstractC10730b0.class, AbstractC10730b0.class, AbstractC10730b0.f83895b);
        f83539k = k09;
        K0 k010 = new K0("ENUM", 8, cls, Integer.class, null);
        f83540l = k010;
        K0 k011 = new K0("MESSAGE", 9, Object.class, Object.class, null);
        f83541m = k011;
        f83542n = new K0[]{k02, k03, k04, k05, k06, k07, k08, k09, k010, k011};
    }

    public static K0[] values() {
        return (K0[]) f83542n.clone();
    }

    private K0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f83543a = cls;
        this.f83544b = cls2;
        this.f83545c = obj;
    }
}
