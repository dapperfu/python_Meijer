package kotlin.reflect.jvm.internal.impl.name;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class StandardClassIds {

    /* renamed from: A, reason: collision with root package name */
    private static final ClassId f146619A;

    /* renamed from: A0, reason: collision with root package name */
    private static final ClassId f146620A0;

    /* renamed from: B, reason: collision with root package name */
    private static final ClassId f146621B;

    /* renamed from: B0, reason: collision with root package name */
    private static final ClassId f146622B0;

    /* renamed from: C, reason: collision with root package name */
    private static final ClassId f146623C;

    /* renamed from: C0, reason: collision with root package name */
    private static final ClassId f146624C0;

    /* renamed from: D, reason: collision with root package name */
    private static final ClassId f146625D;

    /* renamed from: D0, reason: collision with root package name */
    private static final ClassId f146626D0;

    /* renamed from: E, reason: collision with root package name */
    private static final ClassId f146627E;

    /* renamed from: E0, reason: collision with root package name */
    private static final ClassId f146628E0;

    /* renamed from: F, reason: collision with root package name */
    private static final ClassId f146629F;

    /* renamed from: F0, reason: collision with root package name */
    private static final ClassId f146630F0;

    /* renamed from: G, reason: collision with root package name */
    private static final ClassId f146631G;

    /* renamed from: G0, reason: collision with root package name */
    private static final ClassId f146632G0;

    /* renamed from: H, reason: collision with root package name */
    private static final ClassId f146633H;

    /* renamed from: H0, reason: collision with root package name */
    private static final ClassId f146634H0;

    /* renamed from: I, reason: collision with root package name */
    private static final ClassId f146635I;

    /* renamed from: I0, reason: collision with root package name */
    private static final ClassId f146636I0;

    /* renamed from: J, reason: collision with root package name */
    private static final ClassId f146637J;

    /* renamed from: J0, reason: collision with root package name */
    private static final ClassId f146638J0;

    /* renamed from: K, reason: collision with root package name */
    private static final ClassId f146639K;

    /* renamed from: K0, reason: collision with root package name */
    private static final ClassId f146640K0;

    /* renamed from: L, reason: collision with root package name */
    private static final ClassId f146641L;

    /* renamed from: L0, reason: collision with root package name */
    private static final ClassId f146642L0;

    /* renamed from: M, reason: collision with root package name */
    private static final ClassId f146643M;

    /* renamed from: M0, reason: collision with root package name */
    private static final ClassId f146644M0;

    /* renamed from: N, reason: collision with root package name */
    private static final ClassId f146645N;

    /* renamed from: N0, reason: collision with root package name */
    private static final ClassId f146646N0;

    /* renamed from: O, reason: collision with root package name */
    private static final ClassId f146647O;

    /* renamed from: O0, reason: collision with root package name */
    private static final ClassId f146648O0;

    /* renamed from: P, reason: collision with root package name */
    private static final ClassId f146649P;

    /* renamed from: P0, reason: collision with root package name */
    private static final ClassId f146650P0;

    /* renamed from: Q, reason: collision with root package name */
    private static final ClassId f146651Q;

    /* renamed from: Q0, reason: collision with root package name */
    private static final ClassId f146652Q0;

    /* renamed from: R, reason: collision with root package name */
    private static final ClassId f146653R;

    /* renamed from: R0, reason: collision with root package name */
    private static final Set<ClassId> f146654R0;

    /* renamed from: S, reason: collision with root package name */
    private static final ClassId f146655S;

    /* renamed from: T, reason: collision with root package name */
    private static final ClassId f146656T;

    /* renamed from: U, reason: collision with root package name */
    private static final ClassId f146657U;

    /* renamed from: V, reason: collision with root package name */
    private static final ClassId f146658V;

    /* renamed from: W, reason: collision with root package name */
    private static final ClassId f146659W;

    /* renamed from: X, reason: collision with root package name */
    private static final ClassId f146660X;

    /* renamed from: Y, reason: collision with root package name */
    private static final ClassId f146661Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final ClassId f146662Z;

    /* renamed from: a, reason: collision with root package name */
    public static final StandardClassIds f146663a = new StandardClassIds();

    /* renamed from: a0, reason: collision with root package name */
    private static final ClassId f146664a0;

    /* renamed from: b, reason: collision with root package name */
    private static final FqName f146665b;

    /* renamed from: b0, reason: collision with root package name */
    private static final ClassId f146666b0;

    /* renamed from: c, reason: collision with root package name */
    private static final FqName f146667c;

    /* renamed from: c0, reason: collision with root package name */
    private static final ClassId f146668c0;

    /* renamed from: d, reason: collision with root package name */
    private static final FqName f146669d;

    /* renamed from: d0, reason: collision with root package name */
    private static final ClassId f146670d0;

    /* renamed from: e, reason: collision with root package name */
    private static final FqName f146671e;

    /* renamed from: e0, reason: collision with root package name */
    private static final ClassId f146672e0;

    /* renamed from: f, reason: collision with root package name */
    private static final FqName f146673f;

    /* renamed from: f0, reason: collision with root package name */
    private static final ClassId f146674f0;

    /* renamed from: g, reason: collision with root package name */
    private static final FqName f146675g;

    /* renamed from: g0, reason: collision with root package name */
    private static final ClassId f146676g0;

    /* renamed from: h, reason: collision with root package name */
    private static final FqName f146677h;

    /* renamed from: h0, reason: collision with root package name */
    private static final ClassId f146678h0;

    /* renamed from: i, reason: collision with root package name */
    private static final FqName f146679i;

    /* renamed from: i0, reason: collision with root package name */
    private static final Set<ClassId> f146680i0;

    /* renamed from: j, reason: collision with root package name */
    private static final FqName f146681j;

    /* renamed from: j0, reason: collision with root package name */
    private static final Set<ClassId> f146682j0;

    /* renamed from: k, reason: collision with root package name */
    private static final FqName f146683k;

    /* renamed from: k0, reason: collision with root package name */
    private static final Map<ClassId, ClassId> f146684k0;

    /* renamed from: l, reason: collision with root package name */
    private static final FqName f146685l;

    /* renamed from: l0, reason: collision with root package name */
    private static final Map<ClassId, ClassId> f146686l0;

    /* renamed from: m, reason: collision with root package name */
    private static final FqName f146687m;

    /* renamed from: m0, reason: collision with root package name */
    private static final Set<ClassId> f146688m0;

    /* renamed from: n, reason: collision with root package name */
    private static final FqName f146689n;

    /* renamed from: n0, reason: collision with root package name */
    private static final Map<ClassId, ClassId> f146690n0;

    /* renamed from: o, reason: collision with root package name */
    private static final FqName f146691o;

    /* renamed from: o0, reason: collision with root package name */
    private static final Map<ClassId, ClassId> f146692o0;

    /* renamed from: p, reason: collision with root package name */
    private static final FqName f146693p;

    /* renamed from: p0, reason: collision with root package name */
    private static final Set<ClassId> f146694p0;

    /* renamed from: q, reason: collision with root package name */
    private static final FqName f146695q;

    /* renamed from: q0, reason: collision with root package name */
    private static final ClassId f146696q0;

    /* renamed from: r, reason: collision with root package name */
    private static final FqName f146697r;

    /* renamed from: r0, reason: collision with root package name */
    private static final ClassId f146698r0;

    /* renamed from: s, reason: collision with root package name */
    private static final FqName f146699s;

    /* renamed from: s0, reason: collision with root package name */
    private static final ClassId f146700s0;

    /* renamed from: t, reason: collision with root package name */
    private static final FqName f146701t;

    /* renamed from: t0, reason: collision with root package name */
    private static final ClassId f146702t0;

    /* renamed from: u, reason: collision with root package name */
    private static final FqName f146703u;

    /* renamed from: u0, reason: collision with root package name */
    private static final ClassId f146704u0;

    /* renamed from: v, reason: collision with root package name */
    private static final Set<FqName> f146705v;

    /* renamed from: v0, reason: collision with root package name */
    private static final ClassId f146706v0;

    /* renamed from: w, reason: collision with root package name */
    private static final Set<FqName> f146707w;

    /* renamed from: w0, reason: collision with root package name */
    private static final ClassId f146708w0;

    /* renamed from: x, reason: collision with root package name */
    private static final ClassId f146709x;

    /* renamed from: x0, reason: collision with root package name */
    private static final ClassId f146710x0;

    /* renamed from: y, reason: collision with root package name */
    private static final ClassId f146711y;

    /* renamed from: y0, reason: collision with root package name */
    private static final ClassId f146712y0;

    /* renamed from: z, reason: collision with root package name */
    private static final ClassId f146713z;

    /* renamed from: z0, reason: collision with root package name */
    private static final ClassId f146714z0;

    static {
        FqName fqName = new FqName("kotlin");
        f146665b = fqName;
        Name nameO = Name.o("reflect");
        Intrinsics.i(nameO, "identifier(...)");
        FqName fqNameB = fqName.b(nameO);
        f146667c = fqNameB;
        Name nameO2 = Name.o("collections");
        Intrinsics.i(nameO2, "identifier(...)");
        FqName fqNameB2 = fqName.b(nameO2);
        f146669d = fqNameB2;
        Name nameO3 = Name.o("sequences");
        Intrinsics.i(nameO3, "identifier(...)");
        f146671e = fqName.b(nameO3);
        Name nameO4 = Name.o("ranges");
        Intrinsics.i(nameO4, "identifier(...)");
        FqName fqNameB3 = fqName.b(nameO4);
        f146673f = fqNameB3;
        Name nameO5 = Name.o("jvm");
        Intrinsics.i(nameO5, "identifier(...)");
        FqName fqNameB4 = fqName.b(nameO5);
        f146675g = fqNameB4;
        Name nameO6 = Name.o("annotations");
        Intrinsics.i(nameO6, "identifier(...)");
        FqName fqNameB5 = fqName.b(nameO6);
        Name nameO7 = Name.o("jvm");
        Intrinsics.i(nameO7, "identifier(...)");
        f146677h = fqNameB5.b(nameO7);
        Name nameO8 = Name.o("internal");
        Intrinsics.i(nameO8, "identifier(...)");
        f146679i = fqNameB4.b(nameO8);
        Name nameO9 = Name.o("functions");
        Intrinsics.i(nameO9, "identifier(...)");
        f146681j = fqNameB4.b(nameO9);
        Name nameO10 = Name.o("annotation");
        Intrinsics.i(nameO10, "identifier(...)");
        FqName fqNameB6 = fqName.b(nameO10);
        f146683k = fqNameB6;
        Name nameO11 = Name.o("internal");
        Intrinsics.i(nameO11, "identifier(...)");
        FqName fqNameB7 = fqName.b(nameO11);
        f146685l = fqNameB7;
        Name nameO12 = Name.o("ir");
        Intrinsics.i(nameO12, "identifier(...)");
        f146687m = fqNameB7.b(nameO12);
        Name nameO13 = Name.o("coroutines");
        Intrinsics.i(nameO13, "identifier(...)");
        FqName fqNameB8 = fqName.b(nameO13);
        f146689n = fqNameB8;
        Name nameO14 = Name.o("intrinsics");
        Intrinsics.i(nameO14, "identifier(...)");
        f146691o = fqNameB8.b(nameO14);
        Name nameO15 = Name.o("enums");
        Intrinsics.i(nameO15, "identifier(...)");
        f146693p = fqName.b(nameO15);
        Name nameO16 = Name.o("contracts");
        Intrinsics.i(nameO16, "identifier(...)");
        f146695q = fqName.b(nameO16);
        Name nameO17 = Name.o("concurrent");
        Intrinsics.i(nameO17, "identifier(...)");
        FqName fqNameB9 = fqName.b(nameO17);
        f146697r = fqNameB9;
        Name nameO18 = Name.o("atomics");
        Intrinsics.i(nameO18, "identifier(...)");
        FqName fqNameB10 = fqNameB9.b(nameO18);
        f146699s = fqNameB10;
        Name nameO19 = Name.o("test");
        Intrinsics.i(nameO19, "identifier(...)");
        f146701t = fqName.b(nameO19);
        Name nameO20 = Name.o("text");
        Intrinsics.i(nameO20, "identifier(...)");
        f146703u = fqName.b(nameO20);
        f146705v = SetsKt.i(fqName, fqNameB2, fqNameB3, fqNameB6);
        f146707w = SetsKt.i(fqName, fqNameB2, fqNameB3, fqNameB6, fqNameB, fqNameB7, fqNameB8, fqNameB10);
        f146709x = StandardClassIdsKt.l("Nothing");
        f146711y = StandardClassIdsKt.l("Unit");
        f146713z = StandardClassIdsKt.l("Any");
        f146619A = StandardClassIdsKt.l("Enum");
        f146621B = StandardClassIdsKt.l("Annotation");
        f146623C = StandardClassIdsKt.l("Array");
        ClassId classIdL = StandardClassIdsKt.l("Boolean");
        f146625D = classIdL;
        ClassId classIdL2 = StandardClassIdsKt.l("Char");
        f146627E = classIdL2;
        ClassId classIdL3 = StandardClassIdsKt.l("Byte");
        f146629F = classIdL3;
        ClassId classIdL4 = StandardClassIdsKt.l("Short");
        f146631G = classIdL4;
        ClassId classIdL5 = StandardClassIdsKt.l("Int");
        f146633H = classIdL5;
        ClassId classIdL6 = StandardClassIdsKt.l("Long");
        f146635I = classIdL6;
        ClassId classIdL7 = StandardClassIdsKt.l("Float");
        f146637J = classIdL7;
        ClassId classIdL8 = StandardClassIdsKt.l("Double");
        f146639K = classIdL8;
        f146641L = StandardClassIdsKt.t(classIdL3);
        f146643M = StandardClassIdsKt.t(classIdL4);
        f146645N = StandardClassIdsKt.t(classIdL5);
        f146647O = StandardClassIdsKt.t(classIdL6);
        f146649P = StandardClassIdsKt.l("CharSequence");
        f146651Q = StandardClassIdsKt.l("String");
        f146653R = StandardClassIdsKt.l("Throwable");
        f146655S = StandardClassIdsKt.l("Cloneable");
        f146656T = StandardClassIdsKt.s("KProperty");
        f146657U = StandardClassIdsKt.s("KMutableProperty");
        f146658V = StandardClassIdsKt.s("KProperty0");
        f146659W = StandardClassIdsKt.s("KMutableProperty0");
        f146660X = StandardClassIdsKt.s("KProperty1");
        f146661Y = StandardClassIdsKt.s("KMutableProperty1");
        f146662Z = StandardClassIdsKt.s("KProperty2");
        f146664a0 = StandardClassIdsKt.s("KMutableProperty2");
        f146666b0 = StandardClassIdsKt.s("KFunction");
        f146668c0 = StandardClassIdsKt.s("KClass");
        f146670d0 = StandardClassIdsKt.s("KCallable");
        f146672e0 = StandardClassIdsKt.s("KType");
        f146674f0 = StandardClassIdsKt.l("Comparable");
        f146676g0 = StandardClassIdsKt.l("Number");
        f146678h0 = StandardClassIdsKt.l("Function");
        Set<ClassId> setI = SetsKt.i(classIdL, classIdL2, classIdL3, classIdL4, classIdL5, classIdL6, classIdL7, classIdL8);
        f146680i0 = setI;
        f146682j0 = SetsKt.i(classIdL3, classIdL4, classIdL5, classIdL6);
        Set<ClassId> set = setI;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(set, 10)), 16));
        for (Object obj : set) {
            linkedHashMap.put(obj, StandardClassIdsKt.q(((ClassId) obj).h()));
        }
        f146684k0 = linkedHashMap;
        f146686l0 = StandardClassIdsKt.p(linkedHashMap);
        Set<ClassId> setI2 = SetsKt.i(f146641L, f146643M, f146645N, f146647O);
        f146688m0 = setI2;
        Set<ClassId> set2 = setI2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(set2, 10)), 16));
        for (Object obj2 : set2) {
            linkedHashMap2.put(obj2, StandardClassIdsKt.q(((ClassId) obj2).h()));
        }
        f146690n0 = linkedHashMap2;
        f146692o0 = StandardClassIdsKt.p(linkedHashMap2);
        Set<ClassId> set3 = f146680i0;
        Set<ClassId> set4 = f146688m0;
        Set setL = SetsKt.l(set3, set4);
        ClassId classId = f146651Q;
        f146694p0 = SetsKt.m(setL, classId);
        f146696q0 = StandardClassIdsKt.n("Continuation");
        f146698r0 = StandardClassIdsKt.m("Iterator");
        f146700s0 = StandardClassIdsKt.m("Iterable");
        f146702t0 = StandardClassIdsKt.m("Collection");
        f146704u0 = StandardClassIdsKt.m("List");
        f146706v0 = StandardClassIdsKt.m("ListIterator");
        f146708w0 = StandardClassIdsKt.m("Set");
        ClassId classIdM = StandardClassIdsKt.m("Map");
        f146710x0 = classIdM;
        f146712y0 = StandardClassIdsKt.m("AbstractMap");
        f146714z0 = StandardClassIdsKt.m("MutableIterator");
        f146620A0 = StandardClassIdsKt.m("CharIterator");
        f146622B0 = StandardClassIdsKt.m("MutableIterable");
        f146624C0 = StandardClassIdsKt.m("MutableCollection");
        f146626D0 = StandardClassIdsKt.m("MutableList");
        f146628E0 = StandardClassIdsKt.m("MutableListIterator");
        f146630F0 = StandardClassIdsKt.m("MutableSet");
        ClassId classIdM2 = StandardClassIdsKt.m("MutableMap");
        f146632G0 = classIdM2;
        Name nameO21 = Name.o("Entry");
        Intrinsics.i(nameO21, "identifier(...)");
        f146634H0 = classIdM.d(nameO21);
        Name nameO22 = Name.o("MutableEntry");
        Intrinsics.i(nameO22, "identifier(...)");
        f146636I0 = classIdM2.d(nameO22);
        f146638J0 = StandardClassIdsKt.l("Result");
        f146640K0 = StandardClassIdsKt.r("IntRange");
        f146642L0 = StandardClassIdsKt.r("LongRange");
        f146644M0 = StandardClassIdsKt.r("CharRange");
        f146646N0 = StandardClassIdsKt.k("AnnotationRetention");
        f146648O0 = StandardClassIdsKt.k("AnnotationTarget");
        f146650P0 = StandardClassIdsKt.l("DeprecationLevel");
        f146652Q0 = StandardClassIdsKt.o("EnumEntries");
        f146654R0 = SetsKt.m(SetsKt.m(SetsKt.m(SetsKt.m(SetsKt.l(set3, set4), classId), f146711y), f146713z), f146619A);
    }

    public final ClassId a() {
        return f146623C;
    }

    public final FqName b() {
        return f146683k;
    }

    public final FqName c() {
        return f146669d;
    }

    public final FqName d() {
        return f146689n;
    }

    public final FqName e() {
        return f146693p;
    }

    public final FqName f() {
        return f146665b;
    }

    public final FqName g() {
        return f146673f;
    }

    public final FqName h() {
        return f146667c;
    }

    public final ClassId i() {
        return f146652Q0;
    }

    public final ClassId j() {
        return f146668c0;
    }

    public final ClassId k() {
        return f146666b0;
    }

    public final ClassId l() {
        return f146626D0;
    }

    public final ClassId m() {
        return f146632G0;
    }

    public final ClassId n() {
        return f146630F0;
    }

    private StandardClassIds() {
    }
}
