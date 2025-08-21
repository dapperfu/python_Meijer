package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13488d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f125984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13498n f125985b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NativeWrappedPromise f125986c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13488d(boolean z10, C13498n c13498n, NativeWrappedPromise nativeWrappedPromise) {
        super(0);
        this.f125984a = z10;
        this.f125985b = c13498n;
        this.f125986c = nativeWrappedPromise;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f125984a) {
            C13498n c13498n = this.f125985b;
            C13487c c13487c = new C13487c(this.f125986c);
            HandlerC13457a handlerC13457a = c13498n.f126053e;
            if (handlerC13457a != null) {
                handlerC13457a.sendMessage(handlerC13457a.obtainMessage(3, c13487c));
            }
        } else {
            this.f125986c.setError();
        }
        return Unit.f143329a;
    }
}
