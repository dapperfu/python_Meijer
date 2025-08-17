package io.constructor.data.local;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import io.constructor.BuildConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 72\u00020\u0001:\u00017B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010,\u001a\u00020-J(\u0010.\u001a\u00020\u000f2\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-\u0018\u0001002\b\b\u0002\u00101\u001a\u000202J#\u00103\u001a\u00020\u000f2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020-\u0018\u000100H\u0000¢\u0006\u0002\b4J\u000e\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020\u000fR$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00188F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R(\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010\t\"\u0004\b%\u0010\u000bR(\u0010&\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u000bR(\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000b¨\u00068"}, d2 = {"Lio/constructor/data/local/PreferencesHelper;", "", "preferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "value", "", "apiKey", "getApiKey", "()Ljava/lang/String;", "setApiKey", "(Ljava/lang/String;)V", "defaultItemSection", "getDefaultItemSection", "setDefaultItemSection", "", "groupsShownForFirstTerm", "getGroupsShownForFirstTerm", "()I", "setGroupsShownForFirstTerm", "(I)V", PreferencesHelper.PREF_ID, "getId", "setId", "", "lastSessionAccess", "getLastSessionAccess", "()J", "setLastSessionAccess", "(J)V", "port", "getPort", "setPort", "getPreferences", "()Landroid/content/SharedPreferences;", "quizzesServiceUrl", "getQuizzesServiceUrl", "setQuizzesServiceUrl", "scheme", "getScheme", "setScheme", "serviceUrl", "getServiceUrl", "setServiceUrl", "clear", "", "getSessionId", "sessionIncrementAction", "Lkotlin/Function1;", "forceIncrement", "", "resetSession", "resetSession$library_release", "setSessionId", "sessionId", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SuppressLint({"CommitPrefEdits"})
/* loaded from: classes6.dex */
public final class PreferencesHelper {
    public static final String PREF_API_KEY = "api key";
    public static final String PREF_DEFAULT_ITEM_SECTION = "default_item_section";
    public static final String PREF_GROUPS_SHOWN_FOR_FIRST_TERM = "groups_shown_for_first_term";
    public static final String PREF_ID = "id";
    public static final String PREF_QUIZZES_SERVICE_URL = "quizzes_service_url";
    public static final String PREF_SERVICE_PORT = "service_port";
    public static final String PREF_SERVICE_SCHEME = "service_scheme";
    public static final String PREF_SERVICE_URL = "service_url";
    public static final String SESSION_ID = "session_id";
    public static final String SESSION_LAST_ACCESS = "session_last_access";
    public static final int SESSION_TIME_THRESHOLD = 1800000;
    private final SharedPreferences preferences;

    public PreferencesHelper(SharedPreferences preferences) {
        Intrinsics.j(preferences, "preferences");
        this.preferences = preferences;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ int getSessionId$default(PreferencesHelper preferencesHelper, Function1 function1, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return preferencesHelper.getSessionId(function1, z10);
    }

    public final void clear() {
        this.preferences.edit().clear().apply();
    }

    public final String getApiKey() {
        String string = this.preferences.getString(PREF_API_KEY, "");
        Intrinsics.g(string);
        Intrinsics.i(string, "preferences.getString(PREF_API_KEY, \"\")!!");
        return string;
    }

    public final String getDefaultItemSection() {
        String string = this.preferences.getString(PREF_DEFAULT_ITEM_SECTION, "");
        Intrinsics.g(string);
        Intrinsics.i(string, "preferences.getString(PR…FAULT_ITEM_SECTION, \"\")!!");
        return string;
    }

    public final int getGroupsShownForFirstTerm() {
        return this.preferences.getInt(PREF_GROUPS_SHOWN_FOR_FIRST_TERM, 2);
    }

    public final String getId() {
        String string = this.preferences.getString(PREF_ID, "");
        Intrinsics.g(string);
        Intrinsics.i(string, "preferences.getString(PREF_ID, \"\")!!");
        return string;
    }

    public final long getLastSessionAccess() {
        return this.preferences.getLong(SESSION_LAST_ACCESS, System.currentTimeMillis());
    }

    public final int getPort() {
        return this.preferences.getInt(PREF_SERVICE_PORT, 443);
    }

    public final SharedPreferences getPreferences() {
        return this.preferences;
    }

    public final String getQuizzesServiceUrl() {
        return this.preferences.getString(PREF_QUIZZES_SERVICE_URL, "");
    }

    public final String getScheme() {
        return this.preferences.getString(PREF_SERVICE_SCHEME, BuildConfig.SERVICE_SCHEME);
    }

    public final String getServiceUrl() {
        return this.preferences.getString(PREF_SERVICE_URL, "");
    }

    public final int getSessionId(Function1<? super String, Unit> sessionIncrementAction, boolean forceIncrement) {
        if (!this.preferences.contains(SESSION_ID)) {
            return resetSession$library_release(sessionIncrementAction);
        }
        if (System.currentTimeMillis() - getLastSessionAccess() > 1800000 || forceIncrement) {
            int i10 = this.preferences.getInt(SESSION_ID, 1) + 1;
            this.preferences.edit().putInt(SESSION_ID, i10).apply();
            if (sessionIncrementAction != null) {
                sessionIncrementAction.invoke(String.valueOf(i10));
            }
        }
        setLastSessionAccess(System.currentTimeMillis());
        return this.preferences.getInt(SESSION_ID, 1);
    }

    public final int resetSession$library_release(Function1<? super String, Unit> sessionIncrementAction) {
        this.preferences.edit().putInt(SESSION_ID, 1).apply();
        if (sessionIncrementAction == null) {
            return 1;
        }
        sessionIncrementAction.invoke(String.valueOf(1));
        return 1;
    }

    public final void setApiKey(String value) {
        Intrinsics.j(value, "value");
        this.preferences.edit().putString(PREF_API_KEY, value).apply();
    }

    public final void setDefaultItemSection(String value) {
        Intrinsics.j(value, "value");
        this.preferences.edit().putString(PREF_DEFAULT_ITEM_SECTION, value).apply();
    }

    public final void setGroupsShownForFirstTerm(int i10) {
        this.preferences.edit().putInt(PREF_GROUPS_SHOWN_FOR_FIRST_TERM, i10).apply();
    }

    public final void setId(String value) {
        Intrinsics.j(value, "value");
        this.preferences.edit().putString(PREF_ID, value).apply();
    }

    public final void setLastSessionAccess(long j10) {
        this.preferences.edit().putLong(SESSION_LAST_ACCESS, j10).apply();
    }

    public final void setPort(int i10) {
        this.preferences.edit().putInt(PREF_SERVICE_PORT, i10).apply();
    }

    public final void setQuizzesServiceUrl(String str) {
        this.preferences.edit().putString(PREF_QUIZZES_SERVICE_URL, str).apply();
    }

    public final void setScheme(String str) {
        this.preferences.edit().putString(PREF_SERVICE_SCHEME, str).apply();
    }

    public final void setServiceUrl(String str) {
        this.preferences.edit().putString(PREF_SERVICE_URL, str).apply();
    }

    public final void setSessionId(int sessionId) {
        this.preferences.edit().putInt(SESSION_ID, sessionId).apply();
    }
}
