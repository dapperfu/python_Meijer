package tb;

import cb.C6380a;
import cb.C6381b;
import fc.AbstractC13873d;
import gc.C14232a;
import java.util.HashMap;
import sb.C16919b;
import sb.C16920c;
import vb.C17538d;

/* loaded from: classes4.dex */
public class n extends AbstractC13873d<C17076a, C14232a> {

    /* renamed from: d, reason: collision with root package name */
    private static final C6380a f161593d = C6381b.a(n.class.getName());

    @Override // fc.AbstractC13873d
    public final /* synthetic */ void b(C17076a c17076a, Rb.a<C14232a> aVar, C16920c c16920c, C17538d c17538d) throws Throwable {
        C17076a c17076a2 = c17076a;
        Hb.a aVar2 = this.f130945a;
        String str = String.format("%s%s%s%s", aVar2.f12373b.Q(), "/mbr/v1/receivers/", aVar2.f12374c, "/third-party-sightings");
        if (f161593d.b()) {
            C17538d.e(c17076a2, 4);
        }
        try {
            HashMap map = new HashMap();
            map.put(C16920c.f160382h, C16920c.f160384j);
            C16919b c16919bE = c16920c.e(str, c17538d.h(c17076a2), map);
            if (c16919bE.f160375c) {
                aVar.a((C14232a) c17538d.d(C14232a.class, c16919bE.f160376d));
            } else {
                aVar.a(c16919bE.f160373a, c16919bE.f160374b);
            }
        } catch (Exception e10) {
            e10.getMessage();
            aVar.a(100, e10.getLocalizedMessage());
        }
    }

    public n(Hb.a aVar) {
        super(aVar);
    }
}
