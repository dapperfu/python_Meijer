package b7;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import b7.o;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes4.dex */
public final class l implements o<Uri, File> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f59997a;

    public static final class a implements p<Uri, File> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f59998a;

        @Override // b7.p
        public o<Uri, File> d(s sVar) {
            return new l(this.f59998a);
        }

        public a(Context context) {
            this.f59998a = context;
        }
    }

    private static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: c, reason: collision with root package name */
        private static final String[] f59999c = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final Context f60000a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f60001b;

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.data.d
        public V6.a d() {
            return V6.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super File> aVar) {
            Cursor cursorQuery = this.f60000a.getContentResolver().query(this.f60001b, f59999c, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.f(new File(string));
                return;
            }
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f60001b));
        }

        b(Context context, Uri uri) {
            this.f60000a = context;
            this.f60001b = uri;
        }
    }

    @Override // b7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<File> b(Uri uri, int i10, int i11, V6.g gVar) {
        return new o.a<>(new o7.d(uri), new b(this.f59997a, uri));
    }

    public l(Context context) {
        this.f59997a = context;
    }

    @Override // b7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return W6.b.c(uri);
    }
}
