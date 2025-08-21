package kc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import bb.C6345b;
import bc.C6351e;
import cc.InterfaceC6500a;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import gc.InterfaceC14344a;
import ic.C14708a;
import ic.C14709b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* renamed from: kc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15117b extends BroadcastReceiver implements m {

    /* renamed from: m, reason: collision with root package name */
    private static final C13784a f141760m = C13785b.a(C15117b.class.getName());

    /* renamed from: n, reason: collision with root package name */
    private static final C13786c f141761n = C13787d.a(C15117b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC14344a f141762a;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC6500a f141764c;

    /* renamed from: d, reason: collision with root package name */
    public o f141765d;

    /* renamed from: h, reason: collision with root package name */
    public ExecutorService f141769h;

    /* renamed from: i, reason: collision with root package name */
    private Db.e f141770i;

    /* renamed from: j, reason: collision with root package name */
    private Db.b f141771j;

    /* renamed from: k, reason: collision with root package name */
    private C15119d f141772k;

    /* renamed from: l, reason: collision with root package name */
    public Context f141773l;

    /* renamed from: b, reason: collision with root package name */
    private int f141763b = 1;

    /* renamed from: e, reason: collision with root package name */
    C6351e<C15116a> f141766e = new C6351e<>(new C6345b());

    /* renamed from: f, reason: collision with root package name */
    private List<C15116a> f141767f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    g f141768g = new g();

    /* renamed from: kc.b$a */
    final class a implements Tb.a<C14708a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f141774a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Tb.a f141775b;

        @Override // Tb.a
        public final void a(int i10, String str) {
            C15117b.c(i10, str);
            this.f141775b.a(i10, str);
        }

        a(List list, Tb.a aVar) {
            this.f141774a = list;
            this.f141775b = aVar;
        }

        @Override // Tb.a
        public final /* synthetic */ void a(C14708a c14708a) {
            C15117b.this.f141766e.e();
            this.f141775b.a(null);
        }
    }

    /* renamed from: kc.b$b, reason: collision with other inner class name */
    final class RunnableC2245b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C15116a f141777a;

        RunnableC2245b(C15116a c15116a) {
            this.f141777a = c15116a;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r7 = this;
                kc.b r0 = kc.C15117b.this
                kc.a r1 = r7.f141777a
                kc.g r2 = r0.f141768g
                java.lang.String r3 = r1.g()
                java.util.Map<java.lang.String, kc.a> r4 = r2.f141801a
                java.lang.Object r4 = r4.get(r3)
                kc.a r4 = (kc.C15116a) r4
                if (r4 == 0) goto L52
                java.util.Date r3 = r4.n()
                long r3 = r3.getTime()
                r5 = 10000(0x2710, double:4.9407E-320)
                long r3 = r3 + r5
                java.util.Date r5 = new java.util.Date
                r5.<init>(r3)
                java.util.Date r3 = r1.n()
                if (r3 != 0) goto L2c
                r3 = 0
                goto L30
            L2c:
                boolean r3 = r3.after(r5)
            L30:
                if (r3 == 0) goto L46
                r1.g()
                java.util.Date r3 = r1.n()
                java.util.Objects.toString(r3)
                java.util.Map<java.lang.String, kc.a> r2 = r2.f141801a
                java.lang.String r3 = r1.g()
                r2.put(r3, r1)
                goto L61
            L46:
                r1.g()
                java.util.Date r2 = r1.n()
                java.util.Objects.toString(r2)
                r2 = 0
                goto L62
            L52:
                r1.g()
                java.util.Date r4 = r1.n()
                java.util.Objects.toString(r4)
                java.util.Map<java.lang.String, kc.a> r2 = r2.f141801a
                r2.put(r3, r1)
            L61:
                r2 = r1
            L62:
                if (r2 == 0) goto L7e
                bc.e<kc.a> r2 = r0.f141766e
                r2.b(r1)
                bc.e<kc.a> r2 = r0.f141766e
                r2.a()
                kc.o r0 = r0.f141765d
                r0.a()
                r1.g()
                java.util.Date r0 = r1.n()
                java.util.Objects.toString(r0)
                return
            L7e:
                r1.g()
                java.util.Date r0 = r1.n()
                java.util.Objects.toString(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kc.C15117b.RunnableC2245b.run():void");
        }
    }

    static void c(int i10, String str) {
    }

    @Override // kc.m
    public final void a(C15116a c15116a) {
        cc.c cVarA;
        Objects.toString(c15116a);
        if (c15116a == null || c15116a.g() == null) {
            return;
        }
        if (this.f141764c != null && this.f141771j.t() && (cVarA = this.f141764c.a()) != null) {
            c15116a.w(Double.toString(cVarA.f61489a.getLatitude()));
            c15116a.x(Double.toString(cVarA.f61489a.getLongitude()));
            c15116a.o(Float.toString(cVarA.f61489a.getAccuracy()));
            c15116a.s(Long.toString(cVarA.f61489a.getTime()));
        }
        ExecutorService executorService = this.f141769h;
        if (executorService != null && !executorService.isShutdown()) {
            this.f141769h.execute(new RunnableC2245b(c15116a));
        }
        this.f141772k.d(c15116a, this.f141770i.x().e());
    }

    @Override // kc.m
    public final synchronized void b(Tb.a<Void> aVar) {
        try {
            if (this.f141766e.a() >= this.f141763b) {
                List<C15116a> listD = this.f141766e.d();
                listD.size();
                C14709b c14709b = new C14709b();
                ArrayList arrayList = new ArrayList();
                Iterator<C15116a> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add((C15116a) it.next().clone());
                }
                for (C15116a c15116a : arrayList) {
                    if (4 == c15116a.f().byteValue()) {
                        c15116a.A(c15116a.c() + c15116a.g() + c15116a.b());
                    }
                }
                c14709b.b(arrayList);
                c14709b.a(this.f141770i.x().e());
                this.f141762a.a(c14709b, new a(listD, aVar));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C15117b(InterfaceC14344a interfaceC14344a, Context context, InterfaceC6500a interfaceC6500a, Db.e eVar, Db.b bVar, C15119d c15119d) {
        this.f141773l = context;
        this.f141770i = eVar;
        this.f141771j = bVar;
        this.f141762a = interfaceC14344a;
        this.f141764c = interfaceC6500a;
        this.f141772k = c15119d;
        if (this.f141773l != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.qrs.gimbalproximity.SHOULD_DELETE_SESSION_DATA");
            this.f141773l.registerReceiver(this, intentFilter);
        }
        this.f141769h = Yb.a.a("Analytics");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.getAction();
        if ("com.qrs.gimbalproximity.SHOULD_DELETE_SESSION_DATA".equals(intent.getAction())) {
            this.f141766e.f();
        }
    }

    @Override // kc.m
    public final long a() {
        return this.f141766e.c();
    }
}
