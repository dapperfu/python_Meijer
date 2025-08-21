package Xe;

import Ke.InterfaceC3886a;
import Ke.w;
import Le.C4030f;
import com.google.crypto.tink.internal.M;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes8.dex */
public final class h implements InterfaceC3886a {

    /* renamed from: a, reason: collision with root package name */
    private final l f42214a;

    /* renamed from: b, reason: collision with root package name */
    private final w f42215b;

    /* renamed from: c, reason: collision with root package name */
    private final int f42216c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f42217d;

    @Override // Ke.InterfaceC3886a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f42216c;
        byte[] bArr3 = this.f42217d;
        if (length < i10 + bArr3.length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!M.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, this.f42217d.length, bArr.length - this.f42216c);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f42216c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f42215b.a(bArrCopyOfRange2, f.a(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.f42214a.b(bArrCopyOfRange);
    }

    public static InterfaceC3886a c(C4030f c4030f) throws GeneralSecurityException {
        return new h(new a(c4030f.e().d(Ke.i.a()), c4030f.a().f()), new o(new n("HMAC" + c4030f.a().d(), new SecretKeySpec(c4030f.f().d(Ke.i.a()), "HMAC")), c4030f.a().g()), c4030f.a().g(), c4030f.b().d());
    }

    @Override // Ke.InterfaceC3886a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrA = this.f42214a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return f.a(this.f42217d, bArrA, this.f42215b.b(f.a(bArr2, bArrA, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    private h(l lVar, w wVar, int i10, byte[] bArr) {
        this.f42214a = lVar;
        this.f42215b = wVar;
        this.f42216c = i10;
        this.f42217d = bArr;
    }
}
