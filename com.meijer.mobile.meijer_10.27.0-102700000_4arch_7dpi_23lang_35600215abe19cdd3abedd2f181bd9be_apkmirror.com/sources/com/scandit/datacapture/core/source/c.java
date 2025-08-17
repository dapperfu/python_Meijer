package com.scandit.datacapture.core.source;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Camera f125911a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraSettings f125912b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f125913c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Camera camera, CameraSettings cameraSettings, Runnable runnable) {
        super(0);
        this.f125911a = camera;
        this.f125912b = cameraSettings;
        this.f125913c = runnable;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f125911a.getBehaviorDelegate().a(this.f125912b, this.f125913c);
        return Unit.f142422a;
    }
}
