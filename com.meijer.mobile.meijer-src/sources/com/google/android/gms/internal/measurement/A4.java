package com.google.android.gms.internal.measurement;

/* loaded from: classes6.dex */
abstract class A4 implements C4 {
    A4() {
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
