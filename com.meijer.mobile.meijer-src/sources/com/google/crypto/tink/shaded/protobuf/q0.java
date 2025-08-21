package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes8.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    static final int f89292a = c(1, 3);

    /* renamed from: b, reason: collision with root package name */
    static final int f89293b = c(1, 4);

    /* renamed from: c, reason: collision with root package name */
    static final int f89294c = c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    static final int f89295d = c(3, 2);

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
        public static final b f89296c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f89297d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f89298e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f89299f;

        /* renamed from: g, reason: collision with root package name */
        public static final b f89300g;

        /* renamed from: h, reason: collision with root package name */
        public static final b f89301h;

        /* renamed from: i, reason: collision with root package name */
        public static final b f89302i;

        /* renamed from: j, reason: collision with root package name */
        public static final b f89303j;

        /* renamed from: k, reason: collision with root package name */
        public static final b f89304k;

        /* renamed from: l, reason: collision with root package name */
        public static final b f89305l;

        /* renamed from: m, reason: collision with root package name */
        public static final b f89306m;

        /* renamed from: n, reason: collision with root package name */
        public static final b f89307n;

        /* renamed from: o, reason: collision with root package name */
        public static final b f89308o;

        /* renamed from: p, reason: collision with root package name */
        public static final b f89309p;

        /* renamed from: q, reason: collision with root package name */
        public static final b f89310q;

        /* renamed from: r, reason: collision with root package name */
        public static final b f89311r;

        /* renamed from: s, reason: collision with root package name */
        public static final b f89312s;

        /* renamed from: t, reason: collision with root package name */
        public static final b f89313t;

        /* renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ b[] f89314u;

        /* renamed from: a, reason: collision with root package name */
        private final c f89315a;

        /* renamed from: b, reason: collision with root package name */
        private final int f89316b;

        enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* renamed from: com.google.crypto.tink.shaded.protobuf.q0$b$b, reason: collision with other inner class name */
        enum C1290b extends b {
            C1290b(String str, int i10, c cVar, int i11) {
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
            f89296c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f89297d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f89298e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f89299f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f89300g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f89301h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f89302i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f89303j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f89304k = aVar;
            c cVar3 = c.MESSAGE;
            C1290b c1290b = new C1290b("GROUP", 9, cVar3, 3);
            f89305l = c1290b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f89306m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f89307n = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f89308o = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f89309p = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f89310q = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f89311r = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f89312s = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f89313t = bVar14;
            f89314u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c1290b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        private b(String str, int i10, c cVar, int i11) {
            this.f89315a = cVar;
            this.f89316b = i11;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f89314u.clone();
        }

        public c a() {
            return this.f89315a;
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
        BYTE_STRING(AbstractC11437h.f89182b),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: a, reason: collision with root package name */
        private final Object f89327a;

        c(Object obj) {
            this.f89327a = obj;
        }
    }
}
