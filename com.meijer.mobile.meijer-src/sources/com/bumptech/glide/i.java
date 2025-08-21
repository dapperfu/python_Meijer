package com.bumptech.glide;

import a7.InterfaceC5665b;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.c;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.resource.bitmap.B;
import com.bumptech.glide.load.resource.bitmap.C6633a;
import com.bumptech.glide.load.resource.bitmap.C6634b;
import com.bumptech.glide.load.resource.bitmap.C6635c;
import com.bumptech.glide.load.resource.bitmap.C6641i;
import com.bumptech.glide.load.resource.bitmap.D;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.E;
import com.bumptech.glide.load.resource.bitmap.G;
import com.bumptech.glide.load.resource.bitmap.I;
import com.bumptech.glide.load.resource.bitmap.s;
import com.bumptech.glide.load.resource.bitmap.v;
import com.bumptech.glide.load.resource.bitmap.z;
import d7.C13634a;
import d7.C13635b;
import d7.d;
import d7.e;
import d7.g;
import d7.l;
import d7.p;
import d7.t;
import d7.u;
import d7.w;
import d7.x;
import d7.y;
import d7.z;
import e7.C13776a;
import e7.C13777b;
import e7.c;
import e7.d;
import e7.g;
import g7.C14336a;
import h7.m;
import i7.C14690a;
import j7.C14959a;
import j7.C14961c;
import j7.C14962d;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
import k7.C15103a;
import k7.C15104b;
import k7.C15105c;
import k7.C15106d;
import m7.AbstractC15682a;
import m7.InterfaceC15683b;
import r7.f;

/* loaded from: classes4.dex */
final class i {

    class a implements f.b<Registry> {

        /* renamed from: a, reason: collision with root package name */
        private boolean f64547a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f64548b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f64549c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC15682a f64550d;

        a(b bVar, List list, AbstractC15682a abstractC15682a) {
            this.f64548b = bVar;
            this.f64549c = list;
            this.f64550d = abstractC15682a;
        }

        @Override // r7.f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Registry get() {
            if (this.f64547a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            H4.a.c("Glide registry");
            this.f64547a = true;
            try {
                return i.a(this.f64548b, this.f64549c, this.f64550d);
            } finally {
                this.f64547a = false;
                H4.a.f();
            }
        }
    }

