package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.InterfaceC5643t;
import androidx.appcompat.widget.Q;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
class w extends androidx.appcompat.app.a {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC5643t f45997a;

    /* renamed from: b, reason: collision with root package name */
    final Window.Callback f45998b;

    /* renamed from: c, reason: collision with root package name */
    final AppCompatDelegateImpl.g f45999c;

    /* renamed from: d, reason: collision with root package name */
    boolean f46000d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f46001e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f46002f;

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<a.b> f46003g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f46004h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final Toolbar.h f46005i;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            w.this.F();
        }
    }

    class b implements Toolbar.h {
        b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return w.this.f45998b.onMenuItemSelected(0, menuItem);
        }
    }

    private final class c implements j.a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f46008a;

        c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.f fVar, boolean z10) {
            if (this.f46008a) {
                return;
            }
            this.f46008a = true;
            w.this.f45997a.s();
            w.this.f45998b.onPanelClosed(108, fVar);
            this.f46008a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.f fVar) {
            w.this.f45998b.onMenuOpened(108, fVar);
            return true;
        }
    }

    private final class d implements f.a {
        @Override // androidx.appcompat.view.menu.f.a
        public boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
            return false;
        }

        d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public void b(androidx.appcompat.view.menu.f fVar) {
            if (w.this.f45997a.e()) {
                w.this.f45998b.onPanelClosed(108, fVar);
            } else if (w.this.f45998b.onPreparePanel(0, null, fVar)) {
                w.this.f45998b.onMenuOpened(108, fVar);
            }
        }
    }

    private class e implements AppCompatDelegateImpl.g {
        e() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.g
        public boolean a(int i10) {
            if (i10 != 0) {
                return false;
            }
            w wVar = w.this;
            if (wVar.f46000d) {
                return false;
            }
            wVar.f45997a.f();
            w.this.f46000d = true;
            return false;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.g
        public View onCreatePanelView(int i10) {
            if (i10 == 0) {
                return new View(w.this.f45997a.getContext());
            }
            return null;
        }
    }

    @Override // androidx.appcompat.app.a
    public void A(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z10) {
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z10) {
        G(z10 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void u(boolean z10) {
        G(z10 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.a
    public void z(boolean z10) {
    }

    private Menu E() {
        if (!this.f46001e) {
            this.f45997a.w(new c(), new d());
            this.f46001e = true;
        }
        return this.f45997a.k();
    }

    @Override // androidx.appcompat.app.a
    public void B(CharSequence charSequence) {
        this.f45997a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void C(CharSequence charSequence) {
        this.f45997a.setWindowTitle(charSequence);
    }

    public void G(int i10, int i11) {
        this.f45997a.i((i10 & i11) | ((~i11) & this.f45997a.y()));
    }

    @Override // androidx.appcompat.app.a
    public boolean f() {
        return this.f45997a.b();
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        if (!this.f45997a.h()) {
            return false;
        }
        this.f45997a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z10) {
        if (z10 == this.f46002f) {
            return;
        }
        this.f46002f = z10;
        int size = this.f46003g.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f46003g.get(i10).onMenuVisibilityChanged(z10);
        }
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f45997a.y();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        return this.f45997a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public void k() {
        this.f45997a.x(8);
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        this.f45997a.n().removeCallbacks(this.f46004h);
        ViewCompat.e0(this.f45997a.n(), this.f46004h);
        return true;
    }

    @Override // androidx.appcompat.app.a
    void n() {
        this.f45997a.n().removeCallbacks(this.f46004h);
    }

    @Override // androidx.appcompat.app.a
    public boolean q() {
        return this.f45997a.c();
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z10) {
        G(z10 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void v(int i10) {
        this.f45997a.p(i10);
    }

    @Override // androidx.appcompat.app.a
    public void w(CharSequence charSequence) {
        this.f45997a.j(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void x(int i10) {
        this.f45997a.v(i10);
    }

    @Override // androidx.appcompat.app.a
    public void y(Drawable drawable) {
        this.f45997a.A(drawable);
    }

    w(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f46005i = bVar;
        o2.i.g(toolbar);
        Q q10 = new Q(toolbar, false);
        this.f45997a = q10;
        this.f45998b = (Window.Callback) o2.i.g(callback);
        q10.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        q10.setWindowTitle(charSequence);
        this.f45999c = new e();
    }

    void F() {
        androidx.appcompat.view.menu.f fVar;
        Menu menuE = E();
        if (menuE instanceof androidx.appcompat.view.menu.f) {
            fVar = (androidx.appcompat.view.menu.f) menuE;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            fVar.i0();
        }
        try {
            menuE.clear();
            if (!this.f45998b.onCreatePanelMenu(0, menuE) || !this.f45998b.onPreparePanel(0, null, menuE)) {
                menuE.clear();
            }
            if (fVar != null) {
                fVar.h0();
            }
        } catch (Throwable th2) {
            if (fVar != null) {
                fVar.h0();
            }
            throw th2;
        }
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i10, KeyEvent keyEvent) {
        int deviceId;
        Menu menuE = E();
        if (menuE == null) {
            return false;
        }
        if (keyEvent != null) {
            deviceId = keyEvent.getDeviceId();
        } else {
            deviceId = -1;
        }
        boolean z10 = true;
        if (KeyCharacterMap.load(deviceId).getKeyboardType() == 1) {
            z10 = false;
        }
        menuE.setQwertyMode(z10);
        return menuE.performShortcut(i10, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }
}
