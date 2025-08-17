package com.meijer.mobile.widget;

import gi.InterfaceC14261a;
import pu.InterfaceC16421a;
import yo.C18264a;

/* loaded from: classes11.dex */
public final class x implements InterfaceC16421a<WalkThroughView> {
    public static void a(WalkThroughView walkThroughView, InterfaceC14261a interfaceC14261a) {
        walkThroughView.analyticsEngine = interfaceC14261a;
    }

    public static void b(WalkThroughView walkThroughView, C18264a c18264a) {
        walkThroughView.appPrefManager = c18264a;
    }

    public static void c(WalkThroughView walkThroughView, Cl.e eVar) {
        walkThroughView.meijerIntent = eVar;
    }
}
