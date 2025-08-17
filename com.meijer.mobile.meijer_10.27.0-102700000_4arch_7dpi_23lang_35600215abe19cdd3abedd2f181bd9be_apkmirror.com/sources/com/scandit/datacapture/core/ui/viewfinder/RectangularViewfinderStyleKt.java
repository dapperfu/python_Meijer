package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"fromNative", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderStyle;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderStyle;", "toNative", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RectangularViewfinderStyleKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RectangularViewfinderStyle.values().length];
            try {
                iArr[RectangularViewfinderStyle.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RectangularViewfinderStyle.ROUNDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NativeRectangularViewfinderStyle.values().length];
            try {
                iArr2[NativeRectangularViewfinderStyle.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[NativeRectangularViewfinderStyle.ROUNDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final RectangularViewfinderStyle fromNative(NativeRectangularViewfinderStyle nativeRectangularViewfinderStyle) {
        Intrinsics.j(nativeRectangularViewfinderStyle, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[nativeRectangularViewfinderStyle.ordinal()];
        if (i10 == 1) {
            return RectangularViewfinderStyle.SQUARE;
        }
        if (i10 == 2) {
            return RectangularViewfinderStyle.ROUNDED;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final NativeRectangularViewfinderStyle toNative(RectangularViewfinderStyle rectangularViewfinderStyle) {
        Intrinsics.j(rectangularViewfinderStyle, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[rectangularViewfinderStyle.ordinal()];
        if (i10 == 1) {
            return NativeRectangularViewfinderStyle.SQUARE;
        }
        if (i10 == 2) {
            return NativeRectangularViewfinderStyle.ROUNDED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
