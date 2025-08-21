package com.scandit.datacapture.core.internal.module.source;

import android.graphics.SurfaceTexture;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.source.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13491g extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13498n f126033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f126034b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13491g(C13498n c13498n, Function1 function1) {
        super(1);
        this.f126033a = c13498n;
        this.f126034b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SurfaceTexture it = (SurfaceTexture) obj;
        Intrinsics.j(it, "it");
        C13498n c13498n = this.f126033a;
        Function1 function1 = this.f126034b;
        c13498n.getClass();
        Pair pair = new Pair(it, function1);
        HandlerC13457a handlerC13457a = c13498n.f126053e;
        if (handlerC13457a != null) {
            handlerC13457a.sendMessage(handlerC13457a.obtainMessage(1, pair));
        }
        return Unit.f143329a;
    }
}
