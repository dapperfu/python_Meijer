package com.scandit.datacapture.barcode.filter.ui.overlay;

import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeEnumSerializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;", "", "", "toJson", "()Ljava/lang/String;", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterHighlightType;", "_toNativeEnum$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterHighlightType;", "_toNativeEnum", "Companion", "BRUSH", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeFilterHighlightType {
    public static final BarcodeFilterHighlightType BRUSH;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ BarcodeFilterHighlightType[] f120925a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f120926b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType$Companion;", "", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterHighlightType;", "source", "Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;", "_fromNativeEnum$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/filter/ui/overlay/NativeBarcodeFilterHighlightType;)Lcom/scandit/datacapture/barcode/filter/ui/overlay/BarcodeFilterHighlightType;", "_fromNativeEnum", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NativeBarcodeFilterHighlightType.values().length];
                try {
                    iArr[NativeBarcodeFilterHighlightType.BRUSH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final /* synthetic */ BarcodeFilterHighlightType _fromNativeEnum$scandit_barcode_capture(NativeBarcodeFilterHighlightType source) {
            Intrinsics.j(source, "source");
            if (WhenMappings.$EnumSwitchMapping$0[source.ordinal()] == 1) {
                return BarcodeFilterHighlightType.BRUSH;
            }
            throw new NoWhenBranchMatchedException();
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BarcodeFilterHighlightType.values().length];
            try {
                iArr[BarcodeFilterHighlightType.BRUSH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static EnumEntries<BarcodeFilterHighlightType> getEntries() {
        return f120926b;
    }

    public static BarcodeFilterHighlightType valueOf(String str) {
        return (BarcodeFilterHighlightType) Enum.valueOf(BarcodeFilterHighlightType.class, str);
    }

    public static BarcodeFilterHighlightType[] values() {
        return (BarcodeFilterHighlightType[]) f120925a.clone();
    }

    static {
        BarcodeFilterHighlightType barcodeFilterHighlightType = new BarcodeFilterHighlightType();
        BRUSH = barcodeFilterHighlightType;
        BarcodeFilterHighlightType[] barcodeFilterHighlightTypeArr = {barcodeFilterHighlightType};
        f120925a = barcodeFilterHighlightTypeArr;
        f120926b = EnumEntriesKt.a(barcodeFilterHighlightTypeArr);
        INSTANCE = new Companion(null);
    }

    private BarcodeFilterHighlightType() {
    }

    public final /* synthetic */ NativeBarcodeFilterHighlightType _toNativeEnum$scandit_barcode_capture() {
        if (WhenMappings.$EnumSwitchMapping$0[ordinal()] == 1) {
            return NativeBarcodeFilterHighlightType.BRUSH;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toJson() {
        String strBarcodeFilterHighlightTypeToString = NativeBarcodeEnumSerializer.barcodeFilterHighlightTypeToString(_toNativeEnum$scandit_barcode_capture());
        Intrinsics.i(strBarcodeFilterHighlightTypeToString, "barcodeFilterHighlightTypeToString(...)");
        return strBarcodeFilterHighlightTypeToString;
    }
}
