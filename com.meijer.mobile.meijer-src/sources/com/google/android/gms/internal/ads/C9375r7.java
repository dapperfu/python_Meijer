package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.r7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9375r7 {

    /* renamed from: a, reason: collision with root package name */
    private final int f78779a;

    /* renamed from: b, reason: collision with root package name */
    private final List f78780b;

    /* renamed from: c, reason: collision with root package name */
    private final int f78781c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f78782d;

    public C9375r7(int i10, List list, int i11, InputStream inputStream) {
        this.f78779a = i10;
        this.f78780b = list;
        this.f78781c = i11;
        this.f78782d = inputStream;
    }

    public final int a() {
        return this.f78781c;
    }

    public final int b() {
        return this.f78779a;
    }

    public final InputStream c() {
        InputStream inputStream = this.f78782d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final List d() {
        return Collections.unmodifiableList(this.f78780b);
    }
}
