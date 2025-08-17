package com.scandit.datacapture.tools.internal.module.mapmaker;

import java.util.NoSuchElementException;

/* renamed from: com.scandit.datacapture.tools.internal.module.mapmaker.o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13408o extends AbstractC13405l {
    public C13408o(N n10) {
        super(n10);
    }

    @Override // java.util.Iterator
    public final Object next() throws Q {
        try {
            if (hasNext()) {
                this.f126249g = this.f126248f;
                a();
                return this.f126249g.f126216a;
            }
            throw Q.f126232a;
        } catch (Q unused) {
            throw new NoSuchElementException();
        }
    }
}
