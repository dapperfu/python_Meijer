package com.scandit.datacapture.barcode.find.capture;

import com.scandit.datacapture.core.ui.style.Brush;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001d\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0003\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemSearchOptions;", "", "", "barcodeData", "Lcom/scandit/datacapture/core/ui/style/Brush;", "brush", "<init>", "([BLcom/scandit/datacapture/core/ui/style/Brush;)V", "", "(Ljava/lang/String;Lcom/scandit/datacapture/core/ui/style/Brush;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "[B", "getBarcodeRawData", "()[B", "barcodeRawData", "b", "Lcom/scandit/datacapture/core/ui/style/Brush;", "getBrush", "()Lcom/scandit/datacapture/core/ui/style/Brush;", "getBarcodeData", "()Ljava/lang/String;", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class BarcodeFindItemSearchOptions {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final byte[] barcodeRawData;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Brush brush;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BarcodeFindItemSearchOptions(String barcodeData) {
        this(barcodeData, (Brush) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        Intrinsics.j(barcodeData, "barcodeData");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public BarcodeFindItemSearchOptions(byte[] barcodeData) {
        this(barcodeData, (Brush) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        Intrinsics.j(barcodeData, "barcodeData");
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof BarcodeFindItemSearchOptions) {
            return Arrays.equals(this.barcodeRawData, ((BarcodeFindItemSearchOptions) other).barcodeRawData);
        }
        return false;
    }

    public final String getBarcodeData() {
        return new String(this.barcodeRawData, Charsets.UTF_8);
    }

    public final byte[] getBarcodeRawData() {
        return this.barcodeRawData;
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public int hashCode() {
        return Arrays.hashCode(this.barcodeRawData);
    }

    @JvmOverloads
    public BarcodeFindItemSearchOptions(byte[] barcodeData, Brush brush) {
        Intrinsics.j(barcodeData, "barcodeData");
        this.barcodeRawData = barcodeData;
        this.brush = brush;
    }

    public /* synthetic */ BarcodeFindItemSearchOptions(byte[] bArr, Brush brush, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr, (i10 & 2) != 0 ? null : brush);
    }

    public /* synthetic */ BarcodeFindItemSearchOptions(String str, Brush brush, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : brush);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public BarcodeFindItemSearchOptions(String barcodeData, Brush brush) {
        Intrinsics.j(barcodeData, "barcodeData");
        byte[] bytes = barcodeData.getBytes(Charsets.UTF_8);
        Intrinsics.i(bytes, "getBytes(...)");
        this(bytes, brush);
    }
}
