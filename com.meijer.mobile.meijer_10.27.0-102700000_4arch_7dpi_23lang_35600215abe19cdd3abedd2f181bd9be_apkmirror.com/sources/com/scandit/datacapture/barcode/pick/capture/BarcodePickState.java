package com.scandit.datacapture.barcode.pick.capture;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickState;
import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeEnumDeserializer;
import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeEnumSerializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "", "", "toJsonString", "()Ljava/lang/String;", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickState;", "_toNativeEnum$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickState;", "_toNativeEnum", "Companion", "TO_PICK", "PICKED", "IGNORE", "UNKNOWN", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodePickState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final BarcodePickState IGNORE;
    public static final BarcodePickState PICKED;
    public static final BarcodePickState TO_PICK;
    public static final BarcodePickState UNKNOWN;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ BarcodePickState[] f123585a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f123586b;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState$Companion;", "", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickState;", "source", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "_fromNativeEnum$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickState;)Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "_fromNativeEnum", "", "value", "fromJsonString", "(Ljava/lang/String;)Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickState;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NativeBarcodePickState.values().length];
                try {
                    iArr[NativeBarcodePickState.PICKED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NativeBarcodePickState.TO_PICK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[NativeBarcodePickState.IGNORE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[NativeBarcodePickState.UNKNOWN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public final /* synthetic */ BarcodePickState _fromNativeEnum$scandit_barcode_capture(NativeBarcodePickState source) {
            Intrinsics.j(source, "source");
            int i10 = WhenMappings.$EnumSwitchMapping$0[source.ordinal()];
            if (i10 == 1) {
                return BarcodePickState.PICKED;
            }
            if (i10 == 2) {
                return BarcodePickState.TO_PICK;
            }
            if (i10 == 3) {
                return BarcodePickState.IGNORE;
            }
            if (i10 == 4) {
                return BarcodePickState.UNKNOWN;
            }
            throw new NoWhenBranchMatchedException();
        }

        @JvmStatic
        public final BarcodePickState fromJsonString(String value) {
            Intrinsics.j(value, "value");
            NativeBarcodePickState nativeBarcodePickStateBarcodePickStateFromJsonString = NativeBarcodeEnumDeserializer.barcodePickStateFromJsonString(value);
            Intrinsics.g(nativeBarcodePickStateBarcodePickStateFromJsonString);
            return _fromNativeEnum$scandit_barcode_capture(nativeBarcodePickStateBarcodePickStateFromJsonString);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BarcodePickState.values().length];
            try {
                iArr[BarcodePickState.PICKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BarcodePickState.TO_PICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BarcodePickState.IGNORE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BarcodePickState.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @JvmStatic
    public static final BarcodePickState fromJsonString(String str) {
        return INSTANCE.fromJsonString(str);
    }

    public static EnumEntries<BarcodePickState> getEntries() {
        return f123586b;
    }

    public static BarcodePickState valueOf(String str) {
        return (BarcodePickState) Enum.valueOf(BarcodePickState.class, str);
    }

    public static BarcodePickState[] values() {
        return (BarcodePickState[]) f123585a.clone();
    }

    static {
        BarcodePickState barcodePickState = new BarcodePickState("TO_PICK", 0);
        TO_PICK = barcodePickState;
        BarcodePickState barcodePickState2 = new BarcodePickState("PICKED", 1);
        PICKED = barcodePickState2;
        BarcodePickState barcodePickState3 = new BarcodePickState("IGNORE", 2);
        IGNORE = barcodePickState3;
        BarcodePickState barcodePickState4 = new BarcodePickState("UNKNOWN", 3);
        UNKNOWN = barcodePickState4;
        BarcodePickState[] barcodePickStateArr = {barcodePickState, barcodePickState2, barcodePickState3, barcodePickState4};
        f123585a = barcodePickStateArr;
        f123586b = EnumEntriesKt.a(barcodePickStateArr);
        INSTANCE = new Companion(null);
    }

    public final /* synthetic */ NativeBarcodePickState _toNativeEnum$scandit_barcode_capture() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i10 == 1) {
            return NativeBarcodePickState.PICKED;
        }
        if (i10 == 2) {
            return NativeBarcodePickState.TO_PICK;
        }
        if (i10 == 3) {
            return NativeBarcodePickState.IGNORE;
        }
        if (i10 == 4) {
            return NativeBarcodePickState.UNKNOWN;
        }
        throw new NoWhenBranchMatchedException();
    }

    private BarcodePickState(String str, int i10) {
    }

    public final String toJsonString() {
        String strBarcodePickStateToString = NativeBarcodeEnumSerializer.barcodePickStateToString(_toNativeEnum$scandit_barcode_capture());
        Intrinsics.i(strBarcodePickStateToString, "barcodePickStateToString(...)");
        return strBarcodePickStateToString;
    }
}
