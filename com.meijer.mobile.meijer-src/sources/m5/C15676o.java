package m5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.AbstractC6165l;
import coil.request.NullRequestDataException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C0;
import n5.AbstractC15906c;
import n5.EnumC15911h;
import n5.Size;
import o5.InterfaceC16073c;
import o5.InterfaceC16074d;
import r5.C16837a;
import r5.C16842f;
import r5.C16845i;
import r5.C16846j;
import r5.ComponentCallbacks2C16857u;
import r5.InterfaceC16851o;
import r5.InterfaceC16855s;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u001d\u0010\"\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010(\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010-¨\u0006/"}, d2 = {"Lm5/o;", "", "La5/h;", "imageLoader", "Lr5/u;", "systemCallbacks", "Lr5/s;", "logger", "<init>", "(La5/h;Lr5/u;Lr5/s;)V", "Lm5/l;", "options", "", "b", "(Lm5/l;)Z", "Lm5/h;", "request", "Ln5/i;", "size", "d", "(Lm5/h;Ln5/i;)Z", "e", "(Lm5/h;)Z", "initialRequest", "Lmv/C0;", "job", "Lm5/n;", "g", "(Lm5/h;Lmv/C0;)Lm5/n;", "", "throwable", "Lm5/f;", "a", "(Lm5/h;Ljava/lang/Throwable;)Lm5/f;", "f", "(Lm5/h;Ln5/i;)Lm5/l;", "Landroid/graphics/Bitmap$Config;", "requestedConfig", "c", "(Lm5/h;Landroid/graphics/Bitmap$Config;)Z", "h", "(Lm5/l;)Lm5/l;", "La5/h;", "Lr5/u;", "Lr5/o;", "Lr5/o;", "hardwareBitmapService", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m5.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15676o {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a5.h imageLoader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ComponentCallbacks2C16857u systemCallbacks;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16851o hardwareBitmapService;

    public final C15667f a(C15669h request, Throwable throwable) {
        Drawable drawableT;
        if (!(throwable instanceof NullRequestDataException) || (drawableT = request.u()) == null) {
            drawableT = request.t();
        }
        return new C15667f(drawableT, request, throwable);
    }

    public C15676o(a5.h hVar, ComponentCallbacks2C16857u componentCallbacks2C16857u, InterfaceC16855s interfaceC16855s) {
        this.imageLoader = hVar;
        this.systemCallbacks = componentCallbacks2C16857u;
        this.hardwareBitmapService = C16842f.a(interfaceC16855s);
    }

    private final boolean b(C15673l options) {
        if (C16837a.d(options.getConfig()) && !this.hardwareBitmapService.getAllowHardware()) {
            return false;
        }
        return true;
    }

    private final boolean d(C15669h request, Size size) {
        if (!C16837a.d(request.getBitmapConfig())) {
            return true;
        }
        if (c(request, request.getBitmapConfig()) && this.hardwareBitmapService.b(size)) {
            return true;
        }
        return false;
    }

    private final boolean e(C15669h request) {
        if (!request.O().isEmpty() && !ArraysKt.Y(C16846j.p(), request.getBitmapConfig())) {
            return false;
        }
        return true;
    }

    public final boolean c(C15669h request, Bitmap.Config requestedConfig) {
        if (!C16837a.d(requestedConfig)) {
            return true;
        }
        if (!request.getAllowHardware()) {
            return false;
        }
        InterfaceC16073c target = request.getTarget();
        if (target instanceof InterfaceC16074d) {
            View view = ((InterfaceC16074d) target).getView();
            if (view.isAttachedToWindow() && !view.isHardwareAccelerated()) {
                return false;
            }
        }
        return true;
    }

    public final C15673l f(C15669h request, Size size) {
        Bitmap.Config bitmapConfig;
        EnumC15911h scale;
        boolean z10;
        if (e(request) && d(request, size)) {
            bitmapConfig = request.getBitmapConfig();
        } else {
            bitmapConfig = Bitmap.Config.ARGB_8888;
        }
        Bitmap.Config config = bitmapConfig;
        AbstractC15906c width = size.getWidth();
        AbstractC15906c.b bVar = AbstractC15906c.b.f152049a;
        if (!Intrinsics.e(width, bVar) && !Intrinsics.e(size.getHeight(), bVar)) {
            scale = request.getScale();
        } else {
            scale = EnumC15911h.f152060b;
        }
        EnumC15911h enumC15911h = scale;
        if (request.getAllowRgb565() && request.O().isEmpty() && config != Bitmap.Config.ALPHA_8) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new C15673l(request.getContext(), config, request.getColorSpace(), size, enumC15911h, C16845i.a(request), z10, request.getPremultipliedAlpha(), request.getDiskCacheKey(), request.getHeaders(), request.getTags(), request.getParameters(), request.getMemoryCachePolicy(), request.getDiskCachePolicy(), request.getNetworkCachePolicy());
    }

    public final InterfaceC15675n g(C15669h initialRequest, C0 job) {
        AbstractC6165l lifecycle = initialRequest.getLifecycle();
        InterfaceC16073c target = initialRequest.getTarget();
        if (target instanceof InterfaceC16074d) {
            return new s(this.imageLoader, initialRequest, (InterfaceC16074d) target, lifecycle, job);
        }
        return new C15662a(lifecycle, job);
    }

    public final C15673l h(C15673l options) {
        boolean z10;
        Bitmap.Config config = options.getConfig();
        EnumC15663b networkCachePolicy = options.getNetworkCachePolicy();
        boolean z11 = true;
        if (!b(options)) {
            config = Bitmap.Config.ARGB_8888;
            z10 = true;
        } else {
            z10 = false;
        }
        Bitmap.Config config2 = config;
        if (options.getNetworkCachePolicy().getReadEnabled() && !this.systemCallbacks.b()) {
            networkCachePolicy = EnumC15663b.f150583f;
        } else {
            z11 = z10;
        }
        EnumC15663b enumC15663b = networkCachePolicy;
        if (!z11) {
            return options;
        }
        return options.a((16381 & 1) != 0 ? options.context : null, (16381 & 2) != 0 ? options.config : config2, (16381 & 4) != 0 ? options.colorSpace : null, (16381 & 8) != 0 ? options.size : null, (16381 & 16) != 0 ? options.scale : null, (16381 & 32) != 0 ? options.allowInexactSize : false, (16381 & 64) != 0 ? options.allowRgb565 : false, (16381 & 128) != 0 ? options.premultipliedAlpha : false, (16381 & 256) != 0 ? options.diskCacheKey : null, (16381 & 512) != 0 ? options.headers : null, (16381 & 1024) != 0 ? options.tags : null, (16381 & RecyclerView.m.FLAG_MOVED) != 0 ? options.parameters : null, (16381 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? options.memoryCachePolicy : null, (16381 & 8192) != 0 ? options.diskCachePolicy : null, (16381 & 16384) != 0 ? options.networkCachePolicy : enumC15663b);
    }
}
