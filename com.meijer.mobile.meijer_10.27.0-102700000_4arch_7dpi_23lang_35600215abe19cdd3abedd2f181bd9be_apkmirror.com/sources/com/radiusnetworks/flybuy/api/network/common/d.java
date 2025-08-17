package com.radiusnetworks.flybuy.api.network.common;

import java.io.File;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final Long f119920c = 10485760L;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f119921a = false;

    /* renamed from: b, reason: collision with root package name */
    public final okhttp3.b f119922b;

    public d(String str, File file) {
        this.f119922b = new okhttp3.b(new File(file.getAbsolutePath(), "com.radiusnetworks.flybuy.sdk.api"), f119920c.longValue());
    }
}
