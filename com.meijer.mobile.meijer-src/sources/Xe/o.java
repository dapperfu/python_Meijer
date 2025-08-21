package Xe;

import Ke.w;
import Te.f;
import Te.n;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes8.dex */
public class o implements w {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f42240e = {0};

    /* renamed from: a, reason: collision with root package name */
    private final Ve.a f42241a;

    /* renamed from: b, reason: collision with root package name */
    private final int f42242b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f42243c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f42244d;

    public o(Ve.a aVar, int i10) throws GeneralSecurityException {
        this.f42241a = aVar;
        this.f42242b = i10;
        this.f42243c = new byte[0];
        this.f42244d = new byte[0];
        if (i10 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.a(new byte[0], i10);
    }

    public static w c(Te.a aVar) throws GeneralSecurityException {
        return new o(aVar);
    }

    public static w d(Te.i iVar) throws GeneralSecurityException {
        return new o(iVar);
    }

    @Override // Ke.w
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.f42244d;
        return bArr2.length > 0 ? f.a(this.f42243c, this.f42241a.a(f.a(bArr, bArr2), this.f42242b)) : f.a(this.f42243c, this.f42241a.a(bArr, this.f42242b));
    }

    @Override // Ke.w
    public void a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (f.b(b(bArr2), bArr)) {
        } else {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    private o(Te.a aVar) throws GeneralSecurityException {
        this.f42241a = new m(aVar.e().d(Ke.i.a()));
        this.f42242b = aVar.a().c();
        this.f42243c = aVar.b().d();
        if (aVar.a().f().equals(f.c.f36151d)) {
            byte[] bArr = f42240e;
            this.f42244d = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f42244d = new byte[0];
        }
    }

    private o(Te.i iVar) throws GeneralSecurityException {
        this.f42241a = new n("HMAC" + iVar.a().d(), new SecretKeySpec(iVar.f().d(Ke.i.a()), "HMAC"));
        this.f42242b = iVar.a().c();
        this.f42243c = iVar.b().d();
        if (iVar.a().g().equals(n.d.f36186d)) {
            byte[] bArr = f42240e;
            this.f42244d = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.f42244d = new byte[0];
        }
    }
}
