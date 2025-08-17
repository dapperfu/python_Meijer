package Za;

import android.content.Context;
import android.os.Build;
import cb.C6382c;
import cb.C6383d;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.medallia.digital.mobilesdk.q2;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* loaded from: classes4.dex */
public class a implements Nb.a {

    /* renamed from: b, reason: collision with root package name */
    private static final C6382c f42569b = C6383d.a(a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Context f42570a;

    private String a() {
        try {
            return String.valueOf(this.f42570a.getPackageManager().getPackageInfo(this.f42570a.getPackageName(), 0).versionCode);
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    private String b(String str) {
        return str == null ? "UNKNOWN" : str;
    }

    public static String c() throws IOException {
        Properties properties = new Properties();
        try {
            InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(a.class.getResource("gimbal-version.properties"));
            try {
                properties.load(inputStreamOpenStream);
                return properties.getProperty("gimbal.sdk.version");
            } finally {
                inputStreamOpenStream.close();
            }
        } catch (Exception unused) {
            f42569b.g("Unable to load SDK version. Make sure gimbal-version.properties is in the same directory structure as UserAgentBuilder", new Object[0]);
            return "UNKNOWN";
        }
    }

    public String d(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f42570a.getPackageName());
        sb2.append(q2.f92724c);
        sb2.append(a());
        sb2.append(" ");
        sb2.append("com.gimbal");
        sb2.append(q2.f92724c);
        sb2.append(c());
        sb2.append(" ");
        sb2.append("(");
        sb2.append("Android");
        sb2.append(" ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(",");
        sb2.append(b(Build.MODEL));
        sb2.append(",");
        sb2.append(b(Build.MANUFACTURER));
        sb2.append(")");
        if (str != null) {
            sb2.append(" ");
            sb2.append("(");
            sb2.append(str);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public a(Context context) {
        this.f42570a = context;
    }
}
