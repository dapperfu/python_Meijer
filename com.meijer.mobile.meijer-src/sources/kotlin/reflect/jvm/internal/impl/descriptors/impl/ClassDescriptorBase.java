package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* loaded from: classes14.dex */
public abstract class ClassDescriptorBase extends AbstractClassDescriptor {

    /* renamed from: f, reason: collision with root package name */
    private final DeclarationDescriptor f144725f;

    /* renamed from: g, reason: collision with root package name */
    private final SourceElement f144726g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f144727h;

    private static /* synthetic */ void B0(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i10 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected ClassDescriptorBase(StorageManager storageManager, DeclarationDescriptor declarationDescriptor, Name name, SourceElement sourceElement, boolean z10) {
        super(storageManager, name);
        if (storageManager == null) {
            B0(0);
        }
        if (declarationDescriptor == null) {
            B0(1);
        }
        if (name == null) {
            B0(2);
        }
        if (sourceElement == null) {
            B0(3);
        }
        this.f144725f = declarationDescriptor;
        this.f144726g = sourceElement;
        this.f144727h = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public DeclarationDescriptor b() {
        DeclarationDescriptor declarationDescriptor = this.f144725f;
        if (declarationDescriptor == null) {
            B0(4);
        }
        return declarationDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithSource
    public SourceElement g() {
        SourceElement sourceElement = this.f144726g;
        if (sourceElement == null) {
            B0(5);
        }
        return sourceElement;
    }

    public boolean isExternal() {
        return this.f144727h;
    }
}
