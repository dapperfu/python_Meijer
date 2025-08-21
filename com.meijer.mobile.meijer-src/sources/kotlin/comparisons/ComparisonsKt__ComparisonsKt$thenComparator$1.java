package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes8.dex */
public final class ComparisonsKt__ComparisonsKt$thenComparator$1<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator<T> f143531a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function2<T, T, Integer> f143532b;

    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        int iCompare = this.f143531a.compare(t10, t11);
        return iCompare != 0 ? iCompare : this.f143532b.invoke(t10, t11).intValue();
    }
}
