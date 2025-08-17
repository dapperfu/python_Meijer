package com.scandit.datacapture.core.ui.icon;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.core.R;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u0000 02\u00020\u0001:\u00010BC\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0014\u0010\u0012J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/scandit/datacapture/core/ui/icon/ScanditIcon;", "", "Lcom/scandit/datacapture/core/ui/icon/ScanditIconType;", BarcodePickDeserializer.FIELD_ICON, "", "iconColor", "backgroundColor", "backgroundStrokeColor", "", "backgroundStrokeWidth", "Lcom/scandit/datacapture/core/ui/icon/ScanditIconShape;", "backgroundShape", "<init>", "(Lcom/scandit/datacapture/core/ui/icon/ScanditIconType;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;FLcom/scandit/datacapture/core/ui/icon/ScanditIconShape;)V", "Landroid/content/Context;", "context", "Landroid/graphics/drawable/Drawable;", "getDrawable$scandit_capture_core", "(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;", "getDrawable", "getDrawableIgnoringBackground$scandit_capture_core", "getDrawableIgnoringBackground", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Lcom/scandit/datacapture/core/ui/icon/ScanditIconType;", "getIcon", "()Lcom/scandit/datacapture/core/ui/icon/ScanditIconType;", "b", "Ljava/lang/Integer;", "getIconColor", "()Ljava/lang/Integer;", "c", "getBackgroundColor", "d", "getBackgroundStrokeColor", "e", "F", "getBackgroundStrokeWidth", "()F", "f", "Lcom/scandit/datacapture/core/ui/icon/ScanditIconShape;", "getBackgroundShape", "()Lcom/scandit/datacapture/core/ui/icon/ScanditIconShape;", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ScanditIcon {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    private static final Lazy f126108i = LazyKt.b(b.f126128a);
    public static final float iconToBackgroundRatio = 0.5f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ScanditIconType icon;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Integer iconColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Integer backgroundColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Integer backgroundStrokeColor;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float backgroundStrokeWidth;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ScanditIconShape backgroundShape;

    /* renamed from: g, reason: collision with root package name */
    private a f126115g;

    /* renamed from: h, reason: collision with root package name */
    private Drawable f126116h;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0081T¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\tR!\u0010\u0010\u001a\u00020\n8@X\u0081\u0084\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/core/ui/icon/ScanditIcon$Companion;", "", "Lcom/scandit/datacapture/core/ui/icon/ScanditIconBuilder;", "builder", "()Lcom/scandit/datacapture/core/ui/icon/ScanditIconBuilder;", "", "iconToBackgroundRatio", "F", "getIconToBackgroundRatio$scandit_capture_core$annotations", "()V", "", "iconBackgroundSize$delegate", "Lkotlin/Lazy;", "getIconBackgroundSize$scandit_capture_core", "()I", "getIconBackgroundSize$scandit_capture_core$annotations", "iconBackgroundSize", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public static /* synthetic */ void getIconBackgroundSize$scandit_capture_core$annotations() {
        }

        public static /* synthetic */ void getIconToBackgroundRatio$scandit_capture_core$annotations() {
        }

        @JvmStatic
        public final ScanditIconBuilder builder() {
            return new ScanditIconBuilder();
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final int getIconBackgroundSize$scandit_capture_core() {
            return ((Number) ScanditIcon.f126108i.getValue()).intValue();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ScanditIconShape.values().length];
            try {
                iArr[ScanditIconShape.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScanditIconShape.SQUARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ScanditIconType.values().length];
            try {
                iArr2[ScanditIconType.TO_PICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ScanditIconType.CHECKMARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ScanditIconType.X_MARK.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ScanditIconType.QUESTION_MARK.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ScanditIconType.EXCLAMATION_MARK.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ScanditIconType.WRONG_ITEM.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ScanditIconType.LOW_STOCK.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ScanditIconType.INSPECT_ITEM.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[ScanditIconType.EXPIRED_ITEM.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ScanditIconType.FRAGILE_ITEM.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ScanditIconType.STAR_FILLED.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ScanditIconType.STAR_HALF_FILLED.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[ScanditIconType.STAR_OUTLINED.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[ScanditIconType.ARROW_RIGHT.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[ScanditIconType.ARROW_LEFT.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[ScanditIconType.ARROW_UP.ordinal()] = 16;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[ScanditIconType.ARROW_DOWN.ordinal()] = 17;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[ScanditIconType.CHEVRON_RIGHT.ordinal()] = 18;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[ScanditIconType.CHEVRON_DOWN.ordinal()] = 19;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr2[ScanditIconType.CHEVRON_UP.ordinal()] = 20;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr2[ScanditIconType.CHEVRON_LEFT.ordinal()] = 21;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr2[ScanditIconType.PRINT.ordinal()] = 22;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @JvmStatic
    public static final ScanditIconBuilder builder() {
        return INSTANCE.builder();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.e(ScanditIcon.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.h(other, "null cannot be cast to non-null type com.scandit.datacapture.core.ui.icon.ScanditIcon");
        ScanditIcon scanditIcon = (ScanditIcon) other;
        return this.icon == scanditIcon.icon && Intrinsics.e(this.iconColor, scanditIcon.iconColor) && Intrinsics.e(this.backgroundColor, scanditIcon.backgroundColor) && Intrinsics.e(this.backgroundStrokeColor, scanditIcon.backgroundStrokeColor) && this.backgroundStrokeWidth == scanditIcon.backgroundStrokeWidth && this.backgroundShape == scanditIcon.backgroundShape;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ScanditIconShape getBackgroundShape() {
        return this.backgroundShape;
    }

    public final Integer getBackgroundStrokeColor() {
        return this.backgroundStrokeColor;
    }

    public final float getBackgroundStrokeWidth() {
        return this.backgroundStrokeWidth;
    }

    public final /* synthetic */ Drawable getDrawable$scandit_capture_core(Context context) throws Resources.NotFoundException {
        int i10;
        Intrinsics.j(context, "context");
        a aVar = this.f126115g;
        if (aVar != null) {
            return aVar;
        }
        Drawable drawableIgnoringBackground$scandit_capture_core = getDrawableIgnoringBackground$scandit_capture_core(context);
        GradientDrawable gradientDrawable = null;
        if (this.backgroundShape != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            int i11 = WhenMappings.$EnumSwitchMapping$0[this.backgroundShape.ordinal()];
            if (i11 == 1) {
                i10 = 1;
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = 0;
            }
            gradientDrawable2.setShape(i10);
            Integer num = this.backgroundColor;
            if (num != null) {
                gradientDrawable2.setColor(num.intValue());
            }
            Integer num2 = this.backgroundStrokeColor;
            if (num2 != null) {
                gradientDrawable2.setStroke((int) PixelExtensionsKt.pxFromDp$default(this.backgroundStrokeWidth, (Context) null, 1, (Object) null), num2.intValue());
            }
            gradientDrawable = gradientDrawable2;
        }
        a aVar2 = new a(new Drawable[]{gradientDrawable, drawableIgnoringBackground$scandit_capture_core});
        Companion companion = INSTANCE;
        aVar2.setBounds(0, 0, companion.getIconBackgroundSize$scandit_capture_core(), companion.getIconBackgroundSize$scandit_capture_core());
        this.f126115g = aVar2;
        return aVar2;
    }

    public final Drawable getDrawableIgnoringBackground$scandit_capture_core(Context context) throws Resources.NotFoundException {
        Integer numValueOf;
        Intrinsics.j(context, "context");
        Drawable drawable = this.f126116h;
        if (drawable != null) {
            return drawable;
        }
        ScanditIconType scanditIconType = this.icon;
        switch (scanditIconType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[scanditIconType.ordinal()]) {
            case -1:
                numValueOf = null;
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_to_pick);
                break;
            case 2:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_checkmark);
                break;
            case 3:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_x_mark);
                break;
            case 4:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_question_mark);
                break;
            case 5:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_exclamation_mark);
                break;
            case 6:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_wrong_item);
                break;
            case 7:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_low_stock);
                break;
            case 8:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_inspect_item);
                break;
            case 9:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_expired_item);
                break;
            case 10:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_fragile_item);
                break;
            case 11:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_star_filled);
                break;
            case 12:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_star_half_filled);
                break;
            case 13:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_star_outlined);
                break;
            case 14:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_arrow_right);
                break;
            case 15:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_arrow_left);
                break;
            case 16:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_arrow_up);
                break;
            case 17:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_arrow_down);
                break;
            case 18:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_chevron_right);
                break;
            case 19:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_chevron_down);
                break;
            case 20:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_chevron_up);
                break;
            case 21:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_chevron_left);
                break;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                numValueOf = Integer.valueOf(R.drawable.sc_ic_print);
                break;
        }
        if (numValueOf == null) {
            return null;
        }
        Drawable drawable2 = context.getResources().getDrawable(numValueOf.intValue(), context.getTheme());
        Integer num = this.iconColor;
        drawable2.setColorFilter(new PorterDuffColorFilter(num != null ? num.intValue() : 0, PorterDuff.Mode.SRC_ATOP));
        this.f126116h = drawable2;
        return drawable2;
    }

    public final ScanditIconType getIcon() {
        return this.icon;
    }

    public final Integer getIconColor() {
        return this.iconColor;
    }

    public int hashCode() {
        ScanditIconType scanditIconType = this.icon;
        int iHashCode = (scanditIconType != null ? scanditIconType.hashCode() : 0) * 31;
        Integer num = this.iconColor;
        int iIntValue = (iHashCode + (num != null ? num.intValue() : 0)) * 31;
        Integer num2 = this.backgroundColor;
        int iIntValue2 = (iIntValue + (num2 != null ? num2.intValue() : 0)) * 31;
        Integer num3 = this.backgroundStrokeColor;
        int iHashCode2 = (Float.hashCode(this.backgroundStrokeWidth) + ((iIntValue2 + (num3 != null ? num3.intValue() : 0)) * 31)) * 31;
        ScanditIconShape scanditIconShape = this.backgroundShape;
        return iHashCode2 + (scanditIconShape != null ? scanditIconShape.hashCode() : 0);
    }

    public ScanditIcon(ScanditIconType scanditIconType, Integer num, Integer num2, Integer num3, float f10, ScanditIconShape scanditIconShape) {
        this.icon = scanditIconType;
        this.iconColor = num;
        this.backgroundColor = num2;
        this.backgroundStrokeColor = num3;
        this.backgroundStrokeWidth = f10;
        this.backgroundShape = scanditIconShape;
    }
}
