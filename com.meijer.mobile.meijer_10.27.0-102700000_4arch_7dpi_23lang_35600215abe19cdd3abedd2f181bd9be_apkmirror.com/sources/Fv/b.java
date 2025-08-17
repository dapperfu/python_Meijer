package Fv;

import Hv.m0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\"$\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"LMv/c;", "LFv/f;", "descriptor", "b", "(LMv/c;LFv/f;)LFv/f;", "Lkotlin/reflect/KClass;", "context", "c", "(LFv/f;Lkotlin/reflect/KClass;)LFv/f;", "a", "(LFv/f;)Lkotlin/reflect/KClass;", "getCapturedKClass$annotations", "(LFv/f;)V", "capturedKClass", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class b {
    public static final KClass<?> a(f fVar) {
        Intrinsics.j(fVar, "<this>");
        if (fVar instanceof ContextDescriptor) {
            return ((ContextDescriptor) fVar).kClass;
        }
        if (fVar instanceof m0) {
            return a(((m0) fVar).getOriginal());
        }
        return null;
    }

    public static final f b(Mv.c cVar, f descriptor) {
        Dv.b bVarC;
        Intrinsics.j(cVar, "<this>");
        Intrinsics.j(descriptor, "descriptor");
        KClass<?> kClassA = a(descriptor);
        if (kClassA == null || (bVarC = Mv.c.c(cVar, kClassA, null, 2, null)) == null) {
            return null;
        }
        return bVarC.getDescriptor();
    }

    public static final f c(f fVar, KClass<?> context) {
        Intrinsics.j(fVar, "<this>");
        Intrinsics.j(context, "context");
        return new ContextDescriptor(fVar, context);
    }
}
