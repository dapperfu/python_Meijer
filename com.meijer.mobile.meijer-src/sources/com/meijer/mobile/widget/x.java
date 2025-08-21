package com.meijer.mobile.widget;

import hi.InterfaceC14523a;
import lu.InterfaceC15612a;
import yo.C18335a;

/* loaded from: classes12.dex */
public final class x implements InterfaceC15612a<WalkThroughView> {
    public static void a(WalkThroughView walkThroughView, InterfaceC14523a interfaceC14523a) {
        walkThroughView.analyticsEngine = interfaceC14523a;
    }

    public static void b(WalkThroughView walkThroughView, C18335a c18335a) {
        walkThroughView.appPrefManager = c18335a;
    }

    public static void c(WalkThroughView walkThroughView, Dl.e eVar) {
        walkThroughView.meijerIntent = eVar;
    }
}
