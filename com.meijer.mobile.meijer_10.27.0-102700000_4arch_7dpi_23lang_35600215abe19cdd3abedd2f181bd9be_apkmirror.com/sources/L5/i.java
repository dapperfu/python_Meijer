package L5;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a3\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "", "", "prefix", "", "a", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/Map;", "", "b", "([Ljava/lang/Object;Ljava/lang/String;)Ljava/util/Map;", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class i {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.util.Map a(java.util.List r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.j(r7, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.j(r8, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r1 = 0
            r2 = r1
        L17:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L83
            java.lang.Object r3 = r7.next()
            int r4 = r2 + 1
            if (r2 >= 0) goto L28
            kotlin.collections.CollectionsKt.w()
        L28:
            int r5 = r8.length()
            if (r5 <= 0) goto L43
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r8)
            r6 = 46
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            goto L47
        L43:
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L47:
            boolean r5 = r3 instanceof java.util.Map
            if (r5 == 0) goto L62
            r5 = r3
            java.util.Map r5 = (java.util.Map) r5
            java.util.Set r6 = r5.keySet()
            boolean r6 = L5.n.a(r6)
            if (r6 == 0) goto L62
            r3 = 2
            r6 = 0
            java.util.Map r2 = L5.j.b(r5, r2, r1, r3, r6)
            r0.putAll(r2)
            goto L81
        L62:
            boolean r5 = r3 instanceof java.util.List
            if (r5 == 0) goto L70
            java.util.List r3 = (java.util.List) r3
            java.util.Map r2 = a(r3, r2)
            r0.putAll(r2)
            goto L81
        L70:
            boolean r5 = r3 instanceof java.lang.Object[]
            if (r5 == 0) goto L7e
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.util.Map r2 = b(r3, r2)
            r0.putAll(r2)
            goto L81
        L7e:
            r0.put(r2, r3)
        L81:
            r2 = r4
            goto L17
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L5.i.a(java.util.List, java.lang.String):java.util.Map");
    }

    public static final /* synthetic */ Map b(Object[] objArr, String prefix) {
        Intrinsics.j(objArr, "<this>");
        Intrinsics.j(prefix, "prefix");
        return a(ArraysKt.i1(objArr), prefix);
    }
}
