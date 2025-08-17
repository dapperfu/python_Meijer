package com.meijer.mobile.models.account;

import Bu.d;
import Ck.b;
import Xi.c;
import android.app.NotificationManager;
import hl.InterfaceC14494f;
import yo.C18264a;
import yo.C18265b;
import yo.f;
import yo.k;

/* loaded from: classes9.dex */
public final class MPerksAccountManager_Factory implements d {

    /* renamed from: a, reason: collision with root package name */
    private final d<b> f113535a;

    /* renamed from: b, reason: collision with root package name */
    private final d<k> f113536b;

    /* renamed from: c, reason: collision with root package name */
    private final d<f> f113537c;

    /* renamed from: d, reason: collision with root package name */
    private final d<C18264a> f113538d;

    /* renamed from: e, reason: collision with root package name */
    private final d<C18265b> f113539e;

    /* renamed from: f, reason: collision with root package name */
    private final d<NotificationManager> f113540f;

    /* renamed from: g, reason: collision with root package name */
    private final d<InterfaceC14494f> f113541g;

    /* renamed from: h, reason: collision with root package name */
    private final d<c> f113542h;

    public static MPerksAccountManager_Factory create(d<b> dVar, d<k> dVar2, d<f> dVar3, d<C18264a> dVar4, d<C18265b> dVar5, d<NotificationManager> dVar6, d<InterfaceC14494f> dVar7, d<c> dVar8) {
        return new MPerksAccountManager_Factory(dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8);
    }

    public static MPerksAccountManager newInstance(b bVar, k kVar, f fVar, C18264a c18264a, C18265b c18265b, NotificationManager notificationManager, InterfaceC14494f interfaceC14494f, c cVar) {
        return new MPerksAccountManager(bVar, kVar, fVar, c18264a, c18265b, notificationManager, interfaceC14494f, cVar);
    }

    @Override // kv.InterfaceC15323a
    public MPerksAccountManager get() {
        return newInstance(this.f113535a.get(), this.f113536b.get(), this.f113537c.get(), this.f113538d.get(), this.f113539e.get(), this.f113540f.get(), this.f113541g.get(), this.f113542h.get());
    }

    private MPerksAccountManager_Factory(d<b> dVar, d<k> dVar2, d<f> dVar3, d<C18264a> dVar4, d<C18265b> dVar5, d<NotificationManager> dVar6, d<InterfaceC14494f> dVar7, d<c> dVar8) {
        this.f113535a = dVar;
        this.f113536b = dVar2;
        this.f113537c = dVar3;
        this.f113538d = dVar4;
        this.f113539e = dVar5;
        this.f113540f = dVar6;
        this.f113541g = dVar7;
        this.f113542h = dVar8;
    }
}
