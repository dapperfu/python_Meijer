package com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components;

import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f123523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BinsView f123524b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinsView.TouchedElement.SubHandle f123525c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f123526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z10, BinsView binsView, BinsView.TouchedElement.SubHandle subHandle, int i10) {
        super(0);
        this.f123523a = z10;
        this.f123524b = binsView;
        this.f123525c = subHandle;
        this.f123526d = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f123523a) {
            BinsView.access$swapSubIndex(this.f123524b, this.f123525c.getIndex(), this.f123526d);
        }
        this.f123524b.f123471q = BinsView.TouchedElement.Nothing.INSTANCE;
        this.f123524b.f123472r = null;
        BinsView.access$displayToteSubs(this.f123524b);
        return Unit.f142422a;
    }
}
