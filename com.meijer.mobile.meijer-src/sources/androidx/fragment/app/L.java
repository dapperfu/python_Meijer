package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.AbstractC6165l;

@Deprecated
/* loaded from: classes.dex */
public abstract class L extends androidx.viewpager.widget.a {

    /* renamed from: c, reason: collision with root package name */
    private final FragmentManager f55090c;

    /* renamed from: d, reason: collision with root package name */
    private final int f55091d;

    /* renamed from: e, reason: collision with root package name */
    private S f55092e;

    /* renamed from: f, reason: collision with root package name */
    private Fragment f55093f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f55094g;

    @Deprecated
    public L(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // androidx.viewpager.widget.a
    public void l(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable m() {
        return null;
    }

    public abstract Fragment t(int i10);

    public long u(int i10) {
        return i10;
    }

    public L(FragmentManager fragmentManager, int i10) {
        this.f55092e = null;
        this.f55093f = null;
        this.f55090c = fragmentManager;
        this.f55091d = i10;
    }

    private static String v(int i10, long j10) {
        return "android:switcher:" + i10 + ":" + j10;
    }

    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f55092e == null) {
            this.f55092e = this.f55090c.beginTransaction();
        }
        this.f55092e.m(fragment);
        if (fragment.equals(this.f55093f)) {
            this.f55093f = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void c(ViewGroup viewGroup) {
        S s10 = this.f55092e;
        if (s10 != null) {
            if (!this.f55094g) {
                try {
                    this.f55094g = true;
                    s10.k();
                } finally {
                    this.f55094g = false;
                }
            }
            this.f55092e = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public Object h(ViewGroup viewGroup, int i10) {
        if (this.f55092e == null) {
            this.f55092e = this.f55090c.beginTransaction();
        }
        long jU = u(i10);
        Fragment fragmentFindFragmentByTag = this.f55090c.findFragmentByTag(v(viewGroup.getId(), jU));
        if (fragmentFindFragmentByTag != null) {
            this.f55092e.g(fragmentFindFragmentByTag);
        } else {
            fragmentFindFragmentByTag = t(i10);
            this.f55092e.c(viewGroup.getId(), fragmentFindFragmentByTag, v(viewGroup.getId(), jU));
        }
        if (fragmentFindFragmentByTag != this.f55093f) {
            fragmentFindFragmentByTag.setMenuVisibility(false);
            if (this.f55091d == 1) {
                this.f55092e.w(fragmentFindFragmentByTag, AbstractC6165l.b.f55502d);
                return fragmentFindFragmentByTag;
            }
            fragmentFindFragmentByTag.setUserVisibleHint(false);
        }
        return fragmentFindFragmentByTag;
    }

    @Override // androidx.viewpager.widget.a
    public boolean i(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void o(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f55093f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f55091d == 1) {
                    if (this.f55092e == null) {
                        this.f55092e = this.f55090c.beginTransaction();
                    }
                    this.f55092e.w(this.f55093f, AbstractC6165l.b.f55502d);
                } else {
                    this.f55093f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f55091d == 1) {
                if (this.f55092e == null) {
                    this.f55092e = this.f55090c.beginTransaction();
                }
                this.f55092e.w(fragment, AbstractC6165l.b.f55503e);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f55093f = fragment;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void r(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
