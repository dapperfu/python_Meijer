package com.scandit.datacapture.barcode.pick.data;

import com.scandit.datacapture.barcode.internal.module.pick.data.NativeBarcodePickProduct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProduct;", "", "Lcom/scandit/datacapture/barcode/internal/module/pick/data/NativeBarcodePickProduct;", "_impl", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/data/NativeBarcodePickProduct;)V", "", "identifier", "", "quantityToPick", "(Ljava/lang/String;I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Lcom/scandit/datacapture/barcode/internal/module/pick/data/NativeBarcodePickProduct;", "get_impl$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/internal/module/pick/data/NativeBarcodePickProduct;", "getQuantityToPick", "getIdentifier", "()Ljava/lang/String;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BarcodePickProduct {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NativeBarcodePickProduct _impl;

    public BarcodePickProduct(NativeBarcodePickProduct _impl) {
        Intrinsics.j(_impl, "_impl");
        this._impl = _impl;
    }

    public boolean equals(Object other) {
        if (other == null || !(other instanceof BarcodePickProduct)) {
            return false;
        }
        if (other == this) {
            return true;
        }
        BarcodePickProduct barcodePickProduct = (BarcodePickProduct) other;
        return Intrinsics.e(getIdentifier(), barcodePickProduct.getIdentifier()) && getQuantityToPick() == barcodePickProduct.getQuantityToPick();
    }

    public final String getIdentifier() {
        String identifier = this._impl.getIdentifier();
        Intrinsics.i(identifier, "getIdentifier(...)");
        return identifier;
    }

    public final int getQuantityToPick() {
        return this._impl.getQuantity();
    }

    /* renamed from: get_impl$scandit_barcode_capture, reason: from getter */
    public final NativeBarcodePickProduct get_impl() {
        return this._impl;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BarcodePickProduct(String identifier, int i10) {
        this(new NativeBarcodePickProduct(identifier, i10));
        Intrinsics.j(identifier, "identifier");
    }

    public int hashCode() {
        return Integer.hashCode(getQuantityToPick()) + ((getIdentifier().hashCode() + 527) * 31);
    }
}
