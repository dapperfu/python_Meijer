package com.meijer.mobile.widget;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import yr.Q;

/* loaded from: classes11.dex */
public abstract class q<T> {

    /* renamed from: a, reason: collision with root package name */
    private final View f119586a;

    /* renamed from: b, reason: collision with root package name */
    private final int f119587b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f119588c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f119589d = new Runnable() { // from class: com.meijer.mobile.widget.o
        @Override // java.lang.Runnable
        public final void run() {
            this.f119584a.d();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private Snackbar f119590e;

    /* renamed from: f, reason: collision with root package name */
    private T f119591f;

    class a extends Snackbar.a {
        a() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r
        /* renamed from: c */
        public void a(Snackbar snackbar, int i10) {
            super.a(q.this.f119590e, i10);
            q.this.f119590e = null;
        }
    }

    public abstract void h(T t10);

    public abstract void i(T t10);

    private Snackbar e() {
        return Snackbar.q0(this.f119586a, this.f119587b, -2).t0(Q.f170993e0, new View.OnClickListener() { // from class: com.meijer.mobile.widget.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119585a.g(view);
            }
        }).u(new a());
    }

    private void f() {
        Snackbar snackbar = this.f119590e;
        if (snackbar != null) {
            snackbar.A();
        }
        this.f119588c.removeCallbacks(this.f119589d);
    }

    public void d() {
        T t10 = this.f119591f;
        if (t10 != null) {
            h(t10);
            this.f119591f = null;
        }
        f();
    }

    public void j(T t10) {
        T t11 = this.f119591f;
        if (t11 != null) {
            h(t11);
        }
        this.f119591f = t10;
        if (this.f119590e == null) {
            Snackbar snackbarE = e();
            this.f119590e = snackbarE;
            snackbarE.c0();
        }
        this.f119588c.removeCallbacks(this.f119589d);
        this.f119588c.postDelayed(this.f119589d, 5000L);
    }

    public void k() {
        T t10 = this.f119591f;
        if (t10 != null) {
            i(t10);
            this.f119591f = null;
        }
        f();
    }

    public q(View view, int i10) {
        this.f119586a = view;
        this.f119587b = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(View view) {
        k();
    }
}
