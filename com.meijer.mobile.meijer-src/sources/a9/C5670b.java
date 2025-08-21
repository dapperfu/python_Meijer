package a9;

import android.webkit.URLUtil;
import com.fullstory.FS;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"La9/b;", "", "<init>", "()V", "LA9/c;", "requestModel", "Ljavax/net/ssl/HttpsURLConnection;", "a", "(LA9/c;)Ljavax/net/ssl/HttpsURLConnection;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: a9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5670b {
    public HttpsURLConnection a(A9.c requestModel) {
        Intrinsics.j(requestModel, "requestModel");
        URL url = requestModel.getUrl();
        if (URLUtil.isHttpsUrl(url.toString())) {
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(FS.urlconnection_wrapInstance(requestModel.getUrl().openConnection()));
            Intrinsics.h(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            return (HttpsURLConnection) uRLConnection;
        }
        String protocol = url.getProtocol();
        Intrinsics.i(protocol, "getProtocol(...)");
        Locale locale = Locale.getDefault();
        Intrinsics.i(locale, "getDefault(...)");
        String upperCase = protocol.toUpperCase(locale);
        Intrinsics.i(upperCase, "toUpperCase(...)");
        throw new IllegalArgumentException(("Expected HTTPS request model, but got: " + upperCase).toString());
    }
}
