package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private Object f46287a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f46288b;

    public interface a {
        void a(b bVar);

        boolean b(b bVar, Menu menu);

        boolean c(b bVar, MenuItem menuItem);

        boolean d(b bVar, Menu menu);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public abstract CharSequence i();

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i10);

    public abstract void o(CharSequence charSequence);

    public abstract void q(int i10);

    public abstract void r(CharSequence charSequence);

    public Object h() {
        return this.f46287a;
    }

    public boolean j() {
        return this.f46288b;
    }

    public void p(Object obj) {
        this.f46287a = obj;
    }

    public void s(boolean z10) {
        this.f46288b = z10;
    }
}
