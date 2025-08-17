package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes13.dex */
public class TypeParameterDescriptorImpl extends AbstractTypeParameterDescriptor {

    /* renamed from: k, reason: collision with root package name */
    private final Function1<KotlinType, Void> f144003k;

    /* renamed from: l, reason: collision with root package name */
    private final List<KotlinType> f144004l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f144005m;

    private static /* synthetic */ void e0(int i10) {
        String str = (i10 == 5 || i10 == 28) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 28) ? 2 : 3];
        switch (i10) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i10 == 5) {
            objArr[1] = "createWithDefaultBound";
        } else if (i10 != 28) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i10) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 28) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private TypeParameterDescriptorImpl(DeclarationDescriptor declarationDescriptor, Annotations annotations, boolean z10, Variance variance, Name name, int i10, SourceElement sourceElement, Function1<KotlinType, Void> function1, SupertypeLoopChecker supertypeLoopChecker, StorageManager storageManager) {
        super(storageManager, declarationDescriptor, annotations, name, variance, z10, i10, sourceElement, supertypeLoopChecker);
        if (declarationDescriptor == null) {
            e0(19);
        }
        if (annotations == null) {
            e0(20);
        }
        if (variance == null) {
            e0(21);
        }
        if (name == null) {
            e0(22);
        }
        if (sourceElement == null) {
            e0(23);
        }
        if (supertypeLoopChecker == null) {
            e0(24);
        }
        if (storageManager == null) {
            e0(25);
        }
        this.f144004l = new ArrayList(1);
        this.f144005m = false;
        this.f144003k = function1;
    }

    private void K0() {
        if (this.f144005m) {
            return;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + R0());
    }

    private void L0() {
        if (this.f144005m) {
            throw new IllegalStateException("Type parameter descriptor is already initialized: " + R0());
        }
    }

    public static TypeParameterDescriptorImpl M0(DeclarationDescriptor declarationDescriptor, Annotations annotations, boolean z10, Variance variance, Name name, int i10, SourceElement sourceElement, Function1<KotlinType, Void> function1, SupertypeLoopChecker supertypeLoopChecker, StorageManager storageManager) {
        if (declarationDescriptor == null) {
            e0(12);
        }
        if (annotations == null) {
            e0(13);
        }
        if (variance == null) {
            e0(14);
        }
        if (name == null) {
            e0(15);
        }
        if (sourceElement == null) {
            e0(16);
        }
        if (supertypeLoopChecker == null) {
            e0(17);
        }
        if (storageManager == null) {
            e0(18);
        }
        return new TypeParameterDescriptorImpl(declarationDescriptor, annotations, z10, variance, name, i10, sourceElement, function1, supertypeLoopChecker, storageManager);
    }

    public static TypeParameterDescriptorImpl N0(DeclarationDescriptor declarationDescriptor, Annotations annotations, boolean z10, Variance variance, Name name, int i10, SourceElement sourceElement, StorageManager storageManager) {
        if (declarationDescriptor == null) {
            e0(6);
        }
        if (annotations == null) {
            e0(7);
        }
        if (variance == null) {
            e0(8);
        }
        if (name == null) {
            e0(9);
        }
        if (sourceElement == null) {
            e0(10);
        }
        if (storageManager == null) {
            e0(11);
        }
        return M0(declarationDescriptor, annotations, z10, variance, name, i10, sourceElement, null, SupertypeLoopChecker.EMPTY.f143649a, storageManager);
    }

    public static TypeParameterDescriptor O0(DeclarationDescriptor declarationDescriptor, Annotations annotations, boolean z10, Variance variance, Name name, int i10, StorageManager storageManager) {
        if (declarationDescriptor == null) {
            e0(0);
        }
        if (annotations == null) {
            e0(1);
        }
        if (variance == null) {
            e0(2);
        }
        if (name == null) {
            e0(3);
        }
        if (storageManager == null) {
            e0(4);
        }
        TypeParameterDescriptorImpl typeParameterDescriptorImplN0 = N0(declarationDescriptor, annotations, z10, variance, name, i10, SourceElement.f143647a, storageManager);
        typeParameterDescriptorImplN0.J0(DescriptorUtilsKt.m(declarationDescriptor).z());
        typeParameterDescriptorImplN0.S0();
        return typeParameterDescriptorImplN0;
    }

    private String R0() {
        return getName() + " declared in " + DescriptorUtils.m(b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    protected void H0(KotlinType kotlinType) {
        if (kotlinType == null) {
            e0(27);
        }
        Function1<KotlinType, Void> function1 = this.f144003k;
        if (function1 == null) {
            return;
        }
        function1.invoke(kotlinType);
    }

    public void J0(KotlinType kotlinType) {
        if (kotlinType == null) {
            e0(26);
        }
        L0();
        P0(kotlinType);
    }

    public boolean Q0() {
        return this.f144005m;
    }

    private void P0(KotlinType kotlinType) {
        if (KotlinTypeKt.a(kotlinType)) {
            return;
        }
        this.f144004l.add(kotlinType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    protected List<KotlinType> I0() {
        K0();
        List<KotlinType> list = this.f144004l;
        if (list == null) {
            e0(28);
        }
        return list;
    }

    public void S0() {
        L0();
        this.f144005m = true;
    }
}
