package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.source.Camera;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class y extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f122924a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(O o10) {
        super(0);
        this.f122924a = o10;
    }

    public static final void b() {
        O.f122853l.release();
    }

    public final void a() {
        Camera camera = x.f122923a[this.f122924a.f122855b.a().ordinal()] == 1 ? this.f122924a.f122860g : this.f122924a.f122859f;
        O o10 = this.f122924a;
        Runnable runnable = new Runnable() { // from class: com.scandit.datacapture.barcode.internal.module.spark.data.U
            @Override // java.lang.Runnable
            public final void run() {
                y.b();
            }
        };
        o10.onFrameSourceChanged(o10.f122854a, camera);
        o10.f122854a.setFrameSource(camera, runnable);
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return Unit.f142422a;
    }
}
