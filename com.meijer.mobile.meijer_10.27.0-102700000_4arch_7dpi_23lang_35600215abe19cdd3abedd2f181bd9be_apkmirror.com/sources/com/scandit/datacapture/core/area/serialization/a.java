package com.scandit.datacapture.core.area.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationSelectionDeserializerHelper f124029a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LocationSelectionDeserializerHelper locationSelectionDeserializerHelper) {
        super(0);
        this.f124029a = locationSelectionDeserializerHelper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new LocationSelectionDeserializerHelperReversedAdapter(this.f124029a, null, 2, null);
    }
}
