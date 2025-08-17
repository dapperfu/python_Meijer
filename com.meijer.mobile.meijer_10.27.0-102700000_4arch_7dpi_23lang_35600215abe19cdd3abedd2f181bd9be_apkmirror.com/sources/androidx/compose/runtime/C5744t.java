package androidx.compose.runtime;

import J0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\u000e\u001a\u00020\u00012\u0012\u0010\u000b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\n0\t2\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Landroidx/compose/runtime/y0;", "Landroidx/compose/runtime/p;", "key", "", "a", "(Landroidx/compose/runtime/y0;Landroidx/compose/runtime/p;)Z", "b", "(Landroidx/compose/runtime/y0;Landroidx/compose/runtime/p;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/G0;", "values", "parentScope", "previous", "c", "([Landroidx/compose/runtime/G0;Landroidx/compose/runtime/y0;Landroidx/compose/runtime/y0;)Landroidx/compose/runtime/y0;", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5744t {
    public static final <T> boolean a(InterfaceC5755y0 interfaceC5755y0, AbstractC5737p<T> abstractC5737p) {
        Intrinsics.h(abstractC5737p, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return interfaceC5755y0.containsKey(abstractC5737p);
    }

    public static final <T> T b(InterfaceC5755y0 interfaceC5755y0, AbstractC5737p<T> abstractC5737p) {
        Intrinsics.h(abstractC5737p, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        E1<T> e1A = (E1<T>) interfaceC5755y0.get(abstractC5737p);
        if (e1A == null) {
            e1A = abstractC5737p.a();
        }
        return (T) e1A.a(interfaceC5755y0);
    }

    public static /* synthetic */ InterfaceC5755y0 d(G0[] g0Arr, InterfaceC5755y0 interfaceC5755y0, InterfaceC5755y0 interfaceC5755y02, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            interfaceC5755y02 = J0.g.a();
        }
        return c(g0Arr, interfaceC5755y0, interfaceC5755y02);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.compose.runtime.y0] */
    public static final InterfaceC5755y0 c(G0<?>[] g0Arr, InterfaceC5755y0 interfaceC5755y0, InterfaceC5755y0 interfaceC5755y02) {
        f.a aVarD = J0.g.a().builder();
        for (G0<?> g02 : g0Arr) {
            AbstractC5737p<?> abstractC5737pB = g02.b();
            Intrinsics.h(abstractC5737pB, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            F0 f02 = (F0) abstractC5737pB;
            if (g02.getCanOverride() || !a(interfaceC5755y0, f02)) {
                E1 e12 = (E1) interfaceC5755y02.get(f02);
                Intrinsics.h(g02, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
                aVarD.put(f02, f02.b(g02, e12));
            }
        }
        return aVarD.build2();
    }
}
