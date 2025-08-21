package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelection;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSession;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.selection.capture.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13400a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeBarcodeSelection f124758a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13400a(NativeBarcodeSelection nativeBarcodeSelection) {
        super(0);
        this.f124758a = nativeBarcodeSelection;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        NativeBarcodeSelectionSession session = this.f124758a.getSession();
        Intrinsics.i(session, "getSession(...)");
        return session;
    }
}
