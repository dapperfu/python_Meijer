package com.medallia.digital.mobilesdk;

import android.os.Handler;
import android.os.Looper;
import com.medallia.digital.mobilesdk.x5;

/* loaded from: classes8.dex */
abstract class y5<T> extends m0<T> {

    /* renamed from: f, reason: collision with root package name */
    private long f94463f;

    /* renamed from: g, reason: collision with root package name */
    protected o0 f94464g;

    /* renamed from: h, reason: collision with root package name */
    private x5 f94465h;

    /* renamed from: i, reason: collision with root package name */
    private final Handler f94466i;

    /* renamed from: j, reason: collision with root package name */
    private final Runnable f94467j;

    class a extends v4 {

        /* renamed from: com.medallia.digital.mobilesdk.y5$a$a, reason: collision with other inner class name */
        class C1325a extends v4 {
            C1325a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                y5 y5Var = y5.this;
                y5Var.a((y5) y5Var.j());
                y5.this.f94466i.postDelayed(y5.this.f94467j, y5.this.k().a());
            }
        }

        a() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            w7.b().a().execute(new C1325a());
        }
    }

    protected y5(x5 x5Var, n0 n0Var) {
        super(n0Var);
        this.f94466i = new Handler(Looper.getMainLooper());
        this.f94467j = new a();
        this.f94465h = x5Var == null ? new x5() : x5Var;
        this.f94464g = new o0();
    }

    private boolean l() {
        return System.currentTimeMillis() - this.f94463f >= this.f94465h.a();
    }

    private void o() {
        if (k().b() == x5.a.ONCE) {
            a((y5<T>) j());
        } else {
            n();
        }
    }

    private void p() {
        this.f94466i.removeCallbacks(this.f94467j);
    }

    protected T j() {
        return null;
    }

    protected x5 k() {
        return this.f94465h;
    }

    protected void m() {
        if (h()) {
            a((y5<T>) j());
        }
    }

    protected void n() {
        if (h() && this.f94465h.b() == x5.a.FREQUENCY) {
            p();
            if (l()) {
                this.f94466i.post(this.f94467j);
            } else {
                this.f94466i.postDelayed(this.f94467j, this.f94465h.a());
            }
            this.f94463f = System.currentTimeMillis();
        }
    }

    protected void q() {
        p();
    }

    protected void a(o0 o0Var) {
        this.f94464g = o0Var;
    }

    protected void a(x5 x5Var) {
        this.f94465h = x5Var;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected void a(boolean z10) {
        super.a(z10);
        if (z10) {
            o();
        } else {
            p();
        }
    }
}
