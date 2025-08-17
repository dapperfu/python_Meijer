package y6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import y6.AbstractC18184l;

@Metadata(d1 = {"\u0000B\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000\"\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a7\u0010\f\u001a\u00020\n\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001aQ\u0010\u0016\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u000e0\u00032\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u0019\u001a\u00020\n2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"", "", "typenames", "Ly6/l;", "Ly6/i;", "f", "([Ljava/lang/String;)Ly6/l;", "", "T", "Lkotlin/Function1;", "", "block", "c", "(Ly6/l;Lkotlin/jvm/functions/Function1;)Z", "Ly6/j;", "", "variables", "typename", "Ly6/q;", "deferredFragmentIdentifiers", "", "path", "b", "(Ly6/l;Ljava/util/Set;Ljava/lang/String;Ljava/util/Set;Ljava/util/List;)Z", "label", "e", "(Ljava/util/Set;Ljava/util/List;Ljava/lang/String;)Z", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class n {
    public static final boolean b(AbstractC18184l<? extends AbstractC18182j> abstractC18184l, final Set<String> set, final String str, final Set<DeferredFragmentIdentifier> set2, List<? extends Object> list) {
        Intrinsics.j(abstractC18184l, "<this>");
        final List listJ0 = list != null ? CollectionsKt.j0(list, 1) : null;
        return c(abstractC18184l, new Function1() { // from class: y6.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(n.d(set, set2, listJ0, str, (AbstractC18182j) obj));
            }
        });
    }

    @Deprecated
    public static final <T> boolean c(AbstractC18184l<? extends T> abstractC18184l, Function1<? super T, Boolean> block) {
        Intrinsics.j(abstractC18184l, "<this>");
        Intrinsics.j(block, "block");
        if (Intrinsics.e(abstractC18184l, AbstractC18184l.f.f170291a)) {
            return true;
        }
        if (Intrinsics.e(abstractC18184l, AbstractC18184l.c.f170288a)) {
            return false;
        }
        if (abstractC18184l instanceof AbstractC18184l.Not) {
            return !c(((AbstractC18184l.Not) abstractC18184l).a(), block);
        }
        if (abstractC18184l instanceof AbstractC18184l.e) {
            Set<AbstractC18184l<T>> setA = ((AbstractC18184l.e) abstractC18184l).a();
            if ((setA instanceof Collection) && setA.isEmpty()) {
                return false;
            }
            Iterator<T> it = setA.iterator();
            while (it.hasNext()) {
                if (c((AbstractC18184l) it.next(), block)) {
                    return true;
                }
            }
            return false;
        }
        if (!(abstractC18184l instanceof AbstractC18184l.And)) {
            if (abstractC18184l instanceof AbstractC18184l.Element) {
                return block.invoke((Object) ((AbstractC18184l.Element) abstractC18184l).a()).booleanValue();
            }
            throw new NoWhenBranchMatchedException();
        }
        Set<AbstractC18184l<T>> setA2 = ((AbstractC18184l.And) abstractC18184l).a();
        if ((setA2 instanceof Collection) && setA2.isEmpty()) {
            return true;
        }
        Iterator<T> it2 = setA2.iterator();
        while (it2.hasNext()) {
            if (!c((AbstractC18184l) it2.next(), block)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(Set set, Set set2, List list, String str, AbstractC18182j it) {
        Intrinsics.j(it, "it");
        if (it instanceof BVariable) {
            return !(set != null ? set.contains(((BVariable) it).getName()) : false);
        }
        if (it instanceof BLabel) {
            Intrinsics.g(list);
            return e(set2, list, ((BLabel) it).getLabel());
        }
        if (it instanceof BPossibleTypes) {
            return CollectionsKt.h0(((BPossibleTypes) it).a(), str);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final boolean e(Set<DeferredFragmentIdentifier> set, List<? extends Object> list, String str) {
        if (set == null) {
            return true;
        }
        return set.contains(new DeferredFragmentIdentifier(list, str));
    }

    public static final AbstractC18184l<BPossibleTypes> f(String... typenames) {
        Intrinsics.j(typenames, "typenames");
        return new AbstractC18184l.Element(new BPossibleTypes(ArraysKt.u1(typenames)));
    }
}
