package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class ComparisonsKt__ComparisonsKt$thenBy$2<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator<T> f142616a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Comparator<Object> f142617b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function1<T, Object> f142618c;

    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        int iCompare = this.f142616a.compare(t10, t11);
        if (iCompare != 0) {
            return iCompare;
        }
        Comparator<Object> comparator = this.f142617b;
        Function1<T, Object> function1 = this.f142618c;
        return comparator.compare(function1.invoke(t10), function1.invoke(t11));
    }
}
