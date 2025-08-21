package com.scandit.datacapture.core.internal.module.https.scandit;

import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.https.scandit.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13438g implements InterfaceC13437f {
    public final void a(URL originalUrl, URL connectionUrl) throws C13455y {
        Intrinsics.j(originalUrl, "originalUrl");
        Intrinsics.j(connectionUrl, "connectionUrl");
        String host = originalUrl.getHost();
        String host2 = connectionUrl.getHost();
        if (Intrinsics.e(originalUrl.getHost(), connectionUrl.getHost())) {
            return;
        }
        Intrinsics.g(host);
        Intrinsics.g(host2);
        throw new C13455y(host, host2);
    }
}
