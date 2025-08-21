package com.scandit.datacapture.core.internal.module.source.api2;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13470j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f125866a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13476p f125867b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NativeWrappedPromise f125868c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13470j(boolean z10, C13476p c13476p, NativeWrappedPromise nativeWrappedPromise) {
        super(0);
        this.f125866a = z10;
        this.f125867b = c13476p;
        this.f125868c = nativeWrappedPromise;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f125866a) {
            C13476p c13476p = this.f125867b;
            C13469i c13469i = new C13469i(this.f125868c);
            KProperty[] kPropertyArr = C13476p.f125903v;
            c13476p.a(c13469i);
        } else {
            this.f125868c.setError();
        }
        return Unit.f143329a;
    }
}
