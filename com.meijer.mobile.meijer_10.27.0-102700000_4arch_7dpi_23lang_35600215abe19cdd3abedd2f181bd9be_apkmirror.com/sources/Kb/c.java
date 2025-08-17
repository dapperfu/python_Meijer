package Kb;

import Ib.f;
import Ib.h;
import Ib.j;
import Ib.m;
import Za.e;
import cb.C6380a;
import cb.C6381b;
import j$.util.DesugarTimeZone;
import java.util.TimeZone;
import nt.InterfaceC15945c;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: f, reason: collision with root package name */
    private static final C6380a f16362f = C6381b.a(c.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final h f16363a;

    /* renamed from: b, reason: collision with root package name */
    private final f f16364b;

    /* renamed from: c, reason: collision with root package name */
    private e f16365c;

    /* renamed from: d, reason: collision with root package name */
    private d f16366d;

    /* renamed from: e, reason: collision with root package name */
    private Bb.e f16367e;

    final class a implements InterfaceC15945c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16368a;

        @Override // nt.InterfaceC15945c
        public final void a(int i10, String str) {
            C6380a unused = c.f16362f;
        }

        a(String str) {
            this.f16368a = str;
        }

        @Override // nt.InterfaceC15945c
        public final /* synthetic */ void a(Void r22) {
            c.this.f16367e.u(this.f16368a);
            C6380a unused = c.f16362f;
        }
    }

    public final void b() {
        String strO = this.f16367e.O();
        TimeZone timeZoneB = this.f16365c.b();
        if (strO != null) {
            if (strO.equals(timeZoneB.getID())) {
                return;
            }
            TimeZone timeZone = DesugarTimeZone.getTimeZone(strO);
            long jA = this.f16365c.a();
            if (timeZone.getOffset(jA) == timeZoneB.getOffset(jA)) {
                return;
            }
        }
        d dVar = this.f16366d;
        dVar.f16373b.add(Long.valueOf(dVar.f16372a.a()));
        while (true) {
            if (dVar.f16373b.size() <= 4 && (dVar.f16373b.size() <= 0 || dVar.f16373b.get(0).longValue() >= dVar.f16372a.a() - d.f16371e)) {
                break;
            } else {
                dVar.f16373b.remove(0);
            }
        }
        dVar.f16374c.o(dVar.f16373b);
        if (dVar.f16373b.size() <= 3) {
            String id2 = timeZoneB.getID();
            new m(this.f16363a).i(this.f16364b.b(j.f13782a, "timezone"), null, new a(id2));
        }
    }

    public c(h hVar, f fVar, Bb.e eVar, e eVar2, d dVar) {
        this.f16363a = hVar;
        this.f16364b = fVar;
        this.f16367e = eVar;
        this.f16365c = eVar2;
        this.f16366d = dVar;
    }
}
