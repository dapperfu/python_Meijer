package g8;

import k8.EnumC15124j;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final w f133170c;

    /* renamed from: d, reason: collision with root package name */
    public static final w f133171d;

    /* renamed from: e, reason: collision with root package name */
    public static final w f133172e;

    /* renamed from: f, reason: collision with root package name */
    public static final w f133173f;

    /* renamed from: g, reason: collision with root package name */
    public static final w f133174g;

    /* renamed from: h, reason: collision with root package name */
    public static final w f133175h;

    /* renamed from: i, reason: collision with root package name */
    public static final w f133176i;

    /* renamed from: j, reason: collision with root package name */
    public static final w f133177j;

    /* renamed from: k, reason: collision with root package name */
    public static final w f133178k;

    /* renamed from: l, reason: collision with root package name */
    public static final w f133179l;

    /* renamed from: m, reason: collision with root package name */
    public static final w f133180m;

    /* renamed from: n, reason: collision with root package name */
    public static final w f133181n;

    /* renamed from: o, reason: collision with root package name */
    public static final w f133182o;

    /* renamed from: p, reason: collision with root package name */
    public static final w f133183p;

    /* renamed from: q, reason: collision with root package name */
    public static final w f133184q;

    /* renamed from: r, reason: collision with root package name */
    public static final w f133185r;

    /* renamed from: s, reason: collision with root package name */
    public static final w f133186s;

    /* renamed from: t, reason: collision with root package name */
    public static final w f133187t;

    /* renamed from: u, reason: collision with root package name */
    public static final w f133188u;

    /* renamed from: v, reason: collision with root package name */
    public static final w f133189v;

    /* renamed from: w, reason: collision with root package name */
    public static final w f133190w;

    /* renamed from: x, reason: collision with root package name */
    public static final w f133191x;

    /* renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ w[] f133192y;

    /* renamed from: a, reason: collision with root package name */
    private int f133193a;

    /* renamed from: b, reason: collision with root package name */
    private EnumC15124j f133194b;

    static {
        EnumC15124j enumC15124j = EnumC15124j.PERFORMANCE;
        f133170c = new w("ACTION_MANUAL", 0, 1, enumC15124j);
        f133171d = new w("ACTION_AUTO", 1, 6, enumC15124j);
        EnumC15124j enumC15124j2 = EnumC15124j.OFF;
        f133172e = new w("ACTION_AUTO_LOADING_APP", 2, 6, enumC15124j2);
        EnumC15124j enumC15124j3 = EnumC15124j.USER_BEHAVIOR;
        f133173f = new w("NAMED_EVENT", 3, 10, enumC15124j3);
        f133174g = new w("VALUE_STRING", 4, 11, enumC15124j3);
        f133175h = new w("VALUE_INT64", 5, 12, enumC15124j3);
        f133176i = new w("VALUE_DOUBLE", 6, 13, enumC15124j3);
        f133177j = new w("VISIT_END", 7, 19, enumC15124j);
        f133178k = new w("APP_START", 8, 20, enumC15124j);
        f133179l = new w("DISPLAY", 9, 21, enumC15124j);
        f133180m = new w("REDISPLAY", 10, 22, enumC15124j);
        f133181n = new w("WEB_REQUEST", 11, 30, enumC15124j);
        f133182o = new w("ERROR_INT", 12, 40, enumC15124j);
        f133183p = new w("ERROR_EXCEPTION", 13, 42, enumC15124j);
        f133184q = new w("CRASH", 14, 50, enumC15124j2);
        f133185r = new w("IDENTIFY_USER", 15, 60, enumC15124j3);
        f133186s = new w("SELF_MONITORING_EVENT", 16, 90, enumC15124j);
        f133187t = new w("RAGE_TAP", 17, 97, enumC15124j);
        f133188u = new w("EVENT_API", 18, 98, enumC15124j);
        f133189v = new w("EVENT_BIZ", 19, 98, enumC15124j2);
        f133190w = new w("EVENT_SESSION_PROPERTIES", 20, -1, enumC15124j);
        f133191x = new w("PLACEHOLDER", 21, -1, enumC15124j3);
        f133192y = a();
    }

    private static /* synthetic */ w[] a() {
        return new w[]{f133170c, f133171d, f133172e, f133173f, f133174g, f133175h, f133176i, f133177j, f133178k, f133179l, f133180m, f133181n, f133182o, f133183p, f133184q, f133185r, f133186s, f133187t, f133188u, f133189v, f133190w, f133191x};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f133192y.clone();
    }

    public EnumC15124j b() {
        return this.f133194b;
    }

    public int e() {
        return this.f133193a;
    }

    private w(String str, int i10, int i11, EnumC15124j enumC15124j) {
        this.f133193a = i11;
        this.f133194b = enumC15124j;
    }
}
