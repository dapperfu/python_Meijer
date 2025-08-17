package com.scandit.datacapture.core.internal.module.gl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f124637a;

    /* renamed from: b, reason: collision with root package name */
    public final int f124638b;

    /* renamed from: c, reason: collision with root package name */
    public final int f124639c;

    /* renamed from: d, reason: collision with root package name */
    public final int f124640d;

    public k(Function1 surfaceCallback, int i10, int i11, int i12) {
        Intrinsics.j(surfaceCallback, "surfaceCallback");
        this.f124637a = surfaceCallback;
        this.f124638b = i10;
        this.f124639c = i11;
        this.f124640d = i12;
    }
}
