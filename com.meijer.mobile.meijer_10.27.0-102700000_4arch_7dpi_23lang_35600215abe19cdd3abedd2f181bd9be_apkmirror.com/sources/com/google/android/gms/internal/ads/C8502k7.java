package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.k7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8502k7 {

    /* renamed from: d, reason: collision with root package name */
    protected static final Comparator f75583d = new C8395j7();

    /* renamed from: a, reason: collision with root package name */
    private final List f75584a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f75585b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    private int f75586c = 0;

    private final synchronized void c() {
        while (this.f75586c > 4096) {
            byte[] bArr = (byte[]) this.f75584a.remove(0);
            this.f75585b.remove(bArr);
            this.f75586c -= bArr.length;
        }
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.f75584a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f75585b, bArr, f75583d);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f75585b.add(iBinarySearch, bArr);
                this.f75586c += length;
                c();
            }
        }
    }

    public final synchronized byte[] b(int i10) {
        for (int i11 = 0; i11 < this.f75585b.size(); i11++) {
            byte[] bArr = (byte[]) this.f75585b.get(i11);
            int length = bArr.length;
            if (length >= i10) {
                this.f75586c -= length;
                this.f75585b.remove(i11);
                this.f75584a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public C8502k7(int i10) {
    }
}
