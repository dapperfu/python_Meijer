package Pc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC8981of0;
import com.google.android.gms.internal.ads.C7162Sd0;
import com.google.android.gms.internal.ads.C7196Td0;
import com.google.android.gms.internal.ads.C7200Tf0;
import com.google.android.gms.internal.ads.C7230Ud0;
import com.google.android.gms.internal.ads.C8659lf;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Pc.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4564e {
    public static void c(Context context) throws IOException {
        if (((Boolean) Mc.A.c().a(C8659lf.f76270b6)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            C7162Sd0 c7162Sd0K = C7162Sd0.k(context);
            C7196Td0 c7196Td0J = C7196Td0.j(context);
            C7230Ud0 c7230Ud0A = C7230Ud0.a(context);
            c7162Sd0K.l();
            c7162Sd0K.m();
            c7196Td0J.k();
            c7230Ud0A.b(null);
        } catch (IOException e10) {
            Lc.v.s().x(e10, "clearStorageOnIdlessMode");
        }
        try {
            if (context.getSharedPreferences("query_info_shared_prefs", 0).edit().clear().commit()) {
            } else {
                throw new IOException("Failed to remove query_info_shared_prefs");
            }
        } catch (IOException e11) {
            Lc.v.s().x(e11, "clearStorageOnIdlessMode_scar");
        }
    }

    public static Bundle a(Context context, String str, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        if (TextUtils.isEmpty(str)) {
            return Bundle.EMPTY;
        }
        PreferenceManager.getDefaultSharedPreferences(context).registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        return b(context, str);
    }

    public static Bundle b(Context context, String str) {
        JSONArray jSONArray;
        int i10;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e10) {
                Qc.p.c("JSON parsing error", e10);
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            if (iOptInt != 0) {
                if (iOptInt != 1) {
                    if (iOptInt != 2) {
                        i10 = 0;
                    } else {
                        i10 = 3;
                    }
                } else {
                    i10 = 2;
                }
            } else {
                i10 = 1;
            }
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i10 != 0) {
                List listF = C7200Tf0.b(AbstractC8981of0.b('/')).f(strOptString2);
                if (listF.size() > 2 || listF.isEmpty()) {
                    obj = null;
                } else {
                    if (listF.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listF.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listF.get(0), 0);
                        str2 = (String) listF.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i12 = i10 - 1;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }
}
