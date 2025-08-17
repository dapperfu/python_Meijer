package com.medallia.digital.mobilesdk;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f93643a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final String f93644b = "medallia_df_session_id";

    /* renamed from: c, reason: collision with root package name */
    private static final String f93645c = "com.google.firebase.crashlytics.FirebaseCrashlytics";

    public static final class a {
        private a() {
        }

        @JvmStatic
        public final void a(String sessionId) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            String str;
            String str2;
            Intrinsics.j(sessionId, "sessionId");
            try {
                Object objInvoke = com.google.firebase.crashlytics.a.class.getMethod("getInstance", null).invoke(null, null);
                if (objInvoke != null) {
                    a4.b("Trying to inject custom key: medallia_df_session_id with value: " + sessionId);
                    com.google.firebase.crashlytics.a.class.getMethod("setCustomKey", String.class, String.class).invoke(objInvoke, z0.f93644b, sessionId);
                    str2 = "Successfully injected custom key: medallia_df_session_id with value: " + sessionId;
                } else {
                    str2 = "Crashlytics instance was null. Skipping medallia_df_session_id custom key injection";
                }
                a4.b(str2);
            } catch (ClassNotFoundException unused) {
                str = "Crashlytics was not detected. Skipping medallia_df_session_id custom key injection";
                a4.b(str);
            } catch (Exception e10) {
                str = "medallia_df_session_id custom key injection failed. Error message: " + e10.getMessage();
                a4.b(str);
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @JvmStatic
    public static final void a(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        f93643a.a(str);
    }
}
