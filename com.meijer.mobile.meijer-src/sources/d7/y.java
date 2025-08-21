package d7;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import d7.o;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class y<Data> implements o<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f128282b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    private final c<Data> f128283a;

    public static final class a implements p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f128284a;

        @Override // d7.y.c
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f128284a, uri);
        }

        @Override // d7.p
        public o<Uri, AssetFileDescriptor> d(s sVar) {
            return new y(this);
        }

        public a(ContentResolver contentResolver) {
            this.f128284a = contentResolver;
        }
    }

    public static class b implements p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f128285a;

        @Override // d7.y.c
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f128285a, uri);
        }

        @Override // d7.p
        public o<Uri, ParcelFileDescriptor> d(s sVar) {
            return new y(this);
        }

        public b(ContentResolver contentResolver) {
            this.f128285a = contentResolver;
        }
    }

    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    public static class d implements p<Uri, InputStream>, c<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f128286a;

        @Override // d7.y.c
        public com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f128286a, uri);
        }

        @Override // d7.p
        public o<Uri, InputStream> d(s sVar) {
            return new y(this);
        }

        public d(ContentResolver contentResolver) {
            this.f128286a = contentResolver;
        }
    }

    @Override // d7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(Uri uri, int i10, int i11, X6.g gVar) {
        return new o.a<>(new q7.d(uri), this.f128283a.a(uri));
    }

    @Override // d7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f128282b.contains(uri.getScheme());
    }

    public y(c<Data> cVar) {
        this.f128283a = cVar;
    }
}
