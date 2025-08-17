package p6;

import java.util.Arrays;
import u6.C17231e;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f155505a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f155506b;

    private void a(d dVar) {
        int i10 = 0;
        while (true) {
            int[] iArr = dVar.f155506b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f155505a[i10] = dVar.f155505a[i10];
            this.f155506b[i10] = iArr[i10];
            i10++;
        }
    }

    public d b(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = c(fArr[i10]);
        }
        return new d(fArr, iArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (Arrays.equals(this.f155505a, dVar.f155505a) && Arrays.equals(this.f155506b, dVar.f155506b)) {
                return true;
            }
        }
        return false;
    }

    private int c(float f10) {
        int iBinarySearch = Arrays.binarySearch(this.f155505a, f10);
        if (iBinarySearch >= 0) {
            return this.f155506b[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        if (i10 == 0) {
            return this.f155506b[0];
        }
        int[] iArr = this.f155506b;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f155505a;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return C17231e.c((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }

    public int[] d() {
        return this.f155506b;
    }

    public float[] e() {
        return this.f155505a;
    }

    public int f() {
        return this.f155506b.length;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f155505a) * 31) + Arrays.hashCode(this.f155506b);
    }

    public d(float[] fArr, int[] iArr) {
        this.f155505a = fArr;
        this.f155506b = iArr;
    }

    public void g(d dVar, d dVar2, float f10) {
        int[] iArr;
        if (dVar.equals(dVar2)) {
            a(dVar);
            return;
        }
        if (f10 <= 0.0f) {
            a(dVar);
            return;
        }
        if (f10 >= 1.0f) {
            a(dVar2);
            return;
        }
        if (dVar.f155506b.length == dVar2.f155506b.length) {
            int i10 = 0;
            while (true) {
                iArr = dVar.f155506b;
                if (i10 >= iArr.length) {
                    break;
                }
                this.f155505a[i10] = u6.l.i(dVar.f155505a[i10], dVar2.f155505a[i10], f10);
                this.f155506b[i10] = C17231e.c(f10, dVar.f155506b[i10], dVar2.f155506b[i10]);
                i10++;
            }
            int length = iArr.length;
            while (true) {
                float[] fArr = this.f155505a;
                if (length < fArr.length) {
                    int[] iArr2 = dVar.f155506b;
                    fArr[length] = fArr[iArr2.length - 1];
                    int[] iArr3 = this.f155506b;
                    iArr3[length] = iArr3[iArr2.length - 1];
                    length++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f155506b.length + " vs " + dVar2.f155506b.length + ")");
        }
    }
}
