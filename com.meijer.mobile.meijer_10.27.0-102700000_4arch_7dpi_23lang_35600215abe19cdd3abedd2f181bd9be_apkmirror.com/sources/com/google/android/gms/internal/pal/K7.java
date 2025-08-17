package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

@Deprecated
/* loaded from: classes6.dex */
public final class K7 {
    @Deprecated
    public static final F7 a(byte[] bArr) throws GeneralSecurityException {
        try {
            Fd fdY = Fd.y(bArr, C10833p0.a());
            for (Ed ed2 : fdY.z()) {
                if (ed2.u().u() == EnumC10862qd.UNKNOWN_KEYMATERIAL || ed2.u().u() == EnumC10862qd.SYMMETRIC || ed2.u().u() == EnumC10862qd.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return F7.a(fdY);
        } catch (zzadi unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
