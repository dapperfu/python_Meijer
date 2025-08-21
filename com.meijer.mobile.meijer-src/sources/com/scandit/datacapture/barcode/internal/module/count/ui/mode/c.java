package com.scandit.datacapture.barcode.internal.module.count.ui.mode;

import com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.g;
import com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f122701a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f122702b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, b bVar) {
        super(0);
        this.f122701a = dVar;
        this.f122702b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        j jVar = (j) this.f122701a.f122704b;
        jVar.f122683c.a(jVar.f122682b, g.f122678a);
        this.f122701a.a(new b(this.f122702b.f122699a, com.scandit.datacapture.barcode.internal.module.count.ui.mappingflow.a.f122657b));
        return Unit.f143329a;
    }
}
