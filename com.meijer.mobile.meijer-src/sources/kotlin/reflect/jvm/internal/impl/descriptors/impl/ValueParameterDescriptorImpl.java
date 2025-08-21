package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

@SourceDebugExtension
/* loaded from: classes14.dex */
public class ValueParameterDescriptorImpl extends VariableDescriptorImpl implements ValueParameterDescriptor {

    /* renamed from: l, reason: collision with root package name */
    public static final Companion f144913l = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private final int f144914f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f144915g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f144916h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f144917i;

    /* renamed from: j, reason: collision with root package name */
    private final KotlinType f144918j;

    /* renamed from: k, reason: collision with root package name */
    private final ValueParameterDescriptor f144919k;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ValueParameterDescriptorImpl a(CallableDescriptor containingDeclaration, ValueParameterDescriptor valueParameterDescriptor, int i10, Annotations annotations, Name name, KotlinType outType, boolean z10, boolean z11, boolean z12, KotlinType kotlinType, SourceElement source, Function0<? extends List<? extends VariableDescriptor>> function0) {
            Intrinsics.j(containingDeclaration, "containingDeclaration");
            Intrinsics.j(annotations, "annotations");
            Intrinsics.j(name, "name");
            Intrinsics.j(outType, "outType");
            Intrinsics.j(source, "source");
            return function0 == null ? new ValueParameterDescriptorImpl(containingDeclaration, valueParameterDescriptor, i10, annotations, name, outType, z10, z11, z12, kotlinType, source) : new WithDestructuringDeclaration(containingDeclaration, valueParameterDescriptor, i10, annotations, name, outType, z10, z11, z12, kotlinType, source, function0);
        }
    }

    public static final class WithDestructuringDeclaration extends ValueParameterDescriptorImpl {

        /* renamed from: m, reason: collision with root package name */
        private final Lazy f144920m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithDestructuringDeclaration(CallableDescriptor containingDeclaration, ValueParameterDescriptor valueParameterDescriptor, int i10, Annotations annotations, Name name, KotlinType outType, boolean z10, boolean z11, boolean z12, KotlinType kotlinType, SourceElement source, Function0<? extends List<? extends VariableDescriptor>> destructuringVariables) {
            super(containingDeclaration, valueParameterDescriptor, i10, annotations, name, outType, z10, z11, z12, kotlinType, source);
            Intrinsics.j(containingDeclaration, "containingDeclaration");
            Intrinsics.j(annotations, "annotations");
            Intrinsics.j(name, "name");
            Intrinsics.j(outType, "outType");
            Intrinsics.j(source, "source");
            Intrinsics.j(destructuringVariables, "destructuringVariables");
            this.f144920m = LazyKt.b(destructuringVariables);
        }

        public final List<VariableDescriptor> N0() {
            return (List) this.f144920m.getValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
        public ValueParameterDescriptor X(CallableDescriptor newOwner, Name newName, int i10) {
            Intrinsics.j(newOwner, "newOwner");
            Intrinsics.j(newName, "newName");
            Annotations annotations = getAnnotations();
            Intrinsics.i(annotations, "<get-annotations>(...)");
            KotlinType type = getType();
            Intrinsics.i(type, "getType(...)");
            boolean zX0 = x0();
            boolean zO0 = o0();
            boolean zM0 = m0();
            KotlinType kotlinTypeS0 = s0();
            SourceElement NO_SOURCE = SourceElement.f144554a;
            Intrinsics.i(NO_SOURCE, "NO_SOURCE");
            return new WithDestructuringDeclaration(newOwner, null, i10, annotations, newName, type, zX0, zO0, zM0, kotlinTypeS0, NO_SOURCE, new j(this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List M0(WithDestructuringDeclaration withDestructuringDeclaration) {
            return withDestructuringDeclaration.N0();
        }
    }

    @JvmStatic
    public static final ValueParameterDescriptorImpl I0(CallableDescriptor callableDescriptor, ValueParameterDescriptor valueParameterDescriptor, int i10, Annotations annotations, Name name, KotlinType kotlinType, boolean z10, boolean z11, boolean z12, KotlinType kotlinType2, SourceElement sourceElement, Function0<? extends List<? extends VariableDescriptor>> function0) {
        return f144913l.a(callableDescriptor, valueParameterDescriptor, i10, annotations, name, kotlinType, z10, z11, z12, kotlinType2, sourceElement, function0);
    }

    public Void J0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean L() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueParameterDescriptorImpl(CallableDescriptor containingDeclaration, ValueParameterDescriptor valueParameterDescriptor, int i10, Annotations annotations, Name name, KotlinType outType, boolean z10, boolean z11, boolean z12, KotlinType kotlinType, SourceElement source) {
        super(containingDeclaration, annotations, name, outType, source);
        Intrinsics.j(containingDeclaration, "containingDeclaration");
        Intrinsics.j(annotations, "annotations");
        Intrinsics.j(name, "name");
        Intrinsics.j(outType, "outType");
        Intrinsics.j(source, "source");
        this.f144914f = i10;
        this.f144915g = z10;
        this.f144916h = z11;
        this.f144917i = z12;
        this.f144918j = kotlinType;
        this.f144919k = valueParameterDescriptor == null ? this : valueParameterDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public ValueParameterDescriptor c(TypeSubstitutor substitutor) {
        Intrinsics.j(substitutor, "substitutor");
        if (substitutor.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public ValueParameterDescriptor X(CallableDescriptor newOwner, Name newName, int i10) {
        Intrinsics.j(newOwner, "newOwner");
        Intrinsics.j(newName, "newName");
        Annotations annotations = getAnnotations();
        Intrinsics.i(annotations, "<get-annotations>(...)");
        KotlinType type = getType();
        Intrinsics.i(type, "getType(...)");
        boolean zX0 = x0();
        boolean zO0 = o0();
        boolean zM0 = m0();
        KotlinType kotlinTypeS0 = s0();
        SourceElement NO_SOURCE = SourceElement.f144554a;
        Intrinsics.i(NO_SOURCE, "NO_SOURCE");
        return new ValueParameterDescriptorImpl(newOwner, null, i10, annotations, newName, type, zX0, zO0, zM0, kotlinTypeS0, NO_SOURCE);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public CallableDescriptor b() {
        DeclarationDescriptor declarationDescriptorB = super.b();
        Intrinsics.h(declarationDescriptorB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (CallableDescriptor) declarationDescriptorB;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public int getIndex() {
        return this.f144914f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility LOCAL = DescriptorVisibilities.f144508f;
        Intrinsics.i(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean m0() {
        return this.f144917i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean o0() {
        return this.f144916h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public KotlinType s0() {
        return this.f144918j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R x(DeclarationDescriptorVisitor<R, D> visitor, D d10) {
        Intrinsics.j(visitor, "visitor");
        return visitor.f(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor
    public boolean x0() {
        if (!this.f144915g) {
            return false;
        }
        CallableDescriptor callableDescriptorB = b();
        Intrinsics.h(callableDescriptorB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
        return ((CallableMemberDescriptor) callableDescriptorB).f().a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public ValueParameterDescriptor a() {
        ValueParameterDescriptor valueParameterDescriptor = this.f144919k;
        return valueParameterDescriptor == this ? this : valueParameterDescriptor.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public Collection<ValueParameterDescriptor> d() {
        Collection<? extends CallableDescriptor> collectionD = b().d();
        Intrinsics.i(collectionD, "getOverriddenDescriptors(...)");
        Collection<? extends CallableDescriptor> collection = collectionD;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((CallableDescriptor) it.next()).h().get(getIndex()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public /* bridge */ /* synthetic */ ConstantValue l0() {
        return (ConstantValue) J0();
    }
}
