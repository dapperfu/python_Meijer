package Vf;

import android.util.SparseIntArray;

/* loaded from: classes7.dex */
public class f {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f37543a;

        /* renamed from: b, reason: collision with root package name */
        int f37544b;

        /* renamed from: c, reason: collision with root package name */
        int f37545c;

        public a a(a aVar) {
            return new a(this.f37543a - aVar.d(), this.f37544b - aVar.c(), this.f37545c - aVar.b());
        }

        public int b() {
            return this.f37545c;
        }

        public int c() {
            return this.f37544b;
        }

        public int d() {
            return this.f37543a;
        }

        public a(int i10, int i11, int i12) {
            this.f37543a = i10;
            this.f37544b = i11;
            this.f37545c = i12;
        }
    }

    public static a a(SparseIntArray[] sparseIntArrayArr) {
        int i10;
        int i11;
        SparseIntArray sparseIntArray;
        int i12 = 0;
        if (sparseIntArrayArr == null || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i10 = 0;
            i11 = 0;
        } else {
            int i13 = 0;
            i10 = 0;
            i11 = 0;
            while (i12 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i12);
                int iValueAt = sparseIntArray.valueAt(i12);
                i13 += iValueAt;
                if (iKeyAt > 700) {
                    i11 += iValueAt;
                }
                if (iKeyAt > 16) {
                    i10 += iValueAt;
                }
                i12++;
            }
            i12 = i13;
        }
        return new a(i12, i10, i11);
    }
}
