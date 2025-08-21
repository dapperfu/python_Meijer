package Ab;

import Nb.m;
import Xa.k;
import Xa.n;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    static final m<n> f232a = new m<>(n.class);

    public static n a(k kVar, Cb.a aVar) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        n nVar = new n();
        m<n> mVar = f232a;
        mVar.d(nVar, "place", kVar);
        mVar.d(nVar, "arrivalTimeInMillis", aVar.a());
        mVar.d(nVar, "departureTimeInMillis", aVar.b());
        mVar.d(nVar, "visitID", aVar.g().m());
        return nVar;
    }

    public static n b(k kVar, Fb.b bVar) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        n nVar = new n();
        m<n> mVar = f232a;
        mVar.d(nVar, "place", kVar);
        mVar.d(nVar, "arrivalTimeInMillis", Long.valueOf(bVar.h()));
        mVar.d(nVar, "departureTimeInMillis", Long.valueOf(bVar.i()));
        mVar.d(nVar, "visitID", bVar.m());
        return nVar;
    }
}
