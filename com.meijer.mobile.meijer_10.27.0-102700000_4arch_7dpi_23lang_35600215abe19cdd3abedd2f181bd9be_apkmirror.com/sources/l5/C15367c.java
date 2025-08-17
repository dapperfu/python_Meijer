package l5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m5.EnumC15555e;
import p5.InterfaceC16261c;
import q5.C16458j;
import qv.AbstractC16618K;
import qv.C16639f0;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b!\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J©\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b+\u00104R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b'\u00107R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b)\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b&\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b#\u00109\u001a\u0004\b5\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b8\u0010;R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b<\u0010?R\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b:\u0010>\u001a\u0004\b2\u0010?R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b0\u0010>\u001a\u0004\b=\u0010?¨\u0006@"}, d2 = {"Ll5/c;", "", "Lqv/K;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "Lp5/c$a;", "transitionFactory", "Lm5/e;", "precision", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "", "allowHardware", "allowRgb565", "Landroid/graphics/drawable/Drawable;", "placeholder", "error", "fallback", "Ll5/b;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Lqv/K;Lqv/K;Lqv/K;Lqv/K;Lp5/c$a;Lm5/e;Landroid/graphics/Bitmap$Config;ZZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ll5/b;Ll5/b;Ll5/b;)V", "a", "(Lqv/K;Lqv/K;Lqv/K;Lqv/K;Lp5/c$a;Lm5/e;Landroid/graphics/Bitmap$Config;ZZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ll5/b;Ll5/b;Ll5/b;)Ll5/c;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lqv/K;", "k", "()Lqv/K;", "b", "j", "c", "f", "d", "p", "e", "Lp5/c$a;", "q", "()Lp5/c$a;", "Lm5/e;", "o", "()Lm5/e;", "g", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "h", "Z", "()Z", "i", "Landroid/graphics/drawable/Drawable;", "n", "()Landroid/graphics/drawable/Drawable;", "l", "m", "Ll5/b;", "()Ll5/b;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: l5.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15367c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K interceptorDispatcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K fetcherDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K decoderDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K transformationDispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16261c.a transitionFactory;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final EnumC15555e precision;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Bitmap.Config bitmapConfig;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean allowHardware;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean allowRgb565;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Drawable placeholder;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Drawable error;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Drawable fallback;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final EnumC15366b memoryCachePolicy;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final EnumC15366b diskCachePolicy;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final EnumC15366b networkCachePolicy;

    public C15367c() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15367c)) {
            return false;
        }
        C15367c c15367c = (C15367c) other;
        return Intrinsics.e(this.interceptorDispatcher, c15367c.interceptorDispatcher) && Intrinsics.e(this.fetcherDispatcher, c15367c.fetcherDispatcher) && Intrinsics.e(this.decoderDispatcher, c15367c.decoderDispatcher) && Intrinsics.e(this.transformationDispatcher, c15367c.transformationDispatcher) && Intrinsics.e(this.transitionFactory, c15367c.transitionFactory) && this.precision == c15367c.precision && this.bitmapConfig == c15367c.bitmapConfig && this.allowHardware == c15367c.allowHardware && this.allowRgb565 == c15367c.allowRgb565 && Intrinsics.e(this.placeholder, c15367c.placeholder) && Intrinsics.e(this.error, c15367c.error) && Intrinsics.e(this.fallback, c15367c.fallback) && this.memoryCachePolicy == c15367c.memoryCachePolicy && this.diskCachePolicy == c15367c.diskCachePolicy && this.networkCachePolicy == c15367c.networkCachePolicy;
    }

    public C15367c(AbstractC16618K abstractC16618K, AbstractC16618K abstractC16618K2, AbstractC16618K abstractC16618K3, AbstractC16618K abstractC16618K4, InterfaceC16261c.a aVar, EnumC15555e enumC15555e, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, EnumC15366b enumC15366b, EnumC15366b enumC15366b2, EnumC15366b enumC15366b3) {
        this.interceptorDispatcher = abstractC16618K;
        this.fetcherDispatcher = abstractC16618K2;
        this.decoderDispatcher = abstractC16618K3;
        this.transformationDispatcher = abstractC16618K4;
        this.transitionFactory = aVar;
        this.precision = enumC15555e;
        this.bitmapConfig = config;
        this.allowHardware = z10;
        this.allowRgb565 = z11;
        this.placeholder = drawable;
        this.error = drawable2;
        this.fallback = drawable3;
        this.memoryCachePolicy = enumC15366b;
        this.diskCachePolicy = enumC15366b2;
        this.networkCachePolicy = enumC15366b3;
    }

    public final C15367c a(AbstractC16618K interceptorDispatcher, AbstractC16618K fetcherDispatcher, AbstractC16618K decoderDispatcher, AbstractC16618K transformationDispatcher, InterfaceC16261c.a transitionFactory, EnumC15555e precision, Bitmap.Config bitmapConfig, boolean allowHardware, boolean allowRgb565, Drawable placeholder, Drawable error, Drawable fallback, EnumC15366b memoryCachePolicy, EnumC15366b diskCachePolicy, EnumC15366b networkCachePolicy) {
        return new C15367c(interceptorDispatcher, fetcherDispatcher, decoderDispatcher, transformationDispatcher, transitionFactory, precision, bitmapConfig, allowHardware, allowRgb565, placeholder, error, fallback, memoryCachePolicy, diskCachePolicy, networkCachePolicy);
    }

    /* renamed from: c, reason: from getter */
    public final boolean getAllowHardware() {
        return this.allowHardware;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    /* renamed from: e, reason: from getter */
    public final Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC16618K getDecoderDispatcher() {
        return this.decoderDispatcher;
    }

    /* renamed from: g, reason: from getter */
    public final EnumC15366b getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    /* renamed from: h, reason: from getter */
    public final Drawable getError() {
        return this.error;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.interceptorDispatcher.hashCode() * 31) + this.fetcherDispatcher.hashCode()) * 31) + this.decoderDispatcher.hashCode()) * 31) + this.transformationDispatcher.hashCode()) * 31) + this.transitionFactory.hashCode()) * 31) + this.precision.hashCode()) * 31) + this.bitmapConfig.hashCode()) * 31) + Boolean.hashCode(this.allowHardware)) * 31) + Boolean.hashCode(this.allowRgb565)) * 31;
        Drawable drawable = this.placeholder;
        int iHashCode2 = (iHashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.error;
        int iHashCode3 = (iHashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.fallback;
        return ((((((iHashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final Drawable getFallback() {
        return this.fallback;
    }

    /* renamed from: j, reason: from getter */
    public final AbstractC16618K getFetcherDispatcher() {
        return this.fetcherDispatcher;
    }

    /* renamed from: k, reason: from getter */
    public final AbstractC16618K getInterceptorDispatcher() {
        return this.interceptorDispatcher;
    }

    /* renamed from: l, reason: from getter */
    public final EnumC15366b getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    /* renamed from: m, reason: from getter */
    public final EnumC15366b getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    /* renamed from: n, reason: from getter */
    public final Drawable getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: o, reason: from getter */
    public final EnumC15555e getPrecision() {
        return this.precision;
    }

    /* renamed from: p, reason: from getter */
    public final AbstractC16618K getTransformationDispatcher() {
        return this.transformationDispatcher;
    }

    /* renamed from: q, reason: from getter */
    public final InterfaceC16261c.a getTransitionFactory() {
        return this.transitionFactory;
    }

    public /* synthetic */ C15367c(AbstractC16618K abstractC16618K, AbstractC16618K abstractC16618K2, AbstractC16618K abstractC16618K3, AbstractC16618K abstractC16618K4, InterfaceC16261c.a aVar, EnumC15555e enumC15555e, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, EnumC15366b enumC15366b, EnumC15366b enumC15366b2, EnumC15366b enumC15366b3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C16639f0.c().Y0() : abstractC16618K, (i10 & 2) != 0 ? C16639f0.b() : abstractC16618K2, (i10 & 4) != 0 ? C16639f0.b() : abstractC16618K3, (i10 & 8) != 0 ? C16639f0.b() : abstractC16618K4, (i10 & 16) != 0 ? InterfaceC16261c.a.f155497b : aVar, (i10 & 32) != 0 ? EnumC15555e.f149841c : enumC15555e, (i10 & 64) != 0 ? C16458j.f() : config, (i10 & 128) != 0 ? true : z10, (i10 & 256) != 0 ? false : z11, (i10 & 512) != 0 ? null : drawable, (i10 & 1024) != 0 ? null : drawable2, (i10 & RecyclerView.m.FLAG_MOVED) == 0 ? drawable3 : null, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? EnumC15366b.f148510c : enumC15366b, (i10 & 8192) != 0 ? EnumC15366b.f148510c : enumC15366b2, (i10 & 16384) != 0 ? EnumC15366b.f148510c : enumC15366b3);
    }
}
