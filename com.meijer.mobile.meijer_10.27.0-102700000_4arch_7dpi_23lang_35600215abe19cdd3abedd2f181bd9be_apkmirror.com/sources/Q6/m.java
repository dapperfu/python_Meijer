package Q6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u0004*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\b2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\b2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LQ6/m;", "", "<init>", "()V", "", "d", "(Ljava/lang/Object;)Z", "c", "", "maxLength", "", "str", "e", "(ILjava/lang/String;)Ljava/lang/String;", "maxStringLength", "", "list", "LQ6/p;", "f", "(ILjava/util/List;)LQ6/p;", "", "map", "g", "(ILjava/util/Map;)LQ6/p;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f29896a = new m();

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(Object obj) {
        return (obj instanceof ArrayList) || (obj instanceof LinkedList) || (obj instanceof CopyOnWriteArrayList) || (obj instanceof Vector);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean d(Object obj) {
        return (obj instanceof HashMap) || (obj instanceof TreeMap) || (obj instanceof ConcurrentMap) || (obj instanceof EnumMap) || (obj instanceof Hashtable) || (obj instanceof WeakHashMap);
    }

    private m() {
    }

    public final String e(int maxLength, String str) {
        int length = str.length() - maxLength;
        if (length < 25) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, maxLength);
        Intrinsics.i(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb2.append(strSubstring);
        sb2.append("***<");
        sb2.append(length);
        sb2.append("> CHARS TRUNCATED***");
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Q6.TrimMetrics f(int r9, java.util.List<java.lang.Object> r10) {
        /*
            r8 = this;
            int r0 = r10.size()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r1 >= r0) goto Lb2
            Q6.m r4 = Q6.m.f29896a
            java.lang.Object r5 = r10.get(r1)
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L2d
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            int r7 = r6.length()
            if (r7 <= r9) goto L2d
            java.lang.String r4 = r4.e(r9, r6)
            int r5 = r6.length()
            int r5 = r5 - r9
            r10.set(r1, r4)
            int r2 = r2 + 1
            int r3 = r3 + r5
            goto Lae
        L2d:
            boolean r6 = b(r4, r5)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>"
            if (r6 == 0) goto L53
            if (r5 == 0) goto L4d
            java.util.Map r6 = kotlin.jvm.internal.TypeIntrinsics.d(r5)
            Q6.p r4 = r4.g(r9, r6)
            int r6 = r4.getItemsTrimmed()
            int r4 = r4.getDataTrimmed()
        L47:
            r10.set(r1, r5)
            int r2 = r2 + r6
            int r3 = r3 + r4
            goto Lae
        L4d:
            kotlin.TypeCastException r9 = new kotlin.TypeCastException
            r9.<init>(r7)
            throw r9
        L53:
            boolean r6 = a(r4, r5)
            if (r6 == 0) goto L74
            if (r5 == 0) goto L6c
            java.util.List r6 = kotlin.jvm.internal.TypeIntrinsics.c(r5)
            Q6.p r4 = r4.f(r9, r6)
            int r6 = r4.getItemsTrimmed()
            int r4 = r4.getDataTrimmed()
            goto L47
        L6c:
            kotlin.TypeCastException r9 = new kotlin.TypeCastException
            java.lang.String r10 = "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>"
            r9.<init>(r10)
            throw r9
        L74:
            boolean r6 = r5 instanceof java.util.Map
            if (r6 == 0) goto L97
            java.util.Map r5 = (java.util.Map) r5
            java.util.Map r5 = kotlin.collections.MapsKt.D(r5)
            if (r5 == 0) goto L91
            java.util.Map r5 = kotlin.jvm.internal.TypeIntrinsics.d(r5)
            Q6.p r4 = r4.g(r9, r5)
            int r6 = r4.getItemsTrimmed()
            int r4 = r4.getDataTrimmed()
            goto L47
        L91:
            kotlin.TypeCastException r9 = new kotlin.TypeCastException
            r9.<init>(r7)
            throw r9
        L97:
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto Lae
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r5 = kotlin.collections.CollectionsKt.m1(r5)
            Q6.p r4 = r4.f(r9, r5)
            int r6 = r4.getItemsTrimmed()
            int r4 = r4.getDataTrimmed()
            goto L47
        Lae:
            int r1 = r1 + 1
            goto L7
        Lb2:
            Q6.p r9 = new Q6.p
            r9.<init>(r2, r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Q6.m.f(int, java.util.List):Q6.p");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TrimMetrics g(int maxStringLength, Map<String, Object> map) {
        int itemsTrimmed;
        int dataTrimmed;
        Map<String, Object> map2;
        Iterator<T> it = map.entrySet().iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            m mVar = f29896a;
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) value;
                if (str.length() > maxStringLength) {
                    String strE = mVar.e(maxStringLength, str);
                    int length = str.length() - maxStringLength;
                    entry.setValue(strE);
                    i10++;
                    i11 += length;
                }
            }
            if (mVar.d(value)) {
                if (value != 0) {
                    TrimMetrics trimMetricsG = mVar.g(maxStringLength, TypeIntrinsics.d(value));
                    itemsTrimmed = trimMetricsG.getItemsTrimmed();
                    dataTrimmed = trimMetricsG.getDataTrimmed();
                    map2 = value;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                }
            } else if (mVar.c(value)) {
                if (value != 0) {
                    TrimMetrics trimMetricsF = mVar.f(maxStringLength, TypeIntrinsics.c(value));
                    itemsTrimmed = trimMetricsF.getItemsTrimmed();
                    dataTrimmed = trimMetricsF.getDataTrimmed();
                    map2 = value;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
                }
            } else if (value instanceof Map) {
                Map mapD = MapsKt.D((Map) value);
                if (mapD != null) {
                    Map<String, Object> mapD2 = TypeIntrinsics.d(mapD);
                    TrimMetrics trimMetricsG2 = mVar.g(maxStringLength, mapD2);
                    itemsTrimmed = trimMetricsG2.getItemsTrimmed();
                    dataTrimmed = trimMetricsG2.getDataTrimmed();
                    map2 = mapD2;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                }
            } else if (value instanceof Collection) {
                List<Object> listM1 = CollectionsKt.m1((Collection) value);
                TrimMetrics trimMetricsF2 = mVar.f(maxStringLength, listM1);
                itemsTrimmed = trimMetricsF2.getItemsTrimmed();
                dataTrimmed = trimMetricsF2.getDataTrimmed();
                map2 = listM1;
            }
            entry.setValue(map2);
            i10 += itemsTrimmed;
            i11 += dataTrimmed;
        }
        return new TrimMetrics(i10, i11);
    }
}
