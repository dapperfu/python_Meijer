package com.google.firebase.messaging;

import Z.C5503a;
import android.os.Bundle;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.messaging.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C11334e {

    /* renamed from: a, reason: collision with root package name */
    public static final long f88912a = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: com.google.firebase.messaging.e$a */
    public static final class a {
        public static C5503a<String, String> a(Bundle bundle) {
            C5503a<String, String> c5503a = new C5503a<>();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        c5503a.put(str, str2);
                    }
                }
            }
            return c5503a;
        }
    }
}
