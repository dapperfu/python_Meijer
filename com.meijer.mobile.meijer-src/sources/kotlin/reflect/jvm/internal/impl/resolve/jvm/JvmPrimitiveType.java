package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes14.dex */
public enum JvmPrimitiveType {
    BOOLEAN(PrimitiveType.f144164g, "boolean", "Z", "java.lang.Boolean"),
    CHAR(PrimitiveType.f144165h, "char", "C", "java.lang.Character"),
    BYTE(PrimitiveType.f144166i, "byte", "B", "java.lang.Byte"),
    SHORT(PrimitiveType.f144167j, "short", "S", "java.lang.Short"),
    INT(PrimitiveType.f144168k, "int", "I", "java.lang.Integer"),
    FLOAT(PrimitiveType.f144169l, "float", "F", "java.lang.Float"),
    LONG(PrimitiveType.f144170m, "long", "J", "java.lang.Long"),
    DOUBLE(PrimitiveType.f144171n, "double", "D", "java.lang.Double");


    /* renamed from: m, reason: collision with root package name */
    private static final Map<String, JvmPrimitiveType> f147141m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    private static final Map<PrimitiveType, JvmPrimitiveType> f147142n = new EnumMap(PrimitiveType.class);

    /* renamed from: o, reason: collision with root package name */
    private static final Map<String, JvmPrimitiveType> f147143o = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    private static final Set<String> f147144p = new HashSet();

    /* renamed from: q, reason: collision with root package name */
    private static final Map<String, String> f147145q = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final PrimitiveType f147147a;

    /* renamed from: b, reason: collision with root package name */
    private final String f147148b;

    /* renamed from: c, reason: collision with root package name */
    private final String f147149c;

