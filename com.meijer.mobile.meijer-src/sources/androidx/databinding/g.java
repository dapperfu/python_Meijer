package androidx.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static e f54320a = new DataBinderMapperImpl();

    /* renamed from: b, reason: collision with root package name */
    private static f f54321b = null;

    public static <T extends p> T f(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10, f fVar) {
        boolean z11 = viewGroup != null && z10;
        return z11 ? (T) c(fVar, viewGroup, z11 ? viewGroup.getChildCount() : 0, i10) : (T) a(fVar, layoutInflater.inflate(i10, viewGroup, z10), i10);
    }

    static <T extends p> T a(f fVar, View view, int i10) {
        return (T) f54320a.b(fVar, view, i10);
    }

    static <T extends p> T b(f fVar, View[] viewArr, int i10) {
        return (T) f54320a.c(fVar, viewArr, i10);
    }

    public static f d() {
        return f54321b;
    }

    public static <T extends p> T e(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10) {
        return (T) f(layoutInflater, i10, viewGroup, z10, f54321b);
    }

    private static <T extends p> T c(f fVar, ViewGroup viewGroup, int i10, int i11) {
        int childCount = viewGroup.getChildCount();
        int i12 = childCount - i10;
        if (i12 == 1) {
            return (T) a(fVar, viewGroup.getChildAt(childCount - 1), i11);
        }
        View[] viewArr = new View[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            viewArr[i13] = viewGroup.getChildAt(i13 + i10);
        }
        return (T) b(fVar, viewArr, i11);
    }
}
