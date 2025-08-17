package com.scandit.datacapture.barcode.count.ui.view.status;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusResult;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountStatusResultSuccess;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusResultSuccess;", "", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeCountStatusResultSuccess {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusResultSuccess$Companion;", "", "", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusItem;", "statusList", "", "statusModeEnabledMessage", "statusModeDisabledMessage", "Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusResult;", "create", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/count/ui/view/status/BarcodeCountStatusResult;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class Companion {
        @JvmStatic
        public final BarcodeCountStatusResult create(List<BarcodeCountStatusItem> statusList, String statusModeEnabledMessage, String statusModeDisabledMessage) {
            Intrinsics.j(statusList, "statusList");
            ArrayList arrayList = new ArrayList(CollectionsKt.x(statusList, 10));
            Iterator<T> it = statusList.iterator();
            while (it.hasNext()) {
                arrayList.add(((BarcodeCountStatusItem) it.next()).getF120872a());
            }
            NativeBarcodeCountStatusResult nativeBarcodeCountStatusResultCreate = NativeBarcodeCountStatusResultSuccess.create(CollectionsExtensionsKt.toArrayList(arrayList), statusModeEnabledMessage, statusModeDisabledMessage);
            Intrinsics.i(nativeBarcodeCountStatusResultCreate, "create(...)");
            return new BarcodeCountStatusResult(nativeBarcodeCountStatusResultCreate);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final BarcodeCountStatusResult create(List<BarcodeCountStatusItem> list, String str, String str2) {
        return INSTANCE.create(list, str, str2);
    }
}
