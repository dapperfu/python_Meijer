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
/* loaded from: classes13.dex */
public final class JavaToKotlinClassMap {

    /* renamed from: a, reason: collision with root package name */
    public static final JavaToKotlinClassMap f143492a;

    /* renamed from: b, reason: collision with root package name */
    private static final String f143493b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f143494c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f143495d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f143496e;

    /* renamed from: f, reason: collision with root package name */
    private static final ClassId f143497f;

    /* renamed from: g, reason: collision with root package name */
    private static final FqName f143498g;

    /* renamed from: h, reason: collision with root package name */
    private static final ClassId f143499h;

    /* renamed from: i, reason: collision with root package name */
    private static final ClassId f143500i;

    /* renamed from: j, reason: collision with root package name */
    private static final ClassId f143501j;

    /* renamed from: k, reason: collision with root package name */
    private static final HashMap<FqNameUnsafe, ClassId> f143502k;

    /* renamed from: l, reason: collision with root package name */
    private static final HashMap<FqNameUnsafe, ClassId> f143503l;

    /* renamed from: m, reason: collision with root package name */
    private static final HashMap<FqNameUnsafe, FqName> f143504m;

    /* renamed from: n, reason: collision with root package name */
    private static final HashMap<FqNameUnsafe, FqName> f143505n;

    /* renamed from: o, reason: collision with root package name */
    private static final HashMap<ClassId, ClassId> f143506o;

    /* renamed from: p, reason: collision with root package name */
    private static final HashMap<ClassId, ClassId> f143507p;

    /* renamed from: q, reason: collision with root package name */
    private static final List<PlatformMutabilityMapping> f143508q;

    public static final class PlatformMutabilityMapping {

        /* renamed from: a, reason: collision with root package name */
        private final ClassId f143509a;

        /* renamed from: b, reason: collision with root package name */
        private final ClassId f143510b;

        /* renamed from: c, reason: collision with root package name */
        private final ClassId f143511c;

        public final ClassId a() {
            return this.f143509a;
        }

        public final ClassId b() {
            return this.f143510b;
        }

