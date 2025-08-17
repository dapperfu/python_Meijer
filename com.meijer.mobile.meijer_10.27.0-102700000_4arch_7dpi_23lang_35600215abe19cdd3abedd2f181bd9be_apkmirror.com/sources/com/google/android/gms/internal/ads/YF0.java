package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes6.dex */
final class YF0 {

    /* renamed from: c, reason: collision with root package name */
    private final ME f71517c;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f71516b = new SparseArray();

    /* renamed from: a, reason: collision with root package name */
    private int f71515a = -1;

    public final void d() {
        for (int i10 = 0; i10 < this.f71516b.size(); i10++) {
            this.f71517c.zza(this.f71516b.valueAt(i10));
        }
        this.f71515a = -1;
        this.f71516b.clear();
    }

    public final void e(int i10) {
        int i11 = 0;
        while (i11 < this.f71516b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f71516b.keyAt(i12)) {
                return;
            }
            this.f71517c.zza(this.f71516b.valueAt(i11));
            this.f71516b.removeAt(i11);
            int i13 = this.f71515a;
            if (i13 > 0) {
                this.f71515a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public final Object a(int i10) {
        if (this.f71515a == -1) {
            this.f71515a = 0;
        }
        while (true) {
            int i11 = this.f71515a;
            if (i11 <= 0 || i10 >= this.f71516b.keyAt(i11)) {
                break;
            }
            this.f71515a--;
        }
        while (this.f71515a < this.f71516b.size() - 1 && i10 >= this.f71516b.keyAt(this.f71515a + 1)) {
            this.f71515a++;
        }
        return this.f71516b.valueAt(this.f71515a);
    }

    public final Object b() {
        return this.f71516b.valueAt(this.f71516b.size() - 1);
    }

    public final void c(int i10, Object obj) {
        if (this.f71515a == -1) {
            C8086gC.f(this.f71516b.size() == 0);
            this.f71515a = 0;
        }
        if (this.f71516b.size() > 0) {
            int iKeyAt = this.f71516b.keyAt(r0.size() - 1);
            C8086gC.d(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                this.f71517c.zza(this.f71516b.valueAt(r1.size() - 1));
            }
        }
        this.f71516b.append(i10, obj);
    }

    public final boolean f() {
        return this.f71516b.size() == 0;
    }

    public YF0(ME me2) {
        this.f71517c = me2;
    }
}