    private static void b(Context context, Registry registry, a7.d dVar, InterfaceC5665b interfaceC5665b, e eVar) {
        X6.i c6641i;
        X6.i e10;
        String str;
        Registry registry2;
        registry.o(new DefaultImageHeaderParser());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            registry.o(new v());
        }
        Resources resources = context.getResources();
        List<ImageHeaderParser> listG = registry.g();
        C14959a c14959a = new C14959a(context, listG, dVar, interfaceC5665b);
        X6.i<ParcelFileDescriptor, Bitmap> iVarM = I.m(dVar);
        s sVar = new s(registry.g(), resources.getDisplayMetrics(), dVar, interfaceC5665b);
        if (i10 < 28 || !eVar.a(c.b.class)) {
            c6641i = new C6641i(sVar);
            e10 = new E(sVar, interfaceC5665b);
        } else {
            e10 = new z();
            c6641i = new com.bumptech.glide.load.resource.bitmap.k();
        }
        if (i10 >= 28) {
            registry.e("Animation", InputStream.class, Drawable.class, h7.h.f(listG, interfaceC5665b));
            registry.e("Animation", ByteBuffer.class, Drawable.class, h7.h.a(listG, interfaceC5665b));
        }
        h7.l lVar = new h7.l(context);
        C6635c c6635c = new C6635c(interfaceC5665b);
        C15103a c15103a = new C15103a();
        C15106d c15106d = new C15106d();
        ContentResolver contentResolver = context.getContentResolver();
        registry.a(ByteBuffer.class, new d7.c()).a(InputStream.class, new d7.v(interfaceC5665b)).e("Bitmap", ByteBuffer.class, Bitmap.class, c6641i).e("Bitmap", InputStream.class, Bitmap.class, e10);
        if (ParcelFileDescriptorRewinder.c()) {
            str = "Animation";
            registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new B(sVar));
        } else {
            str = "Animation";
        }
        registry.e("Bitmap", AssetFileDescriptor.class, Bitmap.class, I.c(dVar));
        String str2 = str;
        registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, iVarM).d(Bitmap.class, Bitmap.class, x.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new G()).b(Bitmap.class, c6635c).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C6633a(resources, c6641i)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C6633a(resources, e10)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C6633a(resources, iVarM)).b(BitmapDrawable.class, new C6634b(dVar, c6635c)).e(str2, InputStream.class, C14961c.class, new j7.j(listG, c14959a, interfaceC5665b)).e(str2, ByteBuffer.class, C14961c.class, c14959a).b(C14961c.class, new C14962d()).d(W6.a.class, W6.a.class, x.a.a()).e("Bitmap", W6.a.class, Bitmap.class, new j7.h(dVar)).c(Uri.class, Drawable.class, lVar).c(Uri.class, Bitmap.class, new D(lVar, dVar)).p(new C14336a.C2118a()).d(File.class, ByteBuffer.class, new d.b()).d(File.class, InputStream.class, new g.e()).c(File.class, File.class, new C14690a()).d(File.class, ParcelFileDescriptor.class, new g.b()).d(File.class, File.class, x.a.a()).p(new k.a(interfaceC5665b));
        if (ParcelFileDescriptorRewinder.c()) {
            registry2 = registry;
            registry2.p(new ParcelFileDescriptorRewinder.a());
        } else {
            registry2 = registry;
        }
        p<Integer, InputStream> pVarG = d7.f.g(context);
        p<Integer, AssetFileDescriptor> pVarC = d7.f.c(context);
        p<Integer, Drawable> pVarE = d7.f.e(context);
        Class cls = Integer.TYPE;
        registry2.d(cls, InputStream.class, pVarG).d(Integer.class, InputStream.class, pVarG).d(cls, AssetFileDescriptor.class, pVarC).d(Integer.class, AssetFileDescriptor.class, pVarC).d(cls, Drawable.class, pVarE).d(Integer.class, Drawable.class, pVarE).d(Uri.class, InputStream.class, u.f(context)).d(Uri.class, AssetFileDescriptor.class, u.e(context));
        t.c cVar = new t.c(resources);
        t.a aVar = new t.a(resources);
        t.b bVar = new t.b(resources);
        registry2.d(Integer.class, Uri.class, cVar).d(cls, Uri.class, cVar).d(Integer.class, AssetFileDescriptor.class, aVar).d(cls, AssetFileDescriptor.class, aVar).d(Integer.class, InputStream.class, bVar).d(cls, InputStream.class, bVar);
        registry2.d(String.class, InputStream.class, new e.c()).d(Uri.class, InputStream.class, new e.c()).d(String.class, InputStream.class, new w.c()).d(String.class, ParcelFileDescriptor.class, new w.b()).d(String.class, AssetFileDescriptor.class, new w.a()).d(Uri.class, InputStream.class, new C13634a.c(context.getAssets())).d(Uri.class, AssetFileDescriptor.class, new C13634a.b(context.getAssets())).d(Uri.class, InputStream.class, new C13777b.a(context)).d(Uri.class, InputStream.class, new c.a(context));
        if (i10 >= 29) {
            registry2.d(Uri.class, InputStream.class, new d.c(context));
            registry2.d(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        registry2.d(Uri.class, InputStream.class, new y.d(contentResolver)).d(Uri.class, ParcelFileDescriptor.class, new y.b(contentResolver)).d(Uri.class, AssetFileDescriptor.class, new y.a(contentResolver)).d(Uri.class, InputStream.class, new z.a()).d(URL.class, InputStream.class, new g.a()).d(Uri.class, File.class, new l.a(context)).d(d7.h.class, InputStream.class, new C13776a.C2043a()).d(byte[].class, ByteBuffer.class, new C13635b.a()).d(byte[].class, InputStream.class, new C13635b.d()).d(Uri.class, Uri.class, x.a.a()).d(Drawable.class, Drawable.class, x.a.a()).c(Drawable.class, Drawable.class, new m()).q(Bitmap.class, BitmapDrawable.class, new C15104b(resources)).q(Bitmap.class, byte[].class, c15103a).q(Drawable.class, byte[].class, new C15105c(dVar, c15103a, c15106d)).q(C14961c.class, byte[].class, c15106d);
        X6.i<ByteBuffer, Bitmap> iVarD = I.d(dVar);
        registry2.c(ByteBuffer.class, Bitmap.class, iVarD);
        registry2.c(ByteBuffer.class, BitmapDrawable.class, new C6633a(resources, iVarD));
    }

    static f.b<Registry> d(b bVar, List<InterfaceC15683b> list, AbstractC15682a abstractC15682a) {
        return new a(bVar, list, abstractC15682a);
    }

    static Registry a(b bVar, List<InterfaceC15683b> list, AbstractC15682a abstractC15682a) {
        a7.d dVarF = bVar.f();
        InterfaceC5665b interfaceC5665bE = bVar.e();
        Context applicationContext = bVar.i().getApplicationContext();
        e eVarG = bVar.i().g();
        Registry registry = new Registry();
        b(applicationContext, registry, dVarF, interfaceC5665bE, eVarG);
        c(applicationContext, bVar, registry, list, abstractC15682a);
        return registry;
    }

    private static void c(Context context, b bVar, Registry registry, List<InterfaceC15683b> list, AbstractC15682a abstractC15682a) {
        for (InterfaceC15683b interfaceC15683b : list) {
            try {
                interfaceC15683b.b(context, bVar, registry);
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + interfaceC15683b.getClass().getName(), e10);
            }
        }
        if (abstractC15682a != null) {
            abstractC15682a.a(context, bVar, registry);
        }
    }
}
