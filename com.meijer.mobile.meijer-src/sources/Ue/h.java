package Ue;

import Pe.b;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class h implements Te.g {

    /* renamed from: b, reason: collision with root package name */
    private static final b.EnumC0429b f37465b = b.EnumC0429b.f25765b;

    /* renamed from: a, reason: collision with root package name */
    private final Te.i f37466a;

    public h(Te.i iVar) throws GeneralSecurityException {
        if (f37465b.a()) {
            this.f37466a = iVar;
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
