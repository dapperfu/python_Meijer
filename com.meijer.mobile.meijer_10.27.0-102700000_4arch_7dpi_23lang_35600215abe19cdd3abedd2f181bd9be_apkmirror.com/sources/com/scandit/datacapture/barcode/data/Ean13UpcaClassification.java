package com.scandit.datacapture.barcode.data;

import com.scandit.datacapture.barcode.internal.module.capture.NativeEan13UpcaClassification;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/scandit/datacapture/barcode/data/Ean13UpcaClassification;", "", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class Ean13UpcaClassification {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/scandit/datacapture/barcode/data/Ean13UpcaClassification$Companion;", "", "Lcom/scandit/datacapture/barcode/data/Barcode;", "barcode", "", "isUpca", "(Lcom/scandit/datacapture/barcode/data/Barcode;)Z", "isEan13", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final boolean isEan13(Barcode barcode) {
            Intrinsics.j(barcode, "barcode");
            return NativeEan13UpcaClassification.isEan13(barcode.getF120890a());
        }

        @JvmStatic
        public final boolean isUpca(Barcode barcode) {
            Intrinsics.j(barcode, "barcode");
            return NativeEan13UpcaClassification.isUpca(barcode.getF120890a());
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final boolean isEan13(Barcode barcode) {
        return INSTANCE.isEan13(barcode);
    }

    @JvmStatic
    public static final boolean isUpca(Barcode barcode) {
        return INSTANCE.isUpca(barcode);
    }
}
