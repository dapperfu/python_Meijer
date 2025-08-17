package q5;

import a5.C5582a;
import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import c5.EnumC6361g;
import com.google.android.gms.common.api.a;
import d5.InterfaceC13485a;
import g5.InterfaceC14199b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import l5.Parameters;
import l5.Tags;
import m5.AbstractC15553c;
import m5.EnumC15558h;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\n\u001a\u00020\t*\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\r\u001a\u00020\f*\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\u0010\u001a\u00020\u000f*\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0017\u001a\u00020\u0015*\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u001a\u001a\u00020\u0001*\u00020\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001c\u001a\u00020\u0012*\u00020\u0015H\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001b\u0010!\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&\u001a\u001b\u0010)\u001a\u00020'*\u00020'2\u0006\u0010(\u001a\u00020\u0005H\u0000¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010-\u001a\u00020,*\u00020+H\u0000¢\u0006\u0004\b-\u0010.\u001a\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b2\u00103\u001a\u001f\u00105\u001a\u00020\u00152\u0006\u00100\u001a\u00020/2\u0006\u00104\u001a\u000201H\u0000¢\u0006\u0004\b5\u00106\" \u0010<\u001a\b\u0012\u0004\u0012\u000208078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u00109\u001a\u0004\b:\u0010;\"\u001a\u0010@\u001a\u0002088\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010=\u001a\u0004\b>\u0010?\"\u001a\u0010D\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010A\u001a\u0004\bB\u0010C\"\u0018\u0010I\u001a\u00020F*\u00020E8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H\"\u0018\u0010M\u001a\u00020\u0005*\u00020J8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bK\u0010L\"\u0018\u0010Q\u001a\u00020\u0015*\u00020N8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bO\u0010P\"\u0018\u0010S\u001a\u00020\u0015*\u00020N8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010P\"\u0018\u0010V\u001a\u00020\u0012*\u00020N8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U\"\u0018\u0010 \u001a\u00020\u001f*\u00020W8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010Y\"\u001a\u0010\\\u001a\u0004\u0018\u00010\u0005*\u00020#8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[\"\u0018\u0010`\u001a\u00020\u0015*\u00020]8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_\"\u0018\u0010d\u001a\u00020a*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c\"\u0018\u0010h\u001a\u00020\u0012*\u00020e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bf\u0010g\"\u0018\u0010l\u001a\u00020i*\u00020e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006m"}, d2 = {"Ljava/io/Closeable;", "", "d", "(Ljava/io/Closeable;)V", "Landroid/webkit/MimeTypeMap;", "", "url", "k", "(Landroid/webkit/MimeTypeMap;Ljava/lang/String;)Ljava/lang/String;", "Lokhttp3/Headers;", "y", "(Lokhttp3/Headers;)Lokhttp3/Headers;", "Ll5/q;", "x", "(Ll5/q;)Ll5/q;", "Ll5/m;", "w", "(Ll5/m;)Ll5/m;", "", "s", "()Z", "", "defaultValue", "A", "(Ljava/lang/String;I)I", "Ld5/a$b;", "a", "(Ld5/a$b;)V", "t", "(I)Z", "Lm5/c;", "Lm5/h;", "scale", "B", "(Lm5/c;Lm5/h;)I", "Landroid/net/Uri;", "uri", "r", "(Landroid/net/Uri;)Z", "Lokhttp3/Headers$a;", "line", "b", "(Lokhttp3/Headers$a;Ljava/lang/String;)Lokhttp3/Headers$a;", "Lokhttp3/Response;", "Lokhttp3/ResponseBody;", "z", "(Lokhttp3/Response;)Lokhttp3/ResponseBody;", "Landroid/content/Context;", "context", "", "e", "(Landroid/content/Context;)D", "percent", "c", "(Landroid/content/Context;D)I", "", "Landroid/graphics/Bitmap$Config;", "[Landroid/graphics/Bitmap$Config;", "p", "()[Landroid/graphics/Bitmap$Config;", "VALID_TRANSFORMATION_CONFIGS", "Landroid/graphics/Bitmap$Config;", "f", "()Landroid/graphics/Bitmap$Config;", "DEFAULT_BITMAP_CONFIG", "Lokhttp3/Headers;", "getEMPTY_HEADERS", "()Lokhttp3/Headers;", "EMPTY_HEADERS", "Landroid/view/View;", "Ll5/t;", "m", "(Landroid/view/View;)Ll5/t;", "requestManager", "Lc5/g;", "g", "(Lc5/g;)Ljava/lang/String;", "emoji", "Landroid/graphics/drawable/Drawable;", "q", "(Landroid/graphics/drawable/Drawable;)I", "width", "j", "height", "v", "(Landroid/graphics/drawable/Drawable;)Z", "isVector", "Landroid/widget/ImageView;", "o", "(Landroid/widget/ImageView;)Lm5/h;", "i", "(Landroid/net/Uri;)Ljava/lang/String;", "firstPathSegment", "Landroid/content/res/Configuration;", "l", "(Landroid/content/res/Configuration;)I", "nightMode", "Ljava/io/File;", "n", "(Landroid/content/Context;)Ljava/io/File;", "safeCacheDir", "Lg5/b$a;", "u", "(Lg5/b$a;)Z", "isPlaceholderCached", "LZ4/c;", "h", "(Lg5/b$a;)LZ4/c;", "eventListener", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: q5.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16458j {

    /* renamed from: a, reason: collision with root package name */
    private static final Bitmap.Config[] f156786a;

    /* renamed from: b, reason: collision with root package name */
    private static final Bitmap.Config f156787b;

    /* renamed from: c, reason: collision with root package name */
    private static final Headers f156788c;

    public static final Headers.a b(Headers.a aVar, String str) {
        int iO0 = StringsKt.o0(str, ':', 0, false, 6, null);
        if (iO0 == -1) {
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }
        String strSubstring = str.substring(0, iO0);
        Intrinsics.i(strSubstring, "substring(...)");
        String string = StringsKt.y1(strSubstring).toString();
        String strSubstring2 = str.substring(iO0 + 1);
        Intrinsics.i(strSubstring2, "substring(...)");
        aVar.e(string, strSubstring2);
        return aVar;
    }

    public static final String k(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || StringsKt.r0(str)) {
            return null;
        }
        return mimeTypeMap.getMimeTypeFromExtension(StringsKt.l1(StringsKt.n1(StringsKt.v1(StringsKt.v1(str, '#', null, 2, null), '?', null, 2, null), '/', null, 2, null), '.', ""));
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: q5.j$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[EnumC6361g.values().length];
            try {
                iArr[EnumC6361g.f61478a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6361g.f61479b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6361g.f61480c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6361g.f61481d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            try {
                iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[EnumC15558h.values().length];
            try {
                iArr3[EnumC15558h.f149847a.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EnumC15558h.f149848b.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f156786a = i10 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f156787b = i10 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        f156788c = new Headers.a().f();
    }

    public static final int B(AbstractC15553c abstractC15553c, EnumC15558h enumC15558h) {
        if (abstractC15553c instanceof AbstractC15553c.a) {
            return ((AbstractC15553c.a) abstractC15553c).px;
        }
        int i10 = a.$EnumSwitchMapping$2[enumC15558h.ordinal()];
        if (i10 == 1) {
            return Integer.MIN_VALUE;
        }
        if (i10 == 2) {
            return a.e.API_PRIORITY_OTHER;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int c(Context context, double d10) {
        int largeMemoryClass;
        try {
            Object objJ = Z1.b.j(context, ActivityManager.class);
            Intrinsics.g(objJ);
            ActivityManager activityManager = (ActivityManager) objJ;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = 256;
        }
        double d11 = 1024;
        return (int) (d10 * largeMemoryClass * d11 * d11);
    }

    public static final Bitmap.Config f() {
        return f156787b;
    }

    public static final String g(EnumC6361g enumC6361g) {
        int i10 = a.$EnumSwitchMapping$0[enumC6361g.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return "🧠";
        }
        if (i10 == 3) {
            return "💾";
        }
        if (i10 == 4) {
            return "☁️ ";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Z4.c h(InterfaceC14199b.a aVar) {
        return aVar instanceof g5.c ? ((g5.c) aVar).getEventListener() : Z4.c.f42297b;
    }

    public static final int j(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final int l(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    public static final l5.t m(View view) {
        l5.t tVar;
        Object tag = view.getTag(C5582a.f44336a);
        l5.t tVar2 = tag instanceof l5.t ? (l5.t) tag : null;
        if (tVar2 != null) {
            return tVar2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(C5582a.f44336a);
                tVar = tag2 instanceof l5.t ? (l5.t) tag2 : null;
                if (tVar == null) {
                    tVar = new l5.t(view);
                    view.addOnAttachStateChangeListener(tVar);
                    view.setTag(C5582a.f44336a, tVar);
                }
            } finally {
            }
        }
        return tVar;
    }

    public static final Bitmap.Config[] p() {
        return f156786a;
    }

    public static final int q(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean t(int i10) {
        return i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE;
    }

    public static final boolean u(InterfaceC14199b.a aVar) {
        return (aVar instanceof g5.c) && ((g5.c) aVar).getIsPlaceholderCached();
    }

    public static final boolean v(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof androidx.vectordrawable.graphics.drawable.f);
    }

    public static final Parameters w(Parameters parameters) {
        return parameters == null ? Parameters.f148651c : parameters;
    }

    public static final Tags x(Tags tags) {
        return tags == null ? Tags.f148667c : tags;
    }

    public static final Headers y(Headers headers) {
        return headers == null ? f156788c : headers;
    }

    public static final int A(String str, int i10) {
        Long lX = StringsKt.x(str);
        if (lX != null) {
            long jLongValue = lX.longValue();
            if (jLongValue > 2147483647L) {
                return a.e.API_PRIORITY_OTHER;
            }
            if (jLongValue < 0) {
                return 0;
            }
            return (int) jLongValue;
        }
        return i10;
    }

    public static final void a(InterfaceC13485a.b bVar) {
        try {
            bVar.abort();
        } catch (Exception unused) {
        }
    }

    public static final void d(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String i(Uri uri) {
        return (String) CollectionsKt.u0(uri.getPathSegments());
    }

    public static final File n(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            cacheDir.mkdirs();
            return cacheDir;
        }
        throw new IllegalStateException("cacheDir == null");
    }

    public static final EnumC15558h o(ImageView imageView) {
        int i10;
        ImageView.ScaleType scaleType = imageView.getScaleType();
        if (scaleType == null) {
            i10 = -1;
        } else {
            i10 = a.$EnumSwitchMapping$1[scaleType.ordinal()];
        }
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            return EnumC15558h.f149847a;
        }
        return EnumC15558h.f149848b;
    }

    public static final boolean r(Uri uri) {
        if (Intrinsics.e(uri.getScheme(), "file") && Intrinsics.e(i(uri), "android_asset")) {
            return true;
        }
        return false;
    }

    public static final boolean s() {
        return Intrinsics.e(Looper.myLooper(), Looper.getMainLooper());
    }

    public static final ResponseBody z(Response response) {
        ResponseBody body = response.getBody();
        if (body != null) {
            return body;
        }
        throw new IllegalStateException("response body == null");
    }

    public static final double e(Context context) {
        try {
            Object objJ = Z1.b.j(context, ActivityManager.class);
            Intrinsics.g(objJ);
            if (!((ActivityManager) objJ).isLowRamDevice()) {
                return 0.2d;
            }
            return 0.15d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }
}
