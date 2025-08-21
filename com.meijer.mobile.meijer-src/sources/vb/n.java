package vb;

import eb.C13784a;
import eb.C13785b;
import hc.AbstractC14503d;
import ic.C14708a;
import java.util.HashMap;
import ub.C17366b;
import ub.C17367c;
import xb.C18150d;

/* loaded from: classes4.dex */
public class n extends AbstractC14503d<C17651a, C14708a> {

    /* renamed from: d, reason: collision with root package name */
    private static final C13784a f165771d = C13785b.a(n.class.getName());

    @Override // hc.AbstractC14503d
    public final /* synthetic */ void b(C17651a c17651a, Tb.a<C14708a> aVar, C17367c c17367c, C18150d c18150d) throws Throwable {
        C17651a c17651a2 = c17651a;
        Jb.a aVar2 = this.f135291a;
        String str = String.format("%s%s%s%s", aVar2.f15683b.Q(), "/mbr/v1/receivers/", aVar2.f15684c, "/third-party-sightings");
        if (f165771d.b()) {
            C18150d.e(c17651a2, 4);
        }
        try {
            HashMap map = new HashMap();
            map.put(C17367c.f163868h, C17367c.f163870j);
            C17366b c17366bE = c17367c.e(str, c18150d.h(c17651a2), map);
            if (c17366bE.f163861c) {
                aVar.a((C14708a) c18150d.d(C14708a.class, c17366bE.f163862d));
            } else {
                aVar.a(c17366bE.f163859a, c17366bE.f163860b);
            }
        } catch (Exception e10) {
            e10.getMessage();
            aVar.a(100, e10.getLocalizedMessage());
        }
    }

    public n(Jb.a aVar) {
        super(aVar);
    }
}
