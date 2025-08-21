package androidx.fragment.app;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.view.AbstractC6165l;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    private final C6123w f55129a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f55130b;

    /* renamed from: c, reason: collision with root package name */
    ArrayList<a> f55131c;

    /* renamed from: d, reason: collision with root package name */
    int f55132d;

    /* renamed from: e, reason: collision with root package name */
    int f55133e;

    /* renamed from: f, reason: collision with root package name */
    int f55134f;

    /* renamed from: g, reason: collision with root package name */
    int f55135g;

    /* renamed from: h, reason: collision with root package name */
    int f55136h;

    /* renamed from: i, reason: collision with root package name */
    boolean f55137i;

    /* renamed from: j, reason: collision with root package name */
    boolean f55138j;

    /* renamed from: k, reason: collision with root package name */
    String f55139k;

    /* renamed from: l, reason: collision with root package name */
    int f55140l;

    /* renamed from: m, reason: collision with root package name */
    CharSequence f55141m;

    /* renamed from: n, reason: collision with root package name */
    int f55142n;

    /* renamed from: o, reason: collision with root package name */
    CharSequence f55143o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList<String> f55144p;

    /* renamed from: q, reason: collision with root package name */
    ArrayList<String> f55145q;

    /* renamed from: r, reason: collision with root package name */
    boolean f55146r;

    /* renamed from: s, reason: collision with root package name */
    ArrayList<Runnable> f55147s;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f55148a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f55149b;

        /* renamed from: c, reason: collision with root package name */
        boolean f55150c;

        /* renamed from: d, reason: collision with root package name */
        int f55151d;

        /* renamed from: e, reason: collision with root package name */
        int f55152e;

        /* renamed from: f, reason: collision with root package name */
        int f55153f;

        /* renamed from: g, reason: collision with root package name */
        int f55154g;

        /* renamed from: h, reason: collision with root package name */
        AbstractC6165l.b f55155h;

        /* renamed from: i, reason: collision with root package name */
        AbstractC6165l.b f55156i;

        a() {
        }

        a(int i10, Fragment fragment) {
            this.f55148a = i10;
            this.f55149b = fragment;
            this.f55150c = false;
            AbstractC6165l.b bVar = AbstractC6165l.b.f55503e;
            this.f55155h = bVar;
            this.f55156i = bVar;
        }

        a(int i10, Fragment fragment, boolean z10) {
            this.f55148a = i10;
            this.f55149b = fragment;
            this.f55150c = z10;
            AbstractC6165l.b bVar = AbstractC6165l.b.f55503e;
            this.f55155h = bVar;
            this.f55156i = bVar;
        }

        a(int i10, Fragment fragment, AbstractC6165l.b bVar) {
            this.f55148a = i10;
            this.f55149b = fragment;
            this.f55150c = false;
            this.f55155h = fragment.mMaxState;
            this.f55156i = bVar;
        }

        a(a aVar) {
            this.f55148a = aVar.f55148a;
            this.f55149b = aVar.f55149b;
            this.f55150c = aVar.f55150c;
            this.f55151d = aVar.f55151d;
            this.f55152e = aVar.f55152e;
            this.f55153f = aVar.f55153f;
            this.f55154g = aVar.f55154g;
            this.f55155h = aVar.f55155h;
            this.f55156i = aVar.f55156i;
        }
    }

    S(C6123w c6123w, ClassLoader classLoader) {
        this.f55131c = new ArrayList<>();
        this.f55138j = true;
        this.f55146r = false;
        this.f55129a = c6123w;
        this.f55130b = classLoader;
    }

    public S b(int i10, Fragment fragment) {
        o(i10, fragment, null, 1);
        return this;
    }

    public S c(int i10, Fragment fragment, String str) {
        o(i10, fragment, str, 1);
        return this;
    }

    public S e(Fragment fragment, String str) {
        o(0, fragment, str, 1);
        return this;
    }

    public abstract int h();

    public abstract int i();

    public abstract void j();

    public abstract void k();

    public abstract boolean p();

    public S r(int i10, Fragment fragment) {
        return s(i10, fragment, null);
    }

    public final S t(int i10, Class<? extends Fragment> cls, Bundle bundle) {
        return u(i10, cls, bundle, null);
    }

    private Fragment l(Class<? extends Fragment> cls, Bundle bundle) {
        C6123w c6123w = this.f55129a;
        if (c6123w == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.f55130b;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment fragmentInstantiate = c6123w.instantiate(classLoader, cls.getName());
        if (bundle != null) {
            fragmentInstantiate.setArguments(bundle);
        }
        return fragmentInstantiate;
    }

    public final S d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        fragment.mInDynamicContainer = true;
        return c(viewGroup.getId(), fragment, str);
    }

    void f(a aVar) {
        this.f55131c.add(aVar);
        aVar.f55151d = this.f55132d;
        aVar.f55152e = this.f55133e;
        aVar.f55153f = this.f55134f;
        aVar.f55154g = this.f55135g;
    }

    public S g(Fragment fragment) {
        f(new a(7, fragment));
        return this;
    }

    public S m(Fragment fragment) {
        f(new a(6, fragment));
        return this;
    }

    public S n() {
        if (this.f55137i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f55138j = false;
        return this;
    }

    void o(int i10, Fragment fragment, String str, int i11) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            L2.b.f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
            }
            fragment.mFragmentId = i10;
            fragment.mContainerId = i10;
        }
        f(new a(i11, fragment));
    }

    public S q(Fragment fragment) {
        f(new a(3, fragment));
        return this;
    }

    public S s(int i10, Fragment fragment, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        o(i10, fragment, str, 2);
        return this;
    }

    S v(boolean z10, Runnable runnable) {
        if (!z10) {
            n();
        }
        if (this.f55147s == null) {
            this.f55147s = new ArrayList<>();
        }
        this.f55147s.add(runnable);
        return this;
    }

    public S w(Fragment fragment, AbstractC6165l.b bVar) {
        f(new a(10, fragment, bVar));
        return this;
    }

    public S x(boolean z10) {
        this.f55146r = z10;
        return this;
    }

    public final S u(int i10, Class<? extends Fragment> cls, Bundle bundle, String str) {
        return s(i10, l(cls, bundle), str);
    }

    S(C6123w c6123w, ClassLoader classLoader, S s10) {
        this(c6123w, classLoader);
        Iterator<a> it = s10.f55131c.iterator();
        while (it.hasNext()) {
            this.f55131c.add(new a(it.next()));
        }
        this.f55132d = s10.f55132d;
        this.f55133e = s10.f55133e;
        this.f55134f = s10.f55134f;
        this.f55135g = s10.f55135g;
        this.f55136h = s10.f55136h;
        this.f55137i = s10.f55137i;
        this.f55138j = s10.f55138j;
        this.f55139k = s10.f55139k;
        this.f55142n = s10.f55142n;
        this.f55143o = s10.f55143o;
        this.f55140l = s10.f55140l;
        this.f55141m = s10.f55141m;
        if (s10.f55144p != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f55144p = arrayList;
            arrayList.addAll(s10.f55144p);
        }
        if (s10.f55145q != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f55145q = arrayList2;
            arrayList2.addAll(s10.f55145q);
        }
        this.f55146r = s10.f55146r;
    }
}
