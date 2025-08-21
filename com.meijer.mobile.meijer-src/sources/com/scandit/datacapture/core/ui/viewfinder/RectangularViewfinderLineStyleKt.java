package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderLineStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"fromNative", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderLineStyle;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderLineStyle;", "toNative", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RectangularViewfinderLineStyleKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RectangularViewfinderLineStyle.values().length];
            try {
                iArr[RectangularViewfinderLineStyle.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RectangularViewfinderLineStyle.BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NativeRectangularViewfinderLineStyle.values().length];
            try {
                iArr2[NativeRectangularViewfinderLineStyle.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[NativeRectangularViewfinderLineStyle.BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final RectangularViewfinderLineStyle fromNative(NativeRectangularViewfinderLineStyle nativeRectangularViewfinderLineStyle) {
        Intrinsics.j(nativeRectangularViewfinderLineStyle, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$1[nativeRectangularViewfinderLineStyle.ordinal()];
        if (i10 == 1) {
            return RectangularViewfinderLineStyle.LIGHT;
        }
        if (i10 == 2) {
            return RectangularViewfinderLineStyle.BOLD;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final NativeRectangularViewfinderLineStyle toNative(RectangularViewfinderLineStyle rectangularViewfinderLineStyle) {
        Intrinsics.j(rectangularViewfinderLineStyle, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[rectangularViewfinderLineStyle.ordinal()];
        if (i10 == 1) {
            return NativeRectangularViewfinderLineStyle.LIGHT;
        }
        if (i10 == 2) {
            return NativeRectangularViewfinderLineStyle.BOLD;
        }
        throw new NoWhenBranchMatchedException();
    }
}
