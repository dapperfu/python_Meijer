package b7;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import b7.o;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class w<Data> implements o<String, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final o<Uri, Data> f60043a;

    public static final class a implements p<String, AssetFileDescriptor> {
        @Override // b7.p
        public o<String, AssetFileDescriptor> d(s sVar) {
            return new w(sVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements p<String, ParcelFileDescriptor> {
        @Override // b7.p
        public o<String, ParcelFileDescriptor> d(s sVar) {
            return new w(sVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements p<String, InputStream> {
        @Override // b7.p
        public o<String, InputStream> d(s sVar) {
            return new w(sVar.d(Uri.class, InputStream.class));
        }
    }

    @Override // b7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(String str) {
        return true;
    }

    private static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    public w(o<Uri, Data> oVar) {
        this.f60043a = oVar;
    }

    private static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri uri = Uri.parse(str);
        if (uri.getScheme() == null) {
            return f(str);
        }
        return uri;
    }

    @Override // b7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(String str, int i10, int i11, V6.g gVar) {
        Uri uriE = e(str);
        if (uriE != null && this.f60043a.a(uriE)) {
            return this.f60043a.b(uriE, i10, i11, gVar);
        }
        return null;
    }
}
