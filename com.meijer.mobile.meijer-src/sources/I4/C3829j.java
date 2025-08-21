package I4;

import android.view.ViewGroup;

/* renamed from: I4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3829j {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f14238a;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f14239b;

    public static C3829j b(ViewGroup viewGroup) {
        return (C3829j) viewGroup.getTag(C3827h.f14235c);
    }

    static void c(ViewGroup viewGroup, C3829j c3829j) {
        viewGroup.setTag(C3827h.f14235c, c3829j);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f14238a) != this || (runnable = this.f14239b) == null) {
            return;
        }
        runnable.run();
    }
}
