package com.bugsnag.android;

import Q6.ImmutableConfig;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/bugsnag/android/L0;", "", "", "apiKey", "", "timestamp", "uuid", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "b", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getApiKey", "setApiKey", "(Ljava/lang/String;)V", "J", "getTimestamp", "()J", "c", "getUuid", "d", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.L0, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class SessionFilenameInfo {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String apiKey;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uuid;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/bugsnag/android/L0$a;", "", "<init>", "()V", "", "apiKey", "", "timestamp", "uuid", "f", "(Ljava/lang/String;JLjava/lang/String;)Ljava/lang/String;", "obj", "LQ6/f;", "config", "Lcom/bugsnag/android/L0;", "a", "(Ljava/lang/Object;LQ6/f;)Lcom/bugsnag/android/L0;", "Ljava/io/File;", "file", "d", "(Ljava/io/File;)Ljava/lang/String;", "c", "(Ljava/io/File;)J", "defaultApiKey", "b", "(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;", "", "e", "(Ljava/io/File;)Z", "", "uuidLength", "I", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.bugsnag.android.L0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final SessionFilenameInfo a(Object obj, ImmutableConfig config) {
            String strB = obj instanceof K0 ? ((K0) obj).b() : config.getApiKey();
            Intrinsics.f(strB, "when (obj) {\n           …nfig.apiKey\n            }");
            long jCurrentTimeMillis = System.currentTimeMillis();
            String string = UUID.randomUUID().toString();
            Intrinsics.f(string, "UUID.randomUUID().toString()");
            return new SessionFilenameInfo(strB, jCurrentTimeMillis, string);
        }

        @JvmStatic
        public final String b(File file, String defaultApiKey) {
            if (file != null && e(file)) {
                String name = file.getName();
                Intrinsics.f(name, "file.name");
                String strR1 = StringsKt.r1(name, '_', null, 2, null);
                String str = strR1.length() != 0 ? strR1 : null;
                if (str != null) {
                    return str;
                }
            }
            return defaultApiKey;
        }

        public final String f(String apiKey, long timestamp, String uuid) {
            return apiKey + '_' + uuid + timestamp + "_v3.json";
        }

        @JvmStatic
        public final long c(File file) {
            String fileName = file.getName();
            if (e(file)) {
                String name = file.getName();
                Intrinsics.f(name, "file.name");
                fileName = StringsKt.j1(name, '_', null, 2, null);
            }
            Intrinsics.f(fileName, "fileName");
            Long lX = StringsKt.x(StringsKt.r1(StringsKt.E1(fileName, d(file).length()), '_', null, 2, null));
            if (lX != null) {
                return lX.longValue();
            }
            return -1L;
        }

        @JvmStatic
        public final String d(File file) {
            String strJ1;
            String name = file.getName();
            String str = null;
            if (e(file)) {
                String name2 = file.getName();
                Intrinsics.f(name2, "file.name");
                name = StringsKt.j1(name2, '_', null, 2, null);
            }
            if (name.length() >= 36) {
                str = name;
            }
            if (str != null && (strJ1 = StringsKt.J1(str, 36)) != null) {
                return strJ1;
            }
            return "";
        }

        public final boolean e(File file) {
            String name = file.getName();
            Intrinsics.f(name, "file.name");
            return StringsKt.G(name, "_v3.json", false, 2, null);
        }
    }

    @JvmStatic
    public static final String c(File file, String str) {
        return INSTANCE.b(file, str);
    }

    @JvmStatic
    public static final long d(File file) {
        return INSTANCE.c(file);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionFilenameInfo)) {
            return false;
        }
        SessionFilenameInfo sessionFilenameInfo = (SessionFilenameInfo) other;
        return Intrinsics.e(this.apiKey, sessionFilenameInfo.apiKey) && this.timestamp == sessionFilenameInfo.timestamp && Intrinsics.e(this.uuid, sessionFilenameInfo.uuid);
    }

    public int hashCode() {
        String str = this.apiKey;
        int iHashCode = str != null ? str.hashCode() : 0;
        long j10 = this.timestamp;
        int i10 = ((iHashCode * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str2 = this.uuid;
        return i10 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SessionFilenameInfo(apiKey=" + this.apiKey + ", timestamp=" + this.timestamp + ", uuid=" + this.uuid + ")";
    }

    @JvmStatic
    public static final SessionFilenameInfo a(Object obj, ImmutableConfig fVar) {
        return INSTANCE.a(obj, fVar);
    }

    public final String b() {
        return INSTANCE.f(this.apiKey, this.timestamp, this.uuid);
    }

    public SessionFilenameInfo(String str, long j10, String str2) {
        this.apiKey = str;
        this.timestamp = j10;
        this.uuid = str2;
    }
}
