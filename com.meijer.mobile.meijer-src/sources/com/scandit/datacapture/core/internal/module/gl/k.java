package com.scandit.datacapture.core.internal.module.gl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f125589a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125590b;

    /* renamed from: c, reason: collision with root package name */
    public final int f125591c;

    /* renamed from: d, reason: collision with root package name */
    public final int f125592d;

    public k(Function1 surfaceCallback, int i10, int i11, int i12) {
        Intrinsics.j(surfaceCallback, "surfaceCallback");
        this.f125589a = surfaceCallback;
        this.f125590b = i10;
        this.f125591c = i11;
        this.f125592d = i12;
    }
}
