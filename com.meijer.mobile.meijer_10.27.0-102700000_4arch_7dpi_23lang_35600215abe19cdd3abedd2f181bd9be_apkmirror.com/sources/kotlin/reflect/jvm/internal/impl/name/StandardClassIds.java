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
/* loaded from: classes13.dex */
public final class StandardClassIds {

    /* renamed from: A, reason: collision with root package name */
    private static final ClassId f145712A;

    /* renamed from: A0, reason: collision with root package name */
    private static final ClassId f145713A0;

    /* renamed from: B, reason: collision with root package name */
    private static final ClassId f145714B;

    /* renamed from: B0, reason: collision with root package name */
    private static final ClassId f145715B0;

    /* renamed from: C, reason: collision with root package name */
    private static final ClassId f145716C;

    /* renamed from: C0, reason: collision with root package name */
    private static final ClassId f145717C0;

    /* renamed from: D, reason: collision with root package name */
    private static final ClassId f145718D;

    /* renamed from: D0, reason: collision with root package name */
    private static final ClassId f145719D0;

    /* renamed from: E, reason: collision with root package name */
    private static final ClassId f145720E;

    /* renamed from: E0, reason: collision with root package name */
    private static final ClassId f145721E0;

    /* renamed from: F, reason: collision with root package name */
    private static final ClassId f145722F;

    /* renamed from: F0, reason: collision with root package name */
    private static final ClassId f145723F0;

    /* renamed from: G, reason: collision with root package name */
    private static final ClassId f145724G;

    /* renamed from: G0, reason: collision with root package name */
    private static final ClassId f145725G0;

    /* renamed from: H, reason: collision with root package name */
    private static final ClassId f145726H;

    /* renamed from: H0, reason: collision with root package name */
    private static final ClassId f145727H0;

    /* renamed from: I, reason: collision with root package name */
    private static final ClassId f145728I;

    /* renamed from: I0, reason: collision with root package name */
    private static final ClassId f145729I0;

    /* renamed from: J, reason: collision with root package name */
    private static final ClassId f145730J;

    /* renamed from: J0, reason: collision with root package name */
    private static final ClassId f145731J0;

    /* renamed from: K, reason: collision with root package name */
    private static final ClassId f145732K;

    /* renamed from: K0, reason: collision with root package name */
    private static final ClassId f145733K0;

    /* renamed from: L, reason: collision with root package name */
    private static final ClassId f145734L;

    /* renamed from: L0, reason: collision with root package name */
    private static final ClassId f145735L0;

    /* renamed from: M, reason: collision with root package name */
    private static final ClassId f145736M;

    /* renamed from: M0, reason: collision with root package name */
    private static final ClassId f145737M0;

    /* renamed from: N, reason: collision with root package name */
    private static final ClassId f145738N;

    /* renamed from: N0, reason: collision with root package name */
    private static final ClassId f145739N0;

    /* renamed from: O, reason: collision with root package name */
    private static final ClassId f145740O;

    /* renamed from: O0, reason: collision with root package name */
    private static final ClassId f145741O0;

    /* renamed from: P, reason: collision with root package name */
    private static final ClassId f145742P;

    /* renamed from: P0, reason: collision with root package name */
    private static final ClassId f145743P0;

    /* renamed from: Q, reason: collision with root package name */
    private static final ClassId f145744Q;

    /* renamed from: Q0, reason: collision with root package name */
    private static final ClassId f145745Q0;

    /* renamed from: R, reason: collision with root package name */
    private static final ClassId f145746R;

    /* renamed from: R0, reason: collision with root package name */
    private static final Set<ClassId> f145747R0;

    /* renamed from: S, reason: collision with root package name */
    private static final ClassId f145748S;

    /* renamed from: T, reason: collision with root package name */
    private static final ClassId f145749T;

    /* renamed from: U, reason: collision with root package name */
    private static final ClassId f145750U;

    /* renamed from: V, reason: collision with root package name */
    private static final ClassId f145751V;

    /* renamed from: W, reason: collision with root package name */
    private static final ClassId f145752W;

