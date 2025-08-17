package com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components;

import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class g extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BinsView f123527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BinsView.TouchedElement.ToteHandle f123528b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f123529c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BinsView binsView, BinsView.TouchedElement.ToteHandle toteHandle, int i10) {
        super(0);
        this.f123527a = binsView;
        this.f123528b = toteHandle;
        this.f123529c = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BinsView.access$swapToteIndex(this.f123527a, this.f123528b.getIndex(), this.f123529c);
        this.f123527a.f123471q = BinsView.TouchedElement.Nothing.INSTANCE;
        this.f123527a.f123472r = null;
        return Unit.f142422a;
    }
}
