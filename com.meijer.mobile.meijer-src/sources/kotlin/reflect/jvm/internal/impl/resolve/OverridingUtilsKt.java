package kotlin.reflect.jvm.internal.impl.resolve;

import A0.c;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class OverridingUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <H> Collection<H> b(Collection<? extends H> collection, Function1<? super H, ? extends CallableDescriptor> descriptorByHandle) {
        Intrinsics.j(collection, "<this>");
        Intrinsics.j(descriptorByHandle, "descriptorByHandle");
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        SmartSet smartSetA = SmartSet.f148085c.a();
        while (!linkedList.isEmpty()) {
            Object objS0 = CollectionsKt.s0(linkedList);
            SmartSet smartSetA2 = SmartSet.f148085c.a();
            Collection<c.e> collectionP = OverridingUtil.p(objS0, linkedList, descriptorByHandle, new f(smartSetA2));
            Intrinsics.i(collectionP, "extractMembersOverridableInBothWays(...)");
            if (collectionP.size() == 1 && smartSetA2.isEmpty()) {
                Object objT0 = CollectionsKt.T0(collectionP);
                Intrinsics.i(objT0, "single(...)");
                smartSetA.add(objT0);
            } else {
                c.f fVar = (Object) OverridingUtil.L(collectionP, descriptorByHandle);
                CallableDescriptor callableDescriptorInvoke = descriptorByHandle.invoke(fVar);
                for (c.e eVar : collectionP) {
                    Intrinsics.g(eVar);
                    if (!OverridingUtil.B(callableDescriptorInvoke, descriptorByHandle.invoke(eVar))) {
                        smartSetA2.add(eVar);
                    }
                }
                if (!smartSetA2.isEmpty()) {
                    smartSetA.addAll(smartSetA2);
                }
                smartSetA.add(fVar);
            }
        }
        return smartSetA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(SmartSet smartSet, Object obj) {
        Intrinsics.g(obj);
        smartSet.add(obj);
        return Unit.f143329a;
    }
}
