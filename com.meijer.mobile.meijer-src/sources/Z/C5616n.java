package Z;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000f\u0088\u0001\b\u0092\u0001\u00020\u0007¨\u0006\u0018"}, d2 = {"LZ/n;", "", "", "first", "second", "b", "(II)J", "", "packedValue", "c", "(J)J", "", "h", "(J)Ljava/lang/String;", "g", "(J)I", "other", "", "d", "(JLjava/lang/Object;)Z", "a", "J", "e", "f", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* renamed from: Z.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5616n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final long packedValue;

    public static long b(int i10, int i11) {
        return c((i11 & 4294967295L) | (i10 << 32));
    }

    public static long c(long j10) {
        return j10;
    }

    public static final /* synthetic */ C5616n a(long j10) {
        return new C5616n(j10);
    }

    public static boolean d(long j10, Object obj) {
        return (obj instanceof C5616n) && j10 == ((C5616n) obj).getPackedValue();
    }

    public static final int e(long j10) {
        return (int) (j10 >> 32);
    }

    public static String h(long j10) {
        return '(' + e(j10) + ", " + f(j10) + ')';
    }

    public boolean equals(Object obj) {
        return d(this.packedValue, obj);
    }

    public int hashCode() {
        return g(this.packedValue);
    }

    /* renamed from: i, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public String toString() {
        return h(this.packedValue);
    }

    private /* synthetic */ C5616n(long j10) {
        this.packedValue = j10;
    }

    public static int g(long j10) {
        return Long.hashCode(j10);
    }

    public static final int f(long j10) {
        return (int) (j10 & 4294967295L);
    }
}
