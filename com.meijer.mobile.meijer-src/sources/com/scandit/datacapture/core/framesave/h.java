package com.scandit.datacapture.core.framesave;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameSaveSession f125142a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(FrameSaveSession frameSaveSession) {
        super(0);
        this.f125142a = frameSaveSession;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f125142a;
    }
}
