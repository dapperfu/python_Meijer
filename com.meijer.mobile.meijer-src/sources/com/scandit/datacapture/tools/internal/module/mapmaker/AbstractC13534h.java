package com.scandit.datacapture.tools.internal.module.mapmaker;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC13534h implements InterfaceC13539m {

    /* renamed from: a, reason: collision with root package name */
    public final Object f127189a;

    /* renamed from: b, reason: collision with root package name */
    public final int f127190b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC13539m f127191c;

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13539m
    public final InterfaceC13539m b() {
        return this.f127191c;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13539m
    public final int c() {
        return this.f127190b;
    }

    @Override // com.scandit.datacapture.tools.internal.module.mapmaker.InterfaceC13539m
    public final Object getKey() {
        return this.f127189a;
    }

    public AbstractC13534h(Object obj, int i10, InterfaceC13539m interfaceC13539m) {
        this.f127189a = obj;
        this.f127190b = i10;
        this.f127191c = interfaceC13539m;
    }
}
