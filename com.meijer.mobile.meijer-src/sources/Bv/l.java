package Bv;

import Bv.n;
import Dv.l0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001aN\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00072\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b\"\u00020\u00042\u0019\b\u0002\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", "serialName", "LBv/e;", "kind", "LBv/f;", "b", "(Ljava/lang/String;LBv/e;)LBv/f;", "LBv/m;", "", "typeParameters", "Lkotlin/Function1;", "LBv/a;", "", "Lkotlin/ExtensionFunctionType;", "builder", "c", "(Ljava/lang/String;LBv/m;[LBv/f;Lkotlin/jvm/functions/Function1;)LBv/f;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class l {
    public static final f b(String serialName, e kind) {
        Intrinsics.j(serialName, "serialName");
        Intrinsics.j(kind, "kind");
        if (StringsKt.s0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return l0.a(serialName, kind);
    }

    public static final f c(String serialName, m kind, f[] typeParameters, Function1<? super a, Unit> builder) {
        Intrinsics.j(serialName, "serialName");
        Intrinsics.j(kind, "kind");
        Intrinsics.j(typeParameters, "typeParameters");
        Intrinsics.j(builder, "builder");
        if (StringsKt.s0(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (Intrinsics.e(kind, n.a.f3728a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        a aVar = new a(serialName);
        builder.invoke(aVar);
        return new i(serialName, kind, aVar.f().size(), ArraysKt.h1(typeParameters), aVar);
    }

    public static /* synthetic */ f d(String str, m mVar, f[] fVarArr, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function1 = new Function1() { // from class: Bv.k
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return l.e((a) obj2);
                }
            };
        }
        return c(str, mVar, fVarArr, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(a aVar) {
        Intrinsics.j(aVar, "<this>");
        return Unit.f143329a;
    }
}
