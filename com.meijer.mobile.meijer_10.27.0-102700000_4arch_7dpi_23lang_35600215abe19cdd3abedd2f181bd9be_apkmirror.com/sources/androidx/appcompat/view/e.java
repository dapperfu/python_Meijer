package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e extends b implements f.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f46071c;

    /* renamed from: d, reason: collision with root package name */
    private ActionBarContextView f46072d;

    /* renamed from: e, reason: collision with root package name */
    private b.a f46073e;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<View> f46074f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f46075g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f46076h;

    /* renamed from: i, reason: collision with root package name */
    private androidx.appcompat.view.menu.f f46077i;

    @Override // androidx.appcompat.view.menu.f.a
    public boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        return this.f46073e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f46075g) {
            return;
        }
        this.f46075g = true;
        this.f46073e.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference<View> weakReference = this.f46074f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f46077i;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f46072d.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f46072d.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f46072d.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f46073e.d(this, this.f46077i);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f46072d.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f46072d.setCustomView(view);
        this.f46074f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i10) {
        o(this.f46071c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f46072d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i10) {
        r(this.f46071c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f46072d.setTitle(charSequence);
    }

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f46071c = context;
        this.f46072d = actionBarContextView;
        this.f46073e = aVar;
        androidx.appcompat.view.menu.f fVarX = new androidx.appcompat.view.menu.f(actionBarContextView.getContext()).X(1);
        this.f46077i = fVarX;
        fVarX.W(this);
        this.f46076h = z10;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public void b(androidx.appcompat.view.menu.f fVar) {
        k();
        this.f46072d.l();
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z10) {
        super.s(z10);
        this.f46072d.setTitleOptional(z10);
    }
}
