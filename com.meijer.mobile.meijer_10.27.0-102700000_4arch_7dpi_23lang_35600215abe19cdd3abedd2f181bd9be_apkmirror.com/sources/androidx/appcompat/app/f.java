package androidx.appcompat.app;

import Z.C5504b;
import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.b;
import androidx.appcompat.app.f;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import com.fullstory.FS;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    static c f45957a = new c(new d());

    /* renamed from: b, reason: collision with root package name */
    private static int f45958b = -100;

    /* renamed from: c, reason: collision with root package name */
    private static j2.i f45959c = null;

    /* renamed from: d, reason: collision with root package name */
    private static j2.i f45960d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f45961e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f45962f = false;

    /* renamed from: g, reason: collision with root package name */
    private static final C5504b<WeakReference<f>> f45963g = new C5504b<>();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f45964h = new Object();

    /* renamed from: i, reason: collision with root package name */
    private static final Object f45965i = new Object();

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    static class c implements Executor {

        /* renamed from: a, reason: collision with root package name */
        private final Object f45966a = new Object();

        /* renamed from: b, reason: collision with root package name */
        final Queue<Runnable> f45967b = new ArrayDeque();

        /* renamed from: c, reason: collision with root package name */
        final Executor f45968c;

        /* renamed from: d, reason: collision with root package name */
        Runnable f45969d;

        protected void b() {
            synchronized (this.f45966a) {
                try {
                    Runnable runnablePoll = this.f45967b.poll();
                    this.f45969d = runnablePoll;
                    if (runnablePoll != null) {
                        this.f45968c.execute(runnablePoll);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f45966a) {
                try {
                    this.f45967b.add(new Runnable() { // from class: androidx.appcompat.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            f.c.a(this.f45970a, runnable);
                        }
                    });
                    if (this.f45969d == null) {
                        b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        c(Executor executor) {
            this.f45968c = executor;
        }

        public static /* synthetic */ void a(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.b();
            }
        }
    }

    static class d implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }

        d() {
        }
    }

    public static void M(int i10) {
        if (i10 != -1 && i10 != 0 && i10 != 1 && i10 != 2 && i10 != 3) {
            FS.log_d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f45958b != i10) {
            f45958b = i10;
            g();
        }
    }

    public abstract void A();

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D(Bundle bundle);

    public abstract void E();

    public abstract void F();

    public abstract boolean I(int i10);

    public abstract void J(int i10);

    public abstract void K(View view);

    public abstract void L(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void N(int i10);

    public void O(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void P(Toolbar toolbar);

    public void Q(int i10) {
    }

    public abstract void R(CharSequence charSequence);

    public abstract androidx.appcompat.view.b S(b.a aVar);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean f();

    @Deprecated
    public void h(Context context) {
    }

    public abstract <T extends View> T l(int i10);

    public Context n() {
        return null;
    }

    public abstract b.InterfaceC0956b p();

    public int q() {
        return -100;
    }

    public abstract MenuInflater s();

    public abstract androidx.appcompat.app.a u();

    public abstract void v();

    public abstract void w();

    public abstract void y(Configuration configuration);

    public abstract void z(Bundle bundle);

    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static void G(f fVar) {
        synchronized (f45964h) {
            H(fVar);
        }
    }

    private static void H(f fVar) {
        synchronized (f45964h) {
            try {
                Iterator<WeakReference<f>> it = f45963g.iterator();
                while (it.hasNext()) {
                    f fVar2 = it.next().get();
                    if (fVar2 == fVar || fVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static void T(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m().e()) {
                    String strB = androidx.core.app.f.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    static void d(f fVar) {
        synchronized (f45964h) {
            H(fVar);
            f45963g.add(new WeakReference<>(fVar));
        }
    }

    private static void g() {
        synchronized (f45964h) {
            try {
                Iterator<WeakReference<f>> it = f45963g.iterator();
                while (it.hasNext()) {
                    f fVar = it.next().get();
                    if (fVar != null) {
                        fVar.f();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static f j(Activity activity, androidx.appcompat.app.d dVar) {
        return new AppCompatDelegateImpl(activity, dVar);
    }

    public static f k(Dialog dialog, androidx.appcompat.app.d dVar) {
        return new AppCompatDelegateImpl(dialog, dVar);
    }

    public static j2.i m() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objR = r();
            if (objR != null) {
                return j2.i.i(b.a(objR));
            }
        } else {
            j2.i iVar = f45959c;
            if (iVar != null) {
                return iVar;
            }
        }
        return j2.i.d();
    }

    public static int o() {
        return f45958b;
    }

    static Object r() {
        Context contextN;
        Iterator<WeakReference<f>> it = f45963g.iterator();
        while (it.hasNext()) {
            f fVar = it.next().get();
            if (fVar != null && (contextN = fVar.n()) != null) {
                return contextN.getSystemService("locale");
            }
        }
        return null;
    }

    static j2.i t() {
        return f45959c;
    }

    static boolean x(Context context) {
        if (f45961e == null) {
            try {
                Bundle bundle = s.a(context).metaData;
                if (bundle != null) {
                    f45961e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                FS.log_d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f45961e = Boolean.FALSE;
            }
        }
        return f45961e.booleanValue();
    }

    f() {
    }

    static void U(final Context context) {
        if (x(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!f45962f) {
                    f45957a.execute(new Runnable() { // from class: androidx.appcompat.app.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            f.c(context);
                        }
                    });
                    return;
                }
                return;
            }
            synchronized (f45965i) {
                try {
                    j2.i iVar = f45959c;
                    if (iVar == null) {
                        if (f45960d == null) {
                            f45960d = j2.i.b(androidx.core.app.f.b(context));
                        }
                        if (f45960d.e()) {
                        } else {
                            f45959c = f45960d;
                        }
                    } else if (!iVar.equals(f45960d)) {
                        j2.i iVar2 = f45959c;
                        f45960d = iVar2;
                        androidx.core.app.f.a(context, iVar2.g());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static /* synthetic */ void c(Context context) {
        T(context);
        f45962f = true;
    }

    public Context i(Context context) {
        h(context);
        return context;
    }
}
