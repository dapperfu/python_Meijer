package R3;

import d3.D;
import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes4.dex */
public final class p {
    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final UUID f31802a;

        /* renamed from: b, reason: collision with root package name */
        public final int f31803b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f31804c;

        /* renamed from: d, reason: collision with root package name */
        public final UUID[] f31805d;

        a(UUID uuid, int i10, byte[] bArr, UUID[] uuidArr) {
            this.f31802a = uuid;
            this.f31803b = i10;
            this.f31804c = bArr;
            this.f31805d = uuidArr;
        }
    }

    public static a d(byte[] bArr) {
        UUID[] uuidArr;
        D d10 = new D(bArr);
        if (d10.g() < 32) {
            return null;
        }
        d10.W(0);
        int iA = d10.a();
        int iQ = d10.q();
        if (iQ != iA) {
            d3.r.i("PsshAtomUtil", "Advertised atom size (" + iQ + ") does not match buffer size: " + iA);
            return null;
        }
        int iQ2 = d10.q();
        if (iQ2 != 1886614376) {
            d3.r.i("PsshAtomUtil", "Atom type is not pssh: " + iQ2);
            return null;
        }
        int iN = b.n(d10.q());
        if (iN > 1) {
            d3.r.i("PsshAtomUtil", "Unsupported pssh version: " + iN);
            return null;
        }
        UUID uuid = new UUID(d10.A(), d10.A());
        if (iN == 1) {
            int iL = d10.L();
            uuidArr = new UUID[iL];
            for (int i10 = 0; i10 < iL; i10++) {
                uuidArr[i10] = new UUID(d10.A(), d10.A());
            }
        } else {
            uuidArr = null;
        }
        int iL2 = d10.L();
        int iA2 = d10.a();
        if (iL2 == iA2) {
            byte[] bArr2 = new byte[iL2];
            d10.l(bArr2, 0, iL2);
            return new a(uuid, iN, bArr2, uuidArr);
        }
        d3.r.i("PsshAtomUtil", "Atom data size (" + iL2 + ") does not match the bytes left: " + iA2);
        return null;
    }

    public static boolean c(byte[] bArr) {
        if (d(bArr) != null) {
            return true;
        }
        return false;
    }

    public static byte[] e(byte[] bArr, UUID uuid) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        if (!uuid.equals(aVarD.f31802a)) {
            d3.r.i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + aVarD.f31802a + ".");
            return null;
        }
        return aVarD.f31804c;
    }

    public static UUID f(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return null;
        }
        return aVarD.f31802a;
    }

    public static int g(byte[] bArr) {
        a aVarD = d(bArr);
        if (aVarD == null) {
            return -1;
        }
        return aVarD.f31803b;
    }
}
