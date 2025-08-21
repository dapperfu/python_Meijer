package com.google.maps.android.compose;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u009a\u0001\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0005*\b\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\b2%\u0010\t\u001a!\u0012\u0004\u0012\u0002H\u0002\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\b0\b¢\u0006\u0002\b\n2\u0006\u0010\u000b\u001a\u0002H\u00042%\u0010\f\u001a!\u0012\u0004\u0012\u00020\r\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\b0\b¢\u0006\u0002\b\nH\u0082\b¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"findInputCallback", "", "NodeT", "Lcom/google/maps/android/compose/MapNode;", "I", "O", "", "nodeMatchPredicate", "Lkotlin/Function1;", "nodeInputCallback", "Lkotlin/ExtensionFunctionType;", "marker", "inputHandlerCallback", "Lcom/google/maps/android/compose/InputHandlerNode;", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "maps-compose_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MapApplierKt {
    private static final /* synthetic */ <NodeT extends MapNode, I, O> boolean findInputCallback(Iterable<? extends MapNode> iterable, Function1<? super NodeT, Boolean> function1, Function1<? super NodeT, ? extends Function1<? super I, ? extends O>> function12, I i10, Function1<? super InputHandlerNode, ? extends Function1<? super I, ? extends O>> function13) {
        Iterator<? extends MapNode> it = iterable.iterator();
        while (true) {
            boolean zE = false;
            if (!it.hasNext()) {
                return false;
            }
            MapNode next = it.next();
            Intrinsics.n(3, "NodeT");
            if (next != null && function1.invoke(next).booleanValue()) {
                Function1<? super I, ? extends O> function1Invoke = function12.invoke(next);
                if (function1Invoke != null) {
                    zE = Intrinsics.e(function1Invoke.invoke(i10), Boolean.TRUE);
                }
                if (zE) {
                    return true;
                }
            } else if (next instanceof InputHandlerNode) {
                Function1<? super I, ? extends O> function1Invoke2 = function13.invoke(next);
                if (function1Invoke2 != null) {
                    zE = Intrinsics.e(function1Invoke2.invoke(i10), Boolean.TRUE);
                }
                if (zE) {
                    return true;
                }
            } else {
                continue;
            }
        }
    }
}
