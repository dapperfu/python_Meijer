package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* loaded from: classes13.dex */
public final class StandardNames {

    /* renamed from: A, reason: collision with root package name */
    @JvmField
    public static final FqName f143284A;

    /* renamed from: B, reason: collision with root package name */
    @JvmField
    public static final FqName f143285B;

    /* renamed from: C, reason: collision with root package name */
    @JvmField
    public static final FqName f143286C;

    /* renamed from: D, reason: collision with root package name */
    @JvmField
    public static final FqName f143287D;

    /* renamed from: E, reason: collision with root package name */
    @JvmField
    public static final FqName f143288E;

    /* renamed from: F, reason: collision with root package name */
    @JvmField
    public static final FqName f143289F;

    /* renamed from: G, reason: collision with root package name */
    @JvmField
    public static final FqName f143290G;

    /* renamed from: H, reason: collision with root package name */
    @JvmField
    public static final FqName f143291H;

    /* renamed from: I, reason: collision with root package name */
    private static final FqName f143292I;

    /* renamed from: J, reason: collision with root package name */
    @JvmField
    public static final Set<FqName> f143293J;

    /* renamed from: a, reason: collision with root package name */
    public static final StandardNames f143294a = new StandardNames();

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final Name f143295b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final Name f143296c;

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final Name f143297d;

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public static final Name f143298e;

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public static final Name f143299f;

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public static final Name f143300g;

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public static final String f143301h;

    /* renamed from: i, reason: collision with root package name */
    @JvmField
    public static final Name f143302i;

    /* renamed from: j, reason: collision with root package name */
    @JvmField
    public static final Name f143303j;

    /* renamed from: k, reason: collision with root package name */
    @JvmField
    public static final Name f143304k;

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static final Name f143305l;

    /* renamed from: m, reason: collision with root package name */
    @JvmField
    public static final Name f143306m;

    /* renamed from: n, reason: collision with root package name */
    @JvmField
    public static final Name f143307n;

    /* renamed from: o, reason: collision with root package name */
    @JvmField
    public static final Name f143308o;

    /* renamed from: p, reason: collision with root package name */
    @JvmField
    public static final Name f143309p;

    /* renamed from: q, reason: collision with root package name */
    @JvmField
    public static final Name f143310q;

    /* renamed from: r, reason: collision with root package name */
    @JvmField
    public static final FqName f143311r;

    /* renamed from: s, reason: collision with root package name */
    @JvmField
    public static final FqName f143312s;

    /* renamed from: t, reason: collision with root package name */
    @JvmField
    public static final FqName f143313t;

    /* renamed from: u, reason: collision with root package name */
    @JvmField
    public static final FqName f143314u;

    /* renamed from: v, reason: collision with root package name */
    @JvmField
    public static final FqName f143315v;

    /* renamed from: w, reason: collision with root package name */
    @JvmField
    public static final FqName f143316w;

    /* renamed from: x, reason: collision with root package name */
    @JvmField
    public static final FqName f143317x;

    /* renamed from: y, reason: collision with root package name */
    @JvmField
    public static final List<String> f143318y;

    /* renamed from: z, reason: collision with root package name */
    @JvmField
    public static final Name f143319z;

    @SourceDebugExtension
    public static final class FqNames {

        /* renamed from: A, reason: collision with root package name */
        @JvmField
        public static final FqName f143320A;

        /* renamed from: A0, reason: collision with root package name */
        @JvmField
        public static final FqName f143321A0;

        /* renamed from: B, reason: collision with root package name */
        @JvmField
        public static final FqName f143322B;

        /* renamed from: B0, reason: collision with root package name */
        @JvmField
        public static final FqName f143323B0;

        /* renamed from: C, reason: collision with root package name */
        @JvmField
        public static final FqName f143324C;

        /* renamed from: C0, reason: collision with root package name */
        @JvmField
        public static final FqName f143325C0;

        /* renamed from: D, reason: collision with root package name */
        @JvmField
        public static final FqName f143326D;

        /* renamed from: D0, reason: collision with root package name */
        @JvmField
        public static final ClassId f143327D0;

        /* renamed from: E, reason: collision with root package name */
        @JvmField
        public static final FqName f143328E;

        /* renamed from: E0, reason: collision with root package name */
        @JvmField
        public static final ClassId f143329E0;

        /* renamed from: F, reason: collision with root package name */
        @JvmField
        public static final ClassId f143330F;

