package com.meijer.mobile.meijer.activity.settings.debug;

import pu.InterfaceC16421a;
import wm.C17838h;

/* renamed from: com.meijer.mobile.meijer.activity.settings.debug.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12513j implements InterfaceC16421a<DebugOptionsActivity> {
    public static void a(DebugOptionsActivity debugOptionsActivity, C17838h c17838h) {
        debugOptionsActivity.mperksNotificationManager = c17838h;
    }

    public static void b(DebugOptionsActivity debugOptionsActivity, com.squareup.picasso.o oVar) {
        debugOptionsActivity.picasso = oVar;
    }

    public static void c(DebugOptionsActivity debugOptionsActivity, Tq.j jVar) {
        debugOptionsActivity.storeProvider = jVar;
    }
}
