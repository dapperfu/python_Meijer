package com.adobe.marketing.mobile;

import java.io.Serializable;

/* renamed from: com.adobe.marketing.mobile.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6444c implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C6444c f62372c = new C6444c("general.unexpected", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final C6444c f62373d = new C6444c("general.callback.timeout", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final C6444c f62374e = new C6444c("general.callback.null", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final C6444c f62375f = new C6444c("general.server.error", 4);

    /* renamed from: g, reason: collision with root package name */
    public static final C6444c f62376g = new C6444c("general.network.error", 5);

    /* renamed from: h, reason: collision with root package name */
    public static final C6444c f62377h = new C6444c("general.request.invalid", 6);

    /* renamed from: i, reason: collision with root package name */
    public static final C6444c f62378i = new C6444c("general.response.invalid", 7);

    /* renamed from: j, reason: collision with root package name */
    public static final C6444c f62379j = new C6444c("general.database.error", 8);

    /* renamed from: k, reason: collision with root package name */
    public static final C6444c f62380k = new C6444c("general.extension.not.initialized", 11);

    /* renamed from: a, reason: collision with root package name */
    private final String f62381a;

    /* renamed from: b, reason: collision with root package name */
    private final int f62382b;

    public int a() {
        return this.f62382b;
    }

    public String b() {
        return this.f62381a;
    }

    protected C6444c(String str, int i10) {
        this.f62381a = str;
        this.f62382b = i10;
    }
}
