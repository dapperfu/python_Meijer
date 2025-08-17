package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.fullstory.FS;
import j7.InterfaceC14873c;
import j7.o;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k7.AbstractC15111a;
import k7.C15114d;
import k7.InterfaceC15112b;
import m7.C15572g;
import m7.InterfaceC15571f;

/* loaded from: classes4.dex */
public class b implements ComponentCallbacks2 {

    /* renamed from: k, reason: collision with root package name */
    private static volatile b f63653k;

    /* renamed from: l, reason: collision with root package name */
    private static volatile boolean f63654l;

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.j f63655a;

    /* renamed from: b, reason: collision with root package name */
    private final Y6.d f63656b;

    /* renamed from: c, reason: collision with root package name */
    private final Z6.h f63657c;

    /* renamed from: d, reason: collision with root package name */
    private final d f63658d;

    /* renamed from: e, reason: collision with root package name */
    private final Y6.b f63659e;

    /* renamed from: f, reason: collision with root package name */
    private final o f63660f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC14873c f63661g;

    /* renamed from: i, reason: collision with root package name */
    private final a f63663i;

    /* renamed from: h, reason: collision with root package name */
    private final List<k> f63662h = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private f f63664j = f.NORMAL;

    public interface a {
        C15572g build();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f63654l) {
            throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
        }
        f63654l = true;
        try {
            m(context, generatedAppGlideModule);
        } finally {
            f63654l = false;
        }
    }

    public static b c(Context context) {
        if (f63653k == null) {
            GeneratedAppGlideModule generatedAppGlideModuleD = d(context.getApplicationContext());
            synchronized (b.class) {
                try {
                    if (f63653k == null) {
                        a(context, generatedAppGlideModuleD);
                    }
                } finally {
                }
            }
        }
        return f63653k;
    }

    private static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            FS.log_w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (IllegalAccessException e10) {
            q(e10);
            return null;
        } catch (InstantiationException e11) {
            q(e11);
            return null;
        } catch (NoSuchMethodException e12) {
            q(e12);
            return null;
        } catch (InvocationTargetException e13) {
            q(e13);
            return null;
        }
    }

    private static o l(Context context) {
        p7.k.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c(context).k();
    }

    private static void m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        n(context, new c(), generatedAppGlideModule);
    }

    private static void q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public Y6.b e() {
        return this.f63659e;
    }

    public Y6.d f() {
        return this.f63656b;
    }

    InterfaceC14873c g() {
        return this.f63661g;
    }

    public Context h() {
        return this.f63658d.getBaseContext();
    }

    d i() {
        return this.f63658d;
    }

    public Registry j() {
        return this.f63658d.i();
    }

    public o k() {
        return this.f63660f;
    }

    void o(k kVar) {
        synchronized (this.f63662h) {
            try {
                if (this.f63662h.contains(kVar)) {
                    throw new IllegalStateException("Cannot register already registered manager");
                }
                this.f63662h.add(kVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean p(com.bumptech.glide.request.target.j<?> jVar) {
        synchronized (this.f63662h) {
            try {
                Iterator<k> it = this.f63662h.iterator();
                while (it.hasNext()) {
                    if (it.next().p(jVar)) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void s(k kVar) {
        synchronized (this.f63662h) {
            try {
                if (!this.f63662h.contains(kVar)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.f63662h.remove(kVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    b(Context context, com.bumptech.glide.load.engine.j jVar, Z6.h hVar, Y6.d dVar, Y6.b bVar, o oVar, InterfaceC14873c interfaceC14873c, int i10, a aVar, Map<Class<?>, l<?, ?>> map, List<InterfaceC15571f<Object>> list, List<InterfaceC15112b> list2, AbstractC15111a abstractC15111a, e eVar) {
        this.f63655a = jVar;
        this.f63656b = dVar;
        this.f63659e = bVar;
        this.f63657c = hVar;
        this.f63660f = oVar;
        this.f63661g = interfaceC14873c;
        this.f63663i = aVar;
        this.f63658d = new d(context, bVar, i.d(this, list2, abstractC15111a), new com.bumptech.glide.request.target.g(), aVar, map, list, jVar, eVar, i10);
    }

    private static void n(Context context, c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        o.b bVarE;
        Context applicationContext = context.getApplicationContext();
        List<InterfaceC15112b> listB = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            listB = new C15114d(applicationContext).b();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> setD = generatedAppGlideModule.d();
            Iterator<InterfaceC15112b> it = listB.iterator();
            while (it.hasNext()) {
                InterfaceC15112b next = it.next();
                if (setD.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        FS.log_d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<InterfaceC15112b> it2 = listB.iterator();
            while (it2.hasNext()) {
                FS.log_d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        if (generatedAppGlideModule != null) {
            bVarE = generatedAppGlideModule.e();
        } else {
            bVarE = null;
        }
        cVar.b(bVarE);
        Iterator<InterfaceC15112b> it3 = listB.iterator();
        while (it3.hasNext()) {
            it3.next().a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, cVar);
        }
        b bVarA = cVar.a(applicationContext, listB, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(bVarA);
        f63653k = bVarA;
    }

    public static k t(Context context) {
        return l(context).d(context);
    }

    public static k u(Fragment fragment) {
        return l(fragment.getContext()).e(fragment);
    }

    public static k v(FragmentActivity fragmentActivity) {
        return l(fragmentActivity).f(fragmentActivity);
    }

    public void b() {
        p7.l.a();
        this.f63657c.b();
        this.f63656b.b();
        this.f63659e.b();
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        r(i10);
    }

    public void r(int i10) {
        p7.l.a();
        synchronized (this.f63662h) {
            try {
                Iterator<k> it = this.f63662h.iterator();
                while (it.hasNext()) {
                    it.next().onTrimMemory(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f63657c.a(i10);
        this.f63656b.a(i10);
        this.f63659e.a(i10);
    }
}
