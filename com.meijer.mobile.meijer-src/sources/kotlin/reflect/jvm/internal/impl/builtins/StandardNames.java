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

/* loaded from: classes14.dex */
public final class StandardNames {

    /* renamed from: A, reason: collision with root package name */
    @JvmField
    public static final FqName f144191A;

    /* renamed from: B, reason: collision with root package name */
    @JvmField
    public static final FqName f144192B;

    /* renamed from: C, reason: collision with root package name */
    @JvmField
    public static final FqName f144193C;

    /* renamed from: D, reason: collision with root package name */
    @JvmField
    public static final FqName f144194D;

    /* renamed from: E, reason: collision with root package name */
    @JvmField
    public static final FqName f144195E;

    /* renamed from: F, reason: collision with root package name */
    @JvmField
    public static final FqName f144196F;

    /* renamed from: G, reason: collision with root package name */
    @JvmField
    public static final FqName f144197G;

    /* renamed from: H, reason: collision with root package name */
    @JvmField
    public static final FqName f144198H;

    /* renamed from: I, reason: collision with root package name */
    private static final FqName f144199I;

    /* renamed from: J, reason: collision with root package name */
    @JvmField
    public static final Set<FqName> f144200J;

    /* renamed from: a, reason: collision with root package name */
    public static final StandardNames f144201a = new StandardNames();

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final Name f144202b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final Name f144203c;

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final Name f144204d;

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public static final Name f144205e;

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public static final Name f144206f;

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public static final Name f144207g;

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public static final String f144208h;

    /* renamed from: i, reason: collision with root package name */
    @JvmField
    public static final Name f144209i;

    /* renamed from: j, reason: collision with root package name */
    @JvmField
    public static final Name f144210j;

    /* renamed from: k, reason: collision with root package name */
    @JvmField
    public static final Name f144211k;

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static final Name f144212l;

    /* renamed from: m, reason: collision with root package name */
    @JvmField
    public static final Name f144213m;

    /* renamed from: n, reason: collision with root package name */
    @JvmField
    public static final Name f144214n;

    /* renamed from: o, reason: collision with root package name */
    @JvmField
    public static final Name f144215o;

    /* renamed from: p, reason: collision with root package name */
    @JvmField
    public static final Name f144216p;

    /* renamed from: q, reason: collision with root package name */
    @JvmField
    public static final Name f144217q;

    /* renamed from: r, reason: collision with root package name */
    @JvmField
    public static final FqName f144218r;

    /* renamed from: s, reason: collision with root package name */
    @JvmField
    public static final FqName f144219s;

    /* renamed from: t, reason: collision with root package name */
    @JvmField
    public static final FqName f144220t;

    /* renamed from: u, reason: collision with root package name */
    @JvmField
    public static final FqName f144221u;

    /* renamed from: v, reason: collision with root package name */
    @JvmField
    public static final FqName f144222v;

    /* renamed from: w, reason: collision with root package name */
    @JvmField
    public static final FqName f144223w;

    /* renamed from: x, reason: collision with root package name */
    @JvmField
    public static final FqName f144224x;

    /* renamed from: y, reason: collision with root package name */
    @JvmField
    public static final List<String> f144225y;

    /* renamed from: z, reason: collision with root package name */
    @JvmField
    public static final Name f144226z;

    @SourceDebugExtension
    public static final class FqNames {

        /* renamed from: A, reason: collision with root package name */
        @JvmField
        public static final FqName f144227A;

        /* renamed from: A0, reason: collision with root package name */
        @JvmField
        public static final FqName f144228A0;

        /* renamed from: B, reason: collision with root package name */
        @JvmField
        public static final FqName f144229B;

        /* renamed from: B0, reason: collision with root package name */
        @JvmField
        public static final FqName f144230B0;

        /* renamed from: C, reason: collision with root package name */
        @JvmField
        public static final FqName f144231C;

        /* renamed from: C0, reason: collision with root package name */
        @JvmField
        public static final FqName f144232C0;

        /* renamed from: D, reason: collision with root package name */
        @JvmField
        public static final FqName f144233D;

        /* renamed from: D0, reason: collision with root package name */
        @JvmField
        public static final ClassId f144234D0;

        /* renamed from: E, reason: collision with root package name */
        @JvmField
        public static final FqName f144235E;

