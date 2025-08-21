package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    static final int f54569a = c(1, 3);

    /* renamed from: b, reason: collision with root package name */
    static final int f54570b = c(1, 4);

    /* renamed from: c, reason: collision with root package name */
    static final int f54571c = c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    static final int f54572d = c(3, 2);

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
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f54573c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f54574d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f54575e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f54576f;

        /* renamed from: g, reason: collision with root package name */
        public static final b f54577g;

        /* renamed from: h, reason: collision with root package name */
        public static final b f54578h;

        /* renamed from: i, reason: collision with root package name */
        public static final b f54579i;

        /* renamed from: j, reason: collision with root package name */
        public static final b f54580j;

        /* renamed from: k, reason: collision with root package name */
        public static final b f54581k;

        /* renamed from: l, reason: collision with root package name */
        public static final b f54582l;

        /* renamed from: m, reason: collision with root package name */
        public static final b f54583m;

        /* renamed from: n, reason: collision with root package name */
        public static final b f54584n;

        /* renamed from: o, reason: collision with root package name */
        public static final b f54585o;

        /* renamed from: p, reason: collision with root package name */
        public static final b f54586p;

        /* renamed from: q, reason: collision with root package name */
        public static final b f54587q;

        /* renamed from: r, reason: collision with root package name */
        public static final b f54588r;

        /* renamed from: s, reason: collision with root package name */
        public static final b f54589s;

        /* renamed from: t, reason: collision with root package name */
        public static final b f54590t;

        /* renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ b[] f54591u;

        /* renamed from: a, reason: collision with root package name */
        private final c f54592a;

        /* renamed from: b, reason: collision with root package name */
        private final int f54593b;

        enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.q0$b$b, reason: collision with other inner class name */
        enum C1117b extends b {
            C1117b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        enum c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        enum d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f54573c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f54574d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f54575e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f54576f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f54577g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f54578h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f54579i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f54580j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f54581k = aVar;
            c cVar3 = c.MESSAGE;
            C1117b c1117b = new C1117b("GROUP", 9, cVar3, 3);
            f54582l = c1117b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f54583m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f54584n = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f54585o = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f54586p = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f54587q = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f54588r = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f54589s = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f54590t = bVar14;
            f54591u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c1117b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        private b(String str, int i10, c cVar, int i11) {
            this.f54592a = cVar;
            this.f54593b = i11;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f54591u.clone();
        }

        public c a() {
            return this.f54592a;
        }

        public int b() {
            return this.f54593b;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC6083g.f54456b),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: a, reason: collision with root package name */
        private final Object f54604a;

        c(Object obj) {
            this.f54604a = obj;
        }
    }
}
