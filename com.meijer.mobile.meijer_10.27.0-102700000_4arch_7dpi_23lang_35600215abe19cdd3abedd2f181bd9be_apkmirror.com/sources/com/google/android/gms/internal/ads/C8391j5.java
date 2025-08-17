package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.j5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8391j5 implements InterfaceC8496k4 {

    /* renamed from: a, reason: collision with root package name */
    private final List f75326a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f75327b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f75328c;

    @Override // com.google.android.gms.internal.ads.InterfaceC8496k4
    public final long zzb(int i10) {
        C8086gC.d(i10 >= 0);
        C8086gC.d(i10 < this.f75328c.length);
        return this.f75328c[i10];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8496k4
    public final int zza() {
        return this.f75328c.length;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8496k4
    public final List zzc(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f75326a.size(); i10++) {
            long[] jArr = this.f75327b;
            int i11 = i10 + i10;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                Y4 y42 = (Y4) this.f75326a.get(i10);
                C7385Yx c7385Yx = y42.f71468a;
                if (c7385Yx.f71887e == -3.4028235E38f) {
                    arrayList2.add(y42);
                } else {
                    arrayList.add(c7385Yx);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.gms.internal.ads.i5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((Y4) obj).f71469b, ((Y4) obj2).f71469b);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            C7318Ww c7318WwB = ((Y4) arrayList2.get(i12)).f71468a.b();
            c7318WwB.e((-1) - i12, 1);
            arrayList.add(c7318WwB.p());
        }
        return arrayList;
    }

    public C8391j5(List list) {
        this.f75326a = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.f75327b = new long[size + size];
        for (int i10 = 0; i10 < list.size(); i10++) {
            Y4 y42 = (Y4) list.get(i10);
            long[] jArr = this.f75327b;
            int i11 = i10 + i10;
            jArr[i11] = y42.f71469b;
            jArr[i11 + 1] = y42.f71470c;
        }
        long[] jArr2 = this.f75327b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f75328c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }
}
