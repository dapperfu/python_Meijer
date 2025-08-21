package com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components;

import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f124475a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BinsView f124476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinsView.TouchedElement.SubHandle f124477c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f124478d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z10, BinsView binsView, BinsView.TouchedElement.SubHandle subHandle, int i10) {
        super(0);
        this.f124475a = z10;
        this.f124476b = binsView;
        this.f124477c = subHandle;
        this.f124478d = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f124475a) {
            BinsView.access$swapSubIndex(this.f124476b, this.f124477c.getIndex(), this.f124478d);
        }
        this.f124476b.f124423q = BinsView.TouchedElement.Nothing.INSTANCE;
        this.f124476b.f124424r = null;
        BinsView.access$displayToteSubs(this.f124476b);
        return Unit.f143329a;
    }
}
