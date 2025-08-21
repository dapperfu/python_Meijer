package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
public class JavaClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements JavaCallableMemberDescriptor {

    /* renamed from: F, reason: collision with root package name */
    private Boolean f145265F;

    /* renamed from: G, reason: collision with root package name */
    private Boolean f145266G;

    private static /* synthetic */ void e0(int i10) {
        String str = (i10 == 11 || i10 == 18) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 11 || i10 == 18) ? 2 : 3];
        switch (i10) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 == 11) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i10 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 11 && i10 != 18) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected JavaClassConstructorDescriptor(ClassDescriptor classDescriptor, JavaClassConstructorDescriptor javaClassConstructorDescriptor, Annotations annotations, boolean z10, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(classDescriptor, javaClassConstructorDescriptor, annotations, z10, kind, sourceElement);
        if (classDescriptor == null) {
            e0(0);
        }
        if (annotations == null) {
            e0(1);
        }
        if (kind == null) {
            e0(2);
        }
        if (sourceElement == null) {
            e0(3);
        }
        this.f145265F = null;
        this.f145266G = null;
    }

    public static JavaClassConstructorDescriptor q1(ClassDescriptor classDescriptor, Annotations annotations, boolean z10, SourceElement sourceElement) {
        if (classDescriptor == null) {
            e0(4);
        }
        if (annotations == null) {
            e0(5);
        }
        if (sourceElement == null) {
            e0(6);
        }
        return new JavaClassConstructorDescriptor(classDescriptor, null, annotations, z10, CallableMemberDescriptor.Kind.DECLARATION, sourceElement);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public boolean N0() {
        return this.f145265F.booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean d0() {
        return this.f145266G.booleanValue();
    }

    protected JavaClassConstructorDescriptor p1(ClassDescriptor classDescriptor, JavaClassConstructorDescriptor javaClassConstructorDescriptor, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, Annotations annotations) {
        if (classDescriptor == null) {
            e0(12);
        }
        if (kind == null) {
            e0(13);
        }
        if (sourceElement == null) {
            e0(14);
        }
        if (annotations == null) {
            e0(15);
        }
        return new JavaClassConstructorDescriptor(classDescriptor, javaClassConstructorDescriptor, annotations, this.f144724E, kind, sourceElement);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl
    /* renamed from: r1, reason: merged with bridge method [inline-methods] */
    public JavaClassConstructorDescriptor I0(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            e0(7);
        }
        if (kind == null) {
            e0(8);
        }
        if (annotations == null) {
            e0(9);
        }
        if (sourceElement == null) {
            e0(10);
        }
        if (kind == CallableMemberDescriptor.Kind.DECLARATION || kind == CallableMemberDescriptor.Kind.SYNTHESIZED) {
            JavaClassConstructorDescriptor javaClassConstructorDescriptorP1 = p1((ClassDescriptor) declarationDescriptor, (JavaClassConstructorDescriptor) functionDescriptor, kind, sourceElement, annotations);
            javaClassConstructorDescriptorP1.V0(N0());
            javaClassConstructorDescriptorP1.W0(d0());
            return javaClassConstructorDescriptorP1;
        }
        throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + declarationDescriptor + "\nkind: " + kind);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    /* renamed from: s1, reason: merged with bridge method [inline-methods] */
    public JavaClassConstructorDescriptor Y(KotlinType kotlinType, List<KotlinType> list, KotlinType kotlinType2, Pair<CallableDescriptor.UserDataKey<?>, ?> pair) {
        if (list == null) {
            e0(16);
        }
        if (kotlinType2 == null) {
            e0(17);
        }
        JavaClassConstructorDescriptor javaClassConstructorDescriptorI0 = I0(b(), null, f(), null, getAnnotations(), g());
        javaClassConstructorDescriptorI0.O0(kotlinType == null ? null : DescriptorFactory.i(javaClassConstructorDescriptorI0, kotlinType, Annotations.f144596s3.b()), J(), CollectionsKt.m(), getTypeParameters(), UtilKt.a(list, h(), javaClassConstructorDescriptorI0), kotlinType2, q(), getVisibility());
        if (pair != null) {
            javaClassConstructorDescriptorI0.R0(pair.c(), pair.d());
        }
        return javaClassConstructorDescriptorI0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public void V0(boolean z10) {
        this.f145265F = Boolean.valueOf(z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    public void W0(boolean z10) {
        this.f145266G = Boolean.valueOf(z10);
    }
}
