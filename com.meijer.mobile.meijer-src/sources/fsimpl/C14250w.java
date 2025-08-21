package fsimpl;

import android.view.View;

/* renamed from: fsimpl.w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14250w {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f133631a = fT.a("androidx.compose.ui.platform.AndroidComposeView");

    static boolean a(Object obj) {
        Class<?> cls;
        return (obj instanceof View) && (cls = f133631a) != null && obj.getClass() == cls;
    }
}
