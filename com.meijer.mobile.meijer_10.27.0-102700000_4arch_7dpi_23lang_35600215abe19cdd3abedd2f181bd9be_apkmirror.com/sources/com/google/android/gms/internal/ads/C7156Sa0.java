package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;

/* renamed from: com.google.android.gms.internal.ads.Sa0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7156Sa0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7224Ua0 f70125a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f70126b;

    /* renamed from: c, reason: collision with root package name */
    private C7259Vb0 f70127c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f70128d;

    /* renamed from: e, reason: collision with root package name */
    private final C8119gb0 f70129e;

    public static C7156Sa0 b(C7224Ua0 c7224Ua0, WebView webView, boolean z10) {
        return new C7156Sa0(c7224Ua0, webView, true);
    }

    static /* bridge */ /* synthetic */ void c(C7156Sa0 c7156Sa0, String str) {
        AbstractC6749Ga0 abstractC6749Ga0 = (AbstractC6749Ga0) c7156Sa0.f70128d.get(str);
        if (abstractC6749Ga0 != null) {
            abstractC6749Ga0.c();
            c7156Sa0.f70128d.remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* bridge */ /* synthetic */ void e(C7156Sa0 c7156Sa0, String str) {
        EnumC6919La0 enumC6919La0 = EnumC6919La0.DEFINED_BY_JAVASCRIPT;
        EnumC7020Oa0 enumC7020Oa0 = EnumC7020Oa0.DEFINED_BY_JAVASCRIPT;
        EnumC7190Ta0 enumC7190Ta0 = EnumC7190Ta0.JAVASCRIPT;
        C6885Ka0 c6885Ka0 = new C6885Ka0(C6783Ha0.a(enumC6919La0, enumC7020Oa0, enumC7190Ta0, enumC7190Ta0, false), C6817Ia0.b(c7156Sa0.f70125a, c7156Sa0.f70126b, null, null), str);
        c7156Sa0.f70128d.put(str, c6885Ka0);
        c6885Ka0.d(c7156Sa0.a());
        for (C8012fb0 c8012fb0 : c7156Sa0.f70129e.a()) {
            c6885Ka0.b((View) c8012fb0.b().get(), c8012fb0.a(), c8012fb0.c());
        }
        c6885Ka0.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        L4.e.j(this.f70126b, "omidJsSessionService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    final View a() {
        C7259Vb0 c7259Vb0 = this.f70127c;
        if (c7259Vb0 == null) {
            return null;
        }
        return (View) c7259Vb0.get();
    }

    public final void f(View view, EnumC6986Na0 enumC6986Na0, String str) {
        Iterator it = this.f70128d.values().iterator();
        while (it.hasNext()) {
            ((AbstractC6749Ga0) it.next()).b(view, enumC6986Na0, "Ad overlay");
        }
        this.f70129e.b(view, enumC6986Na0, "Ad overlay");
    }

    public final void g(C6809Ht c6809Ht) {
        Iterator it = this.f70128d.values().iterator();
        while (it.hasNext()) {
            ((AbstractC6749Ga0) it.next()).c();
        }
        Timer timer = new Timer();
        timer.schedule(new C7054Pa0(this, c6809Ht, timer), 1000L);
    }

    private C7156Sa0(C7224Ua0 c7224Ua0, WebView webView, boolean z10) {
        HashMap map = new HashMap();
        this.f70128d = map;
        this.f70129e = new C8119gb0();
        C6649Db0.a();
        this.f70125a = c7224Ua0;
        this.f70126b = webView;
        if (a() != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((AbstractC6749Ga0) it.next()).d(webView);
            }
            this.f70127c = new C7259Vb0(webView);
        }
        if (L4.f.a("WEB_MESSAGE_LISTENER")) {
            h();
            L4.e.a(this.f70126b, "omidJsSessionService", new HashSet(Arrays.asList("*")), new C7088Qa0(this));
            return;
        }
        throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }
}
