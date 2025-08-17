package com.scandit.datacapture.core.internal.sdk.common.async;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f125406a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NativeWrappedPromise f125407b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(boolean z10, NativeWrappedPromise nativeWrappedPromise) {
        super(0);
        this.f125406a = z10;
        this.f125407b = nativeWrappedPromise;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f125406a) {
            this.f125407b.setDone();
        } else {
            this.f125407b.setError();
        }
        return Unit.f142422a;
    }
}
