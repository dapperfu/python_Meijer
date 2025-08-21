package com.android.volley.toolbox;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final int f63817a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.android.volley.e> f63818b;

    /* renamed from: c, reason: collision with root package name */
    private final int f63819c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f63820d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f63821e;

    public f(int i10, List<com.android.volley.e> list) {
        this(i10, list, -1, null);
    }

    public f(int i10, List<com.android.volley.e> list, int i11, InputStream inputStream) {
        this.f63817a = i10;
        this.f63818b = list;
        this.f63819c = i11;
        this.f63820d = inputStream;
        this.f63821e = null;
    }

    public final InputStream a() {
        InputStream inputStream = this.f63820d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f63821e != null) {
            return new ByteArrayInputStream(this.f63821e);
        }
        return null;
    }

    public final int b() {
        return this.f63819c;
    }

    public final List<com.android.volley.e> c() {
        return Collections.unmodifiableList(this.f63818b);
    }

    public final int d() {
        return this.f63817a;
    }
}
