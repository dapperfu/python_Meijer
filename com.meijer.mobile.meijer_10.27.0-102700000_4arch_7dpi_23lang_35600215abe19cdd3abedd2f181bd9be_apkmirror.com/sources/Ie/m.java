package Ie;

import com.google.crypto.tink.internal.C11302k;
import com.google.crypto.tink.internal.H;
import com.google.crypto.tink.internal.TinkBugException;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final Ue.A f13843a = null;

    /* renamed from: b, reason: collision with root package name */
    private final x f13844b;

    public static m a(x xVar) throws GeneralSecurityException {
        return new m(xVar);
    }

    Ue.A c() throws GeneralSecurityException {
        Ue.A a10 = this.f13843a;
        if (a10 != null) {
            return a10;
        }
        x xVar = this.f13844b;
        return xVar instanceof C11302k ? ((C11302k) xVar).b().d() : ((H) com.google.crypto.tink.internal.w.c().o(this.f13844b, H.class)).d();
    }

    public x d() throws GeneralSecurityException {
        x xVar = this.f13844b;
        return xVar != null ? xVar : E.a(b().o());
    }

    private m(x xVar) {
        this.f13844b = xVar;
    }

    Ue.A b() {
        try {
            return c();
        } catch (GeneralSecurityException e10) {
            throw new TinkBugException("Parsing parameters failed in getProto(). You probably want to call some Tink register function for " + this.f13844b, e10);
        }
    }
}
