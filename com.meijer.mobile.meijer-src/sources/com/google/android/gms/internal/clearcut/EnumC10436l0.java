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
public final class EnumC10436l0 {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC10436l0 f82349d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC10436l0 f82350e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC10436l0 f82351f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC10436l0 f82352g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC10436l0 f82353h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC10436l0 f82354i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC10436l0 f82355j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC10436l0 f82356k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC10436l0 f82357l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC10436l0 f82358m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumC10436l0[] f82359n;

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f82360a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f82361b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f82362c;

    static {
        EnumC10436l0 enumC10436l0 = new EnumC10436l0("VOID", 0, Void.class, Void.class, null);
        f82349d = enumC10436l0;
        Class cls = Integer.TYPE;
        EnumC10436l0 enumC10436l02 = new EnumC10436l0("INT", 1, cls, Integer.class, 0);
        f82350e = enumC10436l02;
        EnumC10436l0 enumC10436l03 = new EnumC10436l0("LONG", 2, Long.TYPE, Long.class, 0L);
        f82351f = enumC10436l03;
        EnumC10436l0 enumC10436l04 = new EnumC10436l0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f82352g = enumC10436l04;
        EnumC10436l0 enumC10436l05 = new EnumC10436l0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f82353h = enumC10436l05;
        EnumC10436l0 enumC10436l06 = new EnumC10436l0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f82354i = enumC10436l06;
        EnumC10436l0 enumC10436l07 = new EnumC10436l0("STRING", 6, String.class, String.class, "");
        f82355j = enumC10436l07;
        EnumC10436l0 enumC10436l08 = new EnumC10436l0("BYTE_STRING", 7, A.class, A.class, A.f81937b);
        f82356k = enumC10436l08;
        EnumC10436l0 enumC10436l09 = new EnumC10436l0("ENUM", 8, cls, Integer.class, null);
        f82357l = enumC10436l09;
        EnumC10436l0 enumC10436l010 = new EnumC10436l0("MESSAGE", 9, Object.class, Object.class, null);
        f82358m = enumC10436l010;
        f82359n = new EnumC10436l0[]{enumC10436l0, enumC10436l02, enumC10436l03, enumC10436l04, enumC10436l05, enumC10436l06, enumC10436l07, enumC10436l08, enumC10436l09, enumC10436l010};
    }

    private EnumC10436l0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f82360a = cls;
        this.f82361b = cls2;
        this.f82362c = obj;
    }

    public static EnumC10436l0[] values() {
        return (EnumC10436l0[]) f82359n.clone();
    }

    public final Class<?> a() {
        return this.f82361b;
    }
}
