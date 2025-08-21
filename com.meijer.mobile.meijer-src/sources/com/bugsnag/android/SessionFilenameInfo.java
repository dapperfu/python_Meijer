package com.bugsnag.android;

import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/bugsnag/android/W0;", "", "", "apiKey", "", "timestamp", "uuid", "<init>", "(Ljava/lang/String;JLjava/lang/String;)V", "a", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getApiKey", "setApiKey", "(Ljava/lang/String;)V", "b", "J", "getTimestamp", "()J", "c", "getUuid", "d", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.W0, reason: from toString */
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

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/bugsnag/android/W0$a;", "", "<init>", "()V", "", "apiKey", "", "timestamp", "uuid", "f", "(Ljava/lang/String;JLjava/lang/String;)Ljava/lang/String;", "obj", "Lcom/bugsnag/android/W0;", "a", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/bugsnag/android/W0;", "Ljava/io/File;", "file", "d", "(Ljava/io/File;)Ljava/lang/String;", "c", "(Ljava/io/File;)J", "defaultApiKey", "b", "(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;", "", "e", "(Ljava/io/File;)Z", "", "uuidLength", "I", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.W0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SessionFilenameInfo a(Object obj, String apiKey) {
            if (obj instanceof V0) {
                apiKey = ((V0) obj).c();
            }
            return new SessionFilenameInfo(apiKey, System.currentTimeMillis(), UUID.randomUUID().toString());
        }

        @JvmStatic
        public final String b(File file, String defaultApiKey) {
            if (file != null && e(file)) {
                String strV1 = StringsKt.v1(file.getName(), '_', null, 2, null);
                String str = strV1.length() != 0 ? strV1 : null;
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
            String name = file.getName();
            if (e(file)) {
                name = StringsKt.n1(file.getName(), '_', null, 2, null);
            }
            Long lX = StringsKt.x(StringsKt.v1(StringsKt.I1(name, d(file).length()), '_', null, 2, null));
            if (lX == null) {
                return -1L;
            }
            return lX.longValue();
        }

        @JvmStatic
        public final String d(File file) {
            String strN1;
            String name = file.getName();
            String str = null;
            if (e(file)) {
                name = StringsKt.n1(file.getName(), '_', null, 2, null);
            }
            if (name.length() >= 36) {
                str = name;
            }
            if (str == null || (strN1 = StringsKt.N1(str, 36)) == null) {
                return "";
            }
            return strN1;
        }

        public final boolean e(File file) {
            return StringsKt.G(file.getName(), "_v3.json", false, 2, null);
        }
    }

    @JvmStatic
    public static final String b(File file, String str) {
        return INSTANCE.b(file, str);
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
        return (((this.apiKey.hashCode() * 31) + Long.hashCode(this.timestamp)) * 31) + this.uuid.hashCode();
    }

    public String toString() {
        return "SessionFilenameInfo(apiKey=" + this.apiKey + ", timestamp=" + this.timestamp + ", uuid=" + this.uuid + ')';
    }

    public final String a() {
        return INSTANCE.f(this.apiKey, this.timestamp, this.uuid);
    }

    public SessionFilenameInfo(String str, long j10, String str2) {
        this.apiKey = str;
        this.timestamp = j10;
        this.uuid = str2;
    }
}