        /* renamed from: E0, reason: collision with root package name */
        @JvmField
        public static final ClassId f144236E0;

        /* renamed from: F, reason: collision with root package name */
        @JvmField
        public static final ClassId f144237F;

        /* renamed from: F0, reason: collision with root package name */
        @JvmField
        public static final ClassId f144238F0;

        /* renamed from: G, reason: collision with root package name */
        @JvmField
        public static final FqName f144239G;

        /* renamed from: G0, reason: collision with root package name */
        @JvmField
        public static final ClassId f144240G0;

        /* renamed from: H, reason: collision with root package name */
        @JvmField
        public static final FqName f144241H;

        /* renamed from: H0, reason: collision with root package name */
        @JvmField
        public static final FqName f144242H0;

        /* renamed from: I, reason: collision with root package name */
        @JvmField
        public static final ClassId f144243I;

        /* renamed from: I0, reason: collision with root package name */
        @JvmField
        public static final FqName f144244I0;

        /* renamed from: J, reason: collision with root package name */
        @JvmField
        public static final FqName f144245J;

        /* renamed from: J0, reason: collision with root package name */
        @JvmField
        public static final FqName f144246J0;

        /* renamed from: K, reason: collision with root package name */
        @JvmField
        public static final FqName f144247K;

        /* renamed from: K0, reason: collision with root package name */
        @JvmField
        public static final FqName f144248K0;

        /* renamed from: L, reason: collision with root package name */
        @JvmField
        public static final FqName f144249L;

        /* renamed from: L0, reason: collision with root package name */
        @JvmField
        public static final FqName f144250L0;

        /* renamed from: M, reason: collision with root package name */
        @JvmField
        public static final ClassId f144251M;

        /* renamed from: M0, reason: collision with root package name */
        @JvmField
        public static final FqName f144252M0;

        /* renamed from: N, reason: collision with root package name */
        @JvmField
        public static final FqName f144253N;

        /* renamed from: N0, reason: collision with root package name */
        @JvmField
        public static final FqName f144254N0;

        /* renamed from: O, reason: collision with root package name */
        @JvmField
        public static final ClassId f144255O;

        /* renamed from: O0, reason: collision with root package name */
        @JvmField
        public static final FqName f144256O0;

        /* renamed from: P, reason: collision with root package name */
        @JvmField
        public static final FqName f144257P;

        /* renamed from: P0, reason: collision with root package name */
        @JvmField
        public static final FqName f144258P0;

        /* renamed from: Q, reason: collision with root package name */
        @JvmField
        public static final FqName f144259Q;

        /* renamed from: Q0, reason: collision with root package name */
        @JvmField
        public static final FqName f144260Q0;

        /* renamed from: R, reason: collision with root package name */
        @JvmField
        public static final FqName f144261R;

        /* renamed from: R0, reason: collision with root package name */
        @JvmField
        public static final FqName f144262R0;

        /* renamed from: S, reason: collision with root package name */
        @JvmField
        public static final FqName f144263S;

        /* renamed from: S0, reason: collision with root package name */
        @JvmField
        public static final Set<Name> f144264S0;

        /* renamed from: T, reason: collision with root package name */
        @JvmField
        public static final FqName f144265T;

        /* renamed from: T0, reason: collision with root package name */
        @JvmField
        public static final Set<Name> f144266T0;

        /* renamed from: U, reason: collision with root package name */
        @JvmField
        public static final ClassId f144267U;

        /* renamed from: U0, reason: collision with root package name */
        @JvmField
        public static final Map<FqNameUnsafe, PrimitiveType> f144268U0;

        /* renamed from: V, reason: collision with root package name */
        @JvmField
        public static final FqName f144269V;

        /* renamed from: V0, reason: collision with root package name */
        @JvmField
        public static final Map<FqNameUnsafe, PrimitiveType> f144270V0;

        /* renamed from: W, reason: collision with root package name */
        @JvmField
        public static final FqName f144271W;

        /* renamed from: X, reason: collision with root package name */
        @JvmField
        public static final FqName f144272X;

        /* renamed from: Y, reason: collision with root package name */
        @JvmField
        public static final FqName f144273Y;

        /* renamed from: Z, reason: collision with root package name */
        @JvmField
        public static final FqName f144274Z;

