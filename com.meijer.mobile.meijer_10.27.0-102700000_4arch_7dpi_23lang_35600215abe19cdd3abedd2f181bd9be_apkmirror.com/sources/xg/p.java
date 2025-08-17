package xg;

import Dd.AbstractBinderC3213m;
import Dd.C3165i;
import Dd.C3189k;
import Dd.C3237o;
import Dd.C3366z8;
import Dd.N9;
import Dd.Y6;
import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import com.fullstory.FS;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;
import sg.C16968m;
import ug.C17255b;
import vg.C17567a;
import yg.C18212a;
import zg.C18456b;
import zg.C18457c;

/* loaded from: classes7.dex */
final class p implements l {

    /* renamed from: a, reason: collision with root package name */
    private boolean f169642a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f169643b;

    /* renamed from: c, reason: collision with root package name */
    private final C3165i f169644c;

    /* renamed from: d, reason: collision with root package name */
    private final N9 f169645d;

    /* renamed from: e, reason: collision with root package name */
    private C3189k f169646e;

    @Override // xg.l
    public final List a(C18212a c18212a) throws MlKitException {
        C3366z8[] c3366z8ArrN3;
        if (this.f169646e == null) {
            zzc();
        }
        C3189k c3189k = this.f169646e;
        if (c3189k == null) {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
        C3189k c3189k2 = (C3189k) r.l(c3189k);
        C3237o c3237o = new C3237o(c18212a.j(), c18212a.f(), 0, 0L, C18456b.a(c18212a.i()));
        try {
            int iE = c18212a.e();
            if (iE == -1) {
                c3366z8ArrN3 = c3189k2.N3(com.google.android.gms.dynamic.d.F2(c18212a.b()), c3237o);
            } else if (iE == 17) {
                c3366z8ArrN3 = c3189k2.F2(com.google.android.gms.dynamic.d.F2(c18212a.c()), c3237o);
            } else if (iE == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) r.l(c18212a.h());
                c3237o.f6193a = planeArr[0].getRowStride();
                c3366z8ArrN3 = c3189k2.F2(com.google.android.gms.dynamic.d.F2(planeArr[0].getBuffer()), c3237o);
            } else {
                if (iE != 842094169) {
                    throw new MlKitException("Unsupported image format: " + c18212a.e(), 3);
                }
                c3366z8ArrN3 = c3189k2.F2(com.google.android.gms.dynamic.d.F2(C18457c.c().b(c18212a, false)), c3237o);
            }
            ArrayList arrayList = new ArrayList();
            for (C3366z8 c3366z8 : c3366z8ArrN3) {
                arrayList.add(new C17567a(new o(c3366z8), c18212a.d()));
            }
            return arrayList;
        } catch (RemoteException e10) {
            throw new MlKitException("Failed to detect with legacy barcode detector", 13, e10);
        }
    }

    @Override // xg.l
    public final void zzb() {
        C3189k c3189k = this.f169646e;
        if (c3189k != null) {
            try {
                c3189k.zzd();
            } catch (RemoteException e10) {
                FS.log_e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e10);
            }
            this.f169646e = null;
        }
    }

    @Override // xg.l
    public final boolean zzc() throws MlKitException {
        if (this.f169646e != null) {
            return false;
        }
        try {
            C3189k c3189kE4 = AbstractBinderC3213m.A1(DynamiteModule.e(this.f169643b, DynamiteModule.f64996b, "com.google.android.gms.vision.dynamite").d("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).E4(com.google.android.gms.dynamic.d.F2(this.f169643b), this.f169644c);
            this.f169646e = c3189kE4;
            if (c3189kE4 == null && !this.f169642a) {
                FS.log_d("LegacyBarcodeScanner", "Request optional module download.");
                C16968m.c(this.f169643b, "barcode");
                this.f169642a = true;
                C18046b.e(this.f169645d, Y6.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            C18046b.e(this.f169645d, Y6.NO_ERROR);
            return false;
        } catch (RemoteException e10) {
            throw new MlKitException("Failed to create legacy barcode detector.", 13, e10);
        } catch (DynamiteModule.LoadingException e11) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e11);
        }
    }

    p(Context context, C17255b c17255b, N9 n92) {
        C3165i c3165i = new C3165i();
        this.f169644c = c3165i;
        this.f169643b = context;
        c3165i.f6085a = c17255b.a();
        this.f169645d = n92;
    }
}
