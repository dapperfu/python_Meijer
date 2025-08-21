package com.meijer.mobile.weeklyad;

import Ua.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import j7.C14961c;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR8\u0010\u0014\u001a&\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u0010j\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/weeklyad/a;", "LUa/c$b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "url", "LUa/c$a;", "target", "", "a", "(Ljava/lang/String;LUa/c$a;)V", "b", "(LUa/c$a;)V", "Landroid/content/Context;", "Ljava/util/HashMap;", "Lcom/bumptech/glide/request/target/j;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "glideImageTargetMap", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.weeklyad.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13120a implements c.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final HashMap<c.a, com.bumptech.glide.request.target.j<?>> glideImageTargetMap;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\b\b\u0000\u0012\u0004\u0018\u00010\u0002\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/meijer/mobile/weeklyad/a$a", "Lcom/bumptech/glide/request/target/h;", "Landroid/graphics/drawable/Drawable;", "errorDrawable", "", "onLoadFailed", "(Landroid/graphics/drawable/Drawable;)V", "resource", "Lp7/b;", "transition", "a", "(Landroid/graphics/drawable/Drawable;Lp7/b;)V", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.weeklyad.a$a, reason: collision with other inner class name */
    public static final class C1965a extends com.bumptech.glide.request.target.h<Drawable> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c.a f120245c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C13120a f120246d;

        C1965a(c.a aVar, C13120a c13120a) {
            this.f120245c = aVar;
            this.f120246d = c13120a;
        }

        @Override // com.bumptech.glide.request.target.j
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(Drawable resource, p7.b<? super Drawable> transition) {
            Intrinsics.j(resource, "resource");
            Bitmap bitmapE = resource instanceof C14961c ? ((C14961c) resource).e() : null;
            if (resource instanceof BitmapDrawable) {
                bitmapE = ((BitmapDrawable) resource).getBitmap();
            }
            this.f120245c.b(bitmapE);
            this.f120246d.glideImageTargetMap.remove(this.f120245c);
        }

        @Override // com.bumptech.glide.request.target.a, com.bumptech.glide.request.target.j
        public void onLoadFailed(Drawable errorDrawable) {
            this.f120245c.a();
            this.f120246d.glideImageTargetMap.remove(this.f120245c);
        }
    }

    public C13120a(Context context) {
        Intrinsics.j(context, "context");
        this.context = context;
        this.glideImageTargetMap = new HashMap<>();
    }

    @Override // Ua.c.b
    public void a(String url, c.a target) {
        Intrinsics.j(url, "url");
        Intrinsics.j(target, "target");
        C1965a c1965a = new C1965a(target, this);
        this.glideImageTargetMap.put(target, c1965a);
        com.bumptech.glide.b.t(this.context).i(url).z0(c1965a);
    }

    @Override // Ua.c.b
    public void b(c.a target) {
        com.bumptech.glide.request.target.j<?> jVar = this.glideImageTargetMap.get(target);
        if (jVar == null) {
            return;
        }
        com.bumptech.glide.b.t(this.context).d(jVar);
    }
}
