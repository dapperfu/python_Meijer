package Mb;

import Kb.f;
import Kb.h;
import Kb.j;
import Kb.m;
import bb.e;
import eb.C13784a;
import eb.C13785b;
import j$.util.DesugarTimeZone;
import java.util.TimeZone;
import nt.InterfaceC16021c;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: f, reason: collision with root package name */
    private static final C13784a f19721f = C13785b.a(c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final h f19722a;

    /* renamed from: b, reason: collision with root package name */
    private final f f19723b;

    /* renamed from: c, reason: collision with root package name */
    private e f19724c;

    /* renamed from: d, reason: collision with root package name */
    private d f19725d;

    /* renamed from: e, reason: collision with root package name */
    private Db.e f19726e;

    final class a implements InterfaceC16021c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19727a;

        @Override // nt.InterfaceC16021c
        public final void a(int i10, String str) {
            C13784a unused = c.f19721f;
        }

        a(String str) {
            this.f19727a = str;
        }

        @Override // nt.InterfaceC16021c
        public final /* synthetic */ void a(Void r22) {
            c.this.f19726e.u(this.f19727a);
            C13784a unused = c.f19721f;
        }
    }

    public final void b() {
        String strO = this.f19726e.O();
        TimeZone timeZoneB = this.f19724c.b();
        if (strO != null) {
            if (strO.equals(timeZoneB.getID())) {
                return;
            }
            TimeZone timeZone = DesugarTimeZone.getTimeZone(strO);
            long jA = this.f19724c.a();
            if (timeZone.getOffset(jA) == timeZoneB.getOffset(jA)) {
                return;
            }
        }
        d dVar = this.f19725d;
        dVar.f19732b.add(Long.valueOf(dVar.f19731a.a()));
        while (true) {
            if (dVar.f19732b.size() <= 4 && (dVar.f19732b.size() <= 0 || dVar.f19732b.get(0).longValue() >= dVar.f19731a.a() - d.f19730e)) {
                break;
            } else {
                dVar.f19732b.remove(0);
            }
        }
        dVar.f19733c.o(dVar.f19732b);
        if (dVar.f19732b.size() <= 3) {
            String id2 = timeZoneB.getID();
            new m(this.f19722a).i(this.f19723b.b(j.f16528a, "timezone"), null, new a(id2));
        }
    }

    public c(h hVar, f fVar, Db.e eVar, e eVar2, d dVar) {
        this.f19722a = hVar;
        this.f19723b = fVar;
        this.f19726e = eVar;
        this.f19724c = eVar2;
        this.f19725d = dVar;
    }
}
