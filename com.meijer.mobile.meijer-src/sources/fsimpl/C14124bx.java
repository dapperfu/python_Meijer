package fsimpl;

import android.view.View;
import com.fullstory.instrumentation.frameworks.compose.FSComposeAndroidComposeView;

/* renamed from: fsimpl.bx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14124bx {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f133141a;

    static {
        f133141a = C14118br.a() ? fT.a("androidx.compose.ui.platform.AndroidComposeView") : null;
    }

    public static boolean a(View view) {
        return (view instanceof FSComposeAndroidComposeView) && bE.a(view, f133141a);
    }
}
