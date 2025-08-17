package com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final /* synthetic */ class e extends FunctionReferenceImpl implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final e f123522a = new e();

    public e() {
        super(1, ToteView.class, "showSub", "showSub()V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ToteView p02 = (ToteView) obj;
        Intrinsics.j(p02, "p0");
        p02.showSub();
        return Unit.f142422a;
    }
}
