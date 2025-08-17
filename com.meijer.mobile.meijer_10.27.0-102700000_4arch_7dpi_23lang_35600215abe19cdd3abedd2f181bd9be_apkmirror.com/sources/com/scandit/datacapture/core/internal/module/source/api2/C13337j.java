package com.scandit.datacapture.core.internal.module.source.api2;

import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedPromise;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13337j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f124914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C13343p f124915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NativeWrappedPromise f124916c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13337j(boolean z10, C13343p c13343p, NativeWrappedPromise nativeWrappedPromise) {
        super(0);
        this.f124914a = z10;
        this.f124915b = c13343p;
        this.f124916c = nativeWrappedPromise;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f124914a) {
            C13343p c13343p = this.f124915b;
            C13336i c13336i = new C13336i(this.f124916c);
            KProperty[] kPropertyArr = C13343p.f124951v;
            c13343p.a(c13336i);
        } else {
            this.f124916c.setError();
        }
        return Unit.f142422a;
    }
}
