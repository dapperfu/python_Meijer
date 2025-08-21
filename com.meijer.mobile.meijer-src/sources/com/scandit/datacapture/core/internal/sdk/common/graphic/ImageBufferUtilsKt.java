package com.scandit.datacapture.core.internal.sdk.common.graphic;

import com.scandit.datacapture.core.common.graphic.Channel;
import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeImageBuffer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"format", "Lcom/scandit/datacapture/core/internal/sdk/common/graphic/ImageBufferFormat;", "Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeImageBuffer;", "getFormat$annotations", "(Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeImageBuffer;)V", "getFormat", "(Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeImageBuffer;)Lcom/scandit/datacapture/core/internal/sdk/common/graphic/ImageBufferFormat;", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ImageBufferUtilsKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Channel.values().length];
            try {
                iArr[Channel.A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Channel.R.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Channel.G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Channel.B.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Channel.Y.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Channel.U.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Channel.V.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Channel.D.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getFormat$annotations(NativeImageBuffer nativeImageBuffer) {
    }

    public static final ImageBufferFormat getFormat(NativeImageBuffer nativeImageBuffer) {
        Intrinsics.j(nativeImageBuffer, "<this>");
        Channel channel = nativeImageBuffer.getPlanes().get(0).getChannel();
        switch (channel == null ? -1 : WhenMappings.$EnumSwitchMapping$0[channel.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return ImageBufferFormat.ARGB;
            case 5:
            case 6:
            case 7:
            case 8:
                return ImageBufferFormat.YUV;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
