package com.scandit.datacapture.core.internal.module.https;

import com.scandit.datacapture.core.internal.module.https.scandit.C13441j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class c extends NativeHttpsSessionFactory {
    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsSessionFactory
    public final NativeHttpsSession create(NativeHttpsSessionConfiguration config) {
        Intrinsics.j(config, "config");
        return new C13441j(config);
    }
}