        /* renamed from: F0, reason: collision with root package name */
        @JvmField
        public static final ClassId f143331F0;

        /* renamed from: G, reason: collision with root package name */
        @JvmField
        public static final FqName f143332G;

        /* renamed from: G0, reason: collision with root package name */
        @JvmField
        public static final ClassId f143333G0;

        /* renamed from: H, reason: collision with root package name */
        @JvmField
        public static final FqName f143334H;

        /* renamed from: H0, reason: collision with root package name */
        @JvmField
        public static final FqName f143335H0;

        /* renamed from: I, reason: collision with root package name */
        @JvmField
        public static final ClassId f143336I;

        /* renamed from: I0, reason: collision with root package name */
        @JvmField
        public static final FqName f143337I0;

        /* renamed from: J, reason: collision with root package name */
        @JvmField
        public static final FqName f143338J;

        /* renamed from: J0, reason: collision with root package name */
        @JvmField
        public static final FqName f143339J0;

        /* renamed from: K, reason: collision with root package name */
        @JvmField
        public static final FqName f143340K;

        /* renamed from: K0, reason: collision with root package name */
        @JvmField
        public static final FqName f143341K0;

        /* renamed from: L, reason: collision with root package name */
        @JvmField
        public static final FqName f143342L;

        /* renamed from: L0, reason: collision with root package name */
        @JvmField
        public static final FqName f143343L0;

        /* renamed from: M, reason: collision with root package name */
        @JvmField
        public static final ClassId f143344M;

        /* renamed from: M0, reason: collision with root package name */
        @JvmField
        public static final FqName f143345M0;

        /* renamed from: N, reason: collision with root package name */
        @JvmField
        public static final FqName f143346N;

        /* renamed from: N0, reason: collision with root package name */
        @JvmField
        public static final FqName f143347N0;

        /* renamed from: O, reason: collision with root package name */
        @JvmField
        public static final ClassId f143348O;

        /* renamed from: O0, reason: collision with root package name */
        @JvmField
        public static final FqName f143349O0;

        /* renamed from: P, reason: collision with root package name */
        @JvmField
        public static final FqName f143350P;

        /* renamed from: P0, reason: collision with root package name */
        @JvmField
        public static final FqName f143351P0;

        /* renamed from: Q, reason: collision with root package name */
        @JvmField
        public static final FqName f143352Q;

        /* renamed from: Q0, reason: collision with root package name */
        @JvmField
        public static final FqName f143353Q0;

        /* renamed from: R, reason: collision with root package name */
        @JvmField
        public static final FqName f143354R;

        /* renamed from: R0, reason: collision with root package name */
        @JvmField
        public static final FqName f143355R0;

        /* renamed from: S, reason: collision with root package name */
        @JvmField
        public static final FqName f143356S;

        /* renamed from: S0, reason: collision with root package name */
        @JvmField
        public static final Set<Name> f143357S0;

        /* renamed from: T, reason: collision with root package name */
        @JvmField
        public static final FqName f143358T;

        /* renamed from: T0, reason: collision with root package name */
        @JvmField
        public static final Set<Name> f143359T0;

        /* renamed from: U, reason: collision with root package name */
        @JvmField
        public static final ClassId f143360U;

        /* renamed from: U0, reason: collision with root package name */
        @JvmField
        public static final Map<FqNameUnsafe, PrimitiveType> f143361U0;

        /* renamed from: V, reason: collision with root package name */
        @JvmField
        public static final FqName f143362V;

        /* renamed from: V0, reason: collision with root package name */
        @JvmField
        public static final Map<FqNameUnsafe, PrimitiveType> f143363V0;

        /* renamed from: W, reason: collision with root package name */
        @JvmField
        public static final FqName f143364W;

        /* renamed from: X, reason: collision with root package name */
        @JvmField
        public static final FqName f143365X;

        /* renamed from: Y, reason: collision with root package name */
        @JvmField
        public static final FqName f143366Y;

        /* renamed from: Z, reason: collision with root package name */
        @JvmField
        public static final FqName f143367Z;

        /* renamed from: a, reason: collision with root package name */
        public static final FqNames f143368a;

        /* renamed from: a0, reason: collision with root package name */
        @JvmField
        public static final FqName f143369a0;

        /* renamed from: b, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143370b;

        /* renamed from: b0, reason: collision with root package name */
        @JvmField
        public static final FqName f143371b0;

