package m6;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import g6.InterfaceC14203c;
import g6.z;
import java.io.IOException;
import java.util.Map;
import u6.g;
import u6.q;

/* renamed from: m6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15565b {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f149867d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f149868a;

    /* renamed from: b, reason: collision with root package name */
    private final String f149869b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, z> f149870c;

    public boolean b(Context context) {
        if (context == null) {
            return this.f149868a == null;
        }
        if (this.f149868a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f149868a;
    }

    public void d(InterfaceC14203c interfaceC14203c) {
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (f149867d) {
            this.f149870c.get(str).g(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        z zVar = this.f149870c.get(str);
        if (zVar == null) {
            return null;
        }
        Bitmap bitmapB = zVar.b();
        if (bitmapB != null) {
            return bitmapB;
        }
        Context context = this.f149868a;
        if (context == null) {
            return null;
        }
        String strC = zVar.c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strC.startsWith("data:") && strC.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strC.substring(strC.indexOf(44) + 1), 0);
                try {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                    if (bitmapDecodeByteArray != null) {
                        return c(str, q.m(bitmapDecodeByteArray, zVar.f(), zVar.d()));
                    }
                    g.c("Decoded image `" + str + "` is null.");
                    return null;
                } catch (IllegalArgumentException e10) {
                    g.d("Unable to decode image `" + str + "`.", e10);
                    return null;
                }
            } catch (IllegalArgumentException e11) {
                g.d("data URL did not have correct base64 format.", e11);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f149869b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f149869b + strC), null, options);
                if (bitmapDecodeStream != null) {
                    return c(str, q.m(bitmapDecodeStream, zVar.f(), zVar.d()));
                }
                g.c("Decoded image `" + str + "` is null.");
                return null;
            } catch (IllegalArgumentException e12) {
                g.d("Unable to decode image `" + str + "`.", e12);
                return null;
            }
        } catch (IOException e13) {
            g.d("Unable to open asset.", e13);
            return null;
        }
    }

    public C15565b(Drawable.Callback callback, String str, InterfaceC14203c interfaceC14203c, Map<String, z> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f149869b = str + '/';
        } else {
            this.f149869b = str;
        }
        this.f149870c = map;
        d(interfaceC14203c);
        if (!(callback instanceof View)) {
            this.f149868a = null;
        } else {
            this.f149868a = ((View) callback).getContext().getApplicationContext();
        }
    }
}
