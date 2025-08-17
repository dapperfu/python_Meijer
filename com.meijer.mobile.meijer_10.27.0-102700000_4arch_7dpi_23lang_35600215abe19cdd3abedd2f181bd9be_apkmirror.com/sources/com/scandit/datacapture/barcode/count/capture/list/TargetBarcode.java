package com.scandit.datacapture.barcode.count.capture.list;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeTargetBarcode;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0007H\u0097\u0001J\t\u0010\b\u001a\u00020\tH\u0097\u0001¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcode;", "Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcodeProxy;", "impl", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeTargetBarcode;", "(Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeTargetBarcode;)V", "_impl", "getData", "", "getQuantity", "", "Companion", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Mockable
/* loaded from: classes11.dex */
public final class TargetBarcode implements TargetBarcodeProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ TargetBarcodeProxyAdapter f120655a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcode$Companion;", "", "", "data", "", "quantity", "Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcode;", "create", "(Ljava/lang/String;I)Lcom/scandit/datacapture/barcode/count/capture/list/TargetBarcode;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        @JvmStatic
        public final TargetBarcode create(String data, int quantity) {
            Intrinsics.j(data, "data");
            NativeTargetBarcode nativeTargetBarcodeCreate = NativeTargetBarcode.create(data, quantity);
            Intrinsics.i(nativeTargetBarcodeCreate, "create(...)");
            return new TargetBarcode(nativeTargetBarcodeCreate);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @JvmStatic
    public static final TargetBarcode create(String str, int i10) {
        return INSTANCE.create(str, i10);
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.TargetBarcodeProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeTargetBarcode getF120656a() {
        return this.f120655a.getF120656a();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.TargetBarcodeProxy
    @ProxyFunction
    public String getData() {
        return this.f120655a.getData();
    }

    @Override // com.scandit.datacapture.barcode.count.capture.list.TargetBarcodeProxy
    @ProxyFunction
    public int getQuantity() {
        return this.f120655a.getQuantity();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TargetBarcode(NativeTargetBarcode impl) {
        Intrinsics.j(impl, "impl");
        this.f120655a = new TargetBarcodeProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }
}
