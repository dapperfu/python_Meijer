package com.bumptech.glide;

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
import b7.C6203a;
import b7.C6204b;
import b7.d;
import b7.e;
import b7.g;
import b7.l;
import b7.p;
import b7.t;
import b7.u;
import b7.w;
import b7.x;
import b7.y;
import b7.z;
import c7.C6372a;
import c7.C6373b;
import c7.c;
import c7.d;
import c7.g;
import com.bumptech.glide.c;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.resource.bitmap.B;
import com.bumptech.glide.load.resource.bitmap.C6508a;
import com.bumptech.glide.load.resource.bitmap.C6509b;
import com.bumptech.glide.load.resource.bitmap.C6510c;
import com.bumptech.glide.load.resource.bitmap.C6516i;
import com.bumptech.glide.load.resource.bitmap.D;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.E;
import com.bumptech.glide.load.resource.bitmap.G;
import com.bumptech.glide.load.resource.bitmap.I;
import com.bumptech.glide.load.resource.bitmap.s;
import com.bumptech.glide.load.resource.bitmap.v;
import com.bumptech.glide.load.resource.bitmap.z;
import e7.C13632a;
import f7.m;
import g7.C14214a;
import h7.C14381a;
import h7.C14383c;
import h7.C14384d;
import i7.C14700a;
import i7.C14701b;
import i7.C14702c;
import i7.C14703d;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
import k7.AbstractC15111a;
import k7.InterfaceC15112b;
import p7.f;

/* loaded from: classes4.dex */
final class i {

    class a implements f.b<Registry> {

        /* renamed from: a, reason: collision with root package name */
        private boolean f63707a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f63708b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f63709c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC15111a f63710d;

        a(b bVar, List list, AbstractC15111a abstractC15111a) {
            this.f63708b = bVar;
            this.f63709c = list;
            this.f63710d = abstractC15111a;
        }

