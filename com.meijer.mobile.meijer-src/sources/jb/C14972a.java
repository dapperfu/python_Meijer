package jb;

import Cb.a;
import Fb.b;
import Xb.a;
import cc.InterfaceC6500a;
import cc.c;
import eb.C13784a;
import eb.C13785b;
import java.util.HashMap;
import kt.n;
import kt.r;
import lt.C15611d;
import lt.EnumC15608a;
import lt.EnumC15610c;
import lt.f;
import nb.C15926a;
import nc.C15929a;
import wb.InterfaceC17855a;

/* renamed from: jb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14972a {

    /* renamed from: c, reason: collision with root package name */
    private static final C13784a f140237c = C13785b.a(C14972a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC17855a f140238a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6500a f140239b;

    public static r a(C15926a.EnumC2352a enumC2352a) {
        if (enumC2352a == null) {
            return null;
        }
        int i10 = C2221a.f140240a[enumC2352a.ordinal()];
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

    /* renamed from: jb.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C2221a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f140240a;

        static {
            int[] iArr = new int[C15926a.EnumC2352a.values().length];
            f140240a = iArr;
            try {
                iArr[C15926a.EnumC2352a.INSTANT_PUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f140240a[C15926a.EnumC2352a.TIME_TRIGGERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f140240a[C15926a.EnumC2352a.PLACE_ENTRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f140240a[C15926a.EnumC2352a.PLACE_EXIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static C15611d b(Cb.a aVar, String str) {
        C15611d c15611d = new C15611d();
        c15611d.m(str);
        c15611d.g(String.valueOf(aVar.k()));
        c15611d.h(String.valueOf(aVar.h()));
        HashMap map = new HashMap();
        map.put(EnumC15610c.EVENT_TYPE.name(), aVar.d());
        map.put(EnumC15610c.FENCE_TYPE.name(), aVar.f());
        map.put(EnumC15610c.FENCE_ID.name(), aVar.e());
        map.put(EnumC15610c.PLACE_ID.name(), aVar.j());
        map.put(EnumC15610c.PLACE_NAME.name(), aVar.g().k());
        map.put(EnumC15610c.AT_TIME.name(), String.valueOf(aVar.a()));
        if (a.b.DEPART_EVENT == aVar.c()) {
            map.put(EnumC15610c.LEFT_TIME.name(), String.valueOf(aVar.b()));
        }
        map.put(EnumC15610c.VISIT_ID.name(), aVar.g().m());
        if (aVar.g().f() != null) {
            map.put(EnumC15610c.DOMAIN.name(), aVar.g().f());
        }
        c15611d.f(map);
        return c15611d;
    }

    public final C15611d c(C15926a c15926a, String str) {
        c cVarA = this.f140239b.a();
        C15611d c15611d = new C15611d();
        c15611d.m(str);
        if (cVarA != null) {
            c15611d.g(String.valueOf(cVarA.f61489a.getLatitude()));
            c15611d.h(String.valueOf(cVarA.f61489a.getLongitude()));
        }
        HashMap map = new HashMap();
        r rVarA = a(c15926a.l());
        if (rVarA == null) {
            rVarA = r.PLACE;
        }
        map.put(EnumC15608a.CONTENT_ID.name(), c15926a.h());
        map.put(EnumC15608a.TRIGGER_TYPE.name(), rVarA.name());
        if (rVarA == r.PLACE) {
            map.put(EnumC15608a.TRIGGER_ID.name(), c15926a.k());
            map.put(EnumC15608a.PLACE_EVENT_TYPE.name(), c15926a.j());
            map.put(EnumC15610c.VISIT_ID.name(), c15926a.m());
        }
        c15611d.f(map);
        return c15611d;
    }

    public final void e(C15929a c15929a, b bVar) {
        String strName;
        C15611d c15611d = new C15611d();
        c15611d.m(f.BEACON.name());
        c15611d.g(String.valueOf(c15929a.i()));
        c15611d.h(String.valueOf(c15929a.j()));
        HashMap map = new HashMap();
        map.put(EnumC15610c.BEACON_TYPE.name(), a.EnumC0897a.GIMBAL.name());
        String strValueOf = String.valueOf(c15929a.a());
        EnumC15610c enumC15610c = EnumC15610c.AT_TIME;
        map.put(enumC15610c.name(), strValueOf);
        if (c15929a.f() == null) {
            strName = n.AT.name();
            map.put(enumC15610c.name(), strValueOf);
            map.put(EnumC15610c.BEACON_ACTUAL_RSSI.name(), String.valueOf(c15929a.b()));
        } else {
            map.put(EnumC15610c.LEFT_TIME.name(), String.valueOf(c15929a.f()));
            strName = n.LEFT.name();
        }
        map.put(EnumC15610c.EVENT_TYPE.name(), strName);
        map.put(EnumC15610c.FENCE_ID.name(), c15929a.n());
        map.put(EnumC15610c.PLACE_ID.name(), bVar.l());
        map.put(EnumC15610c.PLACE_NAME.name(), bVar.k());
        map.put(EnumC15610c.VISIT_ID.name(), c15929a.o());
        c15611d.f(map);
        this.f140238a.c(c15611d);
    }

    public C14972a(InterfaceC17855a interfaceC17855a, InterfaceC6500a interfaceC6500a) {
        this.f140238a = interfaceC17855a;
        this.f140239b = interfaceC6500a;
    }

    public final void d(Cb.a aVar) {
        if (aVar.g().f() == null) {
            this.f140238a.c(b(aVar, f.PLACE.name()));
        } else {
            this.f140238a.c(b(aVar, f.GIMBAL_PLACE.name()));
        }
    }
}
