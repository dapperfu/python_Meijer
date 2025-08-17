package Ya;

import Ya.a;
import cb.C6380a;
import cb.C6381b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* loaded from: classes4.dex */
public class d implements Xa.b, a.InterfaceC0864a, e {

    /* renamed from: f, reason: collision with root package name */
    private static final C6380a f40223f = C6381b.a(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final a f40224a;

    /* renamed from: b, reason: collision with root package name */
    private final Za.c f40225b;

    /* renamed from: c, reason: collision with root package name */
    private final Za.e f40226c;

    /* renamed from: d, reason: collision with root package name */
    float f40227d;

    /* renamed from: e, reason: collision with root package name */
    public List<c> f40228e = new ArrayList();

    private static String d(long j10) {
        return (j10 < 1 || j10 > 4611686018427387903L) ? "Never" : new Date(j10).toString();
    }

    private synchronized void g() {
        String strE = "NO REASON";
        long j10 = 4611686018427387903L;
        for (c cVar : this.f40228e) {
            try {
                cVar.e();
                long jV = cVar.v();
                if (f40223f.a()) {
                    cVar.e();
                    d(jV);
                }
                if (jV < j10) {
                    try {
                        strE = cVar.e();
                    } catch (RuntimeException unused) {
                    }
                    j10 = jV;
                }
            } catch (RuntimeException unused2) {
            }
        }
        long jMax = Math.max(j10, i() + 5000);
        if (jMax < i() + 43200000000L) {
            if (jMax < f() - 5000) {
                a aVar = this.f40224a;
                aVar.f40212g.put("com.gimbal.jobs", new WeakReference<>(this));
                try {
                    aVar.f40211f.set(0, jMax, aVar.e("com.gimbal.jobs"));
                    new Date(jMax).toString();
                    System.currentTimeMillis();
                } catch (Exception unused3) {
                    a.f40209j.g("Unable to create com.gimbal.jobs alarm at " + new Date(jMax) + "   " + (((jMax - System.currentTimeMillis()) / 1000.0d) / 60.0d) + " mins  for: " + strE, new Object[0]);
                }
                b(jMax);
            }
        } else if (f() != 4611686018427387903L) {
            h();
        }
    }

    @Override // Ya.a.InterfaceC0864a
    public final synchronized void a() {
        try {
            b(4611686018427387903L);
            int i10 = 0;
            for (c cVar : this.f40228e) {
                long jV = cVar.v();
                if (f40223f.a()) {
                    cVar.e();
                    d(cVar.s());
                    d(jV);
                }
                if (jV <= i() + cVar.o()) {
                    i10++;
                    cVar.g();
                }
            }
            if (i10 == 0) {
                g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(c... cVarArr) {
        for (int i10 = 0; i10 <= 0; i10++) {
            try {
                c cVar = cVarArr[0];
                if (!this.f40228e.contains(cVar)) {
                    cVar.f40219h = this;
                    this.f40228e.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g();
    }

    public final synchronized void e() {
        try {
            Iterator<c> it = this.f40228e.iterator();
            while (it.hasNext()) {
                it.next().f40219h = null;
            }
            this.f40228e.clear();
            h();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void b(long j10) {
        this.f40225b.e("JM_NEXT_ALARM", j10);
    }

    private long f() {
        return this.f40225b.b("JM_NEXT_ALARM", 4611686018427387903L);
    }

    private void h() {
        a aVar = this.f40224a;
        aVar.f40211f.cancel(aVar.e("com.gimbal.jobs"));
        aVar.f40212g.remove("com.gimbal.jobs");
        b(4611686018427387903L);
    }

    private long i() {
        return this.f40226c.a();
    }

    public d(a aVar, Za.c cVar, Za.e eVar, Xa.a aVar2) {
        this.f40224a = aVar;
        this.f40225b = cVar;
        this.f40226c = eVar;
        float f10 = cVar.f42571a.getFloat("JOB_SLOT_FACTOR", -1.0f);
        this.f40227d = f10;
        if (f10 < 0.0f) {
            float fNextDouble = (float) new Random().nextDouble();
            this.f40227d = fNextDouble;
            cVar.c("JOB_SLOT_FACTOR", fNextDouble);
        }
        aVar2.f39183e.e(this);
        b(4611686018427387903L);
    }

    @Override // Ya.e
    public final synchronized void d() {
        g();
    }

    @Override // Ya.e
    public final float c() {
        return this.f40227d;
    }

    @Override // Xa.b
    public final void a(boolean z10) {
        if (z10) {
            g();
        }
    }
}
