package p2;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    private int f155337a;

    /* renamed from: b, reason: collision with root package name */
    private int f155338b;

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f155338b = i10;
        } else {
            this.f155337a = i10;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i10) {
        if (i10 == 1) {
            this.f155338b = 0;
        } else {
            this.f155337a = 0;
        }
    }

    public int a() {
        return this.f155337a | this.f155338b;
    }

    public F(ViewGroup viewGroup) {
    }
}
