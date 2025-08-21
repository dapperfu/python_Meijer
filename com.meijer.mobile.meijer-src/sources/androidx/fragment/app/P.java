package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.AbstractC6165l;
import com.fullstory.FS;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes.dex */
public abstract class P extends androidx.viewpager.widget.a {

    /* renamed from: c, reason: collision with root package name */
    private final FragmentManager f55118c;

    /* renamed from: d, reason: collision with root package name */
    private final int f55119d;

    /* renamed from: e, reason: collision with root package name */
    private S f55120e = null;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<Fragment.m> f55121f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<Fragment> f55122g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private Fragment f55123h = null;

    /* renamed from: i, reason: collision with root package name */
    private boolean f55124i;

    public abstract Fragment t(int i10);

    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f55120e == null) {
            this.f55120e = this.f55118c.beginTransaction();
        }
        while (this.f55121f.size() <= i10) {
            this.f55121f.add(null);
        }
        this.f55121f.set(i10, fragment.isAdded() ? this.f55118c.saveFragmentInstanceState(fragment) : null);
        this.f55122g.set(i10, null);
        this.f55120e.q(fragment);
        if (fragment.equals(this.f55123h)) {
            this.f55123h = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void c(ViewGroup viewGroup) {
        S s10 = this.f55120e;
        if (s10 != null) {
            if (!this.f55124i) {
                try {
                    this.f55124i = true;
                    s10.k();
                } finally {
                    this.f55124i = false;
                }
            }
            this.f55120e = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public Object h(ViewGroup viewGroup, int i10) {
        Fragment.m mVar;
        Fragment fragment;
        if (this.f55122g.size() > i10 && (fragment = this.f55122g.get(i10)) != null) {
            return fragment;
        }
        if (this.f55120e == null) {
            this.f55120e = this.f55118c.beginTransaction();
        }
        Fragment fragmentT = t(i10);
        if (this.f55121f.size() > i10 && (mVar = this.f55121f.get(i10)) != null) {
            fragmentT.setInitialSavedState(mVar);
        }
        while (this.f55122g.size() <= i10) {
            this.f55122g.add(null);
        }
        fragmentT.setMenuVisibility(false);
        if (this.f55119d == 0) {
            fragmentT.setUserVisibleHint(false);
        }
        this.f55122g.set(i10, fragmentT);
        this.f55120e.b(viewGroup.getId(), fragmentT);
        if (this.f55119d == 1) {
            this.f55120e.w(fragmentT, AbstractC6165l.b.f55502d);
        }
        return fragmentT;
    }

    @Override // androidx.viewpager.widget.a
    public boolean i(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.a
    public void l(Parcelable parcelable, ClassLoader classLoader) throws NumberFormatException {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f55121f.clear();
            this.f55122g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f55121f.add((Fragment.m) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i10 = Integer.parseInt(str.substring(1));
                    Fragment fragment = this.f55118c.getFragment(bundle, str);
                    if (fragment != null) {
                        while (this.f55122g.size() <= i10) {
                            this.f55122g.add(null);
                        }
                        fragment.setMenuVisibility(false);
                        this.f55122g.set(i10, fragment);
                    } else {
                        FS.log_w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.a
    public Parcelable m() {
        Bundle bundle;
        if (this.f55121f.size() > 0) {
            bundle = new Bundle();
            Fragment.m[] mVarArr = new Fragment.m[this.f55121f.size()];
            this.f55121f.toArray(mVarArr);
            bundle.putParcelableArray("states", mVarArr);
        } else {
            bundle = null;
        }
        for (int i10 = 0; i10 < this.f55122g.size(); i10++) {
            Fragment fragment = this.f55122g.get(i10);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f55118c.putFragment(bundle, "f" + i10, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.a
    public void o(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f55123h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f55119d == 1) {
                    if (this.f55120e == null) {
                        this.f55120e = this.f55118c.beginTransaction();
                    }
                    this.f55120e.w(this.f55123h, AbstractC6165l.b.f55502d);
                } else {
                    this.f55123h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f55119d == 1) {
                if (this.f55120e == null) {
                    this.f55120e = this.f55118c.beginTransaction();
                }
                this.f55120e.w(fragment, AbstractC6165l.b.f55503e);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f55123h = fragment;
        }
    }

    public P(FragmentManager fragmentManager, int i10) {
        this.f55118c = fragmentManager;
        this.f55119d = i10;
    }

    @Override // androidx.viewpager.widget.a
    public void r(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
