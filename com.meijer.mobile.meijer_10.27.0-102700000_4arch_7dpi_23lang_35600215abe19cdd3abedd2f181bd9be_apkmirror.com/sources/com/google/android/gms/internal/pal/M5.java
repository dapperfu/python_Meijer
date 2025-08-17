package com.google.android.gms.internal.pal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC6521c;

/* loaded from: classes6.dex */
public final class M5 extends Z4 {

    /* renamed from: a, reason: collision with root package name */
    private final int f82766a;

    @Override // com.google.android.gms.common.internal.AbstractC6521c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return this.f82766a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.gass.START";
    }

    public M5(Context context, Looper looper, AbstractC6521c.a aVar, AbstractC6521c.b bVar, int i10) {
        super(context, looper, 116, aVar, bVar, null);
        this.f82766a = 9200000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC6521c
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof R5 ? (R5) iInterfaceQueryLocalInterface : new R5(iBinder);
    }

    public final R5 c() throws DeadObjectException {
        return (R5) super.getService();
    }
}
