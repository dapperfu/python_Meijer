package d7;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import d7.o;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes4.dex */
public final class l implements o<Uri, File> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f128232a;

    public static final class a implements p<Uri, File> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f128233a;

        @Override // d7.p
        public o<Uri, File> d(s sVar) {
            return new l(this.f128233a);
        }

        public a(Context context) {
            this.f128233a = context;
        }
    }

    private static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: c, reason: collision with root package name */
        private static final String[] f128234c = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final Context f128235a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f128236b;

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
        public X6.a d() {
            return X6.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super File> aVar) {
            Cursor cursorQuery = this.f128235a.getContentResolver().query(this.f128236b, f128234c, null, null, null);
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
            aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f128236b));
        }

        b(Context context, Uri uri) {
            this.f128235a = context;
            this.f128236b = uri;
        }
    }

    @Override // d7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<File> b(Uri uri, int i10, int i11, X6.g gVar) {
        return new o.a<>(new q7.d(uri), new b(this.f128232a, uri));
    }

    public l(Context context) {
        this.f128232a = context;
    }

    @Override // d7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return Y6.b.c(uri);
    }
}
