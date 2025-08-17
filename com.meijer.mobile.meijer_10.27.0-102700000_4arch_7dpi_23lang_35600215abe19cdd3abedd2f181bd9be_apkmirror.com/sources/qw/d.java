package qw;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import sw.j;
import sw.m;
import sw.o;
import sw.q;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    static volatile int f157705a;

    /* renamed from: e, reason: collision with root package name */
    static volatile tw.b f157709e;

    /* renamed from: b, reason: collision with root package name */
    static final o f157706b = new o();

    /* renamed from: c, reason: collision with root package name */
    static final j f157707c = new j();

    /* renamed from: d, reason: collision with root package name */
    static boolean f157708d = q.c("slf4j.detectLoggerNameMismatch");

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f157710f = {"2.0"};

    static void e(Throwable th2) {
        f157705a = 2;
        q.b("Failed to instantiate SLF4J LoggerFactory", th2);
    }

    private static void c(int i10) {
        q.a("A number (" + i10 + ") of logging calls during the initialization phase have been intercepted and are");
        q.a("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        q.a("See also https://www.slf4j.org/codes.html#replay");
    }

    private static void d() {
        q.a("The following set of substitute loggers may have been accessed");
        q.a("during the initialization phase. Logging calls during this");
        q.a("phase were not honored. However, subsequent logging calls to these");
        q.a("loggers will work as normally expected.");
        q.a("See also https://www.slf4j.org/codes.html#substituteLogger");
    }

    static Set<URL> f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = d.class.getClassLoader();
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
            return linkedHashSet;
        } catch (IOException e10) {
            q.b("Error getting resources from path", e10);
            return linkedHashSet;
        }
    }

    private static List<tw.b> g() {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(tw.b.class);
        ArrayList arrayList = new ArrayList();
        Iterator it = serviceLoaderLoad.iterator();
        while (it.hasNext()) {
            arrayList.add((tw.b) it.next());
        }
        return arrayList;
    }

    private static void h() {
        o oVar = f157706b;
        synchronized (oVar) {
            try {
                oVar.d().e();
                for (m mVar : oVar.d().d()) {
                    mVar.y(j(mVar.t()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static tw.b k() {
        if (f157705a == 0) {
            synchronized (d.class) {
                try {
                    if (f157705a == 0) {
                        f157705a = 1;
                        m();
                    }
                } finally {
                }
            }
        }
        int i10 = f157705a;
        if (i10 == 1) {
            return f157706b;
        }
        if (i10 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i10 == 3) {
            return f157709e;
        }
        if (i10 == 4) {
            return f157707c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    private static void o() {
        LinkedBlockingQueue<rw.d> linkedBlockingQueueC = f157706b.d().c();
        int size = linkedBlockingQueueC.size();
        ArrayList<rw.d> arrayList = new ArrayList(128);
        int i10 = 0;
        while (linkedBlockingQueueC.drainTo(arrayList, 128) != 0) {
            for (rw.d dVar : arrayList) {
                p(dVar);
                int i11 = i10 + 1;
                if (i10 == 0) {
                    b(dVar, size);
                }
                i10 = i11;
            }
            arrayList.clear();
        }
    }

    private static void p(rw.d dVar) {
        if (dVar == null) {
            return;
        }
        m mVarB = dVar.b();
        String strT = mVarB.t();
        if (mVarB.w()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (mVarB.v()) {
            return;
        }
        if (mVarB.u()) {
            mVarB.x(dVar);
        } else {
            q.a(strT);
        }
    }

    private static final void t() {
        try {
            String strC = f157709e.c();
            boolean z10 = false;
            for (String str : f157710f) {
                if (strC.startsWith(str)) {
                    z10 = true;
                }
            }
            if (z10) {
                return;
            }
            q.a("The requested version " + strC + " by your slf4j binding is not compatible with " + Arrays.asList(f157710f).toString());
            q.a("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th2) {
            q.b("Unexpected problem occured during version sanity check", th2);
        }
    }

    private d() {
    }

    private static final void a() {
        try {
            List<tw.b> listG = g();
            s(listG);
            if (listG != null && !listG.isEmpty()) {
                f157709e = listG.get(0);
                f157709e.b();
                f157705a = 3;
                q(listG);
            } else {
                f157705a = 4;
                q.a("No SLF4J providers were found.");
                q.a("Defaulting to no-operation (NOP) logger implementation");
                q.a("See https://www.slf4j.org/codes.html#noProviders for further details.");
                r(f());
            }
            n();
        } catch (Exception e10) {
            e(e10);
            throw new IllegalStateException("Unexpected initialization failure", e10);
        }
    }

    private static void b(rw.d dVar, int i10) {
        if (dVar.b().u()) {
            c(i10);
        } else {
            if (dVar.b().v()) {
                return;
            }
            d();
        }
    }

    public static a i() {
        return k().a();
    }

    public static c j(String str) {
        return i().a(str);
    }

    private static boolean l(List<tw.b> list) {
        if (list.size() > 1) {
            return true;
        }
        return false;
    }

    private static final void m() {
        a();
        if (f157705a == 3) {
            t();
        }
    }

    private static void n() {
        h();
        o();
        f157706b.d().b();
    }

    private static void q(List<tw.b> list) {
        if (!list.isEmpty() && l(list)) {
            q.a("Actual provider is of type [" + list.get(0) + "]");
        }
    }

    private static void r(Set<URL> set) {
        if (set.isEmpty()) {
            return;
        }
        q.a("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator<URL> it = set.iterator();
        while (it.hasNext()) {
            q.a("Ignoring binding found at [" + it.next() + "]");
        }
        q.a("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    private static void s(List<tw.b> list) {
        if (l(list)) {
            q.a("Class path contains multiple SLF4J providers.");
            Iterator<tw.b> it = list.iterator();
            while (it.hasNext()) {
                q.a("Found provider [" + it.next() + "]");
            }
            q.a("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
