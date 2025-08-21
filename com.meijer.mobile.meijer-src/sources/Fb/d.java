package Fb;

import Db.p;
import Qb.g;
import Qb.h;
import android.content.SharedPreferences;
import eb.C13784a;
import eb.C13785b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class d extends p<Long, b> {

    /* renamed from: i, reason: collision with root package name */
    private static final C13784a f9145i = C13785b.a(d.class.getName());

    public d(SharedPreferences sharedPreferences) {
        super(sharedPreferences, b.class);
    }

    public final Iterator<b> A() throws IOException {
        ArrayList arrayList = new ArrayList();
        p<Long, b>.b bVarE = e();
        try {
            for (b bVar : u()) {
                if (bVar.n()) {
                    arrayList.add(bVar);
                }
            }
            bVarE.b();
            return arrayList.iterator();
        } catch (Throwable th2) {
            bVarE.b();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Db.m
    public final /* synthetic */ Object a(Object obj) {
        return ((b) obj).j();
    }

    public final void x(String str, List<g> list) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Transmitter ID cannot be null");
        }
        p<Long, b>.b bVarE = e();
        try {
            for (g gVar : list) {
                b bVarH = h(gVar.e());
                b bVarA = bVarH == null ? c.a(gVar) : c.b(gVar, bVarH);
                bVarA.k();
                bVarA.a(str);
                g(bVarE, bVarA);
            }
            bVarE.a();
        } catch (Throwable th2) {
            bVarE.a();
            throw th2;
        }
    }

    private void z(Map<Long, g> map) throws IOException {
        p<Long, b>.b bVarE = e();
        try {
            Iterator<b> itB = b();
            while (itB.hasNext()) {
                b next = itB.next();
                g gVar = new g();
                gVar.l(next.j());
                gVar.n(next.l());
                gVar.m(next.k());
                gVar.j(next.f());
                gVar.k(next.g());
                if (next.e() != null) {
                    ArrayList arrayList = new ArrayList();
                    for (a aVar : next.e()) {
                        h hVar = new h();
                        hVar.c(aVar.a());
                        hVar.d(aVar.b());
                        arrayList.add(hVar);
                    }
                    gVar.h(arrayList);
                }
                if (!map.containsValue(gVar) && !next.n() && next.A().isEmpty()) {
                    i(bVarE, next.j());
                }
            }
            bVarE.a();
        } catch (Throwable th2) {
            bVarE.a();
            throw th2;
        }
    }

    public final void y(Map<Long, g> map) throws IOException {
        b bVarB;
        p<Long, b>.b bVarE = e();
        try {
            for (Map.Entry<Long, g> entry : map.entrySet()) {
                Long key = entry.getKey();
                if (key != null) {
                    g value = entry.getValue();
                    if (value.e() != null) {
                        b bVarH = h(value.e());
                        if (bVarH == null) {
                            bVarB = c.a(value);
                        } else {
                            bVarB = c.b(value, bVarH);
                        }
                        bVarB.k();
                        bVarB.c(key);
                        g(bVarE, bVarB);
                    } else {
                        throw new IllegalArgumentException("Place ID cannot be null");
                    }
                } else {
                    throw new IllegalArgumentException("Geofence ID cannot be null");
                }
            }
            bVarE.a();
            z(map);
        } catch (Throwable th2) {
            bVarE.a();
            throw th2;
        }
    }
}