        /* renamed from: c, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143372c;

        /* renamed from: c0, reason: collision with root package name */
        @JvmField
        public static final FqName f143373c0;

        /* renamed from: d, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143374d;

        /* renamed from: d0, reason: collision with root package name */
        @JvmField
        public static final FqName f143375d0;

        /* renamed from: e, reason: collision with root package name */
        @JvmField
        public static final FqName f143376e;

        /* renamed from: e0, reason: collision with root package name */
        @JvmField
        public static final FqName f143377e0;

        /* renamed from: f, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143378f;

        /* renamed from: f0, reason: collision with root package name */
        @JvmField
        public static final FqName f143379f0;

        /* renamed from: g, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143380g;

        /* renamed from: g0, reason: collision with root package name */
        @JvmField
        public static final FqName f143381g0;

        /* renamed from: h, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143382h;

        /* renamed from: h0, reason: collision with root package name */
        @JvmField
        public static final FqName f143383h0;

        /* renamed from: i, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143384i;

        /* renamed from: i0, reason: collision with root package name */
        @JvmField
        public static final FqName f143385i0;

        /* renamed from: j, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143386j;

        /* renamed from: j0, reason: collision with root package name */
        @JvmField
        public static final FqName f143387j0;

        /* renamed from: k, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143388k;

        /* renamed from: k0, reason: collision with root package name */
        @JvmField
        public static final FqName f143389k0;

        /* renamed from: l, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143390l;

        /* renamed from: l0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143391l0;

        /* renamed from: m, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143392m;

        /* renamed from: m0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143393m0;

        /* renamed from: n, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143394n;

        /* renamed from: n0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143395n0;

        /* renamed from: o, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143396o;

        /* renamed from: o0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143397o0;

        /* renamed from: p, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143398p;

        /* renamed from: p0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143399p0;

        /* renamed from: q, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143400q;

        /* renamed from: q0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143401q0;

        /* renamed from: r, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143402r;

        /* renamed from: r0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143403r0;

        /* renamed from: s, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143404s;

        /* renamed from: s0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143405s0;

        /* renamed from: t, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143406t;

        /* renamed from: t0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143407t0;

        /* renamed from: u, reason: collision with root package name */
        @JvmField
        public static final FqName f143408u;

        /* renamed from: u0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143409u0;

        /* renamed from: v, reason: collision with root package name */
        @JvmField
        public static final FqName f143410v;

        /* renamed from: v0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143411v0;

        /* renamed from: w, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143412w;

        /* renamed from: w0, reason: collision with root package name */
        @JvmField
        public static final ClassId f143413w0;

        /* renamed from: x, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143414x;

        /* renamed from: x0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143415x0;

        /* renamed from: y, reason: collision with root package name */
        @JvmField
        public static final FqName f143416y;

        /* renamed from: y0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f143417y0;

        /* renamed from: z, reason: collision with root package name */
        @JvmField
        public static final FqName f143418z;

        /* renamed from: z0, reason: collision with root package name */
        @JvmField
        public static final FqName f143419z0;

