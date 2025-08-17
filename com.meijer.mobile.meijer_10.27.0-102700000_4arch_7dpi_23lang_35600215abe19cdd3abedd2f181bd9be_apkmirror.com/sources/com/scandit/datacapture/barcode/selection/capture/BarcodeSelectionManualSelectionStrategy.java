package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeManualSelectionStrategy;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeSelectionStrategy;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0007\u001a\u00020\u0005H\u0097\u0001J\t\u0010\b\u001a\u00020\tH\u0097\u0001J\t\u0010\n\u001a\u00020\u000bH\u0097\u0001¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionManualSelectionStrategy;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionStrategy;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionManualSelectionStrategyProxy;", "()V", "impl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeManualSelectionStrategy;", "(Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeManualSelectionStrategy;)V", "_impl", "_selectionStrategyImpl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeSelectionStrategy;", "toJson", "", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeSelectionManualSelectionStrategy implements BarcodeSelectionStrategy, BarcodeSelectionManualSelectionStrategyProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeSelectionManualSelectionStrategyProxyAdapter f123781a;

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeSelectionManualSelectionStrategy(NativeManualSelectionStrategy impl) {
        Intrinsics.j(impl, "impl");
        this.f123781a = new BarcodeSelectionManualSelectionStrategyProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionManualSelectionStrategyProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeManualSelectionStrategy getF123782a() {
        return this.f123781a.getF123782a();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionStrategy, com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAutoSelectionStrategyProxy
    @NativeImpl
    /* renamed from: _selectionStrategyImpl */
    public NativeSelectionStrategy getF123759c() {
        return this.f123781a.getF123784c();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionStrategy, com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAutoSelectionStrategyProxy
    @ProxyFunction
    public String toJson() {
        return this.f123781a.toJson();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeSelectionManualSelectionStrategy() {
        NativeManualSelectionStrategy nativeManualSelectionStrategyCreate = NativeManualSelectionStrategy.create();
        Intrinsics.i(nativeManualSelectionStrategyCreate, "create(...)");
        this(nativeManualSelectionStrategyCreate);
    }
}
