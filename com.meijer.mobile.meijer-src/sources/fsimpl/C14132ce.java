package fsimpl;

import android.graphics.Typeface;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: fsimpl.ce, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14132ce {

    /* renamed from: a, reason: collision with root package name */
    private final LongSparseArray f133160a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f133161b;

    C14132ce(LongSparseArray longSparseArray) {
        this.f133160a = longSparseArray;
        this.f133161b = null;
    }

    C14132ce(LongSparseArray longSparseArray, Object obj) {
        this.f133160a = longSparseArray;
        this.f133161b = obj;
    }

    private List b(long j10) {
        List listC;
        synchronized (this.f133161b) {
            listC = c(j10);
        }
        return listC;
    }

    private List c(long j10) {
        SparseArray sparseArray = (SparseArray) this.f133160a.get(j10);
        ArrayList arrayList = null;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                Typeface typeface = (Typeface) sparseArray.valueAt(i10);
                if (typeface != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(typeface);
                }
            }
        }
        return arrayList;
    }

    public List a(long j10) {
        return this.f133161b != null ? b(j10) : c(j10);
    }
}
