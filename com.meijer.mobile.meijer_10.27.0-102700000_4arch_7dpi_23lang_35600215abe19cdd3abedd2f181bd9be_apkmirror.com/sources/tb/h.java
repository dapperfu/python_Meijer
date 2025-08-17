package tb;

import cb.C6380a;
import cb.C6381b;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import fc.AbstractC13873d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import sb.C16919b;
import sb.C16920c;
import vb.C17538d;

/* loaded from: classes4.dex */
public class h extends AbstractC13873d<gc.c, List<Qb.b>> {

    /* renamed from: g, reason: collision with root package name */
    private static final C6380a f161552g = C6381b.a(h.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private Bb.e f161553d;

    /* renamed from: e, reason: collision with root package name */
    private String f161554e;

    /* renamed from: f, reason: collision with root package name */
    private Db.d f161555f;

    private void e(String str, Qb.b[] bVarArr) {
        try {
            for (Qb.b bVar : bVarArr) {
                List<Qb.d> listA = bVar.a();
                ArrayList arrayList = new ArrayList();
                if (listA != null && !listA.isEmpty()) {
                    for (Qb.d dVar : listA) {
                        Ob.g gVar = new Ob.g();
                        gVar.l(dVar.getId());
                        gVar.m(dVar.getName());
                        gVar.n(dVar.c());
                        gVar.h(c.a(dVar.a()));
                        dVar.b();
                        gVar.i(null);
                        gVar.j(dVar.w());
                        arrayList.add(gVar);
                    }
                }
                this.f161555f.x(str, arrayList);
            }
        } catch (Exception unused) {
        }
    }

    @Override // fc.AbstractC13873d
    public final /* synthetic */ void b(gc.c cVar, Rb.a<List<Qb.b>> aVar, C16920c c16920c, C17538d c17538d) {
        gc.c cVar2 = cVar;
        Hb.a aVar2 = this.f130945a;
        String strD = cVar2.d();
        Integer numB = cVar2.b();
        Integer numC = cVar2.c();
        StringBuilder sb2 = new StringBuilder(aVar2.f12373b.V());
        sb2.append("ibeacon/");
        if (strD != null) {
            sb2.append(strD);
        }
        if (numB != null || numC != null) {
            sb2.append("?");
            if (numB != null && numC != null) {
                sb2.append("major=");
                sb2.append(numB);
                sb2.append("&");
                sb2.append("minor=");
                sb2.append(numC);
            } else if (numB != null) {
                sb2.append("major=");
                sb2.append(numB);
            } else if (numC != null) {
                sb2.append("minor=");
                sb2.append(numC);
            }
        }
        String string = sb2.toString();
        HashMap map = new HashMap();
        if (this.f161553d.g() != null) {
            c16920c.g(this.f161554e, this.f161553d.g());
        }
        map.put("X-Client-Timezone", TimeZone.getDefault().getID());
        map.put("X-Client-Platform", "android");
        map.put(C16920c.f160382h, C16920c.f160383i);
        C16919b c16919bF = c16920c.f(string, map);
        try {
            if (c16919bF.f160375c) {
                Qb.b[] bVarArr = (Qb.b[]) c17538d.d(Qb.b[].class, c16919bF.f160376d);
                if (f161552g.b()) {
                    C17538d.e(bVarArr, 4);
                }
                if (bVarArr == null) {
                    aVar.a(Collections.EMPTY_LIST);
                } else {
                    e(cVar2.a(), bVarArr);
                    aVar.a(Arrays.asList(bVarArr));
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
            aVar.a(HttpResponseStatus.SUCCESS_OK, "Resolving iBeacon failed");
        }
    }

    public h(Hb.a aVar, Bb.e eVar, String str, Db.d dVar) {
        super(aVar);
        this.f161553d = eVar;
        this.f161554e = str;
        this.f161555f = dVar;
    }
}
