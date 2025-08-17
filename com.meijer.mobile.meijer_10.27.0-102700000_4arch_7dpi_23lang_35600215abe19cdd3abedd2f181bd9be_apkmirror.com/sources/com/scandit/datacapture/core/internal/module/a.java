package com.scandit.datacapture.core.internal.module;

import android.content.Context;
import com.scandit.internal.sdk.bar.FilesystemInstance;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a extends FilesystemInstance {

    /* renamed from: a, reason: collision with root package name */
    public final Context f124205a;

    public a(Context context) {
        Intrinsics.j(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        this.f124205a = applicationContext;
    }

    @Override // com.scandit.internal.sdk.bar.FilesystemInstance
    public final String getTemporaryDirectory() {
        String absolutePath = this.f124205a.getCacheDir().getAbsolutePath();
        Intrinsics.i(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }
}
