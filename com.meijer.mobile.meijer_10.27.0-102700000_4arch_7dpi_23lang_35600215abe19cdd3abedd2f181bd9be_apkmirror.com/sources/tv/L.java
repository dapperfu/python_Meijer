package tv;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltv/L;", "", "Ltv/P;", "", "subscriptionCount", "Ltv/f;", "Ltv/J;", "a", "(Ltv/P;)Ltv/f;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface L {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f162138a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"Ltv/L$a;", "", "<init>", "()V", "", "stopTimeoutMillis", "replayExpirationMillis", "Ltv/L;", "a", "(JJ)Ltv/L;", "b", "Ltv/L;", "c", "()Ltv/L;", "Eagerly", "d", "Lazily", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tv.L$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f162138a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final L Eagerly = new M();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final L Lazily = new N();

        public static /* synthetic */ L b(Companion companion, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            if ((i10 & 2) != 0) {
                j11 = Long.MAX_VALUE;
            }
            return companion.a(j10, j11);
        }

        public final L a(long stopTimeoutMillis, long replayExpirationMillis) {
            return new O(stopTimeoutMillis, replayExpirationMillis);
        }

        public final L c() {
            return Eagerly;
        }

        public final L d() {
            return Lazily;
        }

        private Companion() {
        }
    }

    InterfaceC17152f<J> a(P<Integer> subscriptionCount);
}
