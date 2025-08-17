package com.google.android.gms.internal.atv_ads_framework;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.q0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10249q0 implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC10249q0 f81030b = new C10240n0(S0.f80875d);

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator f81031c;

    /* renamed from: d, reason: collision with root package name */
    private static final C10246p0 f81032d;

    /* renamed from: a, reason: collision with root package name */
    private int f81033a = 0;

    AbstractC10249q0() {
    }

    public abstract byte a(int i10);

    abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public abstract int f();

    protected abstract int h(int i10, int i11, int i12);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C10222h0(this);
    }

    public abstract AbstractC10249q0 k(int i10, int i11);

    protected abstract String l(Charset charset);

    abstract void m(C10219g0 c10219g0) throws IOException;

    public abstract boolean n();

    protected final int p() {
        return this.f81033a;
    }

    static {
        int i10 = C10216f0.f80977a;
        f81032d = new C10246p0(null);
        f81031c = new C10225i0();
    }

    static int o(int i10, int i11, int i12) {
        if (((i12 - i11) | i11) >= 0) {
            return i11;
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public final int hashCode() {
        int iH = this.f81033a;
        if (iH == 0) {
            int iF = f();
            iH = h(iF, 0, iF);
            if (iH == 0) {
                iH = 1;
            }
            this.f81033a = iH;
        }
        return iH;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(f()), f() <= 50 ? P1.a(this) : P1.a(k(0, 47)).concat("..."));
    }

    public final String q(Charset charset) {
        if (f() == 0) {
            return "";
        }
        return l(charset);
    }
}
