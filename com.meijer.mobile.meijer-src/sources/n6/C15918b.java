package n6;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import h6.InterfaceC14472c;
import h6.z;
import java.io.IOException;
import java.util.Map;
import v6.g;
import v6.q;

/* renamed from: n6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15918b {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f152079d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f152080a;

    /* renamed from: b, reason: collision with root package name */
    private final String f152081b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, z> f152082c;

    public boolean b(Context context) {
        if (context == null) {
            return this.f152080a == null;
        }
        if (this.f152080a instanceof Application) {
            context = context.getApplicationContext();
        }
        return context == this.f152080a;
    }

    public void d(InterfaceC14472c interfaceC14472c) {
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (f152079d) {
            this.f152082c.get(str).g(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        z zVar = this.f152082c.get(str);
        if (zVar == null) {
            return null;
        }
        Bitmap bitmapB = zVar.b();
        if (bitmapB != null) {
            return bitmapB;
        }
        Context context = this.f152080a;
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
            if (TextUtils.isEmpty(this.f152081b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.f152081b + strC), null, options);
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

    public C15918b(Drawable.Callback callback, String str, InterfaceC14472c interfaceC14472c, Map<String, z> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f152081b = str + '/';
        } else {
            this.f152081b = str;
        }
        this.f152082c = map;
        d(interfaceC14472c);
        if (!(callback instanceof View)) {
            this.f152080a = null;
        } else {
            this.f152080a = ((View) callback).getContext().getApplicationContext();
        }
    }
}
