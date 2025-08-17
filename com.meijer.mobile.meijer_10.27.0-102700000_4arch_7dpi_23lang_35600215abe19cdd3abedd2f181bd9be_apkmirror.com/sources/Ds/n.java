package Ds;

import android.os.CountDownTimer;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import yr.Q;

/* loaded from: classes11.dex */
public class n<T> extends CountDownTimer implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private T f7354a;

    /* renamed from: b, reason: collision with root package name */
    private int f7355b;

    /* renamed from: c, reason: collision with root package name */
    private b f7356c;

    /* renamed from: d, reason: collision with root package name */
    private Snackbar f7357d;

    /* renamed from: e, reason: collision with root package name */
    private View f7358e;

    /* renamed from: f, reason: collision with root package name */
    private String f7359f;

    class a extends Snackbar.a {
        a() {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Snackbar snackbar, int i10) {
            n.this.f7357d = null;
            if (i10 == 0) {
                n.this.b();
            }
        }
    }

    public interface b<T> {
        void i(T t10);

        void r(T t10, int i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n(int i10, View view, String str, b bVar) {
        long j10 = i10;
        super(j10, j10);
        this.f7358e = view;
        this.f7356c = bVar;
        this.f7359f = str;
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j10) {
    }

    private void c() {
        this.f7357d = Snackbar.r0(this.f7358e, this.f7359f, -2).t0(Q.f170993e0, this).u(new a());
    }

    public void b() {
        b bVar = this.f7356c;
        if (bVar != null) {
            bVar.i(this.f7354a);
        }
        this.f7354a = null;
        Snackbar snackbar = this.f7357d;
        if (snackbar != null) {
            snackbar.A();
            this.f7357d = null;
        }
    }

    public void d(T t10, int i10) {
        if (this.f7357d == null) {
            c();
        } else {
            cancel();
            b bVar = this.f7356c;
            if (bVar != null) {
                bVar.i(this.f7354a);
            }
            this.f7354a = null;
        }
        this.f7357d.c0();
        this.f7354a = t10;
        this.f7355b = i10;
        start();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        cancel();
        this.f7357d.A();
        T t10 = this.f7354a;
        if (t10 != null) {
            b bVar = this.f7356c;
            if (bVar != null) {
                bVar.r(t10, this.f7355b);
            }
            this.f7354a = null;
        }
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        b();
    }
}
