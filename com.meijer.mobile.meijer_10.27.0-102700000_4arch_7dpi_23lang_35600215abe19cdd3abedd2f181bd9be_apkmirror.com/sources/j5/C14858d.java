package j5;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c5.C6363i;
import c5.EnumC6361g;
import com.google.android.gms.common.api.a;
import g5.C14198a;
import g5.InterfaceC14199b;
import j5.InterfaceC14857c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import l5.C15372h;
import l5.C15376l;
import l5.C15379o;
import l5.C15380p;
import m5.AbstractC15553c;
import m5.C15552b;
import m5.EnumC15558h;
import m5.Size;
import o5.InterfaceC15996a;
import q5.C16449a;
import q5.C16457i;
import q5.C16458j;
import q5.InterfaceC16467s;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001\u001eB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010 \u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b \u0010\u0016J'\u0010#\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J-\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010-R\u0018\u00100\u001a\u00020\u0014*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00103\u001a\u0004\u0018\u000101*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u00102¨\u00064"}, d2 = {"Lj5/d;", "", "LZ4/h;", "imageLoader", "Ll5/o;", "requestService", "Lq5/s;", "logger", "<init>", "(LZ4/h;Ll5/o;Lq5/s;)V", "Ll5/h;", "request", "Lj5/c$b;", "cacheKey", "Lj5/c$c;", "cacheValue", "Lm5/i;", "size", "Lm5/h;", "scale", "", "e", "(Ll5/h;Lj5/c$b;Lj5/c$c;Lm5/i;Lm5/h;)Z", "mappedData", "Ll5/l;", "options", "LZ4/c;", "eventListener", "f", "(Ll5/h;Ljava/lang/Object;Ll5/l;LZ4/c;)Lj5/c$b;", "a", "(Ll5/h;Lj5/c$b;Lm5/i;Lm5/h;)Lj5/c$c;", "c", "Lg5/a$b;", "result", "h", "(Lj5/c$b;Ll5/h;Lg5/a$b;)Z", "Lg5/b$a;", "chain", "Ll5/p;", "g", "(Lg5/b$a;Ll5/h;Lj5/c$b;Lj5/c$c;)Ll5/p;", "LZ4/h;", "b", "Ll5/o;", "Lq5/s;", "d", "(Lj5/c$c;)Z", "isSampled", "", "(Lj5/c$c;)Ljava/lang/String;", "diskCacheKey", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j5.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14858d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Z4.h imageLoader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15379o requestService;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16467s logger;

    private final boolean e(C15372h request, InterfaceC14857c.Key cacheKey, InterfaceC14857c.Value cacheValue, Size size, EnumC15558h scale) {
        double d10;
        String str;
        boolean zD = d(cacheValue);
        if (C15552b.a(size)) {
            if (!zD) {
                return true;
            }
            InterfaceC16467s interfaceC16467s = this.logger;
            if (interfaceC16467s != null && interfaceC16467s.getLevel() <= 3) {
                interfaceC16467s.a("MemoryCacheService", 3, request.getData() + ": Requested original size, but cached image is sampled.", null);
            }
            return false;
        }
        String str2 = cacheKey.c().get("coil#transformation_size");
        if (str2 != null) {
            return Intrinsics.e(str2, size.toString());
        }
        int width = cacheValue.getBitmap().getWidth();
        int height = cacheValue.getBitmap().getHeight();
        AbstractC15553c width2 = size.getWidth();
        boolean z10 = width2 instanceof AbstractC15553c.a;
        int i10 = a.e.API_PRIORITY_OTHER;
        int i11 = z10 ? ((AbstractC15553c.a) width2).px : Integer.MAX_VALUE;
        AbstractC15553c height2 = size.getHeight();
        if (height2 instanceof AbstractC15553c.a) {
            i10 = ((AbstractC15553c.a) height2).px;
        }
        double dC = C6363i.c(width, height, i11, i10, scale);
        boolean zA = C16457i.a(request);
        if (!zA) {
            d10 = 1.0d;
            str = "MemoryCacheService";
            if ((!C16458j.t(i11) && Math.abs(i11 - width) > 1) || (!C16458j.t(i10) && Math.abs(i10 - height) > 1)) {
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
            InterfaceC16467s interfaceC16467s2 = this.logger;
            if (interfaceC16467s2 != null && interfaceC16467s2.getLevel() <= 3) {
                interfaceC16467s2.a(str, 3, request.getData() + ": Cached image's request size (" + width + ", " + height + ") does not exactly match the requested size (" + size.getWidth() + ", " + size.getHeight() + ", " + scale + ").", null);
            }
            return false;
        }
        String str3 = str;
        if (dC > d10 && zD) {
            InterfaceC16467s interfaceC16467s3 = this.logger;
            if (interfaceC16467s3 != null && interfaceC16467s3.getLevel() <= 3) {
                interfaceC16467s3.a(str3, 3, request.getData() + ": Cached image's request size (" + width + ", " + height + ") is smaller than the requested size (" + size.getWidth() + ", " + size.getHeight() + ", " + scale + ").", null);
            }
            return false;
        }
        return true;
    }

    public final boolean c(C15372h request, InterfaceC14857c.Key cacheKey, InterfaceC14857c.Value cacheValue, Size size, EnumC15558h scale) {
        if (this.requestService.c(request, C16449a.c(cacheValue.getBitmap()))) {
            return e(request, cacheKey, cacheValue, size, scale);
        }
        InterfaceC16467s interfaceC16467s = this.logger;
        if (interfaceC16467s == null || interfaceC16467s.getLevel() > 3) {
            return false;
        }
        interfaceC16467s.a("MemoryCacheService", 3, request.getData() + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
        return false;
    }

    public final C15380p g(InterfaceC14199b.a chain, C15372h request, InterfaceC14857c.Key cacheKey, InterfaceC14857c.Value cacheValue) {
        return new C15380p(new BitmapDrawable(request.getContext().getResources(), cacheValue.getBitmap()), request, EnumC6361g.f61478a, cacheKey, b(cacheValue), d(cacheValue), C16458j.u(chain));
    }

    public C14858d(Z4.h hVar, C15379o c15379o, InterfaceC16467s interfaceC16467s) {
        this.imageLoader = hVar;
        this.requestService = c15379o;
        this.logger = interfaceC16467s;
    }

    private final String b(InterfaceC14857c.Value value) {
        Object obj = value.b().get("coil#disk_cache_key");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    private final boolean d(InterfaceC14857c.Value value) {
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

    public final InterfaceC14857c.Value a(C15372h request, InterfaceC14857c.Key cacheKey, Size size, EnumC15558h scale) {
        InterfaceC14857c.Value valueB;
        if (!request.getMemoryCachePolicy().getReadEnabled()) {
            return null;
        }
        InterfaceC14857c interfaceC14857cE = this.imageLoader.e();
        if (interfaceC14857cE != null) {
            valueB = interfaceC14857cE.b(cacheKey);
        } else {
            valueB = null;
        }
        if (valueB == null || !c(request, cacheKey, valueB, size, scale)) {
            return null;
        }
        return valueB;
    }

    public final InterfaceC14857c.Key f(C15372h request, Object mappedData, C15376l options, Z4.c eventListener) {
        InterfaceC14857c.Key memoryCacheKey = request.getMemoryCacheKey();
        if (memoryCacheKey != null) {
            return memoryCacheKey;
        }
        eventListener.n(request, mappedData);
        String strF = this.imageLoader.getComponents().f(mappedData, options);
        eventListener.f(request, strF);
        if (strF == null) {
            return null;
        }
        List<InterfaceC15996a> listO = request.O();
        Map<String, String> mapF = request.getParameters().f();
        if (listO.isEmpty() && mapF.isEmpty()) {
            return new InterfaceC14857c.Key(strF, null, 2, null);
        }
        Map mapD = MapsKt.D(mapF);
        if (!listO.isEmpty()) {
            List<InterfaceC15996a> listO2 = request.O();
            int size = listO2.size();
            for (int i10 = 0; i10 < size; i10++) {
                mapD.put("coil#transformation_" + i10, listO2.get(i10).a());
            }
            mapD.put("coil#transformation_size", options.getSize().toString());
        }
        return new InterfaceC14857c.Key(strF, mapD);
    }

    public final boolean h(InterfaceC14857c.Key cacheKey, C15372h request, C14198a.b result) {
        InterfaceC14857c interfaceC14857cE;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (request.getMemoryCachePolicy().getWriteEnabled() && (interfaceC14857cE = this.imageLoader.e()) != null && cacheKey != null) {
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
                interfaceC14857cE.d(cacheKey, new InterfaceC14857c.Value(bitmap, linkedHashMap));
                return true;
            }
        }
        return false;
    }
}
