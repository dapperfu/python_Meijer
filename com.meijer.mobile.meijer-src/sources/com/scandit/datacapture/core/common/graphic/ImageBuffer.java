package com.scandit.datacapture.core.common.graphic;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer;
import com.scandit.datacapture.core.internal.sdk.common.graphic.ImageBufferFormat;
import com.scandit.datacapture.core.internal.sdk.common.graphic.ImageBufferUtilsKt;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B1\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b¢\u0006\u0004\b\u0004\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00178WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/core/common/graphic/ImageBuffer;", "Lcom/scandit/datacapture/core/common/graphic/ImageBufferProxy;", "Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeImageBuffer;", "impl", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeImageBuffer;)V", "", "width", "height", "Ljava/util/ArrayList;", "Lcom/scandit/datacapture/core/common/graphic/ImagePlane;", "Lkotlin/collections/ArrayList;", "planes", "(IILjava/util/ArrayList;)V", "_impl", "()Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeImageBuffer;", "deepCopy", "()Lcom/scandit/datacapture/core/common/graphic/ImageBuffer;", "Landroid/graphics/Bitmap;", "toBitmap", "()Landroid/graphics/Bitmap;", "getHeight", "()I", "", "getPlanes", "()Ljava/util/List;", "getWidth", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes12.dex */
public final class ImageBuffer implements ImageBufferProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ImageBufferProxyAdapter f125095a;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageBufferFormat.values().length];
            try {
                iArr[ImageBufferFormat.ARGB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageBufferFormat.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImageBuffer(NativeImageBuffer impl) {
        Intrinsics.j(impl, "impl");
        this.f125095a = new ImageBufferProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.core.common.graphic.ImageBufferProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeImageBuffer getF125096a() {
        return this.f125095a.getF125096a();
    }

    @Override // com.scandit.datacapture.core.common.graphic.ImageBufferProxy
    @ProxyFunction(property = "height")
    public int getHeight() {
        return this.f125095a.getHeight();
    }

    @Override // com.scandit.datacapture.core.common.graphic.ImageBufferProxy
    @ProxyFunction(property = "planes")
    public List<ImagePlane> getPlanes() {
        return this.f125095a.getPlanes();
    }

    @Override // com.scandit.datacapture.core.common.graphic.ImageBufferProxy
    @ProxyFunction(property = "width")
    public int getWidth() {
        return this.f125095a.getWidth();
    }

    public final ImageBuffer deepCopy() {
        NativeImageBuffer nativeImageBufferDeepCopy = getF125096a().deepCopy();
        Intrinsics.i(nativeImageBufferDeepCopy, "deepCopy(...)");
        return new ImageBuffer(nativeImageBufferDeepCopy);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ImageBuffer(int i10, int i11, ArrayList<ImagePlane> planes) {
        Intrinsics.j(planes, "planes");
        NativeImageBuffer nativeImageBufferCreate = NativeImageBuffer.create(i10, i11, planes);
        Intrinsics.i(nativeImageBufferCreate, "create(...)");
        this(nativeImageBufferCreate);
    }

    public final Bitmap toBitmap() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ImageBufferUtilsKt.getFormat(getF125096a()).ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                YuvImage yuvImage = new YuvImage(getF125096a().toBitmap(), 17, getWidth(), getHeight(), null);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                yuvImage.compressToJpeg(new Rect(0, 0, getWidth(), getHeight()), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                Intrinsics.i(bitmapDecodeByteArray, "decodeByteArray(...)");
                return bitmapDecodeByteArray;
            }
            throw new NoWhenBranchMatchedException();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.i(bitmapCreateBitmap, "createBitmap(...)");
        bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(getF125096a().toBitmap()));
        return bitmapCreateBitmap;
    }
}
