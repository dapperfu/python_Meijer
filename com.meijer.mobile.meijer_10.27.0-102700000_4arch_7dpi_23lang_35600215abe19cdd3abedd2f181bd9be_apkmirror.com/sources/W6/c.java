package W6;

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
    private final Uri f38562a;

    /* renamed from: b, reason: collision with root package name */
    private final e f38563b;

    /* renamed from: c, reason: collision with root package name */
    private InputStream f38564c;

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    static class a implements d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f38565b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f38566a;

        a(ContentResolver contentResolver) {
            this.f38566a = contentResolver;
        }

        @Override // W6.d
        public Cursor a(Uri uri) {
            return this.f38566a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f38565b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    static class b implements d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f38567b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f38568a;

        b(ContentResolver contentResolver) {
            this.f38568a = contentResolver;
        }

        @Override // W6.d
        public Cursor a(Uri uri) {
            return this.f38568a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f38567b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public static c f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws Throwable {
        InputStream inputStreamD = this.f38563b.d(this.f38562a);
        int iA = inputStreamD != null ? this.f38563b.a(this.f38562a) : -1;
        return iA != -1 ? new g(inputStreamD, iA) : inputStreamD;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() throws IOException {
        InputStream inputStream = this.f38564c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public V6.a d() {
        return V6.a.LOCAL;
    }

    c(Uri uri, e eVar) {
        this.f38562a = uri;
        this.f38563b = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.c(context).j().g(), dVar, com.bumptech.glide.b.c(context).e(), context.getContentResolver()));
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.g gVar, d.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamH = h();
            this.f38564c = inputStreamH;
            aVar.f(inputStreamH);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                FS.log_d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            aVar.c(e10);
        }
    }
}
