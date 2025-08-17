package com.scandit.datacapture.core.internal.module.https.scandit;

import com.scandit.datacapture.core.internal.module.https.NativeHttpsResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.UnknownServiceException;
import java.util.HashMap;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class H extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f124685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f124686b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(I i10, HashMap map) {
        super(0);
        this.f124685a = i10;
        this.f124686b = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException, C13316s {
        InputStream errorStream;
        I i10 = this.f124685a;
        i10.f124693g = b0.f124706b;
        i10.b();
        C13307i c13307i = (C13307i) this.f124685a.f124689c;
        c13307i.getClass();
        try {
            int responseCode = ((HttpsURLConnection) c13307i.f124734b.getValue()).getResponseCode();
            try {
                if (200 > responseCode || responseCode >= 300) {
                    I i11 = this.f124685a;
                    i11.f124693g = c0.f124712b;
                    i11.b();
                    C13307i c13307i2 = (C13307i) this.f124685a.f124689c;
                    c13307i2.getClass();
                    try {
                        errorStream = ((HttpsURLConnection) c13307i2.f124734b.getValue()).getErrorStream();
                        Intrinsics.g(errorStream);
                    } catch (UnknownServiceException e10) {
                        throw new A(e10);
                    } catch (IOException e11) {
                        throw new C13314p(e11);
                    }
                } else {
                    I i12 = this.f124685a;
                    i12.f124693g = d0.f124728b;
                    i12.b();
                    C13307i c13307i3 = (C13307i) this.f124685a.f124689c;
                    c13307i3.getClass();
                    try {
                        errorStream = ((HttpsURLConnection) c13307i3.f124734b.getValue()).getInputStream();
                        Intrinsics.g(errorStream);
                    } catch (UnknownServiceException e12) {
                        throw new A(e12);
                    } catch (IOException e13) {
                        throw new C13314p(e13);
                    }
                }
                try {
                    byte[] bArrC = ByteStreamsKt.c(errorStream);
                    CloseableKt.a(errorStream, null);
                    NativeHttpsResponse nativeHttpsResponse = new NativeHttpsResponse(responseCode, this.f124686b, bArrC);
                    I i13 = this.f124685a;
                    i13.f124693g = new i0(nativeHttpsResponse);
                    i13.b();
                } finally {
                }
            } catch (Throwable th2) {
                this.f124685a.a(th2);
            }
            return Unit.f142422a;
        } catch (IOException e14) {
            throw new C13316s(e14);
        }
    }
}
