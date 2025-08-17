package xe;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.InterfaceC5227e;
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
    private static final Map f169574o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    private final Context f169575a;

    /* renamed from: b, reason: collision with root package name */
    private final i f169576b;

    /* renamed from: g, reason: collision with root package name */
    private boolean f169581g;

    /* renamed from: h, reason: collision with root package name */
    private final Intent f169582h;

    /* renamed from: l, reason: collision with root package name */
    private ServiceConnection f169586l;

    /* renamed from: m, reason: collision with root package name */
    private IInterface f169587m;

    /* renamed from: n, reason: collision with root package name */
    private final we.h f169588n;

    /* renamed from: d, reason: collision with root package name */
    private final List f169578d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final Set f169579e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final Object f169580f = new Object();

    /* renamed from: j, reason: collision with root package name */
    private final IBinder.DeathRecipient f169584j = new IBinder.DeathRecipient() { // from class: xe.l
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            t.h(this.f169566a);
        }
    };

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f169585k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private final String f169577c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    /* renamed from: i, reason: collision with root package name */
    private final WeakReference f169583i = new WeakReference(null);

    public static /* synthetic */ void h(t tVar) {
        tVar.f169576b.d("reportBinderDeath", new Object[0]);
        o oVar = (o) tVar.f169583i.get();
        if (oVar != null) {
            tVar.f169576b.d("calling onBinderDied", new Object[0]);
            oVar.zza();
        } else {
            tVar.f169576b.d("%s : Binder has died.", tVar.f169577c);
            Iterator it = tVar.f169578d.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(tVar.s());
            }
            tVar.f169578d.clear();
        }
        tVar.t();
    }

    static /* bridge */ /* synthetic */ void m(t tVar, j jVar) {
        if (tVar.f169587m != null || tVar.f169581g) {
            if (!tVar.f169581g) {
                jVar.run();
                return;
            } else {
                tVar.f169576b.d("Waiting to bind to the service.", new Object[0]);
                tVar.f169578d.add(jVar);
                return;
            }
        }
        tVar.f169576b.d("Initiate binding to the service.", new Object[0]);
        tVar.f169578d.add(jVar);
        s sVar = new s(tVar, null);
        tVar.f169586l = sVar;
        tVar.f169581g = true;
        if (tVar.f169575a.bindService(tVar.f169582h, sVar, 1)) {
            return;
        }
        tVar.f169576b.d("Failed to bind to the service.", new Object[0]);
        tVar.f169581g = false;
        Iterator it = tVar.f169578d.iterator();
        while (it.hasNext()) {
            ((j) it.next()).c(new zzu());
        }
        tVar.f169578d.clear();
    }

    static /* bridge */ /* synthetic */ void n(t tVar) throws RemoteException {
        tVar.f169576b.d("linkToDeath", new Object[0]);
        try {
            tVar.f169587m.asBinder().linkToDeath(tVar.f169584j, 0);
        } catch (RemoteException e10) {
            tVar.f169576b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void o(t tVar) {
        tVar.f169576b.d("unlinkToDeath", new Object[0]);
        tVar.f169587m.asBinder().unlinkToDeath(tVar.f169584j, 0);
    }

    private final RemoteException s() {
        return new RemoteException(String.valueOf(this.f169577c).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        synchronized (this.f169580f) {
            try {
                Iterator it = this.f169579e.iterator();
                while (it.hasNext()) {
                    ((C5233k) it.next()).d(s());
                }
                this.f169579e.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Handler c() {
        Handler handler;
        Map map = f169574o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f169577c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f169577c, 10);
                    handlerThread.start();
                    map.put(this.f169577c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f169577c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f169587m;
    }

    public final void p(j jVar, final C5233k c5233k) {
        synchronized (this.f169580f) {
            this.f169579e.add(c5233k);
            c5233k.a().c(new InterfaceC5227e() { // from class: xe.k
                @Override // Td.InterfaceC5227e
                public final void onComplete(AbstractC5232j abstractC5232j) {
                    this.f169564a.q(c5233k, abstractC5232j);
                }
            });
        }
        synchronized (this.f169580f) {
            try {
                if (this.f169585k.getAndIncrement() > 0) {
                    this.f169576b.a("Already connected to the service.", new Object[0]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c().post(new m(this, jVar.b(), jVar));
    }

    final /* synthetic */ void q(C5233k c5233k, AbstractC5232j abstractC5232j) {
        synchronized (this.f169580f) {
            this.f169579e.remove(c5233k);
        }
    }

    public final void r(C5233k c5233k) {
        synchronized (this.f169580f) {
            this.f169579e.remove(c5233k);
        }
        synchronized (this.f169580f) {
            try {
                if (this.f169585k.get() > 0 && this.f169585k.decrementAndGet() > 0) {
                    this.f169576b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    c().post(new n(this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public t(Context context, i iVar, String str, Intent intent, we.h hVar, o oVar, byte[] bArr) {
        this.f169575a = context;
        this.f169576b = iVar;
        this.f169582h = intent;
        this.f169588n = hVar;
    }
}
