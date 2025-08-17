package kotlin.comparisons;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class ComparisonsKt__ComparisonsKt$compareByDescending$2<T> implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Comparator<Object> f142612a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<T, Object> f142613b;

    @Override // java.util.Comparator
    public final int compare(T t10, T t11) {
        Comparator<Object> comparator = this.f142612a;
        Function1<T, Object> function1 = this.f142613b;
        return comparator.compare(function1.invoke(t11), function1.invoke(t10));
    }
}
