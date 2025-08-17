package com.scandit.datacapture.core.internal.module.https.scandit;

import java.io.IOException;
import java.io.OutputStream;
import java.net.UnknownServiceException;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.https.scandit.i, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13307i implements S {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC13299a f124733a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f124734b;

    public C13307i(C13301c connectionFactory) {
        Intrinsics.j(connectionFactory, "connectionFactory");
        this.f124733a = connectionFactory;
        this.f124734b = LazyKt.b(new C13306h(this));
    }

    public final void a() throws IOException, C13312n {
        try {
            ((HttpsURLConnection) this.f124734b.getValue()).connect();
        } catch (IOException e10) {
            throw new C13312n(e10);
        }
    }

    public final Map b() throws r {
        try {
            Map<String, List<String>> headerFields = ((HttpsURLConnection) this.f124734b.getValue()).getHeaderFields();
            Intrinsics.g(headerFields);
            return headerFields;
        } catch (IOException e10) {
            throw new r(e10);
        }
    }

    public final OutputStream c() throws C13315q, B {
        try {
            if (((HttpsURLConnection) this.f124734b.getValue()).getDoOutput()) {
                return ((HttpsURLConnection) this.f124734b.getValue()).getOutputStream();
            }
            return null;
        } catch (UnknownServiceException e10) {
            throw new B(e10);
        } catch (IOException e11) {
            throw new C13315q(e11);
        }
    }
}
