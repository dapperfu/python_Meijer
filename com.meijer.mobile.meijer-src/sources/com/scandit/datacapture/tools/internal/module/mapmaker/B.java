package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.NoSuchElementException;

/* loaded from: classes12.dex */
public final class B extends AbstractC13538l {
    public B(N n10) {
        super(n10);
    }

    @Override // java.util.Iterator
    public final Object next() throws Q {
        try {
            if (hasNext()) {
                this.f127201g = this.f127200f;
                a();
                return this.f127201g.f127169b;
            }
            throw Q.f127184a;
        } catch (Q unused) {
            throw new NoSuchElementException();
        }
    }
}
