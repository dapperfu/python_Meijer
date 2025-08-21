package com.adobe.marketing.mobile;

import java.io.Serializable;

/* renamed from: com.adobe.marketing.mobile.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6569c implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final C6569c f63211c = new C6569c("general.unexpected", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final C6569c f63212d = new C6569c("general.callback.timeout", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final C6569c f63213e = new C6569c("general.callback.null", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final C6569c f63214f = new C6569c("general.server.error", 4);

    /* renamed from: g, reason: collision with root package name */
    public static final C6569c f63215g = new C6569c("general.network.error", 5);

    /* renamed from: h, reason: collision with root package name */
    public static final C6569c f63216h = new C6569c("general.request.invalid", 6);

    /* renamed from: i, reason: collision with root package name */
    public static final C6569c f63217i = new C6569c("general.response.invalid", 7);

    /* renamed from: j, reason: collision with root package name */
    public static final C6569c f63218j = new C6569c("general.database.error", 8);

    /* renamed from: k, reason: collision with root package name */
    public static final C6569c f63219k = new C6569c("general.extension.not.initialized", 11);

    /* renamed from: a, reason: collision with root package name */
    private final String f63220a;

    /* renamed from: b, reason: collision with root package name */
    private final int f63221b;

    public int a() {
        return this.f63221b;
    }

    public String b() {
        return this.f63220a;
    }

    protected C6569c(String str, int i10) {
        this.f63220a = str;
        this.f63221b = i10;
    }
}
