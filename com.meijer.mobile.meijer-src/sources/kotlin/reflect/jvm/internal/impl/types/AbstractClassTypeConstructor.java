package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* loaded from: classes14.dex */
public abstract class AbstractClassTypeConstructor extends AbstractTypeConstructor {
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void H(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.AbstractClassTypeConstructor.H(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: I */
    public abstract ClassDescriptor d();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClassTypeConstructor(StorageManager storageManager) {
        super(storageManager);
        if (storageManager == null) {
            H(0);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ClassifierBasedTypeConstructor
    protected boolean h(ClassifierDescriptor classifierDescriptor) {
        if (classifierDescriptor == null) {
            H(2);
        }
        return (classifierDescriptor instanceof ClassDescriptor) && f(d(), classifierDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public KotlinBuiltIns l() {
        KotlinBuiltIns kotlinBuiltInsM = DescriptorUtilsKt.m(d());
        if (kotlinBuiltInsM == null) {
            H(1);
        }
        return kotlinBuiltInsM;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    protected KotlinType s() {
        if (KotlinBuiltIns.v0(d())) {
            return null;
        }
        return l().i();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor
    protected Collection<KotlinType> t(boolean z10) {
        DeclarationDescriptor declarationDescriptorB = d().b();
        if (!(declarationDescriptorB instanceof ClassDescriptor)) {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                H(3);
            }
            return list;
        }
        SmartList smartList = new SmartList();
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptorB;
        smartList.add(classDescriptor.o());
        ClassDescriptor classDescriptorK0 = classDescriptor.k0();
        if (z10 && classDescriptorK0 != null) {
            smartList.add(classDescriptorK0.o());
        }
        return smartList;
    }
}
