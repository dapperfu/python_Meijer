package com.scandit.datacapture.core.internal.module.source;

import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class M implements BufferStack {

    /* renamed from: a, reason: collision with root package name */
    public final int f125747a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Stack f125748b;

    @Override // com.scandit.datacapture.core.internal.module.source.BufferStack
    public final void a(byte[] byteArray) {
        Intrinsics.j(byteArray, "byteArray");
        if (this.f125748b.size() < 3) {
            this.f125748b.push(byteArray);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.BufferStack
    public final boolean isEmpty() {
        return this.f125748b.size() == 0;
    }

    public M() {
        Stack stack = new Stack();
        this.f125748b = stack;
        stack.clear();
        for (int i10 = 0; i10 < 3; i10++) {
            a(new byte[this.f125747a]);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.BufferStack
    public final byte[] a(int i10) {
        byte[] bArr = (byte[]) this.f125748b.pop();
        if (bArr.length != i10) {
            bArr = new byte[i10];
        }
        Intrinsics.g(bArr);
        return bArr;
    }
}
