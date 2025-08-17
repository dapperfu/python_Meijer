package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.wy0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9874wy0 implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f79623a;

    /* renamed from: b, reason: collision with root package name */
    private final List f79624b;

    /* synthetic */ C9874wy0(List list, List list2, C9660uy0 c9660uy0) {
        this.f79623a = list;
        this.f79624b = list2;
    }

    static {
        C8484jy0.a(Collections.EMPTY_SET);
    }

    public static C9767vy0 a(int i10, int i11) {
        return new C9767vy0(i10, i11, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        int size = this.f79623a.size();
        ArrayList arrayList = new ArrayList(this.f79624b.size());
        int size2 = this.f79624b.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection collection = (Collection) ((InterfaceC9339ry0) this.f79624b.get(i10)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetA = C8058fy0.a(size);
        int size3 = this.f79623a.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object objZzb = ((InterfaceC9339ry0) this.f79623a.get(i11)).zzb();
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
