package com.scandit.datacapture.core.internal.module;

import android.content.Context;
import com.scandit.internal.sdk.bar.FilesystemInstance;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a extends FilesystemInstance {

    /* renamed from: a, reason: collision with root package name */
    public final Context f125157a;

    public a(Context context) {
        Intrinsics.j(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        this.f125157a = applicationContext;
    }

    @Override // com.scandit.internal.sdk.bar.FilesystemInstance
    public final String getTemporaryDirectory() {
        String absolutePath = this.f125157a.getCacheDir().getAbsolutePath();
        Intrinsics.i(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }
}
