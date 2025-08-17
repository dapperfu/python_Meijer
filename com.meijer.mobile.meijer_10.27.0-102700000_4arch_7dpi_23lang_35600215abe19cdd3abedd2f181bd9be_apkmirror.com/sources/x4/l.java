package x4;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0003j\b\u0012\u0004\u0012\u00028\u0000`\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u0006\u0012\u0002\b\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "(Ljava/util/Collection;)Ljava/util/ArrayList;", "savedstate_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/savedstate/SavedStateWriterKt")
/* loaded from: classes4.dex */
final /* synthetic */ class l {
    @PublishedApi
    public static final <T> ArrayList<T> a(Collection<?> collection) {
        Intrinsics.j(collection, "<this>");
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList<>(collection);
    }
}
