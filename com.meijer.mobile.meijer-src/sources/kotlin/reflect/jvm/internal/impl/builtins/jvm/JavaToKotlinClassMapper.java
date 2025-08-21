package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

@SourceDebugExtension
/* loaded from: classes14.dex */
public final class JavaToKotlinClassMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final JavaToKotlinClassMapper f144419a = new JavaToKotlinClassMapper();

    public static /* synthetic */ ClassDescriptor f(JavaToKotlinClassMapper javaToKotlinClassMapper, FqName fqName, KotlinBuiltIns kotlinBuiltIns, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        return javaToKotlinClassMapper.e(fqName, kotlinBuiltIns, num);
    }

    public final ClassDescriptor a(ClassDescriptor mutable) {
        Intrinsics.j(mutable, "mutable");
        FqName fqNameO = JavaToKotlinClassMap.f144399a.o(DescriptorUtils.m(mutable));
        if (fqNameO != null) {
            ClassDescriptor classDescriptorP = DescriptorUtilsKt.m(mutable).p(fqNameO);
            Intrinsics.i(classDescriptorP, "getBuiltInClassByFqName(...)");
            return classDescriptorP;
        }
        throw new IllegalArgumentException("Given class " + mutable + " is not a mutable collection");
    }

    public final ClassDescriptor b(ClassDescriptor readOnly) {
        Intrinsics.j(readOnly, "readOnly");
        FqName fqNameP = JavaToKotlinClassMap.f144399a.p(DescriptorUtils.m(readOnly));
        if (fqNameP != null) {
            ClassDescriptor classDescriptorP = DescriptorUtilsKt.m(readOnly).p(fqNameP);
            Intrinsics.i(classDescriptorP, "getBuiltInClassByFqName(...)");
            return classDescriptorP;
        }
        throw new IllegalArgumentException("Given class " + readOnly + " is not a read-only collection");
    }

    public final boolean c(ClassDescriptor mutable) {
        Intrinsics.j(mutable, "mutable");
        return JavaToKotlinClassMap.f144399a.k(DescriptorUtils.m(mutable));
    }

    public final boolean d(ClassDescriptor readOnly) {
        Intrinsics.j(readOnly, "readOnly");
        return JavaToKotlinClassMap.f144399a.l(DescriptorUtils.m(readOnly));
    }

    public final ClassDescriptor e(FqName fqName, KotlinBuiltIns builtIns, Integer num) {
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(builtIns, "builtIns");
        ClassId classIdM = (num == null || !Intrinsics.e(fqName, JavaToKotlinClassMap.f144399a.h())) ? JavaToKotlinClassMap.f144399a.m(fqName) : StandardNames.a(num.intValue());
        if (classIdM != null) {
            return builtIns.p(classIdM.a());
        }
        return null;
    }

    public final Collection<ClassDescriptor> g(FqName fqName, KotlinBuiltIns builtIns) {
        Intrinsics.j(fqName, "fqName");
        Intrinsics.j(builtIns, "builtIns");
        ClassDescriptor classDescriptorF = f(this, fqName, builtIns, null, 4, null);
        if (classDescriptorF == null) {
            return SetsKt.e();
        }
        FqName fqNameP = JavaToKotlinClassMap.f144399a.p(DescriptorUtilsKt.p(classDescriptorF));
        return fqNameP == null ? SetsKt.d(classDescriptorF) : CollectionsKt.p(classDescriptorF, builtIns.p(fqNameP));
    }

    private JavaToKotlinClassMapper() {
    }
}
