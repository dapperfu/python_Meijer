package R3;

import a3.y;
import com.fullstory.Reason;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d3.D;

/* loaded from: classes4.dex */
public final class r {
    private static int a(int i10, D d10, int i11) {
        if (i10 == 12) {
            return 240;
        }
        if (i10 == 13) {
            return BinsView.TOTE_HEIGHT_DP;
        }
        if (i10 == 21 && d10.a() >= 8 && d10.f() + 8 <= i11) {
            int iQ = d10.q();
            int iQ2 = d10.q();
            if (iQ >= 12 && iQ2 == 1936877170) {
                return d10.I();
            }
        }
        return Reason.OS_VERSION_TOO_LOW;
    }

    public static y b(D d10, int i10) {
        d10.X(12);
        while (d10.f() < i10) {
            int iF = d10.f();
            int iQ = d10.q();
            if (d10.q() == 1935766900) {
                if (iQ < 16) {
                    return null;
                }
                d10.X(4);
                int i11 = -1;
                int i12 = 0;
                for (int i13 = 0; i13 < 2; i13++) {
                    int iH = d10.H();
                    int iH2 = d10.H();
                    if (iH == 0) {
                        i11 = iH2;
                    } else if (iH == 1) {
                        i12 = iH2;
                    }
                }
                int iA = a(i11, d10, i10);
                if (iA == -2147483647) {
                    return null;
                }
                return new y(new M3.d(iA, i12));
            }
            d10.W(iF + iQ);
        }
        return null;
    }
}
