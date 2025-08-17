package Dd;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: Dd.c0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C3094c0 extends AbstractC3106d0 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f6012a = new Object[4];

    /* renamed from: b, reason: collision with root package name */
    int f6013b = 0;

    /* renamed from: c, reason: collision with root package name */
    boolean f6014c;

    private final void d(int i10) {
        Object[] objArr = this.f6012a;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f6014c) {
                this.f6012a = (Object[]) objArr.clone();
                this.f6014c = false;
                return;
            }
            return;
        }
        int i11 = length + (length >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        if (i11 < 0) {
            i11 = a.e.API_PRIORITY_OTHER;
        }
        this.f6012a = Arrays.copyOf(objArr, i11);
        this.f6014c = false;
    }

    public final AbstractC3106d0 c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            d(this.f6013b + collection.size());
            if (collection instanceof AbstractC3118e0) {
                this.f6013b = ((AbstractC3118e0) collection).a(this.f6012a, this.f6013b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    C3094c0(int i10) {
    }

    public final C3094c0 b(Object obj) {
        obj.getClass();
        d(this.f6013b + 1);
        Object[] objArr = this.f6012a;
        int i10 = this.f6013b;
        this.f6013b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }
}
