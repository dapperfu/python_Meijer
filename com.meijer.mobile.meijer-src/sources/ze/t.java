package ze;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.InterfaceC5511e;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: o, reason: collision with root package name */
    private static final Map f172723o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f172724a;

    /* renamed from: b, reason: collision with root package name */
    private final i f172725b;

    /* renamed from: g, reason: collision with root package name */
    private boolean f172730g;

    /* renamed from: h, reason: collision with root package name */
    private final Intent f172731h;

    /* renamed from: l, reason: collision with root package name */
    private ServiceConnection f172735l;

    /* renamed from: m, reason: collision with root package name */
    private IInterface f172736m;

    /* renamed from: n, reason: collision with root package name */
    private final ye.h f172737n;

    /* renamed from: d, reason: collision with root package name */
    private final List f172727d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final Set f172728e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Object f172729f = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f172733j = new IBinder.DeathRecipient() { // from class: ze.l
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            t.h(this.f172715a);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f172734k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private final String f172726c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* renamed from: i, reason: collision with root package name */
    private final WeakReference f172732i = new WeakReference(null);

    public static /* synthetic */ void h(t tVar) {
        tVar.f172725b.d("reportBinderDeath", new Object[0]);
        o oVar = (o) tVar.f172732i.get();
        if (oVar != null) {
            tVar.f172725b.d("calling onBinderDied", new Object[0]);
            oVar.zza();
        } else {
            tVar.f172725b.d("%s : Binder has died.", tVar.f172726c);
            Iterator it = tVar.f172727d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(tVar.s());
            }
            tVar.f172727d.clear();
        }
        tVar.t();
    }

    static /* bridge */ /* synthetic */ void m(t tVar, j jVar) {
        if (tVar.f172736m != null || tVar.f172730g) {
            if (!tVar.f172730g) {
                jVar.run();
                return;
            } else {
                tVar.f172725b.d("Waiting to bind to the service.", new Object[0]);
                tVar.f172727d.add(jVar);
                return;
            }
        }
        tVar.f172725b.d("Initiate binding to the service.", new Object[0]);
        tVar.f172727d.add(jVar);
        s sVar = new s(tVar, null);
        tVar.f172735l = sVar;
        tVar.f172730g = true;
        if (tVar.f172724a.bindService(tVar.f172731h, sVar, 1)) {
            return;
        }
        tVar.f172725b.d("Failed to bind to the service.", new Object[0]);
        tVar.f172730g = false;
        Iterator it = tVar.f172727d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(new zzu());
        }
        tVar.f172727d.clear();
    }

    static /* bridge */ /* synthetic */ void n(t tVar) throws RemoteException {
        tVar.f172725b.d("linkToDeath", new Object[0]);
        try {
            tVar.f172736m.asBinder().linkToDeath(tVar.f172733j, 0);
        } catch (RemoteException e10) {
            tVar.f172725b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void o(t tVar) {
        tVar.f172725b.d("unlinkToDeath", new Object[0]);
        tVar.f172736m.asBinder().unlinkToDeath(tVar.f172733j, 0);
    }

    private final RemoteException s() {
        return new RemoteException(String.valueOf(this.f172726c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        synchronized (this.f172729f) {
            try {
                Iterator it = this.f172728e.iterator();
                while (it.hasNext()) {
                    ((C5517k) it.next()).d(s());
                }
                this.f172728e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Handler c() {
        Handler handler;
        Map map = f172723o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f172726c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f172726c, 10);
                    handlerThread.start();
                    map.put(this.f172726c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f172726c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f172736m;
    }

    public final void p(j jVar, final C5517k c5517k) {
        synchronized (this.f172729f) {
            this.f172728e.add(c5517k);
            c5517k.a().c(new InterfaceC5511e() { // from class: ze.k
                @Override // Vd.InterfaceC5511e
                public final void onComplete(AbstractC5516j abstractC5516j) {
                    this.f172713a.q(c5517k, abstractC5516j);
                }
            });
        }
        synchronized (this.f172729f) {
            try {
                if (this.f172734k.getAndIncrement() > 0) {
                    this.f172725b.a("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c().post(new m(this, jVar.b(), jVar));
    }

    final /* synthetic */ void q(C5517k c5517k, AbstractC5516j abstractC5516j) {
        synchronized (this.f172729f) {
            this.f172728e.remove(c5517k);
        }
    }

    public final void r(C5517k c5517k) {
        synchronized (this.f172729f) {
            this.f172728e.remove(c5517k);
        }
        synchronized (this.f172729f) {
            try {
                if (this.f172734k.get() > 0 && this.f172734k.decrementAndGet() > 0) {
                    this.f172725b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    c().post(new n(this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public t(Context context, i iVar, String str, Intent intent, ye.h hVar, o oVar, byte[] bArr) {
        this.f172724a = context;
        this.f172725b = iVar;
        this.f172731h = intent;
        this.f172737n = hVar;
    }
}
