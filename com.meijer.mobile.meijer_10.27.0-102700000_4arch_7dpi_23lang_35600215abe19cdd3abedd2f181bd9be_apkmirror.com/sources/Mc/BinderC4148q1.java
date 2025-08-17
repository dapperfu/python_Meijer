package Mc;

import android.os.RemoteException;

/* renamed from: Mc.q1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class BinderC4148q1 extends C0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f19335a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19336b;

    @Override // Mc.D0
    public final String zze() throws RemoteException {
        return this.f19335a;
    }

    @Override // Mc.D0
    public final String zzf() throws RemoteException {
        return this.f19336b;
    }

    public BinderC4148q1(String str, String str2) {
        this.f19335a = str;
        this.f19336b = str2;
    }
}
