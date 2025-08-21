package com.bugsnag.android;

import R6.ImmutableConfig;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\b\u0080\b\u0018\u0000 $2\u00020\u0001:\u0001\u0012B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u000eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b \u0010#¨\u0006%"}, d2 = {"Lcom/bugsnag/android/c0;", "", "", "apiKey", "uuid", "", "timestamp", "suffix", "", "Lcom/bugsnag/android/ErrorType;", "errorTypes", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/Set;)V", "b", "()Ljava/lang/String;", "", "e", "()Z", "a", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "getUuid", "J", "getTimestamp", "()J", "d", "getSuffix", "Ljava/util/Set;", "()Ljava/util/Set;", "f", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.c0, reason: case insensitive filesystem and from toString */
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

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJI\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u001d\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0017H\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b$\u0010%J!\u0010'\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00012\b\u0010&\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010*¨\u0006,"}, d2 = {"Lcom/bugsnag/android/c0$a;", "", "<init>", "()V", "", "apiKey", "uuid", "", "timestamp", "suffix", "", "Lcom/bugsnag/android/ErrorType;", "errorTypes", "j", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/Set;)Ljava/lang/String;", "obj", "LR6/k;", "config", "", "isLaunching", "Lcom/bugsnag/android/c0;", "g", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;JLR6/k;Ljava/lang/Boolean;)Lcom/bugsnag/android/c0;", "Ljava/io/File;", "file", "i", "(Ljava/io/File;LR6/k;)Lcom/bugsnag/android/c0;", "a", "(Ljava/io/File;LR6/k;)Ljava/lang/String;", "eventFile", "c", "(Ljava/io/File;)Ljava/util/Set;", "e", "(Ljava/io/File;)Ljava/lang/String;", "f", "(Ljava/io/File;)J", "b", "(Ljava/lang/Object;)Ljava/util/Set;", "launching", "d", "(Ljava/lang/Object;Ljava/lang/Boolean;)Ljava/lang/String;", "NON_JVM_CRASH", "Ljava/lang/String;", "STARTUP_CRASH", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.c0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ EventFilenameInfo h(Companion companion, Object obj, String str, String str2, long j10, ImmutableConfig immutableConfig, Boolean bool, int i10, Object obj2) {
            if ((i10 & 2) != 0) {
                str = UUID.randomUUID().toString();
            }
            String str3 = str;
            if ((i10 & 8) != 0) {
                j10 = System.currentTimeMillis();
            }
            return companion.g(obj, str3, str2, j10, immutableConfig, (i10 & 32) != 0 ? null : bool);
        }

        public final Set<ErrorType> b(Object obj) {
            return obj instanceof C6585b0 ? ((C6585b0) obj).f().h() : SetsKt.d(ErrorType.C);
        }

        public final String d(Object obj, Boolean launching) {
            return (((obj instanceof C6585b0) && Intrinsics.e(((C6585b0) obj).d().getIsLaunching(), Boolean.TRUE)) || Intrinsics.e(launching, Boolean.TRUE)) ? "startupcrash" : "";
        }

        @JvmStatic
        @JvmOverloads
        public final EventFilenameInfo g(Object obj, String uuid, String apiKey, long timestamp, ImmutableConfig config, Boolean isLaunching) {
            if (obj instanceof C6585b0) {
                apiKey = ((C6585b0) obj).c();
            } else if (apiKey == null || apiKey.length() == 0) {
                apiKey = config.getApiKey();
            }
            return new EventFilenameInfo(apiKey, uuid, timestamp, d(obj, isLaunching), b(obj));
        }

        @JvmStatic
        public final EventFilenameInfo i(File file, ImmutableConfig config) {
            return new EventFilenameInfo(a(file, config), "", f(file), e(file), c(file));
        }

        public final String j(String apiKey, String uuid, long timestamp, String suffix, Set<? extends ErrorType> errorTypes) {
            return timestamp + '_' + apiKey + '_' + J.b(errorTypes) + '_' + uuid + '_' + suffix + ".json";
        }

        public final String a(File file, ImmutableConfig config) {
            String strSubstring;
            String strM0 = StringsKt.M0(file.getName(), "_startupcrash.json");
            int iQ0 = StringsKt.q0(strM0, "_", 0, false, 6, null) + 1;
            int iQ02 = StringsKt.q0(strM0, "_", iQ0, false, 4, null);
            if (iQ0 != 0 && iQ02 != -1 && iQ02 > iQ0) {
                strSubstring = strM0.substring(iQ0, iQ02);
                Intrinsics.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                strSubstring = null;
            }
            if (strSubstring == null) {
                return config.getApiKey();
            }
            return strSubstring;
        }

        public final Set<ErrorType> c(File eventFile) {
            String name = eventFile.getName();
            int iX0 = StringsKt.x0(name, "_", StringsKt.x0(name, "_", 0, false, 6, null) - 1, false, 4, null);
            int iX02 = StringsKt.x0(name, "_", iX0 - 1, false, 4, null) + 1;
            if (iX02 < iX0) {
                String strSubstring = name.substring(iX02, iX0);
                Intrinsics.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                List listB1 = StringsKt.b1(strSubstring, new String[]{","}, false, 0, 6, null);
                ErrorType[] errorTypeArrValues = ErrorType.values();
                ArrayList arrayList = new ArrayList();
                int length = errorTypeArrValues.length;
                int i10 = 0;
                while (i10 < length) {
                    ErrorType errorType = errorTypeArrValues[i10];
                    i10++;
                    if (listB1.contains(errorType.getDesc())) {
                        arrayList.add(errorType);
                    }
                }
                return CollectionsKt.o1(arrayList);
            }
            return SetsKt.e();
        }

        public final String e(File eventFile) {
            String strP = FilesKt.p(eventFile);
            boolean zE = true;
            String strSubstring = strP.substring(StringsKt.x0(strP, "_", 0, false, 6, null) + 1);
            Intrinsics.i(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (!Intrinsics.e(strSubstring, "startupcrash")) {
                zE = Intrinsics.e(strSubstring, "not-jvm");
            }
            if (zE) {
                return strSubstring;
            }
            return "";
        }

        @JvmStatic
        public final long f(File eventFile) {
            Long lX = StringsKt.x(StringsKt.u1(FilesKt.p(eventFile), "_", "-1"));
            if (lX == null) {
                return -1L;
            }
            return lX.longValue();
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
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
        return (((((((this.apiKey.hashCode() * 31) + this.uuid.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + this.suffix.hashCode()) * 31) + this.errorTypes.hashCode();
    }

    public String toString() {
        return "EventFilenameInfo(apiKey=" + this.apiKey + ", uuid=" + this.uuid + ", timestamp=" + this.timestamp + ", suffix=" + this.suffix + ", errorTypes=" + this.errorTypes + ')';
    }

    public final String b() {
        return INSTANCE.j(this.apiKey, this.uuid, this.timestamp, this.suffix, this.errorTypes);
    }

    public final String c() {
        return this.apiKey;
    }

    public final Set<ErrorType> d() {
        return this.errorTypes;
    }

    public final boolean e() {
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
