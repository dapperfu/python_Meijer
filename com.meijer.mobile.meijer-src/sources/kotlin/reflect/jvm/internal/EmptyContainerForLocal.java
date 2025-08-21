package kotlin.reflect.jvm.internal;

import java.util.Collection;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lkotlin/reflect/jvm/internal/EmptyContainerForLocal;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "<init>", "()V", "", "Q", "()Ljava/lang/Void;", "Lkotlin/reflect/jvm/internal/impl/name/Name;", "name", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "K", "(Lkotlin/reflect/jvm/internal/impl/name/Name;)Ljava/util/Collection;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "G", "", "index", "H", "(I)Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "Ljava/lang/Class;", "h", "()Ljava/lang/Class;", "jClass", "Lkotlin/reflect/jvm/internal/impl/descriptors/ConstructorDescriptor;", "F", "()Ljava/util/Collection;", "constructorDescriptors", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EmptyContainerForLocal extends KDeclarationContainerImpl {

    /* renamed from: d, reason: collision with root package name */
    public static final EmptyContainerForLocal f143898d = new EmptyContainerForLocal();

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public PropertyDescriptor H(int index) {
        return null;
    }

    private final Void Q() {
        throw new KotlinReflectionInternalError("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<FunctionDescriptor> G(Name name) {
        Intrinsics.j(name, "name");
        Q();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<PropertyDescriptor> K(Name name) {
        Intrinsics.j(name, "name");
        Q();
        throw new KotlinNothingValueException();
    }

    private EmptyContainerForLocal() {
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    public Collection<ConstructorDescriptor> F() {
        Q();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.jvm.internal.ClassBasedDeclarationContainer
    public Class<?> h() {
        Q();
        throw new KotlinNothingValueException();
    }
}
