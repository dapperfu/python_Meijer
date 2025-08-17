package com.scandit.datacapture.core.internal.module.source;

import android.graphics.SurfaceTexture;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13358g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13365n f125081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f125082b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13358g(C13365n c13365n, Function1 function1) {
        super(1);
        this.f125081a = c13365n;
        this.f125082b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SurfaceTexture it = (SurfaceTexture) obj;
        Intrinsics.j(it, "it");
        C13365n c13365n = this.f125081a;
        Function1 function1 = this.f125082b;
        c13365n.getClass();
        Pair pair = new Pair(it, function1);
        HandlerC13324a handlerC13324a = c13365n.f125101e;
        if (handlerC13324a != null) {
            handlerC13324a.sendMessage(handlerC13324a.obtainMessage(1, pair));
        }
        return Unit.f142422a;
    }
}
