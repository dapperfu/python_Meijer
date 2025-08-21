package com.google.android.gms.internal.measurement;

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
/* renamed from: com.google.android.gms.internal.measurement.r6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC10638r6 {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC10638r6 f83203c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC10638r6 f83204d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC10638r6 f83205e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC10638r6 f83206f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC10638r6 f83207g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC10638r6 f83208h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC10638r6 f83209i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC10638r6 f83210j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC10638r6 f83211k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC10638r6 f83212l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC10638r6 f83213m;

    /* renamed from: n, reason: collision with root package name */
    public static final EnumC10638r6 f83214n;

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC10638r6 f83215o;

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC10638r6 f83216p;

    /* renamed from: q, reason: collision with root package name */
    public static final EnumC10638r6 f83217q;

    /* renamed from: r, reason: collision with root package name */
    public static final EnumC10638r6 f83218r;

    /* renamed from: s, reason: collision with root package name */
    public static final EnumC10638r6 f83219s;

    /* renamed from: t, reason: collision with root package name */
    public static final EnumC10638r6 f83220t;

    /* renamed from: u, reason: collision with root package name */
    private static final /* synthetic */ EnumC10638r6[] f83221u;

    /* renamed from: a, reason: collision with root package name */
    private final EnumC10647s6 f83222a;

    /* renamed from: b, reason: collision with root package name */
    private final int f83223b;

    public final EnumC10647s6 a() {
        return this.f83222a;
    }

    public final int b() {
        return this.f83223b;
    }

    static {
        EnumC10638r6 enumC10638r6 = new EnumC10638r6("DOUBLE", 0, EnumC10647s6.DOUBLE, 1);
        f83203c = enumC10638r6;
        EnumC10638r6 enumC10638r62 = new EnumC10638r6("FLOAT", 1, EnumC10647s6.FLOAT, 5);
        f83204d = enumC10638r62;
        EnumC10647s6 enumC10647s6 = EnumC10647s6.LONG;
        EnumC10638r6 enumC10638r63 = new EnumC10638r6("INT64", 2, enumC10647s6, 0);
        f83205e = enumC10638r63;
        EnumC10638r6 enumC10638r64 = new EnumC10638r6("UINT64", 3, enumC10647s6, 0);
        f83206f = enumC10638r64;
        EnumC10647s6 enumC10647s62 = EnumC10647s6.INT;
        EnumC10638r6 enumC10638r65 = new EnumC10638r6("INT32", 4, enumC10647s62, 0);
        f83207g = enumC10638r65;
        EnumC10638r6 enumC10638r66 = new EnumC10638r6("FIXED64", 5, enumC10647s6, 1);
        f83208h = enumC10638r66;
        EnumC10638r6 enumC10638r67 = new EnumC10638r6("FIXED32", 6, enumC10647s62, 5);
        f83209i = enumC10638r67;
        EnumC10638r6 enumC10638r68 = new EnumC10638r6("BOOL", 7, EnumC10647s6.BOOLEAN, 0);
        f83210j = enumC10638r68;
        EnumC10638r6 enumC10638r69 = new EnumC10638r6("STRING", 8, EnumC10647s6.STRING, 2);
        f83211k = enumC10638r69;
        EnumC10647s6 enumC10647s63 = EnumC10647s6.MESSAGE;
        EnumC10638r6 enumC10638r610 = new EnumC10638r6("GROUP", 9, enumC10647s63, 3);
        f83212l = enumC10638r610;
        EnumC10638r6 enumC10638r611 = new EnumC10638r6("MESSAGE", 10, enumC10647s63, 2);
        f83213m = enumC10638r611;
        EnumC10638r6 enumC10638r612 = new EnumC10638r6("BYTES", 11, EnumC10647s6.BYTE_STRING, 2);
        f83214n = enumC10638r612;
        EnumC10638r6 enumC10638r613 = new EnumC10638r6("UINT32", 12, enumC10647s62, 0);
        f83215o = enumC10638r613;
        EnumC10638r6 enumC10638r614 = new EnumC10638r6("ENUM", 13, EnumC10647s6.ENUM, 0);
        f83216p = enumC10638r614;
        EnumC10638r6 enumC10638r615 = new EnumC10638r6("SFIXED32", 14, enumC10647s62, 5);
        f83217q = enumC10638r615;
        EnumC10638r6 enumC10638r616 = new EnumC10638r6("SFIXED64", 15, enumC10647s6, 1);
        f83218r = enumC10638r616;
        EnumC10638r6 enumC10638r617 = new EnumC10638r6("SINT32", 16, enumC10647s62, 0);
        f83219s = enumC10638r617;
        EnumC10638r6 enumC10638r618 = new EnumC10638r6("SINT64", 17, enumC10647s6, 0);
        f83220t = enumC10638r618;
        f83221u = new EnumC10638r6[]{enumC10638r6, enumC10638r62, enumC10638r63, enumC10638r64, enumC10638r65, enumC10638r66, enumC10638r67, enumC10638r68, enumC10638r69, enumC10638r610, enumC10638r611, enumC10638r612, enumC10638r613, enumC10638r614, enumC10638r615, enumC10638r616, enumC10638r617, enumC10638r618};
    }

    public static EnumC10638r6[] values() {
        return (EnumC10638r6[]) f83221u.clone();
    }

    private EnumC10638r6(String str, int i10, EnumC10647s6 enumC10647s6, int i11) {
        this.f83222a = enumC10647s6;
        this.f83223b = i11;
    }
}
