package Ek;

import io.reactivex.u;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"LEk/a;", "S", "", "LEk/b;", "reducer", "Lio/reactivex/u;", "b", "(LEk/b;)Lio/reactivex/u;", "Lkotlin/Function1;", "transformer", "a", "(Lkotlin/jvm/functions/Function1;)Lio/reactivex/u;", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public interface a<S> {
    u<S> b(b<S> reducer);

    default u<S> a(Function1<? super S, ? extends S> transformer) {
        Intrinsics.j(transformer, "transformer");
        return b(new c(transformer));
    }
}
