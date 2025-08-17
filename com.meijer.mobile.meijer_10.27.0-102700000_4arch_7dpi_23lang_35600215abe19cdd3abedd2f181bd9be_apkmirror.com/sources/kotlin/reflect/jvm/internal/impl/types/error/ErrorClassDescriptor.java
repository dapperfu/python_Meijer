package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes13.dex */
public final class ErrorClassDescriptor extends ClassDescriptorImpl {
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* renamed from: D0 */
    public ClassDescriptor c(TypeSubstitutor substitutor) {
        Intrinsics.j(substitutor, "substitutor");
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ErrorClassDescriptor(Name name) {
        Intrinsics.j(name, "name");
        ErrorUtils errorUtils = ErrorUtils.f146990a;
        ModuleDescriptor moduleDescriptorI = errorUtils.i();
        Modality modality = Modality.f143621d;
        ClassKind classKind = ClassKind.f143585b;
        List listM = CollectionsKt.m();
        SourceElement sourceElement = SourceElement.f143647a;
        super(moduleDescriptorI, name, modality, classKind, listM, sourceElement, false, LockBasedStorageManager.f146633e);
        ClassConstructorDescriptorImpl classConstructorDescriptorImplK1 = ClassConstructorDescriptorImpl.k1(this, Annotations.f143689s3.b(), true, sourceElement);
        classConstructorDescriptorImplK1.n1(CollectionsKt.m(), DescriptorVisibilities.f143599d);
        Intrinsics.i(classConstructorDescriptorImplK1, "apply(...)");
        MemberScope memberScopeB = ErrorUtils.b(ErrorScopeKind.f146888j, classConstructorDescriptorImplK1.getName().toString(), "");
        ErrorTypeKind errorTypeKind = ErrorTypeKind.f146973s0;
        classConstructorDescriptorImplK1.d1(new ErrorType(errorUtils.e(errorTypeKind, new String[0]), memberScopeB, errorTypeKind, null, false, new String[0], 24, null));
        H0(memberScopeB, SetsKt.d(classConstructorDescriptorImplK1), classConstructorDescriptorImplK1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptor
    public MemberScope e0(TypeSubstitution typeSubstitution, KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.j(typeSubstitution, "typeSubstitution");
        Intrinsics.j(kotlinTypeRefiner, "kotlinTypeRefiner");
        return ErrorUtils.b(ErrorScopeKind.f146888j, getName().toString(), typeSubstitution.toString());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl
    public String toString() {
        String strB = getName().b();
        Intrinsics.i(strB, "asString(...)");
        return strB;
    }
}
