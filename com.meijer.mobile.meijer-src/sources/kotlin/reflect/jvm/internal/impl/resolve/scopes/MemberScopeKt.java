package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class MemberScopeKt {
    public static final Set<Name> a(Iterable<? extends MemberScope> iterable) {
        Intrinsics.j(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator<? extends MemberScope> it = iterable.iterator();
        while (it.hasNext()) {
            Set<Name> setE = it.next().e();
            if (setE == null) {
                return null;
            }
            CollectionsKt.C(hashSet, setE);
        }
        return hashSet;
    }
}
