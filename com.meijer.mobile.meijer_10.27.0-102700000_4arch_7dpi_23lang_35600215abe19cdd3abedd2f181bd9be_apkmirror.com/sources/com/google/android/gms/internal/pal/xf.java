package com.google.android.gms.internal.pal;

import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class xf {
    public static C10671ef a(F f10) throws zzzc {
        boolean z10;
        try {
            try {
                f10.m();
            } catch (EOFException e10) {
                e = e10;
                z10 = true;
            }
            try {
                return (C10671ef) D.f82535V.a(f10);
            } catch (EOFException e11) {
                e = e11;
                z10 = false;
                if (z10) {
                    return gf.f83141a;
                }
                throw new zzze(e);
            }
        } catch (zzabf e12) {
            throw new zzze(e12);
        } catch (IOException e13) {
            throw new zzyz(e13);
        } catch (NumberFormatException e14) {
            throw new zzze(e14);
        }
    }
}
