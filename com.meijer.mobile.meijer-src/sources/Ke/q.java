package Ke;

import We.C;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final C.b f16613a;

    public synchronized p a() throws GeneralSecurityException {
        return p.l(this.f16613a.build());
    }

    public static q b(p pVar) {
        return new q(pVar.r().b());
    }

    private q(C.b bVar) {
        this.f16613a = bVar;
    }
}
