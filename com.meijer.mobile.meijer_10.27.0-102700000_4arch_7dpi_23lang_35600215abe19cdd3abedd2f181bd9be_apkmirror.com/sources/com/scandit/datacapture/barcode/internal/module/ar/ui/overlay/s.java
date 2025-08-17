package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class s extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeArAugmentation$Annotation f121239a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f121240b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BarcodeArAugmentation$Highlight f121241c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f121242d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation, v vVar, BarcodeArAugmentation$Highlight barcodeArAugmentation$Highlight, a aVar) {
        super(0);
        this.f121239a = barcodeArAugmentation$Annotation;
        this.f121240b = vVar;
        this.f121241c = barcodeArAugmentation$Highlight;
        this.f121242d = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f121239a.b().getParent() != null) {
            this.f121240b.a(this.f121239a, this.f121241c);
        } else if (this.f121240b.b().isEmpty()) {
            v vVar = this.f121240b;
            Quadrilateral quadrilateralA = this.f121242d.a();
            a aVar = this.f121242d;
            vVar.a(quadrilateralA, aVar.f121197c, this.f121239a, aVar.f121198d);
        } else {
            ArrayList arrayListB = this.f121240b.b();
            v vVar2 = this.f121240b;
            Iterator it = arrayListB.iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                BarcodeArAugmentation$Annotation barcodeArAugmentation$Annotation = aVar2.f121199e;
                if (barcodeArAugmentation$Annotation != null) {
                    vVar2.a(barcodeArAugmentation$Annotation, aVar2.f121198d);
                }
            }
        }
        return Unit.f142422a;
    }
}
