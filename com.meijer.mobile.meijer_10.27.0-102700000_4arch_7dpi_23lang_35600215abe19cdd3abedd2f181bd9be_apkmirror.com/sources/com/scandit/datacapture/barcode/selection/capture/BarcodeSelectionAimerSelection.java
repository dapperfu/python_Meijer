package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeAimerSelection;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeSelectionType;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003H\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0097\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010H\u0097\u0001¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\t\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\n¨\u0006 "}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerSelection;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionType;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerSelectionProxy;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeAimerSelection;", "impl", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeAimerSelection;)V", "()V", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerBehavior;", "aimerBehavior", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerBehavior;)V", "_impl", "()Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeAimerSelection;", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeSelectionType;", "_selectionTypeImpl", "()Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeSelectionType;", "", "toJson", "()Ljava/lang/String;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionStrategy;", "value", "b", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionStrategy;", "getSelectionStrategy", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionStrategy;", "setSelectionStrategy", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionStrategy;)V", "selectionStrategy", "<set-?>", "getAimerBehavior", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionAimerBehavior;", "setAimerBehavior", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodeSelectionAimerSelection implements BarcodeSelectionType, BarcodeSelectionAimerSelectionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ BarcodeSelectionAimerSelectionProxyAdapter f123751a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private BarcodeSelectionStrategy selectionStrategy;

    /* JADX WARN: Multi-variable type inference failed */
    public BarcodeSelectionAimerSelection(NativeAimerSelection impl) {
        Intrinsics.j(impl, "impl");
        this.f123751a = new BarcodeSelectionAimerSelectionProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.selectionStrategy = new BarcodeSelectionManualSelectionStrategy();
        setSelectionStrategy(new BarcodeSelectionManualSelectionStrategy());
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAimerSelectionProxy
    @NativeImpl
    /* renamed from: _impl */
    public NativeAimerSelection getF123753a() {
        return this.f123751a.getF123753a();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionType, com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAimerSelectionProxy
    @NativeImpl
    /* renamed from: _selectionTypeImpl */
    public NativeSelectionType getF123755c() {
        return this.f123751a.getF123755c();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAimerSelectionProxy
    @ProxyFunction(property = "aimerBehavior")
    public BarcodeSelectionAimerBehavior getAimerBehavior() {
        return this.f123751a.getAimerBehavior();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAimerSelectionProxy
    @ProxyFunction(property = "aimerBehavior")
    public void setAimerBehavior(BarcodeSelectionAimerBehavior barcodeSelectionAimerBehavior) {
        Intrinsics.j(barcodeSelectionAimerBehavior, "<set-?>");
        this.f123751a.setAimerBehavior(barcodeSelectionAimerBehavior);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionType, com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionAimerSelectionProxy
    @ProxyFunction
    public String toJson() {
        return this.f123751a.toJson();
    }

    public final BarcodeSelectionStrategy getSelectionStrategy() {
        return this.selectionStrategy;
    }

    public final void setSelectionStrategy(BarcodeSelectionStrategy value) {
        Intrinsics.j(value, "value");
        this.selectionStrategy = value;
        getF123753a().setSelectionStrategy(value.getF123759c());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeSelectionAimerSelection() {
        NativeAimerSelection nativeAimerSelectionCreate = NativeAimerSelection.create();
        Intrinsics.i(nativeAimerSelectionCreate, "create(...)");
        this(nativeAimerSelectionCreate);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BarcodeSelectionAimerSelection(BarcodeSelectionAimerBehavior aimerBehavior) {
        this();
        Intrinsics.j(aimerBehavior, "aimerBehavior");
        setAimerBehavior(aimerBehavior);
    }
}
