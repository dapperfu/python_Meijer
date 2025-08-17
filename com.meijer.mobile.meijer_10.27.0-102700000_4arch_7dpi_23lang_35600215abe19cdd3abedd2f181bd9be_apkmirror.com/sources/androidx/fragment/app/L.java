package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.view.AbstractC6023l;

@Deprecated
/* loaded from: classes.dex */
public abstract class L extends androidx.viewpager.widget.a {

    /* renamed from: c, reason: collision with root package name */
    private final FragmentManager f54866c;

    /* renamed from: d, reason: collision with root package name */
    private final int f54867d;

    /* renamed from: e, reason: collision with root package name */
    private S f54868e;

    /* renamed from: f, reason: collision with root package name */
    private Fragment f54869f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f54870g;

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
        this.f54868e = null;
        this.f54869f = null;
        this.f54866c = fragmentManager;
        this.f54867d = i10;
    }

    private static String v(int i10, long j10) {
        return "android:switcher:" + i10 + ":" + j10;
    }

    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f54868e == null) {
            this.f54868e = this.f54866c.beginTransaction();
        }
        this.f54868e.m(fragment);
        if (fragment.equals(this.f54869f)) {
            this.f54869f = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void c(ViewGroup viewGroup) {
        S s10 = this.f54868e;
        if (s10 != null) {
            if (!this.f54870g) {
                try {
                    this.f54870g = true;
                    s10.k();
                } finally {
                    this.f54870g = false;
                }
            }
            this.f54868e = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public Object h(ViewGroup viewGroup, int i10) {
        if (this.f54868e == null) {
            this.f54868e = this.f54866c.beginTransaction();
        }
        long jU = u(i10);
        Fragment fragmentFindFragmentByTag = this.f54866c.findFragmentByTag(v(viewGroup.getId(), jU));
        if (fragmentFindFragmentByTag != null) {
            this.f54868e.g(fragmentFindFragmentByTag);
        } else {
            fragmentFindFragmentByTag = t(i10);
            this.f54868e.c(viewGroup.getId(), fragmentFindFragmentByTag, v(viewGroup.getId(), jU));
        }
        if (fragmentFindFragmentByTag != this.f54869f) {
            fragmentFindFragmentByTag.setMenuVisibility(false);
            if (this.f54867d == 1) {
                this.f54868e.w(fragmentFindFragmentByTag, AbstractC6023l.b.f55278d);
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
        Fragment fragment2 = this.f54869f;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f54867d == 1) {
                    if (this.f54868e == null) {
                        this.f54868e = this.f54866c.beginTransaction();
                    }
                    this.f54868e.w(this.f54869f, AbstractC6023l.b.f55278d);
                } else {
                    this.f54869f.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f54867d == 1) {
                if (this.f54868e == null) {
                    this.f54868e = this.f54866c.beginTransaction();
                }
                this.f54868e.w(fragment, AbstractC6023l.b.f55279e);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f54869f = fragment;
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
