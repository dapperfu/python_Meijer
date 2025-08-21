package com.scandit.datacapture.core.internal.sdk.common.linearcontrolgroup;

import com.scandit.datacapture.core.ui.control.Control;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f126388a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ArrayList arrayList) {
        super(1);
        this.f126388a = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Control control = (Control) obj;
        Intrinsics.j(control, "control");
        this.f126388a.add(control);
        return Unit.f143329a;
    }
}
