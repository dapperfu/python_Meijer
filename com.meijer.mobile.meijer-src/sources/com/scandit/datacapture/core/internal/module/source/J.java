package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import java.util.LinkedHashMap;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final int f125736a;

    /* renamed from: b, reason: collision with root package name */
    public final Stack f125737b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f125738c;

    public J(int i10) {
        this.f125736a = i10;
        Stack stack = new Stack();
        this.f125737b = stack;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f125738c = linkedHashMap;
        stack.clear();
        linkedHashMap.clear();
        for (int i11 = 0; i11 < i10; i11++) {
            NativeCameraFrameData nativeCameraFrameDataCreateEmpty = NativeCameraFrameData.createEmpty();
            this.f125737b.push(nativeCameraFrameDataCreateEmpty);
            LinkedHashMap linkedHashMap2 = this.f125738c;
            Intrinsics.g(nativeCameraFrameDataCreateEmpty);
            NativeFrameData nativeFrameDataAsFrameData = nativeCameraFrameDataCreateEmpty.asFrameData();
            Intrinsics.i(nativeFrameDataAsFrameData, "asFrameData(...)");
            linkedHashMap2.put(nativeCameraFrameDataCreateEmpty, nativeFrameDataAsFrameData);
        }
    }
}
