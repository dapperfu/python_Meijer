package ic;

import cb.C6380a;
import cb.C6381b;
import java.util.Date;
import java.util.TimeZone;
import jc.C14882c;
import jc.C14883d;

/* loaded from: classes4.dex */
public class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private static final C6380a f137713a = C6381b.a(i.class.getSimpleName());

    /* renamed from: b, reason: collision with root package name */
    private static i f137714b;

    public static synchronized i c() {
        try {
            if (f137714b == null) {
                f137714b = new i();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f137714b;
    }

    @Override // ic.h
    public final C14713a a(Vb.l lVar, int i10) {
        String strA = Vb.h.a(Sb.a.a(lVar.f37105a));
        return (strA.equalsIgnoreCase(Sb.c.a(Vb.e.f37074a)) ? new C14882c() : strA.equalsIgnoreCase(Sb.c.a(Vb.e.f37076c)) ? new C14883d() : strA.equalsIgnoreCase(Sb.c.a(Vb.e.f37079f)) ? new jc.g() : new jc.e()).a(lVar, i10);
    }

    @Override // ic.h
    public final tb.b b(tb.d dVar, int i10) {
        tb.b bVar = new tb.b();
        bVar.N(dVar.f161547b);
        bVar.P(dVar.f161548c);
        bVar.C(i10);
        bVar.M(dVar.f161546a.toString());
        bVar.S(dVar.f161546a.toString());
        bVar.O(dVar.f161549d);
        bVar.G(TimeZone.getDefault().getID());
        bVar.t(new Date());
        return bVar;
    }

    private i() {
    }
}
