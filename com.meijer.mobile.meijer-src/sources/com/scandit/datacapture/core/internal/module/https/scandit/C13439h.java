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
/* loaded from: classes12.dex */
public final class C13439h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13440i f125684a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13439h(C13440i c13440i) {
        super(0);
        this.f125684a = c13440i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws C13454x, ProtocolException, C13456z, C13453w, C13446o {
        C13434c c13434c = (C13434c) this.f125684a.f125685a;
        c13434c.getClass();
        try {
            URL url = new URL(c13434c.f125659a);
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(url.openConnection()));
            Intrinsics.h(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
            ((O) c13434c.f125662d).a(httpsURLConnection);
            for (Map.Entry entry : c13434c.f125661c.entrySet()) {
                httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpsURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, "ScanditInternal");
            int i10 = AbstractC13433b.f125657a[c13434c.f125660b.ordinal()];
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
            InterfaceC13437f interfaceC13437f = c13434c.f125663e;
            URL url2 = httpsURLConnection.getURL();
            Intrinsics.i(url2, "getURL(...)");
            ((C13438g) interfaceC13437f).a(url, url2);
            return httpsURLConnection;
        } catch (IOException e10) {
            throw new C13446o(e10);
        } catch (ClassCastException e11) {
            throw new C13453w(e11);
        } catch (MalformedURLException e12) {
            throw new C13454x(e12);
        } catch (Exception e13) {
            throw new C13456z(e13);
        }
    }
}
