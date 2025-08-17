package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.pal.q9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10858q9 implements InterfaceC10958we {

    /* renamed from: a, reason: collision with root package name */
    private final String f83805a;

    /* renamed from: b, reason: collision with root package name */
    private final int f83806b;

    /* renamed from: c, reason: collision with root package name */
    private Tb f83807c;

    /* renamed from: d, reason: collision with root package name */
    private C10923ub f83808d;

    /* renamed from: e, reason: collision with root package name */
    private int f83809e;

    /* renamed from: f, reason: collision with root package name */
    private C10701gc f83810f;

    @Override // com.google.android.gms.internal.pal.InterfaceC10958we
    public final int zza() {
        return this.f83806b;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10958we
    public final N9 zzb(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.f83806b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.f83805a.equals(C10630c8.f83075b)) {
            Sb sbU = Tb.u();
            sbU.f(this.f83807c);
            sbU.m(AbstractC10605b0.t(bArr, 0, this.f83806b));
            return new N9((InterfaceC10776l7) Z7.h(this.f83805a, (Tb) sbU.j(), InterfaceC10776l7.class));
        }
        if (!this.f83805a.equals(C10630c8.f83074a)) {
            if (!this.f83805a.equals(C10614b9.f83065a)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            C10685fc c10685fcU = C10701gc.u();
            c10685fcU.f(this.f83810f);
            c10685fcU.m(AbstractC10605b0.t(bArr, 0, this.f83806b));
            return new N9((InterfaceC10824o7) Z7.h(this.f83805a, (C10701gc) c10685fcU.j(), InterfaceC10824o7.class));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, this.f83809e);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, this.f83809e, this.f83806b);
        Ab abU = Bb.u();
        abU.f(this.f83808d.y());
        abU.m(AbstractC10605b0.s(bArrCopyOfRange));
        Bb bb2 = (Bb) abU.j();
        Qc qcU = Rc.u();
        qcU.f(this.f83808d.z());
        qcU.m(AbstractC10605b0.s(bArrCopyOfRange2));
        Rc rc2 = (Rc) qcU.j();
        C10907tb c10907tbU = C10923ub.u();
        c10907tbU.o(this.f83808d.t());
        c10907tbU.m(bb2);
        c10907tbU.n(rc2);
        return new N9((InterfaceC10776l7) Z7.h(this.f83805a, (C10923ub) c10907tbU.j(), InterfaceC10776l7.class));
    }

    C10858q9(C10957wd c10957wd) throws GeneralSecurityException {
        String strY = c10957wd.y();
        this.f83805a = strY;
        if (strY.equals(C10630c8.f83075b)) {
            try {
                Wb wbW = Wb.w(c10957wd.w(), C10833p0.a());
                this.f83807c = (Tb) Z7.d(c10957wd);
                this.f83806b = wbW.t();
                return;
            } catch (zzadi e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e10);
            }
        }
        if (strY.equals(C10630c8.f83074a)) {
            try {
                C10971xb c10971xbV = C10971xb.v(c10957wd.w(), C10833p0.a());
                this.f83808d = (C10923ub) Z7.d(c10957wd);
                this.f83809e = c10971xbV.w().t();
                this.f83806b = this.f83809e + c10971xbV.y().t();
                return;
            } catch (zzadi e11) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
            }
        }
        if (strY.equals(C10614b9.f83065a)) {
            try {
                C10749jc c10749jcW = C10749jc.w(c10957wd.w(), C10833p0.a());
                this.f83810f = (C10701gc) Z7.d(c10957wd);
                this.f83806b = c10749jcW.t();
                return;
            } catch (zzadi e12) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e12);
            }
        }
        throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(strY)));
    }
}
