package ic;

import ac.InterfaceC5594a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import ec.InterfaceC13640a;
import gc.C14232a;
import gc.C14233b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* renamed from: ic.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14714b extends BroadcastReceiver implements m {

    /* renamed from: m, reason: collision with root package name */
    private static final C6380a f137671m = C6381b.a(C14714b.class.getName());

    /* renamed from: n, reason: collision with root package name */
    private static final C6382c f137672n = C6383d.a(C14714b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC13640a f137673a;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5594a f137675c;

    /* renamed from: d, reason: collision with root package name */
    public o f137676d;

    /* renamed from: h, reason: collision with root package name */
    public ExecutorService f137680h;

    /* renamed from: i, reason: collision with root package name */
    private Bb.e f137681i;

    /* renamed from: j, reason: collision with root package name */
    private Bb.b f137682j;

    /* renamed from: k, reason: collision with root package name */
    private C14716d f137683k;

    /* renamed from: l, reason: collision with root package name */
    public Context f137684l;

    /* renamed from: b, reason: collision with root package name */
    private int f137674b = 1;

    /* renamed from: e, reason: collision with root package name */
    Zb.e<C14713a> f137677e = new Zb.e<>(new Za.b());

    /* renamed from: f, reason: collision with root package name */
    private List<C14713a> f137678f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    g f137679g = new g();

    /* renamed from: ic.b$a */
    final class a implements Rb.a<C14232a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f137685a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Rb.a f137686b;

        @Override // Rb.a
        public final void a(int i10, String str) {
            C14714b.c(i10, str);
            this.f137686b.a(i10, str);
        }

        a(List list, Rb.a aVar) {
            this.f137685a = list;
            this.f137686b = aVar;
        }

        @Override // Rb.a
        public final /* synthetic */ void a(C14232a c14232a) {
            C14714b.this.f137677e.e();
            this.f137686b.a(null);
        }
    }

    /* renamed from: ic.b$b, reason: collision with other inner class name */
    final class RunnableC2173b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C14713a f137688a;

        RunnableC2173b(C14713a c14713a) {
            this.f137688a = c14713a;
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
                ic.b r0 = ic.C14714b.this
                ic.a r1 = r7.f137688a
                ic.g r2 = r0.f137679g
                java.lang.String r3 = r1.g()
                java.util.Map<java.lang.String, ic.a> r4 = r2.f137712a
                java.lang.Object r4 = r4.get(r3)
                ic.a r4 = (ic.C14713a) r4
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
                java.util.Map<java.lang.String, ic.a> r2 = r2.f137712a
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
                java.util.Map<java.lang.String, ic.a> r2 = r2.f137712a
                r2.put(r3, r1)
            L61:
                r2 = r1
            L62:
                if (r2 == 0) goto L7e
                Zb.e<ic.a> r2 = r0.f137677e
                r2.b(r1)
                Zb.e<ic.a> r2 = r0.f137677e
                r2.a()
                ic.o r0 = r0.f137676d
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
            throw new UnsupportedOperationException("Method not decompiled: ic.C14714b.RunnableC2173b.run():void");
        }
    }

    static void c(int i10, String str) {
    }

    @Override // ic.m
    public final long a() {
        return this.f137677e.c();
    }

    @Override // ic.m
    public final synchronized void a(Rb.a<Void> aVar) {
        try {
            if (this.f137677e.a() >= this.f137674b) {
                List<C14713a> listD = this.f137677e.d();
                listD.size();
                C14233b c14233b = new C14233b();
                ArrayList arrayList = new ArrayList();
                Iterator<C14713a> it = listD.iterator();
                while (it.hasNext()) {
                    arrayList.add((C14713a) it.next().clone());
                }
                for (C14713a c14713a : arrayList) {
                    if (4 == c14713a.f().byteValue()) {
                        c14713a.A(c14713a.c() + c14713a.g() + c14713a.b());
                    }
                }
                c14233b.b(arrayList);
                c14233b.a(this.f137681i.x().e());
                this.f137673a.d(c14233b, new a(listD, aVar));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C14714b(InterfaceC13640a interfaceC13640a, Context context, InterfaceC5594a interfaceC5594a, Bb.e eVar, Bb.b bVar, C14716d c14716d) {
        this.f137684l = context;
        this.f137681i = eVar;
        this.f137682j = bVar;
        this.f137673a = interfaceC13640a;
        this.f137675c = interfaceC5594a;
        this.f137683k = c14716d;
        if (this.f137684l != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.qrs.gimbalproximity.SHOULD_DELETE_SESSION_DATA");
            this.f137684l.registerReceiver(this, intentFilter);
        }
        this.f137680h = Wb.a.a("Analytics");
    }

    @Override // ic.m
    public final void b(C14713a c14713a) {
        ac.c cVarA;
        Objects.toString(c14713a);
        if (c14713a != null && c14713a.g() != null) {
            if (this.f137675c != null && this.f137682j.t() && (cVarA = this.f137675c.a()) != null) {
                c14713a.w(Double.toString(cVarA.f44474a.getLatitude()));
                c14713a.x(Double.toString(cVarA.f44474a.getLongitude()));
                c14713a.o(Float.toString(cVarA.f44474a.getAccuracy()));
                c14713a.s(Long.toString(cVarA.f44474a.getTime()));
            }
            ExecutorService executorService = this.f137680h;
            if (executorService != null && !executorService.isShutdown()) {
                this.f137680h.execute(new RunnableC2173b(c14713a));
            }
            this.f137683k.d(c14713a, this.f137681i.x().e());
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.getAction();
        if ("com.qrs.gimbalproximity.SHOULD_DELETE_SESSION_DATA".equals(intent.getAction())) {
            this.f137677e.f();
        }
    }
}
