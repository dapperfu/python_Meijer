package kotlin.reflect.jvm.internal;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;", "receiver", "", "c", "(Ljava/lang/StringBuilder;Lkotlin/reflect/jvm/internal/impl/descriptors/ReceiverParameterDescriptor;)V", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;", "callable", "d", "(Ljava/lang/StringBuilder;Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;)V", "descriptor", "", "e", "(Lkotlin/reflect/jvm/internal/impl/descriptors/CallableDescriptor;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "k", "(Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "f", "(Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;)Ljava/lang/String;", "invoke", "h", "Lkotlin/reflect/jvm/internal/KParameterImpl;", "parameter", "j", "(Lkotlin/reflect/jvm/internal/KParameterImpl;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "type", "l", "(Lkotlin/reflect/jvm/internal/impl/types/KotlinType;)Ljava/lang/String;", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "b", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "renderer", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ReflectionObjectRenderer {

    /* renamed from: a, reason: collision with root package name */
    public static final ReflectionObjectRenderer f144042a = new ReflectionObjectRenderer();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final DescriptorRenderer renderer = DescriptorRenderer.f146899h;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KParameter.Kind.values().length];
            try {
                iArr[KParameter.Kind.f143850b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KParameter.Kind.f143849a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KParameter.Kind.f143851c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void c(StringBuilder sb2, ReceiverParameterDescriptor receiverParameterDescriptor) {
        if (receiverParameterDescriptor != null) {
            KotlinType type = receiverParameterDescriptor.getType();
            Intrinsics.i(type, "getType(...)");
            sb2.append(l(type));
            sb2.append(".");
        }
    }

    private final String e(CallableDescriptor descriptor) {
        if (descriptor instanceof PropertyDescriptor) {
            return k((PropertyDescriptor) descriptor);
        }
        if (descriptor instanceof FunctionDescriptor) {
            return f((FunctionDescriptor) descriptor);
        }
        throw new IllegalStateException(("Illegal callable: " + descriptor).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence g(ValueParameterDescriptor valueParameterDescriptor) {
        ReflectionObjectRenderer reflectionObjectRenderer = f144042a;
        KotlinType type = valueParameterDescriptor.getType();
        Intrinsics.i(type, "getType(...)");
        return reflectionObjectRenderer.l(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(ValueParameterDescriptor valueParameterDescriptor) {
        ReflectionObjectRenderer reflectionObjectRenderer = f144042a;
        KotlinType type = valueParameterDescriptor.getType();
        Intrinsics.i(type, "getType(...)");
        return reflectionObjectRenderer.l(type);
    }

    public final String f(FunctionDescriptor descriptor) throws IOException {
        Intrinsics.j(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        ReflectionObjectRenderer reflectionObjectRenderer = f144042a;
        reflectionObjectRenderer.d(sb2, descriptor);
        DescriptorRenderer descriptorRenderer = renderer;
        Name name = descriptor.getName();
        Intrinsics.i(name, "getName(...)");
        sb2.append(descriptorRenderer.S(name, true));
        List<ValueParameterDescriptor> listH = descriptor.h();
        Intrinsics.i(listH, "getValueParameters(...)");
        CollectionsKt___CollectionsKt.y0(listH, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : y0.f148135a);
        sb2.append(": ");
        KotlinType returnType = descriptor.getReturnType();
        Intrinsics.g(returnType);
        sb2.append(reflectionObjectRenderer.l(returnType));
        return sb2.toString();
    }

    public final String h(FunctionDescriptor invoke) throws IOException {
        Intrinsics.j(invoke, "invoke");
        StringBuilder sb2 = new StringBuilder();
        ReflectionObjectRenderer reflectionObjectRenderer = f144042a;
        reflectionObjectRenderer.d(sb2, invoke);
        List<ValueParameterDescriptor> listH = invoke.h();
        Intrinsics.i(listH, "getValueParameters(...)");
        CollectionsKt___CollectionsKt.y0(listH, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : z0.f148137a);
        sb2.append(" -> ");
        KotlinType returnType = invoke.getReturnType();
        Intrinsics.g(returnType);
        sb2.append(reflectionObjectRenderer.l(returnType));
        return sb2.toString();
    }

    public final String j(KParameterImpl parameter) {
        Intrinsics.j(parameter, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i10 = WhenMappings.$EnumSwitchMapping$0[parameter.getKind().ordinal()];
        if (i10 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i10 == 2) {
            sb2.append("instance parameter");
        } else {
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            sb2.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb2.append(" of ");
        sb2.append(f144042a.e(parameter.m().X()));
        return sb2.toString();
    }

    public final String k(PropertyDescriptor descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(descriptor.L() ? "var " : "val ");
        ReflectionObjectRenderer reflectionObjectRenderer = f144042a;
        reflectionObjectRenderer.d(sb2, descriptor);
        DescriptorRenderer descriptorRenderer = renderer;
        Name name = descriptor.getName();
        Intrinsics.i(name, "getName(...)");
        sb2.append(descriptorRenderer.S(name, true));
        sb2.append(": ");
        KotlinType type = descriptor.getType();
        Intrinsics.i(type, "getType(...)");
        sb2.append(reflectionObjectRenderer.l(type));
        return sb2.toString();
    }

    public final String l(KotlinType type) {
        Intrinsics.j(type, "type");
        return renderer.T(type);
    }

    private ReflectionObjectRenderer() {
    }

    private final void d(StringBuilder sb2, CallableDescriptor callableDescriptor) {
        boolean z10;
        ReceiverParameterDescriptor receiverParameterDescriptorI = UtilKt.i(callableDescriptor);
        ReceiverParameterDescriptor receiverParameterDescriptorN = callableDescriptor.N();
        c(sb2, receiverParameterDescriptorI);
        if (receiverParameterDescriptorI != null && receiverParameterDescriptorN != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            sb2.append("(");
        }
        c(sb2, receiverParameterDescriptorN);
        if (z10) {
            sb2.append(")");
        }
    }
}
