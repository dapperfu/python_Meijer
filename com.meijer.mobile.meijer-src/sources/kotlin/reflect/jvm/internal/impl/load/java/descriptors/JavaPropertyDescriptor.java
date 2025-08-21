package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import com.google.android.gms.common.api.b;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstUtil;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
public class JavaPropertyDescriptor extends PropertyDescriptorImpl implements JavaCallableMemberDescriptor {

    /* renamed from: C, reason: collision with root package name */
    private final boolean f145281C;

    /* renamed from: D, reason: collision with root package name */
    private final Pair<CallableDescriptor.UserDataKey<?>, ?> f145282D;

    /* renamed from: E, reason: collision with root package name */
    private KotlinType f145283E;

    private static /* synthetic */ void e0(int i10) {
        String str = i10 != 21 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 21 ? 3 : 2];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case b.RECONNECTION_TIMED_OUT /* 22 */:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case b.RECONNECTION_TIMED_OUT /* 22 */:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 == 21) {
            throw new IllegalStateException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean d0() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected JavaPropertyDescriptor(DeclarationDescriptor declarationDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z10, Name name, SourceElement sourceElement, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, boolean z11, Pair<CallableDescriptor.UserDataKey<?>, ?> pair) {
        super(declarationDescriptor, propertyDescriptor, annotations, modality, descriptorVisibility, z10, name, kind, sourceElement, false, false, false, false, false, false);
        if (declarationDescriptor == null) {
            e0(0);
        }
        if (annotations == null) {
            e0(1);
        }
        if (modality == null) {
            e0(2);
        }
        if (descriptorVisibility == null) {
            e0(3);
        }
        if (name == null) {
            e0(4);
        }
        if (sourceElement == null) {
            e0(5);
        }
        if (kind == null) {
            e0(6);
        }
        this.f145283E = null;
        this.f145281C = z11;
        this.f145282D = pair;
    }

    public static JavaPropertyDescriptor d1(DeclarationDescriptor declarationDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z10, Name name, SourceElement sourceElement, boolean z11) {
        if (declarationDescriptor == null) {
            e0(7);
        }
        if (annotations == null) {
            e0(8);
        }
        if (modality == null) {
            e0(9);
        }
        if (descriptorVisibility == null) {
            e0(10);
        }
        if (name == null) {
            e0(11);
        }
        if (sourceElement == null) {
            e0(12);
        }
        return new JavaPropertyDescriptor(declarationDescriptor, annotations, modality, descriptorVisibility, z10, name, sourceElement, null, CallableMemberDescriptor.Kind.DECLARATION, z11, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    protected PropertyDescriptorImpl N0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, Name name, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            e0(13);
        }
        if (modality == null) {
            e0(14);
        }
        if (descriptorVisibility == null) {
            e0(15);
        }
        if (kind == null) {
            e0(16);
        }
        if (name == null) {
            e0(17);
        }
        if (sourceElement == null) {
            e0(18);
        }
        return new JavaPropertyDescriptor(declarationDescriptor, getAnnotations(), modality, descriptorVisibility, L(), name, sourceElement, propertyDescriptor, kind, this.f145281C, this.f145282D);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl
    public void X0(KotlinType kotlinType) {
        if (kotlinType == null) {
            e0(22);
        }
        this.f145283E = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    public JavaCallableMemberDescriptor Y(KotlinType kotlinType, List<KotlinType> list, KotlinType kotlinType2, Pair<CallableDescriptor.UserDataKey<?>, ?> pair) {
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        if (list == null) {
            e0(19);
        }
        if (kotlinType2 == null) {
            e0(20);
        }
        PropertyDescriptor propertyDescriptorH0 = a() == this ? null : a();
        JavaPropertyDescriptor javaPropertyDescriptor = new JavaPropertyDescriptor(b(), getAnnotations(), q(), getVisibility(), L(), getName(), g(), propertyDescriptorH0, f(), this.f145281C, pair);
        PropertyGetterDescriptorImpl getter = getGetter();
        if (getter != null) {
            PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2 = new PropertyGetterDescriptorImpl(javaPropertyDescriptor, getter.getAnnotations(), getter.q(), getter.getVisibility(), getter.E(), getter.isExternal(), getter.isInline(), f(), propertyDescriptorH0 == null ? null : propertyDescriptorH0.getGetter(), getter.g());
            propertyGetterDescriptorImpl2.K0(getter.p0());
            propertyGetterDescriptorImpl2.N0(kotlinType2);
            propertyGetterDescriptorImpl = propertyGetterDescriptorImpl2;
        } else {
            propertyGetterDescriptorImpl = null;
        }
        PropertySetterDescriptor setter = getSetter();
        if (setter != null) {
            propertySetterDescriptorImpl = new PropertySetterDescriptorImpl(javaPropertyDescriptor, setter.getAnnotations(), setter.q(), setter.getVisibility(), setter.E(), setter.isExternal(), setter.isInline(), f(), propertyDescriptorH0 == null ? null : propertyDescriptorH0.getSetter(), setter.g());
            propertySetterDescriptorImpl.K0(propertySetterDescriptorImpl.p0());
            propertySetterDescriptorImpl.O0(setter.h().get(0));
        } else {
            propertySetterDescriptorImpl = null;
        }
        javaPropertyDescriptor.T0(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, t0(), O());
        javaPropertyDescriptor.Y0(U0());
        Function0<NullableLazyValue<ConstantValue<?>>> function0 = this.f144924h;
        if (function0 != null) {
            javaPropertyDescriptor.I0(this.f144923g, function0);
        }
        javaPropertyDescriptor.A0(d());
        javaPropertyDescriptor.Z0(kotlinType2, getTypeParameters(), J(), kotlinType != null ? DescriptorFactory.i(this, kotlinType, Annotations.f144596s3.b()) : null, CollectionsKt.m());
        return javaPropertyDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V r0(CallableDescriptor.UserDataKey<V> userDataKey) {
        Pair<CallableDescriptor.UserDataKey<?>, ?> pair = this.f145282D;
        if (pair == null || !pair.c().equals(userDataKey)) {
            return null;
        }
        return (V) this.f145282D.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        KotlinType type = getType();
        if (this.f145281C && ConstUtil.a(type)) {
            if (!TypeEnhancementKt.i(type) || KotlinBuiltIns.w0(type)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
