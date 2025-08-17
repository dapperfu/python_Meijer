package H4;

import android.view.ViewGroup;

/* renamed from: H4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3663j {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f12174a;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f12175b;

    public static C3663j b(ViewGroup viewGroup) {
        return (C3663j) viewGroup.getTag(C3661h.f12171c);
    }

    static void c(ViewGroup viewGroup, C3663j c3663j) {
        viewGroup.setTag(C3661h.f12171c, c3663j);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f12174a) != this || (runnable = this.f12175b) == null) {
            return;
        }
        runnable.run();
    }
}
