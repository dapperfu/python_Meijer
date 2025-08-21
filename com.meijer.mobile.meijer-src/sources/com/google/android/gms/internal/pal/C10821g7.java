package com.google.android.gms.internal.pal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.pal.g7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C10821g7 {
    public static /* synthetic */ boolean a(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
        while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, obj, obj2, obj3)) {
            if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                return false;
            }
        }
        return true;
    }
}
