package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.xb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9935xb0 extends C9507tb0 {

    /* renamed from: e, reason: collision with root package name */
    private WebView f79819e;

    /* renamed from: f, reason: collision with root package name */
    private Long f79820f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f79821g;

    @Override // com.google.android.gms.internal.ads.C9507tb0
    public final void i(C6885Ka0 c6885Ka0, C6817Ia0 c6817Ia0) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map mapI = c6817Ia0.i();
        Iterator it = mapI.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        j(c6885Ka0, c6817Ia0, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.C9507tb0
    public final void o() {
        WebView webView = new WebView(C8226hb0.b().a());
        this.f79819e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f79819e.getSettings().setAllowContentAccess(false);
        this.f79819e.getSettings().setAllowFileAccess(false);
        com.fullstory.FS.setWebViewClient(this.f79819e, new C9721vb0(this));
        n(this.f79819e);
        C8438jb0.k(this.f79819e, null);
        Iterator it = this.f79821g.keySet().iterator();
        if (!it.hasNext()) {
            this.f79820f = Long.valueOf(System.nanoTime());
        } else {
            throw null;
        }
    }

    public C9935xb0(String str, Map map, String str2) {
        super(str);
        this.f79820f = null;
        this.f79821g = map;
    }

    @Override // com.google.android.gms.internal.ads.C9507tb0
    public final void c() {
        long jConvert;
        super.c();
        if (this.f79820f == null) {
            jConvert = 4000;
        } else {
            jConvert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f79820f.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new RunnableC9828wb0(this), Math.max(4000 - jConvert, 2000L));
        this.f79819e = null;
    }
}
