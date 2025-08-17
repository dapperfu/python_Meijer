package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* loaded from: classes13.dex */
public abstract class KotlinTypeRefiner extends AbstractTypeRefiner {

    public static final class Default extends KotlinTypeRefiner {

        /* renamed from: a, reason: collision with root package name */
        public static final Default f146818a = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public ClassDescriptor b(ClassId classId) {
            Intrinsics.j(classId, "classId");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public boolean d(ModuleDescriptor moduleDescriptor) {
            Intrinsics.j(moduleDescriptor, "moduleDescriptor");
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public boolean e(TypeConstructor typeConstructor) {
            Intrinsics.j(typeConstructor, "typeConstructor");
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public ClassDescriptor f(DeclarationDescriptor descriptor) {
            Intrinsics.j(descriptor, "descriptor");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public <S extends MemberScope> S c(ClassDescriptor classDescriptor, Function0<? extends S> compute) {
            Intrinsics.j(classDescriptor, "classDescriptor");
            Intrinsics.j(compute, "compute");
            return compute.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner
        public Collection<KotlinType> g(ClassDescriptor classDescriptor) {
            Intrinsics.j(classDescriptor, "classDescriptor");
            Collection<KotlinType> collectionA = classDescriptor.i().a();
            Intrinsics.i(collectionA, "getSupertypes(...)");
            return collectionA;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeRefiner
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public KotlinType a(KotlinTypeMarker type) {
            Intrinsics.j(type, "type");
            return (KotlinType) type;
        }

        private Default() {
        }
    }

    public abstract ClassDescriptor b(ClassId classId);

    public abstract <S extends MemberScope> S c(ClassDescriptor classDescriptor, Function0<? extends S> function0);

    public abstract boolean d(ModuleDescriptor moduleDescriptor);

    public abstract boolean e(TypeConstructor typeConstructor);

    public abstract ClassifierDescriptor f(DeclarationDescriptor declarationDescriptor);

    public abstract Collection<KotlinType> g(ClassDescriptor classDescriptor);

    /* renamed from: h */
    public abstract KotlinType a(KotlinTypeMarker kotlinTypeMarker);
}
