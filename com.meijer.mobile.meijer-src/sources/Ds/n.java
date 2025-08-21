package Ds;

import android.os.CountDownTimer;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import yr.Q;

/* loaded from: classes12.dex */
public class n<T> extends CountDownTimer implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private T f6661a;

    /* renamed from: b, reason: collision with root package name */
    private int f6662b;

    /* renamed from: c, reason: collision with root package name */
    private b f6663c;

    /* renamed from: d, reason: collision with root package name */
    private Snackbar f6664d;

    /* renamed from: e, reason: collision with root package name */
    private View f6665e;

    /* renamed from: f, reason: collision with root package name */
    private String f6666f;

    class a extends Snackbar.a {
        a() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r
        /* renamed from: c */
        public void a(Snackbar snackbar, int i10) {
            n.this.f6664d = null;
            if (i10 == 0) {
                n.this.b();
            }
        }
    }

    public interface b<T> {
        void i(T t10);

        void q(T t10, int i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n(int i10, View view, String str, b bVar) {
        long j10 = i10;
        super(j10, j10);
        this.f6665e = view;
        this.f6663c = bVar;
        this.f6666f = str;
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j10) {
    }

    private void c() {
        this.f6664d = Snackbar.r0(this.f6665e, this.f6666f, -2).t0(Q.f171768e0, this).u(new a());
    }

    public void b() {
        b bVar = this.f6663c;
        if (bVar != null) {
            bVar.i(this.f6661a);
        }
        this.f6661a = null;
        Snackbar snackbar = this.f6664d;
        if (snackbar != null) {
            snackbar.A();
            this.f6664d = null;
        }
    }

    public void d(T t10, int i10) {
        if (this.f6664d == null) {
            c();
        } else {
            cancel();
            b bVar = this.f6663c;
            if (bVar != null) {
                bVar.i(this.f6661a);
            }
            this.f6661a = null;
        }
        this.f6664d.c0();
        this.f6661a = t10;
        this.f6662b = i10;
        start();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        cancel();
        this.f6664d.A();
        T t10 = this.f6661a;
        if (t10 != null) {
            b bVar = this.f6663c;
            if (bVar != null) {
                bVar.q(t10, this.f6662b);
            }
            this.f6661a = null;
        }
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        b();
    }
}
