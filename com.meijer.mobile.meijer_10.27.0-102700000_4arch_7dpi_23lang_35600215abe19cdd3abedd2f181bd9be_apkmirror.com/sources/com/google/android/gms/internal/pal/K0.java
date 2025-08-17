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
    public static final K0 f82692d;

    /* renamed from: e, reason: collision with root package name */
    public static final K0 f82693e;

    /* renamed from: f, reason: collision with root package name */
    public static final K0 f82694f;

    /* renamed from: g, reason: collision with root package name */
    public static final K0 f82695g;

    /* renamed from: h, reason: collision with root package name */
    public static final K0 f82696h;

    /* renamed from: i, reason: collision with root package name */
    public static final K0 f82697i;

    /* renamed from: j, reason: collision with root package name */
    public static final K0 f82698j;

    /* renamed from: k, reason: collision with root package name */
    public static final K0 f82699k;

    /* renamed from: l, reason: collision with root package name */
    public static final K0 f82700l;

    /* renamed from: m, reason: collision with root package name */
    public static final K0 f82701m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ K0[] f82702n;

    /* renamed from: a, reason: collision with root package name */
    private final Class f82703a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f82704b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f82705c;

    public final Class a() {
        return this.f82704b;
    }

    static {
        K0 k02 = new K0("VOID", 0, Void.class, Void.class, null);
        f82692d = k02;
        Class cls = Integer.TYPE;
        K0 k03 = new K0("INT", 1, cls, Integer.class, 0);
        f82693e = k03;
        K0 k04 = new K0("LONG", 2, Long.TYPE, Long.class, 0L);
        f82694f = k04;
        K0 k05 = new K0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f82695g = k05;
        K0 k06 = new K0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f82696h = k06;
        K0 k07 = new K0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f82697i = k07;
        K0 k08 = new K0("STRING", 6, String.class, String.class, "");
        f82698j = k08;
        K0 k09 = new K0("BYTE_STRING", 7, AbstractC10605b0.class, AbstractC10605b0.class, AbstractC10605b0.f83055b);
        f82699k = k09;
        K0 k010 = new K0("ENUM", 8, cls, Integer.class, null);
        f82700l = k010;
        K0 k011 = new K0("MESSAGE", 9, Object.class, Object.class, null);
        f82701m = k011;
        f82702n = new K0[]{k02, k03, k04, k05, k06, k07, k08, k09, k010, k011};
    }

    public static K0[] values() {
        return (K0[]) f82702n.clone();
    }

    private K0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f82703a = cls;
        this.f82704b = cls2;
        this.f82705c = obj;
    }
}
