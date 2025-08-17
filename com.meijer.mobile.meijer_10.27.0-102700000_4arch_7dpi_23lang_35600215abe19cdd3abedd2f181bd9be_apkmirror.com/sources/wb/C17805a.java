package wb;

import Lb.m;
import Va.b;
import Va.c;
import ic.C14713a;
import java.lang.reflect.InvocationTargetException;
import lc.C15397c;

/* renamed from: wb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17805a {

    /* renamed from: a, reason: collision with root package name */
    static final m<c> f166030a = new m<>(c.class);

    /* renamed from: b, reason: collision with root package name */
    static final m<b> f166031b = new m<>(b.class);

    public static c a(C14713a c14713a, C15397c c15397c) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        c cVar = new c();
        b bVar = new b();
        m<b> mVar = f166031b;
        int iA = c15397c.a();
        mVar.d(bVar, "batteryLevel", (iA == 0 || iA == 1) ? b.a.LOW : (iA == 2 || iA == 3) ? b.a.HIGH : null);
        mVar.d(bVar, "iconURL", c15397c.b());
        mVar.d(bVar, "identifier", c15397c.c());
        mVar.d(bVar, "uuid", c15397c.h());
        mVar.d(bVar, "name", c15397c.getName());
        mVar.d(bVar, "temperature", Integer.valueOf(c15397c.g()));
        m<c> mVar2 = f166030a;
        mVar2.d(cVar, "beacon", bVar);
        mVar2.d(cVar, "beacon", bVar);
        mVar2.d(cVar, "timeInMillis", Long.valueOf(c14713a.n().getTime()));
        mVar2.d(cVar, "rSSI", Integer.valueOf(c14713a.i()));
        return cVar;
    }
}
