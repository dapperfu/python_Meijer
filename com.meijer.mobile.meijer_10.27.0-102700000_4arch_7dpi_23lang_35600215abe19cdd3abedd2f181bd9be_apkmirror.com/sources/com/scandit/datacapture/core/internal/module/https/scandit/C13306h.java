package com.scandit.datacapture.core.internal.module.https.scandit;

import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.maps.internal.HttpHeaders;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.https.scandit.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13306h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13307i f124732a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13306h(C13307i c13307i) {
        super(0);
        this.f124732a = c13307i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws C13321x, ProtocolException, C13323z, C13320w, C13313o {
        C13301c c13301c = (C13301c) this.f124732a.f124733a;
        c13301c.getClass();
        try {
            URL url = new URL(c13301c.f124707a);
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(url.openConnection()));
            Intrinsics.h(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
            ((O) c13301c.f124710d).a(httpsURLConnection);
            for (Map.Entry entry : c13301c.f124709c.entrySet()) {
                httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpsURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, "ScanditInternal");
            int i10 = AbstractC13300b.f124705a[c13301c.f124708b.ordinal()];
            if (i10 == 1) {
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setDoOutput(false);
            } else if (i10 == 2) {
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.setDoOutput(true);
                httpsURLConnection.setChunkedStreamingMode(0);
            }
            InterfaceC13304f interfaceC13304f = c13301c.f124711e;
            URL url2 = httpsURLConnection.getURL();
            Intrinsics.i(url2, "getURL(...)");
            ((C13305g) interfaceC13304f).a(url, url2);
            return httpsURLConnection;
        } catch (IOException e10) {
            throw new C13313o(e10);
        } catch (ClassCastException e11) {
            throw new C13320w(e11);
        } catch (MalformedURLException e12) {
            throw new C13321x(e12);
        } catch (Exception e13) {
            throw new C13323z(e13);
        }
    }
}
