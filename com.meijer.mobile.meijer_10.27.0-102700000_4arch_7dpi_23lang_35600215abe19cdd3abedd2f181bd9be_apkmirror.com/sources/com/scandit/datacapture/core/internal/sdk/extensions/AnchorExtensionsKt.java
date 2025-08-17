package com.scandit.datacapture.core.internal.sdk.extensions;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u0015\u0010\t\u001a\u00020\u0006*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/core/common/geometry/Anchor;", "", "toGravity", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)I", "rotate90DegreesCounterClockwise", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)Lcom/scandit/datacapture/core/common/geometry/Anchor;", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "getDefaultOffset", "(Lcom/scandit/datacapture/core/common/geometry/Anchor;)Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "defaultOffset", "scandit-capture-core"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class AnchorExtensionsKt {

    /* renamed from: a, reason: collision with root package name */
    private static final FloatWithUnit f125455a;

    /* renamed from: b, reason: collision with root package name */
    private static final FloatWithUnit f125456b;

    /* renamed from: c, reason: collision with root package name */
    private static final FloatWithUnit f125457c;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Anchor.values().length];
            try {
                iArr[Anchor.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Anchor.TOP_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Anchor.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Anchor.CENTER_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Anchor.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Anchor.CENTER_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Anchor.BOTTOM_LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Anchor.BOTTOM_CENTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Anchor.BOTTOM_RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        MeasureUnit measureUnit = MeasureUnit.DIP;
        f125455a = new FloatWithUnit(16.0f, measureUnit);
        f125456b = new FloatWithUnit(24.0f, measureUnit);
        f125457c = new FloatWithUnit(54.0f, measureUnit);
    }

    public static final PointWithUnit getDefaultOffset(Anchor anchor) {
        Intrinsics.j(anchor, "<this>");
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i10 = iArr[anchor.ordinal()];
        FloatWithUnit floatWithUnit = (i10 == 2 || i10 == 5 || i10 == 8) ? new FloatWithUnit(0.0f, MeasureUnit.PIXEL) : f125455a;
        int i11 = iArr[anchor.ordinal()];
        return new PointWithUnit(floatWithUnit, (i11 == 1 || i11 == 2 || i11 == 3) ? f125456b : (i11 == 7 || i11 == 8 || i11 == 9) ? f125457c : new FloatWithUnit(0.0f, MeasureUnit.PIXEL));
    }

    public static final Anchor rotate90DegreesCounterClockwise(Anchor anchor) {
        Intrinsics.j(anchor, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[anchor.ordinal()]) {
            case 1:
                return Anchor.BOTTOM_LEFT;
            case 2:
                return Anchor.CENTER_LEFT;
            case 3:
                return Anchor.TOP_LEFT;
            case 4:
                return Anchor.BOTTOM_CENTER;
            case 5:
                return Anchor.CENTER;
            case 6:
                return Anchor.TOP_CENTER;
            case 7:
                return Anchor.BOTTOM_RIGHT;
            case 8:
                return Anchor.CENTER_RIGHT;
            case 9:
                return Anchor.TOP_RIGHT;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int toGravity(Anchor anchor) {
        Intrinsics.j(anchor, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[anchor.ordinal()]) {
            case 1:
                return 8388659;
            case 2:
                return 49;
            case 3:
                return 8388661;
            case 4:
                return 8388627;
            case 5:
                return 17;
            case 6:
                return 8388629;
            case 7:
                return 8388691;
            case 8:
                return 81;
            case 9:
                return 8388693;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
