package com.google.android.gms.internal.clearcut;

import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import ed.C13642a;
import ed.C13647f;

/* loaded from: classes6.dex */
final class h2 extends com.google.android.gms.common.api.internal.a<Status, l2> {

    /* renamed from: r, reason: collision with root package name */
    private final C13647f f81474r;

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ com.google.android.gms.common.api.k b(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.a
    protected final /* synthetic */ void k(a.b bVar) throws RemoteException {
        l2 l2Var = (l2) bVar;
        k2 k2Var = new k2(this);
        try {
            C13647f c13647f = this.f81474r;
            c13647f.getClass();
            i2 i2Var = c13647f.f128706i;
            int iC = i2Var.c();
            byte[] bArr = new byte[iC];
            S1.b(i2Var, bArr, 0, iC);
            c13647f.f128699b = bArr;
            ((p2) l2Var.getService()).o6(k2Var, this.f81474r);
        } catch (RuntimeException e10) {
            FS.log_e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e10);
            o(new Status(10, "MessageProducer"));
        }
    }

    h2(C13647f c13647f, com.google.android.gms.common.api.e eVar) {
        super(C13642a.f128664p, eVar);
        this.f81474r = c13647f;
    }
}