    /* renamed from: X, reason: collision with root package name */
    private static final ClassId f145753X;

    /* renamed from: Y, reason: collision with root package name */
    private static final ClassId f145754Y;

    /* renamed from: Z, reason: collision with root package name */
    private static final ClassId f145755Z;

    /* renamed from: a, reason: collision with root package name */
    public static final StandardClassIds f145756a = new StandardClassIds();

    /* renamed from: a0, reason: collision with root package name */
    private static final ClassId f145757a0;

    /* renamed from: b, reason: collision with root package name */
    private static final FqName f145758b;

    /* renamed from: b0, reason: collision with root package name */
    private static final ClassId f145759b0;

    /* renamed from: c, reason: collision with root package name */
    private static final FqName f145760c;

    /* renamed from: c0, reason: collision with root package name */
    private static final ClassId f145761c0;

    /* renamed from: d, reason: collision with root package name */
    private static final FqName f145762d;

    /* renamed from: d0, reason: collision with root package name */
    private static final ClassId f145763d0;

    /* renamed from: e, reason: collision with root package name */
    private static final FqName f145764e;

    /* renamed from: e0, reason: collision with root package name */
    private static final ClassId f145765e0;

    /* renamed from: f, reason: collision with root package name */
    private static final FqName f145766f;

    /* renamed from: f0, reason: collision with root package name */
    private static final ClassId f145767f0;

    /* renamed from: g, reason: collision with root package name */
    private static final FqName f145768g;

    /* renamed from: g0, reason: collision with root package name */
    private static final ClassId f145769g0;

    /* renamed from: h, reason: collision with root package name */
    private static final FqName f145770h;

    /* renamed from: h0, reason: collision with root package name */
    private static final ClassId f145771h0;

    /* renamed from: i, reason: collision with root package name */
    private static final FqName f145772i;

    /* renamed from: i0, reason: collision with root package name */
    private static final Set<ClassId> f145773i0;

    /* renamed from: j, reason: collision with root package name */
    private static final FqName f145774j;

    /* renamed from: j0, reason: collision with root package name */
    private static final Set<ClassId> f145775j0;

    /* renamed from: k, reason: collision with root package name */
    private static final FqName f145776k;

    /* renamed from: k0, reason: collision with root package name */
    private static final Map<ClassId, ClassId> f145777k0;

    /* renamed from: l, reason: collision with root package name */
    private static final FqName f145778l;

    /* renamed from: l0, reason: collision with root package name */
    private static final Map<ClassId, ClassId> f145779l0;

    /* renamed from: m, reason: collision with root package name */
    private static final FqName f145780m;

    /* renamed from: m0, reason: collision with root package name */
    private static final Set<ClassId> f145781m0;

    /* renamed from: n, reason: collision with root package name */
    private static final FqName f145782n;

    /* renamed from: n0, reason: collision with root package name */
    private static final Map<ClassId, ClassId> f145783n0;

    /* renamed from: o, reason: collision with root package name */
    private static final FqName f145784o;

    /* renamed from: o0, reason: collision with root package name */
    private static final Map<ClassId, ClassId> f145785o0;

    /* renamed from: p, reason: collision with root package name */
    private static final FqName f145786p;

    /* renamed from: p0, reason: collision with root package name */
    private static final Set<ClassId> f145787p0;

    /* renamed from: q, reason: collision with root package name */
    private static final FqName f145788q;

    /* renamed from: q0, reason: collision with root package name */
    private static final ClassId f145789q0;

    /* renamed from: r, reason: collision with root package name */
    private static final FqName f145790r;

    /* renamed from: r0, reason: collision with root package name */
    private static final ClassId f145791r0;

    /* renamed from: s, reason: collision with root package name */
    private static final FqName f145792s;

    /* renamed from: s0, reason: collision with root package name */
    private static final ClassId f145793s0;

    /* renamed from: t, reason: collision with root package name */
    private static final FqName f145794t;

    /* renamed from: t0, reason: collision with root package name */
    private static final ClassId f145795t0;

    /* renamed from: u, reason: collision with root package name */
    private static final FqName f145796u;

