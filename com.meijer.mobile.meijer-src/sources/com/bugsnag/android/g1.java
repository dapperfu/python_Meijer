package com.bugsnag.android;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
class g1 {

    /* renamed from: a, reason: collision with root package name */
    @SuppressLint({"UseSparseArrays"})
    private static final Map<Integer, String> f64237a;

    static {
        HashMap map = new HashMap();
        f64237a = map;
        map.put(1, "DiskWrite");
        map.put(2, "DiskRead");
        map.put(4, "NetworkOperation");
        map.put(8, "CustomSlowCall");
        map.put(16, "ResourceMismatch");
        map.put(256, "CursorLeak");
        map.put(512, "CloseableLeak");
        map.put(1024, "ActivityLeak");
        map.put(Integer.valueOf(RecyclerView.m.FLAG_MOVED), "InstanceLeak");
        map.put(Integer.valueOf(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT), "RegistrationLeak");
        map.put(8192, "FileUriLeak");
        map.put(16384, "CleartextNetwork");
    }

    g1() {
    }

    private Throwable a(Throwable th2) {
        return o1.a(th2).get(r2.size() - 1);
    }

    String b(String str) throws NumberFormatException {
        if (!TextUtils.isEmpty(str)) {
            int iLastIndexOf = str.lastIndexOf("violation=");
            if (iLastIndexOf != -1) {
                String strReplace = str.substring(iLastIndexOf).replace("violation=", "");
                if (TextUtils.isDigitsOnly(strReplace)) {
                    return f64237a.get(Integer.valueOf(strReplace));
                }
                return null;
            }
            return null;
        }
        throw new IllegalArgumentException();
    }

    boolean c(Throwable th2) {
        return a(th2).getClass().getName().toLowerCase(Locale.US).startsWith("android.os.strictmode");
    }
}
