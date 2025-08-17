package Ve;

import Ie.InterfaceC3727a;
import Ie.w;
import Je.C3786f;
import com.google.crypto.tink.internal.M;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
public final class h implements InterfaceC3727a {

    /* renamed from: a, reason: collision with root package name */
    private final l f37502a;

    /* renamed from: b, reason: collision with root package name */
    private final w f37503b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37504c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f37505d;

    @Override // Ie.InterfaceC3727a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f37504c;
        byte[] bArr3 = this.f37505d;
        if (length < i10 + bArr3.length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!M.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.f37505d.length, bArr.length - this.f37504c);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f37504c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f37503b.a(bArrCopyOfRange2, f.a(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.f37502a.b(bArrCopyOfRange);
    }

    public static InterfaceC3727a c(C3786f c3786f) throws GeneralSecurityException {
        return new h(new a(c3786f.e().d(Ie.i.a()), c3786f.a().f()), new o(new n("HMAC" + c3786f.a().d(), new SecretKeySpec(c3786f.f().d(Ie.i.a()), "HMAC")), c3786f.a().g()), c3786f.a().g(), c3786f.b().d());
    }

    @Override // Ie.InterfaceC3727a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrA = this.f37502a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return f.a(this.f37505d, bArrA, this.f37503b.b(f.a(bArr2, bArrA, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    private h(l lVar, w wVar, int i10, byte[] bArr) {
        this.f37502a = lVar;
        this.f37503b = wVar;
        this.f37504c = i10;
        this.f37505d = bArr;
    }
}
