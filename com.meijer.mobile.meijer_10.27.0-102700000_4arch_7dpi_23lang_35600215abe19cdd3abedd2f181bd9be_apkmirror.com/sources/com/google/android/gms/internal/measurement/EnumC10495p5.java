package com.google.android.gms.internal.measurement;

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
/* renamed from: com.google.android.gms.internal.measurement.p5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10495p5 {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC10495p5 f82328b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC10495p5 f82329c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC10495p5 f82330d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC10495p5 f82331e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC10495p5 f82332f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC10495p5 f82333g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC10495p5 f82334h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC10495p5 f82335i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC10495p5 f82336j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC10495p5 f82337k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumC10495p5[] f82338l;

    /* renamed from: a, reason: collision with root package name */
    private final Class f82339a;

    public final Class a() {
        return this.f82339a;
    }

    static {
        EnumC10495p5 enumC10495p5 = new EnumC10495p5("VOID", 0, Void.class, Void.class, null);
        f82328b = enumC10495p5;
        Class cls = Integer.TYPE;
        EnumC10495p5 enumC10495p52 = new EnumC10495p5("INT", 1, cls, Integer.class, 0);
        f82329c = enumC10495p52;
        EnumC10495p5 enumC10495p53 = new EnumC10495p5("LONG", 2, Long.TYPE, Long.class, 0L);
        f82330d = enumC10495p53;
        EnumC10495p5 enumC10495p54 = new EnumC10495p5("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f82331e = enumC10495p54;
        EnumC10495p5 enumC10495p55 = new EnumC10495p5("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f82332f = enumC10495p55;
        EnumC10495p5 enumC10495p56 = new EnumC10495p5("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f82333g = enumC10495p56;
        EnumC10495p5 enumC10495p57 = new EnumC10495p5("STRING", 6, String.class, String.class, "");
        f82334h = enumC10495p57;
        EnumC10495p5 enumC10495p58 = new EnumC10495p5("BYTE_STRING", 7, G4.class, G4.class, G4.f81770b);
        f82335i = enumC10495p58;
        EnumC10495p5 enumC10495p59 = new EnumC10495p5("ENUM", 8, cls, Integer.class, null);
        f82336j = enumC10495p59;
        EnumC10495p5 enumC10495p510 = new EnumC10495p5("MESSAGE", 9, Object.class, Object.class, null);
        f82337k = enumC10495p510;
        f82338l = new EnumC10495p5[]{enumC10495p5, enumC10495p52, enumC10495p53, enumC10495p54, enumC10495p55, enumC10495p56, enumC10495p57, enumC10495p58, enumC10495p59, enumC10495p510};
    }

    public static EnumC10495p5[] values() {
        return (EnumC10495p5[]) f82338l.clone();
    }

    private EnumC10495p5(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f82339a = cls2;
    }
}
