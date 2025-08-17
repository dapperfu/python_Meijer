package com.scandit.datacapture.core.internal.module.source;

import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class M implements BufferStack {

    /* renamed from: a, reason: collision with root package name */
    public final int f124795a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Stack f124796b;

    @Override // com.scandit.datacapture.core.internal.module.source.BufferStack
    public final void a(byte[] byteArray) {
        Intrinsics.j(byteArray, "byteArray");
        if (this.f124796b.size() < 3) {
            this.f124796b.push(byteArray);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.BufferStack
    public final boolean isEmpty() {
        return this.f124796b.size() == 0;
    }

    public M() {
        Stack stack = new Stack();
        this.f124796b = stack;
        stack.clear();
        for (int i10 = 0; i10 < 3; i10++) {
            a(new byte[this.f124795a]);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.source.BufferStack
    public final byte[] a(int i10) {
        byte[] bArr = (byte[]) this.f124796b.pop();
        if (bArr.length != i10) {
            bArr = new byte[i10];
        }
        Intrinsics.g(bArr);
        return bArr;
    }
}
