package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    protected static final Comparator<byte[]> f63798e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List<byte[]> f63799a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<byte[]> f63800b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    private int f63801c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f63802d;

    private synchronized void c() {
        while (this.f63801c > this.f63802d) {
            byte[] bArrRemove = this.f63799a.remove(0);
            this.f63800b.remove(bArrRemove);
            this.f63801c -= bArrRemove.length;
        }
    }

    public synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f63800b.size(); i11++) {
            byte[] bArr = this.f63800b.get(i11);
            if (bArr.length >= i10) {
                this.f63801c -= bArr.length;
                this.f63800b.remove(i11);
                this.f63799a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f63802d) {
                this.f63799a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f63800b, bArr, f63798e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f63800b.add(iBinarySearch, bArr);
                this.f63801c += bArr.length;
                c();
            }
        }
    }

    class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }

        a() {
        }
    }

    public c(int i10) {
        this.f63802d = i10;
    }
}
