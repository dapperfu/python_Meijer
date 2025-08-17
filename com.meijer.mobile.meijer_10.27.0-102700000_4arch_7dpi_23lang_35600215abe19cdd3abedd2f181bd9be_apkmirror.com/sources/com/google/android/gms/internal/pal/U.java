package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
abstract class U implements W {
    U() {
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(zza());
    }
}
