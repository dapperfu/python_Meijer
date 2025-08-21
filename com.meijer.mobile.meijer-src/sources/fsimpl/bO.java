package fsimpl;

import com.fullstory.rust.RustInterface;
import com.fullstory.util.Log;
import okhttp3.OkHttpClient;

/* loaded from: classes15.dex */
public class bO {
    public static void a(RustInterface rustInterface, Object obj) {
        if (C14118br.b()) {
            try {
                OkHttpClient.Builder builder = (OkHttpClient.Builder) obj;
                builder.addInterceptor(new bP(rustInterface, false));
                builder.addNetworkInterceptor(new bP(rustInterface, true));
            } catch (Throwable th2) {
                Log.e("Exception adding network interceptor to OkHttpClient.Builder", th2);
            }
        }
    }
}
