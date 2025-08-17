package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.W;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class m extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f121656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f121657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TrackedBarcode f121658c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(W w10, r rVar, TrackedBarcode trackedBarcode) {
        super(1);
        this.f121656a = w10;
        this.f121657b = rVar;
        this.f121658c = trackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.j(it, "it");
        int iOrdinal = this.f121656a.ordinal();
        if (iOrdinal == 1) {
            return (Brush) this.f121657b.f121671e.get(Integer.valueOf(this.f121658c.getGlobalId$scandit_barcode_capture()));
        }
        if (iOrdinal == 2) {
            return (Brush) this.f121657b.f121672f.get(Integer.valueOf(this.f121658c.getGlobalId$scandit_barcode_capture()));
        }
        if (iOrdinal == 3) {
            return (Brush) this.f121657b.f121670d.get(Integer.valueOf(this.f121658c.getGlobalId$scandit_barcode_capture()));
        }
        throw new IllegalStateException(("Unreachable " + this.f121656a).toString());
    }
}
