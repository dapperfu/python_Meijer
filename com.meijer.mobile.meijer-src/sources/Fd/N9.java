package Fd;

import Vd.AbstractC5516j;
import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.C6658o;
import com.google.android.gms.dynamite.DynamiteModule;
import j2.C14925e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import ug.C17405c;
import ug.C17409g;
import ug.C17416n;

/* loaded from: classes6.dex */
public final class N9 {

    /* renamed from: k, reason: collision with root package name */
    private static AbstractC3400j0 f9471k;

    /* renamed from: l, reason: collision with root package name */
    private static final AbstractC3424l0 f9472l = AbstractC3424l0.c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a, reason: collision with root package name */
    private final String f9473a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9474b;

    /* renamed from: c, reason: collision with root package name */
    private final D9 f9475c;

    /* renamed from: d, reason: collision with root package name */
    private final C17416n f9476d;

    /* renamed from: e, reason: collision with root package name */
    private final AbstractC5516j f9477e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC5516j f9478f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9479g;

    /* renamed from: h, reason: collision with root package name */
    private final int f9480h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f9481i = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private final Map f9482j = new HashMap();

    private static synchronized AbstractC3400j0 i() {
        try {
            AbstractC3400j0 abstractC3400j0 = f9471k;
            if (abstractC3400j0 != null) {
                return abstractC3400j0;
            }
            j2.i iVarA = C14925e.a(Resources.getSystem().getConfiguration());
            C3364g0 c3364g0 = new C3364g0();
            for (int i10 = 0; i10 < iVarA.f(); i10++) {
                c3364g0.e(C17405c.b(iVarA.c(i10)));
            }
            AbstractC3400j0 abstractC3400j0G = c3364g0.g();
            f9471k = abstractC3400j0G;
            return abstractC3400j0G;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final String j() {
        if (this.f9477e.r()) {
            return (String) this.f9477e.n();
        }
        return C6658o.a().b(this.f9479g);
    }

    private final boolean k(Z6 z62, long j10, long j11) {
        return this.f9481i.get(z62) == null || j10 - ((Long) this.f9481i.get(z62)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    final /* synthetic */ void g(Z6 z62, zg.j jVar) {
        InterfaceC3460o0 interfaceC3460o0 = (InterfaceC3460o0) this.f9482j.get(z62);
        if (interfaceC3460o0 != null) {
            for (Object obj : interfaceC3460o0.zzw()) {
                ArrayList arrayList = new ArrayList(interfaceC3460o0.zze(obj));
                Collections.sort(arrayList);
                C3564x6 c3564x6 = new C3564x6();
                Iterator it = arrayList.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                c3564x6.a(Long.valueOf(jLongValue / arrayList.size()));
                c3564x6.c(Long.valueOf(a(arrayList, 100.0d)));
                c3564x6.f(Long.valueOf(a(arrayList, 75.0d)));
                c3564x6.d(Long.valueOf(a(arrayList, 50.0d)));
                c3564x6.b(Long.valueOf(a(arrayList, 25.0d)));
                c3564x6.e(Long.valueOf(a(arrayList, 0.0d)));
                e(jVar.a(obj, arrayList.size(), c3564x6.g()), z62, j());
            }
            this.f9482j.remove(z62);
        }
    }

    final /* synthetic */ void h(final Z6 z62, Object obj, long j10, final zg.j jVar) {
        if (!this.f9482j.containsKey(z62)) {
            this.f9482j.put(z62, L.m());
        }
        ((InterfaceC3460o0) this.f9482j.get(z62)).a(obj, Long.valueOf(j10));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (k(z62, jElapsedRealtime, 30L)) {
            this.f9481i.put(z62, Long.valueOf(jElapsedRealtime));
            C17409g.d().execute(new Runnable() { // from class: Fd.I9
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9290a.g(z62, jVar);
                }
            });
        }
    }

    public N9(Context context, final C17416n c17416n, D9 d92, String str) {
        int iC;
        this.f9473a = context.getPackageName();
        this.f9474b = C17405c.a(context);
        this.f9476d = c17416n;
        this.f9475c = d92;
        C3302aa.a();
        this.f9479g = str;
        this.f9477e = C17409g.a().b(new Callable() { // from class: Fd.J9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f9297a.b();
            }
        });
        C17409g c17409gA = C17409g.a();
        Objects.requireNonNull(c17416n);
        this.f9478f = c17409gA.b(new Callable() { // from class: Fd.K9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c17416n.a();
            }
        });
        AbstractC3424l0 abstractC3424l0 = f9472l;
        if (abstractC3424l0.containsKey(str)) {
            iC = DynamiteModule.c(context, (String) abstractC3424l0.get(str));
        } else {
            iC = -1;
        }
        this.f9480h = iC;
    }

    static long a(List list, double d10) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d10 / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    final /* synthetic */ String b() throws Exception {
        return C6658o.a().b(this.f9479g);
    }

    final /* synthetic */ void c(C9 c92, Z6 z62, String str) {
        String strA;
        c92.c(z62);
        String strZzd = c92.zzd();
        Y8 y82 = new Y8();
        y82.b(this.f9473a);
        y82.c(this.f9474b);
        y82.h(i());
        y82.g(Boolean.TRUE);
        y82.l(strZzd);
        y82.j(str);
        if (this.f9478f.r()) {
            strA = (String) this.f9478f.n();
        } else {
            strA = this.f9476d.a();
        }
        y82.i(strA);
        y82.d(10);
        y82.k(Integer.valueOf(this.f9480h));
        c92.a(y82);
        this.f9475c.a(c92);
    }

    public final void d(C9 c92, Z6 z62) {
        e(c92, z62, j());
    }

    public final void e(final C9 c92, final Z6 z62, final String str) {
        C17409g.d().execute(new Runnable() { // from class: Fd.H9
            @Override // java.lang.Runnable
            public final void run() {
                this.f9280a.c(c92, z62, str);
            }
        });
    }

    public final void f(M9 m92, Z6 z62) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (!k(z62, jElapsedRealtime, 30L)) {
            return;
        }
        this.f9481i.put(z62, Long.valueOf(jElapsedRealtime));
        e(m92.zza(), z62, j());
    }
}
