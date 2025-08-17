package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ia0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6817Ia0 {

    /* renamed from: a, reason: collision with root package name */
    private final C7224Ua0 f67648a;

    /* renamed from: b, reason: collision with root package name */
    private final WebView f67649b;

    /* renamed from: c, reason: collision with root package name */
    private final List f67650c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final Map f67651d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final String f67652e;

    /* renamed from: f, reason: collision with root package name */
    private final String f67653f;

    /* renamed from: g, reason: collision with root package name */
    private final EnumC6851Ja0 f67654g;

    public final WebView a() {
        return this.f67649b;
    }

    public final EnumC6851Ja0 d() {
        return this.f67654g;
    }

    public final C7224Ua0 e() {
        return this.f67648a;
    }

    public final String f() {
        return this.f67653f;
    }

    public final String g() {
        return this.f67652e;
    }

    public static C6817Ia0 b(C7224Ua0 c7224Ua0, WebView webView, String str, String str2) {
        if (str2 != null) {
            C6649Db0.d(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new C6817Ia0(c7224Ua0, webView, null, null, str, str2, EnumC6851Ja0.HTML);
    }

    public static C6817Ia0 c(C7224Ua0 c7224Ua0, WebView webView, String str, String str2) {
        C6649Db0.d("", 256, "CustomReferenceData is greater than 256 characters");
        return new C6817Ia0(c7224Ua0, webView, null, null, str, "", EnumC6851Ja0.JAVASCRIPT);
    }

    public final List h() {
        return Collections.unmodifiableList(this.f67650c);
    }

    public final Map i() {
        return Collections.unmodifiableMap(this.f67651d);
    }

    private C6817Ia0(C7224Ua0 c7224Ua0, WebView webView, String str, List list, String str2, String str3, EnumC6851Ja0 enumC6851Ja0) {
        this.f67648a = c7224Ua0;
        this.f67649b = webView;
        this.f67654g = enumC6851Ja0;
        this.f67653f = str2;
        this.f67652e = str3;
    }
}
