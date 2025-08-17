package com.scandit.datacapture.tools.internal.module.mapmaker;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC13401h implements InterfaceC13406m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f126237a;

    /* renamed from: b, reason: collision with root package name */
    public final int f126238b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC13406m f126239c;

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13406m
    public final InterfaceC13406m b() {
        return this.f126239c;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13406m
    public final int c() {
        return this.f126238b;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13406m
    public final Object getKey() {
        return this.f126237a;
    }

    public AbstractC13401h(Object obj, int i10, InterfaceC13406m interfaceC13406m) {
        this.f126237a = obj;
        this.f126238b = i10;
        this.f126239c = interfaceC13406m;
    }
}
