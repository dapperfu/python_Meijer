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
public final class C8505j implements InterfaceC7203Pr {

    /* renamed from: o, reason: collision with root package name */
    private static final Executor f76140o = new Executor() { // from class: com.google.android.gms.internal.ads.OH0
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Context f76141a;

    /* renamed from: b, reason: collision with root package name */
    private final C7866d f76142b;

    /* renamed from: c, reason: collision with root package name */
    private final C8933n f76143c;

    /* renamed from: d, reason: collision with root package name */
    private final C9467s f76144d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC9754uj f76145e;

    /* renamed from: f, reason: collision with root package name */
    private final List f76146f;

    /* renamed from: g, reason: collision with root package name */
    private final J f76147g;

    /* renamed from: h, reason: collision with root package name */
    private final HC f76148h;

    /* renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArraySet f76149i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC8612k f76150j;

    /* renamed from: k, reason: collision with root package name */
    private QH f76151k;

    /* renamed from: l, reason: collision with root package name */
    private Pair f76152l;

    /* renamed from: m, reason: collision with root package name */
    private int f76153m;

    /* renamed from: n, reason: collision with root package name */
    private int f76154n;

    public final J h() {
        return this.f76142b;
    }

    final /* synthetic */ void q() {
        this.f76153m--;
    }

    static /* bridge */ /* synthetic */ InterfaceC9236pr c(C8505j c8505j, C c10) throws zzabg {
        C8211gC.f(c8505j.f76154n == 0);
        Vz0 vz0V = v(c10.f66480C);
        if (vz0V.f71802c == 7 && OV.f69931a < 34) {
            Uy0 uy0C = vz0V.c();
            uy0C.d(6);
            vz0V = uy0C.g();
        }
        Vz0 vz0 = vz0V;
        HC hc2 = c8505j.f76148h;
        Looper looperMyLooper = Looper.myLooper();
        C8211gC.b(looperMyLooper);
        final QH qhA = hc2.a(looperMyLooper, null);
        c8505j.f76151k = qhA;
        try {
            InterfaceC9754uj interfaceC9754uj = c8505j.f76145e;
            Context context = c8505j.f76141a;
            InterfaceC10026xB0 interfaceC10026xB0 = InterfaceC10026xB0.f80549a;
            Objects.requireNonNull(qhA);
            interfaceC9754uj.a(context, vz0, interfaceC10026xB0, c8505j, new Executor() { // from class: com.google.android.gms.internal.ads.PH0
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    qhA.b(runnable);
                }
            }, AbstractC8042eh0.t(), 0L);
            Pair pair = c8505j.f76152l;
            if (pair == null) {
                throw null;
            }
            C8232gR c8232gR = (C8232gR) pair.second;
            c8232gR.b();
            c8232gR.a();
            throw null;
        } catch (zzbz e10) {
            throw new zzabg(e10, c10);
        }
    }

    static /* bridge */ /* synthetic */ void l(final C8505j c8505j, boolean z10) {
        if (c8505j.f76154n == 1) {
            c8505j.f76153m++;
            c8505j.f76147g.c(z10);
            QH qh2 = c8505j.f76151k;
            C8211gC.b(qh2);
            qh2.b(new Runnable() { // from class: com.google.android.gms.internal.ads.NH0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69702a.q();
                }
            });
        }
    }

    static /* bridge */ /* synthetic */ boolean t(C8505j c8505j, long j10) {
        return c8505j.f76153m == 0 && c8505j.f76144d.d(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Vz0 v(Vz0 vz0) {
        return (vz0 == null || !vz0.f()) ? Vz0.f71799h : vz0;
    }

    public final void p() {
        C8232gR c8232gR = C8232gR.f75152c;
        c8232gR.b();
        c8232gR.a();
        this.f76152l = null;
    }

    public final void r() {
        if (this.f76154n == 2) {
            return;
        }
        QH qh2 = this.f76151k;
        if (qh2 != null) {
            qh2.zze(null);
        }
        this.f76152l = null;
        this.f76154n = 2;
    }

    public final void s(Surface surface, C8232gR c8232gR) {
        Pair pair = this.f76152l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C8232gR) this.f76152l.second).equals(c8232gR)) {
            return;
        }
        this.f76152l = Pair.create(surface, c8232gR);
        c8232gR.b();
        c8232gR.a();
    }

    /* synthetic */ C8505j(QH0 qh0, C8400i c8400i) {
        Context context = qh0.f70388a;
        this.f76141a = context;
        C7866d c7866d = new C7866d(this, context);
        this.f76142b = c7866d;
        HC hc2 = qh0.f70393f;
        this.f76148h = hc2;
        C8933n c8933n = qh0.f70389b;
        this.f76143c = c8933n;
        c8933n.k(hc2);
        C9467s c9467s = new C9467s(new RH0(this, null), c8933n);
        this.f76144d = c9467s;
        InterfaceC9754uj interfaceC9754uj = qh0.f70391d;
        C8211gC.b(interfaceC9754uj);
        this.f76145e = interfaceC9754uj;
        this.f76146f = qh0.f70392e;
        this.f76147g = new CH0(c8933n, c9467s);
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f76149i = copyOnWriteArraySet;
        this.f76154n = 0;
        new C9717uH0().H();
        copyOnWriteArraySet.add(c7866d);
    }
}
