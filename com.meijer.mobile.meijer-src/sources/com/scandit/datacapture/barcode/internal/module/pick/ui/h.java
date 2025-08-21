package com.scandit.datacapture.barcode.internal.module.pick.ui;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f123495a;

    /* renamed from: b, reason: collision with root package name */
    public final String f123496b;

    /* renamed from: c, reason: collision with root package name */
    public final String f123497c;

    public h(Context context, String loadingTextForPicking, String loadingTextForUnpicking) {
        Intrinsics.j(context, "context");
        Intrinsics.j(loadingTextForPicking, "loadingTextForPicking");
        Intrinsics.j(loadingTextForUnpicking, "loadingTextForUnpicking");
        this.f123495a = context;
        this.f123496b = loadingTextForPicking;
        this.f123497c = loadingTextForUnpicking;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.f
    public final View a() {
        return new e(this.f123495a, this.f123496b, this.f123497c);
    }
}
