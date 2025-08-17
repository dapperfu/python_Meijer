package Ed;

import com.google.android.gms.common.api.a;
import java.util.Arrays;

/* loaded from: classes6.dex */
class K3 extends C3506l4 {

    /* renamed from: a, reason: collision with root package name */
    Object[] f8191a = new Object[4];

    /* renamed from: b, reason: collision with root package name */
    int f8192b = 0;

    /* renamed from: c, reason: collision with root package name */
    boolean f8193c;

    private final void b(int i10) {
        Object[] objArr = this.f8191a;
        int length = objArr.length;
        if (length >= i10) {
            if (this.f8193c) {
                this.f8191a = (Object[]) objArr.clone();
                this.f8193c = false;
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
        this.f8191a = Arrays.copyOf(objArr, i11);
        this.f8193c = false;
    }

    K3(int i10) {
    }

    public final K3 a(Object obj) {
        obj.getClass();
        b(this.f8192b + 1);
        Object[] objArr = this.f8191a;
        int i10 = this.f8192b;
        this.f8192b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }
}
