package Y6;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import com.fullstory.FS;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class c implements com.bumptech.glide.load.data.d<InputStream> {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f42961a;

    /* renamed from: b, reason: collision with root package name */
    private final e f42962b;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f42963c;

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    static class a implements d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f42964b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f42965a;

        a(ContentResolver contentResolver) {
            this.f42965a = contentResolver;
        }

        @Override // Y6.d
        public Cursor a(Uri uri) {
            return this.f42965a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f42964b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    static class b implements d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f42966b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f42967a;

        b(ContentResolver contentResolver) {
            this.f42967a = contentResolver;
        }

        @Override // Y6.d
        public Cursor a(Uri uri) {
            return this.f42967a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f42966b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws Throwable {
        InputStream inputStreamD = this.f42962b.d(this.f42961a);
        int iA = inputStreamD != null ? this.f42962b.a(this.f42961a) : -1;
        return iA != -1 ? new g(inputStreamD, iA) : inputStreamD;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() throws IOException {
        InputStream inputStream = this.f42963c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public X6.a d() {
        return X6.a.LOCAL;
    }

    c(Uri uri, e eVar) {
        this.f42961a = uri;
        this.f42962b = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.c(context).j().g(), dVar, com.bumptech.glide.b.c(context).e(), context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamH = h();
            this.f42963c = inputStreamH;
            aVar.f(inputStreamH);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                FS.log_d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.c(e10);
        }
    }
}
