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

/* loaded from: classes14.dex */
public class aP {

    /* renamed from: a, reason: collision with root package name */
    private static volatile Bitmap f131503a;

    /* renamed from: b, reason: collision with root package name */
    private WeakHashMap f131504b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    private gf f131505c = new gf();

    /* renamed from: d, reason: collision with root package name */
    private C14064ei f131506d;

    /* renamed from: e, reason: collision with root package name */
    private E f131507e;

    /* renamed from: f, reason: collision with root package name */
    private bU f131508f;

    /* renamed from: g, reason: collision with root package name */
    private C13966ar f131509g;

    /* renamed from: h, reason: collision with root package name */
    private C14070eo f131510h;

    public aP(C13966ar c13966ar, C14070eo c14070eo, bU bUVar, C14064ei c14064ei, E e10) {
        this.f131509g = c13966ar;
        this.f131510h = c14070eo;
        this.f131506d = c14064ei;
        this.f131507e = e10;
        this.f131508f = bUVar;
    }

    private String a(Bitmap.CompressFormat compressFormat) {
        return compressFormat == Bitmap.CompressFormat.WEBP ? "image/webp" : compressFormat == Bitmap.CompressFormat.JPEG ? "image/jpeg" : compressFormat == Bitmap.CompressFormat.PNG ? "image/png" : "image/unknown";
    }

    private String a(Bitmap.CompressFormat compressFormat, aS aSVar) {
        eD eDVar;
        URL urlM;
        try {
            File fileA = this.f131507e.a(compressFormat.toString().toLowerCase());
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
                if (this.f131509g == null) {
                    Log.e("sessionKnobs == null but tried to upload an image");
                } else {
                    if (this.f131506d.c() == EnumC14067el.YES) {
                        eDVar = eD.UNREADY;
                        urlM = new URL(this.f131509g.m().toExternalForm() + "&ClientSha1Hash=" + strEncodeToString);
                    } else {
                        eDVar = eD.READY;
                        urlM = this.f131509g.m();
                    }
                    this.f131510h.a(this.f131509g.b(), fileA, urlM, a(compressFormat), eC.LOW, EnumC14073er.NONE, eDVar, strEncodeToString);
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
        f131503a = bitmap;
        boolean zIsRecycled = f131503a.isRecycled();
        f131503a = null;
        return zIsRecycled;
    }

    private String c(Bitmap bitmap, int i10, int i11) {
        C13966ar c13966ar = this.f131509g;
        if (c13966ar == null) {
            Log.e("sessionKnobs == null but tried to upload an image");
            return null;
        }
        Bitmap.CompressFormat compressFormat = c13966ar.p() ? Bitmap.CompressFormat.WEBP : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
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
        C14103fu.b("The trackBitmap method should NEVER be called on the UI thread", new Object[0]);
        String str = (String) this.f131504b.get(bitmap);
        if (a(bitmap)) {
            this.f131504b.remove(bitmap);
            Log.w("bitmap recycled after canvas checks and made it through to encoding, discarding from uploads");
            return null;
        }
        int generationId = bitmap.getGenerationId();
        int density = bitmap.getDensity();
        if (this.f131504b.containsKey(bitmap) && generationId == this.f131505c.b(bitmap)) {
            return str;
        }
        bT bTVarA = this.f131508f.a();
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
            } else if (C14106fx.a(bitmap)) {
                Bitmap bitmapB = C14106fx.b(bitmap);
                canvas.drawBitmap(bitmapB, 0.0f, 0.0f, (Paint) null);
                C14106fx.a(bitmapB, bitmap);
            } else {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            density = density2;
        } else {
            bitmapA = bitmap;
        }
        String strC = c(bitmapA, i10, i11);
        this.f131504b.put(bitmap, strC);
        this.f131505c.a(bitmap, generationId);
        if (bitmapA != bitmap) {
            bitmapA.setDensity(density);
            bTVarA.a(bitmapA);
        }
        return strC;
    }
}
