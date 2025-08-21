package k5;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.api.a;
import d5.C13625i;
import d5.EnumC13623g;
import h5.C14467a;
import h5.InterfaceC14468b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k5.InterfaceC15089c;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import m5.C15669h;
import m5.C15673l;
import m5.C15676o;
import m5.C15677p;
import n5.AbstractC15906c;
import n5.C15905b;
import n5.EnumC15911h;
import n5.Size;
import p5.InterfaceC16405a;
import r5.C16837a;
import r5.C16845i;
import r5.C16846j;
import r5.InterfaceC16855s;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001\u001eB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010 \u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b \u0010\u0016J'\u0010#\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J-\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010-R\u0018\u00100\u001a\u00020\u0014*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00103\u001a\u0004\u0018\u000101*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u00102¨\u00064"}, d2 = {"Lk5/d;", "", "La5/h;", "imageLoader", "Lm5/o;", "requestService", "Lr5/s;", "logger", "<init>", "(La5/h;Lm5/o;Lr5/s;)V", "Lm5/h;", "request", "Lk5/c$b;", "cacheKey", "Lk5/c$c;", "cacheValue", "Ln5/i;", "size", "Ln5/h;", "scale", "", "e", "(Lm5/h;Lk5/c$b;Lk5/c$c;Ln5/i;Ln5/h;)Z", "mappedData", "Lm5/l;", "options", "La5/c;", "eventListener", "f", "(Lm5/h;Ljava/lang/Object;Lm5/l;La5/c;)Lk5/c$b;", "a", "(Lm5/h;Lk5/c$b;Ln5/i;Ln5/h;)Lk5/c$c;", "c", "Lh5/a$b;", "result", "h", "(Lk5/c$b;Lm5/h;Lh5/a$b;)Z", "Lh5/b$a;", "chain", "Lm5/p;", "g", "(Lh5/b$a;Lm5/h;Lk5/c$b;Lk5/c$c;)Lm5/p;", "La5/h;", "b", "Lm5/o;", "Lr5/s;", "d", "(Lk5/c$c;)Z", "isSampled", "", "(Lk5/c$c;)Ljava/lang/String;", "diskCacheKey", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: k5.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15090d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a5.h imageLoader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15676o requestService;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16855s logger;

    private final boolean e(C15669h request, InterfaceC15089c.Key cacheKey, InterfaceC15089c.Value cacheValue, Size size, EnumC15911h scale) {
        double d10;
        String str;
        boolean zD = d(cacheValue);
        if (C15905b.a(size)) {
            if (!zD) {
                return true;
            }
            InterfaceC16855s interfaceC16855s = this.logger;
            if (interfaceC16855s != null && interfaceC16855s.getLevel() <= 3) {
                interfaceC16855s.a("MemoryCacheService", 3, request.getData() + ": Requested original size, but cached image is sampled.", null);
            }
            return false;
        }
        String str2 = cacheKey.c().get("coil#transformation_size");
        if (str2 != null) {
            return Intrinsics.e(str2, size.toString());
        }
        int width = cacheValue.getBitmap().getWidth();
        int height = cacheValue.getBitmap().getHeight();
        AbstractC15906c width2 = size.getWidth();
        boolean z10 = width2 instanceof AbstractC15906c.a;
        int i10 = a.e.API_PRIORITY_OTHER;
        int i11 = z10 ? ((AbstractC15906c.a) width2).px : Integer.MAX_VALUE;
        AbstractC15906c height2 = size.getHeight();
        if (height2 instanceof AbstractC15906c.a) {
            i10 = ((AbstractC15906c.a) height2).px;
        }
        double dC = C13625i.c(width, height, i11, i10, scale);
        boolean zA = C16845i.a(request);
        if (!zA) {
            d10 = 1.0d;
            str = "MemoryCacheService";
            if ((!C16846j.t(i11) && Math.abs(i11 - width) > 1) || (!C16846j.t(i10) && Math.abs(i10 - height) > 1)) {
            }
            return true;
        }
        double dI = RangesKt.i(dC, 1.0d);
        d10 = 1.0d;
        str = "MemoryCacheService";
        if (Math.abs(i11 - (width * dI)) <= 1.0d || Math.abs(i10 - (dI * height)) <= 1.0d) {
            return true;
        }
        if (dC != d10 && !zA) {
            InterfaceC16855s interfaceC16855s2 = this.logger;
            if (interfaceC16855s2 != null && interfaceC16855s2.getLevel() <= 3) {
                interfaceC16855s2.a(str, 3, request.getData() + ": Cached image's request size (" + width + ", " + height + ") does not exactly match the requested size (" + size.getWidth() + ", " + size.getHeight() + ", " + scale + ").", null);
            }
            return false;
        }
        String str3 = str;
        if (dC > d10 && zD) {
            InterfaceC16855s interfaceC16855s3 = this.logger;
            if (interfaceC16855s3 != null && interfaceC16855s3.getLevel() <= 3) {
                interfaceC16855s3.a(str3, 3, request.getData() + ": Cached image's request size (" + width + ", " + height + ") is smaller than the requested size (" + size.getWidth() + ", " + size.getHeight() + ", " + scale + ").", null);
            }
            return false;
        }
        return true;
    }

    public final boolean c(C15669h request, InterfaceC15089c.Key cacheKey, InterfaceC15089c.Value cacheValue, Size size, EnumC15911h scale) {
        if (this.requestService.c(request, C16837a.c(cacheValue.getBitmap()))) {
            return e(request, cacheKey, cacheValue, size, scale);
        }
        InterfaceC16855s interfaceC16855s = this.logger;
        if (interfaceC16855s == null || interfaceC16855s.getLevel() > 3) {
            return false;
        }
        interfaceC16855s.a("MemoryCacheService", 3, request.getData() + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
        return false;
    }

    public final C15677p g(InterfaceC14468b.a chain, C15669h request, InterfaceC15089c.Key cacheKey, InterfaceC15089c.Value cacheValue) {
        return new C15677p(new BitmapDrawable(request.getContext().getResources(), cacheValue.getBitmap()), request, EnumC13623g.f128045a, cacheKey, b(cacheValue), d(cacheValue), C16846j.u(chain));
    }

    public C15090d(a5.h hVar, C15676o c15676o, InterfaceC16855s interfaceC16855s) {
        this.imageLoader = hVar;
        this.requestService = c15676o;
        this.logger = interfaceC16855s;
    }

    private final String b(InterfaceC15089c.Value value) {
        Object obj = value.b().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final boolean d(InterfaceC15089c.Value value) {
        Boolean bool;
        Object obj = value.b().get("coil#is_sampled");
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final InterfaceC15089c.Value a(C15669h request, InterfaceC15089c.Key cacheKey, Size size, EnumC15911h scale) {
        InterfaceC15089c.Value valueC;
        if (!request.getMemoryCachePolicy().getReadEnabled()) {
            return null;
        }
        InterfaceC15089c interfaceC15089cE = this.imageLoader.e();
        if (interfaceC15089cE != null) {
            valueC = interfaceC15089cE.c(cacheKey);
        } else {
            valueC = null;
        }
        if (valueC == null || !c(request, cacheKey, valueC, size, scale)) {
            return null;
        }
        return valueC;
    }

    public final InterfaceC15089c.Key f(C15669h request, Object mappedData, C15673l options, a5.c eventListener) {
        InterfaceC15089c.Key memoryCacheKey = request.getMemoryCacheKey();
        if (memoryCacheKey != null) {
            return memoryCacheKey;
        }
        eventListener.g(request, mappedData);
        String strF = this.imageLoader.getComponents().f(mappedData, options);
        eventListener.k(request, strF);
        if (strF == null) {
            return null;
        }
        List<InterfaceC16405a> listO = request.O();
        Map<String, String> mapF = request.getParameters().f();
        if (listO.isEmpty() && mapF.isEmpty()) {
            return new InterfaceC15089c.Key(strF, null, 2, null);
        }
        Map mapD = MapsKt.D(mapF);
        if (!listO.isEmpty()) {
            List<InterfaceC16405a> listO2 = request.O();
            int size = listO2.size();
            for (int i10 = 0; i10 < size; i10++) {
                mapD.put("coil#transformation_" + i10, listO2.get(i10).a());
            }
            mapD.put("coil#transformation_size", options.getSize().toString());
        }
        return new InterfaceC15089c.Key(strF, mapD);
    }

    public final boolean h(InterfaceC15089c.Key cacheKey, C15669h request, C14467a.b result) {
        InterfaceC15089c interfaceC15089cE;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (request.getMemoryCachePolicy().getWriteEnabled() && (interfaceC15089cE = this.imageLoader.e()) != null && cacheKey != null) {
            Drawable drawable = result.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                bitmapDrawable = (BitmapDrawable) drawable;
            } else {
                bitmapDrawable = null;
            }
            if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("coil#is_sampled", Boolean.valueOf(result.getIsSampled()));
                String diskCacheKey = result.getDiskCacheKey();
                if (diskCacheKey != null) {
                    linkedHashMap.put("coil#disk_cache_key", diskCacheKey);
                }
                interfaceC15089cE.d(cacheKey, new InterfaceC15089c.Value(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }
}
