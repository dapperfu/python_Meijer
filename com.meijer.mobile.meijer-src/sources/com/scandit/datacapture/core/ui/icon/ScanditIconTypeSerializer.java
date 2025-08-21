package com.scandit.datacapture.core.ui.icon;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/ui/icon/ScanditIconTypeSerializer;", "", "Lcom/scandit/datacapture/core/ui/icon/ScanditIconType;", "iconType", "", "toJson", "(Lcom/scandit/datacapture/core/ui/icon/ScanditIconType;)Ljava/lang/String;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class ScanditIconTypeSerializer {
    public static final ScanditIconTypeSerializer INSTANCE = new ScanditIconTypeSerializer();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScanditIconType.values().length];
            try {
                iArr[ScanditIconType.TO_PICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScanditIconType.CHECKMARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScanditIconType.X_MARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScanditIconType.QUESTION_MARK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ScanditIconType.EXCLAMATION_MARK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ScanditIconType.WRONG_ITEM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ScanditIconType.LOW_STOCK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ScanditIconType.INSPECT_ITEM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ScanditIconType.EXPIRED_ITEM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ScanditIconType.FRAGILE_ITEM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ScanditIconType.STAR_FILLED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ScanditIconType.STAR_HALF_FILLED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ScanditIconType.STAR_OUTLINED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ScanditIconType.ARROW_RIGHT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ScanditIconType.ARROW_LEFT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ScanditIconType.ARROW_UP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ScanditIconType.ARROW_DOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ScanditIconType.CHEVRON_RIGHT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ScanditIconType.CHEVRON_DOWN.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ScanditIconType.CHEVRON_UP.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ScanditIconType.CHEVRON_LEFT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ScanditIconType.PRINT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final String toJson(ScanditIconType iconType) {
        Intrinsics.j(iconType, "iconType");
        switch (WhenMappings.$EnumSwitchMapping$0[iconType.ordinal()]) {
            case 1:
                return "toPick";
            case 2:
                return "checkmark";
            case 3:
                return "xMark";
            case 4:
                return "questionMark";
            case 5:
                return "exclamationMark";
            case 6:
                return "wrongItem";
            case 7:
                return "lowStock";
            case 8:
                return "inspectItem";
            case 9:
                return "expiredItem";
            case 10:
                return "fragileItem";
            case 11:
                return "starFilled";
            case 12:
                return "starHalfFilled";
            case 13:
                return "starOutlined";
            case 14:
                return "arrowRight";
            case 15:
                return "arrowLeft";
            case 16:
                return "arrowUp";
            case 17:
                return "arrowDown";
            case 18:
                return "chevronRight";
            case 19:
                return "chevronDown";
            case 20:
                return "chevronUp";
            case 21:
                return "chevronLeft";
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                return "print";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private ScanditIconTypeSerializer() {
    }
}
