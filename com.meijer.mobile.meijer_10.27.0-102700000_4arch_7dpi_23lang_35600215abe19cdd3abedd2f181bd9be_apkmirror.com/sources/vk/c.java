package vk;

import j$.time.temporal.Temporal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0012\b\u0000\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001*\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"j$/time/temporal/Temporal", "", "T", "endInclusive", "Lkotlin/Function1;", "nextFunction", "Lkotlin/sequences/Sequence;", "b", "(Lj$/time/temporal/Temporal;Lj$/time/temporal/Temporal;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "util_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c {
    public static final <T extends Temporal & Comparable<? super T>> Sequence<T> b(T t10, final T endInclusive, Function1<? super T, ? extends T> nextFunction) {
        Intrinsics.j(t10, "<this>");
        Intrinsics.j(endInclusive, "endInclusive");
        Intrinsics.j(nextFunction, "nextFunction");
        return SequencesKt.U(SequencesKt.q(t10, nextFunction), new Function1() { // from class: vk.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(c.c(endInclusive, (Temporal) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Temporal temporal, Temporal it) {
        Intrinsics.j(it, "it");
        return ((Comparable) it).compareTo(temporal) <= 0;
    }
}
