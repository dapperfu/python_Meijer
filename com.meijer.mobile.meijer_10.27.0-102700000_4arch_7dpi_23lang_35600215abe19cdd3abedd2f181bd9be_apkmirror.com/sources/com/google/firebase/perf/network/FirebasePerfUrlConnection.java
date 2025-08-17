package com.google.firebase.perf.network;

import Vf.g;
import Zf.k;
import ag.l;
import ag.n;
import androidx.annotation.Keep;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes7.dex */
public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL url) throws IOException {
        return a(new n(url), k.k(), new l());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        return b(new n(url), clsArr, k.k(), new l());
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        return obj instanceof HttpsURLConnection ? new b((HttpsURLConnection) obj, new l(), g.c(k.k())) : obj instanceof HttpURLConnection ? new a((HttpURLConnection) obj, new l(), g.c(k.k())) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        return c(new n(url), k.k(), new l());
    }

    private FirebasePerfUrlConnection() {
    }

    static Object a(n nVar, k kVar, l lVar) throws IOException {
        lVar.g();
        long jE = lVar.e();
        g gVarC = g.c(kVar);
        try {
            URLConnection uRLConnectionA = nVar.a();
            if (uRLConnectionA instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) uRLConnectionA, lVar, gVarC).getContent();
            }
            if (uRLConnectionA instanceof HttpURLConnection) {
                return new a((HttpURLConnection) uRLConnectionA, lVar, gVarC).getContent();
            }
            return uRLConnectionA.getContent();
        } catch (IOException e10) {
            gVarC.q(jE);
            gVarC.v(lVar.c());
            gVarC.x(nVar.toString());
            Xf.d.d(gVarC);
            throw e10;
        }
    }

    static Object b(n nVar, Class[] clsArr, k kVar, l lVar) throws IOException {
        lVar.g();
        long jE = lVar.e();
        g gVarC = g.c(kVar);
        try {
            URLConnection uRLConnectionA = nVar.a();
            if (uRLConnectionA instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) uRLConnectionA, lVar, gVarC).getContent(clsArr);
            }
            if (uRLConnectionA instanceof HttpURLConnection) {
                return new a((HttpURLConnection) uRLConnectionA, lVar, gVarC).getContent(clsArr);
            }
            return uRLConnectionA.getContent(clsArr);
        } catch (IOException e10) {
            gVarC.q(jE);
            gVarC.v(lVar.c());
            gVarC.x(nVar.toString());
            Xf.d.d(gVarC);
            throw e10;
        }
    }

    static InputStream c(n nVar, k kVar, l lVar) throws IOException {
        if (!k.k().u()) {
            return nVar.a().getInputStream();
        }
        lVar.g();
        long jE = lVar.e();
        g gVarC = g.c(kVar);
        try {
            URLConnection uRLConnectionA = nVar.a();
            if (uRLConnectionA instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) uRLConnectionA, lVar, gVarC).getInputStream();
            }
            if (uRLConnectionA instanceof HttpURLConnection) {
                return new a((HttpURLConnection) uRLConnectionA, lVar, gVarC).getInputStream();
            }
            return uRLConnectionA.getInputStream();
        } catch (IOException e10) {
            gVarC.q(jE);
            gVarC.v(lVar.c());
            gVarC.x(nVar.toString());
            Xf.d.d(gVarC);
            throw e10;
        }
    }
}
