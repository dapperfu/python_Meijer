package Lc;

import android.os.AsyncTask;
import android.webkit.WebView;
import com.fullstory.FS;
import com.google.android.gms.internal.ads.M9;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
final class r extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ u f18016a;

    /* synthetic */ r(u uVar, t tVar) {
        this.f18016a = uVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            u uVar = this.f18016a;
            uVar.f18030h = (M9) uVar.f18025c.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            e = e10;
            Qc.p.h("", e);
        } catch (ExecutionException e11) {
            e = e11;
            Qc.p.h("", e);
        } catch (TimeoutException e12) {
            Qc.p.h("", e12);
        }
        return this.f18016a.zzp();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        u uVar = this.f18016a;
        String str = (String) obj;
        if (uVar.f18028f == null || str == null) {
            return;
        }
        WebView webView = uVar.f18028f;
        FS.trackWebView(webView);
        webView.loadUrl(str);
    }
}
