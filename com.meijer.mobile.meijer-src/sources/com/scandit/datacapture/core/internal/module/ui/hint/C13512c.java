package com.scandit.datacapture.core.internal.module.ui.hint;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.ui.hint.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13512c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f126210a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13512c(j jVar) {
        super(0);
        this.f126210a = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ViewParent parent = ((TextView) this.f126210a.f126218a.getValue()).getParent();
        Intrinsics.h(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        return Integer.valueOf(((ViewGroup) parent).getHeight());
    }
}
