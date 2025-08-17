package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes7.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    static final int f88452a = c(1, 3);

    /* renamed from: b, reason: collision with root package name */
    static final int f88453b = c(1, 4);

    /* renamed from: c, reason: collision with root package name */
    static final int f88454c = c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    static final int f88455d = c(3, 2);

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
        public static final b f88456c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f88457d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f88458e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f88459f;

        /* renamed from: g, reason: collision with root package name */
        public static final b f88460g;

        /* renamed from: h, reason: collision with root package name */
        public static final b f88461h;

        /* renamed from: i, reason: collision with root package name */
        public static final b f88462i;

        /* renamed from: j, reason: collision with root package name */
        public static final b f88463j;

        /* renamed from: k, reason: collision with root package name */
        public static final b f88464k;

        /* renamed from: l, reason: collision with root package name */
        public static final b f88465l;

        /* renamed from: m, reason: collision with root package name */
        public static final b f88466m;

        /* renamed from: n, reason: collision with root package name */
        public static final b f88467n;

        /* renamed from: o, reason: collision with root package name */
        public static final b f88468o;

        /* renamed from: p, reason: collision with root package name */
        public static final b f88469p;

        /* renamed from: q, reason: collision with root package name */
        public static final b f88470q;

        /* renamed from: r, reason: collision with root package name */
        public static final b f88471r;

        /* renamed from: s, reason: collision with root package name */
        public static final b f88472s;

        /* renamed from: t, reason: collision with root package name */
        public static final b f88473t;

        /* renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ b[] f88474u;

        /* renamed from: a, reason: collision with root package name */
        private final c f88475a;

        /* renamed from: b, reason: collision with root package name */
        private final int f88476b;

        enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* renamed from: com.google.crypto.tink.shaded.protobuf.q0$b$b, reason: collision with other inner class name */
        enum C1281b extends b {
            C1281b(String str, int i10, c cVar, int i11) {
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
            f88456c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f88457d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f88458e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f88459f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f88460g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f88461h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f88462i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f88463j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f88464k = aVar;
            c cVar3 = c.MESSAGE;
            C1281b c1281b = new C1281b("GROUP", 9, cVar3, 3);
            f88465l = c1281b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f88466m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f88467n = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f88468o = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f88469p = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f88470q = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f88471r = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f88472s = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f88473t = bVar14;
            f88474u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c1281b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        private b(String str, int i10, c cVar, int i11) {
            this.f88475a = cVar;
            this.f88476b = i11;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f88474u.clone();
        }

        public c a() {
            return this.f88475a;
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
        BYTE_STRING(AbstractC11312h.f88342b),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: a, reason: collision with root package name */
        private final Object f88487a;

        c(Object obj) {
            this.f88487a = obj;
        }
    }
}
