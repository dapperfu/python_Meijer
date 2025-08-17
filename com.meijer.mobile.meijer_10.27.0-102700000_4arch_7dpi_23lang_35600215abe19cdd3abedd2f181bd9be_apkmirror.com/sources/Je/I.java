package Je;

import Ie.InterfaceC3727a;
import Ue.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC11312h;
import com.google.crypto.tink.shaded.protobuf.C11319o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public final class I implements InterfaceC3727a {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f14878d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    private static final Set<String> f14879e = g();

    /* renamed from: a, reason: collision with root package name */
    private final String f14880a;

    /* renamed from: b, reason: collision with root package name */
    private final Ie.x f14881b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3727a f14882c;

    private byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    public static boolean f(String str) {
        return f14879e.contains(str);
    }

    private static Set<String> g() {
        HashSet hashSet = new HashSet();
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        return Collections.unmodifiableSet(hashSet);
    }

    @Deprecated
    public I(Ue.A a10, InterfaceC3727a interfaceC3727a) throws GeneralSecurityException {
        if (f(a10.d0())) {
            this.f14880a = a10.d0();
            this.f14881b = e(a10);
            this.f14882c = interfaceC3727a;
        } else {
            throw new IllegalArgumentException("Unsupported DEK key type: " + a10.d0() + ". Only Tink AEAD key types are supported.");
        }
    }

    public static InterfaceC3727a d(AbstractC3783c abstractC3783c, InterfaceC3727a interfaceC3727a) throws GeneralSecurityException {
        try {
            return new I(Ue.A.h0(Ie.E.b(abstractC3783c), C11319o.b()), interfaceC3727a);
        } catch (InvalidProtocolBufferException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    private Ie.x e(Ue.A a10) throws GeneralSecurityException {
        return Ie.E.a(Ue.A.g0(a10).x(Ue.I.RAW).build().o());
    }

    @Override // Ie.InterfaceC3727a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Ie.j jVarC = com.google.crypto.tink.internal.p.f().c(this.f14881b, null);
        byte[] bArrA = this.f14882c.a(((com.google.crypto.tink.internal.G) com.google.crypto.tink.internal.w.c().n(jVarC, com.google.crypto.tink.internal.G.class, Ie.i.a())).g().v(), f14878d);
        if (bArrA.length <= 4096) {
            return c(bArrA, ((InterfaceC3727a) com.google.crypto.tink.internal.t.c().b(jVarC, InterfaceC3727a.class)).a(bArr, bArr2));
        }
        throw new GeneralSecurityException("length of encrypted DEK too large");
    }

    @Override // Ie.InterfaceC3727a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 > 0 && i10 <= 4096 && i10 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i10];
                byteBufferWrap.get(bArr3, 0, i10);
                byte[] bArr4 = new byte[byteBufferWrap.remaining()];
                byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
                return ((InterfaceC3727a) com.google.crypto.tink.internal.t.c().b(com.google.crypto.tink.internal.w.c().f(com.google.crypto.tink.internal.G.b(this.f14880a, AbstractC11312h.k(this.f14882c.b(bArr3, f14878d)), y.c.SYMMETRIC, Ue.I.RAW, null), Ie.i.a()), InterfaceC3727a.class)).b(bArr4, bArr2);
            }
            throw new GeneralSecurityException("length of encrypted DEK too large");
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e11) {
            e = e11;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e12) {
            e = e12;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
