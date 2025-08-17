package com.meijer.mobile.weeklyad;

import Sa.c;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import h7.C14383c;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR8\u0010\u0014\u001a&\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u0010j\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/weeklyad/a;", "LSa/c$b;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "url", "LSa/c$a;", "target", "", "a", "(Ljava/lang/String;LSa/c$a;)V", "b", "(LSa/c$a;)V", "Landroid/content/Context;", "Ljava/util/HashMap;", "Lcom/bumptech/glide/request/target/j;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "glideImageTargetMap", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.weeklyad.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C12989a implements c.b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final HashMap<c.a, com.bumptech.glide.request.target.j<?>> glideImageTargetMap;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\b\b\u0000\u0012\u0004\u0018\u00010\u0002\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"com/meijer/mobile/weeklyad/a$a", "Lcom/bumptech/glide/request/target/h;", "Landroid/graphics/drawable/Drawable;", "errorDrawable", "", "onLoadFailed", "(Landroid/graphics/drawable/Drawable;)V", "resource", "Ln7/b;", "transition", "a", "(Landroid/graphics/drawable/Drawable;Ln7/b;)V", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.weeklyad.a$a, reason: collision with other inner class name */
    public static final class C1958a extends com.bumptech.glide.request.target.h<Drawable> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c.a f119272c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C12989a f119273d;

        C1958a(c.a aVar, C12989a c12989a) {
            this.f119272c = aVar;
            this.f119273d = c12989a;
        }

        @Override // com.bumptech.glide.request.target.j
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(Drawable resource, n7.b<? super Drawable> transition) {
            Intrinsics.j(resource, "resource");
            Bitmap bitmapE = resource instanceof C14383c ? ((C14383c) resource).e() : null;
            if (resource instanceof BitmapDrawable) {
                bitmapE = ((BitmapDrawable) resource).getBitmap();
            }
            this.f119272c.b(bitmapE);
            this.f119273d.glideImageTargetMap.remove(this.f119272c);
        }

        @Override // com.bumptech.glide.request.target.a, com.bumptech.glide.request.target.j
        public void onLoadFailed(Drawable errorDrawable) {
            this.f119272c.a();
            this.f119273d.glideImageTargetMap.remove(this.f119272c);
        }
    }

    public C12989a(Context context) {
        Intrinsics.j(context, "context");
        this.context = context;
        this.glideImageTargetMap = new HashMap<>();
    }

    @Override // Sa.c.b
    public void a(String url, c.a target) {
        Intrinsics.j(url, "url");
        Intrinsics.j(target, "target");
        C1958a c1958a = new C1958a(target, this);
        this.glideImageTargetMap.put(target, c1958a);
        com.bumptech.glide.b.t(this.context).i(url).z0(c1958a);
    }

    @Override // Sa.c.b
    public void b(c.a target) {
        com.bumptech.glide.request.target.j<?> jVar = this.glideImageTargetMap.get(target);
        if (jVar == null) {
            return;
        }
        com.bumptech.glide.b.t(this.context).d(jVar);
    }
}
