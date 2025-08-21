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
public final class C7281Sa0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7349Ua0 f70965a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f70966b;

    /* renamed from: c, reason: collision with root package name */
    private C7384Vb0 f70967c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f70968d;

    /* renamed from: e, reason: collision with root package name */
    private final C8244gb0 f70969e;

    public static C7281Sa0 b(C7349Ua0 c7349Ua0, WebView webView, boolean z10) {
        return new C7281Sa0(c7349Ua0, webView, true);
    }

    static /* bridge */ /* synthetic */ void c(C7281Sa0 c7281Sa0, String str) {
        AbstractC6874Ga0 abstractC6874Ga0 = (AbstractC6874Ga0) c7281Sa0.f70968d.get(str);
        if (abstractC6874Ga0 != null) {
            abstractC6874Ga0.c();
            c7281Sa0.f70968d.remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* bridge */ /* synthetic */ void e(C7281Sa0 c7281Sa0, String str) {
        EnumC7044La0 enumC7044La0 = EnumC7044La0.DEFINED_BY_JAVASCRIPT;
        EnumC7145Oa0 enumC7145Oa0 = EnumC7145Oa0.DEFINED_BY_JAVASCRIPT;
        EnumC7315Ta0 enumC7315Ta0 = EnumC7315Ta0.JAVASCRIPT;
        C7010Ka0 c7010Ka0 = new C7010Ka0(C6908Ha0.a(enumC7044La0, enumC7145Oa0, enumC7315Ta0, enumC7315Ta0, false), C6942Ia0.b(c7281Sa0.f70965a, c7281Sa0.f70966b, null, null), str);
        c7281Sa0.f70968d.put(str, c7010Ka0);
        c7010Ka0.d(c7281Sa0.a());
        for (C8137fb0 c8137fb0 : c7281Sa0.f70969e.a()) {
            c7010Ka0.b((View) c8137fb0.b().get(), c8137fb0.a(), c8137fb0.c());
        }
        c7010Ka0.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        M4.e.j(this.f70966b, "omidJsSessionService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    final View a() {
        C7384Vb0 c7384Vb0 = this.f70967c;
        if (c7384Vb0 == null) {
            return null;
        }
        return (View) c7384Vb0.get();
    }

    public final void f(View view, EnumC7111Na0 enumC7111Na0, String str) {
        Iterator it = this.f70968d.values().iterator();
        while (it.hasNext()) {
            ((AbstractC6874Ga0) it.next()).b(view, enumC7111Na0, "Ad overlay");
        }
        this.f70969e.b(view, enumC7111Na0, "Ad overlay");
    }

    public final void g(C6934Ht c6934Ht) {
        Iterator it = this.f70968d.values().iterator();
        while (it.hasNext()) {
            ((AbstractC6874Ga0) it.next()).c();
        }
        Timer timer = new Timer();
        timer.schedule(new C7179Pa0(this, c6934Ht, timer), 1000L);
    }

    private C7281Sa0(C7349Ua0 c7349Ua0, WebView webView, boolean z10) {
        HashMap map = new HashMap();
        this.f70968d = map;
        this.f70969e = new C8244gb0();
        C6774Db0.a();
        this.f70965a = c7349Ua0;
        this.f70966b = webView;
        if (a() != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((AbstractC6874Ga0) it.next()).d(webView);
            }
            this.f70967c = new C7384Vb0(webView);
        }
        if (M4.f.a("WEB_MESSAGE_LISTENER")) {
            h();
            M4.e.a(this.f70966b, "omidJsSessionService", new HashSet(Arrays.asList("*")), new C7213Qa0(this));
            return;
        }
        throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }
}
