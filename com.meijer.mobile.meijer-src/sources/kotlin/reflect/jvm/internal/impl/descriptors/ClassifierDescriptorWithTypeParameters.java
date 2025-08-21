package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;

/* loaded from: classes14.dex */
public interface ClassifierDescriptorWithTypeParameters extends ClassifierDescriptor, MemberDescriptor, Substitutable<ClassifierDescriptorWithTypeParameters> {
    List<TypeParameterDescriptor> p();

    boolean y();
}
