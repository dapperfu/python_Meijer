package xg;

import Dd.AbstractC3178j0;
import Dd.Ca;
import Dd.Ea;
import Dd.Fa;
import Dd.La;
import Dd.N9;
import Dd.Y6;
import Dd.sa;
import Dd.ua;
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
import sg.C16968m;
import ug.C17255b;
import vg.C17567a;
import yg.C18212a;
import zg.C18456b;
import zg.C18458d;

/* loaded from: classes7.dex */
final class n implements l {

    /* renamed from: h, reason: collision with root package name */
    private static final AbstractC3178j0 f169633h = AbstractC3178j0.n("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* renamed from: a, reason: collision with root package name */
    private boolean f169634a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f169635b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f169636c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f169637d;

    /* renamed from: e, reason: collision with root package name */
    private final C17255b f169638e;

    /* renamed from: f, reason: collision with root package name */
    private final N9 f169639f;

    /* renamed from: g, reason: collision with root package name */
    private Ca f169640g;

    static boolean b(Context context) {
        return DynamiteModule.a(context, "com.google.mlkit.dynamite.barcode") > 0;
    }

    @Override // xg.l
    public final List a(C18212a c18212a) throws MlKitException {
        if (this.f169640g == null) {
            zzc();
        }
        Ca ca2 = (Ca) r.l(this.f169640g);
        if (!this.f169634a) {
            try {
                ca2.zze();
                this.f169634a = true;
            } catch (RemoteException e10) {
                throw new MlKitException("Failed to init barcode scanner.", 13, e10);
            }
        }
        int iJ = c18212a.j();
        if (c18212a.e() == 35) {
            iJ = ((Image.Plane[]) r.l(c18212a.h()))[0].getRowStride();
        }
        try {
            List listF2 = ca2.F2(C18458d.b().a(c18212a), new La(c18212a.e(), iJ, c18212a.f(), C18456b.a(c18212a.i()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = listF2.iterator();
            while (it.hasNext()) {
                arrayList.add(new C17567a(new m((sa) it.next()), c18212a.d()));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new MlKitException("Failed to run barcode scanner.", 13, e11);
        }
    }

    final Ca c(DynamiteModule.a aVar, String str, String str2) throws RemoteException, DynamiteModule.LoadingException {
        boolean z10;
        Fa faA1 = Ea.A1(DynamiteModule.e(this.f169637d, aVar, str).d(str2));
        C17255b c17255b = this.f169638e;
        com.google.android.gms.dynamic.b bVarF2 = com.google.android.gms.dynamic.d.F2(this.f169637d);
        int iA = c17255b.a();
        if (c17255b.d()) {
            z10 = true;
        } else {
            this.f169638e.b();
            z10 = false;
        }
        return faA1.n8(bVarF2, new ua(iA, z10));
    }

    @Override // xg.l
    public final void zzb() {
        Ca ca2 = this.f169640g;
        if (ca2 != null) {
            try {
                ca2.zzf();
            } catch (RemoteException e10) {
                FS.log_e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e10);
            }
            this.f169640g = null;
            this.f169634a = false;
        }
    }

    @Override // xg.l
    public final boolean zzc() throws MlKitException {
        if (this.f169640g != null) {
            return this.f169635b;
        }
        if (b(this.f169637d)) {
            this.f169635b = true;
            try {
                this.f169640g = c(DynamiteModule.f64997c, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e10) {
                throw new MlKitException("Failed to create thick barcode scanner.", 13, e10);
            } catch (DynamiteModule.LoadingException e11) {
                throw new MlKitException("Failed to load the bundled barcode module.", 13, e11);
            }
        } else {
            this.f169635b = false;
            if (!C16968m.a(this.f169637d, f169633h)) {
                if (!this.f169636c) {
                    C16968m.d(this.f169637d, AbstractC3178j0.n("barcode", "tflite_dynamite"));
                    this.f169636c = true;
                }
                C18046b.e(this.f169639f, Y6.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f169640g = c(DynamiteModule.f64996b, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.LoadingException e12) {
                C18046b.e(this.f169639f, Y6.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin barcode scanner.", 13, e12);
            }
        }
        C18046b.e(this.f169639f, Y6.NO_ERROR);
        return this.f169635b;
    }

    n(Context context, C17255b c17255b, N9 n92) {
        this.f169637d = context;
        this.f169638e = c17255b;
        this.f169639f = n92;
    }
}
