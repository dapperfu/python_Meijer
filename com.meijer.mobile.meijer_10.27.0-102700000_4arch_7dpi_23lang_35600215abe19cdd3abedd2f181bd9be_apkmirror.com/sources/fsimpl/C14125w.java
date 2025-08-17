package fsimpl;

import android.view.View;

/* renamed from: fsimpl.w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C14125w {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f132381a = fT.a("androidx.compose.ui.platform.AndroidComposeView");

    static boolean a(Object obj) {
        Class<?> cls;
        return (obj instanceof View) && (cls = f132381a) != null && obj.getClass() == cls;
    }
}
