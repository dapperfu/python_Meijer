package l5;

import android.graphics.Bitmap;
import androidx.view.AbstractC6023l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m5.EnumC15555e;
import m5.EnumC15558h;
import m5.InterfaceC15560j;
import p5.InterfaceC16261c;
import qv.AbstractC16618K;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b$\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00132\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b.\u00101R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b0\u0010/\u001a\u0004\b4\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b$\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b*\u0010>R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b:\u0010?\u001a\u0004\b\"\u0010@R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b,\u0010?\u001a\u0004\b&\u0010@R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b(\u0010A\u001a\u0004\b8\u0010BR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b4\u0010A\u001a\u0004\b2\u0010BR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b6\u0010A\u001a\u0004\b<\u0010B¨\u0006C"}, d2 = {"Ll5/d;", "", "Landroidx/lifecycle/l;", "lifecycle", "Lm5/j;", "sizeResolver", "Lm5/h;", "scale", "Lqv/K;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "Lp5/c$a;", "transitionFactory", "Lm5/e;", "precision", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "", "allowHardware", "allowRgb565", "Ll5/b;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Landroidx/lifecycle/l;Lm5/j;Lm5/h;Lqv/K;Lqv/K;Lqv/K;Lqv/K;Lp5/c$a;Lm5/e;Landroid/graphics/Bitmap$Config;Ljava/lang/Boolean;Ljava/lang/Boolean;Ll5/b;Ll5/b;Ll5/b;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/lifecycle/l;", "h", "()Landroidx/lifecycle/l;", "b", "Lm5/j;", "m", "()Lm5/j;", "c", "Lm5/h;", "l", "()Lm5/h;", "d", "Lqv/K;", "g", "()Lqv/K;", "e", "f", "n", "Lp5/c$a;", "o", "()Lp5/c$a;", "i", "Lm5/e;", "k", "()Lm5/e;", "j", "Landroid/graphics/Bitmap$Config;", "()Landroid/graphics/Bitmap$Config;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ll5/b;", "()Ll5/b;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: l5.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15368d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6023l lifecycle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15560j sizeResolver;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final EnumC15558h scale;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K interceptorDispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K fetcherDispatcher;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K decoderDispatcher;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K transformationDispatcher;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16261c.a transitionFactory;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final EnumC15555e precision;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Bitmap.Config bitmapConfig;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Boolean allowHardware;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Boolean allowRgb565;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final EnumC15366b memoryCachePolicy;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final EnumC15366b diskCachePolicy;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final EnumC15366b networkCachePolicy;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C15368d)) {
            return false;
        }
        C15368d c15368d = (C15368d) other;
        return Intrinsics.e(this.lifecycle, c15368d.lifecycle) && Intrinsics.e(this.sizeResolver, c15368d.sizeResolver) && this.scale == c15368d.scale && Intrinsics.e(this.interceptorDispatcher, c15368d.interceptorDispatcher) && Intrinsics.e(this.fetcherDispatcher, c15368d.fetcherDispatcher) && Intrinsics.e(this.decoderDispatcher, c15368d.decoderDispatcher) && Intrinsics.e(this.transformationDispatcher, c15368d.transformationDispatcher) && Intrinsics.e(this.transitionFactory, c15368d.transitionFactory) && this.precision == c15368d.precision && this.bitmapConfig == c15368d.bitmapConfig && Intrinsics.e(this.allowHardware, c15368d.allowHardware) && Intrinsics.e(this.allowRgb565, c15368d.allowRgb565) && this.memoryCachePolicy == c15368d.memoryCachePolicy && this.diskCachePolicy == c15368d.diskCachePolicy && this.networkCachePolicy == c15368d.networkCachePolicy;
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
    public final AbstractC16618K getDecoderDispatcher() {
        return this.decoderDispatcher;
    }

    /* renamed from: e, reason: from getter */
    public final EnumC15366b getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    /* renamed from: f, reason: from getter */
    public final AbstractC16618K getFetcherDispatcher() {
        return this.fetcherDispatcher;
    }

    /* renamed from: g, reason: from getter */
    public final AbstractC16618K getInterceptorDispatcher() {
        return this.interceptorDispatcher;
    }

    /* renamed from: h, reason: from getter */
    public final AbstractC6023l getLifecycle() {
        return this.lifecycle;
    }

    public int hashCode() {
        AbstractC6023l abstractC6023l = this.lifecycle;
        int iHashCode = (abstractC6023l != null ? abstractC6023l.hashCode() : 0) * 31;
        InterfaceC15560j interfaceC15560j = this.sizeResolver;
        int iHashCode2 = (iHashCode + (interfaceC15560j != null ? interfaceC15560j.hashCode() : 0)) * 31;
        EnumC15558h enumC15558h = this.scale;
        int iHashCode3 = (iHashCode2 + (enumC15558h != null ? enumC15558h.hashCode() : 0)) * 31;
        AbstractC16618K abstractC16618K = this.interceptorDispatcher;
        int iHashCode4 = (iHashCode3 + (abstractC16618K != null ? abstractC16618K.hashCode() : 0)) * 31;
        AbstractC16618K abstractC16618K2 = this.fetcherDispatcher;
        int iHashCode5 = (iHashCode4 + (abstractC16618K2 != null ? abstractC16618K2.hashCode() : 0)) * 31;
        AbstractC16618K abstractC16618K3 = this.decoderDispatcher;
        int iHashCode6 = (iHashCode5 + (abstractC16618K3 != null ? abstractC16618K3.hashCode() : 0)) * 31;
        AbstractC16618K abstractC16618K4 = this.transformationDispatcher;
        int iHashCode7 = (iHashCode6 + (abstractC16618K4 != null ? abstractC16618K4.hashCode() : 0)) * 31;
        InterfaceC16261c.a aVar = this.transitionFactory;
        int iHashCode8 = (iHashCode7 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        EnumC15555e enumC15555e = this.precision;
        int iHashCode9 = (iHashCode8 + (enumC15555e != null ? enumC15555e.hashCode() : 0)) * 31;
        Bitmap.Config config = this.bitmapConfig;
        int iHashCode10 = (iHashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.allowHardware;
        int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.allowRgb565;
        int iHashCode12 = (iHashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        EnumC15366b enumC15366b = this.memoryCachePolicy;
        int iHashCode13 = (iHashCode12 + (enumC15366b != null ? enumC15366b.hashCode() : 0)) * 31;
        EnumC15366b enumC15366b2 = this.diskCachePolicy;
        int iHashCode14 = (iHashCode13 + (enumC15366b2 != null ? enumC15366b2.hashCode() : 0)) * 31;
        EnumC15366b enumC15366b3 = this.networkCachePolicy;
        return iHashCode14 + (enumC15366b3 != null ? enumC15366b3.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final EnumC15366b getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    /* renamed from: j, reason: from getter */
    public final EnumC15366b getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    /* renamed from: k, reason: from getter */
    public final EnumC15555e getPrecision() {
        return this.precision;
    }

    /* renamed from: l, reason: from getter */
    public final EnumC15558h getScale() {
        return this.scale;
    }

    /* renamed from: m, reason: from getter */
    public final InterfaceC15560j getSizeResolver() {
        return this.sizeResolver;
    }

    /* renamed from: n, reason: from getter */
    public final AbstractC16618K getTransformationDispatcher() {
        return this.transformationDispatcher;
    }

    /* renamed from: o, reason: from getter */
    public final InterfaceC16261c.a getTransitionFactory() {
        return this.transitionFactory;
    }

    public C15368d(AbstractC6023l abstractC6023l, InterfaceC15560j interfaceC15560j, EnumC15558h enumC15558h, AbstractC16618K abstractC16618K, AbstractC16618K abstractC16618K2, AbstractC16618K abstractC16618K3, AbstractC16618K abstractC16618K4, InterfaceC16261c.a aVar, EnumC15555e enumC15555e, Bitmap.Config config, Boolean bool, Boolean bool2, EnumC15366b enumC15366b, EnumC15366b enumC15366b2, EnumC15366b enumC15366b3) {
        this.lifecycle = abstractC6023l;
        this.sizeResolver = interfaceC15560j;
        this.scale = enumC15558h;
        this.interceptorDispatcher = abstractC16618K;
        this.fetcherDispatcher = abstractC16618K2;
        this.decoderDispatcher = abstractC16618K3;
        this.transformationDispatcher = abstractC16618K4;
        this.transitionFactory = aVar;
        this.precision = enumC15555e;
        this.bitmapConfig = config;
        this.allowHardware = bool;
        this.allowRgb565 = bool2;
        this.memoryCachePolicy = enumC15366b;
        this.diskCachePolicy = enumC15366b2;
        this.networkCachePolicy = enumC15366b3;
    }
}
