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

/* loaded from: classes12.dex */
public final class H extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I f125637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f125638b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(I i10, HashMap map) {
        super(0);
        this.f125637a = i10;
        this.f125638b = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IOException, C13449s {
        InputStream errorStream;
        I i10 = this.f125637a;
        i10.f125645g = b0.f125658b;
        i10.b();
        C13440i c13440i = (C13440i) this.f125637a.f125641c;
        c13440i.getClass();
        try {
            int responseCode = ((HttpsURLConnection) c13440i.f125686b.getValue()).getResponseCode();
            try {
                if (200 > responseCode || responseCode >= 300) {
                    I i11 = this.f125637a;
                    i11.f125645g = c0.f125664b;
                    i11.b();
                    C13440i c13440i2 = (C13440i) this.f125637a.f125641c;
                    c13440i2.getClass();
                    try {
                        errorStream = ((HttpsURLConnection) c13440i2.f125686b.getValue()).getErrorStream();
                        Intrinsics.g(errorStream);
                    } catch (UnknownServiceException e10) {
                        throw new A(e10);
                    } catch (IOException e11) {
                        throw new C13447p(e11);
                    }
                } else {
                    I i12 = this.f125637a;
                    i12.f125645g = d0.f125680b;
                    i12.b();
                    C13440i c13440i3 = (C13440i) this.f125637a.f125641c;
                    c13440i3.getClass();
                    try {
                        errorStream = ((HttpsURLConnection) c13440i3.f125686b.getValue()).getInputStream();
                        Intrinsics.g(errorStream);
                    } catch (UnknownServiceException e12) {
                        throw new A(e12);
                    } catch (IOException e13) {
                        throw new C13447p(e13);
                    }
                }
                try {
                    byte[] bArrC = ByteStreamsKt.c(errorStream);
                    CloseableKt.a(errorStream, null);
                    NativeHttpsResponse nativeHttpsResponse = new NativeHttpsResponse(responseCode, this.f125638b, bArrC);
                    I i13 = this.f125637a;
                    i13.f125645g = new i0(nativeHttpsResponse);
                    i13.b();
                } finally {
                }
            } catch (Throwable th2) {
                this.f125637a.a(th2);
            }
            return Unit.f143329a;
        } catch (IOException e14) {
            throw new C13449s(e14);
        }
    }
}
