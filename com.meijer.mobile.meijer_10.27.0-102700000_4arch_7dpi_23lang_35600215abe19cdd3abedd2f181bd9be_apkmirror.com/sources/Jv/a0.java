package Jv;

import Fv.m;
import Fv.n;
import Iv.AbstractC3761b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LIv/b;", "LFv/f;", "desc", "LJv/Z;", "b", "(LIv/b;LFv/f;)LJv/Z;", "LMv/c;", "module", "a", "(LFv/f;LMv/c;)LFv/f;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class a0 {
    public static final Fv.f a(Fv.f fVar, Mv.c module) {
        Fv.f fVarA;
        Intrinsics.j(fVar, "<this>");
        Intrinsics.j(module, "module");
        if (!Intrinsics.e(fVar.getKind(), m.a.f11131a)) {
            return fVar.getIsInline() ? a(fVar.l(0), module) : fVar;
        }
        Fv.f fVarB = Fv.b.b(module, fVar);
        return (fVarB == null || (fVarA = a(fVarB, module)) == null) ? fVar : fVarA;
    }

    public static final Z b(AbstractC3761b abstractC3761b, Fv.f desc) {
        Intrinsics.j(abstractC3761b, "<this>");
        Intrinsics.j(desc, "desc");
        Fv.m kind = desc.getKind();
        if (kind instanceof Fv.d) {
            return Z.f16228f;
        }
        if (Intrinsics.e(kind, n.b.f11134a)) {
            return Z.f16226d;
        }
        if (!Intrinsics.e(kind, n.c.f11135a)) {
            return Z.f16225c;
        }
        Fv.f fVarA = a(desc.l(0), abstractC3761b.getSerializersModule());
        Fv.m kind2 = fVarA.getKind();
        if ((kind2 instanceof Fv.e) || Intrinsics.e(kind2, m.b.f11132a)) {
            return Z.f16227e;
        }
        if (abstractC3761b.getConfiguration().getAllowStructuredMapKeys()) {
            return Z.f16226d;
        }
        throw A.c(fVarA);
    }
}
