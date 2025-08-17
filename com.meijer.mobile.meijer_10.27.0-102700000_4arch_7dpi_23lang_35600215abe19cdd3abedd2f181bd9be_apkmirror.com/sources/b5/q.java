package b5;

import android.graphics.ColorSpace;
import j5.InterfaceC14857c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l5.C15372h;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"Lb5/p;", "a", "Lb5/p;", "()Lb5/p;", "DefaultModelEqualityDelegate", "coil-compose-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final p f59875a = new a();

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"b5/q$a", "Lb5/p;", "", "self", "other", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "b", "(Ljava/lang/Object;)I", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements p {
        @Override // b5.p
        public boolean c(Object self, Object other) {
            if (self == other) {
                return true;
            }
            if (!(self instanceof C15372h) || !(other instanceof C15372h)) {
                return Intrinsics.e(self, other);
            }
            C15372h c15372h = (C15372h) self;
            C15372h c15372h2 = (C15372h) other;
            return Intrinsics.e(c15372h.getContext(), c15372h2.getContext()) && Intrinsics.e(c15372h.getData(), c15372h2.getData()) && Intrinsics.e(c15372h.getPlaceholderMemoryCacheKey(), c15372h2.getPlaceholderMemoryCacheKey()) && Intrinsics.e(c15372h.getMemoryCacheKey(), c15372h2.getMemoryCacheKey()) && Intrinsics.e(c15372h.getDiskCacheKey(), c15372h2.getDiskCacheKey()) && c15372h.getBitmapConfig() == c15372h2.getBitmapConfig() && Intrinsics.e(c15372h.getColorSpace(), c15372h2.getColorSpace()) && Intrinsics.e(c15372h.O(), c15372h2.O()) && Intrinsics.e(c15372h.getHeaders(), c15372h2.getHeaders()) && c15372h.getAllowConversionToBitmap() == c15372h2.getAllowConversionToBitmap() && c15372h.getAllowHardware() == c15372h2.getAllowHardware() && c15372h.getAllowRgb565() == c15372h2.getAllowRgb565() && c15372h.getPremultipliedAlpha() == c15372h2.getPremultipliedAlpha() && c15372h.getMemoryCachePolicy() == c15372h2.getMemoryCachePolicy() && c15372h.getDiskCachePolicy() == c15372h2.getDiskCachePolicy() && c15372h.getNetworkCachePolicy() == c15372h2.getNetworkCachePolicy() && Intrinsics.e(c15372h.getSizeResolver(), c15372h2.getSizeResolver()) && c15372h.getScale() == c15372h2.getScale() && c15372h.getPrecision() == c15372h2.getPrecision() && Intrinsics.e(c15372h.getParameters(), c15372h2.getParameters());
        }

        @Override // b5.p
        public int b(Object self) {
            if (!(self instanceof C15372h)) {
                if (self != null) {
                    return self.hashCode();
                }
                return 0;
            }
            C15372h c15372h = (C15372h) self;
            int iHashCode = ((c15372h.getContext().hashCode() * 31) + c15372h.getData().hashCode()) * 31;
            InterfaceC14857c.Key placeholderMemoryCacheKey = c15372h.getPlaceholderMemoryCacheKey();
            int iHashCode2 = (iHashCode + (placeholderMemoryCacheKey != null ? placeholderMemoryCacheKey.hashCode() : 0)) * 31;
            InterfaceC14857c.Key memoryCacheKey = c15372h.getMemoryCacheKey();
            int iHashCode3 = (iHashCode2 + (memoryCacheKey != null ? memoryCacheKey.hashCode() : 0)) * 31;
            String diskCacheKey = c15372h.getDiskCacheKey();
            int iHashCode4 = (((iHashCode3 + (diskCacheKey != null ? diskCacheKey.hashCode() : 0)) * 31) + c15372h.getBitmapConfig().hashCode()) * 31;
            ColorSpace colorSpace = c15372h.getColorSpace();
            return ((((((((((((((((((((((((((iHashCode4 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + c15372h.O().hashCode()) * 31) + c15372h.getHeaders().hashCode()) * 31) + Boolean.hashCode(c15372h.getAllowConversionToBitmap())) * 31) + Boolean.hashCode(c15372h.getAllowHardware())) * 31) + Boolean.hashCode(c15372h.getAllowRgb565())) * 31) + Boolean.hashCode(c15372h.getPremultipliedAlpha())) * 31) + c15372h.getMemoryCachePolicy().hashCode()) * 31) + c15372h.getDiskCachePolicy().hashCode()) * 31) + c15372h.getNetworkCachePolicy().hashCode()) * 31) + c15372h.getSizeResolver().hashCode()) * 31) + c15372h.getScale().hashCode()) * 31) + c15372h.getPrecision().hashCode()) * 31) + c15372h.getParameters().hashCode();
        }

        a() {
        }
    }

    public static final p a() {
        return f59875a;
    }
}
