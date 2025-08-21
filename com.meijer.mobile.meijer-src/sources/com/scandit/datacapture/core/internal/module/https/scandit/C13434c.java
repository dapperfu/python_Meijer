package com.scandit.datacapture.core.internal.module.https.scandit;

import com.scandit.datacapture.core.internal.module.https.NativeHttpsMethod;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.https.scandit.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13434c implements InterfaceC13432a {

    /* renamed from: a, reason: collision with root package name */
    public final String f125659a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeHttpsMethod f125660b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f125661c;

    /* renamed from: d, reason: collision with root package name */
    public final N f125662d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC13437f f125663e;

    public C13434c(String url, NativeHttpsMethod method, HashMap headers, O sslSocketHandler) {
        C13438g hostValidator = new C13438g();
        Intrinsics.j(url, "url");
        Intrinsics.j(method, "method");
        Intrinsics.j(headers, "headers");
        Intrinsics.j(sslSocketHandler, "sslSocketHandler");
        Intrinsics.j(hostValidator, "hostValidator");
        this.f125659a = url;
        this.f125660b = method;
        this.f125661c = headers;
        this.f125662d = sslSocketHandler;
        this.f125663e = hostValidator;
    }
}
