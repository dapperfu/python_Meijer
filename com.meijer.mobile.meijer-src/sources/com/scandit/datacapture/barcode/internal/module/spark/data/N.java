package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.source.Camera;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class N extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f123804a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(O o10) {
        super(0);
        this.f123804a = o10;
    }

    public static final void b() {
        O.f123805l.release();
    }

    public final void a() {
        Unit unit;
        O o10 = this.f123804a;
        Camera camera = o10.f123810e;
        if (camera != null) {
            camera.applySettings(o10.a(o10.f123807b.p(), this.f123804a.c()), new Runnable() { // from class: com.scandit.datacapture.barcode.internal.module.spark.data.S
                @Override // java.lang.Runnable
                public final void run() {
                    N.b();
                }
            });
            unit = Unit.f143329a;
        } else {
            unit = null;
        }
        if (unit == null) {
            O.f123805l.release();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return Unit.f143329a;
    }
}
