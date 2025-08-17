package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class O7 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f82809a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f82810b;

    /* renamed from: c, reason: collision with root package name */
    private final int f82811c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC10903t7 f82812d;

    /* renamed from: e, reason: collision with root package name */
    private final L7 f82813e;

    /* renamed from: f, reason: collision with root package name */
    private final int f82814f;

    /* renamed from: g, reason: collision with root package name */
    private final int f82815g;

    public final int a() {
        return this.f82811c;
    }

    public final L7 b() {
        return this.f82813e;
    }

    public final Object c() {
        return this.f82809a;
    }

    public final int e() {
        return this.f82814f;
    }

    public final int f() {
        return this.f82815g;
    }

    public final byte[] d() {
        byte[] bArr = this.f82810b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    O7(Object obj, byte[] bArr, int i10, int i11, int i12, AbstractC10903t7 abstractC10903t7, L7 l72) {
        this.f82809a = obj;
        this.f82810b = Arrays.copyOf(bArr, bArr.length);
        this.f82814f = i10;
        this.f82815g = i11;
        this.f82811c = i12;
        this.f82812d = abstractC10903t7;
        this.f82813e = l72;
    }
}
