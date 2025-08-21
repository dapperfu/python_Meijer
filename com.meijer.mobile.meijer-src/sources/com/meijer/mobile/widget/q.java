package com.meijer.mobile.widget;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import yr.Q;

/* loaded from: classes12.dex */
public abstract class q<T> {

    /* renamed from: a, reason: collision with root package name */
    private final View f120559a;

    /* renamed from: b, reason: collision with root package name */
    private final int f120560b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f120561c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f120562d = new Runnable() { // from class: com.meijer.mobile.widget.o
        @Override // java.lang.Runnable
        public final void run() {
            this.f120557a.d();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private Snackbar f120563e;

    /* renamed from: f, reason: collision with root package name */
    private T f120564f;

    class a extends Snackbar.a {
        a() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Snackbar snackbar, int i10) {
            super.a(q.this.f120563e, i10);
            q.this.f120563e = null;
        }
    }

    public abstract void h(T t10);

    public abstract void i(T t10);

    private Snackbar e() {
        return Snackbar.q0(this.f120559a, this.f120560b, -2).t0(Q.f171768e0, new View.OnClickListener() { // from class: com.meijer.mobile.widget.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120558a.g(view);
            }
        }).u(new a());
    }

    private void f() {
        Snackbar snackbar = this.f120563e;
        if (snackbar != null) {
            snackbar.A();
        }
        this.f120561c.removeCallbacks(this.f120562d);
    }

    public void d() {
        T t10 = this.f120564f;
        if (t10 != null) {
            h(t10);
            this.f120564f = null;
        }
        f();
    }

    public void j(T t10) {
        T t11 = this.f120564f;
        if (t11 != null) {
            h(t11);
        }
        this.f120564f = t10;
        if (this.f120563e == null) {
            Snackbar snackbarE = e();
            this.f120563e = snackbarE;
            snackbarE.c0();
        }
        this.f120561c.removeCallbacks(this.f120562d);
        this.f120561c.postDelayed(this.f120562d, 5000L);
    }

    public void k() {
        T t10 = this.f120564f;
        if (t10 != null) {
            i(t10);
            this.f120564f = null;
        }
        f();
    }

    public q(View view, int i10) {
        this.f120559a = view;
        this.f120560b = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        k();
    }
}
