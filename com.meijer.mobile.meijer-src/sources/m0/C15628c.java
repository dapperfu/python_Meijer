package m0;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Lm0/c;", "", "", "packedValue", "b", "(J)J", "", "f", "(J)Ljava/lang/String;", "", "e", "(J)I", "other", "", "c", "(JLjava/lang/Object;)Z", "a", "J", "d", "currentLineSpan", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* renamed from: m0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15628c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    public static long b(long j10) {
        return j10;
    }

    public static final int d(long j10) {
        return (int) j10;
    }

    public static final /* synthetic */ C15628c a(long j10) {
        return new C15628c(j10);
    }

    public static boolean c(long j10, Object obj) {
        return (obj instanceof C15628c) && j10 == ((C15628c) obj).getPackedValue();
    }

    public static String f(long j10) {
        return "GridItemSpan(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return c(this.packedValue, obj);
    }

    /* renamed from: g, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return e(this.packedValue);
    }

    public String toString() {
        return f(this.packedValue);
    }

    private /* synthetic */ C15628c(long j10) {
        this.packedValue = j10;
    }

    public static int e(long j10) {
        return Long.hashCode(j10);
    }
}
