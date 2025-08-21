package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes14.dex */
public abstract class ClassifierBasedTypeConstructor implements TypeConstructor {

    /* renamed from: a, reason: collision with root package name */
    private int f147592a;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public abstract ClassifierDescriptor d();

    protected abstract boolean h(ClassifierDescriptor classifierDescriptor);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypeConstructor) || obj.hashCode() != hashCode()) {
            return false;
        }
        TypeConstructor typeConstructor = (TypeConstructor) obj;
        if (typeConstructor.getParameters().size() != getParameters().size()) {
            return false;
        }
        ClassifierDescriptor classifierDescriptorD = d();
        ClassifierDescriptor classifierDescriptorD2 = typeConstructor.d();
        if (classifierDescriptorD2 != null && g(classifierDescriptorD) && g(classifierDescriptorD2)) {
            return h(classifierDescriptorD2);
        }
        return false;
    }

    protected final boolean f(ClassifierDescriptor first, ClassifierDescriptor second) {
        Intrinsics.j(first, "first");
        Intrinsics.j(second, "second");
        if (!Intrinsics.e(first.getName(), second.getName())) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorB = first.b();
        for (DeclarationDescriptor declarationDescriptorB2 = second.b(); declarationDescriptorB != null && declarationDescriptorB2 != null; declarationDescriptorB2 = declarationDescriptorB2.b()) {
            if (declarationDescriptorB instanceof ModuleDescriptor) {
                return declarationDescriptorB2 instanceof ModuleDescriptor;
            }
            if (declarationDescriptorB2 instanceof ModuleDescriptor) {
                return false;
            }
            if (declarationDescriptorB instanceof PackageFragmentDescriptor) {
                return (declarationDescriptorB2 instanceof PackageFragmentDescriptor) && Intrinsics.e(((PackageFragmentDescriptor) declarationDescriptorB).e(), ((PackageFragmentDescriptor) declarationDescriptorB2).e());
            }
            if ((declarationDescriptorB2 instanceof PackageFragmentDescriptor) || !Intrinsics.e(declarationDescriptorB.getName(), declarationDescriptorB2.getName())) {
                return false;
            }
            declarationDescriptorB = declarationDescriptorB.b();
        }
        return true;
    }

    public int hashCode() {
        int i10 = this.f147592a;
        if (i10 != 0) {
            return i10;
        }
        ClassifierDescriptor classifierDescriptorD = d();
        int iHashCode = g(classifierDescriptorD) ? DescriptorUtils.m(classifierDescriptorD).hashCode() : System.identityHashCode(this);
        this.f147592a = iHashCode;
        return iHashCode;
    }

    private final boolean g(ClassifierDescriptor classifierDescriptor) {
        if (!ErrorUtils.m(classifierDescriptor) && !DescriptorUtils.E(classifierDescriptor)) {
            return true;
        }
        return false;
    }
}
