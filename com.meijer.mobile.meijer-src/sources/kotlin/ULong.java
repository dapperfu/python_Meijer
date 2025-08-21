package kotlin;

import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SinceKotlin
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087@\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Lkotlin/ULong;", "", "", "data", "b", "(J)J", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "o", "(J)Ljava/lang/String;", "a", "J", "getData$annotations", "()V", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
@WasExperimental
/* loaded from: classes4.dex */
public final class ULong implements Comparable<ULong> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long data;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0010\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlin/ULong$Companion;", "", "<init>", "()V", "MIN_VALUE", "Lkotlin/ULong;", "J", "MAX_VALUE", "SIZE_BYTES", "", "SIZE_BITS", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ ULong a(long j10) {
        return new ULong(j10);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    public static long b(long j10) {
        return j10;
    }

    public static boolean e(long j10, Object obj) {
        return (obj instanceof ULong) && j10 == ((ULong) obj).getData();
    }

    public static final boolean l(long j10, long j11) {
        return j10 == j11;
    }

    public static int m(long j10) {
        return Long.hashCode(j10);
    }

    public boolean equals(Object other) {
        return e(this.data, other);
    }

    public int hashCode() {
        return m(this.data);
    }

    /* renamed from: p, reason: from getter */
    public final /* synthetic */ long getData() {
        return this.data;
    }

    public static String o(long j10) {
        return UnsignedKt.d(j10, 10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(ULong uLong) {
        return UnsignedKt.b(getData(), uLong.getData());
    }

    public String toString() {
        return o(this.data);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ ULong(long j10) {
        this.data = j10;
    }
}
