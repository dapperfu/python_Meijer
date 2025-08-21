package com.google.android.gms.internal.ads;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.google.android.gms.internal.ads.cS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7806cS implements C80 {

    /* renamed from: a, reason: collision with root package name */
    private final QR f74020a;

    /* renamed from: b, reason: collision with root package name */
    private final UR f74021b;

    C7806cS(QR qr2, UR ur2) {
        this.f74020a = qr2;
        this.f74021b = ur2;
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void J(EnumC9806v80 enumC9806v80, String str) {
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void N(EnumC9806v80 enumC9806v80, String str) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77110b6)).booleanValue()) {
            if (EnumC9806v80.RENDERER == enumC9806v80) {
                this.f74020a.g(Nc.v.c().c());
                return;
            }
            if (EnumC9806v80.PRELOADED_LOADER == enumC9806v80 || EnumC9806v80.SERVER_TRANSACTION == enumC9806v80) {
                this.f74020a.h(Nc.v.c().c());
                final UR ur2 = this.f74021b;
                final long jD = this.f74020a.d();
                ur2.f73009b.a(new InterfaceC7990e80() { // from class: com.google.android.gms.internal.ads.TR
                    @Override // com.google.android.gms.internal.ads.InterfaceC7990e80
                    public final Object zza(Object obj) throws SQLException {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (ur2.a()) {
                            return null;
                        }
                        long j10 = jD;
                        C9635td c9635tdE0 = C9528sd.E0();
                        c9635tdE0.H(j10);
                        byte[] bArrJ = c9635tdE0.p().j();
                        C7700bS.f(sQLiteDatabase, false, false);
                        C7700bS.c(sQLiteDatabase, j10, bArrJ);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void a(EnumC9806v80 enumC9806v80, String str, Throwable th2) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77110b6)).booleanValue() && EnumC9806v80.RENDERER == enumC9806v80 && this.f74020a.c() != 0) {
            this.f74020a.f(Nc.v.c().c() - this.f74020a.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void i(EnumC9806v80 enumC9806v80, String str) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77110b6)).booleanValue() && EnumC9806v80.RENDERER == enumC9806v80 && this.f74020a.c() != 0) {
            this.f74020a.f(Nc.v.c().c() - this.f74020a.c());
        }
    }
}