        /* renamed from: a, reason: collision with root package name */
        public static final FqNames f144275a;

        /* renamed from: a0, reason: collision with root package name */
        @JvmField
        public static final FqName f144276a0;

        /* renamed from: b, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144277b;

        /* renamed from: b0, reason: collision with root package name */
        @JvmField
        public static final FqName f144278b0;

        /* renamed from: c, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144279c;

        /* renamed from: c0, reason: collision with root package name */
        @JvmField
        public static final FqName f144280c0;

        /* renamed from: d, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144281d;

        /* renamed from: d0, reason: collision with root package name */
        @JvmField
        public static final FqName f144282d0;

        /* renamed from: e, reason: collision with root package name */
        @JvmField
        public static final FqName f144283e;

        /* renamed from: e0, reason: collision with root package name */
        @JvmField
        public static final FqName f144284e0;

        /* renamed from: f, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144285f;

        /* renamed from: f0, reason: collision with root package name */
        @JvmField
        public static final FqName f144286f0;

        /* renamed from: g, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144287g;

        /* renamed from: g0, reason: collision with root package name */
        @JvmField
        public static final FqName f144288g0;

        /* renamed from: h, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144289h;

        /* renamed from: h0, reason: collision with root package name */
        @JvmField
        public static final FqName f144290h0;

        /* renamed from: i, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144291i;

        /* renamed from: i0, reason: collision with root package name */
        @JvmField
        public static final FqName f144292i0;

        /* renamed from: j, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144293j;

        /* renamed from: j0, reason: collision with root package name */
        @JvmField
        public static final FqName f144294j0;

        /* renamed from: k, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144295k;

        /* renamed from: k0, reason: collision with root package name */
        @JvmField
        public static final FqName f144296k0;

        /* renamed from: l, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144297l;

        /* renamed from: l0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144298l0;

        /* renamed from: m, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144299m;

        /* renamed from: m0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144300m0;

        /* renamed from: n, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144301n;

        /* renamed from: n0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144302n0;

        /* renamed from: o, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144303o;

        /* renamed from: o0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144304o0;

        /* renamed from: p, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144305p;

        /* renamed from: p0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144306p0;

        /* renamed from: q, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144307q;

        /* renamed from: q0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144308q0;

        /* renamed from: r, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144309r;

        /* renamed from: r0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144310r0;

        /* renamed from: s, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144311s;

        /* renamed from: s0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144312s0;

        /* renamed from: t, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144313t;

        /* renamed from: t0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144314t0;

        /* renamed from: u, reason: collision with root package name */
        @JvmField
        public static final FqName f144315u;

        /* renamed from: u0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144316u0;

        /* renamed from: v, reason: collision with root package name */
        @JvmField
        public static final FqName f144317v;

        /* renamed from: v0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144318v0;

        /* renamed from: w, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144319w;

        /* renamed from: w0, reason: collision with root package name */
        @JvmField
        public static final ClassId f144320w0;

        /* renamed from: x, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144321x;

        /* renamed from: x0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144322x0;

        /* renamed from: y, reason: collision with root package name */
        @JvmField
        public static final FqName f144323y;

        /* renamed from: y0, reason: collision with root package name */
        @JvmField
        public static final FqNameUnsafe f144324y0;

        /* renamed from: z, reason: collision with root package name */
        @JvmField
        public static final FqName f144325z;

        /* renamed from: z0, reason: collision with root package name */
        @JvmField
        public static final FqName f144326z0;

