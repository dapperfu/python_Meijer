package fc;

import cb.C6380a;
import cb.C6381b;
import gc.e;
import sb.C16919b;
import sb.C16920c;
import vb.C17538d;

/* renamed from: fc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13871b extends AbstractC13873d<gc.d, e> {

    /* renamed from: d, reason: collision with root package name */
    private static final C6380a f130941d = C6381b.a(C13870a.class.getName());

    @Override // fc.AbstractC13873d
    public final /* synthetic */ void b(gc.d dVar, Rb.a<e> aVar, C16920c c16920c, C17538d c17538d) {
        gc.d dVar2 = dVar;
        Hb.a aVar2 = this.f130945a;
        C16919b c16919bF = c16920c.f(aVar2.b(String.format("%s%s%s%s", "beacon/lookahead?payload=", dVar2.a(), "&receiverUUID=", aVar2.f12374c)), null);
        try {
            if (c16919bF.f160375c) {
                e eVar = (e) c17538d.d(e.class, c16919bF.f160376d);
                eVar.i(dVar2.b());
                aVar.a(eVar);
                if (f130941d.b()) {
                    C17538d.e(eVar, 4);
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
            aVar.a(100, e10.getLocalizedMessage());
        }
    }

    public C13871b(Hb.a aVar) {
        super(aVar);
    }
}
