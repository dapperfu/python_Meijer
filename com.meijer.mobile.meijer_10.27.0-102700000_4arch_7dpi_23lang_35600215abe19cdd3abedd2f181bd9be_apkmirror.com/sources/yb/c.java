package yb;

import Lb.m;
import Va.k;
import Va.n;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    static final m<n> f170383a = new m<>(n.class);

    public static n a(k kVar, Ab.a aVar) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        n nVar = new n();
        m<n> mVar = f170383a;
        mVar.d(nVar, "place", kVar);
        mVar.d(nVar, "arrivalTimeInMillis", aVar.a());
        mVar.d(nVar, "departureTimeInMillis", aVar.b());
        mVar.d(nVar, "visitID", aVar.g().m());
        return nVar;
    }

    public static n b(k kVar, Db.b bVar) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        n nVar = new n();
        m<n> mVar = f170383a;
        mVar.d(nVar, "place", kVar);
        mVar.d(nVar, "arrivalTimeInMillis", Long.valueOf(bVar.h()));
        mVar.d(nVar, "departureTimeInMillis", Long.valueOf(bVar.i()));
        mVar.d(nVar, "visitID", bVar.m());
        return nVar;
    }
}