        static {
            FqNames fqNames = new FqNames();
            f144275a = fqNames;
            f144277b = fqNames.e("Any");
            f144279c = fqNames.e("Nothing");
            f144281d = fqNames.e("Cloneable");
            f144283e = fqNames.d("Suppress");
            f144285f = fqNames.e("Unit");
            f144287g = fqNames.e("CharSequence");
            f144289h = fqNames.e("String");
            f144291i = fqNames.e("Array");
            f144293j = fqNames.e("Boolean");
            f144295k = fqNames.e("Char");
            f144297l = fqNames.e("Byte");
            f144299m = fqNames.e("Short");
            f144301n = fqNames.e("Int");
            f144303o = fqNames.e("Long");
            f144305p = fqNames.e("Float");
            f144307q = fqNames.e("Double");
            f144309r = fqNames.e("Number");
            f144311s = fqNames.e("Enum");
            f144313t = fqNames.e("Function");
            f144315u = fqNames.d("Throwable");
            f144317v = fqNames.d("Comparable");
            f144319w = fqNames.g("IntRange");
            f144321x = fqNames.g("LongRange");
            f144323y = fqNames.d("Deprecated");
            f144325z = fqNames.d("DeprecatedSinceKotlin");
            f144227A = fqNames.d("DeprecationLevel");
            f144229B = fqNames.d("ReplaceWith");
            f144231C = fqNames.d("ExtensionFunctionType");
            f144233D = fqNames.d("ContextFunctionTypeParams");
            FqName fqNameD = fqNames.d("ParameterName");
            f144235E = fqNameD;
            ClassId.Companion companion = ClassId.f146581d;
            f144237F = companion.c(fqNameD);
            f144239G = fqNames.d("Annotation");
            FqName fqNameA = fqNames.a("Target");
            f144241H = fqNameA;
            f144243I = companion.c(fqNameA);
            f144245J = fqNames.a("AnnotationTarget");
            f144247K = fqNames.a("AnnotationRetention");
            FqName fqNameA2 = fqNames.a("Retention");
            f144249L = fqNameA2;
            f144251M = companion.c(fqNameA2);
            FqName fqNameA3 = fqNames.a("Repeatable");
            f144253N = fqNameA3;
            f144255O = companion.c(fqNameA3);
            f144257P = fqNames.a("MustBeDocumented");
            f144259Q = fqNames.d("UnsafeVariance");
            f144261R = fqNames.d("PublishedApi");
            f144263S = fqNames.f("AccessibleLateinitPropertyLiteral");
            FqName fqName = new FqName("kotlin.internal.PlatformDependent");
            f144265T = fqName;
            f144267U = companion.c(fqName);
            f144269V = fqNames.b("Iterator");
            f144271W = fqNames.b("Iterable");
            f144272X = fqNames.b("Collection");
            f144273Y = fqNames.b("List");
            f144274Z = fqNames.b("ListIterator");
            f144276a0 = fqNames.b("Set");
            FqName fqNameB = fqNames.b("Map");
            f144278b0 = fqNameB;
            Name nameO = Name.o("Entry");
            Intrinsics.i(nameO, "identifier(...)");
            f144280c0 = fqNameB.b(nameO);
            f144282d0 = fqNames.b("MutableIterator");
            f144284e0 = fqNames.b("MutableIterable");
            f144286f0 = fqNames.b("MutableCollection");
            f144288g0 = fqNames.b("MutableList");
            f144290h0 = fqNames.b("MutableListIterator");
            f144292i0 = fqNames.b("MutableSet");
            FqName fqNameB2 = fqNames.b("MutableMap");
            f144294j0 = fqNameB2;
            Name nameO2 = Name.o("MutableEntry");
            Intrinsics.i(nameO2, "identifier(...)");
            f144296k0 = fqNameB2.b(nameO2);
            f144298l0 = h("KClass");
            f144300m0 = h("KType");
            f144302n0 = h("KCallable");
            f144304o0 = h("KProperty0");
            f144306p0 = h("KProperty1");
            f144308q0 = h("KProperty2");
            f144310r0 = h("KMutableProperty0");
            f144312s0 = h("KMutableProperty1");
            f144314t0 = h("KMutableProperty2");
            FqNameUnsafe fqNameUnsafeH = h("KProperty");
            f144316u0 = fqNameUnsafeH;
            f144318v0 = h("KMutableProperty");
            f144320w0 = companion.c(fqNameUnsafeH.m());
            f144322x0 = h("KDeclarationContainer");
            f144324y0 = h("findAssociatedObject");
            FqName fqNameD2 = fqNames.d("UByte");
            f144326z0 = fqNameD2;
            FqName fqNameD3 = fqNames.d("UShort");
            f144228A0 = fqNameD3;
            FqName fqNameD4 = fqNames.d("UInt");
            f144230B0 = fqNameD4;
            FqName fqNameD5 = fqNames.d("ULong");
            f144232C0 = fqNameD5;
            f144234D0 = companion.c(fqNameD2);
            f144236E0 = companion.c(fqNameD3);
            f144238F0 = companion.c(fqNameD4);
            f144240G0 = companion.c(fqNameD5);
            f144242H0 = fqNames.d("UByteArray");
            f144244I0 = fqNames.d("UShortArray");
            f144246J0 = fqNames.d("UIntArray");
            f144248K0 = fqNames.d("ULongArray");
            f144250L0 = fqNames.c("AtomicInt");
            f144252M0 = fqNames.c("AtomicLong");
            f144254N0 = fqNames.c("AtomicBoolean");
            f144256O0 = fqNames.c("AtomicReference");
            f144258P0 = fqNames.c("AtomicIntArray");
            f144260Q0 = fqNames.c("AtomicLongArray");
            f144262R0 = fqNames.c("AtomicArray");
            HashSet hashSetF = CollectionsKt.f(PrimitiveType.values().length);
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                hashSetF.add(primitiveType.t());
            }
            f144264S0 = hashSetF;
            HashSet hashSetF2 = CollectionsKt.f(PrimitiveType.values().length);
            for (PrimitiveType primitiveType2 : PrimitiveType.values()) {
                hashSetF2.add(primitiveType2.o());
            }
            f144266T0 = hashSetF2;
            HashMap mapE = CollectionsKt.e(PrimitiveType.values().length);
            for (PrimitiveType primitiveType3 : PrimitiveType.values()) {
                FqNames fqNames2 = f144275a;
                String strB = primitiveType3.t().b();
                Intrinsics.i(strB, "asString(...)");
                mapE.put(fqNames2.e(strB), primitiveType3);
            }
            f144268U0 = mapE;
            HashMap mapE2 = CollectionsKt.e(PrimitiveType.values().length);
            for (PrimitiveType primitiveType4 : PrimitiveType.values()) {
                FqNames fqNames3 = f144275a;
                String strB2 = primitiveType4.o().b();
                Intrinsics.i(strB2, "asString(...)");
                mapE2.put(fqNames3.e(strB2), primitiveType4);
            }
            f144270V0 = mapE2;
        }

