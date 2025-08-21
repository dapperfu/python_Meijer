package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes14.dex */
public class ClassTypeConstructorImpl extends AbstractClassTypeConstructor {

    /* renamed from: d, reason: collision with root package name */
    private final ClassDescriptor f147589d;

    /* renamed from: e, reason: collision with root package name */
    private final List<TypeParameterDescriptor> f147590e;

    /* renamed from: f, reason: collision with root package name */
    private final Collection<KotlinType> f147591f;

    private static /* synthetic */ void H(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean e() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClassTypeConstructorImpl(ClassDescriptor classDescriptor, List<? extends TypeParameterDescriptor> list, Collection<KotlinType> collection, StorageManager storageManager) {
        super(storageManager);
        if (classDescriptor == null) {
            H(0);
        }
        if (list == null) {
            H(1);
        }
        if (collection == null) {
            H(2);
        }
        if (storageManager == null) {
            H(3);
        }
        this.f147589d = classDescriptor;
        this.f147590e = Collections.unmodifiableList(new ArrayList(list));
        this.f147591f = Collections.unmodifiableCollection(collection);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor, kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: I */
    public ClassDescriptor d() {
        ClassDescriptor classDescriptor = this.f147589d;
        if (classDescriptor == null) {
            H(5);
        }
        return classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public List<TypeParameterDescriptor> getParameters() {
        List<TypeParameterDescriptor> list = this.f147590e;
        if (list == null) {
            H(4);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    protected Collection<KotlinType> r() {
        Collection<KotlinType> collection = this.f147591f;
        if (collection == null) {
            H(6);
        }
        return collection;
    }

    public String toString() {
        return DescriptorUtils.m(this.f147589d).a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    protected SupertypeLoopChecker v() {
        SupertypeLoopChecker.EMPTY empty = SupertypeLoopChecker.EMPTY.f144556a;
        if (empty == null) {
            H(7);
        }
        return empty;
    }
}
