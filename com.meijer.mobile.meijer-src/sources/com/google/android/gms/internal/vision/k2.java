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
    private final C11176l1 f85406i;

    public k2(Context context, C11176l1 c11176l1) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.f85406i = c11176l1;
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
        return f22.m2(com.google.android.gms.dynamic.d.I2(context), (C11176l1) com.google.android.gms.common.internal.r.l(this.f85406i));
    }

    @Override // com.google.android.gms.internal.vision.H2
    protected final void b() throws RemoteException {
        if (c()) {
            ((L1) com.google.android.gms.common.internal.r.l(e())).zza();
        }
    }

    public final Xd.a[] f(Bitmap bitmap, G2 g22) {
        if (!c()) {
            return new Xd.a[0];
        }
        try {
            return ((L1) com.google.android.gms.common.internal.r.l(e())).s6(com.google.android.gms.dynamic.d.I2(bitmap), g22);
        } catch (RemoteException e10) {
            FS.log_e("BarcodeNativeHandle", "Error calling native barcode detector", e10);
            return new Xd.a[0];
        }
    }

    public final Xd.a[] g(ByteBuffer byteBuffer, G2 g22) {
        if (!c()) {
            return new Xd.a[0];
        }
        try {
            return ((L1) com.google.android.gms.common.internal.r.l(e())).T5(com.google.android.gms.dynamic.d.I2(byteBuffer), g22);
        } catch (RemoteException e10) {
            FS.log_e("BarcodeNativeHandle", "Error calling native barcode detector", e10);
            return new Xd.a[0];
        }
    }
}
