package vb;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import eb.C13784a;
import eb.C13785b;
import hc.AbstractC14503d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import ub.C17366b;
import ub.C17367c;
import xb.C18150d;

/* loaded from: classes4.dex */
public class h extends AbstractC14503d<ic.c, List<Sb.b>> {

    /* renamed from: g, reason: collision with root package name */
    private static final C13784a f165730g = C13785b.a(h.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private Db.e f165731d;

    /* renamed from: e, reason: collision with root package name */
    private String f165732e;

    /* renamed from: f, reason: collision with root package name */
    private Fb.d f165733f;

    private void e(String str, Sb.b[] bVarArr) {
        try {
            for (Sb.b bVar : bVarArr) {
                List<Sb.d> listA = bVar.a();
                ArrayList arrayList = new ArrayList();
                if (listA != null && !listA.isEmpty()) {
                    for (Sb.d dVar : listA) {
                        Qb.g gVar = new Qb.g();
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
                this.f165733f.x(str, arrayList);
            }
        } catch (Exception unused) {
        }
    }

    @Override // hc.AbstractC14503d
    public final /* synthetic */ void b(ic.c cVar, Tb.a<List<Sb.b>> aVar, C17367c c17367c, C18150d c18150d) {
        ic.c cVar2 = cVar;
        Jb.a aVar2 = this.f135291a;
        String strD = cVar2.d();
        Integer numB = cVar2.b();
        Integer numC = cVar2.c();
        StringBuilder sb2 = new StringBuilder(aVar2.f15683b.V());
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
        if (this.f165731d.g() != null) {
            c17367c.g(this.f165732e, this.f165731d.g());
        }
        map.put("X-Client-Timezone", TimeZone.getDefault().getID());
        map.put("X-Client-Platform", "android");
        map.put(C17367c.f163868h, C17367c.f163869i);
        C17366b c17366bF = c17367c.f(string, map);
        try {
            if (c17366bF.f163861c) {
                Sb.b[] bVarArr = (Sb.b[]) c18150d.d(Sb.b[].class, c17366bF.f163862d);
                if (f165730g.b()) {
                    C18150d.e(bVarArr, 4);
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

    public h(Jb.a aVar, Db.e eVar, String str, Fb.d dVar) {
        super(aVar);
        this.f165731d = eVar;
        this.f165732e = str;
        this.f165733f = dVar;
    }
}
