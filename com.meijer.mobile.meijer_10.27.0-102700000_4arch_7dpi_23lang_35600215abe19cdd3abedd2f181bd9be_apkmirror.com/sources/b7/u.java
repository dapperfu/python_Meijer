package b7;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import b7.o;
import com.fullstory.FS;
import java.io.InputStream;
import java.util.List;

/* loaded from: classes4.dex */
public final class u<DataT> implements o<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f60038a;

    /* renamed from: b, reason: collision with root package name */
    private final o<Integer, DataT> f60039b;

    private static final class a implements p<Uri, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f60040a;

        @Override // b7.p
        public o<Uri, AssetFileDescriptor> d(s sVar) {
            return new u(this.f60040a, sVar.d(Integer.class, AssetFileDescriptor.class));
        }

        a(Context context) {
            this.f60040a = context;
        }
    }

    private static final class b implements p<Uri, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f60041a;

        @Override // b7.p
        public o<Uri, InputStream> d(s sVar) {
            return new u(this.f60041a, sVar.d(Integer.class, InputStream.class));
        }

        b(Context context) {
            this.f60041a = context;
        }
    }

    public static p<Uri, AssetFileDescriptor> e(Context context) {
        return new a(context);
    }

    public static p<Uri, InputStream> f(Context context) {
        return new b(context);
    }

    private o.a<DataT> g(Uri uri, int i10, int i11, V6.g gVar) throws NumberFormatException {
        try {
            int i12 = Integer.parseInt(uri.getPathSegments().get(0));
            if (i12 != 0) {
                return this.f60039b.b(Integer.valueOf(i12), i10, i11, gVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                FS.log_w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
            }
            return null;
        } catch (NumberFormatException e10) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                FS.log_w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e10);
            }
            return null;
        }
    }

    @Override // b7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.f60038a.getPackageName().equals(uri.getAuthority());
    }

    u(Context context, o<Integer, DataT> oVar) {
        this.f60038a = context.getApplicationContext();
        this.f60039b = oVar;
    }

    private o.a<DataT> h(Uri uri, int i10, int i11, V6.g gVar) {
        List<String> pathSegments = uri.getPathSegments();
        int identifier = this.f60038a.getResources().getIdentifier(pathSegments.get(1), pathSegments.get(0), this.f60038a.getPackageName());
        if (identifier == 0) {
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                FS.log_w("ResourceUriLoader", "Failed to find resource id for: " + uri);
                return null;
            }
            return null;
        }
        return this.f60039b.b(Integer.valueOf(identifier), i10, i11, gVar);
    }

    @Override // b7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> b(Uri uri, int i10, int i11, V6.g gVar) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return g(uri, i10, i11, gVar);
        }
        if (pathSegments.size() == 2) {
            return h(uri, i10, i11, gVar);
        }
        if (Log.isLoggable("ResourceUriLoader", 5)) {
            FS.log_w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
            return null;
        }
        return null;
    }
}
