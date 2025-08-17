package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.m7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8716m7 {

    /* renamed from: a, reason: collision with root package name */
    long f76732a;

    /* renamed from: b, reason: collision with root package name */
    final String f76733b;

    /* renamed from: c, reason: collision with root package name */
    final String f76734c;

    /* renamed from: d, reason: collision with root package name */
    final long f76735d;

    /* renamed from: e, reason: collision with root package name */
    final long f76736e;

    /* renamed from: f, reason: collision with root package name */
    final long f76737f;

    /* renamed from: g, reason: collision with root package name */
    final long f76738g;

    /* renamed from: h, reason: collision with root package name */
    final List f76739h;

    /* JADX WARN: Illegal instructions before constructor call */
    C8716m7(String str, G6 g62) {
        String str2 = g62.f67095b;
        long j10 = g62.f67096c;
        long j11 = g62.f67097d;
        long j12 = g62.f67098e;
        long j13 = g62.f67099f;
        List arrayList = g62.f67101h;
        if (arrayList == null) {
            Map map = g62.f67100g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new P6((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j10, j11, j12, j13, arrayList);
    }

    static C8716m7 a(C8823n7 c8823n7) throws IOException {
        List arrayList;
        if (C9037p7.c(c8823n7) == 538247942) {
            String strF = C9037p7.f(c8823n7);
            String strF2 = C9037p7.f(c8823n7);
            long jD = C9037p7.d(c8823n7);
            long jD2 = C9037p7.d(c8823n7);
            long jD3 = C9037p7.d(c8823n7);
            long jD4 = C9037p7.d(c8823n7);
            int iC = C9037p7.c(c8823n7);
            if (iC >= 0) {
                if (iC == 0) {
                    arrayList = Collections.EMPTY_LIST;
                } else {
                    arrayList = new ArrayList();
                }
                List list = arrayList;
                for (int i10 = 0; i10 < iC; i10++) {
                    list.add(new P6(C9037p7.f(c8823n7).intern(), C9037p7.f(c8823n7).intern()));
                }
                return new C8716m7(strF, strF2, jD, jD2, jD3, jD4, list);
            }
            throw new IOException("readHeaderList size=" + iC);
        }
        throw new IOException();
    }

    private C8716m7(String str, String str2, long j10, long j11, long j12, long j13, List list) {
        this.f76733b = str;
        this.f76734c = true == "".equals(str2) ? null : str2;
        this.f76735d = j10;
        this.f76736e = j11;
        this.f76737f = j12;
        this.f76738g = j13;
        this.f76739h = list;
    }
}
