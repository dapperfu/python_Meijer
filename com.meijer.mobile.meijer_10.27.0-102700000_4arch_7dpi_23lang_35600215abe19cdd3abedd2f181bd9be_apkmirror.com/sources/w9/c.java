package w9;

import B9.ResponseModel;
import G9.h;
import I9.e;
import J9.j;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import s9.C16914a;
import y9.EnumC18191b;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 \u00192\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0012¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0012¢\u0006\u0004\b\u0015\u0010\u000fJ\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b!\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010%¨\u0006&"}, d2 = {"Lw9/c;", "", "Ly9/c;", "requestModel", "LY8/b;", "connectionProvider", "Ls9/a;", "timestampProvider", "<init>", "(Ly9/c;LY8/b;Ls9/a;)V", "Ljavax/net/ssl/HttpsURLConnection;", "connection", "model", "", "b", "(Ljavax/net/ssl/HttpsURLConnection;Ly9/c;)V", "", "", "headers", "g", "(Ljavax/net/ssl/HttpsURLConnection;Ljava/util/Map;)V", "f", "LB9/c;", "e", "(Ljavax/net/ssl/HttpsURLConnection;)LB9/c;", "d", "(Ljavax/net/ssl/HttpsURLConnection;)Ljava/lang/String;", "", "responseCode", "", "c", "(I)Z", "LV8/c;", "a", "()LV8/c;", "Ly9/c;", "LY8/b;", "Ls9/a;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y9.c requestModel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Y8.b connectionProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C16914a timestampProvider;

    public c(y9.c requestModel, Y8.b connectionProvider, C16914a timestampProvider) {
        Intrinsics.j(requestModel, "requestModel");
        Intrinsics.j(connectionProvider, "connectionProvider");
        Intrinsics.j(timestampProvider, "timestampProvider");
        this.requestModel = requestModel;
        this.connectionProvider = connectionProvider;
        this.timestampProvider = timestampProvider;
    }

    private boolean c(int responseCode) {
        return 200 <= responseCode && responseCode < 300;
    }

    public V8.c<ResponseModel> a() {
        ResponseModel responseModelE;
        HttpsURLConnection httpsURLConnectionA;
        long jA = this.timestampProvider.a();
        HttpsURLConnection httpsURLConnection = null;
        Exception exc = null;
        try {
            httpsURLConnectionA = this.connectionProvider.a(this.requestModel);
            try {
                try {
                    b(httpsURLConnectionA, this.requestModel);
                    httpsURLConnectionA.setConnectTimeout(20000);
                    httpsURLConnectionA.connect();
                    f(httpsURLConnectionA, this.requestModel);
                    responseModelE = e(httpsURLConnectionA);
                } catch (Throwable th2) {
                    th = th2;
                    httpsURLConnection = httpsURLConnectionA;
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                responseModelE = null;
            }
            try {
                e.Companion companion = I9.e.INSTANCE;
                e.Companion.b(companion, new j(responseModelE, jA, this.requestModel), false, 2, null);
                e.Companion.e(companion, new j(responseModelE, jA, null, 4, null), false, 2, null);
            } catch (Exception e11) {
                e = e11;
                exc = e;
                if (httpsURLConnectionA != null) {
                    httpsURLConnectionA.disconnect();
                }
                return new V8.c<>(responseModelE, exc);
            }
        } catch (Exception e12) {
            e = e12;
            responseModelE = null;
            httpsURLConnectionA = null;
        } catch (Throwable th3) {
            th = th3;
        }
        httpsURLConnectionA.disconnect();
        return new V8.c<>(responseModelE, exc);
    }

    private void b(HttpsURLConnection connection, y9.c model) throws ProtocolException {
        connection.setRequestMethod(model.getMethod().name());
        g(connection, model.a());
        connection.setConnectTimeout(30000);
        if (model.getMethod() != EnumC18191b.GET && model.d() != null) {
            connection.setDoOutput(true);
        }
    }

    private String d(HttpsURLConnection connection) throws IOException {
        InputStream errorStream;
        Intrinsics.g(connection);
        if (c(connection.getResponseCode())) {
            errorStream = connection.getInputStream();
            Intrinsics.g(errorStream);
        } else {
            errorStream = connection.getErrorStream();
            Intrinsics.g(errorStream);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line != null) {
                sb2.append(line);
            } else {
                bufferedReader.close();
                String string = sb2.toString();
                Intrinsics.i(string, "toString(...)");
                return string;
            }
        }
    }

    private ResponseModel e(HttpsURLConnection connection) throws IOException {
        Intrinsics.g(connection);
        int responseCode = connection.getResponseCode();
        String responseMessage = connection.getResponseMessage();
        Map<String, List<String>> headerFields = connection.getHeaderFields();
        String strD = d(connection);
        ResponseModel.a aVarF = new ResponseModel.a(this.timestampProvider).h(responseCode).f(responseMessage);
        Intrinsics.g(headerFields);
        return aVarF.e(headerFields).a(strD).g(this.requestModel).b();
    }

    private void f(HttpsURLConnection connection, y9.c model) throws IOException {
        if (model.d() != null) {
            Map<String, Object> mapD = model.d();
            Intrinsics.g(mapD);
            String string = h.b(G9.j.a(mapD)).toString();
            Intrinsics.i(string, "toString(...)");
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.i(UTF_8, "UTF_8");
            byte[] bytes = string.getBytes(UTF_8);
            Intrinsics.i(bytes, "getBytes(...)");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(connection.getOutputStream());
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.close();
        }
    }

    private void g(HttpsURLConnection connection, Map<String, String> headers) {
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            connection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }
}
