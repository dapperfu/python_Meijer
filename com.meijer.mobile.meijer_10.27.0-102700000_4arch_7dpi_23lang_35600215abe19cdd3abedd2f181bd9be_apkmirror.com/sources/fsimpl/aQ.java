package fsimpl;

import android.graphics.Bitmap;
import com.fullstory.util.Log;
import java.io.OutputStream;

/* loaded from: classes14.dex */
class aQ implements aS {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bitmap f131511a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bitmap.CompressFormat f131512b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f131513c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f131514d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aP f131515e;

    aQ(aP aPVar, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i10, int i11) {
        this.f131515e = aPVar;
        this.f131511a = bitmap;
        this.f131512b = compressFormat;
        this.f131513c = i10;
        this.f131514d = i11;
    }

    @Override // fsimpl.aS
    public void a(OutputStream outputStream) {
        String str;
        if (aP.a(this.f131511a)) {
            str = "bitmap recycled after canvas checks and made it through to encoding, discarding from uploads";
        } else if (this.f131511a.compress(this.f131512b, 50, outputStream)) {
            return;
        } else {
            str = "Failed to compress bitmap for unknown reasons: " + (aP.a(this.f131511a) ? "" : "format=" + this.f131511a.getConfig()) + " dim=" + this.f131513c + "x" + this.f131514d;
        }
        Log.w(str);
    }
}
