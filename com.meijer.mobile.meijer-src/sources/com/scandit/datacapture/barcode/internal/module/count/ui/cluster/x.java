package com.scandit.datacapture.barcode.internal.module.count.ui.cluster;

import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeClusterLiveEditor;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeCluster;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class x extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B f122529a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(B b10) {
        super(1);
        this.f122529a = b10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeCluster cluster = (NativeCluster) obj;
        Intrinsics.j(cluster, "cluster");
        B b10 = this.f122529a;
        b10.getClass();
        Intrinsics.j(cluster, "cluster");
        NativeBarcodeClusterLiveEditor nativeBarcodeClusterLiveEditorBeginClusterEditing = b10.f122465b.beginClusterEditing();
        if (nativeBarcodeClusterLiveEditorBeginClusterEditing != null) {
            try {
                nativeBarcodeClusterLiveEditorBeginClusterEditing.dissolveCluster(cluster);
                nativeBarcodeClusterLiveEditorBeginClusterEditing.endEditing();
                r rVar = b10.f122472i;
                if (rVar != null) {
                    ((com.scandit.datacapture.barcode.internal.module.count.ui.handlers.v) rVar).a(cluster.getIdentifier());
                }
            } catch (Throwable th2) {
                nativeBarcodeClusterLiveEditorBeginClusterEditing.endEditing();
                throw th2;
            }
        }
        return Unit.f143329a;
    }
}
