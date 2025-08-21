package R6;

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
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u0004*\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\b2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\b2\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LR6/s;", "", "<init>", "()V", "", "b", "(Ljava/lang/Object;)Z", "a", "", "maxLength", "", "str", "c", "(ILjava/lang/String;)Ljava/lang/String;", "maxStringLength", "", "list", "LR6/v;", "d", "(ILjava/util/List;)LR6/v;", "", "map", "e", "(ILjava/util/Map;)LR6/v;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f32024a = new s();

    private final boolean a(Object obj) {
        return (obj instanceof ArrayList) || (obj instanceof LinkedList) || (obj instanceof CopyOnWriteArrayList) || (obj instanceof Vector);
    }

    private final boolean b(Object obj) {
        return (obj instanceof HashMap) || (obj instanceof TreeMap) || (obj instanceof ConcurrentMap) || (obj instanceof EnumMap) || (obj instanceof Hashtable) || (obj instanceof WeakHashMap);
    }

    private s() {
    }

    public final String c(int maxLength, String str) {
        int length = str.length() - maxLength;
        if (length < 25) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String strSubstring = str.substring(0, maxLength);
        Intrinsics.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(strSubstring);
        sb2.append("***<");
        sb2.append(length);
        sb2.append("> CHARS TRUNCATED***");
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final R6.TrimMetrics d(int r10, java.util.List<java.lang.Object> r11) {
        /*
            r9 = this;
            int r0 = r11.size()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r1 >= r0) goto Lab
            int r4 = r1 + 1
            R6.s r5 = R6.s.f32024a
            java.lang.Object r6 = r11.get(r1)
            boolean r7 = r6 instanceof java.lang.String
            if (r7 == 0) goto L2f
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r7.length()
            if (r8 <= r10) goto L2f
            java.lang.String r5 = r5.c(r10, r7)
            int r6 = r7.length()
            int r6 = r6 - r10
            r11.set(r1, r5)
            int r2 = r2 + 1
            int r3 = r3 + r6
            goto La8
        L2f:
            boolean r7 = r5.b(r6)
            if (r7 == 0) goto L55
            if (r6 == 0) goto L4d
            java.util.Map r7 = kotlin.jvm.internal.TypeIntrinsics.d(r6)
            R6.v r5 = r5.e(r10, r7)
            int r7 = r5.getItemsTrimmed()
            int r5 = r5.getDataTrimmed()
        L47:
            r11.set(r1, r6)
            int r2 = r2 + r7
            int r3 = r3 + r5
            goto La8
        L4d:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>"
            r10.<init>(r11)
            throw r10
        L55:
            boolean r7 = r5.a(r6)
            if (r7 == 0) goto L76
            if (r6 == 0) goto L6e
            java.util.List r7 = kotlin.jvm.internal.TypeIntrinsics.c(r6)
            R6.v r5 = r5.d(r10, r7)
            int r7 = r5.getItemsTrimmed()
            int r5 = r5.getDataTrimmed()
            goto L47
        L6e:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r11 = "null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>"
            r10.<init>(r11)
            throw r10
        L76:
            boolean r7 = r6 instanceof java.util.Map
            if (r7 == 0) goto L91
            java.util.Map r6 = (java.util.Map) r6
            java.util.Map r6 = kotlin.collections.MapsKt.D(r6)
            java.util.Map r6 = kotlin.jvm.internal.TypeIntrinsics.d(r6)
            R6.v r5 = r5.e(r10, r6)
            int r7 = r5.getItemsTrimmed()
            int r5 = r5.getDataTrimmed()
            goto L47
        L91:
            boolean r7 = r6 instanceof java.util.Collection
            if (r7 == 0) goto La8
            java.util.Collection r6 = (java.util.Collection) r6
            java.util.List r6 = kotlin.collections.CollectionsKt.m1(r6)
            R6.v r5 = r5.d(r10, r6)
            int r7 = r5.getItemsTrimmed()
            int r5 = r5.getDataTrimmed()
            goto L47
        La8:
            r1 = r4
            goto L7
        Lab:
            R6.v r10 = new R6.v
            r10.<init>(r2, r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: R6.s.d(int, java.util.List):R6.v");
    }

    public final TrimMetrics e(int maxStringLength, Map<String, Object> map) {
        int itemsTrimmed;
        int dataTrimmed;
        Object obj;
        Iterator<T> it = map.entrySet().iterator();
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            s sVar = f32024a;
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) value;
                if (str.length() > maxStringLength) {
                    String strC = sVar.c(maxStringLength, str);
                    int length = str.length() - maxStringLength;
                    entry.setValue(strC);
                    i10++;
                    i11 += length;
                }
            }
            if (sVar.b(value)) {
                if (value != null) {
                    TrimMetrics trimMetricsE = sVar.e(maxStringLength, TypeIntrinsics.d(value));
                    itemsTrimmed = trimMetricsE.getItemsTrimmed();
                    dataTrimmed = trimMetricsE.getDataTrimmed();
                    obj = value;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                }
            } else if (sVar.a(value)) {
                if (value != null) {
                    TrimMetrics trimMetricsD = sVar.d(maxStringLength, TypeIntrinsics.c(value));
                    itemsTrimmed = trimMetricsD.getItemsTrimmed();
                    dataTrimmed = trimMetricsD.getDataTrimmed();
                    obj = value;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
                }
            } else if (value instanceof Map) {
                Map<String, Object> mapD = TypeIntrinsics.d(MapsKt.D((Map) value));
                TrimMetrics trimMetricsE2 = sVar.e(maxStringLength, mapD);
                itemsTrimmed = trimMetricsE2.getItemsTrimmed();
                dataTrimmed = trimMetricsE2.getDataTrimmed();
                obj = mapD;
            } else if (value instanceof Collection) {
                List<Object> listM1 = CollectionsKt.m1((Collection) value);
                TrimMetrics trimMetricsD2 = sVar.d(maxStringLength, listM1);
                itemsTrimmed = trimMetricsD2.getItemsTrimmed();
                dataTrimmed = trimMetricsD2.getDataTrimmed();
                obj = listM1;
            }
            entry.setValue(obj);
            i10 += itemsTrimmed;
            i11 += dataTrimmed;
        }
        return new TrimMetrics(i10, i11);
    }
}
