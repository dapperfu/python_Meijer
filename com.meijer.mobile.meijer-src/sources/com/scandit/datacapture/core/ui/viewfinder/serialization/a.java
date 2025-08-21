package com.scandit.datacapture.core.ui.viewfinder.serialization;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewfinderDeserializerHelper f127157a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ViewfinderDeserializerHelper viewfinderDeserializerHelper) {
        super(0);
        this.f127157a = viewfinderDeserializerHelper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ViewfinderDeserializerHelperReversedAdapter(this.f127157a, null, 2, null);
    }
}
