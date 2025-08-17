package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.source.Camera;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class N extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f122852a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(O o10) {
        super(0);
        this.f122852a = o10;
    }

    public static final void b() {
        O.f122853l.release();
    }

    public final void a() {
        Unit unit;
        O o10 = this.f122852a;
        Camera camera = o10.f122858e;
        if (camera != null) {
            camera.applySettings(o10.a(o10.f122855b.p(), this.f122852a.c()), new Runnable() { // from class: com.scandit.datacapture.barcode.internal.module.spark.data.S
                @Override // java.lang.Runnable
                public final void run() {
                    N.b();
                }
            });
            unit = Unit.f142422a;
        } else {
            unit = null;
        }
        if (unit == null) {
            O.f122853l.release();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return Unit.f142422a;
    }
}