        private final FqName a(String str) {
            FqName fqName = StandardNames.f144192B;
            Name nameO = Name.o(str);
            Intrinsics.i(nameO, "identifier(...)");
            return fqName.b(nameO);
        }

        private final FqName b(String str) {
            FqName fqName = StandardNames.f144193C;
            Name nameO = Name.o(str);
            Intrinsics.i(nameO, "identifier(...)");
            return fqName.b(nameO);
        }

        private final FqName c(String str) {
            FqName fqName = StandardNames.f144198H;
            Name nameO = Name.o(str);
            Intrinsics.i(nameO, "identifier(...)");
            return fqName.b(nameO);
        }

        private final FqName d(String str) {
            FqName fqName = StandardNames.f144191A;
            Name nameO = Name.o(str);
            Intrinsics.i(nameO, "identifier(...)");
            return fqName.b(nameO);
        }

        private final FqName f(String str) {
            FqName fqName = StandardNames.f144196F;
            Name nameO = Name.o(str);
            Intrinsics.i(nameO, "identifier(...)");
            return fqName.b(nameO);
        }

        private final FqNameUnsafe g(String str) {
            FqName fqName = StandardNames.f144194D;
            Name nameO = Name.o(str);
            Intrinsics.i(nameO, "identifier(...)");
            return fqName.b(nameO).i();
        }

