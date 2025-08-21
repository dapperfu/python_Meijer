package Gd;

import com.google.android.gms.common.api.a;
import java.util.Arrays;

/* loaded from: classes6.dex */
class K3 extends C3698l4 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f11743a = new Object[4];

    /* renamed from: b, reason: collision with root package name */
    int f11744b = 0;

    /* renamed from: c, reason: collision with root package name */
    boolean f11745c;

    private final void b(int i10) {
        Object[] objArr = this.f11743a;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f11745c) {
                this.f11743a = (Object[]) objArr.clone();
                this.f11745c = false;
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
        this.f11743a = Arrays.copyOf(objArr, i11);
        this.f11745c = false;
    }

    K3(int i10) {
    }

    public final K3 a(Object obj) {
        obj.getClass();
        b(this.f11744b + 1);
        Object[] objArr = this.f11743a;
        int i10 = this.f11744b;
        this.f11744b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }
}
