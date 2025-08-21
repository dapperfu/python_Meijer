package com.bugsnag.android;

import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ7\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001a\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/bugsnag/android/E0;", "", "<init>", "()V", "Lcom/bugsnag/android/x;", "config", "Landroid/os/Bundle;", "data", "", "f", "(Lcom/bugsnag/android/x;Landroid/os/Bundle;)V", "g", "e", "", "key", "", "default", "b", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", "Ljava/util/regex/Pattern;", "a", "Landroid/content/Context;", "ctx", "userSuppliedApiKey", "c", "(Landroid/content/Context;Ljava/lang/String;)Lcom/bugsnag/android/x;", "d", "(Landroid/os/Bundle;Ljava/lang/String;)Lcom/bugsnag/android/x;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class E0 {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "a", "(Ljava/lang/String;)Ljava/util/regex/Pattern;"}, k = 3, mv = {1, 5, 1})
    static final class b extends Lambda implements Function1<String, Pattern> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f63904f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pattern invoke(String str) {
            return Pattern.compile(str);
        }
    }

    private final void e(C6627x config, Bundle data) {
        config.d0(data.getString("com.bugsnag.android.RELEASE_STAGE", config.A()));
        config.L(data.getString("com.bugsnag.android.APP_VERSION", config.c()));
        config.K(data.getString("com.bugsnag.android.APP_TYPE", config.b()));
        if (data.containsKey("com.bugsnag.android.VERSION_CODE")) {
            config.h0(Integer.valueOf(data.getInt("com.bugsnag.android.VERSION_CODE")));
        }
        if (data.containsKey("com.bugsnag.android.ENABLED_RELEASE_STAGES")) {
            config.R(b(data, "com.bugsnag.android.ENABLED_RELEASE_STAGES", config.k()));
        }
        Set<Pattern> setA = a(data, "com.bugsnag.android.DISCARD_CLASSES", config.h());
        if (setA == null) {
            setA = SetsKt.e();
        }
        config.Q(setA);
        Set<String> setB = b(data, "com.bugsnag.android.PROJECT_PACKAGES", SetsKt.e());
        if (setB == null) {
            setB = SetsKt.e();
        }
        config.b0(setB);
        Set<Pattern> setA2 = a(data, "com.bugsnag.android.REDACTED_KEYS", config.z());
        if (setA2 == null) {
            setA2 = SetsKt.e();
        }
        config.c0(setA2);
    }

    private final void f(C6627x config, Bundle data) {
        config.O(data.getBoolean("com.bugsnag.android.AUTO_TRACK_SESSIONS", config.e()));
        config.N(data.getBoolean("com.bugsnag.android.AUTO_DETECT_ERRORS", config.d()));
        config.a0(data.getBoolean("com.bugsnag.android.PERSIST_USER", config.v()));
        config.T(data.getBoolean("com.bugsnag.android.GENERATE_ANONYMOUS_ID", config.m()));
        String string = data.getString("com.bugsnag.android.SEND_THREADS");
        if (string != null) {
            config.f0(m1.INSTANCE.a(string));
        }
    }

    private final void g(C6627x config, Bundle data) {
        if (data.containsKey("com.bugsnag.android.ENDPOINT_NOTIFY")) {
            config.S(new X(data.getString("com.bugsnag.android.ENDPOINT_NOTIFY", config.l().getNotify()), data.getString("com.bugsnag.android.ENDPOINT_SESSIONS", config.l().getSessions())));
        }
    }

    public final C6627x d(Bundle data, String userSuppliedApiKey) {
        if (userSuppliedApiKey == null) {
            userSuppliedApiKey = data == null ? null : data.getString("com.bugsnag.android.API_KEY");
        }
        if (userSuppliedApiKey == null) {
            throw new IllegalArgumentException("No Bugsnag API key set");
        }
        C6627x c6627x = new C6627x(userSuppliedApiKey);
        if (data != null) {
            f(c6627x, data);
            g(c6627x, data);
            e(c6627x, data);
            c6627x.W(data.getInt("com.bugsnag.android.MAX_BREADCRUMBS", c6627x.p()));
            c6627x.X(data.getInt("com.bugsnag.android.MAX_PERSISTED_EVENTS", c6627x.q()));
            c6627x.Y(data.getInt("com.bugsnag.android.MAX_PERSISTED_SESSIONS", c6627x.r()));
            c6627x.Z(data.getInt("com.bugsnag.android.MAX_REPORTED_THREADS", c6627x.s()));
            c6627x.g0(data.getLong("com.bugsnag.android.THREAD_COLLECTION_TIME_LIMIT_MS", c6627x.E()));
            c6627x.U(data.getInt("com.bugsnag.android.LAUNCH_DURATION_MILLIS", (int) c6627x.n()));
            c6627x.e0(data.getBoolean("com.bugsnag.android.SEND_LAUNCH_CRASHES_SYNCHRONOUSLY", c6627x.B()));
            c6627x.M(data.getBoolean("com.bugsnag.android.ATTEMPT_DELIVERY_ON_CRASH", c6627x.H()));
        }
        return c6627x;
    }

    private final Set<Pattern> a(Bundle data, String key, Set<Pattern> set) {
        String string = data.getString(key);
        if (string == null) {
            return set;
        }
        return SequencesKt.Z(SequencesKt.M(StringsKt.d1(string, new char[]{','}, false, 0, 6, null), b.f63904f));
    }

    private final Set<String> b(Bundle data, String key, Set<String> set) {
        List listB1;
        String string = data.getString(key);
        if (string == null) {
            listB1 = null;
        } else {
            listB1 = StringsKt.b1(string, new String[]{","}, false, 0, 6, null);
        }
        if (listB1 == null) {
            return set;
        }
        return CollectionsKt.o1(listB1);
    }

    public final C6627x c(Context ctx, String userSuppliedApiKey) {
        try {
            return d(ctx.getPackageManager().getApplicationInfo(ctx.getPackageName(), 128).metaData, userSuppliedApiKey);
        } catch (Exception e10) {
            throw new IllegalStateException("Bugsnag is unable to read config from manifest.", e10);
        }
    }
}
