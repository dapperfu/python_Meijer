package c7;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import b7.o;
import b7.p;
import b7.s;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class d<DataT> implements o<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f61623a;

    /* renamed from: b, reason: collision with root package name */
    private final o<File, DataT> f61624b;

    /* renamed from: c, reason: collision with root package name */
    private final o<Uri, DataT> f61625c;

    /* renamed from: d, reason: collision with root package name */
    private final Class<DataT> f61626d;

    private static abstract class a<DataT> implements p<Uri, DataT> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f61627a;

        /* renamed from: b, reason: collision with root package name */
        private final Class<DataT> f61628b;

        @Override // b7.p
        public final o<Uri, DataT> d(s sVar) {
            return new d(this.f61627a, sVar.d(File.class, this.f61628b), sVar.d(Uri.class, this.f61628b), this.f61628b);
        }

        a(Context context, Class<DataT> cls) {
            this.f61627a = context;
            this.f61628b = cls;
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

    /* renamed from: c7.d$d, reason: collision with other inner class name */
    private static final class C1217d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: k, reason: collision with root package name */
        private static final String[] f61629k = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final Context f61630a;

        /* renamed from: b, reason: collision with root package name */
        private final o<File, DataT> f61631b;

        /* renamed from: c, reason: collision with root package name */
        private final o<Uri, DataT> f61632c;

        /* renamed from: d, reason: collision with root package name */
        private final Uri f61633d;

        /* renamed from: e, reason: collision with root package name */
        private final int f61634e;

        /* renamed from: f, reason: collision with root package name */
        private final int f61635f;

        /* renamed from: g, reason: collision with root package name */
        private final V6.g f61636g;

        /* renamed from: h, reason: collision with root package name */
        private final Class<DataT> f61637h;

        /* renamed from: i, reason: collision with root package name */
        private volatile boolean f61638i;

        /* renamed from: j, reason: collision with root package name */
        private volatile com.bumptech.glide.load.data.d<DataT> f61639j;

        private File h(Uri uri) throws FileNotFoundException {
            try {
                Cursor cursorQuery = this.f61630a.getContentResolver().query(uri, f61629k, null, null, null);
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
            this.f61638i = true;
            com.bumptech.glide.load.data.d<DataT> dVar = this.f61639j;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        private boolean g() {
            return this.f61630a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<DataT> a() {
            return this.f61637h;
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            com.bumptech.glide.load.data.d<DataT> dVar = this.f61639j;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public V6.a d() {
            return V6.a.LOCAL;
        }

        C1217d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Uri uri, int i10, int i11, V6.g gVar, Class<DataT> cls) {
            this.f61630a = context.getApplicationContext();
            this.f61631b = oVar;
            this.f61632c = oVar2;
            this.f61633d = uri;
            this.f61634e = i10;
            this.f61635f = i11;
            this.f61636g = gVar;
            this.f61637h = cls;
        }

        private o.a<DataT> c() throws FileNotFoundException {
            Uri requireOriginal;
            if (Environment.isExternalStorageLegacy()) {
                return this.f61631b.b(h(this.f61633d), this.f61634e, this.f61635f, this.f61636g);
            }
            if (W6.b.a(this.f61633d)) {
                return this.f61632c.b(this.f61633d, this.f61634e, this.f61635f, this.f61636g);
            }
            if (g()) {
                requireOriginal = MediaStore.setRequireOriginal(this.f61633d);
            } else {
                requireOriginal = this.f61633d;
            }
            return this.f61632c.b(requireOriginal, this.f61634e, this.f61635f, this.f61636g);
        }

        private com.bumptech.glide.load.data.d<DataT> f() throws FileNotFoundException {
            o.a<DataT> aVarC = c();
            if (aVarC != null) {
                return aVarC.f60010c;
            }
            return null;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.data.d<DataT> dVarF = f();
                if (dVarF == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.f61633d));
                    return;
                }
                this.f61639j = dVarF;
                if (this.f61638i) {
                    cancel();
                } else {
                    dVarF.e(gVar, aVar);
                }
            } catch (FileNotFoundException e10) {
                aVar.c(e10);
            }
        }
    }

    @Override // b7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> b(Uri uri, int i10, int i11, V6.g gVar) {
        return new o.a<>(new o7.d(uri), new C1217d(this.f61623a, this.f61624b, this.f61625c, uri, i10, i11, gVar, this.f61626d));
    }

    @Override // b7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && W6.b.c(uri);
    }

    d(Context context, o<File, DataT> oVar, o<Uri, DataT> oVar2, Class<DataT> cls) {
        this.f61623a = context.getApplicationContext();
        this.f61624b = oVar;
        this.f61625c = oVar2;
        this.f61626d = cls;
    }
}
