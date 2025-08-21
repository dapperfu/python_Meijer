package Oc;

import android.os.RemoteException;

/* renamed from: Oc.q1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class BinderC4426q1 extends C0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f23522a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23523b;

    @Override // Oc.D0
    public final String zze() throws RemoteException {
        return this.f23522a;
    }

    @Override // Oc.D0
    public final String zzf() throws RemoteException {
        return this.f23523b;
    }

    public BinderC4426q1(String str, String str2) {
        this.f23522a = str;
        this.f23523b = str2;
    }
}
