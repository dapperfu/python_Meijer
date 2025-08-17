package com.google.firebase.perf.network;

import Vf.g;
import Zf.k;
import ag.l;
import androidx.annotation.Keep;
import java.io.IOException;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.j;

/* loaded from: classes7.dex */
public class FirebasePerfOkHttpClient {
    @Keep
    public static void enqueue(okhttp3.d dVar, Qv.b bVar) {
        l lVar = new l();
        dVar.b2(new d(bVar, k.k(), lVar, lVar.e()));
    }

    private FirebasePerfOkHttpClient() {
    }

    static void a(Response response, g gVar, long j10, long j11) throws IOException {
        Request request = response.getRequest();
        if (request == null) {
            return;
        }
        gVar.x(request.getUrl().z().toString());
        gVar.j(request.getMethod());
        if (request.getBody() != null) {
            long jContentLength = request.getBody().contentLength();
            if (jContentLength != -1) {
                gVar.o(jContentLength);
            }
        }
        ResponseBody body = response.getBody();
        if (body != null) {
            long f154150b = body.getContentLength();
            if (f154150b != -1) {
                gVar.s(f154150b);
            }
            j f154149a = body.getMediaType();
            if (f154149a != null) {
                gVar.r(f154149a.getMediaType());
            }
        }
        gVar.k(response.getCode());
        gVar.q(j10);
        gVar.v(j11);
        gVar.b();
    }

    @Keep
    public static Response execute(okhttp3.d dVar) throws IOException {
        g gVarC = g.c(k.k());
        l lVar = new l();
        long jE = lVar.e();
        try {
            Response responseExecute = dVar.execute();
            a(responseExecute, gVarC, jE, lVar.c());
            return responseExecute;
        } catch (IOException e10) {
            Request request = dVar.request();
            if (request != null) {
                HttpUrl url = request.getUrl();
                if (url != null) {
                    gVarC.x(url.z().toString());
                }
                if (request.getMethod() != null) {
                    gVarC.j(request.getMethod());
                }
            }
            gVarC.q(jE);
            gVarC.v(lVar.c());
            Xf.d.d(gVarC);
            throw e10;
        }
    }
}
