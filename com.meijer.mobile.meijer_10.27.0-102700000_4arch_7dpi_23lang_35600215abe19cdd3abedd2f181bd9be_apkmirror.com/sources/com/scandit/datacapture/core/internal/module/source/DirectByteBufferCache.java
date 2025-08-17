package com.scandit.datacapture.core.internal.module.source;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class DirectByteBufferCache {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap f124777a = new WeakHashMap();

    public final ByteBuffer a(int i10) {
        List list = (List) this.f124777a.get(Integer.valueOf(i10));
        ByteBuffer byteBuffer = list != null ? (ByteBuffer) CollectionsKt.N(list) : null;
        if (byteBuffer != null) {
            return byteBuffer;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i10);
        Intrinsics.i(byteBufferAllocateDirect, "allocateDirect(...)");
        return byteBufferAllocateDirect;
    }

    public final void a(ByteBuffer buffer) {
        Intrinsics.j(buffer, "buffer");
        if (buffer.isDirect()) {
            WeakHashMap weakHashMap = this.f124777a;
            Integer numValueOf = Integer.valueOf(buffer.capacity());
            Object arrayList = weakHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                weakHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(buffer);
        }
    }
}
