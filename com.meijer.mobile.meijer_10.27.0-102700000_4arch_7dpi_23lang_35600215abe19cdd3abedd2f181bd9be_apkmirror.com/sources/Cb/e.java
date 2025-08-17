package Cb;

import cb.C6380a;
import cb.C6381b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    private static final C6380a f3760e = C6381b.a(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public d f3761a;

    /* renamed from: b, reason: collision with root package name */
    public c f3762b;

    /* renamed from: c, reason: collision with root package name */
    public Ya.d f3763c;

    /* renamed from: d, reason: collision with root package name */
    Ab.b f3764d;

    public static List<a> a(List<a> list) {
        ArrayList arrayList = new ArrayList();
        for (a aVar : list) {
            if (aVar.b().g().o(aVar.d())) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    public final boolean b(Ab.a aVar, String str) {
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
            this.f3761a.j(aVar2);
            this.f3763c.d();
            return true;
        } catch (IOException unused) {
            aVar.i();
            return true;
        }
    }

    public e(Ab.b bVar, d dVar, Ya.d dVar2) {
        this.f3764d = bVar;
        this.f3761a = dVar;
        this.f3763c = dVar2;
    }
}
