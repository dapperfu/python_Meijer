package Eb;

import eb.C13784a;
import eb.C13785b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    private static final C13784a f7072e = C13785b.a(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public d f7073a;

    /* renamed from: b, reason: collision with root package name */
    public c f7074b;

    /* renamed from: c, reason: collision with root package name */
    public ab.d f7075c;

    /* renamed from: d, reason: collision with root package name */
    Cb.b f7076d;

    public static List<a> a(List<a> list) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            if (aVar.b().g().o(aVar.d())) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public final boolean b(Cb.a aVar, String str) {
        if (aVar == null) {
            return false;
        }
        aVar.g().g();
        if (aVar.g().g() == 0) {
            return false;
        }
        a aVar2 = new a(aVar.j());
        aVar2.e(aVar);
        aVar2.f(System.currentTimeMillis() + (aVar.g().g() * 1000));
        aVar2.g(str);
        try {
            this.f7073a.j(aVar2);
            this.f7075c.d();
            return true;
        } catch (IOException unused) {
            aVar.i();
            return true;
        }
    }

    public e(Cb.b bVar, d dVar, ab.d dVar2) {
        this.f7076d = bVar;
        this.f7073a = dVar;
        this.f7075c = dVar2;
    }
}
