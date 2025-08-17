package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* loaded from: classes6.dex */
public abstract class A implements Serializable, Iterable<Byte> {

    /* renamed from: b, reason: collision with root package name */
    public static final A f81097b = new H(C10299h0.f81469c);

    /* renamed from: c, reason: collision with root package name */
    private static final E f81098c;

    /* renamed from: a, reason: collision with root package name */
    private int f81099a = 0;

    static {
        B b10 = null;
        f81098c = C10336u.b() ? new I(b10) : new C(b10);
    }

    A() {
    }

    static int m(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(37);
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public static A n(byte[] bArr, int i10, int i11) {
        return new H(f81098c.a(bArr, i10, i11));
    }

    public static A o(String str) {
        return new H(str.getBytes(C10299h0.f81467a));
    }

    static F q(int i10) {
        return new F(i10, null);
    }

    protected abstract int a(int i10, int i11, int i12);

    public abstract A e(int i10, int i11);

    public abstract boolean equals(Object obj);

    protected abstract String f(Charset charset);

    abstract void h(AbstractC10351z abstractC10351z) throws IOException;

    public final int hashCode() {
        int iA = this.f81099a;
        if (iA == 0) {
            int size = size();
            iA = a(size, 0, size);
            if (iA == 0) {
                iA = 1;
            }
            this.f81099a = iA;
        }
        return iA;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new B(this);
    }

    public abstract boolean k();

    protected final int l() {
        return this.f81099a;
    }

    public abstract byte p(int i10);

    public final String r() {
        return size() == 0 ? "" : f(C10299h0.f81467a);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
