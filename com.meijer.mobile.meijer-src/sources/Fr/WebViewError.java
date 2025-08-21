package Fr;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LFr/e;", "", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceError;", "error", "<init>", "(Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/webkit/WebResourceRequest;", "getRequest", "()Landroid/webkit/WebResourceRequest;", "b", "Landroid/webkit/WebResourceError;", "getError", "()Landroid/webkit/WebResourceError;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Fr.e, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class WebViewError {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final WebResourceRequest request;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final WebResourceError error;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebViewError)) {
            return false;
        }
        WebViewError webViewError = (WebViewError) other;
        return Intrinsics.e(this.request, webViewError.request) && Intrinsics.e(this.error, webViewError.error);
    }

    public WebViewError(WebResourceRequest webResourceRequest, WebResourceError error) {
        Intrinsics.j(error, "error");
        this.request = webResourceRequest;
        this.error = error;
    }

    public int hashCode() {
        WebResourceRequest webResourceRequest = this.request;
        return ((webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31) + this.error.hashCode();
    }

    public String toString() {
        return "WebViewError(request=" + this.request + ", error=" + this.error + ')';
    }
}
