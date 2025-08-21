package com.scandit.datacapture.core.internal.module.ui;

import com.scandit.datacapture.core.internal.sdk.ui.NeedsRedrawListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureTextureView f126183a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(DataCaptureTextureView dataCaptureTextureView) {
        super(1);
        this.f126183a = dataCaptureTextureView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NeedsRedrawListener listener = (NeedsRedrawListener) obj;
        Intrinsics.j(listener, "listener");
        this.f126183a.f126082a._setNeedsRedrawListener(listener);
        return Unit.f143329a;
    }
}
