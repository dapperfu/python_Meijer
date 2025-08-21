package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* loaded from: classes6.dex */
public final class O7 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f83649a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f83650b;

    /* renamed from: c, reason: collision with root package name */
    private final int f83651c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC11028t7 f83652d;

    /* renamed from: e, reason: collision with root package name */
    private final L7 f83653e;

    /* renamed from: f, reason: collision with root package name */
    private final int f83654f;

    /* renamed from: g, reason: collision with root package name */
    private final int f83655g;

    public final int a() {
        return this.f83651c;
    }

    public final L7 b() {
        return this.f83653e;
    }

    public final Object c() {
        return this.f83649a;
    }

    public final int e() {
        return this.f83654f;
    }

    public final int f() {
        return this.f83655g;
    }

    public final byte[] d() {
        byte[] bArr = this.f83650b;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    O7(Object obj, byte[] bArr, int i10, int i11, int i12, AbstractC11028t7 abstractC11028t7, L7 l72) {
        this.f83649a = obj;
        this.f83650b = Arrays.copyOf(bArr, bArr.length);
        this.f83654f = i10;
        this.f83655g = i11;
        this.f83651c = i12;
        this.f83652d = abstractC11028t7;
        this.f83653e = l72;
    }
}
