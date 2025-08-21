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
public final class EnumC10620p5 {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC10620p5 f83168b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC10620p5 f83169c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC10620p5 f83170d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC10620p5 f83171e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC10620p5 f83172f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC10620p5 f83173g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC10620p5 f83174h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC10620p5 f83175i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC10620p5 f83176j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC10620p5 f83177k;

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ EnumC10620p5[] f83178l;

    /* renamed from: a, reason: collision with root package name */
    private final Class f83179a;

    public final Class a() {
        return this.f83179a;
    }

    static {
        EnumC10620p5 enumC10620p5 = new EnumC10620p5("VOID", 0, Void.class, Void.class, null);
        f83168b = enumC10620p5;
        Class cls = Integer.TYPE;
        EnumC10620p5 enumC10620p52 = new EnumC10620p5("INT", 1, cls, Integer.class, 0);
        f83169c = enumC10620p52;
        EnumC10620p5 enumC10620p53 = new EnumC10620p5("LONG", 2, Long.TYPE, Long.class, 0L);
        f83170d = enumC10620p53;
        EnumC10620p5 enumC10620p54 = new EnumC10620p5("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f83171e = enumC10620p54;
        EnumC10620p5 enumC10620p55 = new EnumC10620p5("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f83172f = enumC10620p55;
        EnumC10620p5 enumC10620p56 = new EnumC10620p5("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f83173g = enumC10620p56;
        EnumC10620p5 enumC10620p57 = new EnumC10620p5("STRING", 6, String.class, String.class, "");
        f83174h = enumC10620p57;
        EnumC10620p5 enumC10620p58 = new EnumC10620p5("BYTE_STRING", 7, G4.class, G4.class, G4.f82610b);
        f83175i = enumC10620p58;
        EnumC10620p5 enumC10620p59 = new EnumC10620p5("ENUM", 8, cls, Integer.class, null);
        f83176j = enumC10620p59;
        EnumC10620p5 enumC10620p510 = new EnumC10620p5("MESSAGE", 9, Object.class, Object.class, null);
        f83177k = enumC10620p510;
        f83178l = new EnumC10620p5[]{enumC10620p5, enumC10620p52, enumC10620p53, enumC10620p54, enumC10620p55, enumC10620p56, enumC10620p57, enumC10620p58, enumC10620p59, enumC10620p510};
    }

    public static EnumC10620p5[] values() {
        return (EnumC10620p5[]) f83178l.clone();
    }

    private EnumC10620p5(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f83179a = cls2;
    }
}
