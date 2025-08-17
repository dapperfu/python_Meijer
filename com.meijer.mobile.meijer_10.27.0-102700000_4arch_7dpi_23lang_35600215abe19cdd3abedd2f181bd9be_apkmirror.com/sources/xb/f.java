package xb;

import Bb.i;
import Lb.p;
import cb.C6380a;
import cb.C6381b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import lt.C15500d;
import lt.EnumC15499c;
import ub.InterfaceC17238a;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: h, reason: collision with root package name */
    private static final C6380a f169524h = C6381b.a(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    Bb.e f169525a;

    /* renamed from: b, reason: collision with root package name */
    String f169526b;

    /* renamed from: c, reason: collision with root package name */
    private Db.d f169527c;

    /* renamed from: d, reason: collision with root package name */
    ub.c f169528d;

    /* renamed from: e, reason: collision with root package name */
    i f169529e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC17238a f169530f;

    /* renamed from: g, reason: collision with root package name */
    private p f169531g;

    final List<C15500d> a(Eb.e eVar, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<Db.b> itA = this.f169527c.A();
            while (itA.hasNext()) {
                Db.b next = itA.next();
                C15500d c15500d = new C15500d();
                c15500d.j("Android");
                HashMap map = new HashMap();
                map.put(EnumC15499c.PLACE_ID.name(), next.l());
                if ("DEPART_EVENT".equals(str)) {
                    map.put(EnumC15499c.EVENT_TYPE.name(), "LEFT");
                    map.put(EnumC15499c.AT_TIME.name(), String.valueOf(next.h()));
                    map.put(EnumC15499c.LEFT_TIME.name(), String.valueOf(System.currentTimeMillis()));
                    map.put(EnumC15499c.VISIT_ID.name(), next.m());
                } else {
                    map.put(EnumC15499c.VISIT_ID.name(), this.f169531g.a());
                    map.put(EnumC15499c.EVENT_TYPE.name(), "AT");
                    map.put(EnumC15499c.AT_TIME.name(), String.valueOf(System.currentTimeMillis()));
                }
                if (next.f() == null) {
                    c15500d.m(lt.f.PLACE.name());
                } else {
                    c15500d.m(lt.f.GIMBAL_PLACE.name());
                    map.put(EnumC15499c.DOMAIN.name(), next.f());
                }
                c15500d.f(map);
                c15500d.e(eVar.a());
                c15500d.i(eVar.d());
                c15500d.o(eVar.i());
                this.f169530f.d(c15500d);
                this.f169530f.a(c15500d);
                this.f169530f.e(c15500d);
                if ("ARRIVE_EVENT".equals(str)) {
                    next.y(c15500d.a().get("VISIT_ID"));
                    this.f169527c.j(next);
                }
                arrayList.add(c15500d);
            }
            return arrayList;
        } catch (IOException e10) {
            e10.getMessage();
            return arrayList;
        }
    }

    public f(Bb.e eVar, String str, Db.d dVar, ub.c cVar, i iVar, InterfaceC17238a interfaceC17238a, p pVar) {
        this.f169525a = eVar;
        this.f169526b = str;
        this.f169527c = dVar;
        this.f169528d = cVar;
        this.f169529e = iVar;
        this.f169530f = interfaceC17238a;
        this.f169531g = pVar;
    }
}
