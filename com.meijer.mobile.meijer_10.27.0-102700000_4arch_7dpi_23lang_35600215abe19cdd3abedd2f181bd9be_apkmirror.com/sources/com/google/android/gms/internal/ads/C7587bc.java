package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* renamed from: com.google.android.gms.internal.ads.bc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7587bc {

    /* renamed from: a, reason: collision with root package name */
    private final int f72836a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7357Yb f72837b = new C7800dc();

    public C7587bc(int i10) {
        this.f72836a = i10;
    }

    public final String a(ArrayList arrayList) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] strArrSplit = sb2.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        C7480ac c7480ac = new C7480ac();
        PriorityQueue priorityQueue = new PriorityQueue(this.f72836a, new C7390Zb(this));
        for (String str : strArrSplit) {
            String[] strArrB = C7693cc.b(str, false);
            if (strArrB.length != 0) {
                C8120gc.c(strArrB, this.f72836a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                c7480ac.f72454b.write(this.f72837b.b(((C8013fc) it.next()).f74128b));
            } catch (IOException e10) {
                Qc.p.e("Error while writing hash to byteStream", e10);
            }
        }
        return c7480ac.toString();
    }
}
