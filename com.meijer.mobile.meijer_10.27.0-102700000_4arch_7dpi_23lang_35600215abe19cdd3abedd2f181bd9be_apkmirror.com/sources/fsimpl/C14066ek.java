package fsimpl;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: fsimpl.ek, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C14066ek implements InterfaceC14081ez {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int[] f132152a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ HashMap f132153b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArrayList f132154c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C14064ei f132155d;

    C14066ek(C14064ei c14064ei, int[] iArr, HashMap map, ArrayList arrayList) {
        this.f132155d = c14064ei;
        this.f132152a = iArr;
        this.f132153b = map;
        this.f132154c = arrayList;
    }

    @Override // fsimpl.InterfaceC14081ez
    public eA a(String str, String str2) {
        int[] iArr = this.f132152a;
        iArr[5] = iArr[5] + 1;
        if (this.f132155d.f132150k.put(str2, Boolean.TRUE) != null) {
            int[] iArr2 = this.f132152a;
            iArr2[2] = iArr2[2] + 1;
        } else {
            if (this.f132153b.put(str2, str) == null) {
                int[] iArr3 = this.f132152a;
                iArr3[0] = iArr3[0] + 1;
                this.f132154c.add(str2);
                return this.f132154c.size() < 20 ? eA.CONTINUE : eA.END;
            }
            int[] iArr4 = this.f132152a;
            iArr4[1] = iArr4[1] + 1;
        }
        return eA.DELETE_CONTINUE;
    }
}
