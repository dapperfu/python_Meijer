package com.bugsnag.android;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\u0006J\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u0006J\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/bugsnag/android/D0;", "", "", "msg", "", "e", "(Ljava/lang/String;)V", "", "throwable", "c", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "g", "b", "f", "d", "a", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public interface D0 {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public static void a(D0 d02, String str) {
        }

        public static void b(D0 d02, String str, Throwable th2) {
        }

        public static void c(D0 d02, String str) {
        }

        public static void d(D0 d02, String str, Throwable th2) {
        }

        public static void e(D0 d02, String str) {
        }

        public static void f(D0 d02, String str) {
        }

        public static void g(D0 d02, String str, Throwable th2) {
        }
    }

    void a(String msg, Throwable throwable);

    void b(String msg, Throwable throwable);

    void c(String msg, Throwable throwable);

    void d(String msg);

    void e(String msg);

    void f(String msg);

    void g(String msg);
}
