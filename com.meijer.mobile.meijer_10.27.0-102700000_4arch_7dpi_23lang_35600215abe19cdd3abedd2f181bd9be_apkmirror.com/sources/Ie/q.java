package Ie;

import Ue.C;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final C.b f13867a;

    public synchronized p a() throws GeneralSecurityException {
        return p.l(this.f13867a.build());
    }

    public static q b(p pVar) {
        return new q(pVar.r().b());
    }

    private q(C.b bVar) {
        this.f13867a = bVar;
    }
}
