package com.scandit.datacapture.core.source;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Camera f126863a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraSettings f126864b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f126865c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Camera camera, CameraSettings cameraSettings, Runnable runnable) {
        super(0);
        this.f126863a = camera;
        this.f126864b = cameraSettings;
        this.f126865c = runnable;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f126863a.getBehaviorDelegate().a(this.f126864b, this.f126865c);
        return Unit.f143329a;
    }
}
