package com.google.android.gms.internal.pal;

import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes6.dex */
public final class D {

    /* renamed from: A, reason: collision with root package name */
    public static final lf f83354A;

    /* renamed from: B, reason: collision with root package name */
    public static final lf f83355B;

    /* renamed from: C, reason: collision with root package name */
    public static final mf f83356C;

    /* renamed from: D, reason: collision with root package name */
    public static final lf f83357D;

    /* renamed from: E, reason: collision with root package name */
    public static final mf f83358E;

    /* renamed from: F, reason: collision with root package name */
    public static final lf f83359F;

    /* renamed from: G, reason: collision with root package name */
    public static final mf f83360G;

    /* renamed from: H, reason: collision with root package name */
    public static final lf f83361H;

    /* renamed from: I, reason: collision with root package name */
    public static final mf f83362I;

    /* renamed from: J, reason: collision with root package name */
    public static final lf f83363J;

    /* renamed from: K, reason: collision with root package name */
    public static final mf f83364K;

    /* renamed from: L, reason: collision with root package name */
    public static final lf f83365L;

    /* renamed from: M, reason: collision with root package name */
    public static final mf f83366M;

    /* renamed from: N, reason: collision with root package name */
    public static final lf f83367N;

    /* renamed from: O, reason: collision with root package name */
    public static final mf f83368O;

    /* renamed from: P, reason: collision with root package name */
    public static final lf f83369P;

    /* renamed from: Q, reason: collision with root package name */
    public static final mf f83370Q;

    /* renamed from: R, reason: collision with root package name */
    public static final lf f83371R;

    /* renamed from: S, reason: collision with root package name */
    public static final mf f83372S;

    /* renamed from: T, reason: collision with root package name */
    public static final lf f83373T;

    /* renamed from: U, reason: collision with root package name */
    public static final mf f83374U;

    /* renamed from: V, reason: collision with root package name */
    public static final lf f83375V;

    /* renamed from: W, reason: collision with root package name */
    public static final mf f83376W;

    /* renamed from: X, reason: collision with root package name */
    public static final mf f83377X;

    /* renamed from: a, reason: collision with root package name */
    public static final lf f83378a;

    /* renamed from: b, reason: collision with root package name */
    public static final mf f83379b;

    /* renamed from: c, reason: collision with root package name */
    public static final lf f83380c;

    /* renamed from: d, reason: collision with root package name */
    public static final mf f83381d;

    /* renamed from: e, reason: collision with root package name */
    public static final lf f83382e;

    /* renamed from: f, reason: collision with root package name */
    public static final lf f83383f;

    /* renamed from: g, reason: collision with root package name */
    public static final mf f83384g;

    /* renamed from: h, reason: collision with root package name */
    public static final lf f83385h;

    /* renamed from: i, reason: collision with root package name */
    public static final mf f83386i;

    /* renamed from: j, reason: collision with root package name */
    public static final lf f83387j;

    /* renamed from: k, reason: collision with root package name */
    public static final mf f83388k;

    /* renamed from: l, reason: collision with root package name */
    public static final lf f83389l;

    /* renamed from: m, reason: collision with root package name */
    public static final mf f83390m;

    /* renamed from: n, reason: collision with root package name */
    public static final lf f83391n;

    /* renamed from: o, reason: collision with root package name */
    public static final mf f83392o;

    /* renamed from: p, reason: collision with root package name */
    public static final lf f83393p;

    /* renamed from: q, reason: collision with root package name */
    public static final mf f83394q;

    /* renamed from: r, reason: collision with root package name */
    public static final lf f83395r;

    /* renamed from: s, reason: collision with root package name */
    public static final mf f83396s;

    /* renamed from: t, reason: collision with root package name */
    public static final lf f83397t;

    /* renamed from: u, reason: collision with root package name */
    public static final lf f83398u;

    /* renamed from: v, reason: collision with root package name */
    public static final lf f83399v;

    /* renamed from: w, reason: collision with root package name */
    public static final lf f83400w;

    /* renamed from: x, reason: collision with root package name */
    public static final mf f83401x;

    /* renamed from: y, reason: collision with root package name */
    public static final lf f83402y;

    /* renamed from: z, reason: collision with root package name */
    public static final lf f83403z;

    static {
        lf lfVarC = new C10797f().c();
        f83378a = lfVarC;
        f83379b = new r(Class.class, lfVarC);
        lf lfVarC2 = new C10973q().c();
        f83380c = lfVarC2;
        f83381d = new r(BitSet.class, lfVarC2);
        C11052v c11052v = new C11052v();
        f83382e = c11052v;
        f83383f = new C11068w();
        f83384g = new C11004s(Boolean.TYPE, Boolean.class, c11052v);
        C11084x c11084x = new C11084x();
        f83385h = c11084x;
        f83386i = new C11004s(Byte.TYPE, Byte.class, c11084x);
        C11100y c11100y = new C11100y();
        f83387j = c11100y;
        f83388k = new C11004s(Short.TYPE, Short.class, c11100y);
        C11116z c11116z = new C11116z();
        f83389l = c11116z;
        f83390m = new C11004s(Integer.TYPE, Integer.class, c11116z);
        lf lfVarC3 = new A().c();
        f83391n = lfVarC3;
        f83392o = new r(AtomicInteger.class, lfVarC3);
        lf lfVarC4 = new B().c();
        f83393p = lfVarC4;
        f83394q = new r(AtomicBoolean.class, lfVarC4);
        lf lfVarC5 = new yf().c();
        f83395r = lfVarC5;
        f83396s = new r(AtomicIntegerArray.class, lfVarC5);
        f83397t = new zf();
        f83398u = new Af();
        f83399v = new Bf();
        Cf cf2 = new Cf();
        f83400w = cf2;
        f83401x = new C11004s(Character.TYPE, Character.class, cf2);
        Df df2 = new Df();
        f83402y = df2;
        f83403z = new Ef();
        f83354A = new C10746c();
        f83355B = new C10763d();
        f83356C = new r(String.class, df2);
        C10780e c10780e = new C10780e();
        f83357D = c10780e;
        f83358E = new r(StringBuilder.class, c10780e);
        C10813g c10813g = new C10813g();
        f83359F = c10813g;
        f83360G = new r(StringBuffer.class, c10813g);
        C10829h c10829h = new C10829h();
        f83361H = c10829h;
        f83362I = new r(URL.class, c10829h);
        C10845i c10845i = new C10845i();
        f83363J = c10845i;
        f83364K = new r(URI.class, c10845i);
        C10861j c10861j = new C10861j();
        f83365L = c10861j;
        f83366M = new C11036u(InetAddress.class, c10861j);
        C10877k c10877k = new C10877k();
        f83367N = c10877k;
        f83368O = new r(UUID.class, c10877k);
        lf lfVarC6 = new C10893l().c();
        f83369P = lfVarC6;
        f83370Q = new r(Currency.class, lfVarC6);
        C10909m c10909m = new C10909m();
        f83371R = c10909m;
        f83372S = new C11020t(Calendar.class, GregorianCalendar.class, c10909m);
        C10925n c10925n = new C10925n();
        f83373T = c10925n;
        f83374U = new r(Locale.class, c10925n);
        C10941o c10941o = new C10941o();
        f83375V = c10941o;
        f83376W = new C11036u(C10796ef.class, c10941o);
        f83377X = new C10957p();
    }
}
