package com.squareup.picasso;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import ku.InterfaceC15321a;

/* loaded from: classes11.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    final b f126507a;

    /* renamed from: b, reason: collision with root package name */
    final Context f126508b;

    /* renamed from: c, reason: collision with root package name */
    final ExecutorService f126509c;

    /* renamed from: d, reason: collision with root package name */
    final Downloader f126510d;

    /* renamed from: e, reason: collision with root package name */
    final Map<String, com.squareup.picasso.c> f126511e;

    /* renamed from: f, reason: collision with root package name */
    final Map<Object, com.squareup.picasso.a> f126512f;

    /* renamed from: g, reason: collision with root package name */
    final Map<Object, com.squareup.picasso.a> f126513g;

    /* renamed from: h, reason: collision with root package name */
    final Set<Object> f126514h;

    /* renamed from: i, reason: collision with root package name */
    final Handler f126515i;

    /* renamed from: j, reason: collision with root package name */
    final Handler f126516j;

    /* renamed from: k, reason: collision with root package name */
    final InterfaceC15321a f126517k;

    /* renamed from: l, reason: collision with root package name */
    final t f126518l;

    /* renamed from: m, reason: collision with root package name */
    final List<com.squareup.picasso.c> f126519m;

    /* renamed from: n, reason: collision with root package name */
    final c f126520n;

    /* renamed from: o, reason: collision with root package name */
    final boolean f126521o;

    /* renamed from: p, reason: collision with root package name */
    boolean f126522p;

    private static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final g f126523a;

        /* renamed from: com.squareup.picasso.g$a$a, reason: collision with other inner class name */
        class RunnableC1984a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Message f126524a;

            RunnableC1984a(Message message) {
                this.f126524a = message;
            }

            @Override // java.lang.Runnable
            public void run() {
                throw new AssertionError("Unknown handler message received: " + this.f126524a.what);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f126523a.v((com.squareup.picasso.a) message.obj);
                    break;
                case 2:
                    this.f126523a.o((com.squareup.picasso.a) message.obj);
                    break;
                case 3:
                case 8:
                default:
                    o.f126547o.post(new RunnableC1984a(message));
                    break;
                case 4:
                    this.f126523a.p((com.squareup.picasso.c) message.obj);
                    break;
                case 5:
                    this.f126523a.u((com.squareup.picasso.c) message.obj);
                    break;
                case 6:
                    this.f126523a.q((com.squareup.picasso.c) message.obj, false);
                    break;
                case 7:
                    this.f126523a.n();
                    break;
                case 9:
                    this.f126523a.r((NetworkInfo) message.obj);
                    break;
                case 10:
                    this.f126523a.m(message.arg1 == 1);
                    break;
                case 11:
                    this.f126523a.s(message.obj);
                    break;
                case 12:
                    this.f126523a.t(message.obj);
                    break;
            }
        }

        public a(Looper looper, g gVar) {
            super(looper);
            this.f126523a = gVar;
        }
    }

    static class b extends HandlerThread {
        b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    static class c extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private final g f126526a;

        void a() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
            if (this.f126526a.f126521o) {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
            this.f126526a.f126508b.registerReceiver(this, intentFilter);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                if (intent.hasExtra("state")) {
                    this.f126526a.b(intent.getBooleanExtra("state", false));
                }
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                this.f126526a.f(((ConnectivityManager) v.j(context, "connectivity")).getActiveNetworkInfo());
            }
        }

        c(g gVar) {
            this.f126526a = gVar;
        }
    }

    void v(com.squareup.picasso.a aVar) {
        w(aVar, true);
    }

    private void i() {
        if (this.f126512f.isEmpty()) {
            return;
        }
        Iterator<com.squareup.picasso.a> it = this.f126512f.values().iterator();
        while (it.hasNext()) {
            com.squareup.picasso.a next = it.next();
            it.remove();
            if (next.g().f126562n) {
                next.i();
                throw null;
            }
            w(next, false);
        }
    }

    private void j(List<com.squareup.picasso.c> list) {
        if (list == null || list.isEmpty() || !list.get(0).n().f126562n) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        for (com.squareup.picasso.c cVar : list) {
            if (sb2.length() > 0) {
                sb2.append(", ");
            }
            sb2.append(v.h(cVar));
        }
        v.n("Dispatcher", "delivered", sb2.toString());
    }

    void b(boolean z10) {
        Handler handler = this.f126515i;
        handler.sendMessage(handler.obtainMessage(10, z10 ? 1 : 0, 0));
    }

    void c(com.squareup.picasso.a aVar) {
        Handler handler = this.f126515i;
        handler.sendMessage(handler.obtainMessage(2, aVar));
    }

    void d(com.squareup.picasso.c cVar) {
        Handler handler = this.f126515i;
        handler.sendMessage(handler.obtainMessage(4, cVar));
    }

    void e(com.squareup.picasso.c cVar) {
        Handler handler = this.f126515i;
        handler.sendMessage(handler.obtainMessage(6, cVar));
    }

    void f(NetworkInfo networkInfo) {
        Handler handler = this.f126515i;
        handler.sendMessage(handler.obtainMessage(9, networkInfo));
    }

    void g(com.squareup.picasso.c cVar) {
        Handler handler = this.f126515i;
        handler.sendMessageDelayed(handler.obtainMessage(5, cVar), 500L);
    }

    void h(com.squareup.picasso.a aVar) {
        Handler handler = this.f126515i;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    void m(boolean z10) {
        this.f126522p = z10;
    }

    void n() {
        ArrayList arrayList = new ArrayList(this.f126519m);
        this.f126519m.clear();
        Handler handler = this.f126516j;
        handler.sendMessage(handler.obtainMessage(8, arrayList));
        j(arrayList);
    }

    void r(NetworkInfo networkInfo) {
        ExecutorService executorService = this.f126509c;
        if (executorService instanceof p) {
            ((p) executorService).a(networkInfo);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return;
        }
        i();
    }

    void s(Object obj) {
        if (this.f126514h.add(obj)) {
            Iterator<com.squareup.picasso.c> it = this.f126511e.values().iterator();
            while (it.hasNext()) {
                com.squareup.picasso.c next = it.next();
                boolean z10 = next.n().f126562n;
                com.squareup.picasso.a aVarH = next.h();
                List<com.squareup.picasso.a> listI = next.i();
                boolean z11 = (listI == null || listI.isEmpty()) ? false : true;
                if (aVarH != null || z11) {
                    if (aVarH != null && aVarH.j().equals(obj)) {
                        next.f(aVarH);
                        this.f126513g.put(aVarH.k(), aVarH);
                        if (z10) {
                            throw null;
                        }
                    }
                    if (z11) {
                        for (int size = listI.size() - 1; size >= 0; size--) {
                            com.squareup.picasso.a aVar = listI.get(size);
                            if (aVar.j().equals(obj)) {
                                next.f(aVar);
                                this.f126513g.put(aVar.k(), aVar);
                                if (z10) {
                                    throw null;
                                }
                            }
                        }
                    }
                    if (next.b()) {
                        it.remove();
                        if (z10) {
                            v.o("Dispatcher", "canceled", v.h(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    void t(Object obj) {
        if (this.f126514h.remove(obj)) {
            Iterator<com.squareup.picasso.a> it = this.f126513g.values().iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                com.squareup.picasso.a next = it.next();
                if (next.j().equals(obj)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(next);
                    it.remove();
                }
            }
            if (arrayList != null) {
                Handler handler = this.f126516j;
                handler.sendMessage(handler.obtainMessage(13, arrayList));
            }
        }
    }

    void w(com.squareup.picasso.a aVar, boolean z10) {
        if (this.f126514h.contains(aVar.j())) {
            this.f126513g.put(aVar.k(), aVar);
            if (aVar.g().f126562n) {
                throw null;
            }
            return;
        }
        com.squareup.picasso.c cVar = this.f126511e.get(aVar.d());
        if (cVar != null) {
            cVar.a(aVar);
            return;
        }
        if (this.f126509c.isShutdown()) {
            if (aVar.g().f126562n) {
                throw null;
            }
            return;
        }
        com.squareup.picasso.c cVarG = com.squareup.picasso.c.g(aVar.g(), this, this.f126517k, this.f126518l, aVar);
        cVarG.f126498m = this.f126509c.submit(cVarG);
        this.f126511e.put(aVar.d(), cVarG);
        if (z10) {
            this.f126512f.remove(aVar.k());
        }
        if (aVar.g().f126562n) {
            throw null;
        }
    }

    g(Context context, ExecutorService executorService, Handler handler, Downloader downloader, InterfaceC15321a interfaceC15321a, t tVar) {
        b bVar = new b();
        this.f126507a = bVar;
        bVar.start();
        v.f(bVar.getLooper());
        this.f126508b = context;
        this.f126509c = executorService;
        this.f126511e = new LinkedHashMap();
        this.f126512f = new WeakHashMap();
        this.f126513g = new WeakHashMap();
        this.f126514h = new HashSet();
        this.f126515i = new a(bVar.getLooper(), this);
        this.f126510d = downloader;
        this.f126516j = handler;
        this.f126517k = interfaceC15321a;
        this.f126518l = tVar;
        this.f126519m = new ArrayList(4);
        this.f126522p = v.l(context);
        this.f126521o = v.k(context, "android.permission.ACCESS_NETWORK_STATE");
        c cVar = new c(this);
        this.f126520n = cVar;
        cVar.a();
    }

    private void a(com.squareup.picasso.c cVar) {
        if (!cVar.r()) {
            this.f126519m.add(cVar);
            if (!this.f126515i.hasMessages(7)) {
                this.f126515i.sendEmptyMessageDelayed(7, 200L);
            }
        }
    }

    private void k(com.squareup.picasso.a aVar) {
        Object objK = aVar.k();
        if (objK != null) {
            aVar.f126478g = true;
            this.f126512f.put(objK, aVar);
        }
    }

    private void l(com.squareup.picasso.c cVar) {
        com.squareup.picasso.a aVarH = cVar.h();
        if (aVarH != null) {
            k(aVarH);
        }
        List<com.squareup.picasso.a> listI = cVar.i();
        if (listI != null) {
            int size = listI.size();
            for (int i10 = 0; i10 < size; i10++) {
                k(listI.get(i10));
            }
        }
    }

    void o(com.squareup.picasso.a aVar) {
        String strD = aVar.d();
        com.squareup.picasso.c cVar = this.f126511e.get(strD);
        if (cVar != null) {
            cVar.f(aVar);
            if (cVar.b()) {
                this.f126511e.remove(strD);
                if (aVar.g().f126562n) {
                    aVar.i();
                    throw null;
                }
            }
        }
        if (this.f126514h.contains(aVar.j())) {
            this.f126513g.remove(aVar.k());
            if (aVar.g().f126562n) {
                aVar.i();
                throw null;
            }
        }
        com.squareup.picasso.a aVarRemove = this.f126512f.remove(aVar.k());
        if (aVarRemove != null && aVarRemove.g().f126562n) {
            aVarRemove.i();
            throw null;
        }
    }

    void p(com.squareup.picasso.c cVar) {
        if (k.b(cVar.m())) {
            this.f126517k.c(cVar.l(), cVar.p());
        }
        this.f126511e.remove(cVar.l());
        a(cVar);
        if (cVar.n().f126562n) {
            v.o("Dispatcher", "batched", v.h(cVar), "for completion");
        }
    }

    void q(com.squareup.picasso.c cVar, boolean z10) {
        String str;
        if (cVar.n().f126562n) {
            String strH = v.h(cVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("for error");
            if (z10) {
                str = " (will replay)";
            } else {
                str = "";
            }
            sb2.append(str);
            v.o("Dispatcher", "batched", strH, sb2.toString());
        }
        this.f126511e.remove(cVar.l());
        a(cVar);
    }

    void u(com.squareup.picasso.c cVar) {
        NetworkInfo activeNetworkInfo;
        boolean z10;
        if (!cVar.r()) {
            boolean z11 = false;
            if (this.f126509c.isShutdown()) {
                q(cVar, false);
                return;
            }
            if (this.f126521o) {
                activeNetworkInfo = ((ConnectivityManager) v.j(this.f126508b, "connectivity")).getActiveNetworkInfo();
            } else {
                activeNetworkInfo = null;
            }
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean zS = cVar.s(this.f126522p, activeNetworkInfo);
            boolean zT = cVar.t();
            if (!zS) {
                if (this.f126521o && zT) {
                    z11 = true;
                }
                q(cVar, z11);
                if (z11) {
                    l(cVar);
                    return;
                }
                return;
            }
            if (this.f126521o && !z10) {
                q(cVar, zT);
                if (zT) {
                    l(cVar);
                    return;
                }
                return;
            }
            if (cVar.n().f126562n) {
                v.n("Dispatcher", "retrying", v.h(cVar));
            }
            if (cVar.k() instanceof m.a) {
                cVar.f126493h |= l.NO_CACHE.f126543a;
            }
            cVar.f126498m = this.f126509c.submit(cVar);
        }
    }
}
