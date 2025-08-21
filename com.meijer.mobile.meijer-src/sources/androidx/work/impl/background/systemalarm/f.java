package androidx.work.impl.background.systemalarm;

import O4.AbstractC4373v;
import P4.y;
import S4.b;
import S4.i;
import S4.j;
import U4.n;
import W4.WorkGenerationalId;
import X4.G;
import X4.N;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.model.WorkSpec;
import java.util.concurrent.Executor;
import mv.AbstractC15779K;
import mv.C0;

/* loaded from: classes4.dex */
public class f implements S4.f, N.a {

    /* renamed from: o, reason: collision with root package name */
    private static final String f59381o = AbstractC4373v.i("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    private final Context f59382a;

    /* renamed from: b, reason: collision with root package name */
    private final int f59383b;

    /* renamed from: c, reason: collision with root package name */
    private final WorkGenerationalId f59384c;

    /* renamed from: d, reason: collision with root package name */
    private final g f59385d;

    /* renamed from: e, reason: collision with root package name */
    private final i f59386e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f59387f;

    /* renamed from: g, reason: collision with root package name */
    private int f59388g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f59389h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f59390i;

    /* renamed from: j, reason: collision with root package name */
    private PowerManager.WakeLock f59391j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f59392k;

    /* renamed from: l, reason: collision with root package name */
    private final y f59393l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC15779K f59394m;

    /* renamed from: n, reason: collision with root package name */
    private volatile C0 f59395n;

    private void e() {
        synchronized (this.f59387f) {
            try {
                if (this.f59395n != null) {
                    this.f59395n.d(null);
                }
                this.f59385d.h().b(this.f59384c);
                PowerManager.WakeLock wakeLock = this.f59391j;
                if (wakeLock != null && wakeLock.isHeld()) {
                    AbstractC4373v.e().a(f59381o, "Releasing wakelock " + this.f59391j + "for WorkSpec " + this.f59384c);
                    this.f59391j.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f59388g != 0) {
            AbstractC4373v.e().a(f59381o, "Already started work for " + this.f59384c);
            return;
        }
        this.f59388g = 1;
        AbstractC4373v.e().a(f59381o, "onAllConstraintsMet for " + this.f59384c);
        if (this.f59385d.d().o(this.f59393l)) {
            this.f59385d.h().a(this.f59384c, 600000L, this);
        } else {
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        String strB = this.f59384c.getWorkSpecId();
        if (this.f59388g >= 2) {
            AbstractC4373v.e().a(f59381o, "Already stopped work for " + strB);
            return;
        }
        this.f59388g = 2;
        AbstractC4373v abstractC4373vE = AbstractC4373v.e();
        String str = f59381o;
        abstractC4373vE.a(str, "Stopping work for WorkSpec " + strB);
        this.f59390i.execute(new g.b(this.f59385d, b.f(this.f59382a, this.f59384c), this.f59383b));
        if (!this.f59385d.d().k(this.f59384c.getWorkSpecId())) {
            AbstractC4373v.e().a(str, "Processor does not have WorkSpec " + strB + ". No need to reschedule");
            return;
        }
        AbstractC4373v.e().a(str, "WorkSpec " + strB + " needs to be rescheduled");
        this.f59390i.execute(new g.b(this.f59385d, b.d(this.f59382a, this.f59384c), this.f59383b));
    }

    @Override // S4.f
    public void d(WorkSpec workSpec, S4.b bVar) {
        if (bVar instanceof b.a) {
            this.f59389h.execute(new e(this));
        } else {
            this.f59389h.execute(new d(this));
        }
    }

    void f() {
        String strB = this.f59384c.getWorkSpecId();
        this.f59391j = G.b(this.f59382a, strB + " (" + this.f59383b + ")");
        AbstractC4373v abstractC4373vE = AbstractC4373v.e();
        String str = f59381o;
        abstractC4373vE.a(str, "Acquiring wakelock " + this.f59391j + "for WorkSpec " + strB);
        this.f59391j.acquire();
        WorkSpec workSpecJ = this.f59385d.g().u().l().j(strB);
        if (workSpecJ == null) {
            this.f59389h.execute(new d(this));
            return;
        }
        boolean zL = workSpecJ.l();
        this.f59392k = zL;
        if (zL) {
            this.f59395n = j.c(this.f59386e, workSpecJ, this.f59394m, this);
            return;
        }
        AbstractC4373v.e().a(str, "No constraints for " + strB);
        this.f59389h.execute(new e(this));
    }

    f(Context context, int i10, g gVar, y yVar) {
        this.f59382a = context;
        this.f59383b = i10;
        this.f59385d = gVar;
        this.f59384c = yVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
        this.f59393l = yVar;
        n nVarT = gVar.g().t();
        this.f59389h = gVar.f().c();
        this.f59390i = gVar.f().a();
        this.f59394m = gVar.f().b();
        this.f59386e = new i(nVarT);
        this.f59392k = false;
        this.f59388g = 0;
        this.f59387f = new Object();
    }

    @Override // X4.N.a
    public void a(WorkGenerationalId hVar) {
        AbstractC4373v.e().a(f59381o, "Exceeded time limits on execution for " + hVar);
        this.f59389h.execute(new d(this));
    }

    void g(boolean z10) {
        AbstractC4373v.e().a(f59381o, "onExecuted " + this.f59384c + ", " + z10);
        e();
        if (z10) {
            this.f59390i.execute(new g.b(this.f59385d, b.d(this.f59382a, this.f59384c), this.f59383b));
        }
        if (this.f59392k) {
            this.f59390i.execute(new g.b(this.f59385d, b.a(this.f59382a), this.f59383b));
        }
    }
}
