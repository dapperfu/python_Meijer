package com.scandit.datacapture.core.internal.module.ui.hint;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.scandit.datacapture.core.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class f extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f125261a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ViewGroup viewGroup) {
        super(0);
        this.f125261a = viewGroup;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ViewGroup viewGroup = this.f125261a;
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.sc_hint_view, viewGroup, false);
        Intrinsics.i(viewInflate, "inflate(...)");
        Intrinsics.h(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewInflate;
        this.f125261a.addView(textView);
        return textView;
    }
}
