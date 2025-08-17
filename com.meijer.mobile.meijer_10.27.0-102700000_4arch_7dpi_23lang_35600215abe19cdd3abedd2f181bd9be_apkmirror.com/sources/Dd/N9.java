package Dd;

import Td.AbstractC5232j;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C6533o;
import com.google.android.gms.dynamite.DynamiteModule;
import j2.C14837e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import sg.C16958c;
import sg.C16962g;
import sg.C16969n;

/* loaded from: classes6.dex */
public final class N9 {

    /* renamed from: k, reason: collision with root package name */
    private static AbstractC3178j0 f5438k;

    /* renamed from: l, reason: collision with root package name */
    private static final AbstractC3202l0 f5439l = AbstractC3202l0.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a, reason: collision with root package name */
    private final String f5440a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5441b;

    /* renamed from: c, reason: collision with root package name */
    private final D9 f5442c;

    /* renamed from: d, reason: collision with root package name */
    private final C16969n f5443d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5232j f5444e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5232j f5445f;

    /* renamed from: g, reason: collision with root package name */
    private final String f5446g;

    /* renamed from: h, reason: collision with root package name */
    private final int f5447h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f5448i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map f5449j = new HashMap();

    private static synchronized AbstractC3178j0 i() {
        try {
            AbstractC3178j0 abstractC3178j0 = f5438k;
            if (abstractC3178j0 != null) {
                return abstractC3178j0;
            }
            j2.i iVarA = C14837e.a(Resources.getSystem().getConfiguration());
            C3142g0 c3142g0 = new C3142g0();
            for (int i10 = 0; i10 < iVarA.f(); i10++) {
                c3142g0.e(C16958c.b(iVarA.c(i10)));
            }
            AbstractC3178j0 abstractC3178j0G = c3142g0.g();
            f5438k = abstractC3178j0G;
            return abstractC3178j0G;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final String j() {
        if (this.f5444e.r()) {
            return (String) this.f5444e.n();
        }
        return C6533o.a().b(this.f5446g);
    }

    private final boolean k(Z6 z62, long j10, long j11) {
        return this.f5448i.get(z62) == null || j10 - ((Long) this.f5448i.get(z62)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    final /* synthetic */ void g(Z6 z62, xg.j jVar) {
        InterfaceC3238o0 interfaceC3238o0 = (InterfaceC3238o0) this.f5449j.get(z62);
        if (interfaceC3238o0 != null) {
            for (Object obj : interfaceC3238o0.zzw()) {
                ArrayList arrayList = new ArrayList(interfaceC3238o0.zze(obj));
                Collections.sort(arrayList);
                C3342x6 c3342x6 = new C3342x6();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                c3342x6.a(Long.valueOf(jLongValue / arrayList.size()));
                c3342x6.c(Long.valueOf(a(arrayList, 100.0d)));
                c3342x6.f(Long.valueOf(a(arrayList, 75.0d)));
                c3342x6.d(Long.valueOf(a(arrayList, 50.0d)));
                c3342x6.b(Long.valueOf(a(arrayList, 25.0d)));
                c3342x6.e(Long.valueOf(a(arrayList, 0.0d)));
                e(jVar.a(obj, arrayList.size(), c3342x6.g()), z62, j());
            }
            this.f5449j.remove(z62);
        }
    }

    final /* synthetic */ void h(final Z6 z62, Object obj, long j10, final xg.j jVar) {
        if (!this.f5449j.containsKey(z62)) {
            this.f5449j.put(z62, L.m());
        }
        ((InterfaceC3238o0) this.f5449j.get(z62)).a(obj, Long.valueOf(j10));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(z62, jElapsedRealtime, 30L)) {
            this.f5448i.put(z62, Long.valueOf(jElapsedRealtime));
            C16962g.d().execute(new Runnable() { // from class: Dd.I9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5257a.g(z62, jVar);
                }
            });
        }
    }

    public N9(Context context, final C16969n c16969n, D9 d92, String str) {
        int iC;
        this.f5440a = context.getPackageName();
        this.f5441b = C16958c.a(context);
        this.f5443d = c16969n;
        this.f5442c = d92;
        C3080aa.a();
        this.f5446g = str;
        this.f5444e = C16962g.a().b(new Callable() { // from class: Dd.J9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f5264a.b();
            }
        });
        C16962g c16962gA = C16962g.a();
        Objects.requireNonNull(c16969n);
        this.f5445f = c16962gA.b(new Callable() { // from class: Dd.K9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c16969n.a();
            }
        });
        AbstractC3202l0 abstractC3202l0 = f5439l;
        if (abstractC3202l0.containsKey(str)) {
            iC = DynamiteModule.c(context, (String) abstractC3202l0.get(str));
        } else {
            iC = -1;
        }
        this.f5447h = iC;
    }

    static long a(List list, double d10) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d10 / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    final /* synthetic */ String b() throws Exception {
        return C6533o.a().b(this.f5446g);
    }

    final /* synthetic */ void c(C9 c92, Z6 z62, String str) {
        String strA;
        c92.c(z62);
        String strZzd = c92.zzd();
        Y8 y82 = new Y8();
        y82.b(this.f5440a);
        y82.c(this.f5441b);
        y82.h(i());
        y82.g(Boolean.TRUE);
        y82.l(strZzd);
        y82.j(str);
        if (this.f5445f.r()) {
            strA = (String) this.f5445f.n();
        } else {
            strA = this.f5443d.a();
        }
        y82.i(strA);
        y82.d(10);
        y82.k(Integer.valueOf(this.f5447h));
        c92.a(y82);
        this.f5442c.a(c92);
    }

    public final void d(C9 c92, Z6 z62) {
        e(c92, z62, j());
    }

    public final void e(final C9 c92, final Z6 z62, final String str) {
        C16962g.d().execute(new Runnable() { // from class: Dd.H9
            @Override // java.lang.Runnable
            public final void run() {
                this.f5247a.c(c92, z62, str);
            }
        });
    }

    public final void f(M9 m92, Z6 z62) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!k(z62, jElapsedRealtime, 30L)) {
            return;
        }
        this.f5448i.put(z62, Long.valueOf(jElapsedRealtime));
        e(m92.zza(), z62, j());
    }
}
