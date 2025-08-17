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

/* loaded from: classes11.dex */
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
        hVar.f125052f.f125036b.set(false);
        hVar.f125052f.b();
        hVar.f125052f.f125036b.set(true);
        p22.addFrameListener(hVar.f125053g);
        e eVar = hVar.f125051e;
        if (eVar != null) {
            eVar.cancel();
            hVar.f125051e = null;
        }
        MainThreadHelper mainThreadHelper = j.f125056a;
        j.b("Checking " + p02.f125061d + " resolution");
        long j10 = (long) p02.f125060c;
        e eVar2 = new e(hVar, p02);
        hVar.f125050d.schedule(eVar2, j10);
        hVar.f125051e = eVar2;
        return Unit.f142422a;
    }
}
