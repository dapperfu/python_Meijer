package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13355d extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f125032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13365n f125033b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NativeWrappedPromise f125034c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13355d(boolean z10, C13365n c13365n, NativeWrappedPromise nativeWrappedPromise) {
        super(0);
        this.f125032a = z10;
        this.f125033b = c13365n;
        this.f125034c = nativeWrappedPromise;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f125032a) {
            C13365n c13365n = this.f125033b;
            C13354c c13354c = new C13354c(this.f125034c);
            HandlerC13324a handlerC13324a = c13365n.f125101e;
            if (handlerC13324a != null) {
                handlerC13324a.sendMessage(handlerC13324a.obtainMessage(3, c13354c));
            }
        } else {
            this.f125034c.setError();
        }
        return Unit.f142422a;
    }
}