        public final ClassId c() {
            return this.f143511c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformMutabilityMapping)) {
                return false;
            }
            PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
            return Intrinsics.e(this.f143509a, platformMutabilityMapping.f143509a) && Intrinsics.e(this.f143510b, platformMutabilityMapping.f143510b) && Intrinsics.e(this.f143511c, platformMutabilityMapping.f143511c);
        }

        public int hashCode() {
            return (((this.f143509a.hashCode() * 31) + this.f143510b.hashCode()) * 31) + this.f143511c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f143509a + ", kotlinReadOnly=" + this.f143510b + ", kotlinMutable=" + this.f143511c + ')';
        }

        public PlatformMutabilityMapping(ClassId javaClass, ClassId kotlinReadOnly, ClassId kotlinMutable) {
            Intrinsics.j(javaClass, "javaClass");
            Intrinsics.j(kotlinReadOnly, "kotlinReadOnly");
            Intrinsics.j(kotlinMutable, "kotlinMutable");
            this.f143509a = javaClass;
            this.f143510b = kotlinReadOnly;
            this.f143511c = kotlinMutable;
        }

        public final ClassId d() {
            return this.f143509a;
        }
    }

    static {
        JavaToKotlinClassMap javaToKotlinClassMap = new JavaToKotlinClassMap();
        f143492a = javaToKotlinClassMap;
        StringBuilder sb2 = new StringBuilder();
        FunctionTypeKind.Function function = FunctionTypeKind.Function.f143478f;
        sb2.append(function.b());
        sb2.append('.');
        sb2.append(function.a());
        f143493b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionTypeKind.KFunction kFunction = FunctionTypeKind.KFunction.f143479f;
        sb3.append(kFunction.b());
        sb3.append('.');
        sb3.append(kFunction.a());
        f143494c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.f143481f;
        sb4.append(suspendFunction.b());
        sb4.append('.');
        sb4.append(suspendFunction.a());
        f143495d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        FunctionTypeKind.KSuspendFunction kSuspendFunction = FunctionTypeKind.KSuspendFunction.f143480f;
        sb5.append(kSuspendFunction.b());
        sb5.append('.');
        sb5.append(kSuspendFunction.a());
        f143496e = sb5.toString();
        ClassId.Companion companion = ClassId.f145674d;
        ClassId classIdC = companion.c(new FqName("kotlin.jvm.functions.FunctionN"));
        f143497f = classIdC;
        f143498g = classIdC.a();
        StandardClassIds standardClassIds = StandardClassIds.f145756a;
        f143499h = standardClassIds.k();
        f143500i = standardClassIds.j();
        f143501j = javaToKotlinClassMap.g(Class.class);
        f143502k = new HashMap<>();
        f143503l = new HashMap<>();
        f143504m = new HashMap<>();
        f143505n = new HashMap<>();
        f143506o = new HashMap<>();
        f143507p = new HashMap<>();
        ClassId classIdC2 = companion.c(StandardNames.FqNames.f143364W);
        PlatformMutabilityMapping platformMutabilityMapping = new PlatformMutabilityMapping(javaToKotlinClassMap.g(Iterable.class), classIdC2, new ClassId(classIdC2.f(), FqNamesUtilKt.g(StandardNames.FqNames.f143377e0, classIdC2.f()), false));
        ClassId classIdC3 = companion.c(StandardNames.FqNames.f143362V);
        PlatformMutabilityMapping platformMutabilityMapping2 = new PlatformMutabilityMapping(javaToKotlinClassMap.g(Iterator.class), classIdC3, new ClassId(classIdC3.f(), FqNamesUtilKt.g(StandardNames.FqNames.f143375d0, classIdC3.f()), false));
        ClassId classIdC4 = companion.c(StandardNames.FqNames.f143365X);
        PlatformMutabilityMapping platformMutabilityMapping3 = new PlatformMutabilityMapping(javaToKotlinClassMap.g(Collection.class), classIdC4, new ClassId(classIdC4.f(), FqNamesUtilKt.g(StandardNames.FqNames.f143379f0, classIdC4.f()), false));
        ClassId classIdC5 = companion.c(StandardNames.FqNames.f143366Y);
        PlatformMutabilityMapping platformMutabilityMapping4 = new PlatformMutabilityMapping(javaToKotlinClassMap.g(List.class), classIdC5, new ClassId(classIdC5.f(), FqNamesUtilKt.g(StandardNames.FqNames.f143381g0, classIdC5.f()), false));
        ClassId classIdC6 = companion.c(StandardNames.FqNames.f143369a0);
        PlatformMutabilityMapping platformMutabilityMapping5 = new PlatformMutabilityMapping(javaToKotlinClassMap.g(Set.class), classIdC6, new ClassId(classIdC6.f(), FqNamesUtilKt.g(StandardNames.FqNames.f143385i0, classIdC6.f()), false));
        ClassId classIdC7 = companion.c(StandardNames.FqNames.f143367Z);
        PlatformMutabilityMapping platformMutabilityMapping6 = new PlatformMutabilityMapping(javaToKotlinClassMap.g(ListIterator.class), classIdC7, new ClassId(classIdC7.f(), FqNamesUtilKt.g(StandardNames.FqNames.f143383h0, classIdC7.f()), false));
        FqName fqName = StandardNames.FqNames.f143371b0;
        ClassId classIdC8 = companion.c(fqName);
        PlatformMutabilityMapping platformMutabilityMapping7 = new PlatformMutabilityMapping(javaToKotlinClassMap.g(Map.class), classIdC8, new ClassId(classIdC8.f(), FqNamesUtilKt.g(StandardNames.FqNames.f143387j0, classIdC8.f()), false));
        ClassId classIdD = companion.c(fqName).d(StandardNames.FqNames.f143373c0.f());
        List<PlatformMutabilityMapping> listP = CollectionsKt.p(platformMutabilityMapping, platformMutabilityMapping2, platformMutabilityMapping3, platformMutabilityMapping4, platformMutabilityMapping5, platformMutabilityMapping6, platformMutabilityMapping7, new PlatformMutabilityMapping(javaToKotlinClassMap.g(Map.Entry.class), classIdD, new ClassId(classIdD.f(), FqNamesUtilKt.g(StandardNames.FqNames.f143389k0, classIdD.f()), false)));
        f143508q = listP;
        javaToKotlinClassMap.f(Object.class, StandardNames.FqNames.f143370b);
        javaToKotlinClassMap.f(String.class, StandardNames.FqNames.f143382h);
        javaToKotlinClassMap.f(CharSequence.class, StandardNames.FqNames.f143380g);
        javaToKotlinClassMap.e(Throwable.class, StandardNames.FqNames.f143408u);
        javaToKotlinClassMap.f(Cloneable.class, StandardNames.FqNames.f143374d);
        javaToKotlinClassMap.f(Number.class, StandardNames.FqNames.f143402r);
        javaToKotlinClassMap.e(Comparable.class, StandardNames.FqNames.f143410v);
        javaToKotlinClassMap.f(Enum.class, StandardNames.FqNames.f143404s);
        javaToKotlinClassMap.e(Annotation.class, StandardNames.FqNames.f143332G);
        Iterator<PlatformMutabilityMapping> it = listP.iterator();
        while (it.hasNext()) {
            f143492a.d(it.next());
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            JavaToKotlinClassMap javaToKotlinClassMap2 = f143492a;
            ClassId.Companion companion2 = ClassId.f145674d;
            FqName fqNameP = jvmPrimitiveType.p();
            Intrinsics.i(fqNameP, "getWrapperFqName(...)");
            ClassId classIdC9 = companion2.c(fqNameP);
            PrimitiveType primitiveTypeO = jvmPrimitiveType.o();
            Intrinsics.i(primitiveTypeO, "getPrimitiveType(...)");
            javaToKotlinClassMap2.a(classIdC9, companion2.c(StandardNames.c(primitiveTypeO)));
        }
        for (ClassId classId : CompanionObjectMapping.f143236a.a()) {
            f143492a.a(ClassId.f145674d.c(new FqName("kotlin.jvm.internal." + classId.h().b() + "CompanionObject")), classId.d(SpecialNames.f145697d));
        }
        for (int i10 = 0; i10 < 23; i10++) {
            JavaToKotlinClassMap javaToKotlinClassMap3 = f143492a;
            javaToKotlinClassMap3.a(ClassId.f145674d.c(new FqName("kotlin.jvm.functions.Function" + i10)), StandardNames.a(i10));
            javaToKotlinClassMap3.c(new FqName(f143494c + i10), f143499h);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            FunctionTypeKind.KSuspendFunction kSuspendFunction2 = FunctionTypeKind.KSuspendFunction.f143480f;
            f143492a.c(new FqName((kSuspendFunction2.b() + '.' + kSuspendFunction2.a()) + i11), f143499h);
        }
        JavaToKotlinClassMap javaToKotlinClassMap4 = f143492a;
        javaToKotlinClassMap4.c(new FqName("kotlin.concurrent.atomics.AtomicInt"), javaToKotlinClassMap4.g(AtomicInteger.class));
        javaToKotlinClassMap4.c(new FqName("kotlin.concurrent.atomics.AtomicLong"), javaToKotlinClassMap4.g(AtomicLong.class));
        javaToKotlinClassMap4.c(new FqName("kotlin.concurrent.atomics.AtomicBoolean"), javaToKotlinClassMap4.g(AtomicBoolean.class));
        javaToKotlinClassMap4.c(new FqName("kotlin.concurrent.atomics.AtomicReference"), javaToKotlinClassMap4.g(AtomicReference.class));
        javaToKotlinClassMap4.c(new FqName("kotlin.concurrent.atomics.AtomicIntArray"), javaToKotlinClassMap4.g(AtomicIntegerArray.class));
        javaToKotlinClassMap4.c(new FqName("kotlin.concurrent.atomics.AtomicLongArray"), javaToKotlinClassMap4.g(AtomicLongArray.class));
        javaToKotlinClassMap4.c(new FqName("kotlin.concurrent.atomics.AtomicArray"), javaToKotlinClassMap4.g(AtomicReferenceArray.class));
        javaToKotlinClassMap4.c(StandardNames.FqNames.f143372c.m(), javaToKotlinClassMap4.g(Void.class));
    }

    private final void b(ClassId classId, ClassId classId2) {
        f143502k.put(classId.a().i(), classId2);
    }

    private final void c(FqName fqName, ClassId classId) {
        f143503l.put(fqName.i(), classId);
    }

    public final FqName h() {
        return f143498g;
    }

    public final List<PlatformMutabilityMapping> i() {
        return f143508q;
    }

    public final boolean k(FqNameUnsafe fqNameUnsafe) {
        return f143504m.containsKey(fqNameUnsafe);
    }

    public final boolean l(FqNameUnsafe fqNameUnsafe) {
        return f143505n.containsKey(fqNameUnsafe);
    }

    public final ClassId m(FqName fqName) {
        Intrinsics.j(fqName, "fqName");
        return f143502k.get(fqName.i());
    }

    public final ClassId n(FqNameUnsafe kotlinFqName) {
        Intrinsics.j(kotlinFqName, "kotlinFqName");
        return j(kotlinFqName, f143493b) ? f143497f : j(kotlinFqName, f143495d) ? f143497f : j(kotlinFqName, f143494c) ? f143499h : j(kotlinFqName, f143496e) ? f143499h : f143503l.get(kotlinFqName);
    }

    public final FqName o(FqNameUnsafe fqNameUnsafe) {
        return f143504m.get(fqNameUnsafe);
    }

    public final FqName p(FqNameUnsafe fqNameUnsafe) {
        return f143505n.get(fqNameUnsafe);
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
        f143506o.put(classIdC, classIdB);
        f143507p.put(classIdB, classIdC);
        FqName fqNameA = classIdB.a();
        FqName fqNameA2 = classIdC.a();
        f143504m.put(classIdC.a().i(), fqNameA);
        f143505n.put(fqNameA.i(), fqNameA2);
    }

    private final void e(Class<?> cls, FqName fqName) {
        a(g(cls), ClassId.f145674d.c(fqName));
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
            ClassId.Companion companion = ClassId.f145674d;
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
        if (StringsKt.d1(strSubstring, '0', false, 2, null) || (numV = StringsKt.v(strSubstring)) == null || numV.intValue() < 23) {
            return false;
        }
        return true;
    }
}
