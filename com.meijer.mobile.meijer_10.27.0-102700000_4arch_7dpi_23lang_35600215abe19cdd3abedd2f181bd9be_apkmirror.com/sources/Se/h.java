package Se;

import Ne.b;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class h implements Re.g {

    /* renamed from: b, reason: collision with root package name */
    private static final b.EnumC0342b f33589b = b.EnumC0342b.f21530b;

    /* renamed from: a, reason: collision with root package name */
    private final Re.i f33590a;

    public h(Re.i iVar) throws GeneralSecurityException {
        if (f33589b.a()) {
            this.f33590a = iVar;
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
