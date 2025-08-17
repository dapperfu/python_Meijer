package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes13.dex */
public final class PrimitiveTypeUtilKt {
    public static final Collection<KotlinType> a(ModuleDescriptor moduleDescriptor) {
        Intrinsics.j(moduleDescriptor, "<this>");
        return CollectionsKt.p(moduleDescriptor.l().E(), moduleDescriptor.l().G(), moduleDescriptor.l().u(), moduleDescriptor.l().U());
    }
}
