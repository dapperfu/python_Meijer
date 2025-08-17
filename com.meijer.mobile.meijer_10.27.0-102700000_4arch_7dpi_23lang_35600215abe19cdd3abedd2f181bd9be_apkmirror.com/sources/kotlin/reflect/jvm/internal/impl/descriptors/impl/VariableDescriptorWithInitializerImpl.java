package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes13.dex */
public abstract class VariableDescriptorWithInitializerImpl extends VariableDescriptorImpl {

    /* renamed from: f, reason: collision with root package name */
    private final boolean f144015f;

    /* renamed from: g, reason: collision with root package name */
    protected NullableLazyValue<ConstantValue<?>> f144016g;

    /* renamed from: h, reason: collision with root package name */
    protected Function0<NullableLazyValue<ConstantValue<?>>> f144017h;

    private static /* synthetic */ void e0(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "annotations";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i10 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i10 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariableDescriptorWithInitializerImpl(DeclarationDescriptor declarationDescriptor, Annotations annotations, Name name, KotlinType kotlinType, boolean z10, SourceElement sourceElement) {
        super(declarationDescriptor, annotations, name, kotlinType, sourceElement);
        if (declarationDescriptor == null) {
            e0(0);
        }
        if (annotations == null) {
            e0(1);
        }
        if (name == null) {
            e0(2);
        }
        if (sourceElement == null) {
            e0(3);
        }
        this.f144015f = z10;
    }

    public void I0(NullableLazyValue<ConstantValue<?>> nullableLazyValue, Function0<NullableLazyValue<ConstantValue<?>>> function0) {
        if (function0 == null) {
            e0(5);
        }
        this.f144017h = function0;
        if (nullableLazyValue == null) {
            nullableLazyValue = function0.invoke();
        }
        this.f144016g = nullableLazyValue;
    }

    public void J0(Function0<NullableLazyValue<ConstantValue<?>>> function0) {
        if (function0 == null) {
            e0(4);
        }
        I0(null, function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean L() {
        return this.f144015f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public ConstantValue<?> l0() {
        NullableLazyValue<ConstantValue<?>> nullableLazyValue = this.f144016g;
        if (nullableLazyValue != null) {
            return nullableLazyValue.invoke();
        }
        return null;
    }
}
