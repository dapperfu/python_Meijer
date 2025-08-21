package i8;

import m8.EnumC15695j;

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
    public static final w f137386c;

    /* renamed from: d, reason: collision with root package name */
    public static final w f137387d;

    /* renamed from: e, reason: collision with root package name */
    public static final w f137388e;

    /* renamed from: f, reason: collision with root package name */
    public static final w f137389f;

    /* renamed from: g, reason: collision with root package name */
    public static final w f137390g;

    /* renamed from: h, reason: collision with root package name */
    public static final w f137391h;

    /* renamed from: i, reason: collision with root package name */
    public static final w f137392i;

    /* renamed from: j, reason: collision with root package name */
    public static final w f137393j;

    /* renamed from: k, reason: collision with root package name */
    public static final w f137394k;

    /* renamed from: l, reason: collision with root package name */
    public static final w f137395l;

    /* renamed from: m, reason: collision with root package name */
    public static final w f137396m;

    /* renamed from: n, reason: collision with root package name */
    public static final w f137397n;

    /* renamed from: o, reason: collision with root package name */
    public static final w f137398o;

    /* renamed from: p, reason: collision with root package name */
    public static final w f137399p;

    /* renamed from: q, reason: collision with root package name */
    public static final w f137400q;

    /* renamed from: r, reason: collision with root package name */
    public static final w f137401r;

    /* renamed from: s, reason: collision with root package name */
    public static final w f137402s;

    /* renamed from: t, reason: collision with root package name */
    public static final w f137403t;

    /* renamed from: u, reason: collision with root package name */
    public static final w f137404u;

    /* renamed from: v, reason: collision with root package name */
    public static final w f137405v;

    /* renamed from: w, reason: collision with root package name */
    public static final w f137406w;

    /* renamed from: x, reason: collision with root package name */
    public static final w f137407x;

    /* renamed from: y, reason: collision with root package name */
    private static final /* synthetic */ w[] f137408y;

    /* renamed from: a, reason: collision with root package name */
    private int f137409a;

    /* renamed from: b, reason: collision with root package name */
    private EnumC15695j f137410b;

    static {
        EnumC15695j enumC15695j = EnumC15695j.PERFORMANCE;
        f137386c = new w("ACTION_MANUAL", 0, 1, enumC15695j);
        f137387d = new w("ACTION_AUTO", 1, 6, enumC15695j);
        EnumC15695j enumC15695j2 = EnumC15695j.OFF;
        f137388e = new w("ACTION_AUTO_LOADING_APP", 2, 6, enumC15695j2);
        EnumC15695j enumC15695j3 = EnumC15695j.USER_BEHAVIOR;
        f137389f = new w("NAMED_EVENT", 3, 10, enumC15695j3);
        f137390g = new w("VALUE_STRING", 4, 11, enumC15695j3);
        f137391h = new w("VALUE_INT64", 5, 12, enumC15695j3);
        f137392i = new w("VALUE_DOUBLE", 6, 13, enumC15695j3);
        f137393j = new w("VISIT_END", 7, 19, enumC15695j);
        f137394k = new w("APP_START", 8, 20, enumC15695j);
        f137395l = new w("DISPLAY", 9, 21, enumC15695j);
        f137396m = new w("REDISPLAY", 10, 22, enumC15695j);
        f137397n = new w("WEB_REQUEST", 11, 30, enumC15695j);
        f137398o = new w("ERROR_INT", 12, 40, enumC15695j);
        f137399p = new w("ERROR_EXCEPTION", 13, 42, enumC15695j);
        f137400q = new w("CRASH", 14, 50, enumC15695j2);
        f137401r = new w("IDENTIFY_USER", 15, 60, enumC15695j3);
        f137402s = new w("SELF_MONITORING_EVENT", 16, 90, enumC15695j);
        f137403t = new w("RAGE_TAP", 17, 97, enumC15695j);
        f137404u = new w("EVENT_API", 18, 98, enumC15695j);
        f137405v = new w("EVENT_BIZ", 19, 98, enumC15695j2);
        f137406w = new w("EVENT_SESSION_PROPERTIES", 20, -1, enumC15695j);
        f137407x = new w("PLACEHOLDER", 21, -1, enumC15695j3);
        f137408y = a();
    }

    private static /* synthetic */ w[] a() {
        return new w[]{f137386c, f137387d, f137388e, f137389f, f137390g, f137391h, f137392i, f137393j, f137394k, f137395l, f137396m, f137397n, f137398o, f137399p, f137400q, f137401r, f137402s, f137403t, f137404u, f137405v, f137406w, f137407x};
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f137408y.clone();
    }

    public EnumC15695j b() {
        return this.f137410b;
    }

    public int e() {
        return this.f137409a;
    }

    private w(String str, int i10, int i11, EnumC15695j enumC15695j) {
        this.f137409a = i11;
        this.f137410b = enumC15695j;
    }
}
