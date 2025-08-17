package com.google.android.gms.internal.pal;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.b8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10613b8 {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f83064a = Charset.forName("UTF-8");

    public static byte[] c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static Kd a(Fd fd2) {
        Hd hdT = Kd.t();
        hdT.n(fd2.u());
        for (Ed ed2 : fd2.z()) {
            Id idT = Jd.t();
            idT.n(ed2.u().z());
            idT.p(ed2.E());
            idT.o(ed2.G());
            idT.m(ed2.t());
            hdT.m((Jd) idT.j());
        }
        return (Kd) hdT.j();
    }

    public static void b(Fd fd2) throws GeneralSecurityException {
        boolean z10;
        int iU = fd2.u();
        int i10 = 0;
        boolean z11 = false;
        boolean z12 = true;
        for (Ed ed2 : fd2.z()) {
            if (ed2.E() == 3) {
                if (ed2.A()) {
                    if (ed2.G() != 2) {
                        if (ed2.E() != 2) {
                            if (ed2.t() == iU) {
                                if (!z11) {
                                    z11 = true;
                                } else {
                                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                                }
                            }
                            if (ed2.u().u() != EnumC10862qd.ASYMMETRIC_PUBLIC) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            z12 &= z10;
                            i10++;
                        } else {
                            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(ed2.t())));
                        }
                    } else {
                        throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(ed2.t())));
                    }
                } else {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(ed2.t())));
                }
            }
        }
        if (i10 != 0) {
            if (!z11 && !z12) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }
}
