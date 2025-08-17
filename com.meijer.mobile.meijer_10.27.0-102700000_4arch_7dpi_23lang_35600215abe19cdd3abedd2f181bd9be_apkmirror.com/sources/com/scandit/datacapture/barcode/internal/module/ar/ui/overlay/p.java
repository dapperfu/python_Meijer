package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import com.scandit.datacapture.barcode.batch.data.TrackedBarcode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class p extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f121229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackedBarcode f121230b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(v vVar, TrackedBarcode trackedBarcode) {
        super(0);
        this.f121229a = vVar;
        this.f121230b = trackedBarcode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        v vVar = this.f121229a;
        b bVar = vVar.f121248a;
        TrackedBarcode track = this.f121230b;
        n highlightReadyCallback = new n(vVar, track);
        e eVar = (e) bVar;
        eVar.getClass();
        Intrinsics.j(track, "track");
        Intrinsics.j(highlightReadyCallback, "highlightReadyCallback");
        eVar.f121202a.invoke(track.getBarcode(), new d(highlightReadyCallback));
        v vVar2 = this.f121229a;
        b bVar2 = vVar2.f121248a;
        TrackedBarcode track2 = this.f121230b;
        o annotationReadyCallback = new o(vVar2, track2);
        e eVar2 = (e) bVar2;
        eVar2.getClass();
        Intrinsics.j(track2, "track");
        Intrinsics.j(annotationReadyCallback, "annotationReadyCallback");
        eVar2.f121203b.invoke(track2.getBarcode(), new c(annotationReadyCallback));
        return Unit.f142422a;
    }
}
