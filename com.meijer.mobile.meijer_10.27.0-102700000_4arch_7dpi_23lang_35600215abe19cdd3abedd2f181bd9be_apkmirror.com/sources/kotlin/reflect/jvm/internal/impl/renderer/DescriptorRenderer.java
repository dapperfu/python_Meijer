package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* loaded from: classes13.dex */
public abstract class DescriptorRenderer {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f145985a;

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    public static final DescriptorRenderer f145986b;

    /* renamed from: c, reason: collision with root package name */
    @JvmField
    public static final DescriptorRenderer f145987c;

    /* renamed from: d, reason: collision with root package name */
    @JvmField
    public static final DescriptorRenderer f145988d;

    /* renamed from: e, reason: collision with root package name */
    @JvmField
    public static final DescriptorRenderer f145989e;

    /* renamed from: f, reason: collision with root package name */
    @JvmField
    public static final DescriptorRenderer f145990f;

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public static final DescriptorRenderer f145991g;

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public static final DescriptorRenderer f145992h;

    /* renamed from: i, reason: collision with root package name */
    @JvmField
    public static final DescriptorRenderer f145993i;

    /* renamed from: j, reason: collision with root package name */
    @JvmField
    public static final DescriptorRenderer f145994j;

    /* renamed from: k, reason: collision with root package name */
    @JvmField
    public static final DescriptorRenderer f145995k;

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static final DescriptorRenderer f145996l;

