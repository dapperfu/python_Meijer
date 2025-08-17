package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8380j implements InterfaceC7078Pr {

    /* renamed from: o, reason: collision with root package name */
    private static final Executor f75300o = new Executor() { // from class: com.google.android.gms.internal.ads.OH0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Context f75301a;

    /* renamed from: b, reason: collision with root package name */
    private final C7741d f75302b;

    /* renamed from: c, reason: collision with root package name */
    private final C8808n f75303c;

    /* renamed from: d, reason: collision with root package name */
    private final C9342s f75304d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC9629uj f75305e;

    /* renamed from: f, reason: collision with root package name */
    private final List f75306f;

    /* renamed from: g, reason: collision with root package name */
    private final J f75307g;

    /* renamed from: h, reason: collision with root package name */
    private final HC f75308h;

    /* renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArraySet f75309i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC8487k f75310j;

    /* renamed from: k, reason: collision with root package name */
    private QH f75311k;

    /* renamed from: l, reason: collision with root package name */
    private Pair f75312l;

    /* renamed from: m, reason: collision with root package name */
    private int f75313m;

    /* renamed from: n, reason: collision with root package name */
    private int f75314n;

    public final J h() {
        return this.f75302b;
    }

    final /* synthetic */ void q() {
        this.f75313m--;
    }

    static /* bridge */ /* synthetic */ InterfaceC9111pr c(C8380j c8380j, C c10) throws zzabg {
        C8086gC.f(c8380j.f75314n == 0);
        Vz0 vz0V = v(c10.f65640C);
        if (vz0V.f70962c == 7 && OV.f69091a < 34) {
            Uy0 uy0C = vz0V.c();
            uy0C.d(6);
            vz0V = uy0C.g();
        }
        Vz0 vz0 = vz0V;
        HC hc2 = c8380j.f75308h;
        Looper looperMyLooper = Looper.myLooper();
        C8086gC.b(looperMyLooper);
        final QH qhA = hc2.a(looperMyLooper, null);
        c8380j.f75311k = qhA;
        try {
            InterfaceC9629uj interfaceC9629uj = c8380j.f75305e;
            Context context = c8380j.f75301a;
            InterfaceC9901xB0 interfaceC9901xB0 = InterfaceC9901xB0.f79709a;
            Objects.requireNonNull(qhA);
            interfaceC9629uj.a(context, vz0, interfaceC9901xB0, c8380j, new Executor() { // from class: com.google.android.gms.internal.ads.PH0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    qhA.b(runnable);
                }
            }, AbstractC7917eh0.t(), 0L);
            Pair pair = c8380j.f75312l;
            if (pair == null) {
                throw null;
            }
            C8107gR c8107gR = (C8107gR) pair.second;
            c8107gR.b();
            c8107gR.a();
            throw null;
        } catch (zzbz e10) {
            throw new zzabg(e10, c10);
        }
    }

    static /* bridge */ /* synthetic */ void l(final C8380j c8380j, boolean z10) {
        if (c8380j.f75314n == 1) {
            c8380j.f75313m++;
            c8380j.f75307g.c(z10);
            QH qh2 = c8380j.f75311k;
            C8086gC.b(qh2);
            qh2.b(new Runnable() { // from class: com.google.android.gms.internal.ads.NH0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f68862a.q();
                }
            });
        }
    }

    static /* bridge */ /* synthetic */ boolean t(C8380j c8380j, long j10) {
        return c8380j.f75313m == 0 && c8380j.f75304d.d(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Vz0 v(Vz0 vz0) {
        return (vz0 == null || !vz0.f()) ? Vz0.f70959h : vz0;
    }

    public final void p() {
        C8107gR c8107gR = C8107gR.f74312c;
        c8107gR.b();
        c8107gR.a();
        this.f75312l = null;
    }

    public final void r() {
        if (this.f75314n == 2) {
            return;
        }
        QH qh2 = this.f75311k;
        if (qh2 != null) {
            qh2.zze(null);
        }
        this.f75312l = null;
        this.f75314n = 2;
    }

    public final void s(Surface surface, C8107gR c8107gR) {
        Pair pair = this.f75312l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C8107gR) this.f75312l.second).equals(c8107gR)) {
            return;
        }
        this.f75312l = Pair.create(surface, c8107gR);
        c8107gR.b();
        c8107gR.a();
    }

    /* synthetic */ C8380j(QH0 qh0, C8275i c8275i) {
        Context context = qh0.f69548a;
        this.f75301a = context;
        C7741d c7741d = new C7741d(this, context);
        this.f75302b = c7741d;
        HC hc2 = qh0.f69553f;
        this.f75308h = hc2;
        C8808n c8808n = qh0.f69549b;
        this.f75303c = c8808n;
        c8808n.k(hc2);
        C9342s c9342s = new C9342s(new RH0(this, null), c8808n);
        this.f75304d = c9342s;
        InterfaceC9629uj interfaceC9629uj = qh0.f69551d;
        C8086gC.b(interfaceC9629uj);
        this.f75305e = interfaceC9629uj;
        this.f75306f = qh0.f69552e;
        this.f75307g = new CH0(c8808n, c9342s);
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f75309i = copyOnWriteArraySet;
        this.f75314n = 0;
        new C9592uH0().H();
        copyOnWriteArraySet.add(c7741d);
    }
}
