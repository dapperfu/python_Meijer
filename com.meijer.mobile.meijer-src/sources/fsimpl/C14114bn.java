package fsimpl;

import android.graphics.Path;
import java.util.Map;

/* renamed from: fsimpl.bn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14114bn {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC14115bo f133090a = a();

    private static InterfaceC14115bo a() {
        InterfaceC14115bo interfaceC14115boA = a(new C14116bp());
        if (interfaceC14115boA != null) {
            return interfaceC14115boA;
        }
        InterfaceC14115bo interfaceC14115boA2 = a(new C14112bl());
        if (interfaceC14115boA2 != null) {
            return interfaceC14115boA2;
        }
        InterfaceC14115bo interfaceC14115boA3 = a(new C14113bm());
        if (interfaceC14115boA3 == null) {
            return null;
        }
        return interfaceC14115boA3;
    }

    private static InterfaceC14115bo a(InterfaceC14115bo interfaceC14115bo) {
        if (interfaceC14115bo.a()) {
            return interfaceC14115bo;
        }
        return null;
    }

    public int a(Map map, gh ghVar) {
        int i10;
        C14228fu.a("PathSerializer.serialize", new Object[0]);
        if (map == null) {
            return 0;
        }
        int[] iArr = new int[map.size()];
        int i11 = 0;
        for (Map.Entry entry : map.entrySet()) {
            Path path = (Path) entry.getValue();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            InterfaceC14115bo interfaceC14115bo = this.f133090a;
            if (interfaceC14115bo == null || path == null) {
                i10 = i11 + 1;
                iArr[i11] = C14162dh.a(ghVar, iIntValue, 0, 0);
                i11 = i10;
            } else {
                int iA = interfaceC14115bo.a(ghVar, path, iIntValue);
                if (iA != 0) {
                    iArr[i11] = iA;
                    i11++;
                } else {
                    i10 = i11 + 1;
                    iArr[i11] = C14162dh.a(ghVar, iIntValue, 0, 0);
                    i11 = i10;
                }
            }
        }
        return C14159de.b(ghVar, iArr);
    }
}
