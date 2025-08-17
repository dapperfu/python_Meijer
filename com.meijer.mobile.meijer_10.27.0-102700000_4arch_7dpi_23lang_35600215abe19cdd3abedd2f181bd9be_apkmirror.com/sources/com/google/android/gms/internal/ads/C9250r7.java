package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.r7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9250r7 {

    /* renamed from: a, reason: collision with root package name */
    private final int f77939a;

    /* renamed from: b, reason: collision with root package name */
    private final List f77940b;

    /* renamed from: c, reason: collision with root package name */
    private final int f77941c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f77942d;

    public C9250r7(int i10, List list, int i11, InputStream inputStream) {
        this.f77939a = i10;
        this.f77940b = list;
        this.f77941c = i11;
        this.f77942d = inputStream;
    }

    public final int a() {
        return this.f77941c;
    }

    public final int b() {
        return this.f77939a;
    }

    public final InputStream c() {
        InputStream inputStream = this.f77942d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final List d() {
        return Collections.unmodifiableList(this.f77940b);
    }
}
