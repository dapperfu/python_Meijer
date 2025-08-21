package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

/* loaded from: classes4.dex */
public class e implements r {

    /* renamed from: a, reason: collision with root package name */
    final r f58316a;

    /* renamed from: b, reason: collision with root package name */
    int f58317b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f58318c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f58319d = -1;

    /* renamed from: e, reason: collision with root package name */
    Object f58320e = null;

    @Override // androidx.recyclerview.widget.r
    public void a(int i10, int i11) {
        int i12;
        if (this.f58317b == 1 && i10 >= (i12 = this.f58318c)) {
            int i13 = this.f58319d;
            if (i10 <= i12 + i13) {
                this.f58319d = i13 + i11;
                this.f58318c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.f58318c = i10;
        this.f58319d = i11;
        this.f58317b = 1;
    }

    @Override // androidx.recyclerview.widget.r
    public void b(int i10, int i11) {
        int i12;
        if (this.f58317b == 2 && (i12 = this.f58318c) >= i10 && i12 <= i10 + i11) {
            this.f58319d += i11;
            this.f58318c = i10;
        } else {
            e();
            this.f58318c = i10;
            this.f58319d = i11;
            this.f58317b = 2;
        }
    }

    @Override // androidx.recyclerview.widget.r
    @SuppressLint({"UnknownNullness"})
    public void c(int i10, int i11, Object obj) {
        int i12;
        if (this.f58317b == 3) {
            int i13 = this.f58318c;
            int i14 = this.f58319d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f58320e == obj) {
                this.f58318c = Math.min(i10, i13);
                this.f58319d = Math.max(i14 + i13, i12) - this.f58318c;
                return;
            }
        }
        e();
        this.f58318c = i10;
        this.f58319d = i11;
        this.f58320e = obj;
        this.f58317b = 3;
    }

    public void e() {
        int i10 = this.f58317b;
        if (i10 == 0) {
            return;
        }
        if (i10 == 1) {
            this.f58316a.a(this.f58318c, this.f58319d);
        } else if (i10 == 2) {
            this.f58316a.b(this.f58318c, this.f58319d);
        } else if (i10 == 3) {
            this.f58316a.c(this.f58318c, this.f58319d, this.f58320e);
        }
        this.f58320e = null;
        this.f58317b = 0;
    }

    public e(r rVar) {
        this.f58316a = rVar;
    }

    @Override // androidx.recyclerview.widget.r
    public void d(int i10, int i11) {
        e();
        this.f58316a.d(i10, i11);
    }
}
