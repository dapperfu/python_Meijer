package com.scandit.datacapture.barcode.internal.module.spark.internal;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.TypeIntrinsics;

/* loaded from: classes11.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    public e f122938a;

    @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.d
    public final void a() {
        w wVar;
        e eVar = this.f122938a;
        x xVar = eVar != null ? eVar.f122937b : null;
        if (eVar != null && (wVar = eVar.f122936a) != null) {
            b bVar = (b) wVar;
            if (CollectionsKt.h0(bVar.f122934b, xVar)) {
                TypeIntrinsics.a(bVar.f122934b).remove(xVar);
            }
        }
        this.f122938a = null;
    }

    public f(e eVar) {
        this.f122938a = eVar;
    }
}