    public static final class Companion {

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ClassKind.values().length];
                try {
                    iArr[ClassKind.f143585b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ClassKind.f143586c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ClassKind.f143587d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ClassKind.f143590g.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ClassKind.f143589f.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ClassKind.f143588e.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String a(ClassifierDescriptorWithTypeParameters classifier) {
            Intrinsics.j(classifier, "classifier");
            if (classifier instanceof TypeAliasDescriptor) {
                return "typealias";
            }
            if (!(classifier instanceof ClassDescriptor)) {
                throw new AssertionError("Unexpected classifier: " + classifier);
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) classifier;
            if (classDescriptor.Z()) {
                return "companion object";
            }
            switch (WhenMappings.$EnumSwitchMapping$0[classDescriptor.f().ordinal()]) {
                case 1:
                    return "class";
                case 2:
                    return "interface";
                case 3:
                    return "enum class";
                case 4:
                    return "object";
                case 5:
                    return "annotation class";
                case 6:
                    return "enum entry";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final DescriptorRenderer b(Function1<? super DescriptorRendererOptions, Unit> changeOptions) {
            Intrinsics.j(changeOptions, "changeOptions");
            DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
            changeOptions.invoke(descriptorRendererOptionsImpl);
            descriptorRendererOptionsImpl.r0();
            return new DescriptorRendererImpl(descriptorRendererOptionsImpl);
        }
    }

    public interface ValueParametersHandler {

        public static final class DEFAULT implements ValueParametersHandler {

            /* renamed from: a, reason: collision with root package name */
            public static final DEFAULT f145997a = new DEFAULT();

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void a(ValueParameterDescriptor parameter, int i10, int i11, StringBuilder builder) {
                Intrinsics.j(parameter, "parameter");
                Intrinsics.j(builder, "builder");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void b(int i10, StringBuilder builder) {
                Intrinsics.j(builder, "builder");
                builder.append("(");
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void c(ValueParameterDescriptor parameter, int i10, int i11, StringBuilder builder) {
                Intrinsics.j(parameter, "parameter");
                Intrinsics.j(builder, "builder");
                if (i10 != i11 - 1) {
                    builder.append(", ");
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.ValueParametersHandler
            public void d(int i10, StringBuilder builder) {
                Intrinsics.j(builder, "builder");
                builder.append(")");
            }

            private DEFAULT() {
            }
        }

        void a(ValueParameterDescriptor valueParameterDescriptor, int i10, int i11, StringBuilder sb2);

        void b(int i10, StringBuilder sb2);

        void c(ValueParameterDescriptor valueParameterDescriptor, int i10, int i11, StringBuilder sb2);

        void d(int i10, StringBuilder sb2);
    }

    public abstract String N(DeclarationDescriptor declarationDescriptor);

    public abstract String O(AnnotationDescriptor annotationDescriptor, AnnotationUseSiteTarget annotationUseSiteTarget);

    public abstract String Q(String str, String str2, KotlinBuiltIns kotlinBuiltIns);

    public abstract String R(FqNameUnsafe fqNameUnsafe);

    public abstract String S(Name name, boolean z10);

    public abstract String T(KotlinType kotlinType);

    public abstract String U(TypeProjection typeProjection);

    static {
        Companion companion = new Companion(null);
        f145985a = companion;
        f145986b = companion.b(a.f146096a);
        f145987c = companion.b(c.f146098a);
        f145988d = companion.b(d.f146099a);
        f145989e = companion.b(e.f146100a);
        f145990f = companion.b(f.f146101a);
        f145991g = companion.b(g.f146102a);
        f145992h = companion.b(h.f146103a);
        f145993i = companion.b(i.f146104a);
        f145994j = companion.b(j.f146105a);
        f145995k = companion.b(k.f146106a);
        f145996l = companion.b(b.f146097a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(DescriptorRendererOptions withOptions) {
        Intrinsics.j(withOptions, "$this$withOptions");
        withOptions.o(ClassifierNamePolicy.SHORT.f145983a);
        withOptions.b(ParameterNameRenderingPolicy.f146083b);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(DescriptorRendererOptions withOptions) {
        Intrinsics.j(withOptions, "$this$withOptions");
        withOptions.m(SetsKt.e());
        return Unit.f142422a;
    }

    public static /* synthetic */ String P(DescriptorRenderer descriptorRenderer, AnnotationDescriptor annotationDescriptor, AnnotationUseSiteTarget annotationUseSiteTarget, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i10 & 2) != 0) {
            annotationUseSiteTarget = null;
        }
        return descriptorRenderer.O(annotationDescriptor, annotationUseSiteTarget);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(DescriptorRendererOptions withOptions) {
        Intrinsics.j(withOptions, "$this$withOptions");
        withOptions.c(false);
        withOptions.m(SetsKt.e());
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(DescriptorRendererOptions withOptions) {
        Intrinsics.j(withOptions, "$this$withOptions");
        withOptions.c(false);
        withOptions.m(SetsKt.e());
        withOptions.e(true);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(DescriptorRendererOptions withOptions) {
        Intrinsics.j(withOptions, "$this$withOptions");
        withOptions.c(false);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(DescriptorRendererOptions withOptions) {
        Intrinsics.j(withOptions, "$this$withOptions");
        withOptions.m(SetsKt.e());
        withOptions.o(ClassifierNamePolicy.SHORT.f145983a);
        withOptions.b(ParameterNameRenderingPolicy.f146083b);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(DescriptorRendererOptions withOptions) {
        Intrinsics.j(withOptions, "$this$withOptions");
        withOptions.setDebugMode(true);
        withOptions.o(ClassifierNamePolicy.FULLY_QUALIFIED.f145982a);
        withOptions.m(DescriptorRendererModifier.f146003d);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(DescriptorRendererOptions withOptions) {
        Intrinsics.j(withOptions, "$this$withOptions");
        withOptions.m(DescriptorRendererModifier.f146002c);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(DescriptorRendererOptions withOptions) {
        Intrinsics.j(withOptions, "$this$withOptions");
        withOptions.m(DescriptorRendererModifier.f146003d);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(DescriptorRendererOptions withOptions) {
        Intrinsics.j(withOptions, "$this$withOptions");
        withOptions.g(RenderingFormat.f146093b);
        withOptions.m(DescriptorRendererModifier.f146003d);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(DescriptorRendererOptions withOptions) {
        Intrinsics.j(withOptions, "$this$withOptions");
        withOptions.c(false);
        withOptions.m(SetsKt.e());
        withOptions.o(ClassifierNamePolicy.SHORT.f145983a);
        withOptions.q(true);
        withOptions.b(ParameterNameRenderingPolicy.f146084c);
        withOptions.f(true);
        withOptions.p(true);
        withOptions.e(true);
        withOptions.a(true);
        return Unit.f142422a;
    }

    public final DescriptorRenderer V(Function1<? super DescriptorRendererOptions, Unit> changeOptions) {
        Intrinsics.j(changeOptions, "changeOptions");
        Intrinsics.h(this, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        DescriptorRendererOptionsImpl descriptorRendererOptionsImplT = ((DescriptorRendererImpl) this).L0().t();
        changeOptions.invoke(descriptorRendererOptionsImplT);
        descriptorRendererOptionsImplT.r0();
        return new DescriptorRendererImpl(descriptorRendererOptionsImplT);
    }
}
