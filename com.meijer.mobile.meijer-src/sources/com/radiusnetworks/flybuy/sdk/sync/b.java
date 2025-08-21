package com.radiusnetworks.flybuy.sdk.sync;

import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.SafeContinuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SafeContinuation f121028f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SafeContinuation safeContinuation) {
        super(1);
        this.f121028f = safeContinuation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f121028f.resumeWith(Result.b((SdkError) obj));
        return Unit.f143329a;
    }
}
