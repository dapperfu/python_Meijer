package hb;

import Ab.a;
import Db.b;
import Vb.a;
import ac.InterfaceC5594a;
import ac.c;
import cb.C6380a;
import cb.C6381b;
import java.util.HashMap;
import kt.n;
import kt.r;
import lb.C15392a;
import lc.C15395a;
import lt.C15500d;
import lt.EnumC15497a;
import lt.EnumC15499c;
import lt.f;
import ub.InterfaceC17238a;

/* renamed from: hb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14394a {

    /* renamed from: c, reason: collision with root package name */
    private static final C6380a f134548c = C6381b.a(C14394a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC17238a f134549a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC5594a f134550b;

    public static r a(C15392a.EnumC2285a enumC2285a) {
        if (enumC2285a == null) {
            return null;
        }
        int i10 = C2123a.f134551a[enumC2285a.ordinal()];
        if (i10 == 1) {
            return r.PUSH;
        }
        if (i10 == 2) {
            return r.TIME;
        }
        if (i10 == 3 || i10 == 4) {
            return r.PLACE;
        }
        return null;
    }

    /* renamed from: hb.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C2123a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f134551a;

        static {
            int[] iArr = new int[C15392a.EnumC2285a.values().length];
            f134551a = iArr;
            try {
                iArr[C15392a.EnumC2285a.INSTANT_PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f134551a[C15392a.EnumC2285a.TIME_TRIGGERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f134551a[C15392a.EnumC2285a.PLACE_ENTRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f134551a[C15392a.EnumC2285a.PLACE_EXIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static C15500d b(Ab.a aVar, String str) {
        C15500d c15500d = new C15500d();
        c15500d.m(str);
        c15500d.g(String.valueOf(aVar.k()));
        c15500d.h(String.valueOf(aVar.h()));
        HashMap map = new HashMap();
        map.put(EnumC15499c.EVENT_TYPE.name(), aVar.d());
        map.put(EnumC15499c.FENCE_TYPE.name(), aVar.f());
        map.put(EnumC15499c.FENCE_ID.name(), aVar.e());
        map.put(EnumC15499c.PLACE_ID.name(), aVar.j());
        map.put(EnumC15499c.PLACE_NAME.name(), aVar.g().k());
        map.put(EnumC15499c.AT_TIME.name(), String.valueOf(aVar.a()));
        if (a.b.DEPART_EVENT == aVar.c()) {
            map.put(EnumC15499c.LEFT_TIME.name(), String.valueOf(aVar.b()));
        }
        map.put(EnumC15499c.VISIT_ID.name(), aVar.g().m());
        if (aVar.g().f() != null) {
            map.put(EnumC15499c.DOMAIN.name(), aVar.g().f());
        }
        c15500d.f(map);
        return c15500d;
    }

    public final C15500d c(C15392a c15392a, String str) {
        c cVarA = this.f134550b.a();
        C15500d c15500d = new C15500d();
        c15500d.m(str);
        if (cVarA != null) {
            c15500d.g(String.valueOf(cVarA.f44474a.getLatitude()));
            c15500d.h(String.valueOf(cVarA.f44474a.getLongitude()));
        }
        HashMap map = new HashMap();
        r rVarA = a(c15392a.l());
        if (rVarA == null) {
            rVarA = r.PLACE;
        }
        map.put(EnumC15497a.CONTENT_ID.name(), c15392a.h());
        map.put(EnumC15497a.TRIGGER_TYPE.name(), rVarA.name());
        if (rVarA == r.PLACE) {
            map.put(EnumC15497a.TRIGGER_ID.name(), c15392a.k());
            map.put(EnumC15497a.PLACE_EVENT_TYPE.name(), c15392a.j());
            map.put(EnumC15499c.VISIT_ID.name(), c15392a.m());
        }
        c15500d.f(map);
        return c15500d;
    }

    public final void e(C15395a c15395a, b bVar) {
        String strName;
        C15500d c15500d = new C15500d();
        c15500d.m(f.BEACON.name());
        c15500d.g(String.valueOf(c15395a.i()));
        c15500d.h(String.valueOf(c15395a.j()));
        HashMap map = new HashMap();
        map.put(EnumC15499c.BEACON_TYPE.name(), a.EnumC0807a.GIMBAL.name());
        String strValueOf = String.valueOf(c15395a.a());
        EnumC15499c enumC15499c = EnumC15499c.AT_TIME;
        map.put(enumC15499c.name(), strValueOf);
        if (c15395a.f() == null) {
            strName = n.AT.name();
            map.put(enumC15499c.name(), strValueOf);
            map.put(EnumC15499c.BEACON_ACTUAL_RSSI.name(), String.valueOf(c15395a.b()));
        } else {
            map.put(EnumC15499c.LEFT_TIME.name(), String.valueOf(c15395a.f()));
            strName = n.LEFT.name();
        }
        map.put(EnumC15499c.EVENT_TYPE.name(), strName);
        map.put(EnumC15499c.FENCE_ID.name(), c15395a.n());
        map.put(EnumC15499c.PLACE_ID.name(), bVar.l());
        map.put(EnumC15499c.PLACE_NAME.name(), bVar.k());
        map.put(EnumC15499c.VISIT_ID.name(), c15395a.o());
        c15500d.f(map);
        this.f134549a.c(c15500d);
    }

    public C14394a(InterfaceC17238a interfaceC17238a, InterfaceC5594a interfaceC5594a) {
        this.f134549a = interfaceC17238a;
        this.f134550b = interfaceC5594a;
    }

    public final void d(Ab.a aVar) {
        if (aVar.g().f() == null) {
            this.f134549a.c(b(aVar, f.PLACE.name()));
        } else {
            this.f134549a.c(b(aVar, f.GIMBAL_PLACE.name()));
        }
    }
}
