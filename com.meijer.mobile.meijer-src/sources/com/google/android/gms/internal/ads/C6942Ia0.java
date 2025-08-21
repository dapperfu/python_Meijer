package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ia0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6942Ia0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7349Ua0 f68488a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f68489b;

    /* renamed from: c, reason: collision with root package name */
    private final List f68490c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final Map f68491d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final String f68492e;

    /* renamed from: f, reason: collision with root package name */
    private final String f68493f;

    /* renamed from: g, reason: collision with root package name */
    private final EnumC6976Ja0 f68494g;

    public final WebView a() {
        return this.f68489b;
    }

    public final EnumC6976Ja0 d() {
        return this.f68494g;
    }

    public final C7349Ua0 e() {
        return this.f68488a;
    }

    public final String f() {
        return this.f68493f;
    }

    public final String g() {
        return this.f68492e;
    }

    public static C6942Ia0 b(C7349Ua0 c7349Ua0, WebView webView, String str, String str2) {
        if (str2 != null) {
            C6774Db0.d(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new C6942Ia0(c7349Ua0, webView, null, null, str, str2, EnumC6976Ja0.HTML);
    }

    public static C6942Ia0 c(C7349Ua0 c7349Ua0, WebView webView, String str, String str2) {
        C6774Db0.d("", 256, "CustomReferenceData is greater than 256 characters");
        return new C6942Ia0(c7349Ua0, webView, null, null, str, "", EnumC6976Ja0.JAVASCRIPT);
    }

    public final List h() {
        return Collections.unmodifiableList(this.f68490c);
    }

    public final Map i() {
        return Collections.unmodifiableMap(this.f68491d);
    }

    private C6942Ia0(C7349Ua0 c7349Ua0, WebView webView, String str, List list, String str2, String str3, EnumC6976Ja0 enumC6976Ja0) {
        this.f68488a = c7349Ua0;
        this.f68489b = webView;
        this.f68494g = enumC6976Ja0;
        this.f68493f = str2;
        this.f68492e = str3;
    }
}
