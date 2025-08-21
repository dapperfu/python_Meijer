package Ue;

import Pe.b;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class g implements Te.g {

    /* renamed from: b, reason: collision with root package name */
    private static final b.EnumC0429b f37463b = b.EnumC0429b.f25764a;

    /* renamed from: a, reason: collision with root package name */
    private final Te.a f37464a;

    public g(Te.a aVar) throws GeneralSecurityException {
        if (f37463b.a()) {
            this.f37464a = aVar;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
