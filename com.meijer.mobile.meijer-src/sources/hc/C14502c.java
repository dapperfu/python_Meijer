package hc;

import eb.C13784a;
import eb.C13785b;
import ic.C14708a;
import ic.C14709b;
import java.util.HashMap;
import ub.C17366b;
import ub.C17367c;
import xb.C18150d;

/* renamed from: hc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14502c extends AbstractC14503d<C14709b, C14708a> {

    /* renamed from: d, reason: collision with root package name */
    private static final C13784a f135288d = C13785b.a(C14502c.class.getName());

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hc.AbstractC14503d
    public final /* synthetic */ void b(C14709b c14709b, Tb.a<C14708a> aVar, C17367c c17367c, C18150d c18150d) throws Throwable {
        C14709b c14709b2 = c14709b;
        Jb.a aVar2 = this.f135291a;
        String str = String.format("%s%s%s", aVar2.f15683b.Q(), "api/mbr/v1/", String.format("%s%s%s", "receivers/", aVar2.f15684c, "/sightings"));
        if (f135288d.b()) {
            C18150d.e(c14709b2, 4);
        }
        try {
            HashMap map = new HashMap();
            map.put(C17367c.f163868h, C17367c.f163870j);
            C17366b c17366bE = c17367c.e(str, c18150d.h(c14709b2), map);
            if (c17366bE.f163861c) {
                aVar.a(c18150d.d(C14708a.class, c17366bE.f163862d));
            } else {
                aVar.a(c17366bE.f163859a, c17366bE.f163860b);
            }
        } catch (Exception e10) {
            e10.getMessage();
            aVar.a(100, e10.getLocalizedMessage());
        }
    }

    public C14502c(Jb.a aVar) {
        super(aVar);
    }
}
