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
public final class C10060xb0 extends C9632tb0 {

    /* renamed from: e, reason: collision with root package name */
    private WebView f80659e;

    /* renamed from: f, reason: collision with root package name */
    private Long f80660f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f80661g;

    @Override // com.google.android.gms.internal.ads.C9632tb0
    public final void i(C7010Ka0 c7010Ka0, C6942Ia0 c6942Ia0) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map mapI = c6942Ia0.i();
        Iterator it = mapI.keySet().iterator();
        if (it.hasNext()) {
            throw null;
        }
        j(c7010Ka0, c6942Ia0, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.C9632tb0
    public final void o() {
        WebView webView = new WebView(C8351hb0.b().a());
        this.f80659e = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f80659e.getSettings().setAllowContentAccess(false);
        this.f80659e.getSettings().setAllowFileAccess(false);
        com.fullstory.FS.setWebViewClient(this.f80659e, new C9846vb0(this));
        n(this.f80659e);
        C8563jb0.k(this.f80659e, null);
        Iterator it = this.f80661g.keySet().iterator();
        if (!it.hasNext()) {
            this.f80660f = Long.valueOf(System.nanoTime());
        } else {
            throw null;
        }
    }

    public C10060xb0(String str, Map map, String str2) {
        super(str);
        this.f80660f = null;
        this.f80661g = map;
    }

    @Override // com.google.android.gms.internal.ads.C9632tb0
    public final void c() {
        long jConvert;
        super.c();
        if (this.f80660f == null) {
            jConvert = 4000;
        } else {
            jConvert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f80660f.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new RunnableC9953wb0(this), Math.max(4000 - jConvert, 2000L));
        this.f80659e = null;
    }
}
