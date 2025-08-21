package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.common.async.MainThreadHelper;
import com.scandit.datacapture.core.source.FrameSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* loaded from: classes12.dex */
public final /* synthetic */ class f extends FunctionReference implements Function3 {
    public f(Object obj) {
        super(3, obj);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.b(h.class);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "start";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "start(Lcom/scandit/datacapture/core/internal/module/source/dynamicresolution/DynamicResolutionSettings;Lcom/scandit/datacapture/core/source/FrameSource;Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V";
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        k p02 = (k) obj;
        FrameSource p12 = (FrameSource) obj2;
        DataCaptureContext p22 = (DataCaptureContext) obj3;
        Intrinsics.j(p02, "p0");
        Intrinsics.j(p12, "p1");
        Intrinsics.j(p22, "p2");
        h hVar = (h) this.receiver;
        hVar.f126004f.f125988b.set(false);
        hVar.f126004f.b();
        hVar.f126004f.f125988b.set(true);
        p22.addFrameListener(hVar.f126005g);
        e eVar = hVar.f126003e;
        if (eVar != null) {
            eVar.cancel();
            hVar.f126003e = null;
        }
        MainThreadHelper mainThreadHelper = j.f126008a;
        j.b("Checking " + p02.f126013d + " resolution");
        long j10 = (long) p02.f126012c;
        e eVar2 = new e(hVar, p02);
        hVar.f126002d.schedule(eVar2, j10);
        hVar.f126003e = eVar2;
        return Unit.f143329a;
    }
}
