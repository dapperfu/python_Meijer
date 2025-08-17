package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes13.dex */
public interface ResolutionScope {

    @SourceDebugExtension
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Collection a(ResolutionScope resolutionScope, DescriptorKindFilter descriptorKindFilter, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
            }
            if ((i10 & 1) != 0) {
                descriptorKindFilter = DescriptorKindFilter.f146267o;
            }
            if ((i10 & 2) != 0) {
                function1 = MemberScope.f146290a.c();
            }
            return resolutionScope.g(descriptorKindFilter, function1);
        }
    }

    ClassifierDescriptor f(Name name, LookupLocation lookupLocation);

    Collection<DeclarationDescriptor> g(DescriptorKindFilter descriptorKindFilter, Function1<? super Name, Boolean> function1);
}