        static {
            FqNames fqNames = new FqNames();
            f143368a = fqNames;
            f143370b = fqNames.e("Any");
            f143372c = fqNames.e("Nothing");
            f143374d = fqNames.e("Cloneable");
            f143376e = fqNames.d("Suppress");
            f143378f = fqNames.e("Unit");
            f143380g = fqNames.e("CharSequence");
            f143382h = fqNames.e("String");
            f143384i = fqNames.e("Array");
            f143386j = fqNames.e("Boolean");
            f143388k = fqNames.e("Char");
            f143390l = fqNames.e("Byte");
            f143392m = fqNames.e("Short");
            f143394n = fqNames.e("Int");
            f143396o = fqNames.e("Long");
            f143398p = fqNames.e("Float");
            f143400q = fqNames.e("Double");
            f143402r = fqNames.e("Number");
            f143404s = fqNames.e("Enum");
            f143406t = fqNames.e("Function");
            f143408u = fqNames.d("Throwable");
            f143410v = fqNames.d("Comparable");
            f143412w = fqNames.g("IntRange");
            f143414x = fqNames.g("LongRange");
            f143416y = fqNames.d("Deprecated");
            f143418z = fqNames.d("DeprecatedSinceKotlin");
            f143320A = fqNames.d("DeprecationLevel");
            f143322B = fqNames.d("ReplaceWith");
            f143324C = fqNames.d("ExtensionFunctionType");
            f143326D = fqNames.d("ContextFunctionTypeParams");
            FqName fqNameD = fqNames.d("ParameterName");
            f143328E = fqNameD;
            ClassId.Companion companion = ClassId.f145674d;
            f143330F = companion.c(fqNameD);
            f143332G = fqNames.d("Annotation");
            FqName fqNameA = fqNames.a("Target");
            f143334H = fqNameA;
            f143336I = companion.c(fqNameA);
            f143338J = fqNames.a("AnnotationTarget");
            f143340K = fqNames.a("AnnotationRetention");
            FqName fqNameA2 = fqNames.a("Retention");
            f143342L = fqNameA2;
            f143344M = companion.c(fqNameA2);
            FqName fqNameA3 = fqNames.a("Repeatable");
            f143346N = fqNameA3;
            f143348O = companion.c(fqNameA3);
            f143350P = fqNames.a("MustBeDocumented");
            f143352Q = fqNames.d("UnsafeVariance");
            f143354R = fqNames.d("PublishedApi");
            f143356S = fqNames.f("AccessibleLateinitPropertyLiteral");
            FqName fqName = new FqName("kotlin.internal.PlatformDependent");
            f143358T = fqName;
            f143360U = companion.c(fqName);
            f143362V = fqNames.b("Iterator");
            f143364W = fqNames.b("Iterable");
            f143365X = fqNames.b("Collection");
            f143366Y = fqNames.b("List");
            f143367Z = fqNames.b("ListIterator");
            f143369a0 = fqNames.b("Set");
            FqName fqNameB = fqNames.b("Map");
            f143371b0 = fqNameB;
            Name nameO = Name.o("Entry");
            Intrinsics.i(nameO, "identifier(...)");
            f143373c0 = fqNameB.b(nameO);
            f143375d0 = fqNames.b("MutableIterator");
            f143377e0 = fqNames.b("MutableIterable");
            f143379f0 = fqNames.b("MutableCollection");
            f143381g0 = fqNames.b("MutableList");
            f143383h0 = fqNames.b("MutableListIterator");
            f143385i0 = fqNames.b("MutableSet");
            FqName fqNameB2 = fqNames.b("MutableMap");
            f143387j0 = fqNameB2;
            Name nameO2 = Name.o("MutableEntry");
            Intrinsics.i(nameO2, "identifier(...)");
            f143389k0 = fqNameB2.b(nameO2);
            f143391l0 = h("KClass");
            f143393m0 = h("KType");
            f143395n0 = h("KCallable");
            f143397o0 = h("KProperty0");
            f143399p0 = h("KProperty1");
            f143401q0 = h("KProperty2");
            f143403r0 = h("KMutableProperty0");
            f143405s0 = h("KMutableProperty1");
            f143407t0 = h("KMutableProperty2");
            FqNameUnsafe fqNameUnsafeH = h("KProperty");
            f143409u0 = fqNameUnsafeH;
            f143411v0 = h("KMutableProperty");
            f143413w0 = companion.c(fqNameUnsafeH.m());
            f143415x0 = h("KDeclarationContainer");
            f143417y0 = h("findAssociatedObject");
            FqName fqNameD2 = fqNames.d("UByte");
            f143419z0 = fqNameD2;
            FqName fqNameD3 = fqNames.d("UShort");
            f143321A0 = fqNameD3;
            FqName fqNameD4 = fqNames.d("UInt");
            f143323B0 = fqNameD4;
            FqName fqNameD5 = fqNames.d("ULong");
            f143325C0 = fqNameD5;
            f143327D0 = companion.c(fqNameD2);
            f143329E0 = companion.c(fqNameD3);
            f143331F0 = companion.c(fqNameD4);
            f143333G0 = companion.c(fqNameD5);
            f143335H0 = fqNames.d("UByteArray");
            f143337I0 = fqNames.d("UShortArray");
            f143339J0 = fqNames.d("UIntArray");
            f143341K0 = fqNames.d("ULongArray");
            f143343L0 = fqNames.c("AtomicInt");
            f143345M0 = fqNames.c("AtomicLong");
            f143347N0 = fqNames.c("AtomicBoolean");
            f143349O0 = fqNames.c("AtomicReference");
            f143351P0 = fqNames.c("AtomicIntArray");
            f143353Q0 = fqNames.c("AtomicLongArray");
            f143355R0 = fqNames.c("AtomicArray");
            HashSet hashSetF = CollectionsKt.f(PrimitiveType.values().length);
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                hashSetF.add(primitiveType.t());
            }
            f143357S0 = hashSetF;
            HashSet hashSetF2 = CollectionsKt.f(PrimitiveType.values().length);
            for (PrimitiveType primitiveType2 : PrimitiveType.values()) {
                hashSetF2.add(primitiveType2.o());
            }
            f143359T0 = hashSetF2;
            HashMap mapE = CollectionsKt.e(PrimitiveType.values().length);
            for (PrimitiveType primitiveType3 : PrimitiveType.values()) {
                FqNames fqNames2 = f143368a;
                String strB = primitiveType3.t().b();
                Intrinsics.i(strB, "asString(...)");
                mapE.put(fqNames2.e(strB), primitiveType3);
            }
            f143361U0 = mapE;
            HashMap mapE2 = CollectionsKt.e(PrimitiveType.values().length);
            for (PrimitiveType primitiveType4 : PrimitiveType.values()) {
                FqNames fqNames3 = f143368a;
                String strB2 = primitiveType4.o().b();
                Intrinsics.i(strB2, "asString(...)");
                mapE2.put(fqNames3.e(strB2), primitiveType4);
            }
            f143363V0 = mapE2;
        }

