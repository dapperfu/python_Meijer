package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.pal.b0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10605b0 implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC10605b0 f83055b = new Y(J0.f82679d);

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator f83056c;

    /* renamed from: d, reason: collision with root package name */
    private static final C10588a0 f83057d;

    /* renamed from: a, reason: collision with root package name */
    private int f83058a = 0;

    AbstractC10605b0() {
    }

    public static AbstractC10605b0 s(byte[] bArr) {
        return t(bArr, 0, bArr.length);
    }

    public abstract byte a(int i10);

    abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public abstract int f();

    protected abstract void h(byte[] bArr, int i10, int i11, int i12);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new S(this);
    }

    protected abstract int k(int i10, int i11, int i12);

    public abstract AbstractC10605b0 l(int i10, int i11);

    public abstract AbstractC10689g0 m();

    protected abstract String n(Charset charset);

    abstract void o(Q q10) throws IOException;

    public abstract boolean p();

    protected final int r() {
        return this.f83058a;
    }

    public final boolean y() {
        return f() == 0;
    }

    static {
        int i10 = M.f82755a;
        f83057d = new C10588a0(null);
        f83056c = new T();
    }

    static int q(int i10, int i11, int i12) {
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

    public static AbstractC10605b0 t(byte[] bArr, int i10, int i11) {
        q(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new Y(bArr2);
    }

    public static AbstractC10605b0 u(String str) {
        return new Y(str.getBytes(J0.f82677b));
    }

    static AbstractC10605b0 v(byte[] bArr) {
        return new Y(bArr);
    }

    public final int hashCode() {
        int iK = this.f83058a;
        if (iK == 0) {
            int iF = f();
            iK = k(iF, 0, iF);
            if (iK == 0) {
                iK = 1;
            }
            this.f83058a = iK;
        }
        return iK;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(f()), f() <= 50 ? I1.a(this) : I1.a(l(0, 47)).concat("..."));
    }

    public final String x(Charset charset) {
        if (f() == 0) {
            return "";
        }
        return n(charset);
    }

    public final byte[] z() {
        int iF = f();
        if (iF == 0) {
            return J0.f82679d;
        }
        byte[] bArr = new byte[iF];
        h(bArr, 0, 0, iF);
        return bArr;
    }
}
