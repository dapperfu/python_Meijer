package Xf;

import android.util.SparseIntArray;

/* loaded from: classes8.dex */
public class f {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f42255a;

        /* renamed from: b, reason: collision with root package name */
        int f42256b;

        /* renamed from: c, reason: collision with root package name */
        int f42257c;

        public a a(a aVar) {
            return new a(this.f42255a - aVar.d(), this.f42256b - aVar.c(), this.f42257c - aVar.b());
        }

        public int b() {
            return this.f42257c;
        }

        public int c() {
            return this.f42256b;
        }

        public int d() {
            return this.f42255a;
        }

        public a(int i10, int i11, int i12) {
            this.f42255a = i10;
            this.f42256b = i11;
            this.f42257c = i12;
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
