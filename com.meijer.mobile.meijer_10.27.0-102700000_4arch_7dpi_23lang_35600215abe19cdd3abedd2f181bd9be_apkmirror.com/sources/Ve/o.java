package Ve;

import Ie.w;
import Re.f;
import Re.n;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes7.dex */
public class o implements w {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f37528e = {0};

    /* renamed from: a, reason: collision with root package name */
    private final Te.a f37529a;

    /* renamed from: b, reason: collision with root package name */
    private final int f37530b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f37531c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f37532d;

    public o(Te.a aVar, int i10) throws GeneralSecurityException {
        this.f37529a = aVar;
        this.f37530b = i10;
        this.f37531c = new byte[0];
        this.f37532d = new byte[0];
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.a(new byte[0], i10);
    }

    public static w c(Re.a aVar) throws GeneralSecurityException {
        return new o(aVar);
    }

    public static w d(Re.i iVar) throws GeneralSecurityException {
        return new o(iVar);
    }

    @Override // Ie.w
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.f37532d;
        return bArr2.length > 0 ? f.a(this.f37531c, this.f37529a.a(f.a(bArr, bArr2), this.f37530b)) : f.a(this.f37531c, this.f37529a.a(bArr, this.f37530b));
    }

    @Override // Ie.w
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (f.b(b(bArr2), bArr)) {
        } else {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    private o(Re.a aVar) throws GeneralSecurityException {
        this.f37529a = new m(aVar.e().d(Ie.i.a()));
        this.f37530b = aVar.a().c();
        this.f37531c = aVar.b().d();
        if (aVar.a().f().equals(f.c.f32151d)) {
            byte[] bArr = f37528e;
            this.f37532d = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f37532d = new byte[0];
        }
    }

    private o(Re.i iVar) throws GeneralSecurityException {
        this.f37529a = new n("HMAC" + iVar.a().d(), new SecretKeySpec(iVar.f().d(Ie.i.a()), "HMAC"));
        this.f37530b = iVar.a().c();
        this.f37531c = iVar.b().d();
        if (iVar.a().g().equals(n.d.f32186d)) {
            byte[] bArr = f37528e;
            this.f37532d = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f37532d = new byte[0];
        }
    }
}
