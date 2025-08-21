package androidx.core.view;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final DisplayCutout f54141a;

    static class a {
        static int a(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* renamed from: androidx.core.view.b$b, reason: collision with other inner class name */
    static class C1110b {
        static Insets a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    static b f(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new b(displayCutout);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(this.f54141a);
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(this.f54141a);
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f54141a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f54141a);
        }
        return 0;
    }

    public c2.d e() {
        return Build.VERSION.SDK_INT >= 30 ? c2.d.d(C1110b.a(this.f54141a)) : c2.d.f61160e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return o2.c.a(this.f54141a, ((b) obj).f54141a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f54141a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f54141a + "}";
    }

    private b(DisplayCutout displayCutout) {
        this.f54141a = displayCutout;
    }
}
