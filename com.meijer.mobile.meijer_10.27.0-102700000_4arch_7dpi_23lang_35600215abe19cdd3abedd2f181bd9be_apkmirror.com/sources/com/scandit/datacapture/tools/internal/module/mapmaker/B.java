package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.NoSuchElementException;

/* loaded from: classes11.dex */
public final class B extends AbstractC13405l {
    public B(N n10) {
        super(n10);
    }

    @Override // java.util.Iterator
    public final Object next() throws Q {
        try {
            if (hasNext()) {
                this.f126249g = this.f126248f;
                a();
                return this.f126249g.f126217b;
            }
            throw Q.f126232a;
        } catch (Q unused) {
            throw new NoSuchElementException();
        }
    }
}
