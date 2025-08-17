package Et;

import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import ut.C17315a;

/* loaded from: classes11.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    private static final C6380a f9798e = C6381b.a(b.class.getName());

    /* renamed from: f, reason: collision with root package name */
    static final C6382c f9799f = C6383d.a(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Set<C17315a> f9800a = new CopyOnWriteArraySet();

    /* renamed from: b, reason: collision with root package name */
    private final k f9801b;

    /* renamed from: c, reason: collision with root package name */
    private final Za.e f9802c;

    /* renamed from: d, reason: collision with root package name */
    final zt.k f9803d;

    final C17315a a(float f10) {
        C17315a c17315a = null;
        for (C17315a c17315a2 : this.f9800a) {
            float fA = c17315a2.f163454d + ((this.f9802c.a() - c17315a2.f163455e) / 1000);
            if (fA <= f10) {
                c17315a = c17315a2;
                f10 = fA;
            }
        }
        return c17315a;
    }

    public final boolean b(C17315a c17315a) {
        k kVar = this.f9801b;
        List<C17315a> listC = kVar.f9853c.c();
        ArrayList arrayList = new ArrayList();
        for (C17315a c17315a2 : listC) {
            if (kVar.f9852b.a() - c17315a2.f163455e < 900000) {
                arrayList.add(c17315a2);
            }
        }
        boolean zB = arrayList.size() >= 3 ? kVar.b(arrayList, c17315a) : true;
        kVar.f9853c.a(c17315a);
        if (zB) {
            this.f9800a.add(c17315a);
        }
        return c17315a != null && c17315a.f163454d <= 100.0f;
    }

    public b(k kVar, zt.k kVar2, Za.e eVar) {
        this.f9801b = kVar;
        this.f9803d = kVar2;
        this.f9802c = eVar;
    }
}
