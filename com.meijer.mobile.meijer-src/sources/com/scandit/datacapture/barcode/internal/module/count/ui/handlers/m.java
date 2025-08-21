package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.W;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class m extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f122608a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f122609b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TrackedBarcode f122610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(W w10, r rVar, TrackedBarcode trackedBarcode) {
        super(1);
        this.f122608a = w10;
        this.f122609b = rVar;
        this.f122610c = trackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.j(it, "it");
        int iOrdinal = this.f122608a.ordinal();
        if (iOrdinal == 1) {
            return (Brush) this.f122609b.f122623e.get(Integer.valueOf(this.f122610c.getGlobalId$scandit_barcode_capture()));
        }
        if (iOrdinal == 2) {
            return (Brush) this.f122609b.f122624f.get(Integer.valueOf(this.f122610c.getGlobalId$scandit_barcode_capture()));
        }
        if (iOrdinal == 3) {
            return (Brush) this.f122609b.f122622d.get(Integer.valueOf(this.f122610c.getGlobalId$scandit_barcode_capture()));
        }
        throw new IllegalStateException(("Unreachable " + this.f122608a).toString());
    }
}
