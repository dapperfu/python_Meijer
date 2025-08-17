package of;

import Td.C5235m;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.medallia.digital.mobilesdk.q2;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import of.L;

/* loaded from: classes7.dex */
public class K implements L {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f153458g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    private static final String f153459h = Pattern.quote(q2.f92724c);

    /* renamed from: a, reason: collision with root package name */
    private final M f153460a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f153461b;

    /* renamed from: c, reason: collision with root package name */
    private final String f153462c;

    /* renamed from: d, reason: collision with root package name */
    private final Jf.e f153463d;

    /* renamed from: e, reason: collision with root package name */
    private final F f153464e;

    /* renamed from: f, reason: collision with root package name */
    private L.a f153465f;

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String strE;
        strE = e(UUID.randomUUID().toString());
        lf.g.f().i("Created new Crashlytics installation ID: " + strE + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strE).putString("firebase.installation.id", str).apply();
        return strE;
    }

    @Override // of.L
    public synchronized L.a a() {
        if (!n()) {
            return this.f153465f;
        }
        lf.g.f().i("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesQ = C16041i.q(this.f153461b);
        String string = sharedPreferencesQ.getString("firebase.installation.id", null);
        lf.g.f().i("Cached Firebase Installation ID: " + string);
        if (this.f153464e.d()) {
            FirebaseInstallationId firebaseInstallationIdD = d(false);
            lf.g.f().i("Fetched Firebase Installation ID: " + firebaseInstallationIdD.getFid());
            if (firebaseInstallationIdD.getFid() == null) {
                firebaseInstallationIdD = new FirebaseInstallationId(string == null ? c() : string, null);
            }
            if (Objects.equals(firebaseInstallationIdD.getFid(), string)) {
                this.f153465f = L.a.a(l(sharedPreferencesQ), firebaseInstallationIdD);
            } else {
                this.f153465f = L.a.a(b(firebaseInstallationIdD.getFid(), sharedPreferencesQ), firebaseInstallationIdD);
            }
        } else if (k(string)) {
            this.f153465f = L.a.b(l(sharedPreferencesQ));
        } else {
            this.f153465f = L.a.b(b(c(), sharedPreferencesQ));
        }
        lf.g.f().i("Install IDs: " + this.f153465f);
        return this.f153465f;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        return f153458g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f153459h, "");
    }

    private boolean n() {
        L.a aVar = this.f153465f;
        if (aVar != null) {
            return aVar.e() == null && this.f153464e.d();
        }
        return true;
    }

    public String f() {
        return this.f153462c;
    }

    public String g() {
        return this.f153460a.a(this.f153461b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }

    public K(Context context, String str, Jf.e eVar, F f10) {
        if (context != null) {
            if (str != null) {
                this.f153461b = context;
                this.f153462c = str;
                this.f153463d = eVar;
                this.f153464e = f10;
                this.f153460a = new M();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    public FirebaseInstallationId d(boolean z10) {
        String strB;
        pf.i.e();
        String str = null;
        if (z10) {
            try {
                strB = ((com.google.firebase.installations.f) C5235m.b(this.f153463d.a(false), 10000L, TimeUnit.MILLISECONDS)).b();
            } catch (Exception e10) {
                lf.g.f().l("Error getting Firebase authentication token.", e10);
            }
        } else {
            strB = null;
        }
        try {
            str = (String) C5235m.b(this.f153463d.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            lf.g.f().l("Error getting Firebase installation id.", e11);
        }
        return new FirebaseInstallationId(str, strB);
    }
}
