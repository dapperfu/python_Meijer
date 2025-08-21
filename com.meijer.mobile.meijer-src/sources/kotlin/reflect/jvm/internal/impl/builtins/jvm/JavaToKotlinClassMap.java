package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class JavaToKotlinClassMap {

    /* renamed from: a, reason: collision with root package name */
    public static final JavaToKotlinClassMap f144399a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f144400b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f144401c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f144402d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f144403e;

    /* renamed from: f, reason: collision with root package name */
    private static final ClassId f144404f;

    /* renamed from: g, reason: collision with root package name */
    private static final FqName f144405g;

    /* renamed from: h, reason: collision with root package name */
    private static final ClassId f144406h;

    /* renamed from: i, reason: collision with root package name */
    private static final ClassId f144407i;

    /* renamed from: j, reason: collision with root package name */
    private static final ClassId f144408j;

    /* renamed from: k, reason: collision with root package name */
    private static final HashMap<FqNameUnsafe, ClassId> f144409k;

    /* renamed from: l, reason: collision with root package name */
    private static final HashMap<FqNameUnsafe, ClassId> f144410l;

    /* renamed from: m, reason: collision with root package name */
    private static final HashMap<FqNameUnsafe, FqName> f144411m;

    /* renamed from: n, reason: collision with root package name */
    private static final HashMap<FqNameUnsafe, FqName> f144412n;

    /* renamed from: o, reason: collision with root package name */
    private static final HashMap<ClassId, ClassId> f144413o;

    /* renamed from: p, reason: collision with root package name */
    private static final HashMap<ClassId, ClassId> f144414p;

    /* renamed from: q, reason: collision with root package name */
    private static final List<PlatformMutabilityMapping> f144415q;

    public static final class PlatformMutabilityMapping {

        /* renamed from: a, reason: collision with root package name */
        private final ClassId f144416a;

        /* renamed from: b, reason: collision with root package name */
        private final ClassId f144417b;

        /* renamed from: c, reason: collision with root package name */
        private final ClassId f144418c;

        public final ClassId a() {
            return this.f144416a;
        }

        public final ClassId b() {
            return this.f144417b;
        }

        public final ClassId c() {
            return this.f144418c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformMutabilityMapping)) {
                return false;
            }
            PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
            return Intrinsics.e(this.f144416a, platformMutabilityMapping.f144416a) && Intrinsics.e(this.f144417b, platformMutabilityMapping.f144417b) && Intrinsics.e(this.f144418c, platformMutabilityMapping.f144418c);
        }

        public int hashCode() {
            return (((this.f144416a.hashCode() * 31) + this.f144417b.hashCode()) * 31) + this.f144418c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f144416a + ", kotlinReadOnly=" + this.f144417b + ", kotlinMutable=" + this.f144418c + ')';
        }

        public PlatformMutabilityMapping(ClassId javaClass, ClassId kotlinReadOnly, ClassId kotlinMutable) {
            Intrinsics.j(javaClass, "javaClass");
            Intrinsics.j(kotlinReadOnly, "kotlinReadOnly");
            Intrinsics.j(kotlinMutable, "kotlinMutable");
            this.f144416a = javaClass;
            this.f144417b = kotlinReadOnly;
            this.f144418c = kotlinMutable;
        }

        public final ClassId d() {
            return this.f144416a;
        }
    }

    static {
        JavaToKotlinClassMap javaToKotlinClassMap = new JavaToKotlinClassMap();
        f144399a = javaToKotlinClassMap;
        StringBuilder sb2 = new StringBuilder();
        FunctionTypeKind.Function function = FunctionTypeKind.Function.f144385f;
        sb2.append(function.b());
        sb2.append('.');
        sb2.append(function.a());
        f144400b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionTypeKind.KFunction kFunction = FunctionTypeKind.KFunction.f144386f;
        sb3.append(kFunction.b());
        sb3.append('.');
        sb3.append(kFunction.a());
        f144401c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.f144388f;
        sb4.append(suspendFunction.b());
        sb4.append('.');
        sb4.append(suspendFunction.a());
        f144402d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        FunctionTypeKind.KSuspendFunction kSuspendFunction = FunctionTypeKind.KSuspendFunction.f144387f;
        sb5.append(kSuspendFunction.b());
        sb5.append('.');
        sb5.append(kSuspendFunction.a());
        f144403e = sb5.toString();
        ClassId.Companion companion = ClassId.f146581d;
        ClassId classIdC = companion.c(new FqName("kotlin.jvm.functions.FunctionN"));
        f144404f = classIdC;
        f144405g = classIdC.a();
        StandardClassIds standardClassIds = StandardClassIds.f146663a;
        f144406h = standardClassIds.k();
        f144407i = standardClassIds.j();
        f144408j = javaToKotlinClassMap.g(Class.class);
        f144409k = new HashMap<>();
        f144410l = new HashMap<>();
        f144411m = new HashMap<>();
        f144412n = new HashMap<>();
        f144413o = new HashMap<>();
        f144414p = new HashMap<>();
        ClassId classIdC2 = companion.c(StandardNames.FqNames.f144271W);
        PlatformMutabilityMapping platformMutabilityMapping = new PlatformMutabilityMapping(javaToKotlinClassMap.g(Iterable.class), classIdC2, new ClassId(classIdC2.f(), FqNamesUtilKt.g(StandardNames.FqNames.f144284e0, classIdC2.f()), false));
        ClassId classIdC3 = companion.c(StandardNames.FqNames.f144269V);
        PlatformMutabilityMapping platformMutabilityMapping2 = new PlatformMutabilityMapping(javaToKotlinClassMap.g(Iterator.class), classIdC3, new ClassId(classIdC3.f(), FqNamesUtilKt.g(StandardNames.FqNames.f144282d0, classIdC3.f()), false));
        ClassId classIdC4 = companion.c(StandardNames.FqNames.f144272X);
        PlatformMutabilityMapping platformMutabilityMapping3 = new PlatformMutabilityMapping(javaToKotlinClassMap.g(Collection.class), classIdC4, new ClassId(classIdC4.f(), FqNamesUtilKt.g(StandardNames.FqNames.f144286f0, classIdC4.f()), false));
        ClassId classIdC5 = companion.c(StandardNames.FqNames.f144273Y);
        PlatformMutabilityMapping platformMutabilityMapping4 = new PlatformMutabilityMapping(javaToKotlinClassMap.g(List.class), classIdC5, new ClassId(classIdC5.f(), FqNamesUtilKt.g(StandardNames.FqNames.f144288g0, classIdC5.f()), false));
        ClassId classIdC6 = companion.c(StandardNames.FqNames.f144276a0);
        PlatformMutabilityMapping platformMutabilityMapping5 = new PlatformMutabilityMapping(javaToKotlinClassMap.g(Set.class), classIdC6, new ClassId(classIdC6.f(), FqNamesUtilKt.g(StandardNames.FqNames.f144292i0, classIdC6.f()), false));
        ClassId classIdC7 = companion.c(StandardNames.FqNames.f144274Z);
        PlatformMutabilityMapping platformMutabilityMapping6 = new PlatformMutabilityMapping(javaToKotlinClassMap.g(ListIterator.class), classIdC7, new ClassId(classIdC7.f(), FqNamesUtilKt.g(StandardNames.FqNames.f144290h0, classIdC7.f()), false));
        FqName fqName = StandardNames.FqNames.f144278b0;
        ClassId classIdC8 = companion.c(fqName);
        PlatformMutabilityMapping platformMutabilityMapping7 = new PlatformMutabilityMapping(javaToKotlinClassMap.g(Map.class), classIdC8, new ClassId(classIdC8.f(), FqNamesUtilKt.g(StandardNames.FqNames.f144294j0, classIdC8.f()), false));
        ClassId classIdD = companion.c(fqName).d(StandardNames.FqNames.f144280c0.f());
        List<PlatformMutabilityMapping> listP = CollectionsKt.p(platformMutabilityMapping, platformMutabilityMapping2, platformMutabilityMapping3, platformMutabilityMapping4, platformMutabilityMapping5, platformMutabilityMapping6, platformMutabilityMapping7, new PlatformMutabilityMapping(javaToKotlinClassMap.g(Map.Entry.class), classIdD, new ClassId(classIdD.f(), FqNamesUtilKt.g(StandardNames.FqNames.f144296k0, classIdD.f()), false)));
        f144415q = listP;
        javaToKotlinClassMap.f(Object.class, StandardNames.FqNames.f144277b);
        javaToKotlinClassMap.f(String.class, StandardNames.FqNames.f144289h);
        javaToKotlinClassMap.f(CharSequence.class, StandardNames.FqNames.f144287g);
        javaToKotlinClassMap.e(Throwable.class, StandardNames.FqNames.f144315u);
        javaToKotlinClassMap.f(Cloneable.class, StandardNames.FqNames.f144281d);
        javaToKotlinClassMap.f(Number.class, StandardNames.FqNames.f144309r);
        javaToKotlinClassMap.e(Comparable.class, StandardNames.FqNames.f144317v);
        javaToKotlinClassMap.f(Enum.class, StandardNames.FqNames.f144311s);
        javaToKotlinClassMap.e(Annotation.class, StandardNames.FqNames.f144239G);
        Iterator<PlatformMutabilityMapping> it = listP.iterator();
        while (it.hasNext()) {
            f144399a.d(it.next());
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            JavaToKotlinClassMap javaToKotlinClassMap2 = f144399a;
            ClassId.Companion companion2 = ClassId.f146581d;
            FqName fqNameP = jvmPrimitiveType.p();
            Intrinsics.i(fqNameP, "getWrapperFqName(...)");
            ClassId classIdC9 = companion2.c(fqNameP);
            PrimitiveType primitiveTypeO = jvmPrimitiveType.o();
            Intrinsics.i(primitiveTypeO, "getPrimitiveType(...)");
            javaToKotlinClassMap2.a(classIdC9, companion2.c(StandardNames.c(primitiveTypeO)));
        }
        for (ClassId classId : CompanionObjectMapping.f144143a.a()) {
            f144399a.a(ClassId.f146581d.c(new FqName("kotlin.jvm.internal." + classId.h().b() + "CompanionObject")), classId.d(SpecialNames.f146604d));
        }
        for (int i10 = 0; i10 < 23; i10++) {
            JavaToKotlinClassMap javaToKotlinClassMap3 = f144399a;
            javaToKotlinClassMap3.a(ClassId.f146581d.c(new FqName("kotlin.jvm.functions.Function" + i10)), StandardNames.a(i10));
            javaToKotlinClassMap3.c(new FqName(f144401c + i10), f144406h);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            FunctionTypeKind.KSuspendFunction kSuspendFunction2 = FunctionTypeKind.KSuspendFunction.f144387f;
            f144399a.c(new FqName((kSuspendFunction2.b() + '.' + kSuspendFunction2.a()) + i11), f144406h);
        }
        JavaToKotlinClassMap javaToKotlinClassMap4 = f144399a;
        javaToKotlinClassMap4.c(new FqName("kotlin.concurrent.atomics.AtomicInt"), javaToKotlinClassMap4.g(AtomicInteger.class));
        javaToKotlinClassMap4.c(new FqName("kotlin.concurrent.atomics.AtomicLong"), javaToKotlinClassMap4.g(AtomicLong.class));
        javaToKotlinClassMap4.c(new FqName("kotlin.concurrent.atomics.AtomicBoolean"), javaToKotlinClassMap4.g(AtomicBoolean.class));
        javaToKotlinClassMap4.c(new FqName("kotlin.concurrent.atomics.AtomicReference"), javaToKotlinClassMap4.g(AtomicReference.class));
        javaToKotlinClassMap4.c(new FqName("kotlin.concurrent.atomics.AtomicIntArray"), javaToKotlinClassMap4.g(AtomicIntegerArray.class));
        javaToKotlinClassMap4.c(new FqName("kotlin.concurrent.atomics.AtomicLongArray"), javaToKotlinClassMap4.g(AtomicLongArray.class));
        javaToKotlinClassMap4.c(new FqName("kotlin.concurrent.atomics.AtomicArray"), javaToKotlinClassMap4.g(AtomicReferenceArray.class));
        javaToKotlinClassMap4.c(StandardNames.FqNames.f144279c.m(), javaToKotlinClassMap4.g(Void.class));
    }

    private final void b(ClassId classId, ClassId classId2) {
        f144409k.put(classId.a().i(), classId2);
    }

    private final void c(FqName fqName, ClassId classId) {
        f144410l.put(fqName.i(), classId);
    }

    public final FqName h() {
        return f144405g;
    }

    public final List<PlatformMutabilityMapping> i() {
        return f144415q;
    }

    public final boolean k(FqNameUnsafe fqNameUnsafe) {
        return f144411m.containsKey(fqNameUnsafe);
    }

    public final boolean l(FqNameUnsafe fqNameUnsafe) {
        return f144412n.containsKey(fqNameUnsafe);
    }

    public final ClassId m(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        return f144409k.get(fqName.i());
    }

    public final ClassId n(FqNameUnsafe kotlinFqName) {
        Intrinsics.j(kotlinFqName, "kotlinFqName");
        return j(kotlinFqName, f144400b) ? f144404f : j(kotlinFqName, f144402d) ? f144404f : j(kotlinFqName, f144401c) ? f144406h : j(kotlinFqName, f144403e) ? f144406h : f144410l.get(kotlinFqName);
    }

    public final FqName o(FqNameUnsafe fqNameUnsafe) {
        return f144411m.get(fqNameUnsafe);
    }

    public final FqName p(FqNameUnsafe fqNameUnsafe) {
        return f144412n.get(fqNameUnsafe);
    }

    private JavaToKotlinClassMap() {
    }

    private final void a(ClassId classId, ClassId classId2) {
        b(classId, classId2);
        c(classId2.a(), classId);
    }

    private final void d(PlatformMutabilityMapping platformMutabilityMapping) {
        ClassId classIdA = platformMutabilityMapping.a();
        ClassId classIdB = platformMutabilityMapping.b();
        ClassId classIdC = platformMutabilityMapping.c();
        a(classIdA, classIdB);
        c(classIdC.a(), classIdA);
        f144413o.put(classIdC, classIdB);
        f144414p.put(classIdB, classIdC);
        FqName fqNameA = classIdB.a();
        FqName fqNameA2 = classIdC.a();
        f144411m.put(classIdC.a().i(), fqNameA);
        f144412n.put(fqNameA.i(), fqNameA2);
    }

    private final void e(Class<?> cls, FqName fqName) {
        a(g(cls), ClassId.f146581d.c(fqName));
    }

    private final void f(Class<?> cls, FqNameUnsafe fqNameUnsafe) {
        e(cls, fqNameUnsafe.m());
    }

    private final ClassId g(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ClassId.Companion companion = ClassId.f146581d;
            String canonicalName = cls.getCanonicalName();
            Intrinsics.i(canonicalName, "getCanonicalName(...)");
            return companion.c(new FqName(canonicalName));
        }
        ClassId classIdG = g(declaringClass);
        Name nameO = Name.o(cls.getSimpleName());
        Intrinsics.i(nameO, "identifier(...)");
        return classIdG.d(nameO);
    }

    private final boolean j(FqNameUnsafe fqNameUnsafe, String str) {
        Integer numV;
        String strA = fqNameUnsafe.a();
        if (!StringsKt.W(strA, str, false, 2, null)) {
            return false;
        }
        String strSubstring = strA.substring(str.length());
        Intrinsics.i(strSubstring, "substring(...)");
        if (StringsKt.h1(strSubstring, '0', false, 2, null) || (numV = StringsKt.v(strSubstring)) == null || numV.intValue() < 23) {
            return false;
        }
        return true;
    }
}
