package com.scandit.datacapture.core.internal.sdk.common.async;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f126358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeWrappedPromise f126359b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z10, NativeWrappedPromise nativeWrappedPromise) {
        super(0);
        this.f126358a = z10;
        this.f126359b = nativeWrappedPromise;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f126358a) {
            this.f126359b.setDone();
        } else {
            this.f126359b.setError();
        }
        return Unit.f143329a;
    }
}
