package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.data.NativeFrameData;
import com.scandit.datacapture.core.internal.sdk.source.NativeCameraFrameData;
import java.util.LinkedHashMap;
import java.util.Stack;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final int f124784a;

    /* renamed from: b, reason: collision with root package name */
    public final Stack f124785b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f124786c;

    public J(int i10) {
        this.f124784a = i10;
        Stack stack = new Stack();
        this.f124785b = stack;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f124786c = linkedHashMap;
        stack.clear();
        linkedHashMap.clear();
        for (int i11 = 0; i11 < i10; i11++) {
            NativeCameraFrameData nativeCameraFrameDataCreateEmpty = NativeCameraFrameData.createEmpty();
            this.f124785b.push(nativeCameraFrameDataCreateEmpty);
            LinkedHashMap linkedHashMap2 = this.f124786c;
            Intrinsics.g(nativeCameraFrameDataCreateEmpty);
            NativeFrameData nativeFrameDataAsFrameData = nativeCameraFrameDataCreateEmpty.asFrameData();
            Intrinsics.i(nativeFrameDataAsFrameData, "asFrameData(...)");
            linkedHashMap2.put(nativeCameraFrameDataCreateEmpty, nativeFrameDataAsFrameData);
        }
    }
}
