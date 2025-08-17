package com.bugsnag.android;

import Q6.ImmutableConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0080\b\u0018\u0000 $2\u00020\u0001:\u0001\rB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u000eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/bugsnag/android/W;", "", "", "apiKey", "uuid", "", "timestamp", "suffix", "", "Lcom/bugsnag/android/ErrorType;", "errorTypes", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/Set;)V", "a", "()Ljava/lang/String;", "", "g", "()Z", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "getUuid", "c", "J", "getTimestamp", "()J", "d", "getSuffix", "Ljava/util/Set;", "f", "()Ljava/util/Set;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.W, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class EventFilenameInfo {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String apiKey;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String uuid;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long timestamp;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String suffix;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<ErrorType> errorTypes;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJI\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001d\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0017H\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b$\u0010%J!\u0010'\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00012\b\u0010&\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010*¨\u0006,"}, d2 = {"Lcom/bugsnag/android/W$a;", "", "<init>", "()V", "", "apiKey", "uuid", "", "timestamp", "suffix", "", "Lcom/bugsnag/android/ErrorType;", "errorTypes", "j", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/Set;)Ljava/lang/String;", "obj", "LQ6/f;", "config", "", "isLaunching", "Lcom/bugsnag/android/W;", "g", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;JLQ6/f;Ljava/lang/Boolean;)Lcom/bugsnag/android/W;", "Ljava/io/File;", "file", "i", "(Ljava/io/File;LQ6/f;)Lcom/bugsnag/android/W;", "a", "(Ljava/io/File;LQ6/f;)Ljava/lang/String;", "eventFile", "c", "(Ljava/io/File;)Ljava/util/Set;", "e", "(Ljava/io/File;)Ljava/lang/String;", "f", "(Ljava/io/File;)J", "b", "(Ljava/lang/Object;)Ljava/util/Set;", "launching", "d", "(Ljava/lang/Object;Ljava/lang/Boolean;)Ljava/lang/String;", "NON_JVM_CRASH", "Ljava/lang/String;", "STARTUP_CRASH", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.bugsnag.android.W$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ EventFilenameInfo h(Companion companion, Object obj, String str, String str2, long j10, ImmutableConfig immutableConfig, Boolean bool, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                str = UUID.randomUUID().toString();
                Intrinsics.f(str, "UUID.randomUUID().toString()");
            }
            String str3 = str;
            if ((i10 & 8) != 0) {
                j10 = System.currentTimeMillis();
            }
            return companion.g(obj, str3, str2, j10, immutableConfig, (i10 & 32) != 0 ? null : bool);
        }

        public final Set<ErrorType> b(Object obj) {
            return obj instanceof V ? ((V) obj).f().g() : SetsKt.d(ErrorType.C);
        }

        public final String d(Object obj, Boolean launching) {
            return (((obj instanceof V) && Intrinsics.e(((V) obj).d().getIsLaunching(), Boolean.TRUE)) || Intrinsics.e(launching, Boolean.TRUE)) ? "startupcrash" : "";
        }

        @JvmStatic
        @JvmOverloads
        public final EventFilenameInfo g(Object obj, String uuid, String apiKey, long timestamp, ImmutableConfig config, Boolean isLaunching) {
            if (obj instanceof V) {
                apiKey = ((V) obj).c();
            } else if (apiKey == null || apiKey.length() == 0) {
                apiKey = config.getApiKey();
            }
            String str = apiKey;
            Intrinsics.f(str, "when {\n                o…e -> apiKey\n            }");
            return new EventFilenameInfo(str, uuid, timestamp, d(obj, isLaunching), b(obj));
        }

        @JvmStatic
        public final EventFilenameInfo i(File file, ImmutableConfig config) {
            return new EventFilenameInfo(a(file, config), "", f(file), e(file), c(file));
        }

        public final String j(String apiKey, String uuid, long timestamp, String suffix, Set<? extends ErrorType> errorTypes) {
            return timestamp + '_' + apiKey + '_' + F.c(errorTypes) + '_' + uuid + '_' + suffix + ".json";
        }

        public final String a(File file, ImmutableConfig config) {
            String strSubstring;
            String name = file.getName();
            Intrinsics.f(name, "file.name");
            String strL0 = StringsKt.L0(name, "_startupcrash.json");
            int iP0 = StringsKt.p0(strL0, "_", 0, false, 6, null) + 1;
            int iP02 = StringsKt.p0(strL0, "_", iP0, false, 4, null);
            if (iP0 != 0 && iP02 != -1 && iP02 > iP0) {
                if (strL0 != null) {
                    strSubstring = strL0.substring(iP0, iP02);
                    Intrinsics.i(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                strSubstring = null;
            }
            if (strSubstring != null) {
                return strSubstring;
            }
            return config.getApiKey();
        }

        public final Set<ErrorType> c(File eventFile) {
            String name = eventFile.getName();
            Intrinsics.f(name, "name");
            int iW0 = StringsKt.w0(name, "_", StringsKt.w0(name, "_", 0, false, 6, null) - 1, false, 4, null);
            int iW02 = StringsKt.w0(name, "_", iW0 - 1, false, 4, null) + 1;
            if (iW02 < iW0) {
                String strSubstring = name.substring(iW02, iW0);
                Intrinsics.i(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                List listA1 = StringsKt.a1(strSubstring, new String[]{","}, false, 0, 6, null);
                ErrorType[] errorTypeArrValues = ErrorType.values();
                ArrayList arrayList = new ArrayList();
                for (ErrorType errorType : errorTypeArrValues) {
                    if (listA1.contains(errorType.getDesc())) {
                        arrayList.add(errorType);
                    }
                }
                return CollectionsKt.o1(arrayList);
            }
            return SetsKt.e();
        }

        public final String e(File eventFile) {
            String strP = FilesKt.p(eventFile);
            int iW0 = StringsKt.w0(strP, "_", 0, false, 6, null) + 1;
            if (strP != null) {
                String strSubstring = strP.substring(iW0);
                Intrinsics.i(strSubstring, "(this as java.lang.String).substring(startIndex)");
                int iHashCode = strSubstring.hashCode();
                if (iHashCode != -2033965238) {
                    if (iHashCode != 2127567527 || !strSubstring.equals("not-jvm")) {
                        return "";
                    }
                } else if (!strSubstring.equals("startupcrash")) {
                    return "";
                }
                return strSubstring;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }

        @JvmStatic
        public final long f(File eventFile) {
            Long lX = StringsKt.x(StringsKt.q1(FilesKt.p(eventFile), "_", "-1"));
            if (lX != null) {
                return lX.longValue();
            }
            return -1L;
        }
    }

    @JvmStatic
    public static final long b(File file) {
        return INSTANCE.f(file);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventFilenameInfo)) {
            return false;
        }
        EventFilenameInfo eventFilenameInfo = (EventFilenameInfo) other;
        return Intrinsics.e(this.apiKey, eventFilenameInfo.apiKey) && Intrinsics.e(this.uuid, eventFilenameInfo.uuid) && this.timestamp == eventFilenameInfo.timestamp && Intrinsics.e(this.suffix, eventFilenameInfo.suffix) && Intrinsics.e(this.errorTypes, eventFilenameInfo.errorTypes);
    }

    public int hashCode() {
        String str = this.apiKey;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.uuid;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        long j10 = this.timestamp;
        int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        String str3 = this.suffix;
        int iHashCode3 = (i10 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Set<ErrorType> set = this.errorTypes;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "EventFilenameInfo(apiKey=" + this.apiKey + ", uuid=" + this.uuid + ", timestamp=" + this.timestamp + ", suffix=" + this.suffix + ", errorTypes=" + this.errorTypes + ")";
    }

    @JvmStatic
    @JvmOverloads
    public static final EventFilenameInfo c(Object obj, String str, ImmutableConfig immutableConfig) {
        return Companion.h(INSTANCE, obj, null, str, 0L, immutableConfig, null, 42, null);
    }

    @JvmStatic
    public static final EventFilenameInfo d(File file, ImmutableConfig immutableConfig) {
        return INSTANCE.i(file, immutableConfig);
    }

    public final String a() {
        return INSTANCE.j(this.apiKey, this.uuid, this.timestamp, this.suffix, this.errorTypes);
    }

    /* renamed from: e, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    public final Set<ErrorType> f() {
        return this.errorTypes;
    }

    public final boolean g() {
        return Intrinsics.e(this.suffix, "startupcrash");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventFilenameInfo(String str, String str2, long j10, String str3, Set<? extends ErrorType> set) {
        this.apiKey = str;
        this.uuid = str2;
        this.timestamp = j10;
        this.suffix = str3;
        this.errorTypes = set;
    }
}
