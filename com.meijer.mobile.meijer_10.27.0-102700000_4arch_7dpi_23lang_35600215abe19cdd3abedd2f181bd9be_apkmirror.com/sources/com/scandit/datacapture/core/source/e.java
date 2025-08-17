package com.scandit.datacapture.core.source;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SequenceFrameSourceProcessListener f125915a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SequenceFrameSourceProcessListener sequenceFrameSourceProcessListener) {
        super(1);
        this.f125915a = sequenceFrameSourceProcessListener;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte[] buffer = (byte[]) obj;
        Intrinsics.j(buffer, "buffer");
        this.f125915a.processingFinished(buffer);
        return Unit.f142422a;
    }
}
