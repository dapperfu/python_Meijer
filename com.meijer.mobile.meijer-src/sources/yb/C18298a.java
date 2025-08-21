package yb;

import Nb.m;
import Xa.b;
import Xa.c;
import java.lang.reflect.InvocationTargetException;
import kc.C15116a;
import nc.C15931c;

/* renamed from: yb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18298a {

    /* renamed from: a, reason: collision with root package name */
    static final m<c> f171352a = new m<>(c.class);

    /* renamed from: b, reason: collision with root package name */
    static final m<b> f171353b = new m<>(b.class);

    public static c a(C15116a c15116a, C15931c c15931c) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        c cVar = new c();
        b bVar = new b();
        m<b> mVar = f171353b;
        int iA = c15931c.a();
        mVar.d(bVar, "batteryLevel", (iA == 0 || iA == 1) ? b.a.LOW : (iA == 2 || iA == 3) ? b.a.HIGH : null);
        mVar.d(bVar, "iconURL", c15931c.b());
        mVar.d(bVar, "identifier", c15931c.c());
        mVar.d(bVar, "uuid", c15931c.h());
        mVar.d(bVar, "name", c15931c.getName());
        mVar.d(bVar, "temperature", Integer.valueOf(c15931c.g()));
        m<c> mVar2 = f171352a;
        mVar2.d(cVar, "beacon", bVar);
        mVar2.d(cVar, "beacon", bVar);
        mVar2.d(cVar, "timeInMillis", Long.valueOf(c15116a.n().getTime()));
        mVar2.d(cVar, "rSSI", Integer.valueOf(c15116a.i()));
        return cVar;
    }
}
