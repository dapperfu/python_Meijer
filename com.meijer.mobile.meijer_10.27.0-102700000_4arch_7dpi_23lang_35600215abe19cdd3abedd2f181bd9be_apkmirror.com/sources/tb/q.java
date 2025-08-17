package tb;

import cb.C6380a;
import cb.C6381b;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class q implements Bb.k {

    /* renamed from: h, reason: collision with root package name */
    private static C6380a f161604h = C6381b.a(q.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private Bb.b f161605a;

    /* renamed from: b, reason: collision with root package name */
    public AtomicBoolean f161606b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public AtomicBoolean f161607c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    AtomicBoolean f161608d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private Za.e f161609e;

    /* renamed from: f, reason: collision with root package name */
    private r f161610f;

    /* renamed from: g, reason: collision with root package name */
    private Bb.a f161611g;

    private synchronized void b() {
        try {
            String strF = Bb.b.f(this.f161605a.e().L(), Bb.b.f2118c);
            if (strF == null) {
                this.f161606b = new AtomicBoolean(false);
                this.f161611g = null;
            }
            Bb.a aVar = new Bb.a(strF);
            this.f161611g = aVar;
            if (aVar.c() == 0 && aVar.d() == 0 && aVar.a() == 0 && aVar.b() == 0) {
                this.f161606b = new AtomicBoolean(false);
                this.f161611g = null;
            } else {
                r rVar = this.f161610f;
                int iC = this.f161611g.c();
                int iD = this.f161611g.d();
                int iA = this.f161611g.a();
                int iB = this.f161611g.b();
                Calendar calendar = Calendar.getInstance(rVar.f161612a.b());
                calendar.setTimeInMillis(rVar.f161612a.a());
                Calendar calendar2 = Calendar.getInstance(rVar.f161612a.b());
                calendar2.set(11, iC);
                calendar2.set(12, iD);
                Calendar calendar3 = Calendar.getInstance(rVar.f161612a.b());
                calendar3.set(11, iA);
                calendar3.set(12, iB);
                this.f161606b.set(calendar.after(calendar2) && calendar.before(calendar3));
            }
            this.f161607c.set((this.f161605a.e().N() == null || this.f161605a.e().N().isEmpty()) ? false : true);
            if (!this.f161607c.get() && !this.f161606b.get()) {
                this.f161608d = new AtomicBoolean(false);
            } else if (!this.f161607c.get() || this.f161606b.get() || Bb.b.i(this.f161605a.e().H(), false)) {
                this.f161608d = new AtomicBoolean(true);
            } else {
                this.f161608d = new AtomicBoolean(false);
            }
            this.f161605a.f2120a.f("thirdPartyScannerStateChange", Boolean.valueOf(!r0.f2120a.h("thirdPartyScannerStateChange", Boolean.FALSE).booleanValue()));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if ("thirdPartyBeaconScanSchedule".equals(str) || "reportThirdPartySightingOnResolveWhenScheduleIsoff".equals(str) || "ibeaconToResolve".equals(str)) {
            b();
        }
    }

    public q(Bb.b bVar, Za.e eVar, r rVar) {
        this.f161605a = bVar;
        this.f161609e = eVar;
        this.f161610f = rVar;
        bVar.g(this, "thirdPartyBeaconScanSchedule");
        bVar.g(this, "ibeaconToResolve");
        bVar.g(this, "reportThirdPartySightingOnResolveWhenScheduleIsoff");
        b();
    }
}
