package m5;

import android.graphics.Bitmap;
import androidx.view.AbstractC6165l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mv.AbstractC15779K;
import n5.EnumC15908e;
import n5.EnumC15911h;
import n5.InterfaceC15913j;
import q5.InterfaceC16606c;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b$\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b.\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b4\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b*\u0010>R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b:\u0010?\u001a\u0004\b\"\u0010@R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b,\u0010?\u001a\u0004\b&\u0010@R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b(\u0010A\u001a\u0004\b8\u0010BR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b4\u0010A\u001a\u0004\b2\u0010BR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b6\u0010A\u001a\u0004\b<\u0010B¨\u0006C"}, d2 = {"Lm5/d;", "", "Landroidx/lifecycle/l;", "lifecycle", "Ln5/j;", "sizeResolver", "Ln5/h;", "scale", "Lmv/K;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "Lq5/c$a;", "transitionFactory", "Ln5/e;", "precision", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "", "allowHardware", "allowRgb565", "Lm5/b;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Landroidx/lifecycle/l;Ln5/j;Ln5/h;Lmv/K;Lmv/K;Lmv/K;Lmv/K;Lq5/c$a;Ln5/e;Landroid/graphics/Bitmap$Config;Ljava/lang/Boolean;Ljava/lang/Boolean;Lm5/b;Lm5/b;Lm5/b;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/lifecycle/l;", "h", "()Landroidx/lifecycle/l;", "b", "Ln5/j;", "m", "()Ln5/j;", "c", "Ln5/h;", "l", "()Ln5/h;", "d", "Lmv/K;", "g", "()Lmv/K;", "e", "f", "n", "Lq5/c$a;", "o", "()Lq5/c$a;", "i", "Ln5/e;", "k", "()Ln5/e;", "j", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lm5/b;", "()Lm5/b;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: m5.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15665d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6165l lifecycle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15913j sizeResolver;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final EnumC15911h scale;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K interceptorDispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K fetcherDispatcher;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K decoderDispatcher;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K transformationDispatcher;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16606c.a transitionFactory;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final EnumC15908e precision;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Bitmap.Config bitmapConfig;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Boolean allowHardware;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Boolean allowRgb565;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final EnumC15663b memoryCachePolicy;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final EnumC15663b diskCachePolicy;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final EnumC15663b networkCachePolicy;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15665d)) {
            return false;
        }
        C15665d c15665d = (C15665d) other;
        return Intrinsics.e(this.lifecycle, c15665d.lifecycle) && Intrinsics.e(this.sizeResolver, c15665d.sizeResolver) && this.scale == c15665d.scale && Intrinsics.e(this.interceptorDispatcher, c15665d.interceptorDispatcher) && Intrinsics.e(this.fetcherDispatcher, c15665d.fetcherDispatcher) && Intrinsics.e(this.decoderDispatcher, c15665d.decoderDispatcher) && Intrinsics.e(this.transformationDispatcher, c15665d.transformationDispatcher) && Intrinsics.e(this.transitionFactory, c15665d.transitionFactory) && this.precision == c15665d.precision && this.bitmapConfig == c15665d.bitmapConfig && Intrinsics.e(this.allowHardware, c15665d.allowHardware) && Intrinsics.e(this.allowRgb565, c15665d.allowRgb565) && this.memoryCachePolicy == c15665d.memoryCachePolicy && this.diskCachePolicy == c15665d.diskCachePolicy && this.networkCachePolicy == c15665d.networkCachePolicy;
    }

    /* renamed from: a, reason: from getter */
    public final Boolean getAllowHardware() {
        return this.allowHardware;
    }

    /* renamed from: b, reason: from getter */
    public final Boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    /* renamed from: c, reason: from getter */
    public final Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC15779K getDecoderDispatcher() {
        return this.decoderDispatcher;
    }

    /* renamed from: e, reason: from getter */
    public final EnumC15663b getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC15779K getFetcherDispatcher() {
        return this.fetcherDispatcher;
    }

    /* renamed from: g, reason: from getter */
    public final AbstractC15779K getInterceptorDispatcher() {
        return this.interceptorDispatcher;
    }

    /* renamed from: h, reason: from getter */
    public final AbstractC6165l getLifecycle() {
        return this.lifecycle;
    }

    public int hashCode() {
        AbstractC6165l abstractC6165l = this.lifecycle;
        int iHashCode = (abstractC6165l != null ? abstractC6165l.hashCode() : 0) * 31;
        InterfaceC15913j interfaceC15913j = this.sizeResolver;
        int iHashCode2 = (iHashCode + (interfaceC15913j != null ? interfaceC15913j.hashCode() : 0)) * 31;
        EnumC15911h enumC15911h = this.scale;
        int iHashCode3 = (iHashCode2 + (enumC15911h != null ? enumC15911h.hashCode() : 0)) * 31;
        AbstractC15779K abstractC15779K = this.interceptorDispatcher;
        int iHashCode4 = (iHashCode3 + (abstractC15779K != null ? abstractC15779K.hashCode() : 0)) * 31;
        AbstractC15779K abstractC15779K2 = this.fetcherDispatcher;
        int iHashCode5 = (iHashCode4 + (abstractC15779K2 != null ? abstractC15779K2.hashCode() : 0)) * 31;
        AbstractC15779K abstractC15779K3 = this.decoderDispatcher;
        int iHashCode6 = (iHashCode5 + (abstractC15779K3 != null ? abstractC15779K3.hashCode() : 0)) * 31;
        AbstractC15779K abstractC15779K4 = this.transformationDispatcher;
        int iHashCode7 = (iHashCode6 + (abstractC15779K4 != null ? abstractC15779K4.hashCode() : 0)) * 31;
        InterfaceC16606c.a aVar = this.transitionFactory;
        int iHashCode8 = (iHashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        EnumC15908e enumC15908e = this.precision;
        int iHashCode9 = (iHashCode8 + (enumC15908e != null ? enumC15908e.hashCode() : 0)) * 31;
        Bitmap.Config config = this.bitmapConfig;
        int iHashCode10 = (iHashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.allowHardware;
        int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.allowRgb565;
        int iHashCode12 = (iHashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        EnumC15663b enumC15663b = this.memoryCachePolicy;
        int iHashCode13 = (iHashCode12 + (enumC15663b != null ? enumC15663b.hashCode() : 0)) * 31;
        EnumC15663b enumC15663b2 = this.diskCachePolicy;
        int iHashCode14 = (iHashCode13 + (enumC15663b2 != null ? enumC15663b2.hashCode() : 0)) * 31;
        EnumC15663b enumC15663b3 = this.networkCachePolicy;
        return iHashCode14 + (enumC15663b3 != null ? enumC15663b3.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final EnumC15663b getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    /* renamed from: j, reason: from getter */
    public final EnumC15663b getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    /* renamed from: k, reason: from getter */
    public final EnumC15908e getPrecision() {
        return this.precision;
    }

    /* renamed from: l, reason: from getter */
    public final EnumC15911h getScale() {
        return this.scale;
    }

    /* renamed from: m, reason: from getter */
    public final InterfaceC15913j getSizeResolver() {
        return this.sizeResolver;
    }

    /* renamed from: n, reason: from getter */
    public final AbstractC15779K getTransformationDispatcher() {
        return this.transformationDispatcher;
    }

    /* renamed from: o, reason: from getter */
    public final InterfaceC16606c.a getTransitionFactory() {
        return this.transitionFactory;
    }

    public C15665d(AbstractC6165l abstractC6165l, InterfaceC15913j interfaceC15913j, EnumC15911h enumC15911h, AbstractC15779K abstractC15779K, AbstractC15779K abstractC15779K2, AbstractC15779K abstractC15779K3, AbstractC15779K abstractC15779K4, InterfaceC16606c.a aVar, EnumC15908e enumC15908e, Bitmap.Config config, Boolean bool, Boolean bool2, EnumC15663b enumC15663b, EnumC15663b enumC15663b2, EnumC15663b enumC15663b3) {
        this.lifecycle = abstractC6165l;
        this.sizeResolver = interfaceC15913j;
        this.scale = enumC15911h;
        this.interceptorDispatcher = abstractC15779K;
        this.fetcherDispatcher = abstractC15779K2;
        this.decoderDispatcher = abstractC15779K3;
        this.transformationDispatcher = abstractC15779K4;
        this.transitionFactory = aVar;
        this.precision = enumC15908e;
        this.bitmapConfig = config;
        this.allowHardware = bool;
        this.allowRgb565 = bool2;
        this.memoryCachePolicy = enumC15663b;
        this.diskCachePolicy = enumC15663b2;
        this.networkCachePolicy = enumC15663b3;
    }
}
