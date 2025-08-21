package fsimpl;

import android.webkit.WebView;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public class eN extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final long f133348a;

    /* renamed from: b, reason: collision with root package name */
    public int f133349b;

    public eN(long j10, WebView webView, ReferenceQueue referenceQueue) {
        super(webView, referenceQueue);
        this.f133348a = j10;
    }
}
