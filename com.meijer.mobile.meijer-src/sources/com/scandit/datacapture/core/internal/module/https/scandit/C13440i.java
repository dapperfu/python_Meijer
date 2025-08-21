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
/* loaded from: classes12.dex */
public final class C13440i implements S {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC13432a f125685a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f125686b;

    public C13440i(C13434c connectionFactory) {
        Intrinsics.j(connectionFactory, "connectionFactory");
        this.f125685a = connectionFactory;
        this.f125686b = LazyKt.b(new C13439h(this));
    }

    public final void a() throws IOException, C13445n {
        try {
            ((HttpsURLConnection) this.f125686b.getValue()).connect();
        } catch (IOException e10) {
            throw new C13445n(e10);
        }
    }

    public final Map b() throws r {
        try {
            Map<String, List<String>> headerFields = ((HttpsURLConnection) this.f125686b.getValue()).getHeaderFields();
            Intrinsics.g(headerFields);
            return headerFields;
        } catch (IOException e10) {
            throw new r(e10);
        }
    }

    public final OutputStream c() throws C13448q, B {
        try {
            if (((HttpsURLConnection) this.f125686b.getValue()).getDoOutput()) {
                return ((HttpsURLConnection) this.f125686b.getValue()).getOutputStream();
            }
            return null;
        } catch (UnknownServiceException e10) {
            throw new B(e10);
        } catch (IOException e11) {
            throw new C13448q(e11);
        }
    }
}
