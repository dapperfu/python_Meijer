package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class Jk0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f67959a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Bo0 f67960b = Bo0.f65582b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f67961c = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        Iterator it = this.f67959a.iterator();
        while (it.hasNext()) {
            ((Hk0) it.next()).f67494a = false;
        }
    }

    public final Mk0 b() throws GeneralSecurityException {
        int i10;
        int i11;
        int i12;
        if (this.f67961c) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c10 = 1;
        this.f67961c = true;
        List list = this.f67959a;
        C8260hs0 c8260hs0D0 = C8686ls0.d0();
        ArrayList arrayList = new ArrayList(list.size());
        List list2 = this.f67959a;
        int i13 = 0;
        int i14 = 0;
        while (i14 < list2.size() - 1) {
            int i15 = i14 + 1;
            if (((Hk0) list2.get(i14)).f67498e == Ik0.f67677a && ((Hk0) list2.get(i15)).f67498e != Ik0.f67677a) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i14 = i15;
        }
        HashSet hashSet = new HashSet();
        Integer num = null;
        for (Hk0 hk0 : this.f67959a) {
            Ek0 unused = hk0.f67495b;
            if (hk0.f67498e == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (hk0.f67498e == Ik0.f67677a) {
                int i16 = i13;
                while (true) {
                    if (i16 != 0 && !hashSet.contains(Integer.valueOf(i16))) {
                        break;
                    }
                    SecureRandom secureRandom = new SecureRandom();
                    byte[] bArr = new byte[4];
                    int i17 = i13;
                    while (i17 == 0) {
                        secureRandom.nextBytes(bArr);
                        i17 = ((bArr[2] & 255) << 8) | ((bArr[i13] & 255) << 24) | ((bArr[c10] & 255) << 16) | (bArr[3] & 255);
                        i13 = 0;
                    }
                    i16 = i17;
                }
                i11 = i16;
                i10 = 3;
            } else {
                i10 = 3;
                Ik0 unused2 = hk0.f67498e;
                i11 = 0;
            }
            Integer numValueOf = Integer.valueOf(i11);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException("Id " + i11 + " is used twice in the keyset");
            }
            hashSet.add(numValueOf);
            Hk0.a(hk0);
            Ck0 ck0A = No0.b().a(hk0.f67497d, c10 != hk0.f67497d.a() ? null : numValueOf);
            Kk0 kk0 = new Kk0(ck0A, hk0.f67495b, i11, hk0.f67494a, null);
            int i18 = i11;
            Ek0 ek0 = hk0.f67495b;
            C9749vp0 c9749vp0 = (C9749vp0) Xo0.c().d(ck0A, C9749vp0.class, Uk0.a());
            Integer numE = c9749vp0.e();
            if (numE != null && numE.intValue() != i18) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            Ek0 ek02 = Ek0.f66503b;
            if (ek02.equals(ek0)) {
                i12 = i10;
            } else if (Ek0.f66504c.equals(ek0)) {
                i12 = 4;
            } else {
                if (!Ek0.f66505d.equals(ek0)) {
                    throw new IllegalStateException("Unknown key status");
                }
                i12 = 5;
            }
            C8366is0 c8366is0D0 = C8472js0.d0();
            Wr0 wr0B0 = Zr0.b0();
            wr0B0.v(c9749vp0.f());
            wr0B0.w(c9749vp0.d());
            wr0B0.u(c9749vp0.b());
            c8366is0D0.u(wr0B0);
            c8366is0D0.x(i12);
            c8366is0D0.v(i18);
            c8366is0D0.w(c9749vp0.c());
            c8260hs0D0.u((C8472js0) c8366is0D0.p());
            if (hk0.f67494a) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (hk0.f67495b != ek02) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(kk0);
            c10 = 1;
            i13 = 0;
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        c8260hs0D0.v(num.intValue());
        C8686ls0 c8686ls0 = (C8686ls0) c8260hs0D0.p();
        Mk0.h(c8686ls0);
        return new Mk0(c8686ls0, arrayList, this.f67960b, null);
    }

    public final Jk0 a(Hk0 hk0) {
        if (hk0.f67499f == null) {
            if (hk0.f67494a) {
                d();
            }
            hk0.f67499f = this;
            this.f67959a.add(hk0);
            return this;
        }
        throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
    }
}
