package fsimpl;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: fsimpl.ek, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14191ek implements InterfaceC14206ez {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int[] f133402a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ HashMap f133403b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArrayList f133404c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C14189ei f133405d;

    C14191ek(C14189ei c14189ei, int[] iArr, HashMap map, ArrayList arrayList) {
        this.f133405d = c14189ei;
        this.f133402a = iArr;
        this.f133403b = map;
        this.f133404c = arrayList;
    }

    @Override // fsimpl.InterfaceC14206ez
    public eA a(String str, String str2) {
        int[] iArr = this.f133402a;
        iArr[5] = iArr[5] + 1;
        if (this.f133405d.f133400k.put(str2, Boolean.TRUE) != null) {
            int[] iArr2 = this.f133402a;
            iArr2[2] = iArr2[2] + 1;
        } else {
            if (this.f133403b.put(str2, str) == null) {
                int[] iArr3 = this.f133402a;
                iArr3[0] = iArr3[0] + 1;
                this.f133404c.add(str2);
                return this.f133404c.size() < 20 ? eA.CONTINUE : eA.END;
            }
            int[] iArr4 = this.f133402a;
            iArr4[1] = iArr4[1] + 1;
        }
        return eA.DELETE_CONTINUE;
    }
}
