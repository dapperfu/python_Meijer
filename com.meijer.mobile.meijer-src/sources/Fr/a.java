package Fr;

import Fr.c;
import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0016@PX\u0096.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LFr/a;", "Landroid/webkit/WebChromeClient;", "<init>", "()V", "Landroid/webkit/WebView;", "view", "", "title", "", "onReceivedTitle", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", BarcodePickDeserializer.FIELD_ICON, "onReceivedIcon", "(Landroid/webkit/WebView;Landroid/graphics/Bitmap;)V", "", "newProgress", "onProgressChanged", "(Landroid/webkit/WebView;I)V", "LFr/t;", "value", "a", "LFr/t;", "()LFr/t;", "b", "(LFr/t;)V", "state", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public class a extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public t state;

    public t a() {
        t tVar = this.state;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.x("state");
        return null;
    }

    public void b(t tVar) {
        Intrinsics.j(tVar, "<set-?>");
        this.state = tVar;
    }

    @Override // android.webkit.WebChromeClient
    public void onProgressChanged(WebView view, int newProgress) {
        Intrinsics.j(view, "view");
        super.onProgressChanged(view, newProgress);
        if (a().d() instanceof c.a) {
            return;
        }
        a().j(new c.Loading(newProgress / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedIcon(WebView view, Bitmap icon) {
        Intrinsics.j(view, "view");
        super.onReceivedIcon(view, icon);
        a().k(icon);
    }

    @Override // android.webkit.WebChromeClient
    public void onReceivedTitle(WebView view, String title) {
        Intrinsics.j(view, "view");
        super.onReceivedTitle(view, title);
        a().l(title);
    }
}
