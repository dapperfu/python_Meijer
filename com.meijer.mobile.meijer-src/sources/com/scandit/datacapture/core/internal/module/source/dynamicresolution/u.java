package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class u implements w {

    /* renamed from: a, reason: collision with root package name */
    public final k f126021a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.e(this.f126021a, ((u) obj).f126021a);
    }

    public final int hashCode() {
        return this.f126021a.hashCode();
    }

    public final String toString() {
        return "Enabled(settings=" + this.f126021a + ')';
    }

    public u(k settings) {
        Intrinsics.j(settings, "settings");
        this.f126021a = settings;
    }

    @Override // com.scandit.datacapture.core.internal.module.source.dynamicresolution.w
    public final k a() {
        return this.f126021a;
    }
}
