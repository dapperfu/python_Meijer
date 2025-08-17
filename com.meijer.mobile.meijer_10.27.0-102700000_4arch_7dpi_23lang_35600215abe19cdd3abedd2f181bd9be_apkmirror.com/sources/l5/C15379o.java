package l5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.AbstractC6023l;
import coil.request.NullRequestDataException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.AbstractC15553c;
import m5.EnumC15558h;
import m5.Size;
import n5.InterfaceC15779c;
import n5.InterfaceC15780d;
import q5.C16449a;
import q5.C16454f;
import q5.C16457i;
import q5.C16458j;
import q5.ComponentCallbacks2C16469u;
import q5.InterfaceC16463o;
import q5.InterfaceC16467s;
import qv.C0;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010-¨\u0006/"}, d2 = {"Ll5/o;", "", "LZ4/h;", "imageLoader", "Lq5/u;", "systemCallbacks", "Lq5/s;", "logger", "<init>", "(LZ4/h;Lq5/u;Lq5/s;)V", "Ll5/l;", "options", "", "b", "(Ll5/l;)Z", "Ll5/h;", "request", "Lm5/i;", "size", "d", "(Ll5/h;Lm5/i;)Z", "e", "(Ll5/h;)Z", "initialRequest", "Lqv/C0;", "job", "Ll5/n;", "g", "(Ll5/h;Lqv/C0;)Ll5/n;", "", "throwable", "Ll5/f;", "a", "(Ll5/h;Ljava/lang/Throwable;)Ll5/f;", "f", "(Ll5/h;Lm5/i;)Ll5/l;", "Landroid/graphics/Bitmap$Config;", "requestedConfig", "c", "(Ll5/h;Landroid/graphics/Bitmap$Config;)Z", "h", "(Ll5/l;)Ll5/l;", "LZ4/h;", "Lq5/u;", "Lq5/o;", "Lq5/o;", "hardwareBitmapService", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: l5.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15379o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Z4.h imageLoader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ComponentCallbacks2C16469u systemCallbacks;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16463o hardwareBitmapService;

    public final C15370f a(C15372h request, Throwable throwable) {
        Drawable drawableT;
        if (!(throwable instanceof NullRequestDataException) || (drawableT = request.u()) == null) {
            drawableT = request.t();
        }
        return new C15370f(drawableT, request, throwable);
    }

    public C15379o(Z4.h hVar, ComponentCallbacks2C16469u componentCallbacks2C16469u, InterfaceC16467s interfaceC16467s) {
        this.imageLoader = hVar;
        this.systemCallbacks = componentCallbacks2C16469u;
        this.hardwareBitmapService = C16454f.a(interfaceC16467s);
    }

    private final boolean b(C15376l options) {
        if (C16449a.d(options.getConfig()) && !this.hardwareBitmapService.getAllowHardware()) {
            return false;
        }
        return true;
    }

    private final boolean d(C15372h request, Size size) {
        if (!C16449a.d(request.getBitmapConfig())) {
            return true;
        }
        if (c(request, request.getBitmapConfig()) && this.hardwareBitmapService.b(size)) {
            return true;
        }
        return false;
    }

    private final boolean e(C15372h request) {
        if (!request.O().isEmpty() && !ArraysKt.Y(C16458j.p(), request.getBitmapConfig())) {
            return false;
        }
        return true;
    }

    public final boolean c(C15372h request, Bitmap.Config requestedConfig) {
        if (!C16449a.d(requestedConfig)) {
            return true;
        }
        if (!request.getAllowHardware()) {
            return false;
        }
        InterfaceC15779c target = request.getTarget();
        if (target instanceof InterfaceC15780d) {
            View view = ((InterfaceC15780d) target).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    public final C15376l f(C15372h request, Size size) {
        Bitmap.Config bitmapConfig;
        EnumC15558h scale;
        boolean z10;
        if (e(request) && d(request, size)) {
            bitmapConfig = request.getBitmapConfig();
        } else {
            bitmapConfig = Bitmap.Config.ARGB_8888;
        }
        Bitmap.Config config = bitmapConfig;
        AbstractC15553c width = size.getWidth();
        AbstractC15553c.b bVar = AbstractC15553c.b.f149837a;
        if (!Intrinsics.e(width, bVar) && !Intrinsics.e(size.getHeight(), bVar)) {
            scale = request.getScale();
        } else {
            scale = EnumC15558h.f149848b;
        }
        EnumC15558h enumC15558h = scale;
        if (request.getAllowRgb565() && request.O().isEmpty() && config != Bitmap.Config.ALPHA_8) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new C15376l(request.getContext(), config, request.getColorSpace(), size, enumC15558h, C16457i.a(request), z10, request.getPremultipliedAlpha(), request.getDiskCacheKey(), request.getHeaders(), request.getTags(), request.getParameters(), request.getMemoryCachePolicy(), request.getDiskCachePolicy(), request.getNetworkCachePolicy());
    }

    public final InterfaceC15378n g(C15372h initialRequest, C0 job) {
        AbstractC6023l lifecycle = initialRequest.getLifecycle();
        InterfaceC15779c target = initialRequest.getTarget();
        if (target instanceof InterfaceC15780d) {
            return new s(this.imageLoader, initialRequest, (InterfaceC15780d) target, lifecycle, job);
        }
        return new C15365a(lifecycle, job);
    }

    public final C15376l h(C15376l options) {
        boolean z10;
        Bitmap.Config config = options.getConfig();
        EnumC15366b networkCachePolicy = options.getNetworkCachePolicy();
        boolean z11 = true;
        if (!b(options)) {
            config = Bitmap.Config.ARGB_8888;
            z10 = true;
        } else {
            z10 = false;
        }
        Bitmap.Config config2 = config;
        if (options.getNetworkCachePolicy().getReadEnabled() && !this.systemCallbacks.b()) {
            networkCachePolicy = EnumC15366b.f148513f;
        } else {
            z11 = z10;
        }
        EnumC15366b enumC15366b = networkCachePolicy;
        if (!z11) {
            return options;
        }
        return options.a((16381 & 1) != 0 ? options.context : null, (16381 & 2) != 0 ? options.config : config2, (16381 & 4) != 0 ? options.colorSpace : null, (16381 & 8) != 0 ? options.size : null, (16381 & 16) != 0 ? options.scale : null, (16381 & 32) != 0 ? options.allowInexactSize : false, (16381 & 64) != 0 ? options.allowRgb565 : false, (16381 & 128) != 0 ? options.premultipliedAlpha : false, (16381 & 256) != 0 ? options.diskCacheKey : null, (16381 & 512) != 0 ? options.headers : null, (16381 & 1024) != 0 ? options.tags : null, (16381 & RecyclerView.m.FLAG_MOVED) != 0 ? options.parameters : null, (16381 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? options.memoryCachePolicy : null, (16381 & 8192) != 0 ? options.diskCachePolicy : null, (16381 & 16384) != 0 ? options.networkCachePolicy : enumC15366b);
    }
}