        @JvmStatic
        public static final FqNameUnsafe h(String simpleName) {
            Intrinsics.j(simpleName, "simpleName");
            FqName fqName = StandardNames.f144224x;
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
        f144202b = nameO;
        Name nameO2 = Name.o("value");
        Intrinsics.i(nameO2, "identifier(...)");
        f144203c = nameO2;
        Name nameO3 = Name.o("values");
        Intrinsics.i(nameO3, "identifier(...)");
        f144204d = nameO3;
        Name nameO4 = Name.o("entries");
        Intrinsics.i(nameO4, "identifier(...)");
        f144205e = nameO4;
        Name nameO5 = Name.o("valueOf");
        Intrinsics.i(nameO5, "identifier(...)");
        f144206f = nameO5;
        Name nameO6 = Name.o("copy");
        Intrinsics.i(nameO6, "identifier(...)");
        f144207g = nameO6;
        f144208h = "component";
        Name nameO7 = Name.o("hashCode");
        Intrinsics.i(nameO7, "identifier(...)");
        f144209i = nameO7;
        Name nameO8 = Name.o("toString");
        Intrinsics.i(nameO8, "identifier(...)");
        f144210j = nameO8;
        Name nameO9 = Name.o("equals");
        Intrinsics.i(nameO9, "identifier(...)");
        f144211k = nameO9;
        Name nameO10 = Name.o("code");
        Intrinsics.i(nameO10, "identifier(...)");
        f144212l = nameO10;
        Name nameO11 = Name.o("name");
        Intrinsics.i(nameO11, "identifier(...)");
        f144213m = nameO11;
        Name nameO12 = Name.o("main");
        Intrinsics.i(nameO12, "identifier(...)");
        f144214n = nameO12;
        Name nameO13 = Name.o("nextChar");
        Intrinsics.i(nameO13, "identifier(...)");
        f144215o = nameO13;
        Name nameO14 = Name.o("it");
        Intrinsics.i(nameO14, "identifier(...)");
        f144216p = nameO14;
        Name nameO15 = Name.o("count");
        Intrinsics.i(nameO15, "identifier(...)");
        f144217q = nameO15;
        f144218r = new FqName("<dynamic>");
        FqName fqName = new FqName("kotlin.coroutines");
        f144219s = fqName;
        f144220t = new FqName("kotlin.coroutines.jvm.internal");
        f144221u = new FqName("kotlin.coroutines.intrinsics");
        Name nameO16 = Name.o("Continuation");
        Intrinsics.i(nameO16, "identifier(...)");
        f144222v = fqName.b(nameO16);
        f144223w = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        f144224x = fqName2;
        f144225y = kotlin.collections.CollectionsKt.p("KProperty", "KMutableProperty", "KFunction", "KSuspendFunction");
        Name nameO17 = Name.o("kotlin");
        Intrinsics.i(nameO17, "identifier(...)");
        f144226z = nameO17;
        FqName fqNameA = FqName.f146585c.a(nameO17);
        f144191A = fqNameA;
        Name nameO18 = Name.o("annotation");
        Intrinsics.i(nameO18, "identifier(...)");
        FqName fqNameB = fqNameA.b(nameO18);
        f144192B = fqNameB;
        Name nameO19 = Name.o("collections");
        Intrinsics.i(nameO19, "identifier(...)");
        FqName fqNameB2 = fqNameA.b(nameO19);
        f144193C = fqNameB2;
        Name nameO20 = Name.o("ranges");
        Intrinsics.i(nameO20, "identifier(...)");
        FqName fqNameB3 = fqNameA.b(nameO20);
        f144194D = fqNameB3;
        Name nameO21 = Name.o("text");
        Intrinsics.i(nameO21, "identifier(...)");
        f144195E = fqNameA.b(nameO21);
        Name nameO22 = Name.o("internal");
        Intrinsics.i(nameO22, "identifier(...)");
        FqName fqNameB4 = fqNameA.b(nameO22);
        f144196F = fqNameB4;
        Name nameO23 = Name.o("concurrent");
        Intrinsics.i(nameO23, "identifier(...)");
        FqName fqNameB5 = fqNameA.b(nameO23);
        f144197G = fqNameB5;
        Name nameO24 = Name.o("atomics");
        Intrinsics.i(nameO24, "identifier(...)");
        FqName fqNameB6 = fqNameB5.b(nameO24);
        f144198H = fqNameB6;
        f144199I = new FqName("error.NonExistentClass");
        f144200J = SetsKt.i(fqNameA, fqNameB2, fqNameB3, fqNameB, fqName2, fqNameB4, fqName, fqNameB6);
    }

    @JvmStatic
    public static final ClassId a(int i10) {
        FqName fqName = f144191A;
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
        return f144191A.b(primitiveType.t());
    }

    @JvmStatic
    public static final String d(int i10) {
        return FunctionTypeKind.SuspendFunction.f144388f.a() + i10;
    }

    @JvmStatic
    public static final boolean e(FqNameUnsafe arrayFqName) {
        Intrinsics.j(arrayFqName, "arrayFqName");
        return FqNames.f144270V0.get(arrayFqName) != null;
    }

    private StandardNames() {
    }
}
