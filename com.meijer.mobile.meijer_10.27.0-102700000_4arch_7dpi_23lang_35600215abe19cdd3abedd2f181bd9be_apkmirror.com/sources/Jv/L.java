package Jv;

import Fv.m;
import Iv.AbstractC3761b;
import Iv.EnumC3760a;
import Iv.InterfaceC3765f;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00020\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LDv/h;", "serializer", "actualSerializer", "", "classDiscriminator", "", "d", "(LDv/h;LDv/h;Ljava/lang/String;)V", "LFv/m;", "kind", "b", "(LFv/m;)V", "LFv/f;", "LIv/b;", "json", "c", "(LFv/f;LIv/b;)Ljava/lang/String;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class L {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC3760a.values().length];
            try {
                iArr[EnumC3760a.f14392a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3760a.f14394c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3760a.f14393b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void b(Fv.m kind) {
        Intrinsics.j(kind, "kind");
        if (kind instanceof m.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof Fv.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof Fv.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(Fv.f fVar, AbstractC3761b json) {
        Intrinsics.j(fVar, "<this>");
        Intrinsics.j(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof InterfaceC3765f) {
                return ((InterfaceC3765f) annotation).discriminator();
            }
        }
        return json.getConfiguration().getClassDiscriminator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Dv.h<?> hVar, Dv.h<?> hVar2, String str) {
        if ((hVar instanceof Dv.g) && Hv.F.a(hVar2.getDescriptor()).contains(str)) {
            String serialName = ((Dv.g) hVar).getDescriptor().getSerialName();
            throw new IllegalStateException(("Sealed class '" + hVar2.getDescriptor().getSerialName() + "' cannot be serialized as base class '" + serialName + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
