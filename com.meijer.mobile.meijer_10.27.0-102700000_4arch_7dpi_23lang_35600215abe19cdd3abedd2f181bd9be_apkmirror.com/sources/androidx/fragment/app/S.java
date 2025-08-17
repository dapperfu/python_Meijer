package androidx.fragment.app;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.view.AbstractC6023l;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class S {

    /* renamed from: a, reason: collision with root package name */
    private final C5981w f54905a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f54906b;

    /* renamed from: c, reason: collision with root package name */
    ArrayList<a> f54907c;

    /* renamed from: d, reason: collision with root package name */
    int f54908d;

    /* renamed from: e, reason: collision with root package name */
    int f54909e;

    /* renamed from: f, reason: collision with root package name */
    int f54910f;

    /* renamed from: g, reason: collision with root package name */
    int f54911g;

    /* renamed from: h, reason: collision with root package name */
    int f54912h;

    /* renamed from: i, reason: collision with root package name */
    boolean f54913i;

    /* renamed from: j, reason: collision with root package name */
    boolean f54914j;

    /* renamed from: k, reason: collision with root package name */
    String f54915k;

    /* renamed from: l, reason: collision with root package name */
    int f54916l;

    /* renamed from: m, reason: collision with root package name */
    CharSequence f54917m;

    /* renamed from: n, reason: collision with root package name */
    int f54918n;

    /* renamed from: o, reason: collision with root package name */
    CharSequence f54919o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList<String> f54920p;

    /* renamed from: q, reason: collision with root package name */
    ArrayList<String> f54921q;

    /* renamed from: r, reason: collision with root package name */
    boolean f54922r;

    /* renamed from: s, reason: collision with root package name */
    ArrayList<Runnable> f54923s;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f54924a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f54925b;

        /* renamed from: c, reason: collision with root package name */
        boolean f54926c;

        /* renamed from: d, reason: collision with root package name */
        int f54927d;

        /* renamed from: e, reason: collision with root package name */
        int f54928e;

        /* renamed from: f, reason: collision with root package name */
        int f54929f;

        /* renamed from: g, reason: collision with root package name */
        int f54930g;

        /* renamed from: h, reason: collision with root package name */
        AbstractC6023l.b f54931h;

        /* renamed from: i, reason: collision with root package name */
        AbstractC6023l.b f54932i;

        a() {
        }

        a(int i10, Fragment fragment) {
            this.f54924a = i10;
            this.f54925b = fragment;
            this.f54926c = false;
            AbstractC6023l.b bVar = AbstractC6023l.b.f55279e;
            this.f54931h = bVar;
            this.f54932i = bVar;
        }

        a(int i10, Fragment fragment, boolean z10) {
            this.f54924a = i10;
            this.f54925b = fragment;
            this.f54926c = z10;
            AbstractC6023l.b bVar = AbstractC6023l.b.f55279e;
            this.f54931h = bVar;
            this.f54932i = bVar;
        }

        a(int i10, Fragment fragment, AbstractC6023l.b bVar) {
            this.f54924a = i10;
            this.f54925b = fragment;
            this.f54926c = false;
            this.f54931h = fragment.mMaxState;
            this.f54932i = bVar;
        }

        a(a aVar) {
            this.f54924a = aVar.f54924a;
            this.f54925b = aVar.f54925b;
            this.f54926c = aVar.f54926c;
            this.f54927d = aVar.f54927d;
            this.f54928e = aVar.f54928e;
            this.f54929f = aVar.f54929f;
            this.f54930g = aVar.f54930g;
            this.f54931h = aVar.f54931h;
            this.f54932i = aVar.f54932i;
        }
    }

    S(C5981w c5981w, ClassLoader classLoader) {
        this.f54907c = new ArrayList<>();
        this.f54914j = true;
        this.f54922r = false;
        this.f54905a = c5981w;
        this.f54906b = classLoader;
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
        C5981w c5981w = this.f54905a;
        if (c5981w == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.f54906b;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment fragmentInstantiate = c5981w.instantiate(classLoader, cls.getName());
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
        this.f54907c.add(aVar);
        aVar.f54927d = this.f54908d;
        aVar.f54928e = this.f54909e;
        aVar.f54929f = this.f54910f;
        aVar.f54930g = this.f54911g;
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
        if (this.f54913i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f54914j = false;
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
        if (this.f54923s == null) {
            this.f54923s = new ArrayList<>();
        }
        this.f54923s.add(runnable);
        return this;
    }

    public S w(Fragment fragment, AbstractC6023l.b bVar) {
        f(new a(10, fragment, bVar));
        return this;
    }

    public S x(boolean z10) {
        this.f54922r = z10;
        return this;
    }

    public final S u(int i10, Class<? extends Fragment> cls, Bundle bundle, String str) {
        return s(i10, l(cls, bundle), str);
    }

    S(C5981w c5981w, ClassLoader classLoader, S s10) {
        this(c5981w, classLoader);
        Iterator<a> it = s10.f54907c.iterator();
        while (it.hasNext()) {
            this.f54907c.add(new a(it.next()));
        }
        this.f54908d = s10.f54908d;
        this.f54909e = s10.f54909e;
        this.f54910f = s10.f54910f;
        this.f54911g = s10.f54911g;
        this.f54912h = s10.f54912h;
        this.f54913i = s10.f54913i;
        this.f54914j = s10.f54914j;
        this.f54915k = s10.f54915k;
        this.f54918n = s10.f54918n;
        this.f54919o = s10.f54919o;
        this.f54916l = s10.f54916l;
        this.f54917m = s10.f54917m;
        if (s10.f54920p != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f54920p = arrayList;
            arrayList.addAll(s10.f54920p);
        }
        if (s10.f54921q != null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            this.f54921q = arrayList2;
            arrayList2.addAll(s10.f54921q);
        }
        this.f54922r = s10.f54922r;
    }
}
