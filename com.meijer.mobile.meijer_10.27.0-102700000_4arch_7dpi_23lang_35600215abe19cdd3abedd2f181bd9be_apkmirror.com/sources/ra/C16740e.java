package ra;

import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/webkit/WebView;", "", "a", "(Landroid/webkit/WebView;)V", "mobile-engage_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: ra.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16740e {
    public static final void a(WebView webView) {
        Intrinsics.j(webView, "<this>");
        if (G9.a.f11285a.c() && L4.f.a("FORCE_DARK")) {
            int i10 = webView.getContext().getResources().getConfiguration().uiMode & 48;
            if (i10 == 0 || i10 == 16) {
                L4.d.b(webView.getSettings(), 0);
            } else {
                if (i10 != 32) {
                    return;
                }
                L4.d.b(webView.getSettings(), 2);
            }
        }
    }
}
