package p2;

import android.content.Context;
import android.view.PointerIcon;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private final PointerIcon f155342a;

    static class a {
        static PointerIcon a(Context context, int i10) {
            return PointerIcon.getSystemIcon(context, i10);
        }
    }

    public static K b(Context context, int i10) {
        return new K(a.a(context, i10));
    }

    public Object a() {
        return this.f155342a;
    }

    private K(PointerIcon pointerIcon) {
        this.f155342a = pointerIcon;
    }
}
