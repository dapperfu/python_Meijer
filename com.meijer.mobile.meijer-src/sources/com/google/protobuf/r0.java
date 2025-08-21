package com.google.protobuf;

/* loaded from: classes8.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    static final int f91458a = c(1, 3);

    /* renamed from: b, reason: collision with root package name */
    static final int f91459b = c(1, 4);

    /* renamed from: c, reason: collision with root package name */
    static final int f91460c = c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    static final int f91461d = c(3, 2);

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
        public static final b f91462c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f91463d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f91464e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f91465f;

        /* renamed from: g, reason: collision with root package name */
        public static final b f91466g;

        /* renamed from: h, reason: collision with root package name */
        public static final b f91467h;

        /* renamed from: i, reason: collision with root package name */
        public static final b f91468i;

        /* renamed from: j, reason: collision with root package name */
        public static final b f91469j;

        /* renamed from: k, reason: collision with root package name */
        public static final b f91470k;

        /* renamed from: l, reason: collision with root package name */
        public static final b f91471l;

        /* renamed from: m, reason: collision with root package name */
        public static final b f91472m;

        /* renamed from: n, reason: collision with root package name */
        public static final b f91473n;

        /* renamed from: o, reason: collision with root package name */
        public static final b f91474o;

        /* renamed from: p, reason: collision with root package name */
        public static final b f91475p;

        /* renamed from: q, reason: collision with root package name */
        public static final b f91476q;

        /* renamed from: r, reason: collision with root package name */
        public static final b f91477r;

        /* renamed from: s, reason: collision with root package name */
        public static final b f91478s;

        /* renamed from: t, reason: collision with root package name */
        public static final b f91479t;

        /* renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ b[] f91480u;

        /* renamed from: a, reason: collision with root package name */
        private final c f91481a;

        /* renamed from: b, reason: collision with root package name */
        private final int f91482b;

        enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* renamed from: com.google.protobuf.r0$b$b, reason: collision with other inner class name */
        enum C1307b extends b {
            C1307b(String str, int i10, c cVar, int i11) {
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
            f91462c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f91463d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f91464e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f91465f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f91466g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f91467h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f91468i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f91469j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f91470k = aVar;
            c cVar3 = c.MESSAGE;
            C1307b c1307b = new C1307b("GROUP", 9, cVar3, 3);
            f91471l = c1307b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f91472m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f91473n = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f91474o = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f91475p = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f91476q = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f91477r = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f91478s = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f91479t = bVar14;
            f91480u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c1307b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        private b(String str, int i10, c cVar, int i11) {
            this.f91481a = cVar;
            this.f91482b = i11;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f91480u.clone();
        }

        public c a() {
            return this.f91481a;
        }

        public int b() {
            return this.f91482b;
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
        BYTE_STRING(AbstractC11646g.f91343b),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: a, reason: collision with root package name */
        private final Object f91493a;

        c(Object obj) {
            this.f91493a = obj;
        }
    }
}
