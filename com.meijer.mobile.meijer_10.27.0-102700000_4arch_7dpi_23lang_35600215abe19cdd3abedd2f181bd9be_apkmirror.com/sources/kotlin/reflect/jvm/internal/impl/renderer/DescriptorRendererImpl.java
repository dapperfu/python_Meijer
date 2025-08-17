package kotlin.reflect.jvm.internal.impl.renderer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PossiblyInnerType;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbbreviatedType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.WrappedType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class DescriptorRendererImpl extends DescriptorRenderer implements DescriptorRendererOptions {

    /* renamed from: m, reason: collision with root package name */
    private final DescriptorRendererOptionsImpl f145998m;

    /* renamed from: n, reason: collision with root package name */
    private final Lazy f145999n;

    private final class RenderDeclarationDescriptorVisitor implements DeclarationDescriptorVisitor<Unit, StringBuilder> {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PropertyAccessorRenderingPolicy.values().length];
                try {
                    iArr[PropertyAccessorRenderingPolicy.f146087a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.f146088b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PropertyAccessorRenderingPolicy.f146089c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public RenderDeclarationDescriptorVisitor() {
        }

        private final void t(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb2, String str) throws IOException {
            int i10 = WhenMappings.$EnumSwitchMapping$0[DescriptorRendererImpl.this.Q0().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    p(propertyAccessorDescriptor, sb2);
                    return;
                } else {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            }
            DescriptorRendererImpl.this.x1(propertyAccessorDescriptor, sb2);
            sb2.append(str + " for ");
            DescriptorRendererImpl descriptorRendererImpl = DescriptorRendererImpl.this;
            PropertyDescriptor propertyDescriptorT = propertyAccessorDescriptor.T();
            Intrinsics.i(propertyDescriptorT, "getCorrespondingProperty(...)");
            descriptorRendererImpl.i2(propertyDescriptorT, sb2);
        }

        public void A(ValueParameterDescriptor descriptor, StringBuilder builder) {
            Intrinsics.j(descriptor, "descriptor");
            Intrinsics.j(builder, "builder");
            DescriptorRendererImpl.this.C2(descriptor, true, builder, true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit a(ClassDescriptor classDescriptor, StringBuilder sb2) throws IOException {
            n(classDescriptor, sb2);
            return Unit.f142422a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit b(PackageViewDescriptor packageViewDescriptor, StringBuilder sb2) {
            s(packageViewDescriptor, sb2);
            return Unit.f142422a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit c(PropertyDescriptor propertyDescriptor, StringBuilder sb2) throws IOException {
            u(propertyDescriptor, sb2);
            return Unit.f142422a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit d(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb2) {
            y(typeAliasDescriptor, sb2);
            return Unit.f142422a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit e(PropertySetterDescriptor propertySetterDescriptor, StringBuilder sb2) throws IOException {
            w(propertySetterDescriptor, sb2);
            return Unit.f142422a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit f(ValueParameterDescriptor valueParameterDescriptor, StringBuilder sb2) {
            A(valueParameterDescriptor, sb2);
            return Unit.f142422a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit g(PropertyGetterDescriptor propertyGetterDescriptor, StringBuilder sb2) throws IOException {
            v(propertyGetterDescriptor, sb2);
            return Unit.f142422a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit h(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb2) {
            r(packageFragmentDescriptor, sb2);
            return Unit.f142422a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit i(FunctionDescriptor functionDescriptor, StringBuilder sb2) throws IOException {
            p(functionDescriptor, sb2);
            return Unit.f142422a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit j(ConstructorDescriptor constructorDescriptor, StringBuilder sb2) throws IOException {
            o(constructorDescriptor, sb2);
            return Unit.f142422a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit k(ModuleDescriptor moduleDescriptor, StringBuilder sb2) {
            q(moduleDescriptor, sb2);
            return Unit.f142422a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit l(ReceiverParameterDescriptor receiverParameterDescriptor, StringBuilder sb2) {
            x(receiverParameterDescriptor, sb2);
            return Unit.f142422a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor
        public /* bridge */ /* synthetic */ Unit m(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb2) {
            z(typeParameterDescriptor, sb2);
            return Unit.f142422a;
        }

        public void n(ClassDescriptor descriptor, StringBuilder builder) throws IOException {
            Intrinsics.j(descriptor, "descriptor");
            Intrinsics.j(builder, "builder");
            DescriptorRendererImpl.this.D1(descriptor, builder);
        }

        public void o(ConstructorDescriptor constructorDescriptor, StringBuilder builder) throws IOException {
            Intrinsics.j(constructorDescriptor, "constructorDescriptor");
            Intrinsics.j(builder, "builder");
            DescriptorRendererImpl.this.I1(constructorDescriptor, builder);
        }

        public void p(FunctionDescriptor descriptor, StringBuilder builder) throws IOException {
            Intrinsics.j(descriptor, "descriptor");
            Intrinsics.j(builder, "builder");
            DescriptorRendererImpl.this.Q1(descriptor, builder);
        }

        public void q(ModuleDescriptor descriptor, StringBuilder builder) {
            Intrinsics.j(descriptor, "descriptor");
            Intrinsics.j(builder, "builder");
            DescriptorRendererImpl.this.a2(descriptor, builder, true);
        }

        public void r(PackageFragmentDescriptor descriptor, StringBuilder builder) {
            Intrinsics.j(descriptor, "descriptor");
            Intrinsics.j(builder, "builder");
            DescriptorRendererImpl.this.e2(descriptor, builder);
        }

        public void s(PackageViewDescriptor descriptor, StringBuilder builder) {
            Intrinsics.j(descriptor, "descriptor");
            Intrinsics.j(builder, "builder");
            DescriptorRendererImpl.this.g2(descriptor, builder);
        }

        public void u(PropertyDescriptor descriptor, StringBuilder builder) throws IOException {
            Intrinsics.j(descriptor, "descriptor");
            Intrinsics.j(builder, "builder");
            DescriptorRendererImpl.this.i2(descriptor, builder);
        }

        public void v(PropertyGetterDescriptor descriptor, StringBuilder builder) throws IOException {
            Intrinsics.j(descriptor, "descriptor");
            Intrinsics.j(builder, "builder");
            t(descriptor, builder, "getter");
        }

        public void w(PropertySetterDescriptor descriptor, StringBuilder builder) throws IOException {
            Intrinsics.j(descriptor, "descriptor");
            Intrinsics.j(builder, "builder");
            t(descriptor, builder, "setter");
        }

        public void x(ReceiverParameterDescriptor descriptor, StringBuilder builder) {
            Intrinsics.j(descriptor, "descriptor");
            Intrinsics.j(builder, "builder");
            builder.append(descriptor.getName());
        }

        public void y(TypeAliasDescriptor descriptor, StringBuilder builder) {
            Intrinsics.j(descriptor, "descriptor");
            Intrinsics.j(builder, "builder");
            DescriptorRendererImpl.this.r2(descriptor, builder);
        }

        public void z(TypeParameterDescriptor descriptor, StringBuilder builder) {
            Intrinsics.j(descriptor, "descriptor");
            Intrinsics.j(builder, "builder");
            DescriptorRendererImpl.this.x2(descriptor, builder, true);
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RenderingFormat.values().length];
            try {
                iArr[RenderingFormat.f146092a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderingFormat.f146093b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ParameterNameRenderingPolicy.values().length];
            try {
                iArr2[ParameterNameRenderingPolicy.f146082a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.f146083b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ParameterNameRenderingPolicy.f146084c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I1(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor r18, java.lang.StringBuilder r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.I1(kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, java.lang.StringBuilder):void");
    }

    private final void K1(List<? extends ReceiverParameterDescriptor> list, StringBuilder sb2) {
        if (list.isEmpty()) {
            return;
        }
        sb2.append("context(");
        int i10 = 0;
        for (ReceiverParameterDescriptor receiverParameterDescriptor : list) {
            int i11 = i10 + 1;
            A1(sb2, receiverParameterDescriptor, AnnotationUseSiteTarget.f143677h);
            KotlinType type = receiverParameterDescriptor.getType();
            Intrinsics.i(type, "getType(...)");
            sb2.append(O1(type));
            if (i10 == CollectionsKt.o(list)) {
                sb2.append(") ");
            } else {
                sb2.append(", ");
            }
            i10 = i11;
        }
    }

    private final void L1(StringBuilder sb2, KotlinType kotlinType) {
        B1(this, sb2, kotlinType, null, 2, null);
        DefinitelyNotNullType definitelyNotNullType = kotlinType instanceof DefinitelyNotNullType ? (DefinitelyNotNullType) kotlinType : null;
        SimpleType simpleTypeW0 = definitelyNotNullType != null ? definitelyNotNullType.W0() : null;
        if (KotlinTypeKt.a(kotlinType)) {
            if (TypeUtilsKt.z(kotlinType) && P0()) {
                sb2.append(M1(ErrorUtils.f146990a.p(kotlinType)));
            } else {
                if (!(kotlinType instanceof ErrorType) || I0()) {
                    sb2.append(kotlinType.K0().toString());
                } else {
                    sb2.append(((ErrorType) kotlinType).T0());
                }
                sb2.append(s2(kotlinType.I0()));
            }
        } else if (kotlinType instanceof StubTypeForBuilderInference) {
            sb2.append(((StubTypeForBuilderInference) kotlinType).T0().toString());
        } else if (simpleTypeW0 instanceof StubTypeForBuilderInference) {
            sb2.append(((StubTypeForBuilderInference) simpleTypeW0).T0().toString());
        } else {
            w2(this, sb2, kotlinType, null, 2, null);
            Unit unit = Unit.f142422a;
        }
        if (kotlinType.L0()) {
            sb2.append("?");
        }
        if (SpecialTypesKt.c(kotlinType)) {
            sb2.append(" & Any");
        }
    }

    private final void o0(StringBuilder sb2, List<? extends TypeProjection> list) throws IOException {
        CollectionsKt___CollectionsKt.y0(list, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new n(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r2(TypeAliasDescriptor typeAliasDescriptor, StringBuilder sb2) {
        B1(this, sb2, typeAliasDescriptor, null, 2, null);
        DescriptorVisibility visibility = typeAliasDescriptor.getVisibility();
        Intrinsics.i(visibility, "getVisibility(...)");
        F2(visibility, sb2);
        V1(typeAliasDescriptor, sb2);
        sb2.append(T1("typealias"));
        sb2.append(" ");
        a2(typeAliasDescriptor, sb2, true);
        List<TypeParameterDescriptor> listP = typeAliasDescriptor.p();
        Intrinsics.i(listP, "getDeclaredTypeParameters(...)");
        z2(listP, sb2, false);
        C1(typeAliasDescriptor, sb2);
        sb2.append(" = ");
        sb2.append(T(typeAliasDescriptor.q0()));
    }

    public Function1<ValueParameterDescriptor, String> A0() {
        return this.f145998m.B();
    }

    public boolean B0() {
        return this.f145998m.C();
    }

    public Set<FqName> C0() {
        return this.f145998m.D();
    }

    public boolean E0() {
        return this.f145998m.E();
    }

    public boolean F0() {
        return this.f145998m.F();
    }

    public boolean G0() {
        return this.f145998m.G();
    }

    public boolean H0() {
        return this.f145998m.H();
    }

    public boolean I0() {
        return this.f145998m.I();
    }

    public Set<DescriptorRendererModifier> J0() {
        return this.f145998m.J();
    }

    public boolean K0() {
        return this.f145998m.K();
    }

    public OverrideRenderingPolicy M0() {
        return this.f145998m.L();
    }

    public ParameterNameRenderingPolicy N0() {
        return this.f145998m.M();
    }

    public boolean O0() {
        return this.f145998m.N();
    }

    public boolean P0() {
        return this.f145998m.O();
    }

    public PropertyAccessorRenderingPolicy Q0() {
        return this.f145998m.P();
    }

    public boolean R0() {
        return this.f145998m.R();
    }

    public boolean S0() {
        return this.f145998m.S();
    }

    public boolean T0() {
        return this.f145998m.T();
    }

    public boolean U0() {
        return this.f145998m.U();
    }

    public boolean V0() {
        return this.f145998m.V();
    }

    public boolean W0() {
        return this.f145998m.W();
    }

    public boolean X0() {
        return this.f145998m.X();
    }

    public boolean Y0() {
        return this.f145998m.Y();
    }

    public boolean Z0() {
        return this.f145998m.Z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void a(boolean z10) {
        this.f145998m.a(z10);
    }

    public boolean a1() {
        return this.f145998m.a0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void b(ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        Intrinsics.j(parameterNameRenderingPolicy, "<set-?>");
        this.f145998m.b(parameterNameRenderingPolicy);
    }

    public boolean b1() {
        return this.f145998m.b0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void c(boolean z10) {
        this.f145998m.c(z10);
    }

    public boolean c1() {
        return this.f145998m.c0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean d() {
        return this.f145998m.d();
    }

    public boolean d1() {
        return this.f145998m.d0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void e(boolean z10) {
        this.f145998m.e(z10);
    }

    public boolean e1() {
        return this.f145998m.e0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void f(boolean z10) {
        this.f145998m.f(z10);
    }

    public RenderingFormat f1() {
        return this.f145998m.f0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void g(RenderingFormat renderingFormat) {
        Intrinsics.j(renderingFormat, "<set-?>");
        this.f145998m.g(renderingFormat);
    }

    public Function1<KotlinType, KotlinType> g1() {
        return this.f145998m.g0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void h(AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        Intrinsics.j(annotationArgumentsRenderingPolicy, "<set-?>");
        this.f145998m.h(annotationArgumentsRenderingPolicy);
    }

    public boolean h1() {
        return this.f145998m.h0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public Set<FqName> i() {
        return this.f145998m.i();
    }

    public boolean i1() {
        return this.f145998m.i0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean j() {
        return this.f145998m.j();
    }

    public DescriptorRenderer.ValueParametersHandler j1() {
        return this.f145998m.j0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public AnnotationArgumentsRenderingPolicy k() {
        return this.f145998m.k();
    }

    public boolean k1() {
        return this.f145998m.k0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void l(Set<FqName> set) {
        Intrinsics.j(set, "<set-?>");
        this.f145998m.l(set);
    }

    public boolean l1() {
        return this.f145998m.l0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void m(Set<? extends DescriptorRendererModifier> set) {
        Intrinsics.j(set, "<set-?>");
        this.f145998m.m(set);
    }

    public boolean m1() {
        return this.f145998m.m0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void n(boolean z10) {
        this.f145998m.n(z10);
    }

    public boolean n1() {
        return this.f145998m.n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void o(ClassifierNamePolicy classifierNamePolicy) {
        Intrinsics.j(classifierNamePolicy, "<set-?>");
        this.f145998m.o(classifierNamePolicy);
    }

    public boolean o1() {
        return this.f145998m.o0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void p(boolean z10) {
        this.f145998m.p(z10);
    }

    public boolean p1() {
        return this.f145998m.p0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void q(boolean z10) {
        this.f145998m.q(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z10) {
        this.f145998m.setDebugMode(z10);
    }

    public boolean u0() {
        return this.f145998m.v();
    }

    public boolean v0() {
        return this.f145998m.w();
    }

    public Function1<AnnotationDescriptor, Boolean> w0() {
        return this.f145998m.x();
    }

    public boolean x0() {
        return this.f145998m.y();
    }

    public boolean y0() {
        return this.f145998m.z();
    }

    public ClassifierNamePolicy z0() {
        return this.f145998m.A();
    }

    public DescriptorRendererImpl(DescriptorRendererOptionsImpl options) {
        Intrinsics.j(options, "options");
        this.f145998m = options;
        options.q0();
        this.f145999n = LazyKt.b(new l(this));
    }

    private final void A2(VariableDescriptor variableDescriptor, StringBuilder sb2, boolean z10) {
        if (z10 || !(variableDescriptor instanceof ValueParameterDescriptor)) {
            sb2.append(T1(variableDescriptor.L() ? "var" : "val"));
            sb2.append(" ");
        }
    }

    static /* synthetic */ void B1(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb2, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        descriptorRendererImpl.A1(sb2, annotated, annotationUseSiteTarget);
    }

    static /* synthetic */ void B2(DescriptorRendererImpl descriptorRendererImpl, VariableDescriptor variableDescriptor, StringBuilder sb2, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        descriptorRendererImpl.A2(variableDescriptor, sb2, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C2(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r9, boolean r10, java.lang.StringBuilder r11, boolean r12) {
        /*
            r8 = this;
            if (r12 == 0) goto L10
            java.lang.String r2 = "value-parameter"
            java.lang.String r2 = r8.T1(r2)
            r11.append(r2)
            java.lang.String r2 = " "
            r11.append(r2)
        L10:
            boolean r2 = r8.k1()
            if (r2 == 0) goto L27
            java.lang.String r2 = "/*"
            r11.append(r2)
            int r2 = r9.getIndex()
            r11.append(r2)
        */
        //  java.lang.String r2 = "*/ "
        /*
            r11.append(r2)
        L27:
            r4 = 2
            r5 = 0
            r3 = 0
            r0 = r8
            r2 = r9
            r1 = r11
            B1(r0, r1, r2, r3, r4, r5)
            boolean r2 = r9.o0()
            java.lang.String r3 = "crossinline"
            r8.Z1(r11, r2, r3)
            boolean r2 = r9.m0()
            java.lang.String r3 = "noinline"
            r8.Z1(r11, r2, r3)
            boolean r2 = r8.Z0()
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L60
            kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r2 = r9.b()
            boolean r3 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor
            if (r3 == 0) goto L55
            kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor) r2
            goto L56
        L55:
            r2 = 0
        L56:
            if (r2 == 0) goto L60
            boolean r2 = r2.z()
            if (r2 != r7) goto L60
            r5 = r7
            goto L61
        L60:
            r5 = r6
        L61:
            if (r5 == 0) goto L6c
            boolean r2 = r8.u0()
            java.lang.String r3 = "actual"
            r8.Z1(r11, r2, r3)
        L6c:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0.E2(r1, r2, r3, r4, r5)
            kotlin.jvm.functions.Function1 r0 = r8.A0()
            if (r0 == 0) goto L8c
            boolean r0 = r8.j()
            if (r0 == 0) goto L85
            boolean r0 = r9.x0()
            goto L89
        L85:
            boolean r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.f(r9)
        L89:
            if (r0 == 0) goto L8c
            r6 = r7
        L8c:
            if (r6 == 0) goto Laf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = " = "
            r0.append(r2)
            kotlin.jvm.functions.Function1 r2 = r8.A0()
            kotlin.jvm.internal.Intrinsics.g(r2)
            java.lang.Object r2 = r2.invoke(r9)
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.append(r0)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererImpl.C2(kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor, boolean, java.lang.StringBuilder, boolean):void");
    }

    private final DescriptorRendererImpl D0() {
        return (DescriptorRendererImpl) this.f145999n.getValue();
    }

    private final void E1(ClassDescriptor classDescriptor, StringBuilder sb2) {
        sb2.append(T1(DescriptorRenderer.f145985a.a(classDescriptor)));
    }

    private final String H1(ConstantValue<?> constantValue) {
        Function1<ConstantValue<?>, String> function1Q = this.f145998m.Q();
        if (function1Q != null) {
            return function1Q.invoke(constantValue);
        }
        if (constantValue instanceof ArrayValue) {
            List<? extends ConstantValue<?>> listB = ((ArrayValue) constantValue).b();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                String strH1 = H1((ConstantValue) it.next());
                if (strH1 != null) {
                    arrayList.add(strH1);
                }
            }
            return CollectionsKt.B0(arrayList, ", ", "{", "}", 0, null, null, 56, null);
        }
        if (constantValue instanceof AnnotationValue) {
            return StringsKt.J0(DescriptorRenderer.P(this, ((AnnotationValue) constantValue).b(), null, 2, null), "@");
        }
        if (!(constantValue instanceof KClassValue)) {
            return constantValue.toString();
        }
        KClassValue.Value valueB = ((KClassValue) constantValue).b();
        if (valueB instanceof KClassValue.Value.LocalClass) {
            return ((KClassValue.Value.LocalClass) valueB).a() + "::class";
        }
        if (!(valueB instanceof KClassValue.Value.NormalClass)) {
            throw new NoWhenBranchMatchedException();
        }
        KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) valueB;
        String strA = normalClass.b().a().a();
        for (int i10 = 0; i10 < normalClass.a(); i10++) {
            strA = "kotlin.Array<" + strA + '>';
        }
        return strA + "::class";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence J1(ValueParameterDescriptor valueParameterDescriptor) {
        return "";
    }

    private final void Z1(StringBuilder sb2, boolean z10, String str) {
        if (z10) {
            sb2.append(T1(str));
            sb2.append(" ");
        }
    }

    private final void c2(StringBuilder sb2, KotlinType kotlinType) {
        if ((kotlinType instanceof WrappedType) && j() && !((WrappedType) kotlinType).P0()) {
            sb2.append("<Not computed yet>");
            return;
        }
        UnwrappedType unwrappedTypeN0 = kotlinType.N0();
        if (unwrappedTypeN0 instanceof FlexibleType) {
            sb2.append(((FlexibleType) unwrappedTypeN0).U0(this, this));
        } else {
            if (!(unwrappedTypeN0 instanceof SimpleType)) {
                throw new NoWhenBranchMatchedException();
            }
            m2(sb2, (SimpleType) unwrappedTypeN0);
        }
    }

    private final void m2(StringBuilder sb2, SimpleType simpleType) {
        if (Intrinsics.e(simpleType, TypeUtils.f146792b) || TypeUtils.k(simpleType)) {
            sb2.append("???");
            return;
        }
        if (ErrorUtils.o(simpleType)) {
            if (!h1()) {
                sb2.append("???");
                return;
            }
            TypeConstructor typeConstructorK0 = simpleType.K0();
            Intrinsics.h(typeConstructorK0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.error.ErrorTypeConstructor");
            sb2.append(M1(((ErrorTypeConstructor) typeConstructorK0).g(0)));
            return;
        }
        if (KotlinTypeKt.a(simpleType)) {
            L1(sb2, simpleType);
        } else if (H2(simpleType)) {
            R1(sb2, simpleType);
        } else {
            L1(sb2, simpleType);
        }
    }

    private final void n0(StringBuilder sb2, DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor declarationDescriptorB;
        String name;
        if ((declarationDescriptor instanceof PackageFragmentDescriptor) || (declarationDescriptor instanceof PackageViewDescriptor) || (declarationDescriptorB = declarationDescriptor.b()) == null || (declarationDescriptorB instanceof ModuleDescriptor)) {
            return;
        }
        sb2.append(" ");
        sb2.append(W1("defined in"));
        sb2.append(" ");
        FqNameUnsafe fqNameUnsafeM = DescriptorUtils.m(declarationDescriptorB);
        Intrinsics.i(fqNameUnsafeM, "getFqName(...)");
        sb2.append(fqNameUnsafeM.e() ? "root package" : R(fqNameUnsafeM));
        if (m1() && (declarationDescriptorB instanceof PackageFragmentDescriptor) && (declarationDescriptor instanceof DeclarationDescriptorWithSource) && (name = ((DeclarationDescriptorWithSource) declarationDescriptor).g().b().getName()) != null) {
            sb2.append(" ");
            sb2.append(W1("in file"));
            sb2.append(" ");
            sb2.append(name);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence p0(DescriptorRendererImpl descriptorRendererImpl, TypeProjection it) {
        Intrinsics.j(it, "it");
        if (it.a()) {
            return "*";
        }
        KotlinType type = it.getType();
        Intrinsics.i(type, "getType(...)");
        String strT = descriptorRendererImpl.T(type);
        if (it.c() == Variance.f146796e) {
            return strT;
        }
        return it.c() + ' ' + strT;
    }

    private final String q1() {
        return r0(">");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DescriptorRendererImpl s0(DescriptorRendererImpl descriptorRendererImpl) {
        DescriptorRenderer descriptorRendererV = descriptorRendererImpl.V(q.f146112a);
        Intrinsics.h(descriptorRendererV, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        return (DescriptorRendererImpl) descriptorRendererV;
    }

    private final Modality s1(MemberDescriptor memberDescriptor) {
        if (memberDescriptor instanceof ClassDescriptor) {
            return ((ClassDescriptor) memberDescriptor).f() == ClassKind.f143586c ? Modality.f143622e : Modality.f143619b;
        }
        DeclarationDescriptor declarationDescriptorB = memberDescriptor.b();
        ClassDescriptor classDescriptor = declarationDescriptorB instanceof ClassDescriptor ? (ClassDescriptor) declarationDescriptorB : null;
        if (classDescriptor == null) {
            return Modality.f143619b;
        }
        if (!(memberDescriptor instanceof CallableMemberDescriptor)) {
            return Modality.f143619b;
        }
        CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) memberDescriptor;
        Collection<? extends CallableMemberDescriptor> collectionD = callableMemberDescriptor.d();
        Intrinsics.i(collectionD, "getOverriddenDescriptors(...)");
        if (!collectionD.isEmpty() && classDescriptor.q() != Modality.f143619b) {
            return Modality.f143621d;
        }
        if (classDescriptor.f() != ClassKind.f143586c || Intrinsics.e(callableMemberDescriptor.getVisibility(), DescriptorVisibilities.f143596a)) {
            return Modality.f143619b;
        }
        Modality modalityQ = callableMemberDescriptor.q();
        Modality modality = Modality.f143622e;
        return modalityQ == modality ? modality : Modality.f143621d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t0(DescriptorRendererOptions withOptions) {
        Intrinsics.j(withOptions, "$this$withOptions");
        withOptions.l(SetsKt.l(withOptions.i(), CollectionsKt.p(StandardNames.FqNames.f143324C, StandardNames.FqNames.f143326D)));
        return Unit.f142422a;
    }

    private final String u1() {
        return r0("<");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object u2(KotlinType it) {
        Intrinsics.j(it, "it");
        return it instanceof StubTypeForBuilderInference ? ((StubTypeForBuilderInference) it).T0() : it;
    }

    static /* synthetic */ void w2(DescriptorRendererImpl descriptorRendererImpl, StringBuilder sb2, KotlinType kotlinType, TypeConstructor typeConstructor, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeConstructor = kotlinType.K0();
        }
        descriptorRendererImpl.v2(sb2, kotlinType, typeConstructor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x2(TypeParameterDescriptor typeParameterDescriptor, StringBuilder sb2, boolean z10) {
        if (z10) {
            sb2.append(u1());
        }
        if (k1()) {
            sb2.append("/*");
            sb2.append(typeParameterDescriptor.getIndex());
            sb2.append("*/ ");
        }
        Z1(sb2, typeParameterDescriptor.v(), "reified");
        String strE = typeParameterDescriptor.k().e();
        boolean z11 = true;
        Z1(sb2, strE.length() > 0, strE);
        B1(this, sb2, typeParameterDescriptor, null, 2, null);
        a2(typeParameterDescriptor, sb2, z10);
        int size = typeParameterDescriptor.getUpperBounds().size();
        if ((size > 1 && !z10) || size == 1) {
            KotlinType next = typeParameterDescriptor.getUpperBounds().iterator().next();
            if (!KotlinBuiltIns.k0(next)) {
                sb2.append(" : ");
                Intrinsics.g(next);
                sb2.append(T(next));
            }
        } else if (z10) {
            for (KotlinType kotlinType : typeParameterDescriptor.getUpperBounds()) {
                if (!KotlinBuiltIns.k0(kotlinType)) {
                    if (z11) {
                        sb2.append(" : ");
                    } else {
                        sb2.append(" & ");
                    }
                    Intrinsics.g(kotlinType);
                    sb2.append(T(kotlinType));
                    z11 = false;
                }
            }
        }
        if (z10) {
            sb2.append(q1());
        }
    }

    public String F1(ClassifierDescriptor klass) {
        Intrinsics.j(klass, "klass");
        return ErrorUtils.m(klass) ? klass.i().toString() : z0().a(klass, this);
    }

    public final DescriptorRendererOptionsImpl L0() {
        return this.f145998m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String N(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.j(declarationDescriptor, "declarationDescriptor");
        StringBuilder sb2 = new StringBuilder();
        declarationDescriptor.x(new RenderDeclarationDescriptorVisitor(), sb2);
        if (l1()) {
            n0(sb2, declarationDescriptor);
        }
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String O(AnnotationDescriptor annotation, AnnotationUseSiteTarget annotationUseSiteTarget) throws IOException {
        Intrinsics.j(annotation, "annotation");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('@');
        if (annotationUseSiteTarget != null) {
            sb2.append(annotationUseSiteTarget.b() + ':');
        }
        KotlinType type = annotation.getType();
        sb2.append(T(type));
        if (F0()) {
            List<String> listZ1 = z1(annotation);
            if (G0() || !listZ1.isEmpty()) {
                CollectionsKt___CollectionsKt.y0(listZ1, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
            }
        }
        if (k1() && (KotlinTypeKt.a(type) || (type.K0().d() instanceof NotFoundClasses.MockClassDescriptor))) {
            sb2.append(" /* annotation class not found */");
        }
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String Q(String lowerRendered, String upperRendered, KotlinBuiltIns builtIns) {
        Intrinsics.j(lowerRendered, "lowerRendered");
        Intrinsics.j(upperRendered, "upperRendered");
        Intrinsics.j(builtIns, "builtIns");
        if (RenderingUtilsKt.f(lowerRendered, upperRendered)) {
            if (!StringsKt.W(upperRendered, "(", false, 2, null)) {
                return lowerRendered + '!';
            }
            return '(' + lowerRendered + ")!";
        }
        ClassifierNamePolicy classifierNamePolicyZ0 = z0();
        ClassDescriptor classDescriptorX = builtIns.x();
        Intrinsics.i(classDescriptorX, "getCollection(...)");
        String strS1 = StringsKt.s1(classifierNamePolicyZ0.a(classDescriptorX, this), "Collection", null, 2, null);
        String strD = RenderingUtilsKt.d(lowerRendered, strS1 + "Mutable", upperRendered, strS1, strS1 + "(Mutable)");
        if (strD != null) {
            return strD;
        }
        String strD2 = RenderingUtilsKt.d(lowerRendered, strS1 + "MutableMap.MutableEntry", upperRendered, strS1 + "Map.Entry", strS1 + "(Mutable)Map.(Mutable)Entry");
        if (strD2 != null) {
            return strD2;
        }
        ClassifierNamePolicy classifierNamePolicyZ02 = z0();
        ClassDescriptor classDescriptorJ = builtIns.j();
        Intrinsics.i(classDescriptorJ, "getArray(...)");
        String strS12 = StringsKt.s1(classifierNamePolicyZ02.a(classDescriptorJ, this), "Array", null, 2, null);
        String strD3 = RenderingUtilsKt.d(lowerRendered, strS12 + r0("Array<"), upperRendered, strS12 + r0("Array<out "), strS12 + r0("Array<(out) "));
        if (strD3 != null) {
            return strD3;
        }
        return '(' + lowerRendered + ".." + upperRendered + ')';
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String R(FqNameUnsafe fqName) {
        Intrinsics.j(fqName, "fqName");
        return P1(fqName.h());
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String S(Name name, boolean z10) {
        Intrinsics.j(name, "name");
        String strR0 = r0(RenderingUtilsKt.b(name));
        if (!x0() || f1() != RenderingFormat.f146093b || !z10) {
            return strR0;
        }
        return "<b>" + strR0 + "</b>";
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String T(KotlinType type) {
        Intrinsics.j(type, "type");
        StringBuilder sb2 = new StringBuilder();
        b2(sb2, g1().invoke(type));
        return sb2.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer
    public String U(TypeProjection typeProjection) throws IOException {
        Intrinsics.j(typeProjection, "typeProjection");
        StringBuilder sb2 = new StringBuilder();
        o0(sb2, CollectionsKt.e(typeProjection));
        return sb2.toString();
    }

    public String W1(String message) {
        Intrinsics.j(message, "message");
        int i10 = WhenMappings.$EnumSwitchMapping$0[f1().ordinal()];
        if (i10 == 1) {
            return message;
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return "<i>" + message + "</i>";
    }

    public String s2(List<? extends TypeProjection> typeArguments) throws IOException {
        Intrinsics.j(typeArguments, "typeArguments");
        if (typeArguments.isEmpty()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(u1());
        o0(sb2, typeArguments);
        sb2.append(q1());
        return sb2.toString();
    }

    public String t2(TypeConstructor typeConstructor) {
        Intrinsics.j(typeConstructor, "typeConstructor");
        ClassifierDescriptor classifierDescriptorD = typeConstructor.d();
        if ((classifierDescriptorD instanceof TypeParameterDescriptor) || (classifierDescriptorD instanceof ClassDescriptor) || (classifierDescriptorD instanceof TypeAliasDescriptor)) {
            return F1(classifierDescriptorD);
        }
        if (classifierDescriptorD == null) {
            return typeConstructor instanceof IntersectionTypeConstructor ? ((IntersectionTypeConstructor) typeConstructor).n(m.f146108a) : typeConstructor.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + classifierDescriptorD.getClass()).toString());
    }

    private final void A1(StringBuilder sb2, Annotated annotated, AnnotationUseSiteTarget annotationUseSiteTarget) {
        Set<FqName> setC0;
        if (J0().contains(DescriptorRendererModifier.f146007h)) {
            if (annotated instanceof KotlinType) {
                setC0 = i();
            } else {
                setC0 = C0();
            }
            Function1<AnnotationDescriptor, Boolean> function1W0 = w0();
            for (AnnotationDescriptor annotationDescriptor : annotated.getAnnotations()) {
                if (!CollectionsKt.h0(setC0, annotationDescriptor.e()) && !t1(annotationDescriptor) && (function1W0 == null || function1W0.invoke(annotationDescriptor).booleanValue())) {
                    sb2.append(O(annotationDescriptor, annotationUseSiteTarget));
                    if (B0()) {
                        sb2.append('\n');
                    } else {
                        sb2.append(" ");
                    }
                }
            }
        }
    }

    private final void C1(ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters, StringBuilder sb2) {
        List<TypeParameterDescriptor> listP = classifierDescriptorWithTypeParameters.p();
        Intrinsics.i(listP, "getDeclaredTypeParameters(...)");
        List<TypeParameterDescriptor> parameters = classifierDescriptorWithTypeParameters.i().getParameters();
        Intrinsics.i(parameters, "getParameters(...)");
        if (k1() && classifierDescriptorWithTypeParameters.y() && parameters.size() > listP.size()) {
            sb2.append(" /*captured type parameters: ");
            y2(sb2, parameters.subList(listP.size(), parameters.size()));
            sb2.append("*/");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D1(ClassDescriptor classDescriptor, StringBuilder sb2) throws IOException {
        boolean z10;
        ClassConstructorDescriptor classConstructorDescriptorC;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (classDescriptor.f() == ClassKind.f143588e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!e1()) {
            List<ReceiverParameterDescriptor> listW = classDescriptor.W();
            Intrinsics.i(listW, "getContextReceivers(...)");
            K1(listW, sb2);
            B1(this, sb2, classDescriptor, null, 2, null);
            if (!z10) {
                DescriptorVisibility visibility = classDescriptor.getVisibility();
                Intrinsics.i(visibility, "getVisibility(...)");
                F2(visibility, sb2);
            }
            if ((classDescriptor.f() != ClassKind.f143586c || classDescriptor.q() != Modality.f143622e) && (!classDescriptor.f().b() || classDescriptor.q() != Modality.f143619b)) {
                Modality modalityQ = classDescriptor.q();
                Intrinsics.i(modalityQ, "getModality(...)");
                X1(modalityQ, sb2, s1(classDescriptor));
            }
            V1(classDescriptor, sb2);
            if (J0().contains(DescriptorRendererModifier.f146008i) && classDescriptor.y()) {
                z11 = true;
            } else {
                z11 = false;
            }
            Z1(sb2, z11, "inner");
            if (J0().contains(DescriptorRendererModifier.f146010k) && classDescriptor.F0()) {
                z12 = true;
            } else {
                z12 = false;
            }
            Z1(sb2, z12, "data");
            if (J0().contains(DescriptorRendererModifier.f146011l) && classDescriptor.isInline()) {
                z13 = true;
            } else {
                z13 = false;
            }
            Z1(sb2, z13, "inline");
            if (J0().contains(DescriptorRendererModifier.f146017r) && classDescriptor.r()) {
                z14 = true;
            } else {
                z14 = false;
            }
            Z1(sb2, z14, "value");
            if (J0().contains(DescriptorRendererModifier.f146016q) && classDescriptor.b0()) {
                z15 = true;
            } else {
                z15 = false;
            }
            Z1(sb2, z15, "fun");
            E1(classDescriptor, sb2);
        }
        if (!DescriptorUtils.x(classDescriptor)) {
            if (!e1()) {
                n2(sb2);
            }
            a2(classDescriptor, sb2, true);
        } else {
            G1(classDescriptor, sb2);
        }
        if (z10) {
            return;
        }
        List<TypeParameterDescriptor> listP = classDescriptor.p();
        Intrinsics.i(listP, "getDeclaredTypeParameters(...)");
        z2(listP, sb2, false);
        C1(classDescriptor, sb2);
        if (!classDescriptor.f().b() && y0() && (classConstructorDescriptorC = classDescriptor.C()) != null) {
            sb2.append(" ");
            B1(this, sb2, classConstructorDescriptorC, null, 2, null);
            DescriptorVisibility visibility2 = classConstructorDescriptorC.getVisibility();
            Intrinsics.i(visibility2, "getVisibility(...)");
            F2(visibility2, sb2);
            sb2.append(T1("constructor"));
            List<ValueParameterDescriptor> listH = classConstructorDescriptorC.h();
            Intrinsics.i(listH, "getValueParameters(...)");
            D2(listH, classConstructorDescriptorC.d0(), sb2);
        }
        o2(classDescriptor, sb2);
        G2(listP, sb2);
    }

    private final void D2(Collection<? extends ValueParameterDescriptor> collection, boolean z10, StringBuilder sb2) {
        boolean zI2 = I2(z10);
        int size = collection.size();
        j1().b(size, sb2);
        int i10 = 0;
        for (ValueParameterDescriptor valueParameterDescriptor : collection) {
            j1().a(valueParameterDescriptor, i10, size, sb2);
            C2(valueParameterDescriptor, zI2, sb2, false);
            j1().c(valueParameterDescriptor, i10, size, sb2);
            i10++;
        }
        j1().d(size, sb2);
    }

    private final void E2(VariableDescriptor variableDescriptor, boolean z10, StringBuilder sb2, boolean z11, boolean z12) {
        ValueParameterDescriptor valueParameterDescriptor;
        KotlinType kotlinType;
        boolean z13;
        KotlinType type = variableDescriptor.getType();
        Intrinsics.i(type, "getType(...)");
        KotlinType kotlinTypeS0 = null;
        if (variableDescriptor instanceof ValueParameterDescriptor) {
            valueParameterDescriptor = (ValueParameterDescriptor) variableDescriptor;
        } else {
            valueParameterDescriptor = null;
        }
        if (valueParameterDescriptor != null) {
            kotlinTypeS0 = valueParameterDescriptor.s0();
        }
        if (kotlinTypeS0 == null) {
            kotlinType = type;
        } else {
            kotlinType = kotlinTypeS0;
        }
        if (kotlinTypeS0 != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        Z1(sb2, z13, "vararg");
        if (z12 || (z11 && !e1())) {
            A2(variableDescriptor, sb2, z12);
        }
        if (z10) {
            a2(variableDescriptor, sb2, z11);
            sb2.append(": ");
        }
        sb2.append(T(kotlinType));
        S1(variableDescriptor, sb2);
        if (k1() && kotlinTypeS0 != null) {
            sb2.append(" /*");
            sb2.append(T(type));
            sb2.append("*/");
        }
    }

    private final boolean F2(DescriptorVisibility descriptorVisibility, StringBuilder sb2) {
        if (!J0().contains(DescriptorRendererModifier.f146004e)) {
            return false;
        }
        if (K0()) {
            descriptorVisibility = descriptorVisibility.f();
        }
        if (!Y0() && Intrinsics.e(descriptorVisibility, DescriptorVisibilities.f143607l)) {
            return false;
        }
        sb2.append(T1(descriptorVisibility.c()));
        sb2.append(" ");
        return true;
    }

    private final void G1(DeclarationDescriptor declarationDescriptor, StringBuilder sb2) {
        if (T0()) {
            if (e1()) {
                sb2.append("companion object");
            }
            n2(sb2);
            DeclarationDescriptor declarationDescriptorB = declarationDescriptor.b();
            if (declarationDescriptorB != null) {
                sb2.append("of ");
                Name name = declarationDescriptorB.getName();
                Intrinsics.i(name, "getName(...)");
                sb2.append(S(name, false));
            }
        }
        if (!k1() && Intrinsics.e(declarationDescriptor.getName(), SpecialNames.f145697d)) {
            return;
        }
        if (!e1()) {
            n2(sb2);
        }
        Name name2 = declarationDescriptor.getName();
        Intrinsics.i(name2, "getName(...)");
        sb2.append(S(name2, true));
    }

    private final void G2(List<? extends TypeParameterDescriptor> list, StringBuilder sb2) throws IOException {
        if (!p1()) {
            ArrayList arrayList = new ArrayList(0);
            for (TypeParameterDescriptor typeParameterDescriptor : list) {
                List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
                Intrinsics.i(upperBounds, "getUpperBounds(...)");
                for (KotlinType kotlinType : CollectionsKt.j0(upperBounds, 1)) {
                    StringBuilder sb3 = new StringBuilder();
                    Name name = typeParameterDescriptor.getName();
                    Intrinsics.i(name, "getName(...)");
                    sb3.append(S(name, false));
                    sb3.append(" : ");
                    Intrinsics.g(kotlinType);
                    sb3.append(T(kotlinType));
                    arrayList.add(sb3.toString());
                }
            }
            if (!arrayList.isEmpty()) {
                sb2.append(" ");
                sb2.append(T1("where"));
                sb2.append(" ");
                CollectionsKt___CollectionsKt.y0(arrayList, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
            }
        }
    }

    private final boolean H2(KotlinType kotlinType) {
        if (FunctionTypesKt.p(kotlinType)) {
            List<TypeProjection> listI0 = kotlinType.I0();
            if (!(listI0 instanceof Collection) || !listI0.isEmpty()) {
                Iterator<T> it = listI0.iterator();
                while (it.hasNext()) {
                    if (((TypeProjection) it.next()).a()) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    private final boolean I2(boolean z10) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[N0().ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!z10) {
            return true;
        }
        return false;
    }

    private final String M1(String str) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[f1().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return "<font color=red><b>" + str + "</b></font>";
            }
            throw new NoWhenBranchMatchedException();
        }
        return str;
    }

    private final void N1(StringBuilder sb2, AbbreviatedType abbreviatedType) {
        RenderingFormat renderingFormatF1 = f1();
        RenderingFormat renderingFormat = RenderingFormat.f146093b;
        if (renderingFormatF1 == renderingFormat) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("= ");
        c2(sb2, abbreviatedType.F());
        sb2.append(" */");
        if (f1() == renderingFormat) {
            sb2.append("</i></font>");
        }
    }

    private final String O1(KotlinType kotlinType) {
        String strT = T(kotlinType);
        if ((H2(kotlinType) && !TypeUtils.l(kotlinType)) || (kotlinType instanceof DefinitelyNotNullType)) {
            return '(' + strT + ')';
        }
        return strT;
    }

    private final String P1(List<Name> list) {
        return r0(RenderingUtilsKt.c(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q1(FunctionDescriptor functionDescriptor, StringBuilder sb2) throws IOException {
        FunctionDescriptor functionDescriptor2;
        StringBuilder sb3;
        String strT;
        if (!e1()) {
            if (!d1()) {
                List<ReceiverParameterDescriptor> listU0 = functionDescriptor.u0();
                Intrinsics.i(listU0, "getContextReceiverParameters(...)");
                K1(listU0, sb2);
                functionDescriptor2 = functionDescriptor;
                sb3 = sb2;
                B1(this, sb3, functionDescriptor2, null, 2, null);
                DescriptorVisibility visibility = functionDescriptor2.getVisibility();
                Intrinsics.i(visibility, "getVisibility(...)");
                F2(visibility, sb3);
                Y1(functionDescriptor2, sb3);
                if (E0()) {
                    V1(functionDescriptor2, sb3);
                }
                d2(functionDescriptor2, sb3);
                if (E0()) {
                    y1(functionDescriptor2, sb3);
                } else {
                    q2(functionDescriptor2, sb3);
                }
                U1(functionDescriptor2, sb3);
                if (k1()) {
                    if (functionDescriptor2.z0()) {
                        sb3.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (functionDescriptor2.C0()) {
                        sb3.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            } else {
                functionDescriptor2 = functionDescriptor;
                sb3 = sb2;
            }
            sb3.append(T1("fun"));
            sb3.append(" ");
            List<TypeParameterDescriptor> typeParameters = functionDescriptor2.getTypeParameters();
            Intrinsics.i(typeParameters, "getTypeParameters(...)");
            z2(typeParameters, sb3, true);
            k2(functionDescriptor2, sb3);
        } else {
            functionDescriptor2 = functionDescriptor;
            sb3 = sb2;
        }
        a2(functionDescriptor2, sb3, true);
        List<ValueParameterDescriptor> listH = functionDescriptor2.h();
        Intrinsics.i(listH, "getValueParameters(...)");
        D2(listH, functionDescriptor2.d0(), sb3);
        l2(functionDescriptor2, sb3);
        KotlinType returnType = functionDescriptor2.getReturnType();
        if (!n1() && (i1() || returnType == null || !KotlinBuiltIns.D0(returnType))) {
            sb3.append(": ");
            if (returnType == null) {
                strT = "[NULL]";
            } else {
                strT = T(returnType);
            }
            sb3.append(strT);
        }
        List<TypeParameterDescriptor> typeParameters2 = functionDescriptor2.getTypeParameters();
        Intrinsics.i(typeParameters2, "getTypeParameters(...)");
        G2(typeParameters2, sb3);
    }

    private final void R1(StringBuilder sb2, KotlinType kotlinType) {
        boolean z10;
        boolean z11;
        Name nameD;
        boolean z12;
        int length = sb2.length();
        B1(D0(), sb2, kotlinType, null, 2, null);
        if (sb2.length() != length) {
            z10 = true;
        } else {
            z10 = false;
        }
        KotlinType kotlinTypeK = FunctionTypesKt.k(kotlinType);
        List<KotlinType> listE = FunctionTypesKt.e(kotlinType);
        boolean zR = FunctionTypesKt.r(kotlinType);
        boolean zL0 = kotlinType.L0();
        if (!zL0 && (!z10 || kotlinTypeK == null)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            if (zR) {
                sb2.insert(length, '(');
            } else {
                if (z10) {
                    CharsKt.c(StringsKt.H1(sb2));
                    if (sb2.charAt(StringsKt.j0(sb2) - 1) != ')') {
                        sb2.insert(StringsKt.j0(sb2), "()");
                    }
                }
                sb2.append("(");
            }
        }
        if (!listE.isEmpty()) {
            sb2.append("context(");
            Iterator<KotlinType> it = listE.subList(0, CollectionsKt.o(listE)).iterator();
            while (it.hasNext()) {
                b2(sb2, it.next());
                sb2.append(", ");
            }
            b2(sb2, (KotlinType) CollectionsKt.D0(listE));
            sb2.append(") ");
        }
        Z1(sb2, zR, "suspend");
        if (kotlinTypeK != null) {
            if ((!H2(kotlinTypeK) || kotlinTypeK.L0()) && !r1(kotlinTypeK) && !(kotlinTypeK instanceof DefinitelyNotNullType)) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (z12) {
                sb2.append("(");
            }
            b2(sb2, kotlinTypeK);
            if (z12) {
                sb2.append(")");
            }
            sb2.append(".");
        }
        sb2.append("(");
        if (FunctionTypesKt.n(kotlinType) && kotlinType.I0().size() <= 1) {
            sb2.append("???");
        } else {
            int i10 = 0;
            for (TypeProjection typeProjection : FunctionTypesKt.m(kotlinType)) {
                int i11 = i10 + 1;
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (O0()) {
                    KotlinType type = typeProjection.getType();
                    Intrinsics.i(type, "getType(...)");
                    nameD = FunctionTypesKt.d(type);
                } else {
                    nameD = null;
                }
                if (nameD != null) {
                    sb2.append(S(nameD, false));
                    sb2.append(": ");
                }
                sb2.append(U(typeProjection));
                i10 = i11;
            }
        }
        sb2.append(") ");
        sb2.append(q0());
        sb2.append(" ");
        b2(sb2, FunctionTypesKt.l(kotlinType));
        if (z11) {
            sb2.append(")");
        }
        if (zL0) {
            sb2.append("?");
        }
    }

    private final void S1(VariableDescriptor variableDescriptor, StringBuilder sb2) {
        ConstantValue<?> constantValueL0;
        String strH1;
        if (H0() && (constantValueL0 = variableDescriptor.l0()) != null && (strH1 = H1(constantValueL0)) != null) {
            sb2.append(" = ");
            sb2.append(r0(strH1));
        }
    }

    private final String T1(String str) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[f1().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                if (!x0()) {
                    return "<b>" + str + "</b>";
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return str;
    }

    private final void U1(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (J0().contains(DescriptorRendererModifier.f146009j) && k1() && callableMemberDescriptor.f() != CallableMemberDescriptor.Kind.DECLARATION) {
            sb2.append("/*");
            sb2.append(CapitalizeDecapitalizeKt.f(callableMemberDescriptor.f().name()));
            sb2.append("*/ ");
        }
    }

    private final void V1(MemberDescriptor memberDescriptor, StringBuilder sb2) {
        boolean z10;
        Z1(sb2, memberDescriptor.isExternal(), "external");
        boolean z11 = false;
        if (J0().contains(DescriptorRendererModifier.f146012m) && memberDescriptor.h0()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Z1(sb2, z10, "expect");
        if (J0().contains(DescriptorRendererModifier.f146013n) && memberDescriptor.V()) {
            z11 = true;
        }
        Z1(sb2, z11, "actual");
    }

    private final void X1(Modality modality, StringBuilder sb2, Modality modality2) {
        if (!X0() && modality == modality2) {
            return;
        }
        Z1(sb2, J0().contains(DescriptorRendererModifier.f146005f), CapitalizeDecapitalizeKt.f(modality.name()));
    }

    private final void Y1(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (!DescriptorUtils.J(callableMemberDescriptor) || callableMemberDescriptor.q() != Modality.f143619b) {
            if (M0() == OverrideRenderingPolicy.f146077a && callableMemberDescriptor.q() == Modality.f143621d && v1(callableMemberDescriptor)) {
                return;
            }
            Modality modalityQ = callableMemberDescriptor.q();
            Intrinsics.i(modalityQ, "getModality(...)");
            X1(modalityQ, sb2, s1(callableMemberDescriptor));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a2(DeclarationDescriptor declarationDescriptor, StringBuilder sb2, boolean z10) {
        Name name = declarationDescriptor.getName();
        Intrinsics.i(name, "getName(...)");
        sb2.append(S(name, z10));
    }

    private final void b2(StringBuilder sb2, KotlinType kotlinType) {
        AbbreviatedType abbreviatedType;
        UnwrappedType unwrappedTypeN0 = kotlinType.N0();
        if (unwrappedTypeN0 instanceof AbbreviatedType) {
            abbreviatedType = (AbbreviatedType) unwrappedTypeN0;
        } else {
            abbreviatedType = null;
        }
        if (abbreviatedType != null) {
            if (a1()) {
                c2(sb2, abbreviatedType.F());
                if (S0()) {
                    w1(sb2, abbreviatedType);
                    return;
                }
                return;
            }
            c2(sb2, abbreviatedType.W0());
            if (b1()) {
                N1(sb2, abbreviatedType);
                return;
            }
            return;
        }
        c2(sb2, kotlinType);
    }

    private final void d2(CallableMemberDescriptor callableMemberDescriptor, StringBuilder sb2) {
        if (J0().contains(DescriptorRendererModifier.f146006g) && v1(callableMemberDescriptor) && M0() != OverrideRenderingPolicy.f146078b) {
            Z1(sb2, true, "override");
            if (k1()) {
                sb2.append("/*");
                sb2.append(callableMemberDescriptor.d().size());
                sb2.append("*/ ");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2(PackageFragmentDescriptor packageFragmentDescriptor, StringBuilder sb2) {
        f2(packageFragmentDescriptor.e(), "package-fragment", sb2);
        if (j()) {
            sb2.append(" in ");
            a2(packageFragmentDescriptor.b(), sb2, false);
        }
    }

    private final void f2(FqName fqName, String str, StringBuilder sb2) {
        sb2.append(T1(str));
        String strR = R(fqName.i());
        if (strR.length() > 0) {
            sb2.append(" ");
            sb2.append(strR);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g2(PackageViewDescriptor packageViewDescriptor, StringBuilder sb2) {
        f2(packageViewDescriptor.e(), "package", sb2);
        if (j()) {
            sb2.append(" in context of ");
            a2(packageViewDescriptor.y0(), sb2, false);
        }
    }

    private final void h2(StringBuilder sb2, PossiblyInnerType possiblyInnerType) {
        PossiblyInnerType possiblyInnerTypeC = possiblyInnerType.c();
        if (possiblyInnerTypeC != null) {
            h2(sb2, possiblyInnerTypeC);
            sb2.append('.');
            Name name = possiblyInnerType.b().getName();
            Intrinsics.i(name, "getName(...)");
            sb2.append(S(name, false));
        } else {
            TypeConstructor typeConstructorI = possiblyInnerType.b().i();
            Intrinsics.i(typeConstructorI, "getTypeConstructor(...)");
            sb2.append(t2(typeConstructorI));
        }
        sb2.append(s2(possiblyInnerType.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i2(PropertyDescriptor propertyDescriptor, StringBuilder sb2) throws IOException {
        PropertyDescriptor propertyDescriptor2;
        StringBuilder sb3;
        boolean z10;
        if (!e1()) {
            if (!d1()) {
                List<ReceiverParameterDescriptor> listU0 = propertyDescriptor.u0();
                Intrinsics.i(listU0, "getContextReceiverParameters(...)");
                K1(listU0, sb2);
                j2(propertyDescriptor, sb2);
                DescriptorVisibility visibility = propertyDescriptor.getVisibility();
                Intrinsics.i(visibility, "getVisibility(...)");
                F2(visibility, sb2);
                boolean z11 = false;
                if (J0().contains(DescriptorRendererModifier.f146014o) && propertyDescriptor.isConst()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Z1(sb2, z10, "const");
                V1(propertyDescriptor, sb2);
                Y1(propertyDescriptor, sb2);
                d2(propertyDescriptor, sb2);
                if (J0().contains(DescriptorRendererModifier.f146015p) && propertyDescriptor.v0()) {
                    z11 = true;
                }
                Z1(sb2, z11, "lateinit");
                U1(propertyDescriptor, sb2);
            }
            propertyDescriptor2 = propertyDescriptor;
            sb3 = sb2;
            B2(this, propertyDescriptor2, sb3, false, 4, null);
            List<TypeParameterDescriptor> typeParameters = propertyDescriptor2.getTypeParameters();
            Intrinsics.i(typeParameters, "getTypeParameters(...)");
            z2(typeParameters, sb3, true);
            k2(propertyDescriptor2, sb3);
        } else {
            propertyDescriptor2 = propertyDescriptor;
            sb3 = sb2;
        }
        a2(propertyDescriptor2, sb3, true);
        sb3.append(": ");
        KotlinType type = propertyDescriptor2.getType();
        Intrinsics.i(type, "getType(...)");
        sb3.append(T(type));
        l2(propertyDescriptor2, sb3);
        S1(propertyDescriptor2, sb3);
        List<TypeParameterDescriptor> typeParameters2 = propertyDescriptor2.getTypeParameters();
        Intrinsics.i(typeParameters2, "getTypeParameters(...)");
        G2(typeParameters2, sb3);
    }

    private final void j2(PropertyDescriptor propertyDescriptor, StringBuilder sb2) {
        if (J0().contains(DescriptorRendererModifier.f146007h)) {
            B1(this, sb2, propertyDescriptor, null, 2, null);
            FieldDescriptor fieldDescriptorT0 = propertyDescriptor.t0();
            if (fieldDescriptorT0 != null) {
                A1(sb2, fieldDescriptorT0, AnnotationUseSiteTarget.f143672c);
            }
            FieldDescriptor fieldDescriptorO = propertyDescriptor.O();
            if (fieldDescriptorO != null) {
                A1(sb2, fieldDescriptorO, AnnotationUseSiteTarget.f143680k);
            }
            if (Q0() == PropertyAccessorRenderingPolicy.f146089c) {
                PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
                if (getter != null) {
                    A1(sb2, getter, AnnotationUseSiteTarget.f143675f);
                }
                PropertySetterDescriptor setter = propertyDescriptor.getSetter();
                if (setter != null) {
                    A1(sb2, setter, AnnotationUseSiteTarget.f143676g);
                    List<ValueParameterDescriptor> listH = setter.h();
                    Intrinsics.i(listH, "getValueParameters(...)");
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt.U0(listH);
                    Intrinsics.g(valueParameterDescriptor);
                    A1(sb2, valueParameterDescriptor, AnnotationUseSiteTarget.f143679j);
                }
            }
        }
    }

    private final void k2(CallableDescriptor callableDescriptor, StringBuilder sb2) {
        ReceiverParameterDescriptor receiverParameterDescriptorN = callableDescriptor.N();
        if (receiverParameterDescriptorN != null) {
            A1(sb2, receiverParameterDescriptorN, AnnotationUseSiteTarget.f143677h);
            KotlinType type = receiverParameterDescriptorN.getType();
            Intrinsics.i(type, "getType(...)");
            sb2.append(O1(type));
            sb2.append(".");
        }
    }

    private final void l2(CallableDescriptor callableDescriptor, StringBuilder sb2) {
        ReceiverParameterDescriptor receiverParameterDescriptorN;
        if (R0() && (receiverParameterDescriptorN = callableDescriptor.N()) != null) {
            sb2.append(" on ");
            KotlinType type = receiverParameterDescriptorN.getType();
            Intrinsics.i(type, "getType(...)");
            sb2.append(T(type));
        }
    }

    private final void n2(StringBuilder sb2) {
        int length = sb2.length();
        if (length != 0 && sb2.charAt(length - 1) == ' ') {
            return;
        }
        sb2.append(' ');
    }

    private final void o2(ClassDescriptor classDescriptor, StringBuilder sb2) throws IOException {
        if (!o1() && !KotlinBuiltIns.o0(classDescriptor.o())) {
            Collection<KotlinType> collectionA = classDescriptor.i().a();
            Intrinsics.i(collectionA, "getSupertypes(...)");
            if (!collectionA.isEmpty()) {
                if (collectionA.size() != 1 || !KotlinBuiltIns.c0(collectionA.iterator().next())) {
                    n2(sb2);
                    sb2.append(": ");
                    CollectionsKt___CollectionsKt.y0(collectionA, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : new p(this));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence p2(DescriptorRendererImpl descriptorRendererImpl, KotlinType kotlinType) {
        Intrinsics.g(kotlinType);
        return descriptorRendererImpl.T(kotlinType);
    }

    private final String q0() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[f1().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return "&rarr;";
            }
            throw new NoWhenBranchMatchedException();
        }
        return r0("->");
    }

    private final void q2(FunctionDescriptor functionDescriptor, StringBuilder sb2) {
        Z1(sb2, functionDescriptor.isSuspend(), "suspend");
    }

    private final String r0(String str) {
        return f1().b(str);
    }

    private final boolean r1(KotlinType kotlinType) {
        if (!FunctionTypesKt.r(kotlinType) && kotlinType.getAnnotations().isEmpty()) {
            return false;
        }
        return true;
    }

    private final boolean t1(AnnotationDescriptor annotationDescriptor) {
        return Intrinsics.e(annotationDescriptor.e(), StandardNames.FqNames.f143328E);
    }

    private final boolean v1(CallableMemberDescriptor callableMemberDescriptor) {
        return !callableMemberDescriptor.d().isEmpty();
    }

    private final void v2(StringBuilder sb2, KotlinType kotlinType, TypeConstructor typeConstructor) {
        PossiblyInnerType possiblyInnerTypeD = TypeParameterUtilsKt.d(kotlinType);
        if (possiblyInnerTypeD == null) {
            sb2.append(t2(typeConstructor));
            sb2.append(s2(kotlinType.I0()));
        } else {
            h2(sb2, possiblyInnerTypeD);
        }
    }

    private final void w1(StringBuilder sb2, AbbreviatedType abbreviatedType) {
        RenderingFormat renderingFormatF1 = f1();
        RenderingFormat renderingFormat = RenderingFormat.f146093b;
        if (renderingFormatF1 == renderingFormat) {
            sb2.append("<font color=\"808080\"><i>");
        }
        sb2.append(" /* ");
        sb2.append("from: ");
        c2(sb2, abbreviatedType.W0());
        sb2.append(" */");
        if (f1() == renderingFormat) {
            sb2.append("</i></font>");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x1(PropertyAccessorDescriptor propertyAccessorDescriptor, StringBuilder sb2) {
        V1(propertyAccessorDescriptor, sb2);
    }

    private final void y1(FunctionDescriptor functionDescriptor, StringBuilder sb2) {
        boolean z10;
        boolean z11 = false;
        if (functionDescriptor.isOperator()) {
            Collection<? extends FunctionDescriptor> collectionD = functionDescriptor.d();
            Intrinsics.i(collectionD, "getOverriddenDescriptors(...)");
            Collection<? extends FunctionDescriptor> collection = collectionD;
            if (!collection.isEmpty()) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((FunctionDescriptor) it.next()).isOperator()) {
                        if (v0()) {
                            break;
                        }
                    }
                }
                z10 = false;
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (functionDescriptor.isInfix()) {
            Collection<? extends FunctionDescriptor> collectionD2 = functionDescriptor.d();
            Intrinsics.i(collectionD2, "getOverriddenDescriptors(...)");
            Collection<? extends FunctionDescriptor> collection2 = collectionD2;
            if (!collection2.isEmpty()) {
                Iterator<T> it2 = collection2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (((FunctionDescriptor) it2.next()).isInfix()) {
                        if (v0()) {
                            break;
                        }
                    }
                }
            } else {
                z11 = true;
            }
        }
        Z1(sb2, functionDescriptor.B(), "tailrec");
        q2(functionDescriptor, sb2);
        Z1(sb2, functionDescriptor.isInline(), "inline");
        Z1(sb2, z11, "infix");
        Z1(sb2, z10, "operator");
    }

    private final void y2(StringBuilder sb2, List<? extends TypeParameterDescriptor> list) {
        Iterator<? extends TypeParameterDescriptor> it = list.iterator();
        while (it.hasNext()) {
            x2(it.next(), sb2, false);
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
    }

    private final List<String> z1(AnnotationDescriptor annotationDescriptor) {
        ClassDescriptor classDescriptorL;
        String strH1;
        ClassConstructorDescriptor classConstructorDescriptorC;
        List<ValueParameterDescriptor> listH;
        Map<Name, ConstantValue<?>> mapA = annotationDescriptor.a();
        List listM = null;
        if (W0()) {
            classDescriptorL = DescriptorUtilsKt.l(annotationDescriptor);
        } else {
            classDescriptorL = null;
        }
        if (classDescriptorL != null && (classConstructorDescriptorC = classDescriptorL.C()) != null && (listH = classConstructorDescriptorC.h()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listH) {
                if (((ValueParameterDescriptor) obj).x0()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ValueParameterDescriptor) it.next()).getName());
            }
            listM = arrayList2;
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM) {
            if (!mapA.containsKey((Name) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(CollectionsKt.x(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((Name) it2.next()).b() + " = ...");
        }
        Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = mapA.entrySet();
        ArrayList arrayList5 = new ArrayList(CollectionsKt.x(setEntrySet, 10));
        Iterator<T> it3 = setEntrySet.iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            Name name = (Name) entry.getKey();
            ConstantValue<?> constantValue = (ConstantValue) entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(name.b());
            sb2.append(" = ");
            if (!listM.contains(name)) {
                strH1 = H1(constantValue);
            } else {
                strH1 = "...";
            }
            sb2.append(strH1);
            arrayList5.add(sb2.toString());
        }
        return CollectionsKt.Y0(CollectionsKt.P0(arrayList4, arrayList5));
    }

    private final void z2(List<? extends TypeParameterDescriptor> list, StringBuilder sb2, boolean z10) {
        if (!p1() && !list.isEmpty()) {
            sb2.append(u1());
            y2(sb2, list);
            sb2.append(q1());
            if (z10) {
                sb2.append(" ");
            }
        }
    }
}
