package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.u0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9682u0 {
    public static int a(InterfaceC9361r0 interfaceC9361r0, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int iF = interfaceC9361r0.f(bArr, i10 + i12, i11 - i12);
            if (iF == -1) {
                break;
            }
            i12 += iF;
        }
        return i12;
    }

    public static boolean c(InterfaceC9361r0 interfaceC9361r0, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return interfaceC9361r0.c(bArr, 0, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static void b(boolean z10, String str) throws zzbc {
        if (!z10) {
            throw zzbc.a(str, null);
        }
    }

    public static boolean d(InterfaceC9361r0 interfaceC9361r0, byte[] bArr, int i10, int i11) throws IOException {
        try {
            interfaceC9361r0.zzi(bArr, i10, i11);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(InterfaceC9361r0 interfaceC9361r0, int i10) throws IOException {
        try {
            interfaceC9361r0.e(i10);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
