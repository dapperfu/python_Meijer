package androidx.appcompat.app;

import android.R;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.fullstory.FS;
import k.C15076b;

/* loaded from: classes.dex */
public class b implements DrawerLayout.d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0969b f46162a;

    /* renamed from: b, reason: collision with root package name */
    private final DrawerLayout f46163b;

    /* renamed from: c, reason: collision with root package name */
    private C15076b f46164c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f46165d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f46166e;

    /* renamed from: f, reason: collision with root package name */
    boolean f46167f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f46168g;

    /* renamed from: h, reason: collision with root package name */
    private final int f46169h;

    /* renamed from: i, reason: collision with root package name */
    private final int f46170i;

    /* renamed from: j, reason: collision with root package name */
    View.OnClickListener f46171j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f46172k;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b bVar = b.this;
            if (bVar.f46167f) {
                bVar.l();
                return;
            }
            View.OnClickListener onClickListener = bVar.f46171j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.b$b, reason: collision with other inner class name */
    public interface InterfaceC0969b {
        Context a();

        boolean b();

        void c(Drawable drawable, int i10);

        Drawable d();

        void e(int i10);
    }

    public interface c {
        InterfaceC0969b getDrawerToggleDelegate();
    }

    private static class d implements InterfaceC0969b {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f46174a;

        /* JADX WARN: Multi-variable type inference failed */
        public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
            return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
        }

        @Override // androidx.appcompat.app.b.InterfaceC0969b
        public Context a() {
            ActionBar actionBar = this.f46174a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f46174a;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0969b
        public boolean b() {
            ActionBar actionBar = this.f46174a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0969b
        public void c(Drawable drawable, int i10) {
            ActionBar actionBar = this.f46174a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0969b
        public void e(int i10) {
            ActionBar actionBar = this.f46174a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i10);
            }
        }

        d(Activity activity) {
            this.f46174a = activity;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0969b
        public Drawable d() {
            TypedArray typedArrayObtainStyledAttributes = a().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, 0);
            typedArrayObtainStyledAttributes.recycle();
            return drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160;
        }
    }

    static class e implements InterfaceC0969b {

        /* renamed from: a, reason: collision with root package name */
        final Toolbar f46175a;

        /* renamed from: b, reason: collision with root package name */
        final Drawable f46176b;

        /* renamed from: c, reason: collision with root package name */
        final CharSequence f46177c;

        @Override // androidx.appcompat.app.b.InterfaceC0969b
        public boolean b() {
            return true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0969b
        public Context a() {
            return this.f46175a.getContext();
        }

        @Override // androidx.appcompat.app.b.InterfaceC0969b
        public void c(Drawable drawable, int i10) {
            this.f46175a.setNavigationIcon(drawable);
            e(i10);
        }

        @Override // androidx.appcompat.app.b.InterfaceC0969b
        public Drawable d() {
            return this.f46176b;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0969b
        public void e(int i10) {
            if (i10 == 0) {
                this.f46175a.setNavigationContentDescription(this.f46177c);
            } else {
                this.f46175a.setNavigationContentDescription(i10);
            }
        }

        e(Toolbar toolbar) {
            this.f46175a = toolbar;
            this.f46176b = toolbar.getNavigationIcon();
            this.f46177c = toolbar.getNavigationContentDescription();
        }
    }

    public b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i10, int i11) {
        this(activity, toolbar, drawerLayout, null, i10, i11);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void b(View view) {
        j(0.0f);
        if (this.f46167f) {
            h(this.f46169h);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void c(int i10) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, C15076b c15076b, int i10, int i11) {
        this.f46165d = true;
        this.f46167f = true;
        this.f46172k = false;
        if (toolbar != null) {
            this.f46162a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.f46162a = ((c) activity).getDrawerToggleDelegate();
        } else {
            this.f46162a = new d(activity);
        }
        this.f46163b = drawerLayout;
        this.f46169h = i10;
        this.f46170i = i11;
        if (c15076b == null) {
            this.f46164c = new C15076b(this.f46162a.a());
        } else {
            this.f46164c = c15076b;
        }
        this.f46166e = e();
    }

    private void j(float f10) {
        if (f10 == 1.0f) {
            this.f46164c.g(true);
        } else if (f10 == 0.0f) {
            this.f46164c.g(false);
        }
        this.f46164c.e(f10);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void a(View view) {
        j(1.0f);
        if (this.f46167f) {
            h(this.f46170i);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void d(View view, float f10) {
        if (this.f46165d) {
            j(Math.min(1.0f, Math.max(0.0f, f10)));
        } else {
            j(0.0f);
        }
    }

    Drawable e() {
        return this.f46162a.d();
    }

    public void f(Configuration configuration) {
        if (!this.f46168g) {
            this.f46166e = e();
        }
        k();
    }

    public boolean g(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f46167f) {
            return false;
        }
        l();
        return true;
    }

    void h(int i10) {
        this.f46162a.e(i10);
    }

    void i(Drawable drawable, int i10) {
        if (!this.f46172k && !this.f46162a.b()) {
            FS.log_w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f46172k = true;
        }
        this.f46162a.c(drawable, i10);
    }

    public void k() {
        if (this.f46163b.E(8388611)) {
            j(1.0f);
        } else {
            j(0.0f);
        }
        if (this.f46167f) {
            i(this.f46164c, this.f46163b.E(8388611) ? this.f46170i : this.f46169h);
        }
    }

    void l() {
        int iS = this.f46163b.s(8388611);
        if (this.f46163b.H(8388611) && iS != 2) {
            this.f46163b.f(8388611);
        } else if (iS != 1) {
            this.f46163b.M(8388611);
        }
    }
}
