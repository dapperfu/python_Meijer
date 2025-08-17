package fsimpl;

import java.util.Arrays;

/* loaded from: classes14.dex */
public class fH implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f132209a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    private int[] f132210b;

    /* renamed from: c, reason: collision with root package name */
    private int f132211c;

    public fH() {
        this(10);
    }

    public fH(int i10) {
        if (i10 == 0) {
            this.f132210b = f132209a;
        } else {
            this.f132210b = c(i10);
        }
        this.f132211c = 0;
    }

    private void b(int i10) {
        int i11 = this.f132211c;
        int i12 = i10 + i11;
        if (i12 >= this.f132210b.length) {
            int i13 = (i11 < 6 ? 12 : i11 >> 1) + i11;
            if (i13 > i12) {
                i12 = i13;
            }
            int[] iArrC = c(i12);
            System.arraycopy(this.f132210b, 0, iArrC, 0, i11);
            this.f132210b = iArrC;
        }
    }

    private static void b(int i10, int i11) {
        if (i11 < 0 || i10 <= i11) {
            throw new ArrayIndexOutOfBoundsException("length=" + i10 + "; index=" + i11);
        }
    }

    private static int[] c(int i10) {
        return new int[i10];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public fH clone() {
        fH fHVar = (fH) super.clone();
        fHVar.f132210b = (int[]) this.f132210b.clone();
        return fHVar;
    }

    public void a(int i10) {
        a(this.f132211c, i10);
    }

    public void a(int i10, int i11) {
        b(1);
        int i12 = this.f132211c;
        int i13 = i12 - i10;
        int i14 = i12 + 1;
        this.f132211c = i14;
        b(i14, i10);
        if (i13 != 0) {
            int[] iArr = this.f132210b;
            System.arraycopy(iArr, i10, iArr, i10 + 1, i13);
        }
        this.f132210b[i10] = i11;
    }

    public int b() {
        return this.f132211c;
    }

    public int[] c() {
        return Arrays.copyOf(this.f132210b, this.f132211c);
    }
}
