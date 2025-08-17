package Et;

import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kt.C15319h;
import kt.C15320i;
import pt.InterfaceC16417c;
import r5.C16723a;
import ut.C17315a;
import yt.C18302a;

/* loaded from: classes11.dex */
public class h implements Dt.d {

    /* renamed from: k, reason: collision with root package name */
    private static final C6380a f9832k = C6381b.a(h.class.getName());

    /* renamed from: l, reason: collision with root package name */
    private static final C6382c f9833l = C6383d.a("PLACE");

    /* renamed from: a, reason: collision with root package name */
    private final Za.e f9834a;

    /* renamed from: b, reason: collision with root package name */
    private final xt.c f9835b;

    /* renamed from: c, reason: collision with root package name */
    private C17315a f9836c = new C17315a(0.0d, 0.0d, 0.0f, "network", 0);

    /* renamed from: d, reason: collision with root package name */
    private final qt.d f9837d;

    /* renamed from: e, reason: collision with root package name */
    private long f9838e;

    /* renamed from: f, reason: collision with root package name */
    private final C18302a f9839f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC16417c f9840g;

    /* renamed from: h, reason: collision with root package name */
    private final C16723a f9841h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f9842i;

    /* renamed from: j, reason: collision with root package name */
    private final Bb.e f9843j;

    @Override // ut.InterfaceC17316b
    public final void a(C17315a c17315a) {
        if (c17315a != null) {
            this.f9836c = c17315a;
            this.f9838e = c17315a.f163455e;
        }
    }

    private int b(At.a aVar, int i10, Map<Long, C15320i> map) {
        C18302a c18302a = this.f9839f;
        double dA = c18302a.a() * 1.5d;
        double dB = Bb.b.b(c18302a.f171301f.e().a(), 20);
        if (dA < C18302a.b(dB)) {
            dA = C18302a.b(dB);
        }
        float f10 = (float) dA;
        ArrayList<kt.k> arrayList = new ArrayList();
        Iterator<C15319h> it = this.f9840g.a().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        int i11 = Integer.MAX_VALUE;
        kt.k kVar = null;
        kt.k kVar2 = null;
        float f11 = Float.MAX_VALUE;
        int i12 = i10;
        for (kt.k kVar3 : arrayList) {
            C15320i c15320i = kVar3 instanceof C15319h ? map.get(kVar3.getId()) : null;
            if (c15320i == null || !kt.n.AT.name().equals(c15320i.c())) {
                this.f9841h.h(kVar3);
            }
            float fA = this.f9835b.a(kVar3, this.f9836c);
            float fB = fA / f10;
            if (c15320i != null && kt.n.AT.name().equals(c15320i.c())) {
                fB += aVar.b();
            }
            float fA2 = fB - ((this.f9834a.a() - this.f9838e) / 1000);
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
        if (this.f9842i && this.f9843j.e() && kVar != null) {
            f9833l.b("Nearest place is: {}  it is {} meters away", kVar.getName(), Float.valueOf(f11));
        }
        if (kVar2 != null) {
            kVar2.getName();
        }
        return i14;
    }

    @Override // Dt.d
    public final int f(At.a aVar) {
        HashMap map = new HashMap();
        for (C15320i c15320i : this.f9837d.a()) {
            map.put(c15320i.a(), c15320i);
        }
        return b(aVar, a.e.API_PRIORITY_OTHER, map);
    }

    public h(Za.e eVar, xt.f fVar, C18302a c18302a, qt.d dVar, InterfaceC16417c interfaceC16417c, C16723a c16723a, Lb.g gVar, Bb.e eVar2) {
        this.f9834a = eVar;
        this.f9835b = fVar;
        this.f9839f = c18302a;
        this.f9837d = dVar;
        this.f9840g = interfaceC16417c;
        this.f9841h = c16723a;
        this.f9842i = gVar.f17945b;
        this.f9843j = eVar2;
    }

    @Override // ut.InterfaceC17329o
    public final void a() {
        this.f9838e = this.f9834a.a();
    }
}
