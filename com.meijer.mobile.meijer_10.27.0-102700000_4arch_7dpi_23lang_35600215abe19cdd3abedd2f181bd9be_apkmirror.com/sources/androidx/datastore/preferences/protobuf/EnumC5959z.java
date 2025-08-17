package androidx.datastore.preferences.protobuf;

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
/* renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5959z {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC5959z f54487d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC5959z f54488e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC5959z f54489f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC5959z f54490g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC5959z f54491h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC5959z f54492i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC5959z f54493j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC5959z f54494k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC5959z f54495l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC5959z f54496m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumC5959z[] f54497n;

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f54498a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f54499b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f54500c;

    static {
        EnumC5959z enumC5959z = new EnumC5959z("VOID", 0, Void.class, Void.class, null);
        f54487d = enumC5959z;
        Class cls = Integer.TYPE;
        EnumC5959z enumC5959z2 = new EnumC5959z("INT", 1, cls, Integer.class, 0);
        f54488e = enumC5959z2;
        EnumC5959z enumC5959z3 = new EnumC5959z("LONG", 2, Long.TYPE, Long.class, 0L);
        f54489f = enumC5959z3;
        EnumC5959z enumC5959z4 = new EnumC5959z("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f54490g = enumC5959z4;
        EnumC5959z enumC5959z5 = new EnumC5959z("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f54491h = enumC5959z5;
        EnumC5959z enumC5959z6 = new EnumC5959z("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f54492i = enumC5959z6;
        EnumC5959z enumC5959z7 = new EnumC5959z("STRING", 6, String.class, String.class, "");
        f54493j = enumC5959z7;
        EnumC5959z enumC5959z8 = new EnumC5959z("BYTE_STRING", 7, AbstractC5941g.class, AbstractC5941g.class, AbstractC5941g.f54232b);
        f54494k = enumC5959z8;
        EnumC5959z enumC5959z9 = new EnumC5959z("ENUM", 8, cls, Integer.class, null);
        f54495l = enumC5959z9;
        EnumC5959z enumC5959z10 = new EnumC5959z("MESSAGE", 9, Object.class, Object.class, null);
        f54496m = enumC5959z10;
        f54497n = new EnumC5959z[]{enumC5959z, enumC5959z2, enumC5959z3, enumC5959z4, enumC5959z5, enumC5959z6, enumC5959z7, enumC5959z8, enumC5959z9, enumC5959z10};
    }

    public static EnumC5959z valueOf(String str) {
        return (EnumC5959z) Enum.valueOf(EnumC5959z.class, str);
    }

    public static EnumC5959z[] values() {
        return (EnumC5959z[]) f54497n.clone();
    }

    public Class<?> a() {
        return this.f54499b;
    }

    private EnumC5959z(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f54498a = cls;
        this.f54499b = cls2;
        this.f54500c = obj;
    }
}
