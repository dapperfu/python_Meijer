package com.google.android.gms.internal.ads;

import io.constructor.BuildConfig;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.u7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9571u7 extends AbstractC8183h7 {
    public C9571u7(InterfaceC9464t7 interfaceC9464t7, SSLSocketFactory sSLSocketFactory) {
    }

    static List b(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new P6((String) entry.getKey(), (String) it.next()));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8183h7
    public final C9250r7 a(V6 v62, Map map) throws Throwable {
        String strU = v62.u();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(v62.w());
        URL url = new URL(strU);
        HttpURLConnection httpURLConnection = (HttpURLConnection) com.fullstory.FS.urlconnection_wrapInstance(url.openConnection());
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int iA = v62.a();
        httpURLConnection.setConnectTimeout(iA);
        httpURLConnection.setReadTimeout(iA);
        boolean z10 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        BuildConfig.SERVICE_SCHEME.equals(url.getProtocol());
        try {
            for (String str : map2.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) map2.get(str));
            }
            if (v62.zza() != 0) {
                httpURLConnection.setRequestMethod("POST");
                byte[] bArrL = v62.L();
                if (bArrL != null) {
                    httpURLConnection.setDoOutput(true);
                    if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
                        httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
                    }
                    DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                    dataOutputStream.write(bArrL);
                    dataOutputStream.close();
                }
            } else {
                httpURLConnection.setRequestMethod("GET");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            v62.zza();
            if ((responseCode >= 100 && responseCode < 200) || responseCode == 204 || responseCode == 304) {
                C9250r7 c9250r7 = new C9250r7(responseCode, b(httpURLConnection.getHeaderFields()), -1, null);
                httpURLConnection.disconnect();
                return c9250r7;
            }
            try {
                return new C9250r7(responseCode, b(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new C9357s7(httpURLConnection));
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                if (!z10) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
