package com.scandit.datacapture.barcode.internal.module.shared;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f123776a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f123777b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f123778c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f123779d;

    /* renamed from: e, reason: collision with root package name */
    public final Function0 f123780e;

    /* renamed from: f, reason: collision with root package name */
    public a f123781f;

    /* renamed from: g, reason: collision with root package name */
    public b f123782g;

    public final synchronized void a() {
        b bVarC = c();
        b bVar = b.f123774d;
        if (bVarC == bVar) {
            return;
        }
        this.f123782g = bVar;
        a aVarB = b();
        aVarB.getClass();
        if (aVarB == a.f123767b) {
            this.f123778c.invoke();
        }
    }

    public final synchronized a b() {
        return this.f123781f;
    }

    public final synchronized b c() {
        return this.f123782g;
    }

    public final synchronized void d() {
        b bVarC = c();
        b bVar = b.f123772b;
        if (bVarC == bVar) {
            return;
        }
        this.f123782g = bVar;
        a aVarB = b();
        aVarB.getClass();
        if (aVarB == a.f123767b) {
            this.f123776a.invoke();
        }
    }

    public final synchronized void e() {
        b bVarC = c();
        b bVar = b.f123773c;
        if (bVarC == bVar) {
            return;
        }
        this.f123782g = bVar;
        this.f123777b.invoke();
    }

    public c(Function0 startScanning, Function0 stopScanning, Function0 onFreezeScanning, Function0 release, Function0 resetScanning, b initialScanState) {
        a initialLifecycleState = a.f123766a;
        Intrinsics.j(startScanning, "startScanning");
        Intrinsics.j(stopScanning, "stopScanning");
        Intrinsics.j(onFreezeScanning, "onFreezeScanning");
        Intrinsics.j(release, "release");
        Intrinsics.j(resetScanning, "resetScanning");
        Intrinsics.j(initialScanState, "initialScanState");
        Intrinsics.j(initialLifecycleState, "initialLifecycleState");
        this.f123776a = startScanning;
        this.f123777b = stopScanning;
        this.f123778c = onFreezeScanning;
        this.f123779d = release;
        this.f123780e = resetScanning;
        this.f123781f = initialLifecycleState;
        this.f123782g = initialScanState;
    }
}
