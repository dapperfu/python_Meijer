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
    private Context f46295c;

    /* renamed from: d, reason: collision with root package name */
    private ActionBarContextView f46296d;

    /* renamed from: e, reason: collision with root package name */
    private b.a f46297e;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<View> f46298f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f46299g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f46300h;

    /* renamed from: i, reason: collision with root package name */
    private androidx.appcompat.view.menu.f f46301i;

    @Override // androidx.appcompat.view.menu.f.a
    public boolean a(androidx.appcompat.view.menu.f fVar, MenuItem menuItem) {
        return this.f46297e.c(this, menuItem);
    }

    @Override // androidx.appcompat.view.b
    public void c() {
        if (this.f46299g) {
            return;
        }
        this.f46299g = true;
        this.f46297e.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View d() {
        WeakReference<View> weakReference = this.f46298f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu e() {
        return this.f46301i;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater f() {
        return new g(this.f46296d.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence g() {
        return this.f46296d.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence i() {
        return this.f46296d.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void k() {
        this.f46297e.d(this, this.f46301i);
    }

    @Override // androidx.appcompat.view.b
    public boolean l() {
        return this.f46296d.j();
    }

    @Override // androidx.appcompat.view.b
    public void m(View view) {
        this.f46296d.setCustomView(view);
        this.f46298f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void n(int i10) {
        o(this.f46295c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void o(CharSequence charSequence) {
        this.f46296d.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void q(int i10) {
        r(this.f46295c.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void r(CharSequence charSequence) {
        this.f46296d.setTitle(charSequence);
    }

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f46295c = context;
        this.f46296d = actionBarContextView;
        this.f46297e = aVar;
        androidx.appcompat.view.menu.f fVarX = new androidx.appcompat.view.menu.f(actionBarContextView.getContext()).X(1);
        this.f46301i = fVarX;
        fVarX.W(this);
        this.f46300h = z10;
    }

    @Override // androidx.appcompat.view.menu.f.a
    public void b(androidx.appcompat.view.menu.f fVar) {
        k();
        this.f46296d.l();
    }

    @Override // androidx.appcompat.view.b
    public void s(boolean z10) {
        super.s(z10);
        this.f46296d.setTitleOptional(z10);
    }
}
