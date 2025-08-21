package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.j5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8516j5 implements InterfaceC8621k4 {

    /* renamed from: a, reason: collision with root package name */
    private final List f76166a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f76167b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f76168c;

    @Override // com.google.android.gms.internal.ads.InterfaceC8621k4
    public final long zzb(int i10) {
        C8211gC.d(i10 >= 0);
        C8211gC.d(i10 < this.f76168c.length);
        return this.f76168c[i10];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8621k4
    public final int zza() {
        return this.f76168c.length;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8621k4
    public final List zzc(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f76166a.size(); i10++) {
            long[] jArr = this.f76167b;
            int i11 = i10 + i10;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                Y4 y42 = (Y4) this.f76166a.get(i10);
                C7510Yx c7510Yx = y42.f72308a;
                if (c7510Yx.f72727e == -3.4028235E38f) {
                    arrayList2.add(y42);
                } else {
                    arrayList.add(c7510Yx);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.gms.internal.ads.i5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((Y4) obj).f72309b, ((Y4) obj2).f72309b);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            C7443Ww c7443WwB = ((Y4) arrayList2.get(i12)).f72308a.b();
            c7443WwB.e((-1) - i12, 1);
            arrayList.add(c7443WwB.p());
        }
        return arrayList;
    }

    public C8516j5(List list) {
        this.f76166a = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.f76167b = new long[size + size];
        for (int i10 = 0; i10 < list.size(); i10++) {
            Y4 y42 = (Y4) list.get(i10);
            long[] jArr = this.f76167b;
            int i11 = i10 + i10;
            jArr[i11] = y42.f72309b;
            jArr[i11 + 1] = y42.f72310c;
        }
        long[] jArr2 = this.f76167b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f76168c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }
}
