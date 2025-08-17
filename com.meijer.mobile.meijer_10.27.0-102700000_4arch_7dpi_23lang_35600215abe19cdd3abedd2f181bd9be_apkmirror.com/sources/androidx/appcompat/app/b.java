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
import k.C15085b;

/* loaded from: classes.dex */
public class b implements DrawerLayout.d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0956b f45938a;

    /* renamed from: b, reason: collision with root package name */
    private final DrawerLayout f45939b;

    /* renamed from: c, reason: collision with root package name */
    private C15085b f45940c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f45941d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f45942e;

    /* renamed from: f, reason: collision with root package name */
    boolean f45943f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f45944g;

    /* renamed from: h, reason: collision with root package name */
    private final int f45945h;

    /* renamed from: i, reason: collision with root package name */
    private final int f45946i;

    /* renamed from: j, reason: collision with root package name */
    View.OnClickListener f45947j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f45948k;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b bVar = b.this;
            if (bVar.f45943f) {
                bVar.l();
                return;
            }
            View.OnClickListener onClickListener = bVar.f45947j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.b$b, reason: collision with other inner class name */
    public interface InterfaceC0956b {
        Context a();

        boolean b();

        void c(Drawable drawable, int i10);

        Drawable d();

        void e(int i10);
    }

    public interface c {
        InterfaceC0956b getDrawerToggleDelegate();
    }

    private static class d implements InterfaceC0956b {

        /* renamed from: a, reason: collision with root package name */
        private final Activity f45950a;

        /* JADX WARN: Multi-variable type inference failed */
        public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
            return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
        }

        @Override // androidx.appcompat.app.b.InterfaceC0956b
        public Context a() {
            ActionBar actionBar = this.f45950a.getActionBar();
            return actionBar != null ? actionBar.getThemedContext() : this.f45950a;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0956b
        public boolean b() {
            ActionBar actionBar = this.f45950a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0956b
        public void c(Drawable drawable, int i10) {
            ActionBar actionBar = this.f45950a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeAsUpIndicator(drawable);
                actionBar.setHomeActionContentDescription(i10);
            }
        }

        @Override // androidx.appcompat.app.b.InterfaceC0956b
        public void e(int i10) {
            ActionBar actionBar = this.f45950a.getActionBar();
            if (actionBar != null) {
                actionBar.setHomeActionContentDescription(i10);
            }
        }

        d(Activity activity) {
            this.f45950a = activity;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0956b
        public Drawable d() {
            TypedArray typedArrayObtainStyledAttributes = a().obtainStyledAttributes(null, new int[]{R.attr.homeAsUpIndicator}, R.attr.actionBarStyle, 0);
            Drawable drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160 = __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, 0);
            typedArrayObtainStyledAttributes.recycle();
            return drawable__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160;
        }
    }

    static class e implements InterfaceC0956b {

        /* renamed from: a, reason: collision with root package name */
        final Toolbar f45951a;

        /* renamed from: b, reason: collision with root package name */
        final Drawable f45952b;

        /* renamed from: c, reason: collision with root package name */
        final CharSequence f45953c;

        @Override // androidx.appcompat.app.b.InterfaceC0956b
        public boolean b() {
            return true;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0956b
        public Context a() {
            return this.f45951a.getContext();
        }

        @Override // androidx.appcompat.app.b.InterfaceC0956b
        public void c(Drawable drawable, int i10) {
            this.f45951a.setNavigationIcon(drawable);
            e(i10);
        }

        @Override // androidx.appcompat.app.b.InterfaceC0956b
        public Drawable d() {
            return this.f45952b;
        }

        @Override // androidx.appcompat.app.b.InterfaceC0956b
        public void e(int i10) {
            if (i10 == 0) {
                this.f45951a.setNavigationContentDescription(this.f45953c);
            } else {
                this.f45951a.setNavigationContentDescription(i10);
            }
        }

        e(Toolbar toolbar) {
            this.f45951a = toolbar;
            this.f45952b = toolbar.getNavigationIcon();
            this.f45953c = toolbar.getNavigationContentDescription();
        }
    }

    public b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar, int i10, int i11) {
        this(activity, toolbar, drawerLayout, null, i10, i11);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void b(View view) {
        j(0.0f);
        if (this.f45943f) {
            h(this.f45945h);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void c(int i10) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    b(Activity activity, Toolbar toolbar, DrawerLayout drawerLayout, C15085b c15085b, int i10, int i11) {
        this.f45941d = true;
        this.f45943f = true;
        this.f45948k = false;
        if (toolbar != null) {
            this.f45938a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.f45938a = ((c) activity).getDrawerToggleDelegate();
        } else {
            this.f45938a = new d(activity);
        }
        this.f45939b = drawerLayout;
        this.f45945h = i10;
        this.f45946i = i11;
        if (c15085b == null) {
            this.f45940c = new C15085b(this.f45938a.a());
        } else {
            this.f45940c = c15085b;
        }
        this.f45942e = e();
    }

    private void j(float f10) {
        if (f10 == 1.0f) {
            this.f45940c.g(true);
        } else if (f10 == 0.0f) {
            this.f45940c.g(false);
        }
        this.f45940c.e(f10);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void a(View view) {
        j(1.0f);
        if (this.f45943f) {
            h(this.f45946i);
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout.d
    public void d(View view, float f10) {
        if (this.f45941d) {
            j(Math.min(1.0f, Math.max(0.0f, f10)));
        } else {
            j(0.0f);
        }
    }

    Drawable e() {
        return this.f45938a.d();
    }

    public void f(Configuration configuration) {
        if (!this.f45944g) {
            this.f45942e = e();
        }
        k();
    }

    public boolean g(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332 || !this.f45943f) {
            return false;
        }
        l();
        return true;
    }

    void h(int i10) {
        this.f45938a.e(i10);
    }

    void i(Drawable drawable, int i10) {
        if (!this.f45948k && !this.f45938a.b()) {
            FS.log_w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.f45948k = true;
        }
        this.f45938a.c(drawable, i10);
    }

    public void k() {
        if (this.f45939b.E(8388611)) {
            j(1.0f);
        } else {
            j(0.0f);
        }
        if (this.f45943f) {
            i(this.f45940c, this.f45939b.E(8388611) ? this.f45946i : this.f45945h);
        }
    }

    void l() {
        int iS = this.f45939b.s(8388611);
        if (this.f45939b.H(8388611) && iS != 2) {
            this.f45939b.f(8388611);
        } else if (iS != 1) {
            this.f45939b.M(8388611);
        }
    }
}
