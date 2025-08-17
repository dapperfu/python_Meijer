package kotlin.reflect.jvm.internal.impl.util;

import com.medallia.digital.mobilesdk.q2;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;

/* loaded from: classes13.dex */
public final class OperatorNameConventions {

    /* renamed from: A, reason: collision with root package name */
    @JvmField
    public static final Name f147078A;

    /* renamed from: B, reason: collision with root package name */
    @JvmField
    public static final Name f147079B;

    /* renamed from: C, reason: collision with root package name */
    @JvmField
    public static final Name f147080C;

    /* renamed from: D, reason: collision with root package name */
    @JvmField
    public static final Name f147081D;

    /* renamed from: E, reason: collision with root package name */
    @JvmField
    public static final Name f147082E;

    /* renamed from: F, reason: collision with root package name */
    @JvmField
    public static final Name f147083F;

    /* renamed from: G, reason: collision with root package name */
    @JvmField
    public static final Name f147084G;

    /* renamed from: H, reason: collision with root package name */
    @JvmField
    public static final Name f147085H;

    /* renamed from: I, reason: collision with root package name */
    @JvmField
    public static final Name f147086I;

    /* renamed from: J, reason: collision with root package name */
    @JvmField
    public static final Name f147087J;

    /* renamed from: K, reason: collision with root package name */
    @JvmField
    public static final Name f147088K;

    /* renamed from: L, reason: collision with root package name */
    @JvmField
    public static final Name f147089L;

    /* renamed from: M, reason: collision with root package name */
    @JvmField
    public static final Name f147090M;

    /* renamed from: N, reason: collision with root package name */
    @JvmField
    public static final Name f147091N;

    /* renamed from: O, reason: collision with root package name */
    @JvmField
    public static final Name f147092O;

    /* renamed from: P, reason: collision with root package name */
    @JvmField
    public static final Name f147093P;

    /* renamed from: Q, reason: collision with root package name */
    @JvmField
    public static final Name f147094Q;

    /* renamed from: R, reason: collision with root package name */
    @JvmField
    public static final Name f147095R;

    /* renamed from: S, reason: collision with root package name */
    @JvmField
    public static final Name f147096S;

    /* renamed from: T, reason: collision with root package name */
    @JvmField
    public static final Name f147097T;

    /* renamed from: U, reason: collision with root package name */
    @JvmField
    public static final Name f147098U;

    /* renamed from: V, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f147099V;

    /* renamed from: W, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f147100W;

    /* renamed from: X, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f147101X;

    /* renamed from: Y, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f147102Y;

    /* renamed from: Z, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f147103Z;

    /* renamed from: a, reason: collision with root package name */
    public static final OperatorNameConventions f147104a = new OperatorNameConventions();

    /* renamed from: a0, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f147105a0;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final Name f147106b;

    /* renamed from: b0, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f147107b0;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final Name f147108c;

    /* renamed from: c0, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f147109c0;

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final Name f147110d;

    /* renamed from: d0, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f147111d0;

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public static final Name f147112e;

    /* renamed from: e0, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f147113e0;

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public static final Name f147114f;

    /* renamed from: f0, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f147115f0;

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public static final Name f147116g;

    /* renamed from: g0, reason: collision with root package name */
    private static final Map<Name, String> f147117g0;

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public static final Name f147118h;

    /* renamed from: i, reason: collision with root package name */
    @JvmField
    public static final Name f147119i;

    /* renamed from: j, reason: collision with root package name */
    @JvmField
    public static final Name f147120j;

    /* renamed from: k, reason: collision with root package name */
    @JvmField
    public static final Name f147121k;

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static final Name f147122l;

    /* renamed from: m, reason: collision with root package name */
    @JvmField
    public static final Name f147123m;

    /* renamed from: n, reason: collision with root package name */
    @JvmField
    public static final Name f147124n;

    /* renamed from: o, reason: collision with root package name */
    @JvmField
    public static final Name f147125o;

    /* renamed from: p, reason: collision with root package name */
    @JvmField
    public static final Regex f147126p;

    /* renamed from: q, reason: collision with root package name */
    @JvmField
    public static final Name f147127q;

    /* renamed from: r, reason: collision with root package name */
    @JvmField
    public static final Name f147128r;

    /* renamed from: s, reason: collision with root package name */
    @JvmField
    public static final Name f147129s;

    /* renamed from: t, reason: collision with root package name */
    @JvmField
    public static final Name f147130t;

