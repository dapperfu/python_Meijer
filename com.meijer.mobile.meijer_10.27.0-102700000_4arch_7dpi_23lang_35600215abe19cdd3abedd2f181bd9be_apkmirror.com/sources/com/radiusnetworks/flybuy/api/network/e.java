package com.radiusnetworks.flybuy.api.network;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import retrofit2.Call;

/* loaded from: classes11.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f119924f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Function0 function0) {
        super(0);
        this.f119924f = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (Call) this.f119924f.invoke();
    }
}
