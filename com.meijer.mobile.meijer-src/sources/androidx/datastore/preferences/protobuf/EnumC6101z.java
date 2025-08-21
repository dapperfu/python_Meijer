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
public final class EnumC6101z {

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC6101z f54711d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC6101z f54712e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC6101z f54713f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC6101z f54714g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC6101z f54715h;

    /* renamed from: i, reason: collision with root package name */
    public static final EnumC6101z f54716i;

    /* renamed from: j, reason: collision with root package name */
    public static final EnumC6101z f54717j;

    /* renamed from: k, reason: collision with root package name */
    public static final EnumC6101z f54718k;

    /* renamed from: l, reason: collision with root package name */
    public static final EnumC6101z f54719l;

    /* renamed from: m, reason: collision with root package name */
    public static final EnumC6101z f54720m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ EnumC6101z[] f54721n;

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f54722a;

    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f54723b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f54724c;

    static {
        EnumC6101z enumC6101z = new EnumC6101z("VOID", 0, Void.class, Void.class, null);
        f54711d = enumC6101z;
        Class cls = Integer.TYPE;
        EnumC6101z enumC6101z2 = new EnumC6101z("INT", 1, cls, Integer.class, 0);
        f54712e = enumC6101z2;
        EnumC6101z enumC6101z3 = new EnumC6101z("LONG", 2, Long.TYPE, Long.class, 0L);
        f54713f = enumC6101z3;
        EnumC6101z enumC6101z4 = new EnumC6101z("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f54714g = enumC6101z4;
        EnumC6101z enumC6101z5 = new EnumC6101z("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f54715h = enumC6101z5;
        EnumC6101z enumC6101z6 = new EnumC6101z("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f54716i = enumC6101z6;
        EnumC6101z enumC6101z7 = new EnumC6101z("STRING", 6, String.class, String.class, "");
        f54717j = enumC6101z7;
        EnumC6101z enumC6101z8 = new EnumC6101z("BYTE_STRING", 7, AbstractC6083g.class, AbstractC6083g.class, AbstractC6083g.f54456b);
        f54718k = enumC6101z8;
        EnumC6101z enumC6101z9 = new EnumC6101z("ENUM", 8, cls, Integer.class, null);
        f54719l = enumC6101z9;
        EnumC6101z enumC6101z10 = new EnumC6101z("MESSAGE", 9, Object.class, Object.class, null);
        f54720m = enumC6101z10;
        f54721n = new EnumC6101z[]{enumC6101z, enumC6101z2, enumC6101z3, enumC6101z4, enumC6101z5, enumC6101z6, enumC6101z7, enumC6101z8, enumC6101z9, enumC6101z10};
    }

    public static EnumC6101z valueOf(String str) {
        return (EnumC6101z) Enum.valueOf(EnumC6101z.class, str);
    }

    public static EnumC6101z[] values() {
        return (EnumC6101z[]) f54721n.clone();
    }

    public Class<?> a() {
        return this.f54723b;
    }

    private EnumC6101z(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f54722a = cls;
        this.f54723b = cls2;
        this.f54724c = obj;
    }
}
