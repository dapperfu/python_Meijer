package Et;

import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import ut.C17467a;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    private static final C13784a f8510e = C13785b.a(b.class.getName());

    /* renamed from: f, reason: collision with root package name */
    static final C13786c f8511f = C13787d.a(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Set<C17467a> f8512a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    private final k f8513b;

    /* renamed from: c, reason: collision with root package name */
    private final bb.e f8514c;

    /* renamed from: d, reason: collision with root package name */
    final zt.k f8515d;

    final C17467a a(float f10) {
        C17467a c17467a = null;
        for (C17467a c17467a2 : this.f8512a) {
            float fA = c17467a2.f164532d + ((this.f8514c.a() - c17467a2.f164533e) / 1000);
            if (fA <= f10) {
                c17467a = c17467a2;
                f10 = fA;
            }
        }
        return c17467a;
    }

    public final boolean b(C17467a c17467a) {
        k kVar = this.f8513b;
        List<C17467a> listC = kVar.f8565c.c();
        ArrayList arrayList = new ArrayList();
        for (C17467a c17467a2 : listC) {
            if (kVar.f8564b.a() - c17467a2.f164533e < 900000) {
                arrayList.add(c17467a2);
            }
        }
        boolean zB = arrayList.size() >= 3 ? kVar.b(arrayList, c17467a) : true;
        kVar.f8565c.a(c17467a);
        if (zB) {
            this.f8512a.add(c17467a);
        }
        return c17467a != null && c17467a.f164532d <= 100.0f;
    }

    public b(k kVar, zt.k kVar2, bb.e eVar) {
        this.f8513b = kVar;
        this.f8515d = kVar2;
        this.f8514c = eVar;
    }
}
