package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.wy0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9999wy0 implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f80463a;

    /* renamed from: b, reason: collision with root package name */
    private final List f80464b;

    /* synthetic */ C9999wy0(List list, List list2, C9785uy0 c9785uy0) {
        this.f80463a = list;
        this.f80464b = list2;
    }

    static {
        C8609jy0.a(Collections.EMPTY_SET);
    }

    public static C9892vy0 a(int i10, int i11) {
        return new C9892vy0(i10, i11, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int size = this.f80463a.size();
        ArrayList arrayList = new ArrayList(this.f80464b.size());
        int size2 = this.f80464b.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection collection = (Collection) ((InterfaceC9464ry0) this.f80464b.get(i10)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetA = C8183fy0.a(size);
        int size3 = this.f80463a.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object objZzb = ((InterfaceC9464ry0) this.f80463a.get(i11)).zzb();
            objZzb.getClass();
            hashSetA.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object obj : (Collection) arrayList.get(i12)) {
                obj.getClass();
                hashSetA.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSetA);
    }
}