    /* renamed from: u, reason: collision with root package name */
    @JvmField
    public static final Name f147131u;

    /* renamed from: v, reason: collision with root package name */
    @JvmField
    public static final Name f147132v;

    /* renamed from: w, reason: collision with root package name */
    @JvmField
    public static final Name f147133w;

    /* renamed from: x, reason: collision with root package name */
    @JvmField
    public static final Name f147134x;

    /* renamed from: y, reason: collision with root package name */
    @JvmField
    public static final Name f147135y;

    /* renamed from: z, reason: collision with root package name */
    @JvmField
    public static final Name f147136z;

    static {
        Name nameO = Name.o("getValue");
        Intrinsics.i(nameO, "identifier(...)");
        f147106b = nameO;
        Name nameO2 = Name.o("setValue");
        Intrinsics.i(nameO2, "identifier(...)");
        f147108c = nameO2;
        Name nameO3 = Name.o("provideDelegate");
        Intrinsics.i(nameO3, "identifier(...)");
        f147110d = nameO3;
        Name nameO4 = Name.o("equals");
        Intrinsics.i(nameO4, "identifier(...)");
        f147112e = nameO4;
        Name nameO5 = Name.o("hashCode");
        Intrinsics.i(nameO5, "identifier(...)");
        f147114f = nameO5;
        Name nameO6 = Name.o("compareTo");
        Intrinsics.i(nameO6, "identifier(...)");
        f147116g = nameO6;
        Name nameO7 = Name.o("contains");
        Intrinsics.i(nameO7, "identifier(...)");
        f147118h = nameO7;
        Name nameO8 = Name.o("invoke");
        Intrinsics.i(nameO8, "identifier(...)");
        f147119i = nameO8;
        Name nameO9 = Name.o("iterator");
        Intrinsics.i(nameO9, "identifier(...)");
        f147120j = nameO9;
        Name nameO10 = Name.o("get");
        Intrinsics.i(nameO10, "identifier(...)");
        f147121k = nameO10;
        Name nameO11 = Name.o("set");
        Intrinsics.i(nameO11, "identifier(...)");
        f147122l = nameO11;
        Name nameO12 = Name.o("next");
        Intrinsics.i(nameO12, "identifier(...)");
        f147123m = nameO12;
        Name nameO13 = Name.o("hasNext");
        Intrinsics.i(nameO13, "identifier(...)");
        f147124n = nameO13;
        Name nameO14 = Name.o("toString");
        Intrinsics.i(nameO14, "identifier(...)");
        f147125o = nameO14;
        f147126p = new Regex("component\\d+");
        Name nameO15 = Name.o("and");
        Intrinsics.i(nameO15, "identifier(...)");
        f147127q = nameO15;
        Name nameO16 = Name.o("or");
        Intrinsics.i(nameO16, "identifier(...)");
        f147128r = nameO16;
        Name nameO17 = Name.o("xor");
        Intrinsics.i(nameO17, "identifier(...)");
        f147129s = nameO17;
        Name nameO18 = Name.o("inv");
        Intrinsics.i(nameO18, "identifier(...)");
        f147130t = nameO18;
        Name nameO19 = Name.o("shl");
        Intrinsics.i(nameO19, "identifier(...)");
        f147131u = nameO19;
        Name nameO20 = Name.o("shr");
        Intrinsics.i(nameO20, "identifier(...)");
        f147132v = nameO20;
        Name nameO21 = Name.o("ushr");
        Intrinsics.i(nameO21, "identifier(...)");
        f147133w = nameO21;
        Name nameO22 = Name.o("inc");
        Intrinsics.i(nameO22, "identifier(...)");
        f147134x = nameO22;
        Name nameO23 = Name.o("dec");
        Intrinsics.i(nameO23, "identifier(...)");
        f147135y = nameO23;
        Name nameO24 = Name.o("plus");
        Intrinsics.i(nameO24, "identifier(...)");
        f147136z = nameO24;
        Name nameO25 = Name.o("minus");
        Intrinsics.i(nameO25, "identifier(...)");
        f147078A = nameO25;
        Name nameO26 = Name.o("not");
        Intrinsics.i(nameO26, "identifier(...)");
        f147079B = nameO26;
        Name nameO27 = Name.o("unaryMinus");
        Intrinsics.i(nameO27, "identifier(...)");
        f147080C = nameO27;
        Name nameO28 = Name.o("unaryPlus");
        Intrinsics.i(nameO28, "identifier(...)");
        f147081D = nameO28;
        Name nameO29 = Name.o("times");
        Intrinsics.i(nameO29, "identifier(...)");
        f147082E = nameO29;
        Name nameO30 = Name.o("div");
        Intrinsics.i(nameO30, "identifier(...)");
        f147083F = nameO30;
        Name nameO31 = Name.o("rem");
        Intrinsics.i(nameO31, "identifier(...)");
        f147084G = nameO31;
        Name nameO32 = Name.o("rangeTo");
        Intrinsics.i(nameO32, "identifier(...)");
        f147085H = nameO32;
        Name nameO33 = Name.o("rangeUntil");
        Intrinsics.i(nameO33, "identifier(...)");
        f147086I = nameO33;
        Name nameO34 = Name.o("timesAssign");
        Intrinsics.i(nameO34, "identifier(...)");
        f147087J = nameO34;
        Name nameO35 = Name.o("divAssign");
        Intrinsics.i(nameO35, "identifier(...)");
        f147088K = nameO35;
        Name nameO36 = Name.o("remAssign");
        Intrinsics.i(nameO36, "identifier(...)");
        f147089L = nameO36;
        Name nameO37 = Name.o("plusAssign");
        Intrinsics.i(nameO37, "identifier(...)");
        f147090M = nameO37;
        Name nameO38 = Name.o("minusAssign");
        Intrinsics.i(nameO38, "identifier(...)");
        f147091N = nameO38;
        Name nameO39 = Name.o("toDouble");
        Intrinsics.i(nameO39, "identifier(...)");
        f147092O = nameO39;
        Name nameO40 = Name.o("toFloat");
        Intrinsics.i(nameO40, "identifier(...)");
        f147093P = nameO40;
        Name nameO41 = Name.o("toLong");
        Intrinsics.i(nameO41, "identifier(...)");
        f147094Q = nameO41;
        Name nameO42 = Name.o("toInt");
        Intrinsics.i(nameO42, "identifier(...)");
        f147095R = nameO42;
        Name nameO43 = Name.o("toChar");
        Intrinsics.i(nameO43, "identifier(...)");
        f147096S = nameO43;
        Name nameO44 = Name.o("toShort");
        Intrinsics.i(nameO44, "identifier(...)");
        f147097T = nameO44;
        Name nameO45 = Name.o("toByte");
        Intrinsics.i(nameO45, "identifier(...)");
        f147098U = nameO45;
        f147099V = SetsKt.i(nameO22, nameO23, nameO28, nameO27, nameO26, nameO18);
        f147100W = SetsKt.i(nameO28, nameO27, nameO26, nameO18);
        Set<Name> setI = SetsKt.i(nameO29, nameO24, nameO25, nameO30, nameO31, nameO32, nameO33);
        f147101X = setI;
        f147102Y = SetsKt.i(nameO29, nameO24, nameO25, nameO30, nameO31);
        Set<Name> setI2 = SetsKt.i(nameO15, nameO16, nameO17, nameO18, nameO19, nameO20, nameO21);
        f147103Z = setI2;
        f147105a0 = SetsKt.i(nameO15, nameO16, nameO17, nameO19, nameO20, nameO21);
        f147107b0 = SetsKt.l(SetsKt.l(setI, setI2), SetsKt.i(nameO4, nameO7, nameO6));
        Set<Name> setI3 = SetsKt.i(nameO34, nameO35, nameO36, nameO37, nameO38);
        f147109c0 = setI3;
        f147111d0 = SetsKt.i(nameO, nameO2, nameO3);
        f147113e0 = SetsKt.l(SetsKt.d(nameO11), setI3);
        f147115f0 = SetsKt.i(nameO39, nameO40, nameO41, nameO42, nameO44, nameO45, nameO43);
        f147117g0 = MapsKt.o(TuplesKt.a(nameO22, "++"), TuplesKt.a(nameO23, "--"), TuplesKt.a(nameO28, "+"), TuplesKt.a(nameO27, "-"), TuplesKt.a(nameO26, "!"), TuplesKt.a(nameO29, "*"), TuplesKt.a(nameO24, "+"), TuplesKt.a(nameO25, "-"), TuplesKt.a(nameO30, q2.f92724c), TuplesKt.a(nameO31, "%"), TuplesKt.a(nameO32, ".."), TuplesKt.a(nameO33, "..<"));
    }

    private OperatorNameConventions() {
    }
}
