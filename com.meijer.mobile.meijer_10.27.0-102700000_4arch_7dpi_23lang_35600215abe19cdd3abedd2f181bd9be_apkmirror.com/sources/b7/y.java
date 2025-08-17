package b7;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import b7.o;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class y<Data> implements o<Uri, Data> {

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f60047b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    private final c<Data> f60048a;

    public static final class a implements p<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f60049a;

        @Override // b7.y.c
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.a(this.f60049a, uri);
        }

        @Override // b7.p
        public o<Uri, AssetFileDescriptor> d(s sVar) {
            return new y(this);
        }

        public a(ContentResolver contentResolver) {
            this.f60049a = contentResolver;
        }
    }

    public static class b implements p<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f60050a;

        @Override // b7.y.c
        public com.bumptech.glide.load.data.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.data.i(this.f60050a, uri);
        }

        @Override // b7.p
        public o<Uri, ParcelFileDescriptor> d(s sVar) {
            return new y(this);
        }

        public b(ContentResolver contentResolver) {
            this.f60050a = contentResolver;
        }
    }

    public interface c<Data> {
        com.bumptech.glide.load.data.d<Data> a(Uri uri);
    }

    public static class d implements p<Uri, InputStream>, c<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f60051a;

        @Override // b7.y.c
        public com.bumptech.glide.load.data.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.data.n(this.f60051a, uri);
        }

        @Override // b7.p
        public o<Uri, InputStream> d(s sVar) {
            return new y(this);
        }

        public d(ContentResolver contentResolver) {
            this.f60051a = contentResolver;
        }
    }

    @Override // b7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(Uri uri, int i10, int i11, V6.g gVar) {
        return new o.a<>(new o7.d(uri), this.f60048a.a(uri));
    }

    @Override // b7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return f60047b.contains(uri.getScheme());
    }

    public y(c<Data> cVar) {
        this.f60048a = cVar;
    }
}
