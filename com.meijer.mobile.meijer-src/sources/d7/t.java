package d7;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import com.fullstory.FS;
import d7.o;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class t<Data> implements o<Integer, Data> {

    /* renamed from: a, reason: collision with root package name */
    private final o<Uri, Data> f128268a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f128269b;

    public static final class a implements p<Integer, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f128270a;

        @Override // d7.p
        public o<Integer, AssetFileDescriptor> d(s sVar) {
            return new t(this.f128270a, sVar.d(Uri.class, AssetFileDescriptor.class));
        }

        public a(Resources resources) {
            this.f128270a = resources;
        }
    }

    public static class b implements p<Integer, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f128271a;

        @Override // d7.p
        public o<Integer, InputStream> d(s sVar) {
            return new t(this.f128271a, sVar.d(Uri.class, InputStream.class));
        }

        public b(Resources resources) {
            this.f128271a = resources;
        }
    }

    public static class c implements p<Integer, Uri> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources f128272a;

        @Override // d7.p
        public o<Integer, Uri> d(s sVar) {
            return new t(this.f128272a, x.c());
        }

        public c(Resources resources) {
            this.f128272a = resources;
        }
    }

    @Override // d7.o
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f128269b.getResourcePackageName(num.intValue()) + '/' + this.f128269b.getResourceTypeName(num.intValue()) + '/' + this.f128269b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            FS.log_w("ResourceLoader", "Received invalid resource id: " + num, e10);
            return null;
        }
    }

    public t(Resources resources, o<Uri, Data> oVar) {
        this.f128269b = resources;
        this.f128268a = oVar;
    }

    @Override // d7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(Integer num, int i10, int i11, X6.g gVar) {
        Uri uriD = d(num);
        if (uriD == null) {
            return null;
        }
        return this.f128268a.b(uriD, i10, i11, gVar);
    }
}
