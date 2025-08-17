package com.android.volley;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f62913a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f62914b;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, String> f62915c;

    /* renamed from: d, reason: collision with root package name */
    public final List<e> f62916d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f62917e;

    /* renamed from: f, reason: collision with root package name */
    public final long f62918f;

    @Deprecated
    public h(int i10, byte[] bArr, Map<String, String> map, boolean z10, long j10) {
        this(i10, bArr, map, a(map), z10, j10);
    }

    public h(int i10, byte[] bArr, boolean z10, long j10, List<e> list) {
        this(i10, bArr, b(list), list, z10, j10);
    }

    private static List<e> a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new e(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    private static Map<String, String> b(List<e> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (e eVar : list) {
            treeMap.put(eVar.a(), eVar.b());
        }
        return treeMap;
    }

    @Deprecated
    public h(byte[] bArr, Map<String, String> map) {
        this(HttpResponseStatus.SUCCESS_OK, bArr, map, false, 0L);
    }

    private h(int i10, byte[] bArr, Map<String, String> map, List<e> list, boolean z10, long j10) {
        this.f62913a = i10;
        this.f62914b = bArr;
        this.f62915c = map;
        if (list == null) {
            this.f62916d = null;
        } else {
            this.f62916d = Collections.unmodifiableList(list);
        }
        this.f62917e = z10;
        this.f62918f = j10;
    }
}
