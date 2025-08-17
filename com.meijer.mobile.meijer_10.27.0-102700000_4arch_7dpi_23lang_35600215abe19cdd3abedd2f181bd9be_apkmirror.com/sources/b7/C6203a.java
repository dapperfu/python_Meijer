package b7;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import b7.o;
import java.io.InputStream;

/* renamed from: b7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6203a<Data> implements o<Uri, Data> {

    /* renamed from: c, reason: collision with root package name */
    private static final int f59948c = 22;

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f59949a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1182a<Data> f59950b;

    /* renamed from: b7.a$a, reason: collision with other inner class name */
    public interface InterfaceC1182a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    /* renamed from: b7.a$b */
    public static class b implements p<Uri, AssetFileDescriptor>, InterfaceC1182a<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f59951a;

        @Override // b7.C6203a.InterfaceC1182a
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // b7.p
        public o<Uri, AssetFileDescriptor> d(s sVar) {
            return new C6203a(this.f59951a, this);
        }

        public b(AssetManager assetManager) {
            this.f59951a = assetManager;
        }
    }

    /* renamed from: b7.a$c */
    public static class c implements p<Uri, InputStream>, InterfaceC1182a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f59952a;

        @Override // b7.C6203a.InterfaceC1182a
        public com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // b7.p
        public o<Uri, InputStream> d(s sVar) {
            return new C6203a(this.f59952a, this);
        }

        public c(AssetManager assetManager) {
            this.f59952a = assetManager;
        }
    }

    @Override // b7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    public C6203a(AssetManager assetManager, InterfaceC1182a<Data> interfaceC1182a) {
        this.f59949a = assetManager;
        this.f59950b = interfaceC1182a;
    }

    @Override // b7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(Uri uri, int i10, int i11, V6.g gVar) {
        return new o.a<>(new o7.d(uri), this.f59950b.a(this.f59949a, uri.toString().substring(f59948c)));
    }
}
