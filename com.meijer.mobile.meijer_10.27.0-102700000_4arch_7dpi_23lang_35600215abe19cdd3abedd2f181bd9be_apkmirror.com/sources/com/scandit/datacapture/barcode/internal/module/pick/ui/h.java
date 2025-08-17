package com.scandit.datacapture.barcode.internal.module.pick.ui;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f122543a;

    /* renamed from: b, reason: collision with root package name */
    public final String f122544b;

    /* renamed from: c, reason: collision with root package name */
    public final String f122545c;

    public h(Context context, String loadingTextForPicking, String loadingTextForUnpicking) {
        Intrinsics.j(context, "context");
        Intrinsics.j(loadingTextForPicking, "loadingTextForPicking");
        Intrinsics.j(loadingTextForUnpicking, "loadingTextForUnpicking");
        this.f122543a = context;
        this.f122544b = loadingTextForPicking;
        this.f122545c = loadingTextForUnpicking;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.f
    public final View a() {
        return new e(this.f122543a, this.f122544b, this.f122545c);
    }
}
