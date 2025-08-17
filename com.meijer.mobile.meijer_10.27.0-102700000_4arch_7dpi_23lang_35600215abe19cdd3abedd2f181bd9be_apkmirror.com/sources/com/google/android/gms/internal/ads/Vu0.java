package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class Vu0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Vu0 f70932b;

    /* renamed from: c, reason: collision with root package name */
    public static final Vu0 f70933c;

    /* renamed from: d, reason: collision with root package name */
    public static final Vu0 f70934d;

    /* renamed from: e, reason: collision with root package name */
    public static final Vu0 f70935e;

    /* renamed from: f, reason: collision with root package name */
    public static final Vu0 f70936f;

    /* renamed from: g, reason: collision with root package name */
    public static final Vu0 f70937g;

    /* renamed from: h, reason: collision with root package name */
    public static final Vu0 f70938h;

    /* renamed from: i, reason: collision with root package name */
    public static final Vu0 f70939i;

    /* renamed from: j, reason: collision with root package name */
    public static final Vu0 f70940j;

    /* renamed from: k, reason: collision with root package name */
    public static final Vu0 f70941k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ Vu0[] f70942l;

    /* renamed from: a, reason: collision with root package name */
    private final Class f70943a;

    public final Class a() {
        return this.f70943a;
    }

    static {
        Vu0 vu0 = new Vu0("VOID", 0, Void.class, Void.class, null);
        f70932b = vu0;
        Class cls = Integer.TYPE;
        Vu0 vu02 = new Vu0("INT", 1, cls, Integer.class, 0);
        f70933c = vu02;
        Vu0 vu03 = new Vu0("LONG", 2, Long.TYPE, Long.class, 0L);
        f70934d = vu03;
        Vu0 vu04 = new Vu0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f70935e = vu04;
        Vu0 vu05 = new Vu0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f70936f = vu05;
        Vu0 vu06 = new Vu0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f70937g = vu06;
        Vu0 vu07 = new Vu0("STRING", 6, String.class, String.class, "");
        f70938h = vu07;
        Vu0 vu08 = new Vu0("BYTE_STRING", 7, Zt0.class, Zt0.class, Zt0.f72282b);
        f70939i = vu08;
        Vu0 vu09 = new Vu0("ENUM", 8, cls, Integer.class, null);
        f70940j = vu09;
        Vu0 vu010 = new Vu0("MESSAGE", 9, Object.class, Object.class, null);
        f70941k = vu010;
        f70942l = new Vu0[]{vu0, vu02, vu03, vu04, vu05, vu06, vu07, vu08, vu09, vu010};
    }

    public static Vu0[] values() {
        return (Vu0[]) f70942l.clone();
    }

    private Vu0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f70943a = cls2;
    }
}
