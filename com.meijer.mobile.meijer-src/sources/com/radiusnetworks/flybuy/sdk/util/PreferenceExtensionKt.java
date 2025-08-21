package com.radiusnetworks.flybuy.sdk.util;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.reflect.a;
import com.radiusnetworks.flybuy.sdk.data.push.FlybuyPushTopic;
import j$.time.Clock;
import j$.time.Instant;
import j$.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\u0005\u001a#\u0010\u000e\u001a\u00020\b*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0013\u001a\u00020\u0010*\u00020\u0000H\u0001¢\u0006\u0004\b\u0013\u0010\u0012\u001a\u001b\u0010\u0014\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0005\u001a\u001b\u0010\u0017\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u0015*\u00020\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001b\u0010\u001c\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u001c\u0010\u0018\u001a\u0013\u0010\u001d\u001a\u00020\u0015*\u00020\u0000H\u0000¢\u0006\u0004\b\u001d\u0010\u001a\u001a#\u0010!\u001a\u00020\u0003*\u00020\u00002\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e*\u00020\u0000H\u0000¢\u0006\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010&\"\u0014\u0010'\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010&\"\u0014\u0010(\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010&\"\u0014\u0010)\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010&\"\u0014\u0010*\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010&\"\u0014\u0010+\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010&\"\u0014\u0010,\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010&\"\u0014\u0010-\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010&\"\u0014\u0010.\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010&¨\u0006/"}, d2 = {"Landroid/content/Context;", "", "time", "", "setLastConfigSyncTime", "(Landroid/content/Context;J)V", "j$/time/Clock", "clock", "", "needConfigSync", "(Landroid/content/Context;Lj$/time/Clock;)Z", "intervalSeconds", "setConfigMinRequestInterval", "lastCacheTime", "shouldRequestConfig", "(Landroid/content/Context;JLj$/time/Clock;)Z", "Ljava/util/UUID;", "generateAppInstanceId", "(Landroid/content/Context;)Ljava/util/UUID;", "getAppInstanceId", "setLastAppInstancePatchTime", "", "pushToken", "savePushToken", "(Landroid/content/Context;Ljava/lang/String;)V", "getStoredPushToken", "(Landroid/content/Context;)Ljava/lang/String;", "timeZone", "saveTimeZone", "getStoredTimeZone", "", "Lcom/radiusnetworks/flybuy/sdk/data/push/FlybuyPushTopic;", "topics", "setSubscribedPushTopics", "(Landroid/content/Context;Ljava/util/Set;)V", "getSubscribedPushTopics", "(Landroid/content/Context;)Ljava/util/Set;", PreferenceExtensionKt.FLYBUY_CORE_PREFS, "Ljava/lang/String;", "FLYBUY_CORE_TRANSIENT_PREFS", PreferenceExtensionKt.FLYBUY_CONFIG_LAST_SYNC, PreferenceExtensionKt.FLYBUY_CONFIG_MIN_REQUEST_INTERVAL_SECONDS, PreferenceExtensionKt.FLYBUY_APP_INSTANCE_ID, PreferenceExtensionKt.FLYBUY_APP_INSTANCE_LAST_PATCH, PreferenceExtensionKt.FLYBUY_PUSH_TOKEN, PreferenceExtensionKt.FLYBUY_TIMEZONE, PreferenceExtensionKt.FLYBUY_PUSH_TOPICS, "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PreferenceExtensionKt {
    private static final String FLYBUY_APP_INSTANCE_ID = "FLYBUY_APP_INSTANCE_ID";
    private static final String FLYBUY_APP_INSTANCE_LAST_PATCH = "FLYBUY_APP_INSTANCE_LAST_PATCH";
    private static final String FLYBUY_CONFIG_LAST_SYNC = "FLYBUY_CONFIG_LAST_SYNC";
    private static final String FLYBUY_CONFIG_MIN_REQUEST_INTERVAL_SECONDS = "FLYBUY_CONFIG_MIN_REQUEST_INTERVAL_SECONDS";
    private static final String FLYBUY_CORE_PREFS = "FLYBUY_CORE_PREFS";
    private static final String FLYBUY_CORE_TRANSIENT_PREFS = "com.radiusnetworks.flybuy.core.FLYBUY_CORE_TRANSIENT_PREFS";
    private static final String FLYBUY_PUSH_TOKEN = "FLYBUY_PUSH_TOKEN";
    private static final String FLYBUY_PUSH_TOPICS = "FLYBUY_PUSH_TOPICS";
    private static final String FLYBUY_TIMEZONE = "FLYBUY_TIMEZONE";

    public static final UUID generateAppInstanceId(Context context) {
        Intrinsics.j(context, "<this>");
        UUID uuidRandomUUID = UUID.randomUUID();
        synchronized (FLYBUY_APP_INSTANCE_ID) {
            context.getSharedPreferences(FLYBUY_CORE_TRANSIENT_PREFS, 0).edit().putString(FLYBUY_APP_INSTANCE_ID, uuidRandomUUID.toString()).apply();
            Unit unit = Unit.f143329a;
        }
        Intrinsics.g(uuidRandomUUID);
        return uuidRandomUUID;
    }

    @Keep
    public static final UUID getAppInstanceId(Context context) {
        Intrinsics.j(context, "<this>");
        synchronized (FLYBUY_APP_INSTANCE_ID) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences(FLYBUY_CORE_PREFS, 0);
                SharedPreferences sharedPreferences2 = context.getSharedPreferences(FLYBUY_CORE_TRANSIENT_PREFS, 0);
                String string = sharedPreferences.getString(FLYBUY_APP_INSTANCE_ID, "");
                if (string == null) {
                    string = "";
                }
                Intrinsics.g(string);
                if (string.length() > 0) {
                    sharedPreferences.edit().remove(FLYBUY_APP_INSTANCE_ID).apply();
                    sharedPreferences2.edit().putString(FLYBUY_APP_INSTANCE_ID, string).apply();
                } else {
                    String string2 = sharedPreferences2.getString(FLYBUY_APP_INSTANCE_ID, "");
                    if (string2 == null) {
                        string2 = "";
                    } else {
                        Intrinsics.g(string2);
                    }
                    string = string2;
                }
                if (string.length() == 0) {
                    return generateAppInstanceId(context);
                }
                UUID uuidFromString = UUID.fromString(string);
                Intrinsics.i(uuidFromString, "fromString(...)");
                return uuidFromString;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final String getStoredPushToken(Context context) {
        String string;
        Intrinsics.j(context, "<this>");
        synchronized (FLYBUY_PUSH_TOKEN) {
            string = context.getSharedPreferences(FLYBUY_CORE_PREFS, 0).getString(FLYBUY_PUSH_TOKEN, "");
            if (string == null) {
                string = "";
            }
        }
        return string;
    }

    public static final String getStoredTimeZone(Context context) {
        String string;
        Intrinsics.j(context, "<this>");
        synchronized (FLYBUY_TIMEZONE) {
            string = context.getSharedPreferences(FLYBUY_CORE_PREFS, 0).getString(FLYBUY_TIMEZONE, "");
            if (string == null) {
                string = "";
            }
        }
        return string;
    }

    public static final Set<FlybuyPushTopic> getSubscribedPushTopics(Context context) {
        Set<FlybuyPushTopic> set;
        Intrinsics.j(context, "<this>");
        synchronized (FLYBUY_PUSH_TOKEN) {
            try {
                Object objP = new Gson().p(context.getSharedPreferences(FLYBUY_CORE_PREFS, 0).getString(FLYBUY_PUSH_TOPICS, ""), new a<Set<? extends FlybuyPushTopic>>() { // from class: com.radiusnetworks.flybuy.sdk.util.PreferenceExtensionKt$getSubscribedPushTopics$1$1
                }.getType());
                Intrinsics.h(objP, "null cannot be cast to non-null type kotlin.collections.Set<com.radiusnetworks.flybuy.sdk.data.push.FlybuyPushTopic>");
                set = (Set) objP;
            } catch (Exception unused) {
                set = null;
            }
        }
        return set;
    }

    public static final boolean needConfigSync(Context context, Clock clock) {
        Intrinsics.j(context, "<this>");
        Intrinsics.j(clock, "clock");
        Instant instantOfEpochMilli = Instant.ofEpochMilli(context.getSharedPreferences(FLYBUY_CORE_PREFS, 0).getLong(FLYBUY_CONFIG_LAST_SYNC, 0L));
        if (LocalDateTime.now(clock).isAfter(LocalDateTime.ofInstant(instantOfEpochMilli, clock.getZone()))) {
            Intrinsics.g(instantOfEpochMilli);
            if (!CalendarExtensionKt.isToday(instantOfEpochMilli, clock)) {
                return true;
            }
        }
        return false;
    }

    public static final void savePushToken(Context context, String pushToken) {
        Intrinsics.j(context, "<this>");
        Intrinsics.j(pushToken, "pushToken");
        synchronized (FLYBUY_PUSH_TOKEN) {
            context.getSharedPreferences(FLYBUY_CORE_PREFS, 0).edit().putString(FLYBUY_PUSH_TOKEN, pushToken).commit();
        }
    }

    public static final void saveTimeZone(Context context, String timeZone) {
        Intrinsics.j(context, "<this>");
        Intrinsics.j(timeZone, "timeZone");
        synchronized (FLYBUY_TIMEZONE) {
            context.getSharedPreferences(FLYBUY_CORE_PREFS, 0).edit().putString(FLYBUY_TIMEZONE, timeZone).commit();
        }
    }

    public static final void setConfigMinRequestInterval(Context context, long j10) {
        Intrinsics.j(context, "<this>");
        context.getSharedPreferences(FLYBUY_CORE_PREFS, 0).edit().putLong(FLYBUY_CONFIG_MIN_REQUEST_INTERVAL_SECONDS, j10).apply();
    }

    public static final void setLastAppInstancePatchTime(Context context, long j10) {
        Intrinsics.j(context, "<this>");
        context.getSharedPreferences(FLYBUY_CORE_TRANSIENT_PREFS, 0).edit().putLong(FLYBUY_APP_INSTANCE_LAST_PATCH, j10).apply();
    }

    public static final void setLastConfigSyncTime(Context context, long j10) {
        Intrinsics.j(context, "<this>");
        context.getSharedPreferences(FLYBUY_CORE_PREFS, 0).edit().putLong(FLYBUY_CONFIG_LAST_SYNC, j10).apply();
    }

    public static final void setSubscribedPushTopics(Context context, Set<FlybuyPushTopic> set) {
        Intrinsics.j(context, "<this>");
        synchronized (FLYBUY_PUSH_TOPICS) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences(FLYBUY_CORE_PREFS, 0);
                if (set == null) {
                    sharedPreferences.edit().remove(FLYBUY_PUSH_TOPICS).commit();
                } else {
                    sharedPreferences.edit().putString(FLYBUY_PUSH_TOPICS, new Gson().x(set)).commit();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final boolean shouldRequestConfig(Context context, long j10, Clock clock) {
        Intrinsics.j(context, "<this>");
        Intrinsics.j(clock, "clock");
        long j11 = context.getSharedPreferences(FLYBUY_CORE_PREFS, 0).getLong(FLYBUY_CONFIG_MIN_REQUEST_INTERVAL_SECONDS, 0L);
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j10);
        if (Instant.now(clock).toEpochMilli() - j10 > 1000 * j11) {
            Intrinsics.g(instantOfEpochMilli);
            if (!CalendarExtensionKt.isToday(instantOfEpochMilli, clock)) {
                return true;
            }
        }
        return false;
    }
}
