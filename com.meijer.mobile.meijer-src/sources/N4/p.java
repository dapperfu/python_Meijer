package N4;

import M4.e;
import android.net.Uri;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* loaded from: classes4.dex */
public class p implements WebMessageListenerBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    private final e.a f20587a;

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        M4.b bVarB = o.b((WebMessageBoundaryInterface) iw.a.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (bVarB != null) {
            this.f20587a.onPostMessage(webView, bVarB, uri, z10, m.b(invocationHandler2));
        }
    }

    public p(e.a aVar) {
        this.f20587a = aVar;
    }
}
