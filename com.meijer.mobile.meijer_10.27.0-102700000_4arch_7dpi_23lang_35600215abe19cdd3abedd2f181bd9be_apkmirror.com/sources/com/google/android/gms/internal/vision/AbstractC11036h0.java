package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.vision.h0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC11036h0 implements Serializable, Iterable<Byte> {

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC11036h0 f84545b = new C11070s0(S0.f84467c);

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC11056n0 f84546c;

    /* renamed from: d, reason: collision with root package name */
    private static final Comparator<AbstractC11036h0> f84547d;

    /* renamed from: a, reason: collision with root package name */
    private int f84548a = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(byte b10) {
        return b10 & 255;
    }

    public abstract byte a(int i10);

    public abstract int e();

    public abstract boolean equals(Object obj);

    protected abstract int h(int i10, int i11, int i12);

    public abstract AbstractC11036h0 k(int i10, int i11);

    protected abstract String n(Charset charset);

    abstract void o(AbstractC11024e0 abstractC11024e0) throws IOException;

    abstract byte p(int i10);

    public abstract boolean zzc();

    static {
        C11032g0 c11032g0 = null;
        f84546c = Z.b() ? new C11067r0(c11032g0) : new C11050l0(c11032g0);
        f84547d = new C11044j0();
    }

    public static AbstractC11036h0 l(String str) {
        return new C11070s0(str.getBytes(S0.f84465a));
    }

    public static AbstractC11036h0 m(byte[] bArr, int i10, int i11) {
        r(i10, i10 + i11, bArr.length);
        return new C11070s0(f84546c.zza(bArr, i10, i11));
    }

    static int r(int i10, int i11, int i12) {
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

    static C11065q0 t(int i10) {
        return new C11065q0(i10, null);
    }

    public final int hashCode() {
        int iH = this.f84548a;
        if (iH == 0) {
            int iE = e();
            iH = h(iE, 0, iE);
            if (iH == 0) {
                iH = 1;
            }
            this.f84548a = iH;
        }
        return iH;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new C11032g0(this);
    }

    public final String s() {
        return e() == 0 ? "" : n(S0.f84465a);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(e()), e() <= 50 ? C11014b2.a(this) : String.valueOf(C11014b2.a(k(0, 47))).concat("..."));
    }

    protected final int u() {
        return this.f84548a;
    }

    AbstractC11036h0() {
    }
}
