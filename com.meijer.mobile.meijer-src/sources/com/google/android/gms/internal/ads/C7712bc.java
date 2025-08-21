package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* renamed from: com.google.android.gms.internal.ads.bc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7712bc {

    /* renamed from: a, reason: collision with root package name */
    private final int f73676a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7482Yb f73677b = new C7925dc();

    public C7712bc(int i10) {
        this.f73676a = i10;
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
        C7605ac c7605ac = new C7605ac();
        PriorityQueue priorityQueue = new PriorityQueue(this.f73676a, new C7515Zb(this));
        for (String str : strArrSplit) {
            String[] strArrB = C7818cc.b(str, false);
            if (strArrB.length != 0) {
                C8245gc.c(strArrB, this.f73676a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                c7605ac.f73294b.write(this.f73677b.b(((C8138fc) it.next()).f74968b));
            } catch (IOException e10) {
                Sc.p.e("Error while writing hash to byteStream", e10);
            }
        }
        return c7605ac.toString();
    }
}
