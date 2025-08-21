package Ke;

import com.google.crypto.tink.internal.C11427k;
import com.google.crypto.tink.internal.H;
import com.google.crypto.tink.internal.TinkBugException;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final We.A f16589a = null;

    /* renamed from: b, reason: collision with root package name */
    private final x f16590b;

    public static m a(x xVar) throws GeneralSecurityException {
        return new m(xVar);
    }

    We.A c() throws GeneralSecurityException {
        We.A a10 = this.f16589a;
        if (a10 != null) {
            return a10;
        }
        x xVar = this.f16590b;
        return xVar instanceof C11427k ? ((C11427k) xVar).b().d() : ((H) com.google.crypto.tink.internal.w.c().o(this.f16590b, H.class)).d();
    }

    public x d() throws GeneralSecurityException {
        x xVar = this.f16590b;
        return xVar != null ? xVar : E.a(b().o());
    }

    private m(x xVar) {
        this.f16590b = xVar;
    }

    We.A b() {
        try {
            return c();
        } catch (GeneralSecurityException e10) {
            throw new TinkBugException("Parsing parameters failed in getProto(). You probably want to call some Tink register function for " + this.f16590b, e10);
        }
    }
}
