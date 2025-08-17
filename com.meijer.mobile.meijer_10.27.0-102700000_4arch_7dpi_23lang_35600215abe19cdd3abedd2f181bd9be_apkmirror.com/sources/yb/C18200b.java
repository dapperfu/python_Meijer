package yb;

import Lb.m;
import Va.k;
import cb.C6380a;
import cb.C6381b;
import java.util.List;

/* renamed from: yb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18200b {

    /* renamed from: a, reason: collision with root package name */
    private static final C6380a f170381a = C6381b.a(C18200b.class.getName());

    /* renamed from: b, reason: collision with root package name */
    static final m<k> f170382b = new m<>(k.class);

    public static k a(Db.b bVar) {
        k kVar = new k();
        try {
            m<k> mVar = f170382b;
            mVar.d(kVar, "name", bVar.k());
            mVar.d(kVar, "identifier", bVar.l());
            List<Db.a> listE = bVar.e();
            if (listE != null && listE.size() > 0) {
                Wa.a aVar = new Wa.a();
                for (Db.a aVar2 : listE) {
                    aVar.a(aVar2.a(), aVar2.b());
                }
                f170382b.d(kVar, "attributes", aVar);
            }
        } catch (Exception unused) {
        }
        return kVar;
    }
}
