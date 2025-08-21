package ab;

import ab.C5676a;
import bb.C6346c;
import eb.C13784a;
import eb.C13785b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* loaded from: classes4.dex */
public class d implements Za.b, C5676a.InterfaceC0948a, e {

    /* renamed from: f, reason: collision with root package name */
    private static final C13784a f45355f = C13785b.a(d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final C5676a f45356a;

    /* renamed from: b, reason: collision with root package name */
    private final C6346c f45357b;

    /* renamed from: c, reason: collision with root package name */
    private final bb.e f45358c;

    /* renamed from: d, reason: collision with root package name */
    float f45359d;

    /* renamed from: e, reason: collision with root package name */
    public List<AbstractC5678c> f45360e = new ArrayList();

    private static String d(long j10) {
        return (j10 < 1 || j10 > 4611686018427387903L) ? "Never" : new Date(j10).toString();
    }

    private synchronized void g() {
        String strE = "NO REASON";
        long j10 = 4611686018427387903L;
        for (AbstractC5678c abstractC5678c : this.f45360e) {
            try {
                abstractC5678c.e();
                long jV = abstractC5678c.v();
                if (f45355f.a()) {
                    abstractC5678c.e();
                    d(jV);
                }
                if (jV < j10) {
                    try {
                        strE = abstractC5678c.e();
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
                C5676a c5676a = this.f45356a;
                c5676a.f45344g.put("com.gimbal.jobs", new WeakReference<>(this));
                try {
                    c5676a.f45343f.set(0, jMax, c5676a.e("com.gimbal.jobs"));
                    new Date(jMax).toString();
                    System.currentTimeMillis();
                } catch (Exception unused3) {
                    C5676a.f45341j.g("Unable to create com.gimbal.jobs alarm at " + new Date(jMax) + "   " + (((jMax - System.currentTimeMillis()) / 1000.0d) / 60.0d) + " mins  for: " + strE, new Object[0]);
                }
                b(jMax);
            }
        } else if (f() != 4611686018427387903L) {
            h();
        }
    }

    @Override // ab.C5676a.InterfaceC0948a
    public final synchronized void a() {
        try {
            b(4611686018427387903L);
            int i10 = 0;
            for (AbstractC5678c abstractC5678c : this.f45360e) {
                long jV = abstractC5678c.v();
                if (f45355f.a()) {
                    abstractC5678c.e();
                    d(abstractC5678c.s());
                    d(jV);
                }
                if (jV <= i() + abstractC5678c.o()) {
                    i10++;
                    abstractC5678c.g();
                }
            }
            if (i10 == 0) {
                g();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(AbstractC5678c... abstractC5678cArr) {
        for (int i10 = 0; i10 <= 0; i10++) {
            try {
                AbstractC5678c abstractC5678c = abstractC5678cArr[0];
                if (!this.f45360e.contains(abstractC5678c)) {
                    abstractC5678c.f45351h = this;
                    this.f45360e.add(abstractC5678c);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g();
    }

    public final synchronized void e() {
        try {
            Iterator<AbstractC5678c> it = this.f45360e.iterator();
            while (it.hasNext()) {
                it.next().f45351h = null;
            }
            this.f45360e.clear();
            h();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void b(long j10) {
        this.f45357b.e("JM_NEXT_ALARM", j10);
    }

    private long f() {
        return this.f45357b.b("JM_NEXT_ALARM", 4611686018427387903L);
    }

    private void h() {
        C5676a c5676a = this.f45356a;
        c5676a.f45343f.cancel(c5676a.e("com.gimbal.jobs"));
        c5676a.f45344g.remove("com.gimbal.jobs");
        b(4611686018427387903L);
    }

    private long i() {
        return this.f45358c.a();
    }

    public d(C5676a c5676a, C6346c c6346c, bb.e eVar, Za.a aVar) {
        this.f45356a = c5676a;
        this.f45357b = c6346c;
        this.f45358c = eVar;
        float f10 = c6346c.f60238a.getFloat("JOB_SLOT_FACTOR", -1.0f);
        this.f45359d = f10;
        if (f10 < 0.0f) {
            float fNextDouble = (float) new Random().nextDouble();
            this.f45359d = fNextDouble;
            c6346c.c("JOB_SLOT_FACTOR", fNextDouble);
        }
        aVar.f43661e.e(this);
        b(4611686018427387903L);
    }

    @Override // ab.e
    public final synchronized void d() {
        g();
    }

    @Override // ab.e
    public final float c() {
        return this.f45359d;
    }

    @Override // Za.b
    public final void a(boolean z10) {
        if (z10) {
            g();
        }
    }
}