    /* renamed from: d, reason: collision with root package name */
    private final FqName f147150d;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r8) {
        /*
            r0 = 6
            r1 = 4
            if (r8 == r1) goto Lc
            if (r8 == r0) goto Lc
            switch(r8) {
                case 12: goto Lc;
                case 13: goto Lc;
                case 14: goto Lc;
                case 15: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Le:
            r3 = 2
            if (r8 == r1) goto L18
            if (r8 == r0) goto L18
            switch(r8) {
                case 12: goto L18;
                case 13: goto L18;
                case 14: goto L18;
                case 15: goto L18;
                default: goto L16;
            }
        L16:
            r4 = 3
            goto L19
        L18:
            r4 = r3
        L19:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType"
            r6 = 0
            switch(r8) {
                case 1: goto L47;
                case 2: goto L42;
                case 3: goto L3d;
                case 4: goto L3a;
                case 5: goto L35;
                case 6: goto L3a;
                case 7: goto L30;
                case 8: goto L2b;
                case 9: goto L3d;
                case 10: goto L30;
                case 11: goto L26;
                case 12: goto L3a;
                case 13: goto L3a;
                case 14: goto L3a;
                case 15: goto L3a;
                default: goto L21;
            }
        L21:
            java.lang.String r7 = "internalName"
            r4[r6] = r7
            goto L4b
        L26:
            java.lang.String r7 = "wrapperClassName"
            r4[r6] = r7
            goto L4b
        L2b:
            java.lang.String r7 = "primitiveType"
            r4[r6] = r7
            goto L4b
        L30:
            java.lang.String r7 = "desc"
            r4[r6] = r7
            goto L4b
        L35:
            java.lang.String r7 = "type"
            r4[r6] = r7
            goto L4b
        L3a:
            r4[r6] = r5
            goto L4b
        L3d:
            java.lang.String r7 = "name"
            r4[r6] = r7
            goto L4b
        L42:
            java.lang.String r7 = "methodDescriptor"
            r4[r6] = r7
            goto L4b
        L47:
            java.lang.String r7 = "owner"
            r4[r6] = r7
        L4b:
            java.lang.String r6 = "get"
            r7 = 1
            if (r8 == r1) goto L6c
            if (r8 == r0) goto L6c
            switch(r8) {
                case 12: goto L67;
                case 13: goto L62;
                case 14: goto L5d;
                case 15: goto L58;
                default: goto L55;
            }
        L55:
            r4[r7] = r5
            goto L6e
        L58:
            java.lang.String r5 = "getWrapperFqName"
            r4[r7] = r5
            goto L6e
        L5d:
            java.lang.String r5 = "getDesc"
            r4[r7] = r5
            goto L6e
        L62:
            java.lang.String r5 = "getJavaKeywordName"
            r4[r7] = r5
            goto L6e
        L67:
            java.lang.String r5 = "getPrimitiveType"
            r4[r7] = r5
            goto L6e
        L6c:
            r4[r7] = r6
        L6e:
            switch(r8) {
                case 1: goto L83;
                case 2: goto L83;
                case 3: goto L80;
                case 4: goto L87;
                case 5: goto L80;
                case 6: goto L87;
                case 7: goto L7b;
                case 8: goto L76;
                case 9: goto L76;
                case 10: goto L76;
                case 11: goto L76;
                case 12: goto L87;
                case 13: goto L87;
                case 14: goto L87;
                case 15: goto L87;
                default: goto L71;
            }
        L71:
            java.lang.String r5 = "isWrapperClassInternalName"
            r4[r3] = r5
            goto L87
        L76:
            java.lang.String r5 = "<init>"
            r4[r3] = r5
            goto L87
        L7b:
            java.lang.String r5 = "getByDesc"
            r4[r3] = r5
            goto L87
        L80:
            r4[r3] = r6
            goto L87
        L83:
            java.lang.String r5 = "isBoxingMethodDescriptor"
            r4[r3] = r5
        L87:
            java.lang.String r2 = java.lang.String.format(r2, r4)
            if (r8 == r1) goto L98
            if (r8 == r0) goto L98
            switch(r8) {
                case 12: goto L98;
                case 13: goto L98;
                case 14: goto L98;
                case 15: goto L98;
                default: goto L92;
            }
        L92:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r2)
            goto L9d
        L98:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r2)
        L9d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.a(int):void");
    }

    static {
        for (JvmPrimitiveType jvmPrimitiveType : values()) {
            f147141m.put(jvmPrimitiveType.m(), jvmPrimitiveType);
            f147142n.put(jvmPrimitiveType.o(), jvmPrimitiveType);
            f147143o.put(jvmPrimitiveType.l(), jvmPrimitiveType);
            String strReplace = jvmPrimitiveType.f147150d.a().replace('.', '/');
            f147144p.add(strReplace);
            f147145q.put(strReplace, "(" + jvmPrimitiveType.f147149c + ")L" + strReplace + ";");
        }
    }

    JvmPrimitiveType(PrimitiveType primitiveType, String str, String str2, String str3) {
        if (primitiveType == null) {
            a(8);
        }
        if (str == null) {
            a(9);
        }
        if (str2 == null) {
            a(10);
        }
        if (str3 == null) {
            a(11);
        }
        this.f147147a = primitiveType;
        this.f147148b = str;
        this.f147149c = str2;
        this.f147150d = new FqName(str3);
    }

    public static JvmPrimitiveType b(String str) {
        if (str == null) {
            a(3);
        }
        JvmPrimitiveType jvmPrimitiveType = f147141m.get(str);
        if (jvmPrimitiveType != null) {
            return jvmPrimitiveType;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    public static JvmPrimitiveType e(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(5);
        }
        JvmPrimitiveType jvmPrimitiveType = f147142n.get(primitiveType);
        if (jvmPrimitiveType == null) {
            a(6);
        }
        return jvmPrimitiveType;
    }

    public String l() {
        String str = this.f147149c;
        if (str == null) {
            a(14);
        }
        return str;
    }

    public String m() {
        String str = this.f147148b;
        if (str == null) {
            a(13);
        }
        return str;
    }

    public PrimitiveType o() {
        PrimitiveType primitiveType = this.f147147a;
        if (primitiveType == null) {
            a(12);
        }
        return primitiveType;
    }

    public FqName p() {
        FqName fqName = this.f147150d;
        if (fqName == null) {
            a(15);
        }
        return fqName;
    }
}
