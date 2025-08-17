package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.Map;

/* loaded from: classes11.dex */
public final class M extends AbstractC13394a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f126216a;

    /* renamed from: b, reason: collision with root package name */
    public Object f126217b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N f126218c;

    public M(N n10, Object obj, Object obj2) {
        this.f126218c = n10;
        this.f126216a = obj;
        this.f126217b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.f126216a.equals(entry.getKey()) && this.f126217b.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f126216a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f126217b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f126216a.hashCode() ^ this.f126217b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object objPut = this.f126218c.put(this.f126216a, obj);
        this.f126217b = obj;
        return objPut;
    }
}
