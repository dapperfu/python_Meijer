package com.scandit.datacapture.core.internal.module.https.scandit;

import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.https.scandit.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13305g implements InterfaceC13304f {
    public final void a(URL originalUrl, URL connectionUrl) throws C13322y {
        Intrinsics.j(originalUrl, "originalUrl");
        Intrinsics.j(connectionUrl, "connectionUrl");
        String host = originalUrl.getHost();
        String host2 = connectionUrl.getHost();
        if (Intrinsics.e(originalUrl.getHost(), connectionUrl.getHost())) {
            return;
        }
        Intrinsics.g(host);
        Intrinsics.g(host2);
        throw new C13322y(host, host2);
    }
}
