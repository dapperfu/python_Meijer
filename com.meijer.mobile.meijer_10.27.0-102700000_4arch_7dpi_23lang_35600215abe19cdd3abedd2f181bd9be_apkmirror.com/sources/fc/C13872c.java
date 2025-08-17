package fc;

import cb.C6380a;
import cb.C6381b;
import gc.C14232a;
import gc.C14233b;
import java.util.HashMap;
import sb.C16919b;
import sb.C16920c;
import vb.C17538d;

/* renamed from: fc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13872c extends AbstractC13873d<C14233b, C14232a> {

    /* renamed from: d, reason: collision with root package name */
    private static final C6380a f130942d = C6381b.a(C13872c.class.getName());

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fc.AbstractC13873d
    public final /* synthetic */ void b(C14233b c14233b, Rb.a<C14232a> aVar, C16920c c16920c, C17538d c17538d) throws Throwable {
        C14233b c14233b2 = c14233b;
        Hb.a aVar2 = this.f130945a;
        String str = String.format("%s%s%s", aVar2.f12373b.Q(), "api/mbr/v1/", String.format("%s%s%s", "receivers/", aVar2.f12374c, "/sightings"));
        if (f130942d.b()) {
            C17538d.e(c14233b2, 4);
        }
        try {
            HashMap map = new HashMap();
            map.put(C16920c.f160382h, C16920c.f160384j);
            C16919b c16919bE = c16920c.e(str, c17538d.h(c14233b2), map);
            if (c16919bE.f160375c) {
                aVar.a(c17538d.d(C14232a.class, c16919bE.f160376d));
            } else {
                aVar.a(c16919bE.f160373a, c16919bE.f160374b);
            }
        } catch (Exception e10) {
            e10.getMessage();
            aVar.a(100, e10.getLocalizedMessage());
        }
    }

    public C13872c(Hb.a aVar) {
        super(aVar);
    }
}
