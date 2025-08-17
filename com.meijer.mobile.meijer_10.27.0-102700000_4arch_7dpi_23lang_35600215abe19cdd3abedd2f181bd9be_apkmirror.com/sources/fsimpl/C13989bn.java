package fsimpl;

import android.graphics.Path;
import java.util.Map;

/* renamed from: fsimpl.bn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13989bn {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13990bo f131840a = a();

    private static InterfaceC13990bo a() {
        InterfaceC13990bo interfaceC13990boA = a(new C13991bp());
        if (interfaceC13990boA != null) {
            return interfaceC13990boA;
        }
        InterfaceC13990bo interfaceC13990boA2 = a(new C13987bl());
        if (interfaceC13990boA2 != null) {
            return interfaceC13990boA2;
        }
        InterfaceC13990bo interfaceC13990boA3 = a(new C13988bm());
        if (interfaceC13990boA3 == null) {
            return null;
        }
        return interfaceC13990boA3;
    }

    private static InterfaceC13990bo a(InterfaceC13990bo interfaceC13990bo) {
        if (interfaceC13990bo.a()) {
            return interfaceC13990bo;
        }
        return null;
    }

    public int a(Map map, gh ghVar) {
        int i10;
        C14103fu.a("PathSerializer.serialize", new Object[0]);
        if (map == null) {
            return 0;
        }
        int[] iArr = new int[map.size()];
        int i11 = 0;
        for (Map.Entry entry : map.entrySet()) {
            Path path = (Path) entry.getValue();
            int iIntValue = ((Integer) entry.getKey()).intValue();
            InterfaceC13990bo interfaceC13990bo = this.f131840a;
            if (interfaceC13990bo == null || path == null) {
                i10 = i11 + 1;
                iArr[i11] = C14037dh.a(ghVar, iIntValue, 0, 0);
                i11 = i10;
            } else {
                int iA = interfaceC13990bo.a(ghVar, path, iIntValue);
                if (iA != 0) {
                    iArr[i11] = iA;
                    i11++;
                } else {
                    i10 = i11 + 1;
                    iArr[i11] = C14037dh.a(ghVar, iIntValue, 0, 0);
                    i11 = i10;
                }
            }
        }
        return C14034de.b(ghVar, iArr);
    }
}
