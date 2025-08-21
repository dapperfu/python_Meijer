package vb;

import eb.C13784a;
import eb.C13785b;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class q implements Db.k {

    /* renamed from: h, reason: collision with root package name */
    private static C13784a f165782h = C13785b.a(q.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Db.b f165783a;

    /* renamed from: b, reason: collision with root package name */
    public AtomicBoolean f165784b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public AtomicBoolean f165785c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    AtomicBoolean f165786d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private bb.e f165787e;

    /* renamed from: f, reason: collision with root package name */
    private r f165788f;

    /* renamed from: g, reason: collision with root package name */
    private Db.a f165789g;

    private synchronized void b() {
        try {
            String strF = Db.b.f(this.f165783a.e().L(), Db.b.f6063c);
            if (strF == null) {
                this.f165784b = new AtomicBoolean(false);
                this.f165789g = null;
            }
            Db.a aVar = new Db.a(strF);
            this.f165789g = aVar;
            if (aVar.c() == 0 && aVar.d() == 0 && aVar.a() == 0 && aVar.b() == 0) {
                this.f165784b = new AtomicBoolean(false);
                this.f165789g = null;
            } else {
                r rVar = this.f165788f;
                int iC = this.f165789g.c();
                int iD = this.f165789g.d();
                int iA = this.f165789g.a();
                int iB = this.f165789g.b();
                Calendar calendar = Calendar.getInstance(rVar.f165790a.b());
                calendar.setTimeInMillis(rVar.f165790a.a());
                Calendar calendar2 = Calendar.getInstance(rVar.f165790a.b());
                calendar2.set(11, iC);
                calendar2.set(12, iD);
                Calendar calendar3 = Calendar.getInstance(rVar.f165790a.b());
                calendar3.set(11, iA);
                calendar3.set(12, iB);
                this.f165784b.set(calendar.after(calendar2) && calendar.before(calendar3));
            }
            this.f165785c.set((this.f165783a.e().N() == null || this.f165783a.e().N().isEmpty()) ? false : true);
            if (!this.f165785c.get() && !this.f165784b.get()) {
                this.f165786d = new AtomicBoolean(false);
            } else if (!this.f165785c.get() || this.f165784b.get() || Db.b.i(this.f165783a.e().H(), false)) {
                this.f165786d = new AtomicBoolean(true);
            } else {
                this.f165786d = new AtomicBoolean(false);
            }
            this.f165783a.f6065a.e("thirdPartyScannerStateChange", Boolean.valueOf(!r0.f6065a.g("thirdPartyScannerStateChange", Boolean.FALSE).booleanValue()));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Db.k
    public final void a(String str, Object obj) {
        if ("thirdPartyBeaconScanSchedule".equals(str) || "reportThirdPartySightingOnResolveWhenScheduleIsoff".equals(str) || "ibeaconToResolve".equals(str)) {
            b();
        }
    }

    public q(Db.b bVar, bb.e eVar, r rVar) {
        this.f165783a = bVar;
        this.f165787e = eVar;
        this.f165788f = rVar;
        bVar.g(this, "thirdPartyBeaconScanSchedule");
        bVar.g(this, "ibeaconToResolve");
        bVar.g(this, "reportThirdPartySightingOnResolveWhenScheduleIsoff");
        b();
    }
}
