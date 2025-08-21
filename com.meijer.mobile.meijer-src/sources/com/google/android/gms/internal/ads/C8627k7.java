package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.k7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8627k7 {

    /* renamed from: d, reason: collision with root package name */
    protected static final Comparator f76423d = new C8520j7();

    /* renamed from: a, reason: collision with root package name */
    private final List f76424a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f76425b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    private int f76426c = 0;

    private final synchronized void c() {
        while (this.f76426c > 4096) {
            byte[] bArr = (byte[]) this.f76424a.remove(0);
            this.f76425b.remove(bArr);
            this.f76426c -= bArr.length;
        }
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f76424a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f76425b, bArr, f76423d);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f76425b.add(iBinarySearch, bArr);
                this.f76426c += length;
                c();
            }
        }
    }

    public final synchronized byte[] b(int i10) {
        for (int i11 = 0; i11 < this.f76425b.size(); i11++) {
            byte[] bArr = (byte[]) this.f76425b.get(i11);
            int length = bArr.length;
            if (length >= i10) {
                this.f76426c -= length;
                this.f76425b.remove(i11);
                this.f76424a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public C8627k7(int i10) {
    }
}
