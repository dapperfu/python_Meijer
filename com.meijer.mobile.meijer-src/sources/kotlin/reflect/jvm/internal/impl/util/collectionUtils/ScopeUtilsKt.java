package kotlin.reflect.jvm.internal.impl.util.collectionUtils;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class ScopeUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Collection<T> a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        Intrinsics.j(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final SmartList<MemberScope> b(Iterable<? extends MemberScope> scopes) {
        Intrinsics.j(scopes, "scopes");
        SmartList<MemberScope> smartList = new SmartList<>();
        for (MemberScope memberScope : scopes) {
            MemberScope memberScope2 = memberScope;
            if (memberScope2 != null && memberScope2 != MemberScope.Empty.f147200b) {
                smartList.add(memberScope);
            }
        }
        return smartList;
    }
}
