package com.scandit.datacapture.barcode.internal.module.count.ui.handlers;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator.W;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class q extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ W f121664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f121665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TrackedBarcode f121666c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(W w10, r rVar, TrackedBarcode trackedBarcode) {
        super(1);
        this.f121664a = w10;
        this.f121665b = rVar;
        this.f121666c = trackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean zContainsKey;
        TrackedBarcode it = (TrackedBarcode) obj;
        Intrinsics.j(it, "it");
        int iOrdinal = this.f121664a.ordinal();
        if (iOrdinal == 1) {
            zContainsKey = this.f121665b.f121671e.containsKey(Integer.valueOf(this.f121666c.getGlobalId$scandit_barcode_capture()));
        } else if (iOrdinal == 2) {
            zContainsKey = this.f121665b.f121672f.containsKey(Integer.valueOf(this.f121666c.getGlobalId$scandit_barcode_capture()));
        } else {
            if (iOrdinal != 3) {
                throw new IllegalStateException(("Unreachable " + this.f121664a).toString());
            }
            zContainsKey = this.f121665b.f121670d.containsKey(Integer.valueOf(this.f121666c.getGlobalId$scandit_barcode_capture()));
        }
        return Boolean.valueOf(zContainsKey);
    }
}
