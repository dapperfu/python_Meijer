package Se;

import Ke.InterfaceC3886a;
import com.fullstory.FS;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;

/* loaded from: classes8.dex */
public final class c implements InterfaceC3886a {

    /* renamed from: b, reason: collision with root package name */
    private static final String f34561b = "c";

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3886a f34562a;

    @Override // Ke.InterfaceC3886a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, InterruptedException {
        try {
            return this.f34562a.a(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e10) {
            FS.log_w(f34561b, "encountered a potentially transient KeyStore error, will wait and retry", e10);
            c();
            return this.f34562a.a(bArr, bArr2);
        }
    }

    @Override // Ke.InterfaceC3886a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, InterruptedException {
        try {
            return this.f34562a.b(bArr, bArr2);
        } catch (GeneralSecurityException e10) {
            e = e10;
            FS.log_w(f34561b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.f34562a.b(bArr, bArr2);
        } catch (ProviderException e11) {
            e = e11;
            FS.log_w(f34561b, "encountered a potentially transient KeyStore error, will wait and retry", e);
            c();
            return this.f34562a.b(bArr, bArr2);
        } catch (BadPaddingException e12) {
            throw e12;
        }
    }

    public c(String str) throws GeneralSecurityException, IOException {
        this.f34562a = b.c(str);
    }

    private static void c() throws InterruptedException {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }
}
