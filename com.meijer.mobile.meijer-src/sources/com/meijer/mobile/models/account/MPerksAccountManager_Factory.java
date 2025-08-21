package com.meijer.mobile.models.account;

import Dk.b;
import Yi.c;
import android.app.NotificationManager;
import il.InterfaceC14774f;
import xu.InterfaceC18226d;
import yo.C18335a;
import yo.C18336b;
import yo.f;
import yo.k;

/* loaded from: classes10.dex */
public final class MPerksAccountManager_Factory implements InterfaceC18226d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC18226d<b> f114388a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC18226d<k> f114389b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC18226d<f> f114390c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC18226d<C18335a> f114391d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC18226d<C18336b> f114392e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC18226d<NotificationManager> f114393f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC18226d<InterfaceC14774f> f114394g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC18226d<c> f114395h;

    public static MPerksAccountManager_Factory create(InterfaceC18226d<b> interfaceC18226d, InterfaceC18226d<k> interfaceC18226d2, InterfaceC18226d<f> interfaceC18226d3, InterfaceC18226d<C18335a> interfaceC18226d4, InterfaceC18226d<C18336b> interfaceC18226d5, InterfaceC18226d<NotificationManager> interfaceC18226d6, InterfaceC18226d<InterfaceC14774f> interfaceC18226d7, InterfaceC18226d<c> interfaceC18226d8) {
        return new MPerksAccountManager_Factory(interfaceC18226d, interfaceC18226d2, interfaceC18226d3, interfaceC18226d4, interfaceC18226d5, interfaceC18226d6, interfaceC18226d7, interfaceC18226d8);
    }

    public static MPerksAccountManager newInstance(b bVar, k kVar, f fVar, C18335a c18335a, C18336b c18336b, NotificationManager notificationManager, InterfaceC14774f interfaceC14774f, c cVar) {
        return new MPerksAccountManager(bVar, kVar, fVar, c18335a, c18336b, notificationManager, interfaceC14774f, cVar);
    }

    @Override // gv.InterfaceC14411a
    public MPerksAccountManager get() {
        return newInstance(this.f114388a.get(), this.f114389b.get(), this.f114390c.get(), this.f114391d.get(), this.f114392e.get(), this.f114393f.get(), this.f114394g.get(), this.f114395h.get());
    }

    private MPerksAccountManager_Factory(InterfaceC18226d<b> interfaceC18226d, InterfaceC18226d<k> interfaceC18226d2, InterfaceC18226d<f> interfaceC18226d3, InterfaceC18226d<C18335a> interfaceC18226d4, InterfaceC18226d<C18336b> interfaceC18226d5, InterfaceC18226d<NotificationManager> interfaceC18226d6, InterfaceC18226d<InterfaceC14774f> interfaceC18226d7, InterfaceC18226d<c> interfaceC18226d8) {
        this.f114388a = interfaceC18226d;
        this.f114389b = interfaceC18226d2;
        this.f114390c = interfaceC18226d3;
        this.f114391d = interfaceC18226d4;
        this.f114392e = interfaceC18226d5;
        this.f114393f = interfaceC18226d6;
        this.f114394g = interfaceC18226d7;
        this.f114395h = interfaceC18226d8;
    }
}
