package zb;

import Db.i;
import Nb.p;
import eb.C13784a;
import eb.C13785b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import lt.C15611d;
import lt.EnumC15610c;
import wb.InterfaceC17855a;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: h, reason: collision with root package name */
    private static final C13784a f172673h = C13785b.a(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    Db.e f172674a;

    /* renamed from: b, reason: collision with root package name */
    String f172675b;

    /* renamed from: c, reason: collision with root package name */
    private Fb.d f172676c;

    /* renamed from: d, reason: collision with root package name */
    wb.c f172677d;

    /* renamed from: e, reason: collision with root package name */
    i f172678e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC17855a f172679f;

    /* renamed from: g, reason: collision with root package name */
    private p f172680g;

    final List<C15611d> a(Gb.e eVar, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<Fb.b> itA = this.f172676c.A();
            while (itA.hasNext()) {
                Fb.b next = itA.next();
                C15611d c15611d = new C15611d();
                c15611d.j("Android");
                HashMap map = new HashMap();
                map.put(EnumC15610c.PLACE_ID.name(), next.l());
                if ("DEPART_EVENT".equals(str)) {
                    map.put(EnumC15610c.EVENT_TYPE.name(), "LEFT");
                    map.put(EnumC15610c.AT_TIME.name(), String.valueOf(next.h()));
                    map.put(EnumC15610c.LEFT_TIME.name(), String.valueOf(System.currentTimeMillis()));
                    map.put(EnumC15610c.VISIT_ID.name(), next.m());
                } else {
                    map.put(EnumC15610c.VISIT_ID.name(), this.f172680g.a());
                    map.put(EnumC15610c.EVENT_TYPE.name(), "AT");
                    map.put(EnumC15610c.AT_TIME.name(), String.valueOf(System.currentTimeMillis()));
                }
                if (next.f() == null) {
                    c15611d.m(lt.f.PLACE.name());
                } else {
                    c15611d.m(lt.f.GIMBAL_PLACE.name());
                    map.put(EnumC15610c.DOMAIN.name(), next.f());
                }
                c15611d.f(map);
                c15611d.e(eVar.a());
                c15611d.i(eVar.d());
                c15611d.o(eVar.i());
                this.f172679f.d(c15611d);
                this.f172679f.a(c15611d);
                this.f172679f.e(c15611d);
                if ("ARRIVE_EVENT".equals(str)) {
                    next.y(c15611d.a().get("VISIT_ID"));
                    this.f172676c.j(next);
                }
                arrayList.add(c15611d);
            }
            return arrayList;
        } catch (IOException e10) {
            e10.getMessage();
            return arrayList;
        }
    }

    public f(Db.e eVar, String str, Fb.d dVar, wb.c cVar, i iVar, InterfaceC17855a interfaceC17855a, p pVar) {
        this.f172674a = eVar;
        this.f172675b = str;
        this.f172676c = dVar;
        this.f172677d = cVar;
        this.f172678e = iVar;
        this.f172679f = interfaceC17855a;
        this.f172680g = pVar;
    }
}