        private final FqName a(String str) {
            FqName fqName = StandardNames.f143285B;
            Name nameO = Name.o(str);
            Intrinsics.i(nameO, "identifier(...)");
            return fqName.b(nameO);
        }

        private final FqName b(String str) {
            FqName fqName = StandardNames.f143286C;
            Name nameO = Name.o(str);
            Intrinsics.i(nameO, "identifier(...)");
            return fqName.b(nameO);
        }

        private final FqName c(String str) {
            FqName fqName = StandardNames.f143291H;
            Name nameO = Name.o(str);
            Intrinsics.i(nameO, "identifier(...)");
            return fqName.b(nameO);
        }

        private final FqName d(String str) {
            FqName fqName = StandardNames.f143284A;
            Name nameO = Name.o(str);
            Intrinsics.i(nameO, "identifier(...)");
            return fqName.b(nameO);
        }

        private final FqName f(String str) {
            FqName fqName = StandardNames.f143289F;
            Name nameO = Name.o(str);
            Intrinsics.i(nameO, "identifier(...)");
            return fqName.b(nameO);
        }

        private final FqNameUnsafe g(String str) {
            FqName fqName = StandardNames.f143287D;
            Name nameO = Name.o(str);
            Intrinsics.i(nameO, "identifier(...)");
            return fqName.b(nameO).i();
        }

        @JvmStatic
        public static final FqNameUnsafe h(String simpleName) {
            Intrinsics.j(simpleName, "simpleName");
            FqName fqName = StandardNames.f143317x;
            Name nameO = Name.o(simpleName);
            Intrinsics.i(nameO, "identifier(...)");
            return fqName.b(nameO).i();
        }

        private FqNames() {
        }

