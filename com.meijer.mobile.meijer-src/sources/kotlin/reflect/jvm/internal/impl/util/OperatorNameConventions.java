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

/* loaded from: classes14.dex */
public final class OperatorNameConventions {

    /* renamed from: A, reason: collision with root package name */
    @JvmField
    public static final Name f147985A;

    /* renamed from: B, reason: collision with root package name */
    @JvmField
    public static final Name f147986B;

    /* renamed from: C, reason: collision with root package name */
    @JvmField
    public static final Name f147987C;

    /* renamed from: D, reason: collision with root package name */
    @JvmField
    public static final Name f147988D;

    /* renamed from: E, reason: collision with root package name */
    @JvmField
    public static final Name f147989E;

    /* renamed from: F, reason: collision with root package name */
    @JvmField
    public static final Name f147990F;

    /* renamed from: G, reason: collision with root package name */
    @JvmField
    public static final Name f147991G;

    /* renamed from: H, reason: collision with root package name */
    @JvmField
    public static final Name f147992H;

    /* renamed from: I, reason: collision with root package name */
    @JvmField
    public static final Name f147993I;

    /* renamed from: J, reason: collision with root package name */
    @JvmField
    public static final Name f147994J;

    /* renamed from: K, reason: collision with root package name */
    @JvmField
    public static final Name f147995K;

    /* renamed from: L, reason: collision with root package name */
    @JvmField
    public static final Name f147996L;

    /* renamed from: M, reason: collision with root package name */
    @JvmField
    public static final Name f147997M;

    /* renamed from: N, reason: collision with root package name */
    @JvmField
    public static final Name f147998N;

    /* renamed from: O, reason: collision with root package name */
    @JvmField
    public static final Name f147999O;

    /* renamed from: P, reason: collision with root package name */
    @JvmField
    public static final Name f148000P;

    /* renamed from: Q, reason: collision with root package name */
    @JvmField
    public static final Name f148001Q;

    /* renamed from: R, reason: collision with root package name */
    @JvmField
    public static final Name f148002R;

    /* renamed from: S, reason: collision with root package name */
    @JvmField
    public static final Name f148003S;

    /* renamed from: T, reason: collision with root package name */
    @JvmField
    public static final Name f148004T;

    /* renamed from: U, reason: collision with root package name */
    @JvmField
    public static final Name f148005U;

    /* renamed from: V, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f148006V;

    /* renamed from: W, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f148007W;

    /* renamed from: X, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f148008X;

    /* renamed from: Y, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f148009Y;

    /* renamed from: Z, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f148010Z;

    /* renamed from: a, reason: collision with root package name */
    public static final OperatorNameConventions f148011a = new OperatorNameConventions();

    /* renamed from: a0, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f148012a0;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final Name f148013b;

    /* renamed from: b0, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f148014b0;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final Name f148015c;

    /* renamed from: c0, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f148016c0;

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final Name f148017d;

    /* renamed from: d0, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f148018d0;

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public static final Name f148019e;

    /* renamed from: e0, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f148020e0;

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public static final Name f148021f;

    /* renamed from: f0, reason: collision with root package name */
    @JvmField
    public static final Set<Name> f148022f0;

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public static final Name f148023g;

    /* renamed from: g0, reason: collision with root package name */
    private static final Map<Name, String> f148024g0;

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public static final Name f148025h;

    /* renamed from: i, reason: collision with root package name */
    @JvmField
    public static final Name f148026i;

    /* renamed from: j, reason: collision with root package name */
    @JvmField
    public static final Name f148027j;

    /* renamed from: k, reason: collision with root package name */
    @JvmField
    public static final Name f148028k;

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static final Name f148029l;

    /* renamed from: m, reason: collision with root package name */
    @JvmField
    public static final Name f148030m;

    /* renamed from: n, reason: collision with root package name */
    @JvmField
    public static final Name f148031n;

    /* renamed from: o, reason: collision with root package name */
    @JvmField
    public static final Name f148032o;

    /* renamed from: p, reason: collision with root package name */
    @JvmField
    public static final Regex f148033p;

    /* renamed from: q, reason: collision with root package name */
    @JvmField
    public static final Name f148034q;

    /* renamed from: r, reason: collision with root package name */
    @JvmField
    public static final Name f148035r;

    /* renamed from: s, reason: collision with root package name */
    @JvmField
    public static final Name f148036s;

    /* renamed from: t, reason: collision with root package name */
    @JvmField
    public static final Name f148037t;

