package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class G4 implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final G4 f82610b = new F4(C10611o5.f83156b);

    /* renamed from: a, reason: collision with root package name */
    private int f82611a = 0;

    G4() {
    }

    public abstract byte a(int i10);

    abstract byte e(int i10);

    public abstract boolean equals(Object obj);

    public abstract int f();

    public abstract G4 h(int i10, int i11);

    abstract void k(C10690x4 c10690x4) throws IOException;

    protected abstract int l(int i10, int i11, int i12);

    protected final int n() {
        return this.f82611a;
    }

    static {
        int i10 = C10654t4.f83258a;
    }

    public static G4 m(byte[] bArr, int i10, int i11) {
        o(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new F4(bArr2);
    }

    static int o(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length());
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public final int hashCode() {
        int iL = this.f82611a;
        if (iL == 0) {
            int iF = f();
            iL = l(iF, 0, iF);
            if (iL == 0) {
                iL = 1;
            }
            this.f82611a = iL;
        }
        return iL;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C10708z4(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(f()), f() <= 50 ? C10531f6.a(this) : C10531f6.a(h(0, 47)).concat("..."));
    }
}
