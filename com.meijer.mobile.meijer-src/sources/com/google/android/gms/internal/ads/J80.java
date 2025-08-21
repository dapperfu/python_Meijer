package com.google.android.gms.internal.ads;

import Xc.C5569c;
import android.content.Context;

/* loaded from: classes6.dex */
public final /* synthetic */ class J80 {
    public static K80 a(Context context, int i10) {
        boolean zBooleanValue;
        if (Z80.a()) {
            int i11 = i10 - 2;
            if (i11 != 20 && i11 != 21) {
                switch (i11) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) C8146fg.f74976c.e()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) C8146fg.f74977d.e()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) C8146fg.f74975b.e()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) C8146fg.f74978e.e()).booleanValue();
            }
            if (zBooleanValue) {
                return new M80(context, i10);
            }
        }
        return new C9594t90();
    }

    public static K80 b(Context context, int i10, int i11, Oc.Y1 y12) {
        K80 k80A = a(context, i10);
        if (k80A instanceof M80) {
            k80A.zzi();
            k80A.b(i11);
            k80A.c(C5569c.a(y12.f23366m));
            if (V80.e(y12.f23369p)) {
                k80A.a(y12.f23369p);
            }
        }
        return k80A;
    }
}
