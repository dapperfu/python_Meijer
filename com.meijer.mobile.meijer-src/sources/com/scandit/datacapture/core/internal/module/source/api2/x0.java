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

/* loaded from: classes12.dex */
public final class x0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f125955a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f125956b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Subscription f125957c;

    public final void a(final SurfaceTexture surfaceTexture) {
        Intrinsics.j(surfaceTexture, "surfaceTexture");
        Handler handler = this.f125955a;
        final v0 v0Var = this.f125956b;
        final Subscription subscription = this.f125957c;
        handler.post(new Runnable() { // from class: du.j
            @Override // java.lang.Runnable
            public final void run() throws CameraAccessException {
                x0.a(v0Var, subscription, surfaceTexture);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Handler handler, C13467g c13467g, Subscription subscription) {
        super(1);
        this.f125955a = handler;
        this.f125956b = c13467g;
        this.f125957c = subscription;
    }

    public static final void a(v0 callback, Subscription renderSubscription, SurfaceTexture surfaceTexture) throws CameraAccessException {
        Intrinsics.j(callback, "$callback");
        Intrinsics.j(renderSubscription, "$renderSubscription");
        Intrinsics.j(surfaceTexture, "$surfaceTexture");
        u0 holder = new u0(renderSubscription, surfaceTexture);
        C13467g c13467g = (C13467g) callback;
        c13467g.getClass();
        Intrinsics.j(holder, "holder");
        C13476p c13476p = c13467g.f125852a;
        c13476p.f125913j = holder;
        i0 i0Var = c13467g.f125853b;
        Function1 function1 = c13467g.f125854c;
        CameraDevice cameraDevice = c13476p.f125914k;
        Handler handlerA = c13476p.a();
        if (cameraDevice == null || handlerA == null) {
            return;
        }
        InterfaceC13461b0 interfaceC13461b0 = c13476p.f125915l;
        if (interfaceC13461b0 != null) {
            ((d0) interfaceC13461b0).b();
        }
        ((D) c13476p.f125909f).a(handlerA, cameraDevice, c13476p.f125904a, holder, i0Var, new C13473m(function1, c13476p, holder));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((SurfaceTexture) obj);
        return Unit.f143329a;
    }
}