        private final FqNameUnsafe e(String str) {
            return d(str).i();
        }
    }

    static {
        Name nameO = Name.o("field");
        Intrinsics.i(nameO, "identifier(...)");
        f143295b = nameO;
        Name nameO2 = Name.o("value");
        Intrinsics.i(nameO2, "identifier(...)");
        f143296c = nameO2;
        Name nameO3 = Name.o("values");
        Intrinsics.i(nameO3, "identifier(...)");
        f143297d = nameO3;
        Name nameO4 = Name.o("entries");
        Intrinsics.i(nameO4, "identifier(...)");
        f143298e = nameO4;
        Name nameO5 = Name.o("valueOf");
        Intrinsics.i(nameO5, "identifier(...)");
        f143299f = nameO5;
        Name nameO6 = Name.o("copy");
        Intrinsics.i(nameO6, "identifier(...)");
        f143300g = nameO6;
        f143301h = "component";
        Name nameO7 = Name.o("hashCode");
        Intrinsics.i(nameO7, "identifier(...)");
        f143302i = nameO7;
        Name nameO8 = Name.o("toString");
        Intrinsics.i(nameO8, "identifier(...)");
        f143303j = nameO8;
        Name nameO9 = Name.o("equals");
        Intrinsics.i(nameO9, "identifier(...)");
        f143304k = nameO9;
        Name nameO10 = Name.o("code");
        Intrinsics.i(nameO10, "identifier(...)");
        f143305l = nameO10;
        Name nameO11 = Name.o("name");
        Intrinsics.i(nameO11, "identifier(...)");
        f143306m = nameO11;
        Name nameO12 = Name.o("main");
        Intrinsics.i(nameO12, "identifier(...)");
        f143307n = nameO12;
        Name nameO13 = Name.o("nextChar");
        Intrinsics.i(nameO13, "identifier(...)");
        f143308o = nameO13;
        Name nameO14 = Name.o("it");
        Intrinsics.i(nameO14, "identifier(...)");
        f143309p = nameO14;
        Name nameO15 = Name.o("count");
        Intrinsics.i(nameO15, "identifier(...)");
        f143310q = nameO15;
        f143311r = new FqName("<dynamic>");
        FqName fqName = new FqName("kotlin.coroutines");
        f143312s = fqName;
        f143313t = new FqName("kotlin.coroutines.jvm.internal");
        f143314u = new FqName("kotlin.coroutines.intrinsics");
        Name nameO16 = Name.o("Continuation");
        Intrinsics.i(nameO16, "identifier(...)");
        f143315v = fqName.b(nameO16);
        f143316w = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        f143317x = fqName2;
        f143318y = kotlin.collections.CollectionsKt.p("KProperty", "KMutableProperty", "KFunction", "KSuspendFunction");
        Name nameO17 = Name.o("kotlin");
        Intrinsics.i(nameO17, "identifier(...)");
        f143319z = nameO17;
        FqName fqNameA = FqName.f145678c.a(nameO17);
        f143284A = fqNameA;
        Name nameO18 = Name.o("annotation");
        Intrinsics.i(nameO18, "identifier(...)");
        FqName fqNameB = fqNameA.b(nameO18);
        f143285B = fqNameB;
        Name nameO19 = Name.o("collections");
        Intrinsics.i(nameO19, "identifier(...)");
        FqName fqNameB2 = fqNameA.b(nameO19);
        f143286C = fqNameB2;
        Name nameO20 = Name.o("ranges");
        Intrinsics.i(nameO20, "identifier(...)");
        FqName fqNameB3 = fqNameA.b(nameO20);
        f143287D = fqNameB3;
        Name nameO21 = Name.o("text");
        Intrinsics.i(nameO21, "identifier(...)");
        f143288E = fqNameA.b(nameO21);
        Name nameO22 = Name.o("internal");
        Intrinsics.i(nameO22, "identifier(...)");
        FqName fqNameB4 = fqNameA.b(nameO22);
        f143289F = fqNameB4;
        Name nameO23 = Name.o("concurrent");
        Intrinsics.i(nameO23, "identifier(...)");
        FqName fqNameB5 = fqNameA.b(nameO23);
        f143290G = fqNameB5;
        Name nameO24 = Name.o("atomics");
        Intrinsics.i(nameO24, "identifier(...)");
        FqName fqNameB6 = fqNameB5.b(nameO24);
        f143291H = fqNameB6;
        f143292I = new FqName("error.NonExistentClass");
        f143293J = SetsKt.i(fqNameA, fqNameB2, fqNameB3, fqNameB, fqName2, fqNameB4, fqName, fqNameB6);
    }

    @JvmStatic
    public static final ClassId a(int i10) {
        FqName fqName = f143284A;
        Name nameO = Name.o(b(i10));
        Intrinsics.i(nameO, "identifier(...)");
        return new ClassId(fqName, nameO);
    }

    @JvmStatic
    public static final String b(int i10) {
        return "Function" + i10;
    }

    @JvmStatic
    public static final FqName c(PrimitiveType primitiveType) {
        Intrinsics.j(primitiveType, "primitiveType");
        return f143284A.b(primitiveType.t());
    }

    @JvmStatic
    public static final String d(int i10) {
        return FunctionTypeKind.SuspendFunction.f143481f.a() + i10;
    }

    @JvmStatic
    public static final boolean e(FqNameUnsafe arrayFqName) {
        Intrinsics.j(arrayFqName, "arrayFqName");
        return FqNames.f143363V0.get(arrayFqName) != null;
    }

    private StandardNames() {
    }
}
