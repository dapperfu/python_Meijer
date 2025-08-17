package Vv;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\n\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018À\u0006\u0003"}, d2 = {"LVv/v;", "", "", "isCanceled", "()Z", "LVv/v$b;", "d", "()LVv/v$b;", "LVv/p;", "failedConnection", "b", "(LVv/p;)Z", "Lokhttp3/HttpUrl;", "url", "f", "(Lokhttp3/HttpUrl;)Z", "Lokhttp3/a;", "a", "()Lokhttp3/a;", PlaceTypes.ADDRESS, "Lkotlin/collections/ArrayDeque;", "c", "()Lkotlin/collections/ArrayDeque;", "deferredPlans", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface v {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0019\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u0011\u0010\u001e\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"LVv/v$a;", "", "LVv/v$b;", "plan", "nextPlan", "", "throwable", "<init>", "(LVv/v$b;LVv/v$b;Ljava/lang/Throwable;)V", "a", "()LVv/v$b;", "b", "()Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LVv/v$b;", "d", "c", "Ljava/lang/Throwable;", "e", "f", "()Z", "isSuccess", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* renamed from: Vv.v$a, reason: from toString */
    public static final /* data */ class ConnectResult {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b plan;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b nextPlan;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Throwable throwable;

        public ConnectResult(b plan, b bVar, Throwable th2) {
            Intrinsics.j(plan, "plan");
            this.plan = plan;
            this.nextPlan = bVar;
            this.throwable = th2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConnectResult)) {
                return false;
            }
            ConnectResult connectResult = (ConnectResult) other;
            return Intrinsics.e(this.plan, connectResult.plan) && Intrinsics.e(this.nextPlan, connectResult.nextPlan) && Intrinsics.e(this.throwable, connectResult.throwable);
        }

        /* renamed from: a, reason: from getter */
        public final b getNextPlan() {
            return this.nextPlan;
        }

        /* renamed from: b, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final b c() {
            return this.nextPlan;
        }

        /* renamed from: d, reason: from getter */
        public final b getPlan() {
            return this.plan;
        }

        public final Throwable e() {
            return this.throwable;
        }

        public final boolean f() {
            return this.nextPlan == null && this.throwable == null;
        }

        public int hashCode() {
            int iHashCode = this.plan.hashCode() * 31;
            b bVar = this.nextPlan;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Throwable th2 = this.throwable;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        public String toString() {
            return "ConnectResult(plan=" + this.plan + ", nextPlan=" + this.nextPlan + ", throwable=" + this.throwable + ')';
        }

        public /* synthetic */ ConnectResult(b bVar, b bVar2, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i10 & 2) != 0 ? null : bVar2, (i10 & 4) != 0 ? null : th2);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u0000H&¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012À\u0006\u0003"}, d2 = {"LVv/v$b;", "", "LVv/v$a;", "h", "()LVv/v$a;", "e", "LVv/p;", "c", "()LVv/p;", "", "cancel", "()V", "g", "()LVv/v$b;", "", "b", "()Z", "isReady", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        boolean b();

        p c();

        void cancel();

        ConnectResult e();

        b g();

        ConnectResult h();
    }

    okhttp3.a a();

    boolean b(p failedConnection);

    ArrayDeque<b> c();

    b d() throws IOException;

    boolean f(HttpUrl url);

    boolean isCanceled();

    static /* synthetic */ boolean e(v vVar, p pVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasNext");
        }
        if ((i10 & 1) != 0) {
            pVar = null;
        }
        return vVar.b(pVar);
    }
}