        @Override // p7.f.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Registry get() {
            if (this.f63707a) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            G4.a.c("Glide registry");
            this.f63707a = true;
            try {
                return i.a(this.f63708b, this.f63709c, this.f63710d);
            } finally {
                this.f63707a = false;
                G4.a.f();
            }
        }
    }

    private static void b(Context context, Registry registry, Y6.d dVar, Y6.b bVar, e eVar) {
        V6.i c6516i;
        V6.i e10;
        String str;
        Registry registry2;
        registry.o(new DefaultImageHeaderParser());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            registry.o(new v());
        }
        Resources resources = context.getResources();
        List<ImageHeaderParser> listG = registry.g();
        C14381a c14381a = new C14381a(context, listG, dVar, bVar);
        V6.i<ParcelFileDescriptor, Bitmap> iVarM = I.m(dVar);
        s sVar = new s(registry.g(), resources.getDisplayMetrics(), dVar, bVar);
        if (i10 < 28 || !eVar.a(c.b.class)) {
            c6516i = new C6516i(sVar);
            e10 = new E(sVar, bVar);
        } else {
            e10 = new z();
            c6516i = new com.bumptech.glide.load.resource.bitmap.k();
        }
        if (i10 >= 28) {
            registry.e("Animation", InputStream.class, Drawable.class, f7.h.f(listG, bVar));
            registry.e("Animation", ByteBuffer.class, Drawable.class, f7.h.a(listG, bVar));
        }
        f7.l lVar = new f7.l(context);
        C6510c c6510c = new C6510c(bVar);
        C14700a c14700a = new C14700a();
        C14703d c14703d = new C14703d();
        ContentResolver contentResolver = context.getContentResolver();
        registry.a(ByteBuffer.class, new b7.c()).a(InputStream.class, new b7.v(bVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, c6516i).e("Bitmap", InputStream.class, Bitmap.class, e10);
        if (ParcelFileDescriptorRewinder.c()) {
            str = "Animation";
            registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new B(sVar));
        } else {
            str = "Animation";
        }
        registry.e("Bitmap", AssetFileDescriptor.class, Bitmap.class, I.c(dVar));
        String str2 = str;
        registry.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, iVarM).d(Bitmap.class, Bitmap.class, x.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new G()).b(Bitmap.class, c6510c).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C6508a(resources, c6516i)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C6508a(resources, e10)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C6508a(resources, iVarM)).b(BitmapDrawable.class, new C6509b(dVar, c6510c)).e(str2, InputStream.class, C14383c.class, new h7.j(listG, c14381a, bVar)).e(str2, ByteBuffer.class, C14383c.class, c14381a).b(C14383c.class, new C14384d()).d(U6.a.class, U6.a.class, x.a.a()).e("Bitmap", U6.a.class, Bitmap.class, new h7.h(dVar)).c(Uri.class, Drawable.class, lVar).c(Uri.class, Bitmap.class, new D(lVar, dVar)).p(new C13632a.C2020a()).d(File.class, ByteBuffer.class, new d.b()).d(File.class, InputStream.class, new g.e()).c(File.class, File.class, new C14214a()).d(File.class, ParcelFileDescriptor.class, new g.b()).d(File.class, File.class, x.a.a()).p(new k.a(bVar));
        if (ParcelFileDescriptorRewinder.c()) {
            registry2 = registry;
            registry2.p(new ParcelFileDescriptorRewinder.a());
        } else {
            registry2 = registry;
        }
        p<Integer, InputStream> pVarG = b7.f.g(context);
        p<Integer, AssetFileDescriptor> pVarC = b7.f.c(context);
        p<Integer, Drawable> pVarE = b7.f.e(context);
        Class cls = Integer.TYPE;
        registry2.d(cls, InputStream.class, pVarG).d(Integer.class, InputStream.class, pVarG).d(cls, AssetFileDescriptor.class, pVarC).d(Integer.class, AssetFileDescriptor.class, pVarC).d(cls, Drawable.class, pVarE).d(Integer.class, Drawable.class, pVarE).d(Uri.class, InputStream.class, u.f(context)).d(Uri.class, AssetFileDescriptor.class, u.e(context));
        t.c cVar = new t.c(resources);
        t.a aVar = new t.a(resources);
        t.b bVar2 = new t.b(resources);
        registry2.d(Integer.class, Uri.class, cVar).d(cls, Uri.class, cVar).d(Integer.class, AssetFileDescriptor.class, aVar).d(cls, AssetFileDescriptor.class, aVar).d(Integer.class, InputStream.class, bVar2).d(cls, InputStream.class, bVar2);
        registry2.d(String.class, InputStream.class, new e.c()).d(Uri.class, InputStream.class, new e.c()).d(String.class, InputStream.class, new w.c()).d(String.class, ParcelFileDescriptor.class, new w.b()).d(String.class, AssetFileDescriptor.class, new w.a()).d(Uri.class, InputStream.class, new C6203a.c(context.getAssets())).d(Uri.class, AssetFileDescriptor.class, new C6203a.b(context.getAssets())).d(Uri.class, InputStream.class, new C6373b.a(context)).d(Uri.class, InputStream.class, new c.a(context));
        if (i10 >= 29) {
            registry2.d(Uri.class, InputStream.class, new d.c(context));
            registry2.d(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        registry2.d(Uri.class, InputStream.class, new y.d(contentResolver)).d(Uri.class, ParcelFileDescriptor.class, new y.b(contentResolver)).d(Uri.class, AssetFileDescriptor.class, new y.a(contentResolver)).d(Uri.class, InputStream.class, new z.a()).d(URL.class, InputStream.class, new g.a()).d(Uri.class, File.class, new l.a(context)).d(b7.h.class, InputStream.class, new C6372a.C1216a()).d(byte[].class, ByteBuffer.class, new C6204b.a()).d(byte[].class, InputStream.class, new C6204b.d()).d(Uri.class, Uri.class, x.a.a()).d(Drawable.class, Drawable.class, x.a.a()).c(Drawable.class, Drawable.class, new m()).q(Bitmap.class, BitmapDrawable.class, new C14701b(resources)).q(Bitmap.class, byte[].class, c14700a).q(Drawable.class, byte[].class, new C14702c(dVar, c14700a, c14703d)).q(C14383c.class, byte[].class, c14703d);
        V6.i<ByteBuffer, Bitmap> iVarD = I.d(dVar);
        registry2.c(ByteBuffer.class, Bitmap.class, iVarD);
        registry2.c(ByteBuffer.class, BitmapDrawable.class, new C6508a(resources, iVarD));
    }

    static f.b<Registry> d(b bVar, List<InterfaceC15112b> list, AbstractC15111a abstractC15111a) {
        return new a(bVar, list, abstractC15111a);
    }

    static Registry a(b bVar, List<InterfaceC15112b> list, AbstractC15111a abstractC15111a) {
        Y6.d dVarF = bVar.f();
        Y6.b bVarE = bVar.e();
        Context applicationContext = bVar.i().getApplicationContext();
        e eVarG = bVar.i().g();
        Registry registry = new Registry();
        b(applicationContext, registry, dVarF, bVarE, eVarG);
        c(applicationContext, bVar, registry, list, abstractC15111a);
        return registry;
    }

    private static void c(Context context, b bVar, Registry registry, List<InterfaceC15112b> list, AbstractC15111a abstractC15111a) {
        for (InterfaceC15112b interfaceC15112b : list) {
            try {
                interfaceC15112b.b(context, bVar, registry);
            } catch (AbstractMethodError e10) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + interfaceC15112b.getClass().getName(), e10);
            }
        }
        if (abstractC15111a != null) {
            abstractC15111a.a(context, bVar, registry);
        }
    }
}
