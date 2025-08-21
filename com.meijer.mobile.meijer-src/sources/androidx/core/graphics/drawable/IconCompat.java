package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.fullstory.FS;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import o2.i;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f54106k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f54107a;

    /* renamed from: b, reason: collision with root package name */
    Object f54108b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f54109c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f54110d;

    /* renamed from: e, reason: collision with root package name */
    public int f54111e;

    /* renamed from: f, reason: collision with root package name */
    public int f54112f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f54113g;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f54114h;

    /* renamed from: i, reason: collision with root package name */
    public String f54115i;

    /* renamed from: j, reason: collision with root package name */
    public String f54116j;

    static class a {
        static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                FS.log_e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                FS.log_e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                FS.log_e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                FS.log_e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                FS.log_e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                FS.log_e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        static int d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e10) {
                FS.log_e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                FS.log_e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                FS.log_e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        static Uri e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e10) {
                FS.log_e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                FS.log_e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                FS.log_e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        static Icon f(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f54107a) {
                case -1:
                    return (Icon) iconCompat.f54108b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f54108b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.m(), iconCompat.f54111e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f54108b, iconCompat.f54111e, iconCompat.f54112f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f54108b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.b((Bitmap) iconCompat.f54108b, false));
                        break;
                    } else {
                        iconCreateWithBitmap = b.a((Bitmap) iconCompat.f54108b);
                        break;
                    }
                case 6:
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.o());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.o());
                        }
                        InputStream inputStreamP = iconCompat.p(context);
                        if (inputStreamP == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.o());
                        }
                        if (i10 < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.b(BitmapFactory.decodeStream(inputStreamP), false));
                            break;
                        } else {
                            iconCreateWithBitmap = b.a(BitmapFactory.decodeStream(inputStreamP));
                            break;
                        }
                    }
            }
            ColorStateList colorStateList = iconCompat.f54113g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f54114h;
            if (mode != IconCompat.f54106k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }

        static IconCompat a(Object obj) {
            i.g(obj);
            int iD = d(obj);
            if (iD != 2) {
                if (iD != 4) {
                    if (iD != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.f54108b = obj;
                        return iconCompat;
                    }
                    return IconCompat.d(e(obj));
                }
                return IconCompat.g(e(obj));
            }
            return IconCompat.j(null, c(obj), b(obj));
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public IconCompat() {
        this.f54107a = -1;
        this.f54109c = null;
        this.f54110d = null;
        this.f54111e = 0;
        this.f54112f = 0;
        this.f54113g = null;
        this.f54114h = f54106k;
        this.f54115i = null;
    }

    @Deprecated
    public Icon t() {
        return u(null);
    }

    static class b {
        static Icon a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public Bitmap k() {
        int i10 = this.f54107a;
        if (i10 == -1) {
            Object obj = this.f54108b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f54108b;
        }
        if (i10 == 5) {
            return b((Bitmap) this.f54108b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int l() {
        int i10 = this.f54107a;
        if (i10 == -1) {
            return a.b(this.f54108b);
        }
        if (i10 == 2) {
            return this.f54111e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String m() {
        int i10 = this.f54107a;
        if (i10 == -1) {
            return a.c(this.f54108b);
        }
        if (i10 == 2) {
            String str = this.f54116j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f54108b).split(":", -1)[0] : this.f54116j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int n() {
        int i10 = this.f54107a;
        return i10 == -1 ? a.d(this.f54108b) : i10;
    }

    public Uri o() {
        int i10 = this.f54107a;
        if (i10 == -1) {
            return a.e(this.f54108b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f54108b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public void q() {
        this.f54114h = PorterDuff.Mode.valueOf(this.f54115i);
        switch (this.f54107a) {
            case -1:
                Parcelable parcelable = this.f54110d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f54108b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f54110d;
                if (parcelable2 != null) {
                    this.f54108b = parcelable2;
                    return;
                }
                byte[] bArr = this.f54109c;
                this.f54108b = bArr;
                this.f54107a = 3;
                this.f54111e = 0;
                this.f54112f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f54109c, Charset.forName("UTF-16"));
                this.f54108b = str;
                if (this.f54107a == 2 && this.f54116j == null) {
                    this.f54116j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f54108b = this.f54109c;
                return;
        }
    }

    public void r(boolean z10) {
        this.f54115i = this.f54114h.name();
        switch (this.f54107a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f54110d = (Parcelable) this.f54108b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z10) {
                    this.f54110d = (Parcelable) this.f54108b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f54108b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f54109c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f54109c = ((String) this.f54108b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f54109c = (byte[]) this.f54108b;
                return;
            case 4:
            case 6:
                this.f54109c = this.f54108b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public Bundle s() {
        Bundle bundle = new Bundle();
        switch (this.f54107a) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f54108b);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f54108b);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f54108b);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f54108b);
                break;
        }
        bundle.putInt("type", this.f54107a);
        bundle.putInt("int1", this.f54111e);
        bundle.putInt("int2", this.f54112f);
        bundle.putString("string1", this.f54116j);
        ColorStateList colorStateList = this.f54113g;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f54114h;
        if (mode != f54106k) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public String toString() {
        if (this.f54107a == -1) {
            return String.valueOf(this.f54108b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(v(this.f54107a));
        switch (this.f54107a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f54108b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f54108b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f54116j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(l())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f54111e);
                if (this.f54112f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f54112f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f54108b);
                break;
        }
        if (this.f54113g != null) {
            sb2.append(" tint=");
            sb2.append(this.f54113g);
        }
        if (this.f54114h != f54106k) {
            sb2.append(" mode=");
            sb2.append(this.f54114h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public static IconCompat a(Icon icon) {
        return a.a(icon);
    }

    static Bitmap b(Bitmap bitmap, boolean z10) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat c(Bitmap bitmap) {
        o2.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f54108b = bitmap;
        return iconCompat;
    }

    public static IconCompat d(Uri uri) {
        o2.c.c(uri);
        return e(uri.toString());
    }

    public static IconCompat e(String str) {
        o2.c.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f54108b = str;
        return iconCompat;
    }

    public static IconCompat f(Bitmap bitmap) {
        o2.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f54108b = bitmap;
        return iconCompat;
    }

    public static IconCompat g(Uri uri) {
        o2.c.c(uri);
        return h(uri.toString());
    }

    public static IconCompat h(String str) {
        o2.c.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f54108b = str;
        return iconCompat;
    }

    public static IconCompat i(Context context, int i10) {
        o2.c.c(context);
        return j(context.getResources(), context.getPackageName(), i10);
    }

    public static IconCompat j(Resources resources, String str, int i10) {
        o2.c.c(str);
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f54111e = i10;
            if (resources != null) {
                try {
                    iconCompat.f54108b = resources.getResourceName(i10);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f54108b = str;
            }
            iconCompat.f54116j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    private static String v(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public InputStream p(Context context) {
        Uri uriO = o();
        String scheme = uriO.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.f54108b));
            } catch (FileNotFoundException e10) {
                FS.log_w("IconCompat", "Unable to load image from path: " + uriO, e10);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(uriO);
        } catch (Exception e11) {
            FS.log_w("IconCompat", "Unable to load image from URI: " + uriO, e11);
            return null;
        }
    }

    public Icon u(Context context) {
        return a.f(this, context);
    }

    IconCompat(int i10) {
        this.f54109c = null;
        this.f54110d = null;
        this.f54111e = 0;
        this.f54112f = 0;
        this.f54113g = null;
        this.f54114h = f54106k;
        this.f54115i = null;
        this.f54107a = i10;
    }
}
