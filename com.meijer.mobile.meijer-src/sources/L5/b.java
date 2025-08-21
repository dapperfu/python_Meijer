package L5;

import R5.K;
import R5.t;
import R5.v;
import android.content.Context;
import android.content.SharedPreferences;
import com.adobe.marketing.mobile.D;
import java.io.File;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0003R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015¨\u0006\u001b"}, d2 = {"LL5/b;", "", "<init>", "()V", "", "h", "g", "i", "j", "", "timestampMs", "a", "(J)J", "f", "Landroid/content/SharedPreferences;", "Lkotlin/Lazy;", "b", "()Landroid/content/SharedPreferences;", "v4SharedPreferences", "", "d", "()Z", "isMigrationRequired", "c", "isConfigurationMigrationRequired", "e", "isVisitorIdMigrationRequired", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy v4SharedPreferences = LazyKt.b(C0327b.f18025f);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/SharedPreferences;", "c", "()Landroid/content/SharedPreferences;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: L5.b$b, reason: collision with other inner class name */
    static final class C0327b extends Lambda implements Function0<SharedPreferences> {

        /* renamed from: f, reason: collision with root package name */
        public static final C0327b f18025f = new C0327b();

        C0327b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            Context applicationContext = K.f().a().getApplicationContext();
            if (applicationContext != null) {
                return applicationContext.getSharedPreferences("APP_MEASUREMENT_CACHE", 0);
            }
            return null;
        }
    }

    private final long a(long timestampMs) {
        return timestampMs / 1000;
    }

    private final SharedPreferences b() {
        return (SharedPreferences) this.v4SharedPreferences.getValue();
    }

    private final boolean c() {
        SharedPreferences sharedPreferencesB = b();
        if (sharedPreferencesB != null) {
            return sharedPreferencesB.contains("PrivacyStatus");
        }
        return false;
    }

    private final boolean d() {
        SharedPreferences sharedPreferencesB = b();
        if (sharedPreferencesB != null) {
            return sharedPreferencesB.contains("ADMS_InstallDate");
        }
        return false;
    }

    private final boolean e() {
        v vVarA = K.f().d().a("visitorIDServiceDataStore");
        if (vVarA != null) {
            return vVarA.contains("ADOBEMOBILE_VISITOR_ID");
        }
        return false;
    }

    private final void g() throws JSONException {
        D d10;
        SharedPreferences sharedPreferencesB = b();
        if (sharedPreferencesB == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        v vVarA = K.f().d().a("AdobeMobile_ConfigState");
        int i10 = sharedPreferencesB.getInt("PrivacyStatus", -1);
        if (i10 >= 0 && i10 < 3) {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        d10 = D.UNKNOWN;
                    } else {
                        d10 = D.UNKNOWN;
                    }
                } else {
                    d10 = D.OPT_OUT;
                }
            } else {
                d10 = D.OPT_IN;
            }
            String string = vVarA.getString("config.overridden.map", null);
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    if (!jSONObject.has("global.privacy")) {
                        jSONObject.put("global.privacy", d10.e());
                        vVarA.d("config.overridden.map", jSONObject.toString());
                    } else {
                        t.a("MobileCore", "MobileCore/V4Migrator", "V5 configuration data already contains setting for global privacy. V4 global privacy not migrated.", new Object[0]);
                    }
                } catch (JSONException e10) {
                    t.b("MobileCore", "MobileCore/V4Migrator", "Failed to serialize v5 configuration data. Unable to migrate v4 configuration data to v5. %s", e10.getLocalizedMessage());
                }
            } else {
                HashMap map = new HashMap();
                map.put("global.privacy", d10.e());
                vVarA.d("config.overridden.map", new JSONObject(map).toString());
            }
        }
        editorEdit.remove("PrivacyStatus");
        editorEdit.apply();
        t.a("MobileCore", "MobileCore/V4Migrator", "Migration complete for Configuration data.", new Object[0]);
    }

    private final void h() {
        b bVar;
        SharedPreferences sharedPreferencesB = b();
        if (sharedPreferencesB == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = sharedPreferencesB.edit();
        long j10 = sharedPreferencesB.getLong("ADMS_InstallDate", 0L);
        editorEdit.remove("utm_source");
        editorEdit.remove("utm_medium");
        editorEdit.remove("utm_term");
        editorEdit.remove("utm_content");
        editorEdit.remove("utm_campaign");
        editorEdit.remove("trackingcode");
        editorEdit.remove("messagesBlackList");
        editorEdit.apply();
        t.a("MobileCore", "MobileCore/V4Migrator", "Migration complete for Mobile Services data.", new Object[0]);
        K.f().d().a("Acquisition").d("ADMS_Referrer_ContextData_Json_String", sharedPreferencesB.getString("ADMS_Referrer_ContextData_Json_String", null));
        editorEdit.remove("ADMS_Referrer_ContextData_Json_String");
        editorEdit.apply();
        t.a("MobileCore", "MobileCore/V4Migrator", "Migration complete for Acquisition data.", new Object[0]);
        v vVarA = K.f().d().a("AnalyticsDataStorage");
        vVarA.d("ADOBEMOBILE_STOREDDEFAULTS_AID", sharedPreferencesB.getString("ADOBEMOBILE_STOREDDEFAULTS_AID", null));
        vVarA.f("ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID", sharedPreferencesB.getBoolean("ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID", false));
        vVarA.d("ADOBEMOBILE_STOREDDEFAULTS_VISITOR_IDENTIFIER", sharedPreferencesB.getString("APP_MEASUREMENT_VISITOR_ID", null));
        editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_AID");
        editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_IGNORE_AID");
        editorEdit.remove("ADBLastKnownTimestampKey");
        editorEdit.apply();
        t.a("MobileCore", "MobileCore/V4Migrator", "Migration complete for Analytics data.", new Object[0]);
        K.f().d().a("AAMDataStore").d("AAMUserId", sharedPreferencesB.getString("AAMUserId", null));
        editorEdit.remove("AAMUserId");
        editorEdit.remove("AAMUserProfile");
        editorEdit.apply();
        t.a("MobileCore", "MobileCore/V4Migrator", "Migration complete for Audience Manager data.", new Object[0]);
        v vVarA2 = K.f().d().a("visitorIDServiceDataStore");
        vVarA2.d("ADOBEMOBILE_PERSISTED_MID", sharedPreferencesB.getString("ADBMOBILE_PERSISTED_MID", null));
        vVarA2.d("ADOBEMOBILE_PERSISTED_MID_BLOB", sharedPreferencesB.getString("ADBMOBILE_PERSISTED_MID_BLOB", null));
        vVarA2.d("ADOBEMOBILE_PERSISTED_MID_HINT", sharedPreferencesB.getString("ADBMOBILE_PERSISTED_MID_HINT", null));
        vVarA2.d("ADOBEMOBILE_VISITORID_IDS", sharedPreferencesB.getString("ADBMOBILE_VISITORID_IDS", null));
        vVarA2.f("ADOBEMOBILE_PUSH_ENABLED", sharedPreferencesB.getBoolean("ADBMOBILE_KEY_PUSH_ENABLED", false));
        editorEdit.remove("ADBMOBILE_PERSISTED_MID");
        editorEdit.remove("ADBMOBILE_PERSISTED_MID_BLOB");
        editorEdit.remove("ADBMOBILE_PERSISTED_MID_HINT");
        editorEdit.remove("APP_MEASUREMENT_VISITOR_ID");
        editorEdit.remove("ADBMOBILE_VISITORID_IDS");
        editorEdit.remove("ADBMOBILE_VISITORID_SYNC");
        editorEdit.remove("ADBMOBILE_VISITORID_TTL");
        editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_ADVERTISING_IDENTIFIER");
        editorEdit.remove("ADBMOBILE_KEY_PUSH_TOKEN");
        editorEdit.remove("ADBMOBILE_KEY_PUSH_ENABLED");
        editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_AID_SYNCED");
        editorEdit.apply();
        t.a("MobileCore", "MobileCore/V4Migrator", "Migration complete for Identity (Visitor ID Service) data.", new Object[0]);
        v vVarA3 = K.f().d().a("AdobeMobile_Lifecycle");
        if (j10 > 0) {
            bVar = this;
            vVarA3.b("InstallDate", bVar.a(j10));
        } else {
            bVar = this;
        }
        vVarA3.d("LastVersion", sharedPreferencesB.getString("ADMS_LastVersion", null));
        long j11 = sharedPreferencesB.getLong("ADMS_LastDateUsed", 0L);
        if (j11 > 0) {
            vVarA3.b("LastDateUsed", bVar.a(j11));
        }
        vVarA3.c("Launches", sharedPreferencesB.getInt("ADMS_Launches", 0));
        vVarA3.f("SuccessfulClose", sharedPreferencesB.getBoolean("ADMS_SuccessfulClose", false));
        editorEdit.remove("ADMS_InstallDate");
        editorEdit.remove("ADMS_LastVersion");
        editorEdit.remove("ADMS_LastDateUsed");
        editorEdit.remove("ADMS_Launches");
        editorEdit.remove("ADMS_SuccessfulClose");
        editorEdit.remove("ADMS_LifecycleData");
        editorEdit.remove("ADMS_SessionStart");
        editorEdit.remove("ADMS_PauseDate");
        editorEdit.remove("ADMS_LaunchesAfterUpgrade");
        editorEdit.remove("ADMS_UpgradeDate");
        editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_OS");
        editorEdit.remove("ADOBEMOBILE_STOREDDEFAULTS_APPID");
        editorEdit.apply();
        t.a("MobileCore", "MobileCore/V4Migrator", "Migration complete for Lifecycle data.", new Object[0]);
        v vVarA4 = K.f().d().a("ADOBEMOBILE_TARGET");
        vVarA4.d("TNT_ID", sharedPreferencesB.getString("ADBMOBILE_TARGET_TNT_ID", null));
        vVarA4.d("THIRD_PARTY_ID", sharedPreferencesB.getString("ADBMOBILE_TARGET_3RD_PARTY_ID", null));
        vVarA4.d("SESSION_ID", sharedPreferencesB.getString("ADBMOBILE_TARGET_SESSION_ID", null));
        vVarA4.d("EDGE_HOST", sharedPreferencesB.getString("ADBMOBILE_TARGET_EDGE_HOST", null));
        editorEdit.remove("ADBMOBILE_TARGET_TNT_ID");
        editorEdit.remove("ADBMOBILE_TARGET_3RD_PARTY_ID");
        editorEdit.remove("ADBMOBILE_TARGET_SESSION_ID");
        editorEdit.remove("ADBMOBILE_TARGET_EDGE_HOST");
        editorEdit.remove("ADBMOBILE_TARGET_LAST_TIMESTAMP");
        editorEdit.remove("mboxPC_Expires");
        editorEdit.remove("mboxPC_Value");
        editorEdit.apply();
        t.a("MobileCore", "MobileCore/V4Migrator", "Migrating complete for Target data.", new Object[0]);
    }

    private final void i() {
        v vVarA = K.f().d().a("visitorIDServiceDataStore");
        v vVarA2 = K.f().d().a("AnalyticsDataStorage");
        if (vVarA != null && vVarA2 != null) {
            if (!vVarA2.contains("ADOBEMOBILE_STOREDDEFAULTS_VISITOR_IDENTIFIER")) {
                vVarA2.d("ADOBEMOBILE_STOREDDEFAULTS_VISITOR_IDENTIFIER", vVarA.getString("ADOBEMOBILE_VISITOR_ID", null));
            }
            vVarA.remove("ADOBEMOBILE_VISITOR_ID");
            return;
        }
        t.a("MobileCore", "MobileCore/V4Migrator", "%s (Identity or Analytics data store), failed to migrate visitor id.", "Unexpected Null Value");
    }

    private final void j() {
        File fileO = K.f().e().o();
        if (fileO == null) {
            t.a("MobileCore", "MobileCore/V4Migrator", "%s (cache directory), failed to delete V4 databases", "Unexpected Null Value");
            return;
        }
        for (String str : a.f18020a.a()) {
            try {
                File file = new File(fileO, str);
                if (file.exists() && file.delete()) {
                    t.a("MobileCore", "MobileCore/V4Migrator", "Removed V4 database %s successfully", str);
                }
            } catch (SecurityException e10) {
                t.a("MobileCore", "MobileCore/V4Migrator", "Failed to delete V4 database with name %s (%s)", str, e10);
            }
        }
    }

    public final void f() throws JSONException {
        if (b() == null) {
            t.a("MobileCore", "MobileCore/V4Migrator", "%s (v4 shared preferences), failed to migrate v4 storage", "Unexpected Null Value");
        }
        if (d()) {
            t.a("MobileCore", "MobileCore/V4Migrator", "Migrating Adobe SDK v4 SharedPreferences for use with AEP SDK.", new Object[0]);
            h();
            g();
            j();
            t.a("MobileCore", "MobileCore/V4Migrator", "Full migration of v4 SharedPreferences successful.", new Object[0]);
        } else if (c()) {
            t.a("MobileCore", "MobileCore/V4Migrator", "Migrating Adobe SDK v4 Configuration SharedPreferences for use with AEP SDK.", new Object[0]);
            g();
            t.a("MobileCore", "MobileCore/V4Migrator", "Full migration of v4 Configuration SharedPreferences successful.", new Object[0]);
        }
        if (e()) {
            t.a("MobileCore", "MobileCore/V4Migrator", "Migrating visitor identifier from Identity to Analytics.", new Object[0]);
            i();
            t.a("MobileCore", "MobileCore/V4Migrator", "Full migration of visitor identifier from Identity to Analytics successful.", new Object[0]);
        }
    }
}
