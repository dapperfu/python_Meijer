package com.google.android.gms.internal.atv_ads_framework;

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
public final class T0 {

    /* renamed from: d, reason: collision with root package name */
    public static final T0 f80885d;

    /* renamed from: e, reason: collision with root package name */
    public static final T0 f80886e;

    /* renamed from: f, reason: collision with root package name */
    public static final T0 f80887f;

    /* renamed from: g, reason: collision with root package name */
    public static final T0 f80888g;

    /* renamed from: h, reason: collision with root package name */
    public static final T0 f80889h;

    /* renamed from: i, reason: collision with root package name */
    public static final T0 f80890i;

    /* renamed from: j, reason: collision with root package name */
    public static final T0 f80891j;

    /* renamed from: k, reason: collision with root package name */
    public static final T0 f80892k;

    /* renamed from: l, reason: collision with root package name */
    public static final T0 f80893l;

    /* renamed from: m, reason: collision with root package name */
    public static final T0 f80894m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ T0[] f80895n;

    /* renamed from: a, reason: collision with root package name */
    private final Class f80896a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f80897b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f80898c;

    public final Class a() {
        return this.f80897b;
    }

    static {
        T0 t02 = new T0("VOID", 0, Void.class, Void.class, null);
        f80885d = t02;
        Class cls = Integer.TYPE;
        T0 t03 = new T0("INT", 1, cls, Integer.class, 0);
        f80886e = t03;
        T0 t04 = new T0("LONG", 2, Long.TYPE, Long.class, 0L);
        f80887f = t04;
        T0 t05 = new T0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f80888g = t05;
        T0 t06 = new T0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f80889h = t06;
        T0 t07 = new T0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f80890i = t07;
        T0 t08 = new T0("STRING", 6, String.class, String.class, "");
        f80891j = t08;
        T0 t09 = new T0("BYTE_STRING", 7, AbstractC10249q0.class, AbstractC10249q0.class, AbstractC10249q0.f81030b);
        f80892k = t09;
        T0 t010 = new T0("ENUM", 8, cls, Integer.class, null);
        f80893l = t010;
        T0 t011 = new T0("MESSAGE", 9, Object.class, Object.class, null);
        f80894m = t011;
        f80895n = new T0[]{t02, t03, t04, t05, t06, t07, t08, t09, t010, t011};
    }

    public static T0[] values() {
        return (T0[]) f80895n.clone();
    }

    private T0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f80896a = cls;
        this.f80897b = cls2;
        this.f80898c = obj;
    }
}
