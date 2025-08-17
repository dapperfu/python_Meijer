package androidx.work.impl.background.systemalarm;

import N4.AbstractC4333v;
import O4.y;
import R4.b;
import R4.i;
import R4.j;
import T4.n;
import V4.WorkGenerationalId;
import W4.G;
import W4.N;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.model.WorkSpec;
import java.util.concurrent.Executor;
import qv.AbstractC16618K;
import qv.C0;

/* loaded from: classes4.dex */
public class f implements R4.f, N.a {

    /* renamed from: o, reason: collision with root package name */
    private static final String f59195o = AbstractC4333v.i("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f59196a;

    /* renamed from: b, reason: collision with root package name */
    private final int f59197b;

    /* renamed from: c, reason: collision with root package name */
    private final WorkGenerationalId f59198c;

    /* renamed from: d, reason: collision with root package name */
    private final g f59199d;

    /* renamed from: e, reason: collision with root package name */
    private final i f59200e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f59201f;

    /* renamed from: g, reason: collision with root package name */
    private int f59202g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f59203h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f59204i;

    /* renamed from: j, reason: collision with root package name */
    private PowerManager.WakeLock f59205j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f59206k;

    /* renamed from: l, reason: collision with root package name */
    private final y f59207l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC16618K f59208m;

    /* renamed from: n, reason: collision with root package name */
    private volatile C0 f59209n;

    private void d() {
        synchronized (this.f59201f) {
            try {
                if (this.f59209n != null) {
                    this.f59209n.d(null);
                }
                this.f59199d.h().b(this.f59198c);
                PowerManager.WakeLock wakeLock = this.f59205j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    AbstractC4333v.e().a(f59195o, "Releasing wakelock " + this.f59205j + "for WorkSpec " + this.f59198c);
                    this.f59205j.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f59202g != 0) {
            AbstractC4333v.e().a(f59195o, "Already started work for " + this.f59198c);
            return;
        }
        this.f59202g = 1;
        AbstractC4333v.e().a(f59195o, "onAllConstraintsMet for " + this.f59198c);
        if (this.f59199d.e().o(this.f59207l)) {
            this.f59199d.h().a(this.f59198c, 600000L, this);
        } else {
            d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        String strB = this.f59198c.getWorkSpecId();
        if (this.f59202g >= 2) {
            AbstractC4333v.e().a(f59195o, "Already stopped work for " + strB);
            return;
        }
        this.f59202g = 2;
        AbstractC4333v abstractC4333vE = AbstractC4333v.e();
        String str = f59195o;
        abstractC4333vE.a(str, "Stopping work for WorkSpec " + strB);
        this.f59204i.execute(new g.b(this.f59199d, b.f(this.f59196a, this.f59198c), this.f59197b));
        if (!this.f59199d.e().k(this.f59198c.getWorkSpecId())) {
            AbstractC4333v.e().a(str, "Processor does not have WorkSpec " + strB + ". No need to reschedule");
            return;
        }
        AbstractC4333v.e().a(str, "WorkSpec " + strB + " needs to be rescheduled");
        this.f59204i.execute(new g.b(this.f59199d, b.e(this.f59196a, this.f59198c), this.f59197b));
    }

    @Override // R4.f
    public void e(WorkSpec workSpec, R4.b bVar) {
        if (bVar instanceof b.a) {
            this.f59203h.execute(new e(this));
        } else {
            this.f59203h.execute(new d(this));
        }
    }

    void f() {
        String strB = this.f59198c.getWorkSpecId();
        this.f59205j = G.b(this.f59196a, strB + " (" + this.f59197b + ")");
        AbstractC4333v abstractC4333vE = AbstractC4333v.e();
        String str = f59195o;
        abstractC4333vE.a(str, "Acquiring wakelock " + this.f59205j + "for WorkSpec " + strB);
        this.f59205j.acquire();
        WorkSpec workSpecK = this.f59199d.g().u().l().k(strB);
        if (workSpecK == null) {
            this.f59203h.execute(new d(this));
            return;
        }
        boolean zL = workSpecK.l();
        this.f59206k = zL;
        if (zL) {
            this.f59209n = j.c(this.f59200e, workSpecK, this.f59208m, this);
            return;
        }
        AbstractC4333v.e().a(str, "No constraints for " + strB);
        this.f59203h.execute(new e(this));
    }

    f(Context context, int i10, g gVar, y yVar) {
        this.f59196a = context;
        this.f59197b = i10;
        this.f59199d = gVar;
        this.f59198c = yVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
        this.f59207l = yVar;
        n nVarT = gVar.g().t();
        this.f59203h = gVar.f().c();
        this.f59204i = gVar.f().a();
        this.f59208m = gVar.f().b();
        this.f59200e = new i(nVarT);
        this.f59206k = false;
        this.f59202g = 0;
        this.f59201f = new Object();
    }

    @Override // W4.N.a
    public void a(WorkGenerationalId hVar) {
        AbstractC4333v.e().a(f59195o, "Exceeded time limits on execution for " + hVar);
        this.f59203h.execute(new d(this));
    }

    void g(boolean z10) {
        AbstractC4333v.e().a(f59195o, "onExecuted " + this.f59198c + ", " + z10);
        d();
        if (z10) {
            this.f59204i.execute(new g.b(this.f59199d, b.e(this.f59196a, this.f59198c), this.f59197b));
        }
        if (this.f59206k) {
            this.f59204i.execute(new g.b(this.f59199d, b.a(this.f59196a), this.f59197b));
        }
    }
}