    /* renamed from: u, reason: collision with root package name */
    @JvmField
    public static final Name f148038u;

    /* renamed from: v, reason: collision with root package name */
    @JvmField
    public static final Name f148039v;

    /* renamed from: w, reason: collision with root package name */
    @JvmField
    public static final Name f148040w;

    /* renamed from: x, reason: collision with root package name */
    @JvmField
    public static final Name f148041x;

    /* renamed from: y, reason: collision with root package name */
    @JvmField
    public static final Name f148042y;

    /* renamed from: z, reason: collision with root package name */
    @JvmField
    public static final Name f148043z;

    static {
        Name nameO = Name.o("getValue");
        Intrinsics.i(nameO, "identifier(...)");
        f148013b = nameO;
        Name nameO2 = Name.o("setValue");
        Intrinsics.i(nameO2, "identifier(...)");
        f148015c = nameO2;
        Name nameO3 = Name.o("provideDelegate");
        Intrinsics.i(nameO3, "identifier(...)");
        f148017d = nameO3;
        Name nameO4 = Name.o("equals");
        Intrinsics.i(nameO4, "identifier(...)");
        f148019e = nameO4;
        Name nameO5 = Name.o("hashCode");
        Intrinsics.i(nameO5, "identifier(...)");
        f148021f = nameO5;
        Name nameO6 = Name.o("compareTo");
        Intrinsics.i(nameO6, "identifier(...)");
        f148023g = nameO6;
        Name nameO7 = Name.o("contains");
        Intrinsics.i(nameO7, "identifier(...)");
        f148025h = nameO7;
        Name nameO8 = Name.o("invoke");
        Intrinsics.i(nameO8, "identifier(...)");
        f148026i = nameO8;
        Name nameO9 = Name.o("iterator");
        Intrinsics.i(nameO9, "identifier(...)");
        f148027j = nameO9;
        Name nameO10 = Name.o("get");
        Intrinsics.i(nameO10, "identifier(...)");
        f148028k = nameO10;
        Name nameO11 = Name.o("set");
        Intrinsics.i(nameO11, "identifier(...)");
        f148029l = nameO11;
        Name nameO12 = Name.o("next");
        Intrinsics.i(nameO12, "identifier(...)");
        f148030m = nameO12;
        Name nameO13 = Name.o("hasNext");
        Intrinsics.i(nameO13, "identifier(...)");
        f148031n = nameO13;
        Name nameO14 = Name.o("toString");
        Intrinsics.i(nameO14, "identifier(...)");
        f148032o = nameO14;
        f148033p = new Regex("component\\d+");
        Name nameO15 = Name.o("and");
        Intrinsics.i(nameO15, "identifier(...)");
        f148034q = nameO15;
        Name nameO16 = Name.o("or");
        Intrinsics.i(nameO16, "identifier(...)");
        f148035r = nameO16;
        Name nameO17 = Name.o("xor");
        Intrinsics.i(nameO17, "identifier(...)");
        f148036s = nameO17;
        Name nameO18 = Name.o("inv");
        Intrinsics.i(nameO18, "identifier(...)");
        f148037t = nameO18;
        Name nameO19 = Name.o("shl");
        Intrinsics.i(nameO19, "identifier(...)");
        f148038u = nameO19;
        Name nameO20 = Name.o("shr");
        Intrinsics.i(nameO20, "identifier(...)");
        f148039v = nameO20;
        Name nameO21 = Name.o("ushr");
        Intrinsics.i(nameO21, "identifier(...)");
        f148040w = nameO21;
        Name nameO22 = Name.o("inc");
        Intrinsics.i(nameO22, "identifier(...)");
        f148041x = nameO22;
        Name nameO23 = Name.o("dec");
        Intrinsics.i(nameO23, "identifier(...)");
        f148042y = nameO23;
        Name nameO24 = Name.o("plus");
        Intrinsics.i(nameO24, "identifier(...)");
        f148043z = nameO24;
        Name nameO25 = Name.o("minus");
        Intrinsics.i(nameO25, "identifier(...)");
        f147985A = nameO25;
        Name nameO26 = Name.o("not");
        Intrinsics.i(nameO26, "identifier(...)");
        f147986B = nameO26;
        Name nameO27 = Name.o("unaryMinus");
        Intrinsics.i(nameO27, "identifier(...)");
        f147987C = nameO27;
        Name nameO28 = Name.o("unaryPlus");
        Intrinsics.i(nameO28, "identifier(...)");
        f147988D = nameO28;
        Name nameO29 = Name.o("times");
        Intrinsics.i(nameO29, "identifier(...)");
        f147989E = nameO29;
        Name nameO30 = Name.o("div");
        Intrinsics.i(nameO30, "identifier(...)");
        f147990F = nameO30;
        Name nameO31 = Name.o("rem");
        Intrinsics.i(nameO31, "identifier(...)");
        f147991G = nameO31;
        Name nameO32 = Name.o("rangeTo");
        Intrinsics.i(nameO32, "identifier(...)");
        f147992H = nameO32;
        Name nameO33 = Name.o("rangeUntil");
        Intrinsics.i(nameO33, "identifier(...)");
        f147993I = nameO33;
        Name nameO34 = Name.o("timesAssign");
        Intrinsics.i(nameO34, "identifier(...)");
        f147994J = nameO34;
        Name nameO35 = Name.o("divAssign");
        Intrinsics.i(nameO35, "identifier(...)");
        f147995K = nameO35;
        Name nameO36 = Name.o("remAssign");
        Intrinsics.i(nameO36, "identifier(...)");
        f147996L = nameO36;
        Name nameO37 = Name.o("plusAssign");
        Intrinsics.i(nameO37, "identifier(...)");
        f147997M = nameO37;
        Name nameO38 = Name.o("minusAssign");
        Intrinsics.i(nameO38, "identifier(...)");
        f147998N = nameO38;
        Name nameO39 = Name.o("toDouble");
        Intrinsics.i(nameO39, "identifier(...)");
        f147999O = nameO39;
        Name nameO40 = Name.o("toFloat");
        Intrinsics.i(nameO40, "identifier(...)");
        f148000P = nameO40;
        Name nameO41 = Name.o("toLong");
        Intrinsics.i(nameO41, "identifier(...)");
        f148001Q = nameO41;
        Name nameO42 = Name.o("toInt");
        Intrinsics.i(nameO42, "identifier(...)");
        f148002R = nameO42;
        Name nameO43 = Name.o("toChar");
        Intrinsics.i(nameO43, "identifier(...)");
        f148003S = nameO43;
        Name nameO44 = Name.o("toShort");
        Intrinsics.i(nameO44, "identifier(...)");
        f148004T = nameO44;
        Name nameO45 = Name.o("toByte");
        Intrinsics.i(nameO45, "identifier(...)");
        f148005U = nameO45;
        f148006V = SetsKt.i(nameO22, nameO23, nameO28, nameO27, nameO26, nameO18);
        f148007W = SetsKt.i(nameO28, nameO27, nameO26, nameO18);
        Set<Name> setI = SetsKt.i(nameO29, nameO24, nameO25, nameO30, nameO31, nameO32, nameO33);
        f148008X = setI;
        f148009Y = SetsKt.i(nameO29, nameO24, nameO25, nameO30, nameO31);
        Set<Name> setI2 = SetsKt.i(nameO15, nameO16, nameO17, nameO18, nameO19, nameO20, nameO21);
        f148010Z = setI2;
        f148012a0 = SetsKt.i(nameO15, nameO16, nameO17, nameO19, nameO20, nameO21);
        f148014b0 = SetsKt.l(SetsKt.l(setI, setI2), SetsKt.i(nameO4, nameO7, nameO6));
        Set<Name> setI3 = SetsKt.i(nameO34, nameO35, nameO36, nameO37, nameO38);
        f148016c0 = setI3;
        f148018d0 = SetsKt.i(nameO, nameO2, nameO3);
        f148020e0 = SetsKt.l(SetsKt.d(nameO11), setI3);
        f148022f0 = SetsKt.i(nameO39, nameO40, nameO41, nameO42, nameO44, nameO45, nameO43);
        f148024g0 = MapsKt.o(TuplesKt.a(nameO22, "++"), TuplesKt.a(nameO23, "--"), TuplesKt.a(nameO28, "+"), TuplesKt.a(nameO27, "-"), TuplesKt.a(nameO26, "!"), TuplesKt.a(nameO29, "*"), TuplesKt.a(nameO24, "+"), TuplesKt.a(nameO25, "-"), TuplesKt.a(nameO30, q2.f93563c), TuplesKt.a(nameO31, "%"), TuplesKt.a(nameO32, ".."), TuplesKt.a(nameO33, "..<"));
    }

    private OperatorNameConventions() {
    }
}
