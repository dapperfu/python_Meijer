package e7;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import d7.o;
import d7.p;
import d7.s;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class d<DataT> implements o<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f130005a;

    /* renamed from: b, reason: collision with root package name */
    private final o<File, DataT> f130006b;

    /* renamed from: c, reason: collision with root package name */
    private final o<Uri, DataT> f130007c;

    /* renamed from: d, reason: collision with root package name */
    private final Class<DataT> f130008d;

    private static abstract class a<DataT> implements p<Uri, DataT> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f130009a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<DataT> f130010b;

        @Override // d7.p
        public final o<Uri, DataT> d(s sVar) {
            return new d(this.f130009a, sVar.d(File.class, this.f130010b), sVar.d(Uri.class, this.f130010b), this.f130010b);
        }

        a(Context context, Class<DataT> cls) {
            this.f130009a = context;
            this.f130010b = cls;
        }
    }

    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: e7.d$d, reason: collision with other inner class name */
    private static final class C2044d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: k, reason: collision with root package name */
        private static final String[] f130011k = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final Context f130012a;

        /* renamed from: b, reason: collision with root package name */
        private final o<File, DataT> f130013b;

        /* renamed from: c, reason: collision with root package name */
        private final o<Uri, DataT> f130014c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f130015d;

        /* renamed from: e, reason: collision with root package name */
        private final int f130016e;

        /* renamed from: f, reason: collision with root package name */
        private final int f130017f;

        /* renamed from: g, reason: collision with root package name */
        private final X6.g f130018g;

        /* renamed from: h, reason: collision with root package name */
        private final Class<DataT> f130019h;

        /* renamed from: i, reason: collision with root package name */
        private volatile boolean f130020i;

        /* renamed from: j, reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d<DataT> f130021j;

        private File h(Uri uri) throws FileNotFoundException {
            try {
                Cursor cursorQuery = this.f130012a.getContentResolver().query(uri, f130011k, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } finally {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f130020i = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f130021j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        private boolean g() {
            return this.f130012a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<DataT> a() {
            return this.f130019h;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f130021j;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public X6.a d() {
            return X6.a.LOCAL;
        }

        C2044d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Uri uri, int i10, int i11, X6.g gVar, Class<DataT> cls) {
            this.f130012a = context.getApplicationContext();
            this.f130013b = oVar;
            this.f130014c = oVar2;
            this.f130015d = uri;
            this.f130016e = i10;
            this.f130017f = i11;
            this.f130018g = gVar;
            this.f130019h = cls;
        }

        private o.a<DataT> c() throws FileNotFoundException {
            Uri requireOriginal;
            if (Environment.isExternalStorageLegacy()) {
                return this.f130013b.b(h(this.f130015d), this.f130016e, this.f130017f, this.f130018g);
            }
            if (Y6.b.a(this.f130015d)) {
                return this.f130014c.b(this.f130015d, this.f130016e, this.f130017f, this.f130018g);
            }
            if (g()) {
                requireOriginal = MediaStore.setRequireOriginal(this.f130015d);
            } else {
                requireOriginal = this.f130015d;
            }
            return this.f130014c.b(requireOriginal, this.f130016e, this.f130017f, this.f130018g);
        }

        private com.bumptech.glide.load.data.d<DataT> f() throws FileNotFoundException {
            o.a<DataT> aVarC = c();
            if (aVarC != null) {
                return aVarC.f128245c;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> dVarF = f();
                if (dVarF == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f130015d));
                    return;
                }
                this.f130021j = dVarF;
                if (this.f130020i) {
                    cancel();
                } else {
                    dVarF.e(gVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    @Override // d7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> b(Uri uri, int i10, int i11, X6.g gVar) {
        return new o.a<>(new q7.d(uri), new C2044d(this.f130005a, this.f130006b, this.f130007c, uri, i10, i11, gVar, this.f130008d));
    }

    @Override // d7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && Y6.b.c(uri);
    }

    d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Class<DataT> cls) {
        this.f130005a = context.getApplicationContext();
        this.f130006b = oVar;
        this.f130007c = oVar2;
        this.f130008d = cls;
    }
}
