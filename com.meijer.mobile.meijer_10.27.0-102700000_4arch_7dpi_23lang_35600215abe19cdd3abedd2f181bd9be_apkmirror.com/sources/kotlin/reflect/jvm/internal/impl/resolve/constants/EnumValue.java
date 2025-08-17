package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class EnumValue extends ConstantValue<Pair<? extends ClassId, ? extends Name>> {

    /* renamed from: b, reason: collision with root package name */
    private final ClassId f146176b;

    /* renamed from: c, reason: collision with root package name */
    private final Name f146177c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumValue(ClassId enumClassId, Name enumEntryName) {
        super(TuplesKt.a(enumClassId, enumEntryName));
        Intrinsics.j(enumClassId, "enumClassId");
        Intrinsics.j(enumEntryName, "enumEntryName");
        this.f146176b = enumClassId;
        this.f146177c = enumEntryName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public KotlinType a(ModuleDescriptor module) {
        SimpleType simpleTypeO;
        Intrinsics.j(module, "module");
        ClassDescriptor classDescriptorB = FindClassInModuleKt.b(module, this.f146176b);
        if (classDescriptorB != null) {
            if (!DescriptorUtils.A(classDescriptorB)) {
                classDescriptorB = null;
            }
            if (classDescriptorB != null && (simpleTypeO = classDescriptorB.o()) != null) {
                return simpleTypeO;
            }
        }
        return ErrorUtils.d(ErrorTypeKind.f146983x0, this.f146176b.toString(), this.f146177c.toString());
    }

    public final Name c() {
        return this.f146177c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f146176b.h());
        sb2.append('.');
        sb2.append(this.f146177c);
        return sb2.toString();
    }
}
