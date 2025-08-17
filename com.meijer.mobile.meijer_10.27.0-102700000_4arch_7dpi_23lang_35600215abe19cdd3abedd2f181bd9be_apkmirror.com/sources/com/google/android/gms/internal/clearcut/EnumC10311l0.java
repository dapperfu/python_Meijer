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
/* renamed from: com.google.android.gms.internal.clearcut.l0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10311l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC10311l0 f81509d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC10311l0 f81510e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC10311l0 f81511f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC10311l0 f81512g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC10311l0 f81513h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC10311l0 f81514i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC10311l0 f81515j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC10311l0 f81516k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC10311l0 f81517l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC10311l0 f81518m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumC10311l0[] f81519n;

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f81520a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f81521b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f81522c;

    static {
        EnumC10311l0 enumC10311l0 = new EnumC10311l0("VOID", 0, Void.class, Void.class, null);
        f81509d = enumC10311l0;
        Class cls = Integer.TYPE;
        EnumC10311l0 enumC10311l02 = new EnumC10311l0("INT", 1, cls, Integer.class, 0);
        f81510e = enumC10311l02;
        EnumC10311l0 enumC10311l03 = new EnumC10311l0("LONG", 2, Long.TYPE, Long.class, 0L);
        f81511f = enumC10311l03;
        EnumC10311l0 enumC10311l04 = new EnumC10311l0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f81512g = enumC10311l04;
        EnumC10311l0 enumC10311l05 = new EnumC10311l0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f81513h = enumC10311l05;
        EnumC10311l0 enumC10311l06 = new EnumC10311l0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f81514i = enumC10311l06;
        EnumC10311l0 enumC10311l07 = new EnumC10311l0("STRING", 6, String.class, String.class, "");
        f81515j = enumC10311l07;
        EnumC10311l0 enumC10311l08 = new EnumC10311l0("BYTE_STRING", 7, A.class, A.class, A.f81097b);
        f81516k = enumC10311l08;
        EnumC10311l0 enumC10311l09 = new EnumC10311l0("ENUM", 8, cls, Integer.class, null);
        f81517l = enumC10311l09;
        EnumC10311l0 enumC10311l010 = new EnumC10311l0("MESSAGE", 9, Object.class, Object.class, null);
        f81518m = enumC10311l010;
        f81519n = new EnumC10311l0[]{enumC10311l0, enumC10311l02, enumC10311l03, enumC10311l04, enumC10311l05, enumC10311l06, enumC10311l07, enumC10311l08, enumC10311l09, enumC10311l010};
    }

    private EnumC10311l0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f81520a = cls;
        this.f81521b = cls2;
        this.f81522c = obj;
    }

    public static EnumC10311l0[] values() {
        return (EnumC10311l0[]) f81519n.clone();
    }

    public final Class<?> a() {
        return this.f81521b;
    }
}
