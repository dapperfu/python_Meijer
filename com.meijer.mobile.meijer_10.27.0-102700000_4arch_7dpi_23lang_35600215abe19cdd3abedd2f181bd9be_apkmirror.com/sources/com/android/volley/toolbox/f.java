package com.android.volley.toolbox;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final int f62978a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.android.volley.e> f62979b;

    /* renamed from: c, reason: collision with root package name */
    private final int f62980c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f62981d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f62982e;

    public f(int i10, List<com.android.volley.e> list) {
        this(i10, list, -1, null);
    }

    public f(int i10, List<com.android.volley.e> list, int i11, InputStream inputStream) {
        this.f62978a = i10;
        this.f62979b = list;
        this.f62980c = i11;
        this.f62981d = inputStream;
        this.f62982e = null;
    }

    public final InputStream a() {
        InputStream inputStream = this.f62981d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f62982e != null) {
            return new ByteArrayInputStream(this.f62982e);
        }
        return null;
    }

    public final int b() {
        return this.f62980c;
    }

    public final List<com.android.volley.e> c() {
        return Collections.unmodifiableList(this.f62979b);
    }

    public final int d() {
        return this.f62978a;
    }
}
