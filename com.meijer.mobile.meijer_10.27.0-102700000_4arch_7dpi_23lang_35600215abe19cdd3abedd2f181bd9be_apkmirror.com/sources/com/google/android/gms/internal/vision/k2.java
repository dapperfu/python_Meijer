package com.google.android.gms.internal.vision;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.dynamite.DynamiteModule;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class k2 extends H2<L1> {

    /* renamed from: i, reason: collision with root package name */
    private final C11051l1 f84566i;

    public k2(Context context, C11051l1 c11051l1) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.f84566i = c11051l1;
        e();
    }

    @Override // com.google.android.gms.internal.vision.H2
    protected final /* synthetic */ L1 a(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.LoadingException {
        D2 f22;
        IBinder iBinderD = dynamiteModule.d("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
        if (iBinderD == null) {
            f22 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinderD.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
            f22 = iInterfaceQueryLocalInterface instanceof D2 ? (D2) iInterfaceQueryLocalInterface : new F2(iBinderD);
        }
        if (f22 == null) {
            return null;
        }
        return f22.m2(com.google.android.gms.dynamic.d.F2(context), (C11051l1) com.google.android.gms.common.internal.r.l(this.f84566i));
    }

    @Override // com.google.android.gms.internal.vision.H2
    protected final void b() throws RemoteException {
        if (c()) {
            ((L1) com.google.android.gms.common.internal.r.l(e())).zza();
        }
    }

    public final Vd.a[] f(Bitmap bitmap, G2 g22) {
        if (!c()) {
            return new Vd.a[0];
        }
        try {
            return ((L1) com.google.android.gms.common.internal.r.l(e())).d6(com.google.android.gms.dynamic.d.F2(bitmap), g22);
        } catch (RemoteException e10) {
            FS.log_e("BarcodeNativeHandle", "Error calling native barcode detector", e10);
            return new Vd.a[0];
        }
    }

    public final Vd.a[] g(ByteBuffer byteBuffer, G2 g22) {
        if (!c()) {
            return new Vd.a[0];
        }
        try {
            return ((L1) com.google.android.gms.common.internal.r.l(e())).K5(com.google.android.gms.dynamic.d.F2(byteBuffer), g22);
        } catch (RemoteException e10) {
            FS.log_e("BarcodeNativeHandle", "Error calling native barcode detector", e10);
            return new Vd.a[0];
        }
    }
}
