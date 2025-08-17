package Se;

import Ne.b;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class g implements Re.g {

    /* renamed from: b, reason: collision with root package name */
    private static final b.EnumC0342b f33587b = b.EnumC0342b.f21529a;

    /* renamed from: a, reason: collision with root package name */
    private final Re.a f33588a;

    public g(Re.a aVar) throws GeneralSecurityException {
        if (f33587b.a()) {
            this.f33588a = aVar;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
