package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class ComparisonsKt__ComparisonsKt$thenComparator$1<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator<T> f142624a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function2<T, T, Integer> f142625b;

    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        int iCompare = this.f142624a.compare(t10, t11);
        return iCompare != 0 ? iCompare : this.f142625b.invoke(t10, t11).intValue();
    }
}
