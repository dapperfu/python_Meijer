package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: e, reason: collision with root package name */
    protected static final Comparator<byte[]> f62959e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final List<byte[]> f62960a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<byte[]> f62961b = new ArrayList(64);

    /* renamed from: c, reason: collision with root package name */
    private int f62962c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final int f62963d;

    private synchronized void c() {
        while (this.f62962c > this.f62963d) {
            byte[] bArrRemove = this.f62960a.remove(0);
            this.f62961b.remove(bArrRemove);
            this.f62962c -= bArrRemove.length;
        }
    }

    public synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f62961b.size(); i11++) {
            byte[] bArr = this.f62961b.get(i11);
            if (bArr.length >= i10) {
                this.f62962c -= bArr.length;
                this.f62961b.remove(i11);
                this.f62960a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f62963d) {
                this.f62960a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f62961b, bArr, f62959e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f62961b.add(iBinarySearch, bArr);
                this.f62962c += bArr.length;
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
        this.f62963d = i10;
    }
}
