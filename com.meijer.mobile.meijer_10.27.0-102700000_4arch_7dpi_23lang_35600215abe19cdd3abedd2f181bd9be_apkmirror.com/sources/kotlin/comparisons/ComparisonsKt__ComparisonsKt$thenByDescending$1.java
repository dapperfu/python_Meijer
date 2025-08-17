package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class ComparisonsKt__ComparisonsKt$thenByDescending$1<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator<T> f142619a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<T, Comparable<?>> f142620b;

    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        int iCompare = this.f142619a.compare(t10, t11);
        if (iCompare != 0) {
            return iCompare;
        }
        Function1<T, Comparable<?>> function1 = this.f142620b;
        return b.d(function1.invoke(t11), function1.invoke(t10));
    }
}