    /* renamed from: u0, reason: collision with root package name */
    private static final ClassId f145797u0;

    /* renamed from: v, reason: collision with root package name */
    private static final Set<FqName> f145798v;

    /* renamed from: v0, reason: collision with root package name */
    private static final ClassId f145799v0;

    /* renamed from: w, reason: collision with root package name */
    private static final Set<FqName> f145800w;

    /* renamed from: w0, reason: collision with root package name */
    private static final ClassId f145801w0;

    /* renamed from: x, reason: collision with root package name */
    private static final ClassId f145802x;

    /* renamed from: x0, reason: collision with root package name */
    private static final ClassId f145803x0;

    /* renamed from: y, reason: collision with root package name */
    private static final ClassId f145804y;

    /* renamed from: y0, reason: collision with root package name */
    private static final ClassId f145805y0;

    /* renamed from: z, reason: collision with root package name */
    private static final ClassId f145806z;

    /* renamed from: z0, reason: collision with root package name */
    private static final ClassId f145807z0;

    static {
        FqName fqName = new FqName("kotlin");
        f145758b = fqName;
        Name nameO = Name.o("reflect");
        Intrinsics.i(nameO, "identifier(...)");
        FqName fqNameB = fqName.b(nameO);
        f145760c = fqNameB;
        Name nameO2 = Name.o("collections");
        Intrinsics.i(nameO2, "identifier(...)");
        FqName fqNameB2 = fqName.b(nameO2);
        f145762d = fqNameB2;
        Name nameO3 = Name.o("sequences");
        Intrinsics.i(nameO3, "identifier(...)");
        f145764e = fqName.b(nameO3);
        Name nameO4 = Name.o("ranges");
        Intrinsics.i(nameO4, "identifier(...)");
        FqName fqNameB3 = fqName.b(nameO4);
        f145766f = fqNameB3;
        Name nameO5 = Name.o("jvm");
        Intrinsics.i(nameO5, "identifier(...)");
        FqName fqNameB4 = fqName.b(nameO5);
        f145768g = fqNameB4;
        Name nameO6 = Name.o("annotations");
        Intrinsics.i(nameO6, "identifier(...)");
        FqName fqNameB5 = fqName.b(nameO6);
        Name nameO7 = Name.o("jvm");
        Intrinsics.i(nameO7, "identifier(...)");
        f145770h = fqNameB5.b(nameO7);
        Name nameO8 = Name.o("internal");
        Intrinsics.i(nameO8, "identifier(...)");
        f145772i = fqNameB4.b(nameO8);
        Name nameO9 = Name.o("functions");
        Intrinsics.i(nameO9, "identifier(...)");
        f145774j = fqNameB4.b(nameO9);
        Name nameO10 = Name.o("annotation");
        Intrinsics.i(nameO10, "identifier(...)");
        FqName fqNameB6 = fqName.b(nameO10);
        f145776k = fqNameB6;
        Name nameO11 = Name.o("internal");
        Intrinsics.i(nameO11, "identifier(...)");
        FqName fqNameB7 = fqName.b(nameO11);
        f145778l = fqNameB7;
        Name nameO12 = Name.o("ir");
        Intrinsics.i(nameO12, "identifier(...)");
        f145780m = fqNameB7.b(nameO12);
        Name nameO13 = Name.o("coroutines");
        Intrinsics.i(nameO13, "identifier(...)");
        FqName fqNameB8 = fqName.b(nameO13);
        f145782n = fqNameB8;
        Name nameO14 = Name.o("intrinsics");
        Intrinsics.i(nameO14, "identifier(...)");
        f145784o = fqNameB8.b(nameO14);
        Name nameO15 = Name.o("enums");
        Intrinsics.i(nameO15, "identifier(...)");
        f145786p = fqName.b(nameO15);
        Name nameO16 = Name.o("contracts");
        Intrinsics.i(nameO16, "identifier(...)");
        f145788q = fqName.b(nameO16);
        Name nameO17 = Name.o("concurrent");
        Intrinsics.i(nameO17, "identifier(...)");
        FqName fqNameB9 = fqName.b(nameO17);
        f145790r = fqNameB9;
        Name nameO18 = Name.o("atomics");
        Intrinsics.i(nameO18, "identifier(...)");
        FqName fqNameB10 = fqNameB9.b(nameO18);
        f145792s = fqNameB10;
        Name nameO19 = Name.o("test");
        Intrinsics.i(nameO19, "identifier(...)");
        f145794t = fqName.b(nameO19);
        Name nameO20 = Name.o("text");
        Intrinsics.i(nameO20, "identifier(...)");
        f145796u = fqName.b(nameO20);
        f145798v = SetsKt.i(fqName, fqNameB2, fqNameB3, fqNameB6);
        f145800w = SetsKt.i(fqName, fqNameB2, fqNameB3, fqNameB6, fqNameB, fqNameB7, fqNameB8, fqNameB10);
        f145802x = StandardClassIdsKt.l("Nothing");
        f145804y = StandardClassIdsKt.l("Unit");
        f145806z = StandardClassIdsKt.l("Any");
        f145712A = StandardClassIdsKt.l("Enum");
        f145714B = StandardClassIdsKt.l("Annotation");
        f145716C = StandardClassIdsKt.l("Array");
        ClassId classIdL = StandardClassIdsKt.l("Boolean");
        f145718D = classIdL;
        ClassId classIdL2 = StandardClassIdsKt.l("Char");
        f145720E = classIdL2;
        ClassId classIdL3 = StandardClassIdsKt.l("Byte");
        f145722F = classIdL3;
        ClassId classIdL4 = StandardClassIdsKt.l("Short");
        f145724G = classIdL4;
        ClassId classIdL5 = StandardClassIdsKt.l("Int");
        f145726H = classIdL5;
        ClassId classIdL6 = StandardClassIdsKt.l("Long");
        f145728I = classIdL6;
        ClassId classIdL7 = StandardClassIdsKt.l("Float");
        f145730J = classIdL7;
        ClassId classIdL8 = StandardClassIdsKt.l("Double");
        f145732K = classIdL8;
        f145734L = StandardClassIdsKt.t(classIdL3);
        f145736M = StandardClassIdsKt.t(classIdL4);
        f145738N = StandardClassIdsKt.t(classIdL5);
        f145740O = StandardClassIdsKt.t(classIdL6);
        f145742P = StandardClassIdsKt.l("CharSequence");
        f145744Q = StandardClassIdsKt.l("String");
        f145746R = StandardClassIdsKt.l("Throwable");
        f145748S = StandardClassIdsKt.l("Cloneable");
        f145749T = StandardClassIdsKt.s("KProperty");
        f145750U = StandardClassIdsKt.s("KMutableProperty");
        f145751V = StandardClassIdsKt.s("KProperty0");
        f145752W = StandardClassIdsKt.s("KMutableProperty0");
        f145753X = StandardClassIdsKt.s("KProperty1");
        f145754Y = StandardClassIdsKt.s("KMutableProperty1");
        f145755Z = StandardClassIdsKt.s("KProperty2");
        f145757a0 = StandardClassIdsKt.s("KMutableProperty2");
        f145759b0 = StandardClassIdsKt.s("KFunction");
        f145761c0 = StandardClassIdsKt.s("KClass");
        f145763d0 = StandardClassIdsKt.s("KCallable");
        f145765e0 = StandardClassIdsKt.s("KType");
        f145767f0 = StandardClassIdsKt.l("Comparable");
        f145769g0 = StandardClassIdsKt.l("Number");
        f145771h0 = StandardClassIdsKt.l("Function");
        Set<ClassId> setI = SetsKt.i(classIdL, classIdL2, classIdL3, classIdL4, classIdL5, classIdL6, classIdL7, classIdL8);
        f145773i0 = setI;
        f145775j0 = SetsKt.i(classIdL3, classIdL4, classIdL5, classIdL6);
        Set<ClassId> set = setI;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(set, 10)), 16));
        for (Object obj : set) {
            linkedHashMap.put(obj, StandardClassIdsKt.q(((ClassId) obj).h()));
        }
        f145777k0 = linkedHashMap;
        f145779l0 = StandardClassIdsKt.p(linkedHashMap);
        Set<ClassId> setI2 = SetsKt.i(f145734L, f145736M, f145738N, f145740O);
        f145781m0 = setI2;
        Set<ClassId> set2 = setI2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(set2, 10)), 16));
        for (Object obj2 : set2) {
            linkedHashMap2.put(obj2, StandardClassIdsKt.q(((ClassId) obj2).h()));
        }
        f145783n0 = linkedHashMap2;
        f145785o0 = StandardClassIdsKt.p(linkedHashMap2);
        Set<ClassId> set3 = f145773i0;
        Set<ClassId> set4 = f145781m0;
        Set setL = SetsKt.l(set3, set4);
        ClassId classId = f145744Q;
        f145787p0 = SetsKt.m(setL, classId);
        f145789q0 = StandardClassIdsKt.n("Continuation");
        f145791r0 = StandardClassIdsKt.m("Iterator");
        f145793s0 = StandardClassIdsKt.m("Iterable");
        f145795t0 = StandardClassIdsKt.m("Collection");
        f145797u0 = StandardClassIdsKt.m("List");
        f145799v0 = StandardClassIdsKt.m("ListIterator");
        f145801w0 = StandardClassIdsKt.m("Set");
        ClassId classIdM = StandardClassIdsKt.m("Map");
        f145803x0 = classIdM;
        f145805y0 = StandardClassIdsKt.m("AbstractMap");
        f145807z0 = StandardClassIdsKt.m("MutableIterator");
        f145713A0 = StandardClassIdsKt.m("CharIterator");
        f145715B0 = StandardClassIdsKt.m("MutableIterable");
        f145717C0 = StandardClassIdsKt.m("MutableCollection");
        f145719D0 = StandardClassIdsKt.m("MutableList");
        f145721E0 = StandardClassIdsKt.m("MutableListIterator");
        f145723F0 = StandardClassIdsKt.m("MutableSet");
        ClassId classIdM2 = StandardClassIdsKt.m("MutableMap");
        f145725G0 = classIdM2;
        Name nameO21 = Name.o("Entry");
        Intrinsics.i(nameO21, "identifier(...)");
        f145727H0 = classIdM.d(nameO21);
        Name nameO22 = Name.o("MutableEntry");
        Intrinsics.i(nameO22, "identifier(...)");
        f145729I0 = classIdM2.d(nameO22);
        f145731J0 = StandardClassIdsKt.l("Result");
        f145733K0 = StandardClassIdsKt.r("IntRange");
        f145735L0 = StandardClassIdsKt.r("LongRange");
        f145737M0 = StandardClassIdsKt.r("CharRange");
        f145739N0 = StandardClassIdsKt.k("AnnotationRetention");
        f145741O0 = StandardClassIdsKt.k("AnnotationTarget");
        f145743P0 = StandardClassIdsKt.l("DeprecationLevel");
        f145745Q0 = StandardClassIdsKt.o("EnumEntries");
        f145747R0 = SetsKt.m(SetsKt.m(SetsKt.m(SetsKt.m(SetsKt.l(set3, set4), classId), f145804y), f145806z), f145712A);
    }

    public final ClassId a() {
        return f145716C;
    }

    public final FqName b() {
        return f145776k;
    }

    public final FqName c() {
        return f145762d;
    }

    public final FqName d() {
        return f145782n;
    }

    public final FqName e() {
        return f145786p;
    }

    public final FqName f() {
        return f145758b;
    }

    public final FqName g() {
        return f145766f;
    }

    public final FqName h() {
        return f145760c;
    }

    public final ClassId i() {
        return f145745Q0;
    }

    public final ClassId j() {
        return f145761c0;
    }

    public final ClassId k() {
        return f145759b0;
    }

    public final ClassId l() {
        return f145719D0;
    }

    public final ClassId m() {
        return f145725G0;
    }

    public final ClassId n() {
        return f145723F0;
    }

    private StandardClassIds() {
    }
}
