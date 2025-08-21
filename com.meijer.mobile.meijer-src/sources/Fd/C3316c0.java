package Fd;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: Fd.c0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C3316c0 extends AbstractC3328d0 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f10045a = new Object[4];

    /* renamed from: b, reason: collision with root package name */
    int f10046b = 0;

    /* renamed from: c, reason: collision with root package name */
    boolean f10047c;

    private final void d(int i10) {
        Object[] objArr = this.f10045a;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f10047c) {
                this.f10045a = (Object[]) objArr.clone();
                this.f10047c = false;
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
        this.f10045a = Arrays.copyOf(objArr, i11);
        this.f10047c = false;
    }

    public final AbstractC3328d0 c(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            d(this.f10046b + collection.size());
            if (collection instanceof AbstractC3340e0) {
                this.f10046b = ((AbstractC3340e0) collection).a(this.f10045a, this.f10046b);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }

    C3316c0(int i10) {
    }

    public final C3316c0 b(Object obj) {
        obj.getClass();
        d(this.f10046b + 1);
        Object[] objArr = this.f10045a;
        int i10 = this.f10046b;
        this.f10046b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }
}
