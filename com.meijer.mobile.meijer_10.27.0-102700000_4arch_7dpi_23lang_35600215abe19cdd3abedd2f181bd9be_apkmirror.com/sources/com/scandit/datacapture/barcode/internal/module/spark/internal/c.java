package com.scandit.datacapture.barcode.internal.module.spark.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f122935a = new ArrayList();

    @Override // com.scandit.datacapture.barcode.internal.module.spark.internal.d
    public final void a() {
        Iterator it = this.f122935a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a();
        }
        this.f122935a.clear();
    }
}
