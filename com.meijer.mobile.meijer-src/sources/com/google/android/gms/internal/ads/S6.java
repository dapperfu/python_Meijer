package com.google.android.gms.internal.ads;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes6.dex */
public final class S6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f70871a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f70872b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f70873c;

    /* renamed from: d, reason: collision with root package name */
    public final List f70874d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f70875e;

    private S6(int i10, byte[] bArr, Map map, List list, boolean z10, long j10) {
        this.f70871a = i10;
        this.f70872b = bArr;
        this.f70873c = map;
        this.f70874d = list == null ? null : Collections.unmodifiableList(list);
        this.f70875e = z10;
    }

    @Deprecated
    public S6(int i10, byte[] bArr, Map map, boolean z10, long j10) {
        this(i10, bArr, map, a(map), z10, j10);
    }

    private static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new P6((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public S6(int i10, byte[] bArr, boolean z10, long j10, List list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                P6 p62 = (P6) it.next();
                treeMap.put(p62.a(), p62.b());
            }
        }
        this(i10, bArr, treeMap, list, z10, j10);
    }

    @Deprecated
    public S6(byte[] bArr, Map map) {
        this(HttpResponseStatus.SUCCESS_OK, bArr, map, a(map), false, 0L);
    }
}
