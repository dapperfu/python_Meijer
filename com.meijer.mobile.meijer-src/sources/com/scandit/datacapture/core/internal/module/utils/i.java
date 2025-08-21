package com.scandit.datacapture.core.internal.module.utils;

import com.fullstory.FS;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class i {
    public static final void a(String message) {
        Intrinsics.j(message, "message");
        FS.log_i("sdc-core", message);
    }

    public static final void a(String message, Exception e10) {
        Intrinsics.j(message, "message");
        Intrinsics.j(e10, "e");
        FS.log_e("sdc-core", message);
        e10.printStackTrace();
    }
}
