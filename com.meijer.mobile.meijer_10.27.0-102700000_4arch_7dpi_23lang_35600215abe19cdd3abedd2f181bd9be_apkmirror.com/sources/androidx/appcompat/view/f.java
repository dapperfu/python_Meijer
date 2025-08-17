package androidx.appcompat.view;

import Z.n0;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.l;
import f2.InterfaceMenuC13833a;
import f2.InterfaceMenuItemC13834b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class f extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    final Context f46078a;

    /* renamed from: b, reason: collision with root package name */
    final b f46079b;

    public static class a implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f46080a;

        /* renamed from: b, reason: collision with root package name */
        final Context f46081b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList<f> f46082c = new ArrayList<>();

        /* renamed from: d, reason: collision with root package name */
        final n0<Menu, Menu> f46083d = new n0<>();

        private Menu f(Menu menu) {
            Menu menu2 = this.f46083d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            l lVar = new l(this.f46081b, (InterfaceMenuC13833a) menu);
            this.f46083d.put(menu, lVar);
            return lVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(b bVar) {
            this.f46080a.onDestroyActionMode(e(bVar));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(b bVar, Menu menu) {
            return this.f46080a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(b bVar, MenuItem menuItem) {
            return this.f46080a.onActionItemClicked(e(bVar), new MenuItemWrapperICS(this.f46081b, (InterfaceMenuItemC13834b) menuItem));
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(b bVar, Menu menu) {
            return this.f46080a.onPrepareActionMode(e(bVar), f(menu));
        }

        public ActionMode e(b bVar) {
            int size = this.f46082c.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = this.f46082c.get(i10);
                if (fVar != null && fVar.f46079b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f46081b, bVar);
            this.f46082c.add(fVar2);
            return fVar2;
        }

        public a(Context context, ActionMode.Callback callback) {
            this.f46081b = context;
            this.f46080a = callback;
        }
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f46079b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f46079b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f46079b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f46079b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new l(this.f46078a, (InterfaceMenuC13833a) this.f46079b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f46079b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f46079b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f46079b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f46079b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f46079b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f46079b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f46079b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f46079b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i10) {
        this.f46079b.n(i10);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f46079b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i10) {
        this.f46079b.q(i10);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z10) {
        this.f46079b.s(z10);
    }

    public f(Context context, b bVar) {
        this.f46078a = context;
        this.f46079b = bVar;
    }
}
