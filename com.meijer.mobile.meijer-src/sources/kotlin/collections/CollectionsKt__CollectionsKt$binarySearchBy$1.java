package kotlin.collections;

import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class CollectionsKt__CollectionsKt$binarySearchBy$1 implements Function1<Object, Integer> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1<Object, Comparable<Object>> f143408a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Comparable<Object> f143409b;

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Integer invoke(Object obj) {
        return Integer.valueOf(ComparisonsKt.d(this.f143408a.invoke(obj), this.f143409b));
    }
}
