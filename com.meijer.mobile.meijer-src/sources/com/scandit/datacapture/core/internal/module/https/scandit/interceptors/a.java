package com.scandit.datacapture.core.internal.module.https.scandit.interceptors;

import com.scandit.datacapture.core.internal.module.https.b;
import com.scandit.datacapture.core.internal.module.https.d;
import com.scandit.datacapture.core.internal.module.https.scandit.client.l;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final b f125688a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f125689b;

    public a(boolean z10) {
        d connectivity = new d();
        Intrinsics.j(connectivity, "connectivity");
        this.f125688a = connectivity;
        this.f125689b = z10;
    }

    public final String toString() {
        return "NetworkTypeInterceptor{connectivity=" + this.f125688a + ", allowCellularAccess=" + this.f125689b + '}';
    }
}
