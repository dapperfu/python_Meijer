package com.scandit.datacapture.core.internal.module.ui.hint;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.module.ui.hint.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13379c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f125258a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13379c(j jVar) {
        super(0);
        this.f125258a = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ViewParent parent = ((TextView) this.f125258a.f125266a.getValue()).getParent();
        Intrinsics.h(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        return Integer.valueOf(((ViewGroup) parent).getHeight());
    }
}
