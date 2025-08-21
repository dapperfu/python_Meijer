package I7;

import A7.ServerDataUpdate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"LI7/d;", "", "<init>", "()V", "b", "c", "a", "d", "LI7/d$a;", "LI7/d$b;", "LI7/d$c;", "LI7/d$d;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class d {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"LI7/d$a;", "LI7/d;", "", "retryReason", "LA7/c;", "serverDataUpdate", "<init>", "(Ljava/lang/String;LA7/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LA7/c;", "()LA7/c;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: I7.d$a, reason: from toString */
    public static final /* data */ class Retry extends d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String retryReason;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ServerDataUpdate serverDataUpdate;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Retry)) {
                return false;
            }
            Retry retry = (Retry) other;
            return Intrinsics.e(this.retryReason, retry.retryReason) && Intrinsics.e(this.serverDataUpdate, retry.serverDataUpdate);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Retry(String retryReason, ServerDataUpdate serverDataUpdate) {
            super(null);
            Intrinsics.j(retryReason, "retryReason");
            this.retryReason = retryReason;
            this.serverDataUpdate = serverDataUpdate;
        }

        /* renamed from: a, reason: from getter */
        public final String getRetryReason() {
            return this.retryReason;
        }

        /* renamed from: b, reason: from getter */
        public final ServerDataUpdate getServerDataUpdate() {
            return this.serverDataUpdate;
        }

        public int hashCode() {
            int iHashCode = this.retryReason.hashCode() * 31;
            ServerDataUpdate serverDataUpdate = this.serverDataUpdate;
            return iHashCode + (serverDataUpdate == null ? 0 : serverDataUpdate.hashCode());
        }

        public String toString() {
            return "Retry(retryReason=" + this.retryReason + ", serverDataUpdate=" + this.serverDataUpdate + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LI7/d$b;", "LI7/d;", "LA7/c;", "serverDataUpdate", "<init>", "(LA7/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LA7/c;", "()LA7/c;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: I7.d$b, reason: from toString */
    public static final /* data */ class Success extends d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ServerDataUpdate serverDataUpdate;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.e(this.serverDataUpdate, ((Success) other).serverDataUpdate);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(ServerDataUpdate serverDataUpdate) {
            super(null);
            Intrinsics.j(serverDataUpdate, "serverDataUpdate");
            this.serverDataUpdate = serverDataUpdate;
        }

        /* renamed from: a, reason: from getter */
        public final ServerDataUpdate getServerDataUpdate() {
            return this.serverDataUpdate;
        }

        public int hashCode() {
            return this.serverDataUpdate.hashCode();
        }

        public String toString() {
            return "Success(serverDataUpdate=" + this.serverDataUpdate + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LI7/d$c;", "LI7/d;", "Lkotlin/time/Duration;", "delay", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: I7.d$c, reason: from toString */
    public static final /* data */ class TooManyRequests extends d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final long delay;

        public /* synthetic */ TooManyRequests(long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TooManyRequests) && Duration.z(this.delay, ((TooManyRequests) other).delay);
        }

        private TooManyRequests(long j10) {
            super(null);
            this.delay = j10;
        }

        /* renamed from: a, reason: from getter */
        public final long getDelay() {
            return this.delay;
        }

        public int hashCode() {
            return Duration.O(this.delay);
        }

        public String toString() {
            return "TooManyRequests(delay=" + ((Object) Duration.a0(this.delay)) + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LI7/d$d;", "LI7/d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: I7.d$d, reason: collision with other inner class name */
    public static final /* data */ class C0229d extends d {

        /* renamed from: a, reason: collision with root package name */
        public static final C0229d f14374a = new C0229d();

        private C0229d() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C0229d);
        }

        public String toString() {
            return "UnexpectedError";
        }

        public int hashCode() {
            return 1881588853;
        }
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private d() {
    }
}
