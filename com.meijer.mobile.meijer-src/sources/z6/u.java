package z6;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import z6.t;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001am\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00052\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lz6/t$a;", "D", "Lz6/t;", "Lz6/p;", "customScalarAdapters", "", "", "a", "(Lz6/t;Lz6/p;)Ljava/util/Set;", "", "withDefaultValues", "Lz6/t$b;", "c", "(Lz6/t;Lz6/p;Z)Lz6/t$b;", "LD6/f;", "jsonReader", "falseVariables", "Lz6/q;", "deferredFragmentIds", "", "Lz6/s;", "errors", "b", "(Lz6/t;LD6/f;Lz6/p;Ljava/util/Set;Ljava/util/Set;Ljava/util/List;)Lz6/t$a;", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class u {
    public static final <D extends t.a> Set<String> a(t<D> tVar, p customScalarAdapters) {
        Intrinsics.j(tVar, "<this>");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        Map<String, Object> mapA = c(tVar, customScalarAdapters, true).a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Object> entry : mapA.entrySet()) {
            if (Intrinsics.e(entry.getValue(), Boolean.FALSE)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    @JvmOverloads
    public static final <D extends t.a> D b(t<D> tVar, D6.f jsonReader, p customScalarAdapters, Set<String> set, Set<DeferredFragmentIdentifier> set2, List<Error> list) {
        Intrinsics.j(tVar, "<this>");
        Intrinsics.j(jsonReader, "jsonReader");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        return (D) C18453b.b(tVar.a()).b(jsonReader, customScalarAdapters.h().f(set).d(set2).e(list).b());
    }

    public static final <D extends t.a> t.b c(t<D> tVar, p customScalarAdapters, boolean z10) throws IOException {
        Intrinsics.j(tVar, "<this>");
        Intrinsics.j(customScalarAdapters, "customScalarAdapters");
        D6.i iVar = new D6.i();
        iVar.s();
        tVar.d(iVar, customScalarAdapters, z10);
        iVar.F();
        Object objC = iVar.c();
        Intrinsics.h(objC, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        return new t.b((Map) objC);
    }
}
