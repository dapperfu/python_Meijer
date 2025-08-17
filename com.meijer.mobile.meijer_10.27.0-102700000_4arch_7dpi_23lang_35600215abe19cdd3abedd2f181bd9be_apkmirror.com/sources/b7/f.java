package b7;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import b7.o;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class f<DataT> implements o<Integer, DataT> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f59965a;

    /* renamed from: b, reason: collision with root package name */
    private final e<DataT> f59966b;

    private static final class a implements p<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f59967a;

        @Override // b7.f.e
        public Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // b7.p
        public o<Integer, AssetFileDescriptor> d(s sVar) {
            return new f(this.f59967a, this);
        }

        a(Context context) {
            this.f59967a = context;
        }

        @Override // b7.f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // b7.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }
    }

    private static final class b implements p<Integer, Drawable>, e<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f59968a;

        @Override // b7.f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(Drawable drawable) throws IOException {
        }

        @Override // b7.f.e
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // b7.p
        public o<Integer, Drawable> d(s sVar) {
            return new f(this.f59968a, this);
        }

        @Override // b7.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable c(Resources.Theme theme, Resources resources, int i10) {
            return f7.i.a(this.f59968a, i10, theme);
        }

        b(Context context) {
            this.f59968a = context;
        }
    }

    private static final class c implements p<Integer, InputStream>, e<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f59969a;

        @Override // b7.f.e
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // b7.p
        public o<Integer, InputStream> d(s sVar) {
            return new f(this.f59969a, this);
        }

        c(Context context) {
            this.f59969a = context;
        }

        @Override // b7.f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // b7.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }
    }

    private static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources.Theme f59970a;

        /* renamed from: b, reason: collision with root package name */
        private final Resources f59971b;

        /* renamed from: c, reason: collision with root package name */
        private final e<DataT> f59972c;

        /* renamed from: d, reason: collision with root package name */
        private final int f59973d;

        /* renamed from: e, reason: collision with root package name */
        private DataT f59974e;

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<DataT> a() {
            return this.f59972c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            DataT datat = this.f59974e;
            if (datat != null) {
                try {
                    this.f59972c.b(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public V6.a d() {
            return V6.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super DataT> aVar) {
            try {
                DataT datatC = this.f59972c.c(this.f59970a, this.f59971b, this.f59973d);
                this.f59974e = datatC;
                aVar.f(datatC);
            } catch (Resources.NotFoundException e10) {
                aVar.c(e10);
            }
        }

        d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i10) {
            this.f59970a = theme;
            this.f59971b = resources;
            this.f59972c = eVar;
            this.f59973d = i10;
        }
    }

    private interface e<DataT> {
        Class<DataT> a();

        void b(DataT datat) throws IOException;

        DataT c(Resources.Theme theme, Resources resources, int i10);
    }

    @Override // b7.o
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean a(Integer num) {
        return true;
    }

    public static p<Integer, AssetFileDescriptor> c(Context context) {
        return new a(context);
    }

    public static p<Integer, Drawable> e(Context context) {
        return new b(context);
    }

    public static p<Integer, InputStream> g(Context context) {
        return new c(context);
    }

    @Override // b7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> b(Integer num, int i10, int i11, V6.g gVar) {
        Resources.Theme theme = (Resources.Theme) gVar.a(f7.l.f130827b);
        return new o.a<>(new o7.d(num), new d(theme, theme != null ? theme.getResources() : this.f59965a.getResources(), this.f59966b, num.intValue()));
    }

    f(Context context, e<DataT> eVar) {
        this.f59965a = context.getApplicationContext();
        this.f59966b = eVar;
    }
}
