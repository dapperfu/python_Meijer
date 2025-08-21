package Et;

import com.medallia.digital.mobilesdk.q2;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.List;
import ut.C17467a;
import xt.InterfaceC18221a;
import zt.InterfaceC18552f;

/* loaded from: classes12.dex */
public class g implements d {

    /* renamed from: m, reason: collision with root package name */
    private static final C13784a f8530m = C13785b.a(g.class.getName());

    /* renamed from: n, reason: collision with root package name */
    private static final C13786c f8531n = C13787d.a(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final bb.e f8532a;

    /* renamed from: b, reason: collision with root package name */
    final e f8533b;

    /* renamed from: c, reason: collision with root package name */
    b f8534c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC18221a f8535d;

    /* renamed from: e, reason: collision with root package name */
    final List<InterfaceC18552f> f8536e;

    /* renamed from: f, reason: collision with root package name */
    private final tt.b f8537f;

    /* renamed from: g, reason: collision with root package name */
    private final yt.c f8538g;

    /* renamed from: h, reason: collision with root package name */
    private final zt.k f8539h;

    /* renamed from: i, reason: collision with root package name */
    private final At.a f8540i;

    /* renamed from: j, reason: collision with root package name */
    long f8541j = Long.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    long f8542k = Long.MAX_VALUE;

    /* renamed from: l, reason: collision with root package name */
    long f8543l = Long.MAX_VALUE;

    @Override // Et.d
    public final boolean a(C17467a c17467a) {
        boolean zB = this.f8534c.b(c17467a);
        f8531n.e("Received location: {}  isIdeal: {}", c17467a, Boolean.valueOf(zB));
        return zB;
    }

    final b d() {
        return new b(new k(this.f8535d, this.f8532a, this.f8538g), this.f8539h, this.f8532a);
    }

    final C17467a e(List<String> list) {
        long jA = this.f8532a.a();
        this.f8533b.a(5000L, this, list);
        if (list.contains("gps")) {
            this.f8537f.b((this.f8532a.a() - jA) / 1000.0d);
        }
        b bVar = this.f8534c;
        long jMax = Math.max(0L, this.f8532a.a() - this.f8542k);
        long jMax2 = Math.max(0L, this.f8532a.a() - this.f8543l);
        long jMax3 = Math.max(0L, this.f8532a.a() - this.f8541j);
        float fMin = bVar.f8515d.a() ? Math.min(1600.0f, ((Math.max(jMax, jMax3) / 1000) * 60.0f) + 500.0f) : Math.min(400.0f, Math.max(200.0f, ((Math.max(jMax, jMax3) / 1000) * 10.0f) + 100.0f));
        b.f8511f.e("Acceptable fix accuracy: {}   on time: {}", Float.valueOf(fMin), (jMax / 1000.0d) + q2.f93563c + (jMax2 / 1000.0d) + q2.f93563c + (jMax3 / 1000.0d));
        return bVar.a(fMin);
    }

    final boolean f() {
        return this.f8540i.d() != Ct.a.ULTRA_LOW_BATTERY_CONSUMPTION;
    }

    public g(e eVar, InterfaceC18221a interfaceC18221a, zt.k kVar, bb.e eVar2, List<InterfaceC18552f> list, tt.b bVar, yt.c cVar, At.a aVar) {
        this.f8533b = eVar;
        this.f8535d = interfaceC18221a;
        this.f8539h = kVar;
        this.f8532a = eVar2;
        this.f8536e = list;
        this.f8537f = bVar;
        this.f8538g = cVar;
        this.f8540i = aVar;
    }
}
