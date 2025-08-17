package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* loaded from: classes4.dex */
public class e implements r {

    /* renamed from: a, reason: collision with root package name */
    final r f58092a;

    /* renamed from: b, reason: collision with root package name */
    int f58093b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f58094c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f58095d = -1;

    /* renamed from: e, reason: collision with root package name */
    Object f58096e = null;

    @Override // androidx.recyclerview.widget.r
    public void a(int i10, int i11) {
        int i12;
        if (this.f58093b == 1 && i10 >= (i12 = this.f58094c)) {
            int i13 = this.f58095d;
            if (i10 <= i12 + i13) {
                this.f58095d = i13 + i11;
                this.f58094c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.f58094c = i10;
        this.f58095d = i11;
        this.f58093b = 1;
    }

    @Override // androidx.recyclerview.widget.r
    public void b(int i10, int i11) {
        int i12;
        if (this.f58093b == 2 && (i12 = this.f58094c) >= i10 && i12 <= i10 + i11) {
            this.f58095d += i11;
            this.f58094c = i10;
        } else {
            e();
            this.f58094c = i10;
            this.f58095d = i11;
            this.f58093b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public void c(int i10, int i11, Object obj) {
        int i12;
        if (this.f58093b == 3) {
            int i13 = this.f58094c;
            int i14 = this.f58095d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f58096e == obj) {
                this.f58094c = Math.min(i10, i13);
                this.f58095d = Math.max(i14 + i13, i12) - this.f58094c;
                return;
            }
        }
        e();
        this.f58094c = i10;
        this.f58095d = i11;
        this.f58096e = obj;
        this.f58093b = 3;
    }

    public void e() {
        int i10 = this.f58093b;
        if (i10 == 0) {
            return;
        }
        if (i10 == 1) {
            this.f58092a.a(this.f58094c, this.f58095d);
        } else if (i10 == 2) {
            this.f58092a.b(this.f58094c, this.f58095d);
        } else if (i10 == 3) {
            this.f58092a.c(this.f58094c, this.f58095d, this.f58096e);
        }
        this.f58096e = null;
        this.f58093b = 0;
    }

    public e(r rVar) {
        this.f58092a = rVar;
    }

    @Override // androidx.recyclerview.widget.r
    public void d(int i10, int i11) {
        e();
        this.f58092a.d(i10, i11);
    }
}
