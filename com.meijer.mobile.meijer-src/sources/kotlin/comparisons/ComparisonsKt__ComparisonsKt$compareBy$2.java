package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes8.dex */
public final class ComparisonsKt__ComparisonsKt$compareBy$2<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1<T, Comparable<?>> f143515a;

    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        Function1<T, Comparable<?>> function1 = this.f143515a;
        return b.d(function1.invoke(t10), function1.invoke(t11));
    }
}
