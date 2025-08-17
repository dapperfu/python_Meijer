package f7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes4.dex */
public class l implements V6.i<Uri, Drawable> {

    /* renamed from: b, reason: collision with root package name */
    public static final V6.f<Resources.Theme> f130827b = V6.f.e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");

    /* renamed from: a, reason: collision with root package name */
    private final Context f130828a;

    private Context d(Uri uri, String str) {
        if (str.equals(this.f130828a.getPackageName())) {
            return this.f130828a;
        }
        try {
            return this.f130828a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f130828a.getPackageName())) {
                return this.f130828a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    public l(Context context) {
        this.f130828a = context.getApplicationContext();
    }

    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // V6.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public X6.c<Drawable> b(Uri uri, int i10, int i11, V6.g gVar) {
        Resources.Theme theme;
        Drawable drawableA;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context contextD = d(uri, authority);
            int iG = g(contextD, uri);
            if (((String) p7.k.d(authority)).equals(this.f130828a.getPackageName())) {
                theme = (Resources.Theme) gVar.a(f130827b);
            } else {
                theme = null;
            }
            if (theme == null) {
                drawableA = i.b(this.f130828a, contextD, iG);
            } else {
                drawableA = i.a(this.f130828a, iG, theme);
            }
            return k.e(drawableA);
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @Override // V6.i
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri, V6.g gVar) {
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equals("android.resource")) {
            return true;
        }
        return false;
    }
}
