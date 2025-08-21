package fsimpl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Base64;
import com.fullstory.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.security.MessageDigest;
import java.util.WeakHashMap;

/* loaded from: classes15.dex */
public class aP {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Bitmap f132753a;

    /* renamed from: b, reason: collision with root package name */
    private WeakHashMap f132754b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    private gf f132755c = new gf();

    /* renamed from: d, reason: collision with root package name */
    private C14189ei f132756d;

    /* renamed from: e, reason: collision with root package name */
    private E f132757e;

    /* renamed from: f, reason: collision with root package name */
    private bU f132758f;

    /* renamed from: g, reason: collision with root package name */
    private C14091ar f132759g;

    /* renamed from: h, reason: collision with root package name */
    private C14195eo f132760h;

    public aP(C14091ar c14091ar, C14195eo c14195eo, bU bUVar, C14189ei c14189ei, E e10) {
        this.f132759g = c14091ar;
        this.f132760h = c14195eo;
        this.f132756d = c14189ei;
        this.f132757e = e10;
        this.f132758f = bUVar;
    }

    private String a(Bitmap.CompressFormat compressFormat) {
        return compressFormat == Bitmap.CompressFormat.WEBP ? "image/webp" : compressFormat == Bitmap.CompressFormat.JPEG ? "image/jpeg" : compressFormat == Bitmap.CompressFormat.PNG ? "image/png" : "image/unknown";
    }

    private String a(Bitmap.CompressFormat compressFormat, aS aSVar) {
        eD eDVar;
        URL urlM;
        try {
            File fileA = this.f132757e.a(compressFormat.toString().toLowerCase());
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            FileOutputStream fileOutputStream = new FileOutputStream(fileA);
            try {
                aSVar.a(new aR(this, fileOutputStream, messageDigest));
                fileOutputStream.close();
                byte[] bArrDigest = messageDigest.digest();
                if (fileA.length() == 0) {
                    Log.w("Cowardly refusing to upload a zero-byte image");
                    return null;
                }
                String strEncodeToString = Base64.encodeToString(bArrDigest, 10);
                if (this.f132759g == null) {
                    Log.e("sessionKnobs == null but tried to upload an image");
                } else {
                    if (this.f132756d.c() == EnumC14192el.YES) {
                        eDVar = eD.UNREADY;
                        urlM = new URL(this.f132759g.m().toExternalForm() + "&ClientSha1Hash=" + strEncodeToString);
                    } else {
                        eDVar = eD.READY;
                        urlM = this.f132759g.m();
                    }
                    this.f132760h.a(this.f132759g.b(), fileA, urlM, a(compressFormat), eC.LOW, EnumC14198er.NONE, eDVar, strEncodeToString);
                }
                return strEncodeToString;
            } finally {
            }
        } catch (Throwable th2) {
            dI.a("Unexpected error", th2);
            return null;
        }
    }

    public static boolean a(Bitmap bitmap) {
        f132753a = bitmap;
        boolean zIsRecycled = f132753a.isRecycled();
        f132753a = null;
        return zIsRecycled;
    }

    private String c(Bitmap bitmap, int i10, int i11) {
        C14091ar c14091ar = this.f132759g;
        if (c14091ar == null) {
            Log.e("sessionKnobs == null but tried to upload an image");
            return null;
        }
        Bitmap.CompressFormat compressFormat = c14091ar.p() ? Bitmap.CompressFormat.WEBP : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        try {
            String strA = a(compressFormat, new aQ(this, bitmap, compressFormat, i10, i11));
            if (strA == null) {
                Log.w("Failed to compress bitmap for unknown reasons: " + (a(bitmap) ? "" : "format=" + bitmap.getConfig()) + " dim=" + i10 + "x" + i11);
            }
            return strA;
        } catch (Throwable th2) {
            dI.a("Unable to cache bitmap", th2);
            return null;
        }
    }

    public String a(Bitmap bitmap, int i10, int i11) {
        return c(bitmap, i10, i11);
    }

    public String b(Bitmap bitmap, int i10, int i11) {
        Bitmap bitmapA;
        C14228fu.b("The trackBitmap method should NEVER be called on the UI thread", new Object[0]);
        String str = (String) this.f132754b.get(bitmap);
        if (a(bitmap)) {
            this.f132754b.remove(bitmap);
            Log.w("bitmap recycled after canvas checks and made it through to encoding, discarding from uploads");
            return null;
        }
        int generationId = bitmap.getGenerationId();
        int density = bitmap.getDensity();
        if (this.f132754b.containsKey(bitmap) && generationId == this.f132755c.b(bitmap)) {
            return str;
        }
        bT bTVarA = this.f132758f.a();
        int iA = bTVarA.a();
        if (Math.max(i10, i11) > iA || bitmap.getConfig() == Bitmap.Config.ALPHA_8) {
            bitmapA = bTVarA.a("resize", true);
            int density2 = bitmapA.getDensity();
            bitmapA.setDensity(density);
            Log.d("Resized before upload " + i10 + "x" + i11 + " -> " + iA + "x" + iA + " and density " + density2 + " -> " + density);
            Canvas canvas = new Canvas(bitmapA);
            float f10 = iA;
            canvas.scale(f10 / i10, f10 / i11);
            if (a(bitmap)) {
                Log.w("bitmap recycled after canvas checks and made it through to encoding, discarding from uploads");
            } else if (C14231fx.a(bitmap)) {
                Bitmap bitmapB = C14231fx.b(bitmap);
                canvas.drawBitmap(bitmapB, 0.0f, 0.0f, (Paint) null);
                C14231fx.a(bitmapB, bitmap);
            } else {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            density = density2;
        } else {
            bitmapA = bitmap;
        }
        String strC = c(bitmapA, i10, i11);
        this.f132754b.put(bitmap, strC);
        this.f132755c.a(bitmap, generationId);
        if (bitmapA != bitmap) {
            bitmapA.setDensity(density);
            bTVarA.a(bitmapA);
        }
        return strC;
    }
}
