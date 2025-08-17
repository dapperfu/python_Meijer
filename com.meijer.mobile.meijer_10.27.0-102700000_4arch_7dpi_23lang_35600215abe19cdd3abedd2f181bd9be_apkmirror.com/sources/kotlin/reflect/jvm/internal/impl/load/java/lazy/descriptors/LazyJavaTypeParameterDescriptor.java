package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class LazyJavaTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {

    /* renamed from: k, reason: collision with root package name */
    private final LazyJavaResolverContext f144540k;

    /* renamed from: l, reason: collision with root package name */
    private final JavaTypeParameter f144541l;

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    protected void H0(KotlinType type) {
        Intrinsics.j(type, "type");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaTypeParameterDescriptor(LazyJavaResolverContext c10, JavaTypeParameter javaTypeParameter, int i10, DeclarationDescriptor containingDeclaration) {
        super(c10.e(), containingDeclaration, new LazyJavaAnnotations(c10, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), Variance.f146796e, false, i10, SourceElement.f143647a, c10.a().v());
        Intrinsics.j(c10, "c");
        Intrinsics.j(javaTypeParameter, "javaTypeParameter");
        Intrinsics.j(containingDeclaration, "containingDeclaration");
        this.f144540k = c10;
        this.f144541l = javaTypeParameter;
    }

    private final List<KotlinType> J0() {
        Collection<JavaClassifierType> upperBounds = this.f144541l.getUpperBounds();
        if (upperBounds.isEmpty()) {
            SimpleType simpleTypeI = this.f144540k.d().l().i();
            Intrinsics.i(simpleTypeI, "getAnyType(...)");
            SimpleType simpleTypeJ = this.f144540k.d().l().J();
            Intrinsics.i(simpleTypeJ, "getNullableAnyType(...)");
            return CollectionsKt.e(KotlinTypeFactory.e(simpleTypeI, simpleTypeJ));
        }
        Collection<JavaClassifierType> collection = upperBounds;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f144540k.g().p((JavaClassifierType) it.next(), JavaTypeAttributesKt.b(TypeUsage.f146788b, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    protected List<KotlinType> D0(List<? extends KotlinType> bounds) {
        Intrinsics.j(bounds, "bounds");
        return this.f144540k.a().r().r(this, bounds, this.f144540k);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    protected List<KotlinType> I0() {
        return J0();
    }
}
