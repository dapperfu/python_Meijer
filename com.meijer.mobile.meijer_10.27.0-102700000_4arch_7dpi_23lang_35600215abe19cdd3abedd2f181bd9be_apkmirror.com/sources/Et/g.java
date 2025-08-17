package Et;

import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import com.medallia.digital.mobilesdk.q2;
import java.util.List;
import ut.C17315a;
import xt.InterfaceC18093a;
import zt.InterfaceC18576f;

/* loaded from: classes11.dex */
public class g implements d {

    /* renamed from: m, reason: collision with root package name */
    private static final C6380a f9818m = C6381b.a(g.class.getName());

    /* renamed from: n, reason: collision with root package name */
    private static final C6382c f9819n = C6383d.a(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final Za.e f9820a;

    /* renamed from: b, reason: collision with root package name */
    final e f9821b;

    /* renamed from: c, reason: collision with root package name */
    b f9822c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC18093a f9823d;

    /* renamed from: e, reason: collision with root package name */
    final List<InterfaceC18576f> f9824e;

    /* renamed from: f, reason: collision with root package name */
    private final tt.b f9825f;

    /* renamed from: g, reason: collision with root package name */
    private final yt.c f9826g;

    /* renamed from: h, reason: collision with root package name */
    private final zt.k f9827h;

    /* renamed from: i, reason: collision with root package name */
    private final At.a f9828i;

    /* renamed from: j, reason: collision with root package name */
    long f9829j = Long.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    long f9830k = Long.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    long f9831l = Long.MAX_VALUE;

    @Override // Et.d
    public final boolean a(C17315a c17315a) {
        boolean zB = this.f9822c.b(c17315a);
        f9819n.e("Received location: {}  isIdeal: {}", c17315a, Boolean.valueOf(zB));
        return zB;
    }

    final b d() {
        return new b(new k(this.f9823d, this.f9820a, this.f9826g), this.f9827h, this.f9820a);
    }

    final C17315a e(List<String> list) {
        long jA = this.f9820a.a();
        this.f9821b.a(5000L, this, list);
        if (list.contains("gps")) {
            this.f9825f.b((this.f9820a.a() - jA) / 1000.0d);
        }
        b bVar = this.f9822c;
        long jMax = Math.max(0L, this.f9820a.a() - this.f9830k);
        long jMax2 = Math.max(0L, this.f9820a.a() - this.f9831l);
        long jMax3 = Math.max(0L, this.f9820a.a() - this.f9829j);
        float fMin = bVar.f9803d.a() ? Math.min(1600.0f, ((Math.max(jMax, jMax3) / 1000) * 60.0f) + 500.0f) : Math.min(400.0f, Math.max(200.0f, ((Math.max(jMax, jMax3) / 1000) * 10.0f) + 100.0f));
        b.f9799f.e("Acceptable fix accuracy: {}   on time: {}", Float.valueOf(fMin), (jMax / 1000.0d) + q2.f92724c + (jMax2 / 1000.0d) + q2.f92724c + (jMax3 / 1000.0d));
        return bVar.a(fMin);
    }

    final boolean f() {
        return this.f9828i.d() != Ct.a.ULTRA_LOW_BATTERY_CONSUMPTION;
    }

    public g(e eVar, InterfaceC18093a interfaceC18093a, zt.k kVar, Za.e eVar2, List<InterfaceC18576f> list, tt.b bVar, yt.c cVar, At.a aVar) {
        this.f9821b = eVar;
        this.f9823d = interfaceC18093a;
        this.f9827h = kVar;
        this.f9820a = eVar2;
        this.f9824e = list;
        this.f9825f = bVar;
        this.f9826g = cVar;
        this.f9828i = aVar;
    }
}
