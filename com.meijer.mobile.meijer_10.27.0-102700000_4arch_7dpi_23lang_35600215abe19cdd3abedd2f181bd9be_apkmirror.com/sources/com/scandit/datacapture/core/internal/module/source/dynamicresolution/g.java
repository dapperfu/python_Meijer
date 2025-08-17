package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

/* loaded from: classes11.dex */
public final /* synthetic */ class g extends FunctionReference implements Function3 {
    public g(Object obj) {
        super(3, obj);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        return Reflection.b(h.class);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "stop";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "stop(Lcom/scandit/datacapture/core/internal/module/source/dynamicresolution/DynamicResolutionSettings;Lcom/scandit/datacapture/core/source/FrameSource;Lcom/scandit/datacapture/core/capture/DataCaptureContext;)V";
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DataCaptureContext dataCaptureContext = (DataCaptureContext) obj3;
        h hVar = (h) this.receiver;
        e eVar = hVar.f125051e;
        if (eVar != null) {
            eVar.cancel();
            hVar.f125051e = null;
        }
        if (dataCaptureContext != null) {
            dataCaptureContext.removeFrameListener(hVar.f125053g);
        }
        hVar.f125052f.f125036b.set(false);
        hVar.f125052f.b();
        return Unit.f142422a;
    }
}
