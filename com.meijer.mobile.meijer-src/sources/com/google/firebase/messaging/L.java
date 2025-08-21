package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.fullstory.FS;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes8.dex */
public class L {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f89653a;

    private static boolean s(String str) {
        return str.startsWith("google.c.a.") || str.equals("from");
    }

    public static boolean t(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString(v("gcm.n.e")));
    }

    private static boolean u(String str) {
        return str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.");
    }

    private static String v(String str) {
        return !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
    }

    private String w(String str) {
        if (!this.f89653a.containsKey(str) && str.startsWith("gcm.n.")) {
            String strV = v(str);
            if (this.f89653a.containsKey(strV)) {
                return strV;
            }
        }
        return str;
    }

    private static String z(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    int[] e() throws JSONException {
        JSONArray jSONArrayC = c("gcm.n.light_settings");
        if (jSONArrayC == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayC.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            iArr[0] = d(jSONArrayC.optString(0));
            iArr[1] = jSONArrayC.optInt(1);
            iArr[2] = jSONArrayC.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e10) {
            FS.log_w("NotificationParams", "LightSettings is invalid: " + jSONArrayC + ". " + e10.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            FS.log_w("NotificationParams", "LightSettings is invalid: " + jSONArrayC + ". Skipping setting LightSettings");
            return null;
        }
    }

    public Uri f() {
        String strP = p("gcm.n.link_android");
        if (TextUtils.isEmpty(strP)) {
            strP = p("gcm.n.link");
        }
        if (TextUtils.isEmpty(strP)) {
            return null;
        }
        return Uri.parse(strP);
    }

    public Object[] g(String str) {
        JSONArray jSONArrayC = c(str + "_loc_args");
        if (jSONArrayC == null) {
            return null;
        }
        int length = jSONArrayC.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = jSONArrayC.optString(i10);
        }
        return strArr;
    }

    public String h(String str) {
        return p(str + "_loc_key");
    }

    public String k() {
        return p("gcm.n.android_channel_id");
    }

    Integer l() {
        Integer numB = b("gcm.n.notification_count");
        if (numB == null) {
            return null;
        }
        if (numB.intValue() >= 0) {
            return numB;
        }
        FS.log_w("FirebaseMessaging", "notificationCount is invalid: " + numB + ". Skipping setting notificationCount.");
        return null;
    }

    Integer m() {
        Integer numB = b("gcm.n.notification_priority");
        if (numB == null) {
            return null;
        }
        if (numB.intValue() >= -2 && numB.intValue() <= 2) {
            return numB;
        }
        FS.log_w("FirebaseMessaging", "notificationPriority is invalid " + numB + ". Skipping setting notificationPriority.");
        return null;
    }

    public String o() {
        String strP = p("gcm.n.sound2");
        return TextUtils.isEmpty(strP) ? p("gcm.n.sound") : strP;
    }

    public String p(String str) {
        return this.f89653a.getString(w(str));
    }

    public long[] q() throws JSONException {
        JSONArray jSONArrayC = c("gcm.n.vibrate_timings");
        if (jSONArrayC == null) {
            return null;
        }
        try {
            if (jSONArrayC.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayC.length();
            long[] jArr = new long[length];
            for (int i10 = 0; i10 < length; i10++) {
                jArr[i10] = jSONArrayC.optLong(i10);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            FS.log_w("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayC + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    Integer r() {
        Integer numB = b("gcm.n.visibility");
        if (numB == null) {
            return null;
        }
        if (numB.intValue() >= -1 && numB.intValue() <= 1) {
            return numB;
        }
        FS.log_w("NotificationParams", "visibility is invalid: " + numB + ". Skipping setting visibility.");
        return null;
    }

    public Bundle x() {
        Bundle bundle = new Bundle(this.f89653a);
        for (String str : this.f89653a.keySet()) {
            if (!s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public Bundle y() {
        Bundle bundle = new Bundle(this.f89653a);
        for (String str : this.f89653a.keySet()) {
            if (u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public L(Bundle bundle) {
        if (bundle != null) {
            this.f89653a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    private static int d(String str) {
        int color = Color.parseColor(str);
        if (color != -16777216) {
            return color;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    public boolean a(String str) {
        String strP = p(str);
        if (!"1".equals(strP) && !Boolean.parseBoolean(strP)) {
            return false;
        }
        return true;
    }

    public Integer b(String str) {
        String strP = p(str);
        if (!TextUtils.isEmpty(strP)) {
            try {
                return Integer.valueOf(Integer.parseInt(strP));
            } catch (NumberFormatException unused) {
                FS.log_w("NotificationParams", "Couldn't parse value of " + z(str) + "(" + strP + ") into an int");
                return null;
            }
        }
        return null;
    }

    public JSONArray c(String str) {
        String strP = p(str);
        if (!TextUtils.isEmpty(strP)) {
            try {
                return new JSONArray(strP);
            } catch (JSONException unused) {
                FS.log_w("NotificationParams", "Malformed JSON for key " + z(str) + ": " + strP + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public String i(Resources resources, String str, String str2) {
        String strH = h(str2);
        if (TextUtils.isEmpty(strH)) {
            return null;
        }
        int identifier = resources.getIdentifier(strH, "string", str);
        if (identifier == 0) {
            FS.log_w("NotificationParams", z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] objArrG = g(str2);
        if (objArrG == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrG);
        } catch (MissingFormatArgumentException e10) {
            FS.log_w("NotificationParams", "Missing format argument for " + z(str2) + ": " + Arrays.toString(objArrG) + " Default value will be used.", e10);
            return null;
        }
    }

    public Long j(String str) {
        String strP = p(str);
        if (!TextUtils.isEmpty(strP)) {
            try {
                return Long.valueOf(Long.parseLong(strP));
            } catch (NumberFormatException unused) {
                FS.log_w("NotificationParams", "Couldn't parse value of " + z(str) + "(" + strP + ") into a long");
                return null;
            }
        }
        return null;
    }

    public String n(Resources resources, String str, String str2) {
        String strP = p(str2);
        if (!TextUtils.isEmpty(strP)) {
            return strP;
        }
        return i(resources, str, str2);
    }
}
