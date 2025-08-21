package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a'\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\"\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "", "isGetter", "Lkotlin/reflect/jvm/internal/calls/Caller;", "b", "(Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;Z)Lkotlin/reflect/jvm/internal/calls/Caller;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "g", "(Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;)Z", "", "f", "(Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class KPropertyImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.calls.Caller<?> b(kotlin.reflect.jvm.internal.KPropertyImpl.Accessor<?, ?> r7, boolean r8) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPropertyImplKt.b(kotlin.reflect.jvm.internal.KPropertyImpl$Accessor, boolean):kotlin.reflect.jvm.internal.calls.Caller");
    }

    public static final Object f(KPropertyImpl.Accessor<?, ?> accessor) {
        Intrinsics.j(accessor, "<this>");
        return accessor.a().c0();
    }

    private static final CallerImpl<Field> c(KPropertyImpl.Accessor<?, ?> accessor, boolean z10, Field field) {
        if (!g(accessor.a().X()) && Modifier.isStatic(field.getModifiers())) {
            if (d(accessor)) {
                if (z10) {
                    if (accessor.V()) {
                        return new CallerImpl.FieldGetter.BoundJvmStaticInObject(field);
                    }
                    return new CallerImpl.FieldGetter.JvmStaticInObject(field);
                }
                if (accessor.V()) {
                    return new CallerImpl.FieldSetter.BoundJvmStaticInObject(field, e(accessor));
                }
                return new CallerImpl.FieldSetter.JvmStaticInObject(field, e(accessor));
            }
            if (z10) {
                return new CallerImpl.FieldGetter.Static(field);
            }
            return new CallerImpl.FieldSetter.Static(field, e(accessor));
        }
        if (z10) {
            if (accessor.V()) {
                return new CallerImpl.FieldGetter.BoundInstance(field, f(accessor));
            }
            return new CallerImpl.FieldGetter.Instance(field);
        }
        if (accessor.V()) {
            return new CallerImpl.FieldSetter.BoundInstance(field, e(accessor), f(accessor));
        }
        return new CallerImpl.FieldSetter.Instance(field, e(accessor));
    }

    private static final boolean d(KPropertyImpl.Accessor<?, ?> accessor) {
        return accessor.a().X().getAnnotations().p3(UtilKt.j());
    }

    private static final boolean e(KPropertyImpl.Accessor<?, ?> accessor) {
        return !TypeUtils.l(accessor.a().X().getType());
    }

    private static final boolean g(PropertyDescriptor propertyDescriptor) {
        DeclarationDescriptor declarationDescriptorB = propertyDescriptor.b();
        Intrinsics.i(declarationDescriptorB, "getContainingDeclaration(...)");
        if (!DescriptorUtils.x(declarationDescriptorB)) {
            return false;
        }
        DeclarationDescriptor declarationDescriptorB2 = declarationDescriptorB.b();
        if (!DescriptorUtils.C(declarationDescriptorB2) && !DescriptorUtils.t(declarationDescriptorB2)) {
            return true;
        }
        if (!(propertyDescriptor instanceof DeserializedPropertyDescriptor) || !JvmProtoBufUtil.f(((DeserializedPropertyDescriptor) propertyDescriptor).c0())) {
            return false;
        }
        return true;
    }
}
