package com.meijer.mobile.models.account;

import Yi.b;
import Yi.c;
import android.app.NotificationManager;
import il.InterfaceC14774f;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import mk.PeriodicPollingStartEvent;
import yo.C18335a;
import yo.C18336b;
import yo.f;
import yo.k;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0001\u0018\u00002\u00020\u0001BK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/meijer/mobile/models/account/MPerksAccountManager;", "LYi/b;", "LDk/b;", "bus", "Lyo/k;", "userManager", "Lyo/f;", "storeManager", "Lyo/a;", "appPrefManager", "Lyo/b;", "barcodeFileManager", "Landroid/app/NotificationManager;", "notificationManager", "Lil/f;", "cartProvider", "LYi/c;", "userAuthenticator", "<init>", "(LDk/b;Lyo/k;Lyo/f;Lyo/a;Lyo/b;Landroid/app/NotificationManager;Lil/f;LYi/c;)V", "", "startPeriodicPolling", "()V", "logout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LDk/b;", "b", "Lyo/k;", "c", "Lyo/f;", "d", "Lyo/a;", "e", "Lyo/b;", "f", "Landroid/app/NotificationManager;", "g", "Lil/f;", "h", "LYi/c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MPerksAccountManager implements b {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Dk.b bus;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f storeManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C18335a appPrefManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C18336b barcodeFileManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final NotificationManager notificationManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14774f cartProvider;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final c userAuthenticator;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.models.account.MPerksAccountManager", f = "MPerksAccountManager.kt", l = {58}, m = "logout")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f114385a;

        /* renamed from: c, reason: collision with root package name */
        int f114387c;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f114385a = obj;
            this.f114387c |= Integer.MIN_VALUE;
            return MPerksAccountManager.this.logout(this);
        }
    }

    public MPerksAccountManager(Dk.b bus, k userManager, f storeManager, C18335a appPrefManager, C18336b barcodeFileManager, NotificationManager notificationManager, InterfaceC14774f cartProvider, c userAuthenticator) {
        Intrinsics.j(bus, "bus");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(storeManager, "storeManager");
        Intrinsics.j(appPrefManager, "appPrefManager");
        Intrinsics.j(barcodeFileManager, "barcodeFileManager");
        Intrinsics.j(cartProvider, "cartProvider");
        Intrinsics.j(userAuthenticator, "userAuthenticator");
        this.bus = bus;
        this.userManager = userManager;
        this.storeManager = storeManager;
        this.appPrefManager = appPrefManager;
        this.barcodeFileManager = barcodeFileManager;
        this.notificationManager = notificationManager;
        this.cartProvider = cartProvider;
        this.userAuthenticator = userAuthenticator;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Yi.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object logout(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.meijer.mobile.models.account.MPerksAccountManager.a
            if (r0 == 0) goto L13
            r0 = r5
            com.meijer.mobile.models.account.MPerksAccountManager$a r0 = (com.meijer.mobile.models.account.MPerksAccountManager.a) r0
            int r1 = r0.f114387c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114387c = r1
            goto L18
        L13:
            com.meijer.mobile.models.account.MPerksAccountManager$a r0 = new com.meijer.mobile.models.account.MPerksAccountManager$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f114385a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f114387c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r5)
            goto L5f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            Dk.b r5 = r4.bus
            jk.b r2 = jk.C15046b.f140938a
            r5.a(r2)
            yo.k r5 = r4.userManager
            boolean r5 = r5.b()
            if (r5 == 0) goto L54
            yo.a r5 = r4.appPrefManager
            yo.k r2 = r4.userManager
            java.lang.String r2 = r2.h()
            r5.N(r2)
            yo.a r5 = r4.appPrefManager
            r2 = 0
            r5.F(r2)
        L54:
            Yi.c r5 = r4.userAuthenticator
            r0.f114387c = r3
            java.lang.Object r5 = r5.f(r0)
            if (r5 != r1) goto L5f
            return r1
        L5f:
            Dk.b r5 = r4.bus
            gk.a r0 = gk.C14385a.f134293a
            r5.a(r0)
            Dk.b r5 = r4.bus
            mk.a r0 = mk.C15729a.f151142a
            r5.a(r0)
            android.app.NotificationManager r5 = r4.notificationManager
            if (r5 == 0) goto L74
            r5.cancelAll()
        L74:
            yo.b r5 = r4.barcodeFileManager
            r5.d()
            il.f r5 = r4.cartProvider
            r5.reset()
            yo.f r5 = r4.storeManager
            yo.d r0 = yo.d.f171588a
            r5.j(r0)
            yo.f r5 = r4.storeManager
            yo.d r0 = yo.d.f171589b
            r5.j(r0)
            kotlin.Unit r5 = kotlin.Unit.f143329a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.models.account.MPerksAccountManager.logout(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void startPeriodicPolling() {
        this.bus.a(new PeriodicPollingStartEvent(this.userManager.e(), false));
    }
}
