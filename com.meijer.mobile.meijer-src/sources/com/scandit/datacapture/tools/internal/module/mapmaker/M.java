package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.Map;

/* loaded from: classes12.dex */
public final class M extends AbstractC13527a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f127168a;

    /* renamed from: b, reason: collision with root package name */
    public Object f127169b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f127170c;

    public M(N n10, Object obj, Object obj2) {
        this.f127170c = n10;
        this.f127168a = obj;
        this.f127169b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.f127168a.equals(entry.getKey()) && this.f127169b.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f127168a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f127169b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f127168a.hashCode() ^ this.f127169b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object objPut = this.f127170c.put(this.f127168a, obj);
        this.f127169b = obj;
        return objPut;
    }
}
