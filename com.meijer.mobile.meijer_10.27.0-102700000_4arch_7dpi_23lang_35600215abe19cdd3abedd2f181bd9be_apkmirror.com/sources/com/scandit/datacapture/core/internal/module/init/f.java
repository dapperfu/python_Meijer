package com.scandit.datacapture.core.internal.module.init;

import android.content.Context;
import com.medallia.digital.mobilesdk.q2;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes11.dex */
public abstract class f {
    public static final String a(Context context) {
        String sourceDir = context.getApplicationInfo().sourceDir;
        Intrinsics.i(sourceDir, "sourceDir");
        List listM1 = CollectionsKt.m1(StringsKt.a1(sourceDir, new String[]{q2.f92724c}, false, 0, 6, null));
        listM1.remove(CollectionsKt.o(listM1));
        return CollectionsKt.B0(listM1, q2.f92724c, null, null, 0, null, null, 62, null);
    }

    public static final File b(Context context) {
        File codeCacheDir = context.getCodeCacheDir();
        Intrinsics.i(codeCacheDir, "getCodeCacheDir(...)");
        return codeCacheDir;
    }
}
