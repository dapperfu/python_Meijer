package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes13.dex */
public final class WireFormat {

    /* renamed from: a, reason: collision with root package name */
    static final int f145893a = c(1, 3);

    /* renamed from: b, reason: collision with root package name */
    static final int f145894b = c(1, 4);

    /* renamed from: c, reason: collision with root package name */
    static final int f145895c = c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    static final int f145896d = c(3, 2);

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
    public static class FieldType {

        /* renamed from: c, reason: collision with root package name */
        public static final FieldType f145897c;

        /* renamed from: d, reason: collision with root package name */
        public static final FieldType f145898d;

        /* renamed from: e, reason: collision with root package name */
        public static final FieldType f145899e;

        /* renamed from: f, reason: collision with root package name */
        public static final FieldType f145900f;

        /* renamed from: g, reason: collision with root package name */
        public static final FieldType f145901g;

        /* renamed from: h, reason: collision with root package name */
        public static final FieldType f145902h;

        /* renamed from: i, reason: collision with root package name */
        public static final FieldType f145903i;

        /* renamed from: j, reason: collision with root package name */
        public static final FieldType f145904j;

        /* renamed from: k, reason: collision with root package name */
        public static final FieldType f145905k;

        /* renamed from: l, reason: collision with root package name */
        public static final FieldType f145906l;

        /* renamed from: m, reason: collision with root package name */
        public static final FieldType f145907m;

        /* renamed from: n, reason: collision with root package name */
        public static final FieldType f145908n;

        /* renamed from: o, reason: collision with root package name */
        public static final FieldType f145909o;

        /* renamed from: p, reason: collision with root package name */
        public static final FieldType f145910p;

        /* renamed from: q, reason: collision with root package name */
        public static final FieldType f145911q;

        /* renamed from: r, reason: collision with root package name */
        public static final FieldType f145912r;

        /* renamed from: s, reason: collision with root package name */
        public static final FieldType f145913s;

        /* renamed from: t, reason: collision with root package name */
        public static final FieldType f145914t;

        /* renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ FieldType[] f145915u;

        /* renamed from: a, reason: collision with root package name */
        private final JavaType f145916a;

        /* renamed from: b, reason: collision with root package name */
        private final int f145917b;

        enum a extends FieldType {
            a(String str, int i10, JavaType javaType, int i11) {
                super(str, i10, javaType, i11);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            public boolean e() {
                return false;
            }
        }

        enum b extends FieldType {
            b(String str, int i10, JavaType javaType, int i11) {
                super(str, i10, javaType, i11);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            public boolean e() {
                return false;
            }
        }

        enum c extends FieldType {
            c(String str, int i10, JavaType javaType, int i11) {
                super(str, i10, javaType, i11);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            public boolean e() {
                return false;
            }
        }

        enum d extends FieldType {
            d(String str, int i10, JavaType javaType, int i11) {
                super(str, i10, javaType, i11);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType
            public boolean e() {
                return false;
            }
        }

        public boolean e() {
            return true;
        }

        static {
            FieldType fieldType = new FieldType("DOUBLE", 0, JavaType.DOUBLE, 1);
            f145897c = fieldType;
            FieldType fieldType2 = new FieldType("FLOAT", 1, JavaType.FLOAT, 5);
            f145898d = fieldType2;
            JavaType javaType = JavaType.LONG;
            FieldType fieldType3 = new FieldType("INT64", 2, javaType, 0);
            f145899e = fieldType3;
            FieldType fieldType4 = new FieldType("UINT64", 3, javaType, 0);
            f145900f = fieldType4;
            JavaType javaType2 = JavaType.INT;
            FieldType fieldType5 = new FieldType("INT32", 4, javaType2, 0);
            f145901g = fieldType5;
            FieldType fieldType6 = new FieldType("FIXED64", 5, javaType, 1);
            f145902h = fieldType6;
            FieldType fieldType7 = new FieldType("FIXED32", 6, javaType2, 5);
            f145903i = fieldType7;
            FieldType fieldType8 = new FieldType("BOOL", 7, JavaType.BOOLEAN, 0);
            f145904j = fieldType8;
            a aVar = new a("STRING", 8, JavaType.STRING, 2);
            f145905k = aVar;
            JavaType javaType3 = JavaType.MESSAGE;
            b bVar = new b("GROUP", 9, javaType3, 3);
            f145906l = bVar;
            c cVar = new c("MESSAGE", 10, javaType3, 2);
            f145907m = cVar;
            d dVar = new d("BYTES", 11, JavaType.BYTE_STRING, 2);
            f145908n = dVar;
            FieldType fieldType9 = new FieldType("UINT32", 12, javaType2, 0);
            f145909o = fieldType9;
            FieldType fieldType10 = new FieldType("ENUM", 13, JavaType.ENUM, 0);
            f145910p = fieldType10;
            FieldType fieldType11 = new FieldType("SFIXED32", 14, javaType2, 5);
            f145911q = fieldType11;
            FieldType fieldType12 = new FieldType("SFIXED64", 15, javaType, 1);
            f145912r = fieldType12;
            FieldType fieldType13 = new FieldType("SINT32", 16, javaType2, 0);
            f145913s = fieldType13;
            FieldType fieldType14 = new FieldType("SINT64", 17, javaType, 0);
            f145914t = fieldType14;
            f145915u = new FieldType[]{fieldType, fieldType2, fieldType3, fieldType4, fieldType5, fieldType6, fieldType7, fieldType8, aVar, bVar, cVar, dVar, fieldType9, fieldType10, fieldType11, fieldType12, fieldType13, fieldType14};
        }

        private FieldType(String str, int i10, JavaType javaType, int i11) {
            this.f145916a = javaType;
            this.f145917b = i11;
        }

        public static FieldType valueOf(String str) {
            return (FieldType) Enum.valueOf(FieldType.class, str);
        }

        public static FieldType[] values() {
            return (FieldType[]) f145915u.clone();
        }

        public JavaType a() {
            return this.f145916a;
        }

        public int b() {
            return this.f145917b;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }

    public enum JavaType {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(ByteString.f145819a),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: a, reason: collision with root package name */
        private final Object f145928a;

        JavaType(Object obj) {
            this.f145928a = obj;
        }
    }
}
