package c5;

import android.graphics.ColorSpace;
import k5.InterfaceC15089c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m5.C15669h;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"Lc5/p;", "a", "Lc5/p;", "()Lc5/p;", "DefaultModelEqualityDelegate", "coil-compose-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final p f61362a = new a();

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"c5/q$a", "Lc5/p;", "", "self", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "b", "(Ljava/lang/Object;)I", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements p {
        @Override // c5.p
        public boolean c(Object self, Object other) {
            if (self == other) {
                return true;
            }
            if (!(self instanceof C15669h) || !(other instanceof C15669h)) {
                return Intrinsics.e(self, other);
            }
            C15669h c15669h = (C15669h) self;
            C15669h c15669h2 = (C15669h) other;
            return Intrinsics.e(c15669h.getContext(), c15669h2.getContext()) && Intrinsics.e(c15669h.getData(), c15669h2.getData()) && Intrinsics.e(c15669h.getPlaceholderMemoryCacheKey(), c15669h2.getPlaceholderMemoryCacheKey()) && Intrinsics.e(c15669h.getMemoryCacheKey(), c15669h2.getMemoryCacheKey()) && Intrinsics.e(c15669h.getDiskCacheKey(), c15669h2.getDiskCacheKey()) && c15669h.getBitmapConfig() == c15669h2.getBitmapConfig() && Intrinsics.e(c15669h.getColorSpace(), c15669h2.getColorSpace()) && Intrinsics.e(c15669h.O(), c15669h2.O()) && Intrinsics.e(c15669h.getHeaders(), c15669h2.getHeaders()) && c15669h.getAllowConversionToBitmap() == c15669h2.getAllowConversionToBitmap() && c15669h.getAllowHardware() == c15669h2.getAllowHardware() && c15669h.getAllowRgb565() == c15669h2.getAllowRgb565() && c15669h.getPremultipliedAlpha() == c15669h2.getPremultipliedAlpha() && c15669h.getMemoryCachePolicy() == c15669h2.getMemoryCachePolicy() && c15669h.getDiskCachePolicy() == c15669h2.getDiskCachePolicy() && c15669h.getNetworkCachePolicy() == c15669h2.getNetworkCachePolicy() && Intrinsics.e(c15669h.getSizeResolver(), c15669h2.getSizeResolver()) && c15669h.getScale() == c15669h2.getScale() && c15669h.getPrecision() == c15669h2.getPrecision() && Intrinsics.e(c15669h.getParameters(), c15669h2.getParameters());
        }

        @Override // c5.p
        public int b(Object self) {
            if (!(self instanceof C15669h)) {
                if (self != null) {
                    return self.hashCode();
                }
                return 0;
            }
            C15669h c15669h = (C15669h) self;
            int iHashCode = ((c15669h.getContext().hashCode() * 31) + c15669h.getData().hashCode()) * 31;
            InterfaceC15089c.Key placeholderMemoryCacheKey = c15669h.getPlaceholderMemoryCacheKey();
            int iHashCode2 = (iHashCode + (placeholderMemoryCacheKey != null ? placeholderMemoryCacheKey.hashCode() : 0)) * 31;
            InterfaceC15089c.Key memoryCacheKey = c15669h.getMemoryCacheKey();
            int iHashCode3 = (iHashCode2 + (memoryCacheKey != null ? memoryCacheKey.hashCode() : 0)) * 31;
            String diskCacheKey = c15669h.getDiskCacheKey();
            int iHashCode4 = (((iHashCode3 + (diskCacheKey != null ? diskCacheKey.hashCode() : 0)) * 31) + c15669h.getBitmapConfig().hashCode()) * 31;
            ColorSpace colorSpace = c15669h.getColorSpace();
            return ((((((((((((((((((((((((((iHashCode4 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + c15669h.O().hashCode()) * 31) + c15669h.getHeaders().hashCode()) * 31) + Boolean.hashCode(c15669h.getAllowConversionToBitmap())) * 31) + Boolean.hashCode(c15669h.getAllowHardware())) * 31) + Boolean.hashCode(c15669h.getAllowRgb565())) * 31) + Boolean.hashCode(c15669h.getPremultipliedAlpha())) * 31) + c15669h.getMemoryCachePolicy().hashCode()) * 31) + c15669h.getDiskCachePolicy().hashCode()) * 31) + c15669h.getNetworkCachePolicy().hashCode()) * 31) + c15669h.getSizeResolver().hashCode()) * 31) + c15669h.getScale().hashCode()) * 31) + c15669h.getPrecision().hashCode()) * 31) + c15669h.getParameters().hashCode();
        }

        a() {
        }
    }

    public static final p a() {
        return f61362a;
    }
}
