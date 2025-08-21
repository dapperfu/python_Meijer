package qf;

import Vd.C5519m;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.medallia.digital.mobilesdk.q2;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import qf.L;

/* loaded from: classes8.dex */
public class K implements L {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f158310g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    private static final String f158311h = Pattern.quote(q2.f93563c);

    /* renamed from: a, reason: collision with root package name */
    private final M f158312a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f158313b;

    /* renamed from: c, reason: collision with root package name */
    private final String f158314c;

    /* renamed from: d, reason: collision with root package name */
    private final Lf.e f158315d;

    /* renamed from: e, reason: collision with root package name */
    private final F f158316e;

    /* renamed from: f, reason: collision with root package name */
    private L.a f158317f;

    private synchronized String b(String str, SharedPreferences sharedPreferences) {
        String strE;
        strE = e(UUID.randomUUID().toString());
        nf.g.f().i("Created new Crashlytics installation ID: " + strE + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strE).putString("firebase.installation.id", str).apply();
        return strE;
    }

    @Override // qf.L
    public synchronized L.a a() {
        if (!n()) {
            return this.f158317f;
        }
        nf.g.f().i("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesQ = C16649i.q(this.f158313b);
        String string = sharedPreferencesQ.getString("firebase.installation.id", null);
        nf.g.f().i("Cached Firebase Installation ID: " + string);
        if (this.f158316e.d()) {
            FirebaseInstallationId firebaseInstallationIdD = d(false);
            nf.g.f().i("Fetched Firebase Installation ID: " + firebaseInstallationIdD.getFid());
            if (firebaseInstallationIdD.getFid() == null) {
                firebaseInstallationIdD = new FirebaseInstallationId(string == null ? c() : string, null);
            }
            if (Objects.equals(firebaseInstallationIdD.getFid(), string)) {
                this.f158317f = L.a.a(l(sharedPreferencesQ), firebaseInstallationIdD);
            } else {
                this.f158317f = L.a.a(b(firebaseInstallationIdD.getFid(), sharedPreferencesQ), firebaseInstallationIdD);
            }
        } else if (k(string)) {
            this.f158317f = L.a.b(l(sharedPreferencesQ));
        } else {
            this.f158317f = L.a.b(b(c(), sharedPreferencesQ));
        }
        nf.g.f().i("Install IDs: " + this.f158317f);
        return this.f158317f;
    }

    static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    private static String e(String str) {
        return f158310g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    private String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private String m(String str) {
        return str.replaceAll(f158311h, "");
    }

    private boolean n() {
        L.a aVar = this.f158317f;
        if (aVar != null) {
            return aVar.e() == null && this.f158316e.d();
        }
        return true;
    }

    public String f() {
        return this.f158314c;
    }

    public String g() {
        return this.f158312a.a(this.f158313b);
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

    public K(Context context, String str, Lf.e eVar, F f10) {
        if (context != null) {
            if (str != null) {
                this.f158313b = context;
                this.f158314c = str;
                this.f158315d = eVar;
                this.f158316e = f10;
                this.f158312a = new M();
                return;
            }
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        throw new IllegalArgumentException("appContext must not be null");
    }

    public FirebaseInstallationId d(boolean z10) {
        String strB;
        rf.i.e();
        String str = null;
        if (z10) {
            try {
                strB = ((com.google.firebase.installations.f) C5519m.b(this.f158315d.a(false), 10000L, TimeUnit.MILLISECONDS)).b();
            } catch (Exception e10) {
                nf.g.f().l("Error getting Firebase authentication token.", e10);
            }
        } else {
            strB = null;
        }
        try {
            str = (String) C5519m.b(this.f158315d.getId(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e11) {
            nf.g.f().l("Error getting Firebase installation id.", e11);
        }
        return new FirebaseInstallationId(str, strB);
    }
}
