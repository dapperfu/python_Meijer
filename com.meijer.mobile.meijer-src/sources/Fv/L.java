package Fv;

import Bv.m;
import Ev.AbstractC3260b;
import Ev.EnumC3259a;
import Ev.InterfaceC3264f;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00020\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lzv/h;", "serializer", "actualSerializer", "", "classDiscriminator", "", "d", "(Lzv/h;Lzv/h;Ljava/lang/String;)V", "LBv/m;", "kind", "b", "(LBv/m;)V", "LBv/f;", "LEv/b;", "json", "c", "(LBv/f;LEv/b;)Ljava/lang/String;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class L {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC3259a.values().length];
            try {
                iArr[EnumC3259a.f8594a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3259a.f8596c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3259a.f8595b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void b(Bv.m kind) {
        Intrinsics.j(kind, "kind");
        if (kind instanceof m.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof Bv.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof Bv.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    public static final String c(Bv.f fVar, AbstractC3260b json) {
        Intrinsics.j(fVar, "<this>");
        Intrinsics.j(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof InterfaceC3264f) {
                return ((InterfaceC3264f) annotation).discriminator();
            }
        }
        return json.getConfiguration().getClassDiscriminator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(zv.h<?> hVar, zv.h<?> hVar2, String str) {
        if ((hVar instanceof zv.g) && Dv.F.a(hVar2.getDescriptor()).contains(str)) {
            String serialName = ((zv.g) hVar).getDescriptor().getSerialName();
            throw new IllegalStateException(("Sealed class '" + hVar2.getDescriptor().getSerialName() + "' cannot be serialized as base class '" + serialName + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
