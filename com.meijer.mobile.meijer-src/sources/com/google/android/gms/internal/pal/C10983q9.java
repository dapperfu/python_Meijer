package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.pal.q9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10983q9 implements InterfaceC11083we {

    /* renamed from: a, reason: collision with root package name */
    private final String f84645a;

    /* renamed from: b, reason: collision with root package name */
    private final int f84646b;

    /* renamed from: c, reason: collision with root package name */
    private Tb f84647c;

    /* renamed from: d, reason: collision with root package name */
    private C11048ub f84648d;

    /* renamed from: e, reason: collision with root package name */
    private int f84649e;

    /* renamed from: f, reason: collision with root package name */
    private C10826gc f84650f;

    @Override // com.google.android.gms.internal.pal.InterfaceC11083we
    public final int zza() {
        return this.f84646b;
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC11083we
    public final N9 zzb(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.f84646b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.f84645a.equals(C10755c8.f83915b)) {
            Sb sbU = Tb.u();
            sbU.f(this.f84647c);
            sbU.m(AbstractC10730b0.t(bArr, 0, this.f84646b));
            return new N9((InterfaceC10901l7) Z7.h(this.f84645a, (Tb) sbU.j(), InterfaceC10901l7.class));
        }
        if (!this.f84645a.equals(C10755c8.f83914a)) {
            if (!this.f84645a.equals(C10739b9.f83905a)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            C10810fc c10810fcU = C10826gc.u();
            c10810fcU.f(this.f84650f);
            c10810fcU.m(AbstractC10730b0.t(bArr, 0, this.f84646b));
            return new N9((InterfaceC10949o7) Z7.h(this.f84645a, (C10826gc) c10810fcU.j(), InterfaceC10949o7.class));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, this.f84649e);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, this.f84649e, this.f84646b);
        Ab abU = Bb.u();
        abU.f(this.f84648d.y());
        abU.m(AbstractC10730b0.s(bArrCopyOfRange));
        Bb bb2 = (Bb) abU.j();
        Qc qcU = Rc.u();
        qcU.f(this.f84648d.z());
        qcU.m(AbstractC10730b0.s(bArrCopyOfRange2));
        Rc rc2 = (Rc) qcU.j();
        C11032tb c11032tbU = C11048ub.u();
        c11032tbU.o(this.f84648d.t());
        c11032tbU.m(bb2);
        c11032tbU.n(rc2);
        return new N9((InterfaceC10901l7) Z7.h(this.f84645a, (C11048ub) c11032tbU.j(), InterfaceC10901l7.class));
    }

    C10983q9(C11082wd c11082wd) throws GeneralSecurityException {
        String strY = c11082wd.y();
        this.f84645a = strY;
        if (strY.equals(C10755c8.f83915b)) {
            try {
                Wb wbW = Wb.w(c11082wd.w(), C10958p0.a());
                this.f84647c = (Tb) Z7.d(c11082wd);
                this.f84646b = wbW.t();
                return;
            } catch (zzadi e10) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e10);
            }
        }
        if (strY.equals(C10755c8.f83914a)) {
            try {
                C11096xb c11096xbV = C11096xb.v(c11082wd.w(), C10958p0.a());
                this.f84648d = (C11048ub) Z7.d(c11082wd);
                this.f84649e = c11096xbV.w().t();
                this.f84646b = this.f84649e + c11096xbV.y().t();
                return;
            } catch (zzadi e11) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e11);
            }
        }
        if (strY.equals(C10739b9.f83905a)) {
            try {
                C10874jc c10874jcW = C10874jc.w(c11082wd.w(), C10958p0.a());
                this.f84650f = (C10826gc) Z7.d(c11082wd);
                this.f84646b = c10874jcW.t();
                return;
            } catch (zzadi e12) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e12);
            }
        }
        throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(strY)));
    }
}
