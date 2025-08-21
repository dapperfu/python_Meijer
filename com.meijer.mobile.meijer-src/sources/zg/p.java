package zg;

import Fd.AbstractBinderC3435m;
import Fd.C3387i;
import Fd.C3411k;
import Fd.C3459o;
import Fd.C3588z8;
import Fd.N9;
import Fd.Y6;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
import ug.C17415m;
import wg.C17872b;
import xg.C18179a;

/* loaded from: classes8.dex */
final class p implements l {

    /* renamed from: a, reason: collision with root package name */
    private boolean f172791a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f172792b;

    /* renamed from: c, reason: collision with root package name */
    private final C3387i f172793c;

    /* renamed from: d, reason: collision with root package name */
    private final N9 f172794d;

    /* renamed from: e, reason: collision with root package name */
    private C3411k f172795e;

    @Override // zg.l
    public final List a(Ag.a aVar) throws MlKitException {
        C3588z8[] c3588z8ArrZ3;
        if (this.f172795e == null) {
            zzc();
        }
        C3411k c3411k = this.f172795e;
        if (c3411k == null) {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
        C3411k c3411k2 = (C3411k) r.l(c3411k);
        C3459o c3459o = new C3459o(aVar.j(), aVar.f(), 0, 0L, Bg.b.a(aVar.i()));
        try {
            int iE = aVar.e();
            if (iE == -1) {
                c3588z8ArrZ3 = c3411k2.Z3(com.google.android.gms.dynamic.d.I2(aVar.b()), c3459o);
            } else if (iE == 17) {
                c3588z8ArrZ3 = c3411k2.I2(com.google.android.gms.dynamic.d.I2(aVar.c()), c3459o);
            } else if (iE == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) r.l(aVar.h());
                c3459o.f10226a = planeArr[0].getRowStride();
                c3588z8ArrZ3 = c3411k2.I2(com.google.android.gms.dynamic.d.I2(planeArr[0].getBuffer()), c3459o);
            } else {
                if (iE != 842094169) {
                    throw new MlKitException("Unsupported image format: " + aVar.e(), 3);
                }
                c3588z8ArrZ3 = c3411k2.I2(com.google.android.gms.dynamic.d.I2(Bg.c.c().b(aVar, false)), c3459o);
            }
            ArrayList arrayList = new ArrayList();
            for (C3588z8 c3588z8 : c3588z8ArrZ3) {
                arrayList.add(new C18179a(new o(c3588z8), aVar.d()));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new MlKitException("Failed to detect with legacy barcode detector", 13, e10);
        }
    }

    @Override // zg.l
    public final void zzb() {
        C3411k c3411k = this.f172795e;
        if (c3411k != null) {
            try {
                c3411k.zzd();
            } catch (RemoteException e10) {
                FS.log_e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e10);
            }
            this.f172795e = null;
        }
    }

    @Override // zg.l
    public final boolean zzc() throws MlKitException {
        if (this.f172795e != null) {
            return false;
        }
        try {
            C3411k c3411kR3 = AbstractBinderC3435m.K1(DynamiteModule.e(this.f172792b, DynamiteModule.f65836b, "com.google.android.gms.vision.dynamite").d("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).r3(com.google.android.gms.dynamic.d.I2(this.f172792b), this.f172793c);
            this.f172795e = c3411kR3;
            if (c3411kR3 == null && !this.f172791a) {
                FS.log_d("LegacyBarcodeScanner", "Request optional module download.");
                C17415m.c(this.f172792b, "barcode");
                this.f172791a = true;
                C18483b.e(this.f172794d, Y6.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            C18483b.e(this.f172794d, Y6.NO_ERROR);
            return false;
        } catch (RemoteException e10) {
            throw new MlKitException("Failed to create legacy barcode detector.", 13, e10);
        } catch (DynamiteModule.LoadingException e11) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e11);
        }
    }

    p(Context context, C17872b c17872b, N9 n92) {
        C3387i c3387i = new C3387i();
        this.f172793c = c3387i;
        this.f172792b = context;
        c3387i.f10118a = c17872b.a();
        this.f172794d = n92;
    }
}
