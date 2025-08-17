package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.AbstractC6023l;
import com.fullstory.FS;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes.dex */
public abstract class P extends androidx.viewpager.widget.a {

    /* renamed from: c, reason: collision with root package name */
    private final FragmentManager f54894c;

    /* renamed from: d, reason: collision with root package name */
    private final int f54895d;

    /* renamed from: e, reason: collision with root package name */
    private S f54896e = null;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<Fragment.m> f54897f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private ArrayList<Fragment> f54898g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private Fragment f54899h = null;

    /* renamed from: i, reason: collision with root package name */
    private boolean f54900i;

    public abstract Fragment t(int i10);

    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f54896e == null) {
            this.f54896e = this.f54894c.beginTransaction();
        }
        while (this.f54897f.size() <= i10) {
            this.f54897f.add(null);
        }
        this.f54897f.set(i10, fragment.isAdded() ? this.f54894c.saveFragmentInstanceState(fragment) : null);
        this.f54898g.set(i10, null);
        this.f54896e.q(fragment);
        if (fragment.equals(this.f54899h)) {
            this.f54899h = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public void c(ViewGroup viewGroup) {
        S s10 = this.f54896e;
        if (s10 != null) {
            if (!this.f54900i) {
                try {
                    this.f54900i = true;
                    s10.k();
                } finally {
                    this.f54900i = false;
                }
            }
            this.f54896e = null;
        }
    }

    @Override // androidx.viewpager.widget.a
    public Object h(ViewGroup viewGroup, int i10) {
        Fragment.m mVar;
        Fragment fragment;
        if (this.f54898g.size() > i10 && (fragment = this.f54898g.get(i10)) != null) {
            return fragment;
        }
        if (this.f54896e == null) {
            this.f54896e = this.f54894c.beginTransaction();
        }
        Fragment fragmentT = t(i10);
        if (this.f54897f.size() > i10 && (mVar = this.f54897f.get(i10)) != null) {
            fragmentT.setInitialSavedState(mVar);
        }
        while (this.f54898g.size() <= i10) {
            this.f54898g.add(null);
        }
        fragmentT.setMenuVisibility(false);
        if (this.f54895d == 0) {
            fragmentT.setUserVisibleHint(false);
        }
        this.f54898g.set(i10, fragmentT);
        this.f54896e.b(viewGroup.getId(), fragmentT);
        if (this.f54895d == 1) {
            this.f54896e.w(fragmentT, AbstractC6023l.b.f55278d);
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
            this.f54897f.clear();
            this.f54898g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f54897f.add((Fragment.m) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i10 = Integer.parseInt(str.substring(1));
                    Fragment fragment = this.f54894c.getFragment(bundle, str);
                    if (fragment != null) {
                        while (this.f54898g.size() <= i10) {
                            this.f54898g.add(null);
                        }
                        fragment.setMenuVisibility(false);
                        this.f54898g.set(i10, fragment);
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
        if (this.f54897f.size() > 0) {
            bundle = new Bundle();
            Fragment.m[] mVarArr = new Fragment.m[this.f54897f.size()];
            this.f54897f.toArray(mVarArr);
            bundle.putParcelableArray("states", mVarArr);
        } else {
            bundle = null;
        }
        for (int i10 = 0; i10 < this.f54898g.size(); i10++) {
            Fragment fragment = this.f54898g.get(i10);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f54894c.putFragment(bundle, "f" + i10, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.a
    public void o(ViewGroup viewGroup, int i10, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f54899h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.f54895d == 1) {
                    if (this.f54896e == null) {
                        this.f54896e = this.f54894c.beginTransaction();
                    }
                    this.f54896e.w(this.f54899h, AbstractC6023l.b.f55278d);
                } else {
                    this.f54899h.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.f54895d == 1) {
                if (this.f54896e == null) {
                    this.f54896e = this.f54894c.beginTransaction();
                }
                this.f54896e.w(fragment, AbstractC6023l.b.f55279e);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.f54899h = fragment;
        }
    }

    public P(FragmentManager fragmentManager, int i10) {
        this.f54894c = fragmentManager;
        this.f54895d = i10;
    }

    @Override // androidx.viewpager.widget.a
    public void r(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }
}
