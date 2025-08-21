package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.NoSuchElementException;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13541o extends AbstractC13538l {
    public C13541o(N n10) {
        super(n10);
    }

    @Override // java.util.Iterator
    public final Object next() throws Q {
        try {
            if (hasNext()) {
                this.f127201g = this.f127200f;
                a();
                return this.f127201g.f127168a;
            }
            throw Q.f127184a;
        } catch (Q unused) {
            throw new NoSuchElementException();
        }
    }
}
