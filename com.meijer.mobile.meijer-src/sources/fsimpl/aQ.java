package fsimpl;

import android.graphics.Bitmap;
import com.fullstory.util.Log;
import java.io.OutputStream;

/* loaded from: classes15.dex */
class aQ implements aS {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bitmap f132761a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bitmap.CompressFormat f132762b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f132763c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f132764d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aP f132765e;

    aQ(aP aPVar, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int i10, int i11) {
        this.f132765e = aPVar;
        this.f132761a = bitmap;
        this.f132762b = compressFormat;
        this.f132763c = i10;
        this.f132764d = i11;
    }

    @Override // fsimpl.aS
    public void a(OutputStream outputStream) {
        String str;
        if (aP.a(this.f132761a)) {
            str = "bitmap recycled after canvas checks and made it through to encoding, discarding from uploads";
        } else if (this.f132761a.compress(this.f132762b, 50, outputStream)) {
            return;
        } else {
            str = "Failed to compress bitmap for unknown reasons: " + (aP.a(this.f132761a) ? "" : "format=" + this.f132761a.getConfig()) + " dim=" + this.f132763c + "x" + this.f132764d;
        }
        Log.w(str);
    }
}
