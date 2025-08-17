package kotlin;

import kotlin.AbstractC6334q;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lc0/p0;", "T", "Lc0/q;", "V", "Lc0/o0;", "Lkotlin/Function1;", "convertToVector", "convertFromVector", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "b", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class p0<T, V extends AbstractC6334q> implements o0<T, V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<T, V> convertToVector;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function1<V, T> convertFromVector;

    @Override // kotlin.o0
    public Function1<T, V> a() {
        return this.convertToVector;
    }

    @Override // kotlin.o0
    public Function1<V, T> b() {
        return this.convertFromVector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p0(Function1<? super T, ? extends V> function1, Function1<? super V, ? extends T> function12) {
        this.convertToVector = function1;
        this.convertFromVector = function12;
    }
}
