package com.scandit.datacapture.core.internal.module.https.scandit;

import com.scandit.datacapture.core.internal.module.https.NativeHttpsMethod;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.https.scandit.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13301c implements InterfaceC13299a {

    /* renamed from: a, reason: collision with root package name */
    public final String f124707a;

    /* renamed from: b, reason: collision with root package name */
    public final NativeHttpsMethod f124708b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f124709c;

    /* renamed from: d, reason: collision with root package name */
    public final N f124710d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC13304f f124711e;

    public C13301c(String url, NativeHttpsMethod method, HashMap headers, O sslSocketHandler) {
        C13305g hostValidator = new C13305g();
        Intrinsics.j(url, "url");
        Intrinsics.j(method, "method");
        Intrinsics.j(headers, "headers");
        Intrinsics.j(sslSocketHandler, "sslSocketHandler");
        Intrinsics.j(hostValidator, "hostValidator");
        this.f124707a = url;
        this.f124708b = method;
        this.f124709c = headers;
        this.f124710d = sslSocketHandler;
        this.f124711e = hostValidator;
    }
}
