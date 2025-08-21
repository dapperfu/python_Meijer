package q6;

import java.util.Arrays;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f157909a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f157910b;

    private void a(d dVar) {
        int i10 = 0;
        while (true) {
            int[] iArr = dVar.f157910b;
            if (i10 >= iArr.length) {
                return;
            }
            this.f157909a[i10] = dVar.f157909a[i10];
            this.f157910b[i10] = iArr[i10];
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
            if (Arrays.equals(this.f157909a, dVar.f157909a) && Arrays.equals(this.f157910b, dVar.f157910b)) {
                return true;
            }
        }
        return false;
    }

    private int c(float f10) {
        int iBinarySearch = Arrays.binarySearch(this.f157909a, f10);
        if (iBinarySearch >= 0) {
            return this.f157910b[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        if (i10 == 0) {
            return this.f157910b[0];
        }
        int[] iArr = this.f157910b;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f157909a;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return v6.e.c((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }

    public int[] d() {
        return this.f157910b;
    }

    public float[] e() {
        return this.f157909a;
    }

    public int f() {
        return this.f157910b.length;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f157909a) * 31) + Arrays.hashCode(this.f157910b);
    }

    public d(float[] fArr, int[] iArr) {
        this.f157909a = fArr;
        this.f157910b = iArr;
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
        if (dVar.f157910b.length == dVar2.f157910b.length) {
            int i10 = 0;
            while (true) {
                iArr = dVar.f157910b;
                if (i10 >= iArr.length) {
                    break;
                }
                this.f157909a[i10] = v6.l.i(dVar.f157909a[i10], dVar2.f157909a[i10], f10);
                this.f157910b[i10] = v6.e.c(f10, dVar.f157910b[i10], dVar2.f157910b[i10]);
                i10++;
            }
            int length = iArr.length;
            while (true) {
                float[] fArr = this.f157909a;
                if (length < fArr.length) {
                    int[] iArr2 = dVar.f157910b;
                    fArr[length] = fArr[iArr2.length - 1];
                    int[] iArr3 = this.f157910b;
                    iArr3[length] = iArr3[iArr2.length - 1];
                    length++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f157910b.length + " vs " + dVar2.f157910b.length + ")");
        }
    }
}
