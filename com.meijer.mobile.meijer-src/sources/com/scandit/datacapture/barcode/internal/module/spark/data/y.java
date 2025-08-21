package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.source.Camera;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class y extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f123876a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(O o10) {
        super(0);
        this.f123876a = o10;
    }

    public static final void b() {
        O.f123805l.release();
    }

    public final void a() {
        Camera camera = x.f123875a[this.f123876a.f123807b.a().ordinal()] == 1 ? this.f123876a.f123812g : this.f123876a.f123811f;
        O o10 = this.f123876a;
        Runnable runnable = new Runnable() { // from class: com.scandit.datacapture.barcode.internal.module.spark.data.U
            @Override // java.lang.Runnable
            public final void run() {
                y.b();
            }
        };
        o10.onFrameSourceChanged(o10.f123806a, camera);
        o10.f123806a.setFrameSource(camera, runnable);
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return Unit.f143329a;
    }
}
