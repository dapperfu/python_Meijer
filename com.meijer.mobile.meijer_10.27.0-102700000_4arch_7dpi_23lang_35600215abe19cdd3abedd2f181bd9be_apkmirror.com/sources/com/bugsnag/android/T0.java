package com.bugsnag.android;

import io.constructor.data.local.PreferencesHelper;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0013\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0013\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lcom/bugsnag/android/T0;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "Lcom/bugsnag/android/T0$h;", "Lcom/bugsnag/android/T0$g;", "Lcom/bugsnag/android/T0$c;", "Lcom/bugsnag/android/T0$e;", "Lcom/bugsnag/android/T0$f;", "Lcom/bugsnag/android/T0$a;", "Lcom/bugsnag/android/T0$i;", "Lcom/bugsnag/android/T0$j;", "Lcom/bugsnag/android/T0$k;", "Lcom/bugsnag/android/T0$l;", "Lcom/bugsnag/android/T0$m;", "Lcom/bugsnag/android/T0$n;", "Lcom/bugsnag/android/T0$p;", "Lcom/bugsnag/android/T0$o;", "Lcom/bugsnag/android/T0$r;", "Lcom/bugsnag/android/T0$s;", "Lcom/bugsnag/android/T0$q;", "Lcom/bugsnag/android/T0$b;", "Lcom/bugsnag/android/T0$d;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public abstract class T0 {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/bugsnag/android/T0$a;", "Lcom/bugsnag/android/T0;", "", "message", "Lcom/bugsnag/android/BreadcrumbType;", "type", "timestamp", "", "", "metadata", "<init>", "(Ljava/lang/String;Lcom/bugsnag/android/BreadcrumbType;Ljava/lang/String;Ljava/util/Map;)V", "a", "Ljava/lang/String;", "b", "Lcom/bugsnag/android/BreadcrumbType;", "c", "d", "Ljava/util/Map;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class a extends T0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String message;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final BreadcrumbType type;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String timestamp;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final Map<String, Object> metadata;

        public a(String str, BreadcrumbType breadcrumbType, String str2, Map<String, Object> map) {
            super(null);
            this.message = str;
            this.type = breadcrumbType;
            this.timestamp = str2;
            this.metadata = map;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/bugsnag/android/T0$b;", "Lcom/bugsnag/android/T0;", "", "name", "variant", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class b extends T0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String name;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String variant;

        public b(String str, String str2) {
            super(null);
            this.name = str;
            this.variant = str2;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/bugsnag/android/T0$c;", "Lcom/bugsnag/android/T0;", "", "section", "key", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "Ljava/lang/String;", "b", "c", "Ljava/lang/Object;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class c extends T0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String section;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String key;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final Object value;

        public c(String str, String str2, Object obj) {
            super(null);
            this.section = str;
            this.key = str2;
            this.value = obj;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/bugsnag/android/T0$d;", "Lcom/bugsnag/android/T0;", "", "a", "Ljava/lang/String;", "name", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class d extends T0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String name;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/T0$e;", "Lcom/bugsnag/android/T0;", "", "section", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class e extends T0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String section;

        public e(String str) {
            super(null);
            this.section = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/bugsnag/android/T0$f;", "Lcom/bugsnag/android/T0;", "", "section", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class f extends T0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String section;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String key;

        public f(String str, String str2) {
            super(null);
            this.section = str;
            this.key = str2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bugsnag/android/T0$g;", "Lcom/bugsnag/android/T0;", "<init>", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class g extends T0 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f63242a = new g();

        private g() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/bugsnag/android/T0$h;", "Lcom/bugsnag/android/T0;", "", "apiKey", "", "autoDetectNdkCrashes", "appVersion", "buildUuid", "releaseStage", "lastRunInfoPath", "", "consecutiveLaunchCrashes", "Lcom/bugsnag/android/b1;", "sendThreads", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/bugsnag/android/b1;)V", "a", "Ljava/lang/String;", "b", "Z", "c", "d", "e", "f", "g", "I", "h", "Lcom/bugsnag/android/b1;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class h extends T0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String apiKey;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final boolean autoDetectNdkCrashes;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String appVersion;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String buildUuid;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String releaseStage;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String lastRunInfoPath;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final int consecutiveLaunchCrashes;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final b1 sendThreads;

        public h(String str, boolean z10, String str2, String str3, String str4, String str5, int i10, b1 b1Var) {
            super(null);
            this.apiKey = str;
            this.autoDetectNdkCrashes = z10;
            this.appVersion = str2;
            this.buildUuid = str3;
            this.releaseStage = str4;
            this.lastRunInfoPath = str5;
            this.consecutiveLaunchCrashes = i10;
            this.sendThreads = b1Var;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bugsnag/android/T0$i;", "Lcom/bugsnag/android/T0;", "<init>", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class i extends T0 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f63251a = new i();

        private i() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bugsnag/android/T0$j;", "Lcom/bugsnag/android/T0;", "<init>", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class j extends T0 {

        /* renamed from: a, reason: collision with root package name */
        public static final j f63252a = new j();

        private j() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bugsnag/android/T0$k;", "Lcom/bugsnag/android/T0;", "<init>", "()V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class k extends T0 {

        /* renamed from: a, reason: collision with root package name */
        public static final k f63253a = new k();

        private k() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\n\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/bugsnag/android/T0$l;", "Lcom/bugsnag/android/T0;", "", PreferencesHelper.PREF_ID, "startedAt", "", "handledCount", "unhandledCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "a", "Ljava/lang/String;", "b", "c", "I", "d", "()I", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class l extends T0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String startedAt;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final int handledCount;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int unhandledCount;

        public l(String str, String str2, int i10, int i11) {
            super(null);
            this.id = str;
            this.startedAt = str2;
            this.handledCount = i10;
            this.unhandledCount = i11;
        }

        /* renamed from: a, reason: from getter */
        public final int getUnhandledCount() {
            return this.unhandledCount;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/T0$m;", "Lcom/bugsnag/android/T0;", "", "context", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class m extends T0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String context;

        public m(String str) {
            super(null);
            this.context = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/bugsnag/android/T0$n;", "Lcom/bugsnag/android/T0;", "", "inForeground", "", "contextActivity", "<init>", "(ZLjava/lang/String;)V", "a", "Z", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class n extends T0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final boolean inForeground;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String contextActivity;

        public n(boolean z10, String str) {
            super(null);
            this.inForeground = z10;
            this.contextActivity = str;
        }

        /* renamed from: a, reason: from getter */
        public final String getContextActivity() {
            return this.contextActivity;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/T0$o;", "Lcom/bugsnag/android/T0;", "", "isLaunching", "<init>", "(Z)V", "a", "Z", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class o extends T0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final boolean isLaunching;

        public o(boolean z10) {
            super(null);
            this.isLaunching = z10;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/bugsnag/android/T0$p;", "Lcom/bugsnag/android/T0;", "", "a", "I", "consecutiveLaunchCrashes", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class p extends T0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final int consecutiveLaunchCrashes;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/bugsnag/android/T0$q;", "Lcom/bugsnag/android/T0;", "", "isLowMemory", "", "memoryTrimLevel", "", "memoryTrimLevelDescription", "<init>", "(ZLjava/lang/Integer;Ljava/lang/String;)V", "a", "Z", "b", "Ljava/lang/Integer;", "c", "Ljava/lang/String;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class q extends T0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final boolean isLowMemory;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final Integer memoryTrimLevel;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String memoryTrimLevelDescription;

        public q(boolean z10, Integer num, String str) {
            super(null);
            this.isLowMemory = z10;
            this.memoryTrimLevel = num;
            this.memoryTrimLevelDescription = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/T0$r;", "Lcom/bugsnag/android/T0;", "", "orientation", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class r extends T0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final String orientation;

        public r(String str) {
            super(null);
            this.orientation = str;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/T0$s;", "Lcom/bugsnag/android/T0;", "Lcom/bugsnag/android/h1;", "user", "<init>", "(Lcom/bugsnag/android/h1;)V", "a", "Lcom/bugsnag/android/h1;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class s extends T0 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final h1 user;

        public s(h1 h1Var) {
            super(null);
            this.user = h1Var;
        }
    }

    private T0() {
    }

    public /* synthetic */ T0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
