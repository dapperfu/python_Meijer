package com.google.android.gms.internal.ads;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.google.android.gms.internal.ads.cS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7681cS implements C80 {

    /* renamed from: a, reason: collision with root package name */
    private final QR f73180a;

    /* renamed from: b, reason: collision with root package name */
    private final UR f73181b;

    C7681cS(QR qr2, UR ur2) {
        this.f73180a = qr2;
        this.f73181b = ur2;
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void C(EnumC9681v80 enumC9681v80, String str) {
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void L(EnumC9681v80 enumC9681v80, String str) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76270b6)).booleanValue()) {
            if (EnumC9681v80.RENDERER == enumC9681v80) {
                this.f73180a.g(Lc.v.c().c());
                return;
            }
            if (EnumC9681v80.PRELOADED_LOADER == enumC9681v80 || EnumC9681v80.SERVER_TRANSACTION == enumC9681v80) {
                this.f73180a.h(Lc.v.c().c());
                final UR ur2 = this.f73181b;
                final long jD = this.f73180a.d();
                ur2.f72169b.a(new InterfaceC7865e80() { // from class: com.google.android.gms.internal.ads.TR
                    @Override // com.google.android.gms.internal.ads.InterfaceC7865e80
                    public final Object zza(Object obj) throws SQLException {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (ur2.a()) {
                            return null;
                        }
                        long j10 = jD;
                        C9510td c9510tdE0 = C9403sd.E0();
                        c9510tdE0.H(j10);
                        byte[] bArrJ = c9510tdE0.p().j();
                        C7575bS.f(sQLiteDatabase, false, false);
                        C7575bS.c(sQLiteDatabase, j10, bArrJ);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void a(EnumC9681v80 enumC9681v80, String str, Throwable th2) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76270b6)).booleanValue() && EnumC9681v80.RENDERER == enumC9681v80 && this.f73180a.c() != 0) {
            this.f73180a.f(Lc.v.c().c() - this.f73180a.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.C80
    public final void i(EnumC9681v80 enumC9681v80, String str) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76270b6)).booleanValue() && EnumC9681v80.RENDERER == enumC9681v80 && this.f73180a.c() != 0) {
            this.f73180a.f(Lc.v.c().c() - this.f73180a.c());
        }
    }
}
