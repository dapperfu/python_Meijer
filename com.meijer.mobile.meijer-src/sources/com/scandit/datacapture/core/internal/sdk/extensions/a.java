package com.scandit.datacapture.core.internal.sdk.extensions;

import com.scandit.datacapture.core.internal.sdk.data.NativeCameraCaptureParameters;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f126422a = new a();

    public a() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Intrinsics.j((NativeCameraCaptureParameters) obj, "$this$null");
        return Unit.f143329a;
    }
}
