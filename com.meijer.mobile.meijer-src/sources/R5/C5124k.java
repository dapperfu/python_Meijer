package R5;

import R5.InterfaceC5123j;
import android.util.DisplayMetrics;

/* renamed from: R5.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C5124k implements InterfaceC5123j.b {

    /* renamed from: a, reason: collision with root package name */
    private final DisplayMetrics f31926a;

    @Override // R5.InterfaceC5123j.b
    public int a() {
        return this.f31926a.heightPixels;
    }

    @Override // R5.InterfaceC5123j.b
    public int b() {
        return this.f31926a.widthPixels;
    }

    C5124k(DisplayMetrics displayMetrics) {
        this.f31926a = displayMetrics;
    }
}
