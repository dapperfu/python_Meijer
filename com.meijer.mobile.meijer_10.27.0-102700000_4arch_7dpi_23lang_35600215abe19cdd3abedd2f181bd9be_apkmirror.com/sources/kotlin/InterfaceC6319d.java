package kotlin;

import kotlin.AbstractC6334q;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00058fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00028\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0003"}, d2 = {"Lc0/d;", "T", "Lc0/q;", "V", "", "", "playTimeNanos", "f", "(J)Ljava/lang/Object;", "b", "(J)Lc0/q;", "", "c", "(J)Z", "d", "()J", "durationNanos", "Lc0/o0;", "e", "()Lc0/o0;", "typeConverter", "g", "()Ljava/lang/Object;", "targetValue", "a", "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6319d<T, V extends AbstractC6334q> {
    boolean a();

    V b(long playTimeNanos);

    long d();

    o0<T, V> e();

    T f(long playTimeNanos);

    T g();

    default boolean c(long playTimeNanos) {
        if (playTimeNanos >= d()) {
            return true;
        }
        return false;
    }
}
