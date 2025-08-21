package com.google.android.gms.internal.clearcut;

import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import gd.C14346a;
import gd.C14351f;

/* loaded from: classes6.dex */
final class h2 extends com.google.android.gms.common.api.internal.a<Status, l2> {

    /* renamed from: r, reason: collision with root package name */
    private final C14351f f82314r;

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.k b(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.a
    protected final /* synthetic */ void k(a.b bVar) throws RemoteException {
        l2 l2Var = (l2) bVar;
        k2 k2Var = new k2(this);
        try {
            C14351f c14351f = this.f82314r;
            c14351f.getClass();
            i2 i2Var = c14351f.f134174i;
            int iC = i2Var.c();
            byte[] bArr = new byte[iC];
            S1.b(i2Var, bArr, 0, iC);
            c14351f.f134167b = bArr;
            ((p2) l2Var.getService()).z9(k2Var, this.f82314r);
        } catch (RuntimeException e10) {
            FS.log_e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e10);
            o(new Status(10, "MessageProducer"));
        }
    }

    h2(C14351f c14351f, com.google.android.gms.common.api.e eVar) {
        super(C14346a.f134132p, eVar);
        this.f82314r = c14351f;
    }
}
