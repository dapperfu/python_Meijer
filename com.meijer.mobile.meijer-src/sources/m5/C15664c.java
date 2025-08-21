package m5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mv.AbstractC15779K;
import mv.C15800f0;
import n5.EnumC15908e;
import q5.InterfaceC16606c;
import r5.C16846j;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b!\u0018\u00002\u00020\u0001B£\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J©\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b+\u00104R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b'\u00107R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b)\u00107R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b&\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b#\u00109\u001a\u0004\b5\u0010;R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b8\u0010;R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b<\u0010?R\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b:\u0010>\u001a\u0004\b2\u0010?R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b0\u0010>\u001a\u0004\b=\u0010?¨\u0006@"}, d2 = {"Lm5/c;", "", "Lmv/K;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "Lq5/c$a;", "transitionFactory", "Ln5/e;", "precision", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "", "allowHardware", "allowRgb565", "Landroid/graphics/drawable/Drawable;", "placeholder", "error", "fallback", "Lm5/b;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Lmv/K;Lmv/K;Lmv/K;Lmv/K;Lq5/c$a;Ln5/e;Landroid/graphics/Bitmap$Config;ZZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lm5/b;Lm5/b;Lm5/b;)V", "a", "(Lmv/K;Lmv/K;Lmv/K;Lmv/K;Lq5/c$a;Ln5/e;Landroid/graphics/Bitmap$Config;ZZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lm5/b;Lm5/b;Lm5/b;)Lm5/c;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lmv/K;", "k", "()Lmv/K;", "b", "j", "c", "f", "d", "p", "e", "Lq5/c$a;", "q", "()Lq5/c$a;", "Ln5/e;", "o", "()Ln5/e;", "g", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "h", "Z", "()Z", "i", "Landroid/graphics/drawable/Drawable;", "n", "()Landroid/graphics/drawable/Drawable;", "l", "m", "Lm5/b;", "()Lm5/b;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: m5.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15664c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K interceptorDispatcher;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K fetcherDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K decoderDispatcher;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K transformationDispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16606c.a transitionFactory;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final EnumC15908e precision;

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
    private final EnumC15663b memoryCachePolicy;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final EnumC15663b diskCachePolicy;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final EnumC15663b networkCachePolicy;

    public C15664c() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15664c)) {
            return false;
        }
        C15664c c15664c = (C15664c) other;
        return Intrinsics.e(this.interceptorDispatcher, c15664c.interceptorDispatcher) && Intrinsics.e(this.fetcherDispatcher, c15664c.fetcherDispatcher) && Intrinsics.e(this.decoderDispatcher, c15664c.decoderDispatcher) && Intrinsics.e(this.transformationDispatcher, c15664c.transformationDispatcher) && Intrinsics.e(this.transitionFactory, c15664c.transitionFactory) && this.precision == c15664c.precision && this.bitmapConfig == c15664c.bitmapConfig && this.allowHardware == c15664c.allowHardware && this.allowRgb565 == c15664c.allowRgb565 && Intrinsics.e(this.placeholder, c15664c.placeholder) && Intrinsics.e(this.error, c15664c.error) && Intrinsics.e(this.fallback, c15664c.fallback) && this.memoryCachePolicy == c15664c.memoryCachePolicy && this.diskCachePolicy == c15664c.diskCachePolicy && this.networkCachePolicy == c15664c.networkCachePolicy;
    }

    public C15664c(AbstractC15779K abstractC15779K, AbstractC15779K abstractC15779K2, AbstractC15779K abstractC15779K3, AbstractC15779K abstractC15779K4, InterfaceC16606c.a aVar, EnumC15908e enumC15908e, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, EnumC15663b enumC15663b, EnumC15663b enumC15663b2, EnumC15663b enumC15663b3) {
        this.interceptorDispatcher = abstractC15779K;
        this.fetcherDispatcher = abstractC15779K2;
        this.decoderDispatcher = abstractC15779K3;
        this.transformationDispatcher = abstractC15779K4;
        this.transitionFactory = aVar;
        this.precision = enumC15908e;
        this.bitmapConfig = config;
        this.allowHardware = z10;
        this.allowRgb565 = z11;
        this.placeholder = drawable;
        this.error = drawable2;
        this.fallback = drawable3;
        this.memoryCachePolicy = enumC15663b;
        this.diskCachePolicy = enumC15663b2;
        this.networkCachePolicy = enumC15663b3;
    }

    public final C15664c a(AbstractC15779K interceptorDispatcher, AbstractC15779K fetcherDispatcher, AbstractC15779K decoderDispatcher, AbstractC15779K transformationDispatcher, InterfaceC16606c.a transitionFactory, EnumC15908e precision, Bitmap.Config bitmapConfig, boolean allowHardware, boolean allowRgb565, Drawable placeholder, Drawable error, Drawable fallback, EnumC15663b memoryCachePolicy, EnumC15663b diskCachePolicy, EnumC15663b networkCachePolicy) {
        return new C15664c(interceptorDispatcher, fetcherDispatcher, decoderDispatcher, transformationDispatcher, transitionFactory, precision, bitmapConfig, allowHardware, allowRgb565, placeholder, error, fallback, memoryCachePolicy, diskCachePolicy, networkCachePolicy);
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
    public final AbstractC15779K getDecoderDispatcher() {
        return this.decoderDispatcher;
    }

    /* renamed from: g, reason: from getter */
    public final EnumC15663b getDiskCachePolicy() {
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
    public final AbstractC15779K getFetcherDispatcher() {
        return this.fetcherDispatcher;
    }

    /* renamed from: k, reason: from getter */
    public final AbstractC15779K getInterceptorDispatcher() {
        return this.interceptorDispatcher;
    }

    /* renamed from: l, reason: from getter */
    public final EnumC15663b getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    /* renamed from: m, reason: from getter */
    public final EnumC15663b getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    /* renamed from: n, reason: from getter */
    public final Drawable getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: o, reason: from getter */
    public final EnumC15908e getPrecision() {
        return this.precision;
    }

    /* renamed from: p, reason: from getter */
    public final AbstractC15779K getTransformationDispatcher() {
        return this.transformationDispatcher;
    }

    /* renamed from: q, reason: from getter */
    public final InterfaceC16606c.a getTransitionFactory() {
        return this.transitionFactory;
    }

    public /* synthetic */ C15664c(AbstractC15779K abstractC15779K, AbstractC15779K abstractC15779K2, AbstractC15779K abstractC15779K3, AbstractC15779K abstractC15779K4, InterfaceC16606c.a aVar, EnumC15908e enumC15908e, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, EnumC15663b enumC15663b, EnumC15663b enumC15663b2, EnumC15663b enumC15663b3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C15800f0.c().X0() : abstractC15779K, (i10 & 2) != 0 ? C15800f0.b() : abstractC15779K2, (i10 & 4) != 0 ? C15800f0.b() : abstractC15779K3, (i10 & 8) != 0 ? C15800f0.b() : abstractC15779K4, (i10 & 16) != 0 ? InterfaceC16606c.a.f157901b : aVar, (i10 & 32) != 0 ? EnumC15908e.f152053c : enumC15908e, (i10 & 64) != 0 ? C16846j.f() : config, (i10 & 128) != 0 ? true : z10, (i10 & 256) != 0 ? false : z11, (i10 & 512) != 0 ? null : drawable, (i10 & 1024) != 0 ? null : drawable2, (i10 & RecyclerView.m.FLAG_MOVED) == 0 ? drawable3 : null, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? EnumC15663b.f150580c : enumC15663b, (i10 & 8192) != 0 ? EnumC15663b.f150580c : enumC15663b2, (i10 & 16384) != 0 ? EnumC15663b.f150580c : enumC15663b3);
    }
}
