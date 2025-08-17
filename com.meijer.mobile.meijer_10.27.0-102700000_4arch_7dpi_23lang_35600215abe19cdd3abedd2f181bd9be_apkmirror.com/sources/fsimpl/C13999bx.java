package fsimpl;

import android.view.View;
import com.fullstory.instrumentation.frameworks.compose.FSComposeAndroidComposeView;

/* renamed from: fsimpl.bx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13999bx {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f131891a;

    static {
        f131891a = C13993br.a() ? fT.a("androidx.compose.ui.platform.AndroidComposeView") : null;
    }

    public static boolean a(View view) {
        return (view instanceof FSComposeAndroidComposeView) && bE.a(view, f131891a);
    }
}
