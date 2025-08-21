package d7;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.data.d;
import d7.o;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class f<DataT> implements o<Integer, DataT> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f128200a;

    /* renamed from: b, reason: collision with root package name */
    private final e<DataT> f128201b;

    private static final class a implements p<Integer, AssetFileDescriptor>, e<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f128202a;

        @Override // d7.f.e
        public Class<AssetFileDescriptor> a() {
            return AssetFileDescriptor.class;
        }

        @Override // d7.p
        public o<Integer, AssetFileDescriptor> d(s sVar) {
            return new f(this.f128202a, this);
        }

        a(Context context) {
            this.f128202a = context;
        }

        @Override // d7.f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(AssetFileDescriptor assetFileDescriptor) throws IOException {
            assetFileDescriptor.close();
        }

        @Override // d7.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public AssetFileDescriptor c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResourceFd(i10);
        }
    }

    private static final class b implements p<Integer, Drawable>, e<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f128203a;

        @Override // d7.f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(Drawable drawable) throws IOException {
        }

        @Override // d7.f.e
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // d7.p
        public o<Integer, Drawable> d(s sVar) {
            return new f(this.f128203a, this);
        }

        @Override // d7.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Drawable c(Resources.Theme theme, Resources resources, int i10) {
            return h7.i.a(this.f128203a, i10, theme);
        }

        b(Context context) {
            this.f128203a = context;
        }
    }

    private static final class c implements p<Integer, InputStream>, e<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final Context f128204a;

        @Override // d7.f.e
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // d7.p
        public o<Integer, InputStream> d(s sVar) {
            return new f(this.f128204a, this);
        }

        c(Context context) {
            this.f128204a = context;
        }

        @Override // d7.f.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(InputStream inputStream) throws IOException {
            inputStream.close();
        }

        @Override // d7.f.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public InputStream c(Resources.Theme theme, Resources resources, int i10) {
            return resources.openRawResource(i10);
        }
    }

    private static final class d<DataT> implements com.bumptech.glide.load.data.d<DataT> {

        /* renamed from: a, reason: collision with root package name */
        private final Resources.Theme f128205a;

        /* renamed from: b, reason: collision with root package name */
        private final Resources f128206b;

        /* renamed from: c, reason: collision with root package name */
        private final e<DataT> f128207c;

        /* renamed from: d, reason: collision with root package name */
        private final int f128208d;

        /* renamed from: e, reason: collision with root package name */
        private DataT f128209e;

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<DataT> a() {
            return this.f128207c.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            DataT datat = this.f128209e;
            if (datat != null) {
                try {
                    this.f128207c.b(datat);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public X6.a d() {
            return X6.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.g gVar, d.a<? super DataT> aVar) {
            try {
                DataT datatC = this.f128207c.c(this.f128205a, this.f128206b, this.f128208d);
                this.f128209e = datatC;
                aVar.f(datatC);
            } catch (Resources.NotFoundException e10) {
                aVar.c(e10);
            }
        }

        d(Resources.Theme theme, Resources resources, e<DataT> eVar, int i10) {
            this.f128205a = theme;
            this.f128206b = resources;
            this.f128207c = eVar;
            this.f128208d = i10;
        }
    }

    private interface e<DataT> {
        Class<DataT> a();

        void b(DataT datat) throws IOException;

        DataT c(Resources.Theme theme, Resources resources, int i10);
    }

    @Override // d7.o
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

    @Override // d7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public o.a<DataT> b(Integer num, int i10, int i11, X6.g gVar) {
        Resources.Theme theme = (Resources.Theme) gVar.a(h7.l.f135173b);
        return new o.a<>(new q7.d(num), new d(theme, theme != null ? theme.getResources() : this.f128200a.getResources(), this.f128201b, num.intValue()));
    }

    f(Context context, e<DataT> eVar) {
        this.f128200a = context.getApplicationContext();
        this.f128201b = eVar;
    }
}
