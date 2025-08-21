package zg;

import Fd.AbstractC3400j0;
import Fd.Ca;
import Fd.Ea;
import Fd.Fa;
import Fd.La;
import Fd.N9;
import Fd.Y6;
import Fd.sa;
import Fd.ua;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import com.fullstory.FS;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ug.C17415m;
import wg.C17872b;
import xg.C18179a;

/* loaded from: classes8.dex */
final class n implements l {

    /* renamed from: h, reason: collision with root package name */
    private static final AbstractC3400j0 f172782h = AbstractC3400j0.n("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* renamed from: a, reason: collision with root package name */
    private boolean f172783a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f172784b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f172785c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f172786d;

    /* renamed from: e, reason: collision with root package name */
    private final C17872b f172787e;

    /* renamed from: f, reason: collision with root package name */
    private final N9 f172788f;

    /* renamed from: g, reason: collision with root package name */
    private Ca f172789g;

    static boolean b(Context context) {
        return DynamiteModule.a(context, "com.google.mlkit.dynamite.barcode") > 0;
    }

    @Override // zg.l
    public final List a(Ag.a aVar) throws MlKitException {
        if (this.f172789g == null) {
            zzc();
        }
        Ca ca2 = (Ca) r.l(this.f172789g);
        if (!this.f172783a) {
            try {
                ca2.zze();
                this.f172783a = true;
            } catch (RemoteException e10) {
                throw new MlKitException("Failed to init barcode scanner.", 13, e10);
            }
        }
        int iJ = aVar.j();
        if (aVar.e() == 35) {
            iJ = ((Image.Plane[]) r.l(aVar.h()))[0].getRowStride();
        }
        try {
            List listI2 = ca2.I2(Bg.d.b().a(aVar), new La(aVar.e(), iJ, aVar.f(), Bg.b.a(aVar.i()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = listI2.iterator();
            while (it.hasNext()) {
                arrayList.add(new C18179a(new m((sa) it.next()), aVar.d()));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new MlKitException("Failed to run barcode scanner.", 13, e11);
        }
    }

    final Ca c(DynamiteModule.a aVar, String str, String str2) throws RemoteException, DynamiteModule.LoadingException {
        boolean z10;
        Fa faK1 = Ea.K1(DynamiteModule.e(this.f172786d, aVar, str).d(str2));
        C17872b c17872b = this.f172787e;
        com.google.android.gms.dynamic.b bVarI2 = com.google.android.gms.dynamic.d.I2(this.f172786d);
        int iA = c17872b.a();
        if (c17872b.d()) {
            z10 = true;
        } else {
            this.f172787e.b();
            z10 = false;
        }
        return faK1.J8(bVarI2, new ua(iA, z10));
    }

    @Override // zg.l
    public final void zzb() {
        Ca ca2 = this.f172789g;
        if (ca2 != null) {
            try {
                ca2.zzf();
            } catch (RemoteException e10) {
                FS.log_e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e10);
            }
            this.f172789g = null;
            this.f172783a = false;
        }
    }

    @Override // zg.l
    public final boolean zzc() throws MlKitException {
        if (this.f172789g != null) {
            return this.f172784b;
        }
        if (b(this.f172786d)) {
            this.f172784b = true;
            try {
                this.f172789g = c(DynamiteModule.f65837c, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e10) {
                throw new MlKitException("Failed to create thick barcode scanner.", 13, e10);
            } catch (DynamiteModule.LoadingException e11) {
                throw new MlKitException("Failed to load the bundled barcode module.", 13, e11);
            }
        } else {
            this.f172784b = false;
            if (!C17415m.a(this.f172786d, f172782h)) {
                if (!this.f172785c) {
                    C17415m.d(this.f172786d, AbstractC3400j0.n("barcode", "tflite_dynamite"));
                    this.f172785c = true;
                }
                C18483b.e(this.f172788f, Y6.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f172789g = c(DynamiteModule.f65836b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.LoadingException e12) {
                C18483b.e(this.f172788f, Y6.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin barcode scanner.", 13, e12);
            }
        }
        C18483b.e(this.f172788f, Y6.NO_ERROR);
        return this.f172784b;
    }

    n(Context context, C17872b c17872b, N9 n92) {
        this.f172786d = context;
        this.f172787e = c17872b;
        this.f172788f = n92;
    }
}
