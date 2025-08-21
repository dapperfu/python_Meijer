package Le;

import Ke.InterfaceC3886a;
import We.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC11437h;
import com.google.crypto.tink.shaded.protobuf.C11444o;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public final class I implements InterfaceC3886a {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f18215d = new byte[0];

    /* renamed from: e, reason: collision with root package name */
    private static final Set<String> f18216e = g();

    /* renamed from: a, reason: collision with root package name */
    private final String f18217a;

    /* renamed from: b, reason: collision with root package name */
    private final Ke.x f18218b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3886a f18219c;

    private byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    public static boolean f(String str) {
        return f18216e.contains(str);
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
    public I(We.A a10, InterfaceC3886a interfaceC3886a) throws GeneralSecurityException {
        if (f(a10.d0())) {
            this.f18217a = a10.d0();
            this.f18218b = e(a10);
            this.f18219c = interfaceC3886a;
        } else {
            throw new IllegalArgumentException("Unsupported DEK key type: " + a10.d0() + ". Only Tink AEAD key types are supported.");
        }
    }

    public static InterfaceC3886a d(AbstractC4027c abstractC4027c, InterfaceC3886a interfaceC3886a) throws GeneralSecurityException {
        try {
            return new I(We.A.h0(Ke.E.b(abstractC4027c), C11444o.b()), interfaceC3886a);
        } catch (InvalidProtocolBufferException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    private Ke.x e(We.A a10) throws GeneralSecurityException {
        return Ke.E.a(We.A.g0(a10).x(We.I.RAW).build().o());
    }

    @Override // Ke.InterfaceC3886a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Ke.j jVarC = com.google.crypto.tink.internal.p.f().c(this.f18218b, null);
        byte[] bArrA = this.f18219c.a(((com.google.crypto.tink.internal.G) com.google.crypto.tink.internal.w.c().n(jVarC, com.google.crypto.tink.internal.G.class, Ke.i.a())).g().v(), f18215d);
        if (bArrA.length <= 4096) {
            return c(bArrA, ((InterfaceC3886a) com.google.crypto.tink.internal.t.c().b(jVarC, InterfaceC3886a.class)).a(bArr, bArr2));
        }
        throw new GeneralSecurityException("length of encrypted DEK too large");
    }

    @Override // Ke.InterfaceC3886a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 > 0 && i10 <= 4096 && i10 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i10];
                byteBufferWrap.get(bArr3, 0, i10);
                byte[] bArr4 = new byte[byteBufferWrap.remaining()];
                byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
                return ((InterfaceC3886a) com.google.crypto.tink.internal.t.c().b(com.google.crypto.tink.internal.w.c().f(com.google.crypto.tink.internal.G.b(this.f18217a, AbstractC11437h.k(this.f18219c.b(bArr3, f18215d)), y.c.SYMMETRIC, We.I.RAW, null), Ke.i.a()), InterfaceC3886a.class)).b(bArr4, bArr2);
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
