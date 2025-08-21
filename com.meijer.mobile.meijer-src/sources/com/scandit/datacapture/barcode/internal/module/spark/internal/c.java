package com.scandit.datacapture.barcode.internal.module.spark.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f123887a = new ArrayList();

    @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.d
    public final void a() {
        Iterator it = this.f123887a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a();
        }
        this.f123887a.clear();
    }
}
