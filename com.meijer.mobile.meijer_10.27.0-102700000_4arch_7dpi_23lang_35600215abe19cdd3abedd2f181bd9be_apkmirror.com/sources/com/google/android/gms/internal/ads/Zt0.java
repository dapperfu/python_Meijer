package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class Zt0 implements Iterable<Byte>, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final Zt0 f72282b = new Wt0(Tu0.f70473b);

    /* renamed from: a, reason: collision with root package name */
    private int f72283a = 0;

    Zt0() {
    }

    public abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    abstract byte f(int i10);

    public abstract int k();

    protected abstract void l(byte[] bArr, int i10, int i11, int i12);

    protected abstract int m();

    protected abstract boolean n();

    protected abstract int o(int i10, int i11, int i12);

    public abstract Zt0 p(int i10, int i11);

    public abstract AbstractC7943eu0 q();

    public abstract ByteBuffer r();

    abstract void s(Qt0 qt0) throws IOException;

    protected final int u() {
        return this.f72283a;
    }

    @Override // java.lang.Iterable
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Ut0 iterator() {
        return new Rt0(this);
    }

    static {
        int i10 = Lt0.f68450a;
    }

    public static Zt0 B(String str) {
        return new Wt0(str.getBytes(Tu0.f70472a));
    }

    static void C(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    private static Zt0 h(Iterator it, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
        }
        if (i10 == 1) {
            return (Zt0) it.next();
        }
        int i11 = i10 >>> 1;
        Zt0 zt0H = h(it, i11);
        Zt0 zt0H2 = h(it, i10 - i11);
        if (a.e.API_PRIORITY_OTHER - zt0H.k() >= zt0H2.k()) {
            return Gv0.F(zt0H, zt0H2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + zt0H.k() + "+" + zt0H2.k());
    }

    static int t(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static Xt0 x() {
        return new Xt0(128);
    }

    public static Zt0 y(Iterable iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f72282b : h(iterable.iterator(), size);
    }

    public static Zt0 z(byte[] bArr, int i10, int i11) {
        t(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new Wt0(bArr2);
    }

    public final int hashCode() {
        int iO = this.f72283a;
        if (iO == 0) {
            int iK = k();
            iO = o(iK, 0, iK);
            if (iO == 0) {
                iO = 1;
            }
            this.f72283a = iO;
        }
        return iO;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(k()), k() <= 50 ? Tv0.a(this) : Tv0.a(p(0, 47)).concat("..."));
    }

    @Deprecated
    public final void D(byte[] bArr, int i10, int i11, int i12) {
        t(0, i12, k());
        t(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            l(bArr, 0, i11, i12);
        }
    }

    public final byte[] a() {
        int iK = k();
        if (iK == 0) {
            return Tu0.f70473b;
        }
        byte[] bArr = new byte[iK];
        l(bArr, 0, 0, iK);
        return bArr;
    }
}
