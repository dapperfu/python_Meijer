package Ab;

import Nb.m;
import Xa.k;
import eb.C13784a;
import eb.C13785b;
import java.util.List;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final C13784a f230a = C13785b.a(b.class.getName());

    /* renamed from: b, reason: collision with root package name */
    static final m<k> f231b = new m<>(k.class);

    public static k a(Fb.b bVar) {
        k kVar = new k();
        try {
            m<k> mVar = f231b;
            mVar.d(kVar, "name", bVar.k());
            mVar.d(kVar, "identifier", bVar.l());
            List<Fb.a> listE = bVar.e();
            if (listE != null && listE.size() > 0) {
                Ya.a aVar = new Ya.a();
                for (Fb.a aVar2 : listE) {
                    aVar.a(aVar2.a(), aVar2.b());
                }
                f231b.d(kVar, "attributes", aVar);
            }
        } catch (Exception unused) {
        }
        return kVar;
    }
}
