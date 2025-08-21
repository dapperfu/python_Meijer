package d7;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import d7.o;
import java.io.InputStream;

/* renamed from: d7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13634a<Data> implements o<Uri, Data> {

    /* renamed from: c, reason: collision with root package name */
    private static final int f128183c = 22;

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f128184a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2015a<Data> f128185b;

    /* renamed from: d7.a$a, reason: collision with other inner class name */
    public interface InterfaceC2015a<Data> {
        com.bumptech.glide.load.data.d<Data> a(AssetManager assetManager, String str);
    }

    /* renamed from: d7.a$b */
    public static class b implements p<Uri, AssetFileDescriptor>, InterfaceC2015a<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f128186a;

        @Override // d7.C13634a.InterfaceC2015a
        public com.bumptech.glide.load.data.d<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.h(assetManager, str);
        }

        @Override // d7.p
        public o<Uri, AssetFileDescriptor> d(s sVar) {
            return new C13634a(this.f128186a, this);
        }

        public b(AssetManager assetManager) {
            this.f128186a = assetManager;
        }
    }

    /* renamed from: d7.a$c */
    public static class c implements p<Uri, InputStream>, InterfaceC2015a<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        private final AssetManager f128187a;

        @Override // d7.C13634a.InterfaceC2015a
        public com.bumptech.glide.load.data.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.data.m(assetManager, str);
        }

        @Override // d7.p
        public o<Uri, InputStream> d(s sVar) {
            return new C13634a(this.f128187a, this);
        }

        public c(AssetManager assetManager) {
            this.f128187a = assetManager;
        }
    }

    @Override // d7.o
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    public C13634a(AssetManager assetManager, InterfaceC2015a<Data> interfaceC2015a) {
        this.f128184a = assetManager;
        this.f128185b = interfaceC2015a;
    }

    @Override // d7.o
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public o.a<Data> b(Uri uri, int i10, int i11, X6.g gVar) {
        return new o.a<>(new q7.d(uri), this.f128185b.a(this.f128184a, uri.toString().substring(f128183c)));
    }
}
