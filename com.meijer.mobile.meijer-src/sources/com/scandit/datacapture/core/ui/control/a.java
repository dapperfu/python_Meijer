package com.scandit.datacapture.core.ui.control;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CameraSwitchControl f127017a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CameraSwitchControl cameraSwitchControl) {
        super(0);
        this.f127017a = cameraSwitchControl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CameraSwitchControl.access$toggleCamera(this.f127017a);
        return Unit.f143329a;
    }
}
