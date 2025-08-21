package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes14.dex */
public interface ClassDescriptorFactory {
    Collection<ClassDescriptor> a(FqName fqName);

    boolean b(FqName fqName, Name name);

    ClassDescriptor c(ClassId classId);
}
