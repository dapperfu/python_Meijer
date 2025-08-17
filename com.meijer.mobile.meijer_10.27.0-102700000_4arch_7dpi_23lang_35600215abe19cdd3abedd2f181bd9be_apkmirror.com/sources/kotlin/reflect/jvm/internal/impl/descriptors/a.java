package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes13.dex */
final class a implements TypeParameterDescriptor {

    /* renamed from: a, reason: collision with root package name */
    private final TypeParameterDescriptor f143664a;

    /* renamed from: b, reason: collision with root package name */
    private final DeclarationDescriptor f143665b;

    /* renamed from: c, reason: collision with root package name */
    private final int f143666c;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public StorageManager K() {
        StorageManager storageManagerK = this.f143664a.K();
        Intrinsics.i(storageManagerK, "getStorageManager(...)");
        return storageManagerK;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean P() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement g() {
        SourceElement sourceElementG = this.f143664a.g();
        Intrinsics.i(sourceElementG, "getSource(...)");
        return sourceElementG;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated
    public Annotations getAnnotations() {
        return this.f143664a.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.Named
    public Name getName() {
        Name name = this.f143664a.getName();
        Intrinsics.i(name, "getName(...)");
        return name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public List<KotlinType> getUpperBounds() {
        List<KotlinType> upperBounds = this.f143664a.getUpperBounds();
        Intrinsics.i(upperBounds, "getUpperBounds(...)");
        return upperBounds;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public TypeConstructor i() {
        TypeConstructor typeConstructorI = this.f143664a.i();
        Intrinsics.i(typeConstructorI, "getTypeConstructor(...)");
        return typeConstructorI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public Variance k() {
        Variance varianceK = this.f143664a.k();
        Intrinsics.i(varianceK, "getVariance(...)");
        return varianceK;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    public SimpleType o() {
        SimpleType simpleTypeO = this.f143664a.o();
        Intrinsics.i(simpleTypeO, "getDefaultType(...)");
        return simpleTypeO;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public boolean v() {
        return this.f143664a.v();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R x(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d10) {
        return (R) this.f143664a.x(declarationDescriptorVisitor, d10);
    }

    public a(TypeParameterDescriptor originalDescriptor, DeclarationDescriptor declarationDescriptor, int i10) {
        Intrinsics.j(originalDescriptor, "originalDescriptor");
        Intrinsics.j(declarationDescriptor, "declarationDescriptor");
        this.f143664a = originalDescriptor;
        this.f143665b = declarationDescriptor;
        this.f143666c = i10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor b() {
        return this.f143665b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor
    public int getIndex() {
        return this.f143666c + this.f143664a.getIndex();
    }

    public String toString() {
        return this.f143664a + "[inner-copy]";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public TypeParameterDescriptor a() {
        TypeParameterDescriptor typeParameterDescriptorA = this.f143664a.a();
        Intrinsics.i(typeParameterDescriptorA, "getOriginal(...)");
        return typeParameterDescriptorA;
    }
}
