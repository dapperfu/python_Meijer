package mw;

import java.io.IOException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import ow.j;
import ow.m;
import ow.o;
import ow.q;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    static volatile int f151780a;

    /* renamed from: e, reason: collision with root package name */
    static volatile pw.b f151784e;

    /* renamed from: b, reason: collision with root package name */
    static final o f151781b = new o();

    /* renamed from: c, reason: collision with root package name */
    static final j f151782c = new j();

    /* renamed from: d, reason: collision with root package name */
    static boolean f151783d = q.c("slf4j.detectLoggerNameMismatch");

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f151785f = {"2.0"};

    static void f(Throwable th2) {
        f151780a = 2;
        q.b("Failed to instantiate SLF4J LoggerFactory", th2);
    }

    private static void d(int i10) {
        q.a("A number (" + i10 + ") of logging calls during the initialization phase have been intercepted and are");
        q.a("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        q.a("See also https://www.slf4j.org/codes.html#replay");
    }

    private static void e() {
        q.a("The following set of substitute loggers may have been accessed");
        q.a("during the initialization phase. Logging calls during this");
        q.a("phase were not honored. However, subsequent logging calls to these");
        q.a("loggers will work as normally expected.");
        q.a("See also https://www.slf4j.org/codes.html#substituteLogger");
    }

    static Set<URL> g() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = e.class.getClassLoader();
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

    static List<pw.b> h() {
        ServiceLoader<pw.b> serviceLoaderM = m(e.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        Iterator<pw.b> it = serviceLoaderM.iterator();
        while (it.hasNext()) {
            v(arrayList, it);
        }
        return arrayList;
    }

    private static void i() {
        o oVar = f151781b;
        synchronized (oVar) {
            try {
                oVar.d().e();
                for (m mVar : oVar.d().d()) {
                    mVar.z(k(mVar.u()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static pw.b l() {
        if (f151780a == 0) {
            synchronized (e.class) {
                try {
                    if (f151780a == 0) {
                        f151780a = 1;
                        o();
                    }
                } finally {
                }
            }
        }
        int i10 = f151780a;
        if (i10 == 1) {
            return f151781b;
        }
        if (i10 == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i10 == 3) {
            return f151784e;
        }
        if (i10 == 4) {
            return f151782c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    private static void q() {
        LinkedBlockingQueue<nw.d> linkedBlockingQueueC = f151781b.d().c();
        int size = linkedBlockingQueueC.size();
        ArrayList<nw.d> arrayList = new ArrayList(128);
        int i10 = 0;
        while (linkedBlockingQueueC.drainTo(arrayList, 128) != 0) {
            for (nw.d dVar : arrayList) {
                r(dVar);
                int i11 = i10 + 1;
                if (i10 == 0) {
                    c(dVar, size);
                }
                i10 = i11;
            }
            arrayList.clear();
        }
    }

    private static void r(nw.d dVar) {
        if (dVar == null) {
            return;
        }
        m mVarC = dVar.c();
        String strU = mVarC.u();
        if (mVarC.x()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (mVarC.w()) {
            return;
        }
        if (!mVarC.v()) {
            q.a(strU);
        } else if (mVarC.m(dVar.b())) {
            mVarC.y(dVar);
        }
    }

    private static final void w() {
        try {
            String strC = f151784e.c();
            boolean z10 = false;
            for (String str : f151785f) {
                if (strC.startsWith(str)) {
                    z10 = true;
                }
            }
            if (z10) {
                return;
            }
            q.a("The requested version " + strC + " by your slf4j binding is not compatible with " + Arrays.asList(f151785f).toString());
            q.a("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th2) {
            q.b("Unexpected problem occured during version sanity check", th2);
        }
    }

    private e() {
    }

    private static final void b() {
        try {
            List<pw.b> listH = h();
            u(listH);
            if (listH != null && !listH.isEmpty()) {
                f151784e = listH.get(0);
                f151784e.b();
                f151780a = 3;
                s(listH);
            } else {
                f151780a = 4;
                q.a("No SLF4J providers were found.");
                q.a("Defaulting to no-operation (NOP) logger implementation");
                q.a("See https://www.slf4j.org/codes.html#noProviders for further details.");
                t(g());
            }
            p();
        } catch (Exception e10) {
            f(e10);
            throw new IllegalStateException("Unexpected initialization failure", e10);
        }
    }

    private static void c(nw.d dVar, int i10) {
        if (dVar.c().v()) {
            d(i10);
        } else {
            if (dVar.c().w()) {
                return;
            }
            e();
        }
    }

    public static a j() {
        return l().a();
    }

    public static c k(String str) {
        return j().a(str);
    }

    private static ServiceLoader<pw.b> m(final ClassLoader classLoader) {
        if (System.getSecurityManager() == null) {
            return ServiceLoader.load(pw.b.class, classLoader);
        }
        return (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: mw.d
            @Override // java.security.PrivilegedAction
            public final Object run() {
                return ServiceLoader.load(pw.b.class, classLoader);
            }
        });
    }

    private static boolean n(List<pw.b> list) {
        if (list.size() > 1) {
            return true;
        }
        return false;
    }

    private static final void o() {
        b();
        if (f151780a == 3) {
            w();
        }
    }

    private static void p() {
        i();
        q();
        f151781b.d().b();
    }

    private static void s(List<pw.b> list) {
        if (!list.isEmpty() && n(list)) {
            q.a("Actual provider is of type [" + list.get(0) + "]");
        }
    }

    private static void t(Set<URL> set) {
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

    private static void u(List<pw.b> list) {
        if (n(list)) {
            q.a("Class path contains multiple SLF4J providers.");
            Iterator<pw.b> it = list.iterator();
            while (it.hasNext()) {
                q.a("Found provider [" + it.next() + "]");
            }
            q.a("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }

    private static void v(List<pw.b> list, Iterator<pw.b> it) {
        try {
            list.add(it.next());
        } catch (ServiceConfigurationError e10) {
            q.a("A SLF4J service provider failed to instantiate:\n" + e10.getMessage());
        }
    }
}
