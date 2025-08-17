package okhttp3;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lokhttp3/l;", "", "", "javaName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "f", "g", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: c, reason: collision with root package name */
    public static final l f154422c = new l("TLS_1_3", 0, "TLSv1.3");

    /* renamed from: d, reason: collision with root package name */
    public static final l f154423d = new l("TLS_1_2", 1, "TLSv1.2");

    /* renamed from: e, reason: collision with root package name */
    public static final l f154424e = new l("TLS_1_1", 2, "TLSv1.1");

    /* renamed from: f, reason: collision with root package name */
    public static final l f154425f = new l("TLS_1_0", 3, "TLSv1");

    /* renamed from: g, reason: collision with root package name */
    public static final l f154426g = new l("SSL_3_0", 4, "SSLv3");

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ l[] f154427h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f154428i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String javaName;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lokhttp3/l$a;", "", "<init>", "()V", "", "javaName", "Lokhttp3/l;", "a", "(Ljava/lang/String;)Lokhttp3/l;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: okhttp3.l$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @JvmStatic
        public final l a(String javaName) {
            Intrinsics.j(javaName, "javaName");
            int iHashCode = javaName.hashCode();
            if (iHashCode != 79201641) {
                if (iHashCode != 79923350) {
                    switch (iHashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return l.f154424e;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return l.f154423d;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return l.f154422c;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return l.f154425f;
                }
            } else if (javaName.equals("SSLv3")) {
                return l.f154426g;
            }
            throw new IllegalArgumentException("Unexpected TLS version: " + javaName);
        }
    }

    private static final /* synthetic */ l[] a() {
        return new l[]{f154422c, f154423d, f154424e, f154425f, f154426g};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f154427h.clone();
    }

    static {
        l[] lVarArrA = a();
        f154427h = lVarArrA;
        f154428i = EnumEntriesKt.a(lVarArrA);
        INSTANCE = new Companion(null);
    }

    @JvmName
    /* renamed from: b, reason: from getter */
    public final String getJavaName() {
        return this.javaName;
    }

    private l(String str, int i10, String str2) {
        this.javaName = str2;
    }
}
