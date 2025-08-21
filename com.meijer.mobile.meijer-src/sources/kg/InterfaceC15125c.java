package kg;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0005\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkg/c;", "", "Lkg/c$b;", "sessionDetails", "", "a", "(Lkg/c$b;)V", "", "b", "()Z", "isDataCollectionEnabled", "Lkg/c$a;", "c", "()Lkg/c$a;", "sessionSubscriberName", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: kg.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC15125c {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkg/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kg.c$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f141840a = new a("CRASHLYTICS", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f141841b = new a("PERFORMANCE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f141842c = new a("MATT_SAYS_HI", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ a[] f141843d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f141844e;

        static {
            a[] aVarArrA = a();
            f141843d = aVarArrA;
            f141844e = EnumEntriesKt.a(aVarArrA);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f141840a, f141841b, f141842c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f141843d.clone();
        }

        private a(String str, int i10) {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lkg/c$b;", "", "", "sessionId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: kg.c$b, reason: from toString */
    public static final /* data */ class SessionDetails {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionId;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SessionDetails) && Intrinsics.e(this.sessionId, ((SessionDetails) other).sessionId);
        }

        public SessionDetails(String sessionId) {
            Intrinsics.j(sessionId, "sessionId");
            this.sessionId = sessionId;
        }

        /* renamed from: a, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            return this.sessionId.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.sessionId + ')';
        }
    }

    void a(SessionDetails sessionDetails);

    boolean b();

    a c();
}
