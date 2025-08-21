package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes6.dex */
final class YF0 {

    /* renamed from: c, reason: collision with root package name */
    private final ME f72357c;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f72356b = new SparseArray();

    /* renamed from: a, reason: collision with root package name */
    private int f72355a = -1;

    public final void d() {
        for (int i10 = 0; i10 < this.f72356b.size(); i10++) {
            this.f72357c.zza(this.f72356b.valueAt(i10));
        }
        this.f72355a = -1;
        this.f72356b.clear();
    }

    public final void e(int i10) {
        int i11 = 0;
        while (i11 < this.f72356b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f72356b.keyAt(i12)) {
                return;
            }
            this.f72357c.zza(this.f72356b.valueAt(i11));
            this.f72356b.removeAt(i11);
            int i13 = this.f72355a;
            if (i13 > 0) {
                this.f72355a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public final Object a(int i10) {
        if (this.f72355a == -1) {
            this.f72355a = 0;
        }
        while (true) {
            int i11 = this.f72355a;
            if (i11 <= 0 || i10 >= this.f72356b.keyAt(i11)) {
                break;
            }
            this.f72355a--;
        }
        while (this.f72355a < this.f72356b.size() - 1 && i10 >= this.f72356b.keyAt(this.f72355a + 1)) {
            this.f72355a++;
        }
        return this.f72356b.valueAt(this.f72355a);
    }

    public final Object b() {
        return this.f72356b.valueAt(this.f72356b.size() - 1);
    }

    public final void c(int i10, Object obj) {
        if (this.f72355a == -1) {
            C8211gC.f(this.f72356b.size() == 0);
            this.f72355a = 0;
        }
        if (this.f72356b.size() > 0) {
            int iKeyAt = this.f72356b.keyAt(r0.size() - 1);
            C8211gC.d(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                this.f72357c.zza(this.f72356b.valueAt(r1.size() - 1));
            }
        }
        this.f72356b.append(i10, obj);
    }

    public final boolean f() {
        return this.f72356b.size() == 0;
    }

    public YF0(ME me2) {
        this.f72357c = me2;
    }
}
