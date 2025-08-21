package com.scandit.datacapture.barcode.internal.module.spark.internal;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes12.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public e f123890a;

    @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.d
    public final void a() {
        w wVar;
        e eVar = this.f123890a;
        x xVar = eVar != null ? eVar.f123889b : null;
        if (eVar != null && (wVar = eVar.f123888a) != null) {
            b bVar = (b) wVar;
            if (CollectionsKt.h0(bVar.f123886b, xVar)) {
                TypeIntrinsics.a(bVar.f123886b).remove(xVar);
            }
        }
        this.f123890a = null;
    }

    public f(e eVar) {
        this.f123890a = eVar;
    }
}
