package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.NoSuchElementException;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.j, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13536j extends AbstractC13538l {
    public C13536j(N n10) {
        super(n10);
    }

    @Override // java.util.Iterator
    public final Object next() throws Q {
        try {
            if (hasNext()) {
                this.f127201g = this.f127200f;
                a();
                return this.f127201g;
            }
            throw Q.f127184a;
        } catch (Q unused) {
            throw new NoSuchElementException();
        }
    }
}
