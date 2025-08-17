package com.scandit.datacapture.core.internal.module.source.api2;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import com.scandit.datacapture.core.internal.module.source.api2.x0;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class x0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f125003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f125004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Subscription f125005c;

    public final void a(final SurfaceTexture surfaceTexture) {
        Intrinsics.j(surfaceTexture, "surfaceTexture");
        Handler handler = this.f125003a;
        final v0 v0Var = this.f125004b;
        final Subscription subscription = this.f125005c;
        handler.post(new Runnable() { // from class: du.j
            @Override // java.lang.Runnable
            public final void run() throws CameraAccessException {
                x0.a(v0Var, subscription, surfaceTexture);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Handler handler, C13334g c13334g, Subscription subscription) {
        super(1);
        this.f125003a = handler;
        this.f125004b = c13334g;
        this.f125005c = subscription;
    }

    public static final void a(v0 callback, Subscription renderSubscription, SurfaceTexture surfaceTexture) throws CameraAccessException {
        Intrinsics.j(callback, "$callback");
        Intrinsics.j(renderSubscription, "$renderSubscription");
        Intrinsics.j(surfaceTexture, "$surfaceTexture");
        u0 holder = new u0(renderSubscription, surfaceTexture);
        C13334g c13334g = (C13334g) callback;
        c13334g.getClass();
        Intrinsics.j(holder, "holder");
        C13343p c13343p = c13334g.f124900a;
        c13343p.f124961j = holder;
        i0 i0Var = c13334g.f124901b;
        Function1 function1 = c13334g.f124902c;
        CameraDevice cameraDevice = c13343p.f124962k;
        Handler handlerA = c13343p.a();
        if (cameraDevice == null || handlerA == null) {
            return;
        }
        InterfaceC13328b0 interfaceC13328b0 = c13343p.f124963l;
        if (interfaceC13328b0 != null) {
            ((d0) interfaceC13328b0).b();
        }
        ((D) c13343p.f124957f).a(handlerA, cameraDevice, c13343p.f124952a, holder, i0Var, new C13340m(function1, c13343p, holder));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((SurfaceTexture) obj);
        return Unit.f142422a;
    }
}
