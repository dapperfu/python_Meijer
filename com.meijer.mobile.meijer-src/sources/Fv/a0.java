package Fv;

import Bv.m;
import Bv.n;
import Ev.AbstractC3260b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LEv/b;", "LBv/f;", "desc", "LFv/Z;", "b", "(LEv/b;LBv/f;)LFv/Z;", "LIv/c;", "module", "a", "(LBv/f;LIv/c;)LBv/f;", "kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class a0 {
    public static final Bv.f a(Bv.f fVar, Iv.c module) {
        Bv.f fVarA;
        Intrinsics.j(fVar, "<this>");
        Intrinsics.j(module, "module");
        if (!Intrinsics.e(fVar.getKind(), m.a.f3726a)) {
            return fVar.getIsInline() ? a(fVar.l(0), module) : fVar;
        }
        Bv.f fVarB = Bv.b.b(module, fVar);
        return (fVarB == null || (fVarA = a(fVarB, module)) == null) ? fVar : fVarA;
    }

    public static final Z b(AbstractC3260b abstractC3260b, Bv.f desc) {
        Intrinsics.j(abstractC3260b, "<this>");
        Intrinsics.j(desc, "desc");
        Bv.m kind = desc.getKind();
        if (kind instanceof Bv.d) {
            return Z.f11027f;
        }
        if (Intrinsics.e(kind, n.b.f3729a)) {
            return Z.f11025d;
        }
        if (!Intrinsics.e(kind, n.c.f3730a)) {
            return Z.f11024c;
        }
        Bv.f fVarA = a(desc.l(0), abstractC3260b.getSerializersModule());
        Bv.m kind2 = fVarA.getKind();
        if ((kind2 instanceof Bv.e) || Intrinsics.e(kind2, m.b.f3727a)) {
            return Z.f11026e;
        }
        if (abstractC3260b.getConfiguration().getAllowStructuredMapKeys()) {
            return Z.f11025d;
        }
        throw A.c(fVarA);
    }
}
