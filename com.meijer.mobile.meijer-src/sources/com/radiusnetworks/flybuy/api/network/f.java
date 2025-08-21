package com.radiusnetworks.flybuy.api.network;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import retrofit2.Call;

/* loaded from: classes12.dex */
public final class f extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Lambda f120897f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(Function0 function0) {
        super(0);
        this.f120897f = (Lambda) function0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (Call) this.f120897f.invoke();
    }
}
