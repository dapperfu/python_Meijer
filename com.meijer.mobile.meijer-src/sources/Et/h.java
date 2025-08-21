package Et;

import com.google.android.gms.common.api.a;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kt.C15422h;
import kt.C15423i;
import pt.InterfaceC16543c;
import s5.C17020a;
import ut.C17467a;
import yt.C18373a;

/* loaded from: classes12.dex */
public class h implements Dt.d {

    /* renamed from: k, reason: collision with root package name */
    private static final C13784a f8544k = C13785b.a(h.class.getName());

    /* renamed from: l, reason: collision with root package name */
    private static final C13786c f8545l = C13787d.a("PLACE");

    /* renamed from: a, reason: collision with root package name */
    private final bb.e f8546a;

    /* renamed from: b, reason: collision with root package name */
    private final xt.c f8547b;

    /* renamed from: c, reason: collision with root package name */
    private C17467a f8548c = new C17467a(0.0d, 0.0d, 0.0f, "network", 0);

    /* renamed from: d, reason: collision with root package name */
    private final qt.d f8549d;

    /* renamed from: e, reason: collision with root package name */
    private long f8550e;

    /* renamed from: f, reason: collision with root package name */
    private final C18373a f8551f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC16543c f8552g;

    /* renamed from: h, reason: collision with root package name */
    private final C17020a f8553h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f8554i;

    /* renamed from: j, reason: collision with root package name */
    private final Db.e f8555j;

    @Override // ut.InterfaceC17468b
    public final void a(C17467a c17467a) {
        if (c17467a != null) {
            this.f8548c = c17467a;
            this.f8550e = c17467a.f164533e;
        }
    }

    private int b(At.a aVar, int i10, Map<Long, C15423i> map) {
        C18373a c18373a = this.f8551f;
        double dA = c18373a.a() * 1.5d;
        double dB = Db.b.b(c18373a.f172076f.e().a(), 20);
        if (dA < C18373a.b(dB)) {
            dA = C18373a.b(dB);
        }
        float f10 = (float) dA;
        ArrayList<kt.k> arrayList = new ArrayList();
        Iterator<C15422h> it = this.f8552g.a().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        int i11 = Integer.MAX_VALUE;
        kt.k kVar = null;
        kt.k kVar2 = null;
        float f11 = Float.MAX_VALUE;
        int i12 = i10;
        for (kt.k kVar3 : arrayList) {
            C15423i c15423i = kVar3 instanceof C15422h ? map.get(kVar3.getId()) : null;
            if (c15423i == null || !kt.n.AT.name().equals(c15423i.c())) {
                this.f8553h.h(kVar3);
            }
            float fA = this.f8547b.a(kVar3, this.f8548c);
            float fB = fA / f10;
            if (c15423i != null && kt.n.AT.name().equals(c15423i.c())) {
                fB += aVar.b();
            }
            float fA2 = fB - ((this.f8546a.a() - this.f8550e) / 1000);
            int i13 = i12;
            if (i13 > fA2) {
                i13 = (int) fA2;
                kVar2 = kVar3;
            }
            i12 = i13;
            if (i11 > fA2) {
                i11 = (int) fA2;
                kVar = kVar3;
                f11 = fA;
            }
        }
        int i14 = i12;
        if (this.f8554i && this.f8555j.e() && kVar != null) {
            f8545l.b("Nearest place is: {}  it is {} meters away", kVar.getName(), Float.valueOf(f11));
        }
        if (kVar2 != null) {
            kVar2.getName();
        }
        return i14;
    }

    @Override // Dt.d
    public final int f(At.a aVar) {
        HashMap map = new HashMap();
        for (C15423i c15423i : this.f8549d.a()) {
            map.put(c15423i.a(), c15423i);
        }
        return b(aVar, a.e.API_PRIORITY_OTHER, map);
    }

    public h(bb.e eVar, xt.f fVar, C18373a c18373a, qt.d dVar, InterfaceC16543c interfaceC16543c, C17020a c17020a, Nb.g gVar, Db.e eVar2) {
        this.f8546a = eVar;
        this.f8547b = fVar;
        this.f8551f = c18373a;
        this.f8549d = dVar;
        this.f8552g = interfaceC16543c;
        this.f8553h = c17020a;
        this.f8554i = gVar.f20765b;
        this.f8555j = eVar2;
    }

    @Override // ut.InterfaceC17481o
    public final void a() {
        this.f8550e = this.f8546a.a();
    }
}
