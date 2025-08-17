package com.scandit.datacapture.barcode.internal.module.shared;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f122824a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f122825b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f122826c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f122827d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f122828e;

    /* renamed from: f, reason: collision with root package name */
    public a f122829f;

    /* renamed from: g, reason: collision with root package name */
    public b f122830g;

    public final synchronized void a() {
        b bVarC = c();
        b bVar = b.f122822d;
        if (bVarC == bVar) {
            return;
        }
        this.f122830g = bVar;
        a aVarB = b();
        aVarB.getClass();
        if (aVarB == a.f122815b) {
            this.f122826c.invoke();
        }
    }

    public final synchronized a b() {
        return this.f122829f;
    }

    public final synchronized b c() {
        return this.f122830g;
    }

    public final synchronized void d() {
        b bVarC = c();
        b bVar = b.f122820b;
        if (bVarC == bVar) {
            return;
        }
        this.f122830g = bVar;
        a aVarB = b();
        aVarB.getClass();
        if (aVarB == a.f122815b) {
            this.f122824a.invoke();
        }
    }

    public final synchronized void e() {
        b bVarC = c();
        b bVar = b.f122821c;
        if (bVarC == bVar) {
            return;
        }
        this.f122830g = bVar;
        this.f122825b.invoke();
    }

    public c(Function0 startScanning, Function0 stopScanning, Function0 onFreezeScanning, Function0 release, Function0 resetScanning, b initialScanState) {
        a initialLifecycleState = a.f122814a;
        Intrinsics.j(startScanning, "startScanning");
        Intrinsics.j(stopScanning, "stopScanning");
        Intrinsics.j(onFreezeScanning, "onFreezeScanning");
        Intrinsics.j(release, "release");
        Intrinsics.j(resetScanning, "resetScanning");
        Intrinsics.j(initialScanState, "initialScanState");
        Intrinsics.j(initialLifecycleState, "initialLifecycleState");
        this.f122824a = startScanning;
        this.f122825b = stopScanning;
        this.f122826c = onFreezeScanning;
        this.f122827d = release;
        this.f122828e = resetScanning;
        this.f122829f = initialLifecycleState;
        this.f122830g = initialScanState;
    }
}
