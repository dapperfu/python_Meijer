package Q5;

import Q5.InterfaceC5078j;
import android.util.DisplayMetrics;

/* renamed from: Q5.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C5079k implements InterfaceC5078j.b {

    /* renamed from: a, reason: collision with root package name */
    private final DisplayMetrics f29815a;

    @Override // Q5.InterfaceC5078j.b
    public int a() {
        return this.f29815a.heightPixels;
    }

    @Override // Q5.InterfaceC5078j.b
    public int b() {
        return this.f29815a.widthPixels;
    }

    C5079k(DisplayMetrics displayMetrics) {
        this.f29815a = displayMetrics;
    }
}
